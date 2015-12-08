// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsFragment

class this._cls0
    implements android.support.v4.view..TabbedProductDetailsFragment._cls1
{

    final TabbedProductDetailsFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
        if (i == 0)
        {
            TabbedProductDetailsFragment.access$300(TabbedProductDetailsFragment.this);
            return;
        } else
        {
            TabbedProductDetailsFragment.access$400(TabbedProductDetailsFragment.this);
            return;
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (TabbedProductDetailsFragment.access$000(TabbedProductDetailsFragment.this).getAnimation() == null)
        {
            showTabBarStrip(true);
        }
        TabbedProductDetailsFragment.access$100(TabbedProductDetailsFragment.this);
    }

    public void onPageSelected(int i)
    {
        TabbedProductDetailsFragment.access$200(TabbedProductDetailsFragment.this, i);
    }

    ()
    {
        this$0 = TabbedProductDetailsFragment.this;
        super();
    }
}
