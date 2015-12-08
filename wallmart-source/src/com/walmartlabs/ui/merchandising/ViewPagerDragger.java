// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.merchandising;

import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class ViewPagerDragger
{

    public static final String TAG = com/walmartlabs/ui/merchandising/ViewPagerDragger.getSimpleName();
    private long mDelay;
    private Handler mHandler;
    private ViewPager mPager;
    private Runnable r;

    public ViewPagerDragger(ViewPager viewpager)
    {
        r = new Runnable() {

            final ViewPagerDragger this$0;

            public void run()
            {
                int k = mPager.getCurrentItem() + 1;
                PagerAdapter pageradapter = mPager.getAdapter();
                int i;
                int j;
                if (pageradapter != null)
                {
                    i = pageradapter.getCount();
                } else
                {
                    i = 0;
                }
                j = k;
                if (k >= i)
                {
                    j = 0;
                }
                mPager.setCurrentItem(j, true);
                runDelayed();
            }

            
            {
                this$0 = ViewPagerDragger.this;
                super();
            }
        };
        mPager = viewpager;
        mHandler = new Handler();
        mDelay = 6000L;
    }

    public void pause()
    {
        mHandler.removeCallbacks(r);
    }

    public void resetTimer()
    {
        mHandler.removeCallbacks(r);
        runDelayed();
    }

    public void runDelayed()
    {
        mHandler.postDelayed(r, mDelay);
    }

    public void setDelay(long l)
    {
        mDelay = l;
    }


}
