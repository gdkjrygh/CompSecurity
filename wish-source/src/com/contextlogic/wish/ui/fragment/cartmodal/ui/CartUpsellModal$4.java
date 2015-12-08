// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui:
//            CartUpsellModal

class this._cls0
    implements android.support.v4.view.angeListener
{

    final CartUpsellModal this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_UPSELL_MODAL_PRODUCT_SCROLL);
    }

    ()
    {
        this$0 = CartUpsellModal.this;
        super();
    }
}
