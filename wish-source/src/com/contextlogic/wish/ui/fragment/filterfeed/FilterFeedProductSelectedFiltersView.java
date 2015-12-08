// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishFilter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedSelectedFilter, FilterFeedFragment

public class FilterFeedProductSelectedFiltersView extends LinearLayout
{

    private LinearLayout filterContainer;
    private HorizontalScrollView filterScrollView;
    private FilterFeedFragment fragment;
    private int index;
    private ArrayList selectedFilters;

    public FilterFeedProductSelectedFiltersView(Context context)
    {
        this(context, null);
    }

    public FilterFeedProductSelectedFiltersView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030059, this);
        filterScrollView = (HorizontalScrollView)view.findViewById(0x7f0d01e6);
        filterScrollView.setHorizontalScrollBarEnabled(false);
        filterContainer = (LinearLayout)view.findViewById(0x7f0d01e7);
        selectedFilters = new ArrayList();
    }

    private void removeFilter(FilterFeedSelectedFilter filterfeedselectedfilter)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = selectedFilters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WishFilter wishfilter = (WishFilter)iterator.next();
            if (!wishfilter.getFilterId().equals(filterfeedselectedfilter.getFilter().getFilterId()))
            {
                arraylist.add(wishfilter);
            }
        } while (true);
        fragment.trackClick(WishAnalyticsEvent.CLICK_MOBILE_FEED_FILTER_REMOVE);
        fragment.updateSelectedFilters(index, arraylist);
    }

    private void updateFiltersView()
    {
        filterContainer.removeAllViews();
        if (hasFilters())
        {
            filterScrollView.setVisibility(0);
            FilterFeedSelectedFilter filterfeedselectedfilter;
            for (Iterator iterator = selectedFilters.iterator(); iterator.hasNext(); filterContainer.addView(filterfeedselectedfilter))
            {
                WishFilter wishfilter = (WishFilter)iterator.next();
                filterfeedselectedfilter = new FilterFeedSelectedFilter(getContext());
                filterfeedselectedfilter.setFilter(wishfilter);
                filterfeedselectedfilter.setOnClickListener(new android.view.View.OnClickListener() {

                    final FilterFeedProductSelectedFiltersView this$0;

                    public void onClick(View view)
                    {
                        removeFilter((FilterFeedSelectedFilter)view);
                    }

            
            {
                this$0 = FilterFeedProductSelectedFiltersView.this;
                super();
            }
                });
            }

            filterScrollView.post(new Runnable() {

                final FilterFeedProductSelectedFiltersView this$0;

                public void run()
                {
                    filterScrollView.scrollTo(0, 0);
                }

            
            {
                this$0 = FilterFeedProductSelectedFiltersView.this;
                super();
            }
            });
            return;
        } else
        {
            filterScrollView.setVisibility(8);
            return;
        }
    }

    public void forceHideView()
    {
        filterScrollView.clearAnimation();
        filterScrollView.setVisibility(8);
    }

    public boolean hasFilters()
    {
        return selectedFilters != null && selectedFilters.size() > 0;
    }

    public void reverseForceHide()
    {
        if (hasFilters())
        {
            filterScrollView.clearAnimation();
            filterScrollView.setVisibility(0);
        }
    }

    public void setSelectedFilters(ArrayList arraylist)
    {
        selectedFilters = arraylist;
        updateFiltersView();
    }

    public void setup(int i, FilterFeedFragment filterfeedfragment)
    {
        index = i;
        fragment = filterfeedfragment;
    }


}
