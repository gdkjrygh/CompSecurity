// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.ui.PageIndicator;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.tropical.StormData;
import com.weather.commons.tropical.Storms;
import com.weather.dal2.system.TwcBus;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.hurricane:
//            HurricaneCentralFragment, HurricaneCentralActivityStormListController

public class HurricaneCentralActivity extends TWCBaseActivity
{
    private class PageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final HurricaneCentralActivity this$0;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
            switchVisibleFragment();
            updateText();
        }

        private PageChangeListener()
        {
            this$0 = HurricaneCentralActivity.this;
            super();
        }

    }


    public static final String HURRICANE_CENTRAL_DETAILS_AD = "weather.hurricane.details";
    public static final String STORM_ID_EXTRA_KEY = "com.weather.Weather.hurricane.STORM_ID_ARG_KEY";
    private static ObjectGraph testingGraph;
    TwcBus bus;
    private HurricaneCentralFragment currentFragment;
    private StormData currentStormData;
    LocalyticsHandler localyticsHandler;
    MultiActivitySummaryManager multiActivitySummaryManager;
    private HurricaneCentralActivityStormListController stormListController;
    private TextView stormName;
    private TextView stormPosition;

    public HurricaneCentralActivity()
    {
    }

    private void setActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayShowTitleEnabled(true);
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                actionbar.setDisplayShowTitleEnabled(false);
                actionbar.setDisplayShowTitleEnabled(true);
            }
        }
    }

    static void setTestingGraph(ObjectGraph objectgraph)
    {
        testingGraph = objectgraph;
    }

    private void switchVisibleFragment()
    {
        if (currentFragment != null)
        {
            currentFragment.setIsShowing(false);
        }
        currentFragment = stormListController.getCurrentFragment();
        if (currentFragment != null)
        {
            currentFragment.setIsShowing(true);
        }
        StormData stormdata = stormListController.getCurrentDisplayedStorm();
        if (currentStormData != null && stormdata != null && !currentStormData.equals(stormdata))
        {
            localyticsHandler.tagEvent(LocalyticsEvent.HC_STORM_SWIPE, ImmutableMap.of(HurricaneCentralTag.SWIPE_ORIGINATING_STORM, currentStormData.getStormName(), HurricaneCentralTag.SWIPE_DESTINATION_STORM, stormdata.getStormName()));
        }
        currentStormData = stormdata;
    }

    private void updateStormList(Storms storms)
    {
        currentStormData = null;
        stormListController.updateStormList(storms);
        switchVisibleFragment();
        updateText();
    }

    private void updateText()
    {
        if (stormListController.isStormDataLoaded())
        {
            StormData stormdata = stormListController.getCurrentDisplayedStorm();
            if (stormdata == null)
            {
                stormName.setText(0x7f07016b);
                stormPosition.setText(0x7f07016a);
                return;
            } else
            {
                stormName.setText(stormdata.getStormName());
                stormPosition.setText(stormdata.getDistanceFromString());
                return;
            }
        } else
        {
            stormName.setText(0x7f0701eb);
            stormPosition.setText("--");
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(null);
        ViewPager viewpager;
        if (testingGraph == null)
        {
            bundle = FlagshipApplication.getInstance().getBaseObjectGraph();
        } else
        {
            bundle = testingGraph;
        }
        bundle.inject(this);
        setContentView(0x7f030061);
        viewpager = (ViewPager)findViewById(0x7f0d018c);
        setActionBar();
        stormListController = new HurricaneCentralActivityStormListController(viewpager, getFragmentManager());
        bundle.inject(stormListController);
        bundle = (PageIndicator)findViewById(0x7f0d018b);
        bundle.setViewPager(viewpager);
        bundle.setOnPageChangeListener(new PageChangeListener());
        stormName = (TextView)findViewById(0x7f0d0189);
        stormPosition = (TextView)findViewById(0x7f0d018a);
        bundle = getIntent();
        if (bundle != null)
        {
            stormListController.setStartingStorm(bundle.getStringExtra("com.weather.Weather.hurricane.STORM_ID_ARG_KEY"));
        }
    }

    protected void onDestroy()
    {
        if (isFinishing())
        {
            multiActivitySummaryManager.tagSummary(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY);
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onReturnToMainFeed();
            break;
        }
        menuitem = NavUtils.getParentActivityIntent(this);
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "hurricane");
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        bus.unregister(this);
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        localyticsHandler.getHurricaneCentralSummaryRecorder().recordResumeOnScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_FEED);
        localyticsHandler.tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_FEED);
        multiActivitySummaryManager.registerSummary(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY);
        bus.register(this);
        stormListController.refresh();
    }

    protected void onReturnToMainFeed()
    {
        localyticsHandler.getMainFeedSummaryRecorder().putValueIfAbsent(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_FEED.getName());
    }

    public void onStormUpdate(final Storms storms)
    {
        runOnUiThread(new Runnable() {

            final HurricaneCentralActivity this$0;
            final Storms val$storms;

            public void run()
            {
                updateStormList(storms);
            }

            
            {
                this$0 = HurricaneCentralActivity.this;
                storms = storms1;
                super();
            }
        });
    }



}
