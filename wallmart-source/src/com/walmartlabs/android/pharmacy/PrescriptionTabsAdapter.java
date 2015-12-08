// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

public class PrescriptionTabsAdapter extends PagerAdapter
    implements android.widget.TabHost.OnTabChangeListener
{
    private static class Tab
    {

        private final ViewGroup container;
        private final String tag;


        Tab(String s, ViewGroup viewgroup)
        {
            tag = s;
            container = viewgroup;
        }
    }

    static class TabFactory
        implements android.widget.TabHost.TabContentFactory
    {

        private final Context mContext;

        public View createTabContent(String s)
        {
            s = new View(mContext);
            s.setMinimumWidth(0);
            s.setMinimumHeight(0);
            return s;
        }

        public TabFactory(Context context)
        {
            mContext = context;
        }
    }


    private static final String TAG = com/walmartlabs/android/pharmacy/PrescriptionTabsAdapter.getSimpleName();
    private final Context mContext;
    private final TabHost mTabHost;
    private final ArrayList mTabs = new ArrayList();
    private final ViewPager mViewPager;

    public PrescriptionTabsAdapter(Context context, TabHost tabhost, ViewPager viewpager)
    {
        mContext = context;
        mTabHost = tabhost;
        mViewPager = viewpager;
    }

    public void addTab(android.widget.TabHost.TabSpec tabspec, ViewGroup viewgroup)
    {
        tabspec.setContent(new TabFactory(mContext));
        String s = tabspec.getTag();
        mTabs.add(new Tab(s, viewgroup));
        mTabHost.addTab(tabspec);
        notifyDataSetChanged();
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView(((Tab)obj).container);
    }

    public int getCount()
    {
        return mTabs.size();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        Tab tab = (Tab)mTabs.get(i);
        viewgroup.addView(tab.container);
        return tab;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((Tab)obj).container == view;
    }

    public void onPageSelected(int i)
    {
        TabWidget tabwidget = mTabHost.getTabWidget();
        int j = tabwidget.getDescendantFocusability();
        tabwidget.setDescendantFocusability(0x60000);
        mTabHost.setCurrentTab(i);
        tabwidget.setDescendantFocusability(j);
    }

    public void onTabChanged(String s)
    {
        int i = mTabHost.getCurrentTab();
        mViewPager.setCurrentItem(i);
    }

}
