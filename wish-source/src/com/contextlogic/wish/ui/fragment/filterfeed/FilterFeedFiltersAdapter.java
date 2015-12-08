// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.contextlogic.wish.api.data.WishFilter;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFilterOptionPage, FilterFeedFragment

public class FilterFeedFiltersAdapter extends PagerAdapter
{

    private Context context;
    private FilterFeedFragment fragment;
    private ViewPager viewPager;

    public FilterFeedFiltersAdapter(Context context1, ViewPager viewpager)
    {
        viewPager = viewpager;
        context = context1;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (FilterFeedFilterOptionPage)obj;
        ((FilterFeedFilterOptionPage) (obj)).cleanup();
        viewgroup.removeView(((View) (obj)));
    }

    public int getCount()
    {
        if (fragment != null && fragment.getMainCategories() != null)
        {
            return fragment.getMainCategories().size();
        } else
        {
            return 0;
        }
    }

    public volatile CharSequence getPageTitle(int i)
    {
        return getPageTitle(i);
    }

    public String getPageTitle(int i)
    {
        if (fragment != null && fragment.getMainCategories() != null && i < fragment.getMainCategories().size())
        {
            return ((WishFilter)fragment.getMainCategories().get(i)).getName();
        } else
        {
            return "";
        }
    }

    public ArrayList getSelectedFilters(int i)
    {
        FilterFeedFilterOptionPage filterfeedfilteroptionpage = (FilterFeedFilterOptionPage)viewPager.findViewWithTag(Integer.valueOf(i));
        if (filterfeedfilteroptionpage != null)
        {
            return filterfeedfilteroptionpage.getSelectedFilters();
        } else
        {
            return null;
        }
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        FilterFeedFilterOptionPage filterfeedfilteroptionpage = new FilterFeedFilterOptionPage(context);
        ArrayList arraylist = fragment.getSelectedFilters(i);
        WishFilter wishfilter = (WishFilter)fragment.getMainCategories().get(i);
        filterfeedfilteroptionpage.setup(fragment, wishfilter, arraylist);
        filterfeedfilteroptionpage.setTag(Integer.valueOf(i));
        viewgroup.addView(filterfeedfilteroptionpage);
        return filterfeedfilteroptionpage;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void resyncPages()
    {
        for (int i = 0; i < getCount(); i++)
        {
            ArrayList arraylist = fragment.getSelectedFilters(i);
            FilterFeedFilterOptionPage filterfeedfilteroptionpage = (FilterFeedFilterOptionPage)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedfilteroptionpage != null)
            {
                filterfeedfilteroptionpage.resync(arraylist);
            }
        }

    }

    public void setup(FilterFeedFragment filterfeedfragment)
    {
        fragment = filterfeedfragment;
    }
}
