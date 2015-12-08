// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.merchandising;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.walmartlabs.ui.merchandising:
//            ViewPagerDragger

class this._cls0
    implements Runnable
{

    final ViewPagerDragger this$0;

    public void run()
    {
        int k = ViewPagerDragger.access$000(ViewPagerDragger.this).getCurrentItem() + 1;
        PagerAdapter pageradapter = ViewPagerDragger.access$000(ViewPagerDragger.this).getAdapter();
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
        ViewPagerDragger.access$000(ViewPagerDragger.this).setCurrentItem(j, true);
        runDelayed();
    }

    _cls9()
    {
        this$0 = ViewPagerDragger.this;
        super();
    }
}
