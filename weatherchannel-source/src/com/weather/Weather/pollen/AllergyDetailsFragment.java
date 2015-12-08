// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

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
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.util.ui.CompositeOnScrollListener;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyType

public class AllergyDetailsFragment extends Fragment
{
    static class AllergyModuleInjection
    {

        private final AllergyType allergyType;

        AllergyType provideAllergyType()
        {
            return allergyType;
        }

        AllergyModuleInjection(AllergyType allergytype)
        {
            allergyType = allergytype;
        }
    }


    public static final String ALLERGY_TYPE_KEY = "allergy_type_key";
    private static final int TIME_TO_LET_LIST_POPULATE = 250;
    Supplier adConfigSupplier;
    private AllergyType allergyType;
    private DelayedInitialStateNotifier delayedNotifier;
    private FeedJumpController feedJumpController;
    private boolean isPaused;
    private boolean isShowing;
    LocalyticsHandler localyticsHandler;
    Supplier modulesConfigSupplier;
    ModulesFactory modulesFactory;
    private ListView modulesListView;
    private ModulesManager modulesManager;
    ObjectGraph parentObjectGraph;

    public AllergyDetailsFragment()
    {
        isPaused = true;
    }

    private void doPauseWork()
    {
        delayedNotifier.cancel();
        modulesManager.pauseModules();
    }

    private void doResumeWork()
    {
        if (!setModules())
        {
            modulesManager.resumeModules();
        }
        delayedNotifier.notifyLater(250L);
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

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03000d, viewgroup, false);
        viewgroup = getArguments();
        if (viewgroup != null)
        {
            allergyType = AllergyType.valueOf(viewgroup.getString("allergy_type_key"));
        }
        modulesManager = new ModulesManager(getActivity(), modulesConfigSupplier, adConfigSupplier, new InjectModuleFactory(modulesFactory, parentObjectGraph.plus(new Object[] {
            new AllergyModuleInjection(allergyType)
        })));
        modulesListView = (ListView)layoutinflater.findViewById(0x7f0d0028);
        viewgroup = new ListAutoScroller(modulesListView);
        feedJumpController = new FeedJumpController(modulesManager, viewgroup, modulesListView);
        bundle = new ModuleVisibilityScrollListener(modulesListView);
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(bundle);
        delayedNotifier = new DelayedInitialStateNotifier(new Handler(), modulesListView, bundle);
        builder.add(delayedNotifier);
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
        isPaused = false;
        if (isShowing)
        {
            doResumeWork();
        }
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (isShowing != flag)
        {
            isShowing = flag;
            if (isShowing && !isPaused)
            {
                doResumeWork();
                return;
            }
            if (!isShowing && !isPaused)
            {
                doPauseWork();
                return;
            }
        }
    }
}
