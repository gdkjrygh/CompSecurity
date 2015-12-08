// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter

class val.pager
    implements android.view.Presenter._cls8
{

    final EReceiptListPresenter this$0;
    final PagerAdapter val$adapter;
    final ViewPager val$pager;

    public void onClick(View view)
    {
        int i = val$adapter.getCount();
        int j = val$pager.getCurrentItem();
        if (j == 0)
        {
            i -= 2;
        } else
        {
            i = j - 1;
        }
        val$pager.setCurrentItem(i, true);
    }

    ()
    {
        this$0 = final_ereceiptlistpresenter;
        val$adapter = pageradapter;
        val$pager = ViewPager.this;
        super();
    }
}
