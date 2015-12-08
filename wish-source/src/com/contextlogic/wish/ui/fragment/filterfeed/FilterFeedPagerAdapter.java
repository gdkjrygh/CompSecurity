// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.WishFilter;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedProductView, FilterFeedFragment

public class FilterFeedPagerAdapter extends PagerAdapter
    implements com.astuetz.PagerSlidingTabStrip.IconTabProvider
{

    private Context context;
    private DealDashInfo dealDashInfo;
    private FilterFeedFragment fragment;
    private boolean setInfo;
    private View tempCountView;
    private ViewPager viewPager;

    public FilterFeedPagerAdapter(Context context1, FilterFeedFragment filterfeedfragment, ViewPager viewpager)
    {
        viewPager = viewpager;
        context = context1;
        fragment = filterfeedfragment;
        setInfo = false;
    }

    public void cleanup()
    {
        for (int i = 0; i < getCount(); i++)
        {
            FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedproductview != null)
            {
                filterfeedproductview.cleanup();
            }
        }

    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (FilterFeedProductView)obj;
        ((FilterFeedProductView) (obj)).cleanup();
        viewgroup.removeView(((View) (obj)));
    }

    public int getCount()
    {
        if (fragment.getMainCategories() != null)
        {
            return fragment.getMainCategories().size();
        } else
        {
            return 0;
        }
    }

    public int getPageIconResId(int i)
    {
        return i != fragment.getDealDashPosition() ? 0 : 0x7f0201a7;
    }

    public volatile CharSequence getPageTitle(int i)
    {
        return getPageTitle(i);
    }

    public String getPageTitle(int i)
    {
        if (fragment.getMainCategories() != null && i < fragment.getMainCategories().size())
        {
            return ((WishFilter)fragment.getMainCategories().get(i)).getName();
        } else
        {
            return "";
        }
    }

    public void handleOrientationChanged()
    {
        for (int i = 0; i < getCount(); i++)
        {
            FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedproductview != null)
            {
                filterfeedproductview.handleOrientationChanged();
            }
        }

    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        FilterFeedProductView filterfeedproductview = new FilterFeedProductView(context);
        FilterFeedFragment.InitialProductWrapper initialproductwrapper = fragment.getInitialProductInfo(i);
        ArrayList arraylist = fragment.getSelectedFilters(i);
        filterfeedproductview.setup((WishFilter)fragment.getMainCategories().get(i), i, fragment);
        boolean flag = true;
        if (i != viewPager.getCurrentItem())
        {
            flag = false;
        }
        if (flag)
        {
            if (initialproductwrapper != null)
            {
                fragment.clearInitialProductInfo(i);
            }
            filterfeedproductview.updateFeed(initialproductwrapper, arraylist);
        } else
        {
            filterfeedproductview.prepareForUpdateFeed();
        }
        if (i == fragment.getDealDashPosition())
        {
            if (!setInfo)
            {
                filterfeedproductview.setDealDashInfo(dealDashInfo, tempCountView, fragment);
                setInfo = true;
            } else
            {
                filterfeedproductview.setDealDashInfo(null, tempCountView, fragment);
            }
        }
        filterfeedproductview.setTag(Integer.valueOf(i));
        viewgroup.addView(filterfeedproductview, new android.view.ViewGroup.LayoutParams(-1, -1));
        return filterfeedproductview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void onPagerScrollSettled()
    {
        for (int i = 0; i < getCount(); i++)
        {
            FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedproductview == null)
            {
                continue;
            }
            filterfeedproductview.onPagerScrollSettled();
            if (i == viewPager.getCurrentItem() && !filterfeedproductview.isFeedSetup())
            {
                ArrayList arraylist = fragment.getSelectedFilters(i);
                filterfeedproductview.updateFeed(fragment.getInitialProductInfo(i), arraylist);
            }
        }

    }

    public void onPagerScrollUnsettled()
    {
        for (int i = 0; i < getCount(); i++)
        {
            FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedproductview != null)
            {
                filterfeedproductview.onPagerScrollUnsettled();
            }
        }

    }

    public void refreshWishStates(boolean flag)
    {
        for (int i = 0; i < getCount(); i++)
        {
            FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedproductview != null)
            {
                filterfeedproductview.refreshWishStates(flag);
            }
        }

    }

    public void releaseImages()
    {
        for (int i = 0; i < getCount(); i++)
        {
            FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedproductview != null)
            {
                filterfeedproductview.releaseImages();
            }
        }

    }

    public void restoreImages()
    {
        for (int i = 0; i < getCount(); i++)
        {
            FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (filterfeedproductview != null)
            {
                filterfeedproductview.restoreImages();
            }
        }

    }

    public void setDealDashInfo(DealDashInfo dealdashinfo, View view)
    {
        dealDashInfo = dealdashinfo;
        tempCountView = view;
    }

    public void updateFeed(int i)
    {
        FilterFeedFragment.InitialProductWrapper initialproductwrapper = fragment.getInitialProductInfo(i);
        ArrayList arraylist = fragment.getSelectedFilters(i);
        FilterFeedProductView filterfeedproductview = (FilterFeedProductView)viewPager.findViewWithTag(Integer.valueOf(i));
        if (filterfeedproductview != null)
        {
            filterfeedproductview.updateFeed(initialproductwrapper, arraylist);
        }
    }

    public void updateMainCategories()
    {
        notifyDataSetChanged();
    }
}
