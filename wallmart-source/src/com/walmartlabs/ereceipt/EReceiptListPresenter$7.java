// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter

class val.pager
    implements android.support.v4.view.stener
{

    final EReceiptListPresenter this$0;
    final PagerAdapter val$adapter;
    final ViewPager val$pager;

    public void onPageScrollStateChanged(int i)
    {
        if (i == 0)
        {
            i = val$adapter.getCount();
            int j = val$pager.getCurrentItem();
            if (j == 0)
            {
                val$pager.setCurrentItem(i - 2, false);
            } else
            if (j == i - 1)
            {
                val$pager.setCurrentItem(1, false);
                return;
            }
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
    }

    tener()
    {
        this$0 = final_ereceiptlistpresenter;
        val$adapter = pageradapter;
        val$pager = ViewPager.this;
        super();
    }
}
