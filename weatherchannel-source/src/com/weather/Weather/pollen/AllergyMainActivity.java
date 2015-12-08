// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.commons.analytics.Attribute;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.allergy.AllergyFeedScreenTag;
import com.weather.commons.app.TWCBaseActivity;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyFragmentPagerAdapter, AllergyInjection

public class AllergyMainActivity extends TWCBaseActivity
    implements android.view.View.OnClickListener
{
    private class PageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final AllergyMainActivity this$0;

        private View getViewForGivenPosition(int i)
        {
            if (i == 0)
            {
                TextView textview = pollenTab;
                updateAllergyFeedLocalytics(AllergyFeedScreenTag.POLLEN);
                return textview;
            }
            if (i == 1)
            {
                TextView textview1 = breathingTab;
                updateAllergyFeedLocalytics(AllergyFeedScreenTag.BREATHING);
                return textview1;
            } else
            {
                TextView textview2 = moldTab;
                updateAllergyFeedLocalytics(AllergyFeedScreenTag.MOLD);
                return textview2;
            }
        }

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
            updateCurrentSelection(getViewForGivenPosition(i));
        }

        private PageChangeListener()
        {
            this$0 = AllergyMainActivity.this;
            super();
        }

    }


    public static final String ALLERGY_KEY = "allergy_key";
    public static final int BREATHING = 1;
    public static final int MOLD = 2;
    public static final int POLLEN = 0;
    private static ObjectGraph testingGraph;
    private TextView breathingTab;
    private TextView currentSelection;
    LocalyticsHandler localyticsHandler;
    private TextView moldTab;
    MultiActivitySummaryManager multiActivitySummaryManager;
    private TextView pollenTab;
    private ViewPager viewPager;

    public AllergyMainActivity()
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

    private void updateAllergyFeedLocalytics(Attribute attribute)
    {
        localyticsHandler.getAllergyFeedSummaryRecorder().putValueIfAbsent(attribute, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    private void updateCurrentSelection(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131558495: 
        case 2131558496: 
        case 2131558497: 
            currentSelection.setSelected(false);
            break;
        }
        currentSelection = (TextView)view;
        currentSelection.setSelected(true);
    }

    public void onClick(View view)
    {
        int i = view.getId();
        updateCurrentSelection(view);
        switch (i)
        {
        default:
            return;

        case 2131558495: 
            viewPager.setCurrentItem(0, true);
            updateAllergyFeedLocalytics(AllergyFeedScreenTag.POLLEN);
            return;

        case 2131558496: 
            viewPager.setCurrentItem(1, true);
            updateAllergyFeedLocalytics(AllergyFeedScreenTag.BREATHING);
            return;

        case 2131558497: 
            viewPager.setCurrentItem(2, true);
            break;
        }
        updateAllergyFeedLocalytics(AllergyFeedScreenTag.MOLD);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(null);
        PageChangeListener pagechangelistener;
        if (testingGraph == null)
        {
            bundle = FlagshipApplication.getInstance().getBaseObjectGraph();
        } else
        {
            bundle = testingGraph;
        }
        bundle.inject(this);
        setContentView(0x7f030010);
        viewPager = (ViewPager)findViewById(0x7f0d0062);
        bundle = new AllergyFragmentPagerAdapter(getFragmentManager(), FlagshipApplication.getInstance().getBaseObjectGraph().plus(new Object[] {
            new AllergyInjection()
        }));
        viewPager.setAdapter(bundle);
        pagechangelistener = new PageChangeListener();
        pollenTab = (TextView)findViewById(0x7f0d005f);
        breathingTab = (TextView)findViewById(0x7f0d0060);
        moldTab = (TextView)findViewById(0x7f0d0061);
        bundle = getIntent();
        if (bundle != null)
        {
            int i = bundle.getIntExtra("allergy_key", 0);
            if (i == 2)
            {
                currentSelection = moldTab;
            } else
            {
                if (i == 1)
                {
                    bundle = breathingTab;
                } else
                {
                    bundle = pollenTab;
                }
                currentSelection = bundle;
            }
            viewPager.setCurrentItem(i);
            pagechangelistener.onPageSelected(i);
        }
        viewPager.addOnPageChangeListener(pagechangelistener);
        pollenTab.setOnClickListener(this);
        breathingTab.setOnClickListener(this);
        moldTab.setOnClickListener(this);
        setActionBar();
    }

    protected void onDestroy()
    {
        if (isFinishing())
        {
            multiActivitySummaryManager.tagSummary(LocalyticsEvent.ALLERGY_FEED_SUMMARY);
        }
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        multiActivitySummaryManager.registerSummary(LocalyticsEvent.ALLERGY_FEED_SUMMARY);
    }





}
