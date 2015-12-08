// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.astuetz.PagerSlidingTabStrip;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFiltersAdapter, FilterFeedFragment

public class FilterFeedFilterView extends LinearLayout
{

    private UnifiedFontButton applyButton;
    private ViewPager filterPager;
    private FilterFeedFragment fragment;
    private FilterFeedFiltersAdapter pagerAdapter;

    public FilterFeedFilterView(Context context)
    {
        this(context, null);
    }

    public FilterFeedFilterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030056, this);
        applyButton = (UnifiedFontButton)view.findViewById(0x7f0d01de);
        applyButton.setText(getContext().getString(0x7f06006f).toUpperCase());
        applyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final FilterFeedFilterView this$0;

            public void onClick(View view1)
            {
                if (fragment != null)
                {
                    fragment.handleFilterApply();
                }
            }

            
            {
                this$0 = FilterFeedFilterView.this;
                super();
            }
        });
        filterPager = (ViewPager)view.findViewById(0x7f0d01dd);
        pagerAdapter = new FilterFeedFiltersAdapter(getContext(), filterPager);
        filterPager.setAdapter(pagerAdapter);
        setBackgroundResource(0x7f0c00e8);
        setOrientation(1);
    }

    private void refreshTabStripFontColors(PagerSlidingTabStrip pagerslidingtabstrip)
    {
        pagerslidingtabstrip = (LinearLayout)pagerslidingtabstrip.getChildAt(0);
        int i = 0;
        while (i < pagerslidingtabstrip.getChildCount()) 
        {
            TextView textview = (TextView)pagerslidingtabstrip.getChildAt(i);
            if (i == filterPager.getCurrentItem())
            {
                textview.setTextColor(getResources().getColor(0x7f0c00e8));
            } else
            {
                textview.setTextColor(getResources().getColor(0x7f0c00e0));
            }
            i++;
        }
    }

    public int getCurrentIndex()
    {
        return filterPager.getCurrentItem();
    }

    public ArrayList getSelectedFilters()
    {
        return pagerAdapter.getSelectedFilters(getCurrentIndex());
    }

    public void prepareToRelease()
    {
        fragment.recaptureViewPager();
    }

    public void prepareToShow(final PagerSlidingTabStrip tabStrip)
    {
        tabStrip.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final FilterFeedFilterView this$0;
            final PagerSlidingTabStrip val$tabStrip;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                refreshTabStripFontColors(tabStrip);
            }

            
            {
                this$0 = FilterFeedFilterView.this;
                tabStrip = pagerslidingtabstrip;
                super();
            }
        });
        tabStrip.setViewPager(filterPager);
        refreshTabStripFontColors(tabStrip);
    }

    public void resync()
    {
        pagerAdapter.resyncPages();
        filterPager.setCurrentItem(fragment.getCurrentIndex(), false);
    }

    public void setup(FilterFeedFragment filterfeedfragment)
    {
        fragment = filterfeedfragment;
        pagerAdapter.setup(fragment);
    }

    public void updateMainCategories()
    {
        pagerAdapter.notifyDataSetChanged();
    }


}
