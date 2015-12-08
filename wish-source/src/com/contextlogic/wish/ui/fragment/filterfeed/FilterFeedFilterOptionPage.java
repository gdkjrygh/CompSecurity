// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishFilter;
import com.contextlogic.wish.api.data.WishFilterGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFilterOptionGroup, FilterFeedFragment

public class FilterFeedFilterOptionPage extends LinearLayout
{

    private LinearLayout container;
    private FilterFeedFragment fragment;
    private WishFilter mainCategory;
    private View noItemsView;
    private ScrollView pageScroller;
    private ArrayList selectedFilters;

    public FilterFeedFilterOptionPage(Context context)
    {
        this(context, null);
    }

    public FilterFeedFilterOptionPage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private int getFilterIndex(WishFilter wishfilter)
    {
        byte byte0 = -1;
        int i = 0;
        do
        {
label0:
            {
                int j = byte0;
                if (i < selectedFilters.size())
                {
                    if (!((WishFilter)selectedFilters.get(i)).getFilterId().equals(wishfilter.getFilterId()))
                    {
                        break label0;
                    }
                    j = i;
                }
                return j;
            }
            i++;
        } while (true);
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030055, this);
        container = (LinearLayout)view.findViewById(0x7f0d01db);
        noItemsView = view.findViewById(0x7f0d01dc);
        pageScroller = (ScrollView)view.findViewById(0x7f0d01da);
    }

    public void cleanup()
    {
    }

    public void clearAll()
    {
        selectedFilters.clear();
    }

    public void deselectFilter(WishFilter wishfilter)
    {
        int i = getFilterIndex(wishfilter);
        if (i != -1)
        {
            selectedFilters.remove(i);
        }
    }

    public ArrayList getSelectedFilters()
    {
        return selectedFilters;
    }

    public void resync(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            selectedFilters = new ArrayList(arraylist);
        } else
        {
            selectedFilters = new ArrayList();
        }
        arraylist = new HashSet();
        for (Iterator iterator = selectedFilters.iterator(); iterator.hasNext(); arraylist.add(((WishFilter)iterator.next()).getFilterId())) { }
        for (int i = 0; i < container.getChildCount(); i++)
        {
            View view = container.getChildAt(i);
            if (view instanceof FilterFeedFilterOptionGroup)
            {
                ((FilterFeedFilterOptionGroup)view).resync(arraylist);
            }
        }

        pageScroller.post(new Runnable() {

            final FilterFeedFilterOptionPage this$0;

            public void run()
            {
                pageScroller.scrollTo(0, 0);
            }

            
            {
                this$0 = FilterFeedFilterOptionPage.this;
                super();
            }
        });
    }

    public void selectFilter(WishFilter wishfilter)
    {
        if (getFilterIndex(wishfilter) == -1)
        {
            fragment.trackClick(WishAnalyticsEvent.CLICK_MOBILE_FEED_FILTER_SELECT);
            selectedFilters.add(0, wishfilter);
        }
    }

    public void setup(FilterFeedFragment filterfeedfragment, WishFilter wishfilter, ArrayList arraylist)
    {
        fragment = filterfeedfragment;
        mainCategory = wishfilter;
        if (mainCategory.getChildFilterGroups() == null || mainCategory.getChildFilterGroups().size() == 0)
        {
            noItemsView.setVisibility(0);
        } else
        {
            noItemsView.setVisibility(8);
            filterfeedfragment = mainCategory.getChildFilterGroups().iterator();
            while (filterfeedfragment.hasNext()) 
            {
                wishfilter = (WishFilterGroup)filterfeedfragment.next();
                FilterFeedFilterOptionGroup filterfeedfilteroptiongroup = new FilterFeedFilterOptionGroup(getContext());
                filterfeedfilteroptiongroup.setup(this, wishfilter);
                container.addView(filterfeedfilteroptiongroup);
            }
        }
        resync(arraylist);
    }

}
