// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCartDataEntryCallback, DataEntryCheckoutSignupCartManager, CheckoutSignupCartManager

class this._cls0
    implements SignupCartDataEntryCallback
{

    final DataEntryCheckoutSignupCartManager this$0;

    public void onCancel()
    {
        DataEntryCheckoutSignupCartManager.access$500(DataEntryCheckoutSignupCartManager.this).trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_SHIPPING_BACK_BUTTON);
        ((CheckoutSignupCartManager)DataEntryCheckoutSignupCartManager.access$600(DataEntryCheckoutSignupCartManager.this)).showFreeGiftsView();
    }

    public void onClose()
    {
        DataEntryCheckoutSignupCartManager.access$400(DataEntryCheckoutSignupCartManager.this).close();
    }

    public void onComplete()
    {
        checkoutBilling();
    }

    ()
    {
        this$0 = DataEntryCheckoutSignupCartManager.this;
        super();
    }
}
