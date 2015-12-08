// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsOverviewView, TabbedProductDetailsFragment

class this._cls0
    implements android.support.v4.view.bedProductDetailsOverviewView._cls3
{

    final TabbedProductDetailsOverviewView this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        if (i != 0 && !TabbedProductDetailsOverviewView.access$000(TabbedProductDetailsOverviewView.this))
        {
            TabbedProductDetailsOverviewView.access$002(TabbedProductDetailsOverviewView.this, true);
            fragment.trackClick(WishAnalyticsEvent.CLICK_SCROLL_MAIN_PRODUCT_IMAGE, product.getProductId());
        }
        TabbedProductDetailsOverviewView.access$100(TabbedProductDetailsOverviewView.this);
    }

    ()
    {
        this$0 = TabbedProductDetailsOverviewView.this;
        super();
    }
}
