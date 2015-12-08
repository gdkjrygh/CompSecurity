// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.feed.DelayedInitialStateNotifier;
import com.weather.Weather.feed.FeedJumpController;
import com.weather.Weather.feed.InjectModuleFactory;
import com.weather.Weather.feed.ListAutoScroller;
import com.weather.Weather.feed.ModuleListAdapter;
import com.weather.Weather.feed.ModuleVisibilityScrollListener;
import com.weather.Weather.feed.ModulesFactory;
import com.weather.Weather.feed.ModulesManager;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;
import com.weather.commons.tropical.StormData;
import com.weather.commons.tropical.Storms;
import com.weather.commons.tropical.TropicalStormNewsFetcher;
import com.weather.dal2.net.EmptyReceiver;
import com.weather.dal2.system.TwcBus;
import com.weather.util.ui.CompositeOnScrollListener;
import dagger.ObjectGraph;

public final class HurricaneCentralFragment extends Fragment
{
    static class HurricaneModuleInjection
    {

        private final String stormId;

        String provideStormId()
        {
            return stormId;
        }

        HurricaneModuleInjection(String s)
        {
            stormId = s;
        }
    }


    public static final String STORM_ID_ARG_KEY = "com.weather.Weather.hurricane.STORM_ID_ARG_KEY";
    private static final int TIME_TO_LET_LIST_POPULATE = 250;
    Supplier adConfigSupplier;
    TwcBus bus;
    private StormData currentStormData;
    private DelayedInitialStateNotifier delayedNotifier;
    private FeedJumpController feedJumpController;
    private boolean isPaused;
    private boolean isShowing;
    LocalyticsHandler localyticsHandler;
    Supplier modulesConfigSupplier;
    ModulesFactory modulesFactory;
    private ListView modulesListView;
    private ModulesManager modulesManager;
    TropicalStormNewsFetcher newsFetcher;
    ObjectGraph parentObjectGraph;
    private String stormId;

    public HurricaneCentralFragment()
    {
        isPaused = true;
    }

    private void doPauseWork()
    {
        bus.unregister(this);
        delayedNotifier.cancel();
        modulesManager.pauseModules();
        localyticsHandler.tagSummaryEvent(LocalyticsEvent.HC_FEED_SUMMARY);
    }

    private void doResumeWork()
    {
        if (!setModules())
        {
            modulesManager.resumeModules();
        }
        if (stormId != null)
        {
            localyticsHandler.getHurricaneCentralFeedSummaryRecorder().putValue(HurricaneCentralTag.STORM_ID, stormId);
            updateStormLocalytics();
        }
        delayedNotifier.notifyLater(250L);
        bus.register(this);
    }

    private boolean setModules()
    {
        boolean flag = modulesManager.refreshModulesList(feedJumpController.getConfigOverride());
        if (flag)
        {
            ModuleListAdapter modulelistadapter = new ModuleListAdapter(modulesManager.getModules());
            modulesListView.setAdapter(modulelistadapter);
            modulesManager.createAdViews(modulesListView, modulelistadapter);
        }
        return flag;
    }

    private void updateStormData(Storms storms)
    {
        if (stormId != null)
        {
            currentStormData = storms.getDataFor(stormId);
            if (isShowing && !isPaused)
            {
                updateStormLocalytics();
                return;
            }
        }
    }

    private void updateStormLocalytics()
    {
        if (currentStormData != null)
        {
            localyticsHandler.getHurricaneCentralFeedSummaryRecorder().putValue(HurricaneCentralTag.STORM_CATEGORY, currentStormData.getCategory());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        stormId = null;
        bundle = getArguments();
        if (bundle != null)
        {
            stormId = bundle.getString("com.weather.Weather.hurricane.STORM_ID_ARG_KEY");
        }
        layoutinflater = layoutinflater.inflate(0x7f030062, viewgroup, false);
        modulesManager = new ModulesManager(getActivity(), modulesConfigSupplier, adConfigSupplier, new InjectModuleFactory(modulesFactory, parentObjectGraph.plus(new Object[] {
            new HurricaneModuleInjection(stormId)
        })));
        modulesListView = (ListView)layoutinflater.findViewById(0x7f0d0028);
        viewgroup = new ListAutoScroller(modulesListView);
        feedJumpController = new FeedJumpController(modulesManager, viewgroup, modulesListView);
        bundle = new ModuleVisibilityScrollListener(modulesListView);
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(bundle);
        delayedNotifier = new DelayedInitialStateNotifier(new Handler(), modulesListView, bundle);
        builder.add(delayedNotifier);
        builder.add(new _cls1());
        viewgroup.addListener(bundle);
        modulesListView.setOnScrollListener(new CompositeOnScrollListener(builder.build()));
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        modulesManager.destroyModules();
        modulesManager = null;
        modulesListView = null;
        feedJumpController = null;
    }

    public void onPause()
    {
        isPaused = true;
        if (isShowing)
        {
            doPauseWork();
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (stormId != null)
        {
            newsFetcher.asyncFetch(stormId, new EmptyReceiver(), null);
        }
        isPaused = false;
        if (isShowing)
        {
            doResumeWork();
        }
    }

    public void onStormData(Storms storms)
    {
        Activity activity = getActivity();
        if (activity != null)
        {
            activity.runOnUiThread(new _cls2(storms));
        }
    }

    public void setIsShowing(boolean flag)
    {
        if (isShowing != flag)
        {
            isShowing = flag;
            if (flag && !isPaused)
            {
                doResumeWork();
                return;
            }
            if (!flag && !isPaused)
            {
                doPauseWork();
                return;
            }
        }
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
