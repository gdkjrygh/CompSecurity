// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCartDataEntryCallback, DataEntryCheckoutSignupCartManager

class this._cls0
    implements SignupCartDataEntryCallback
{

    final DataEntryCheckoutSignupCartManager this$0;

    public void onCancel()
    {
        DataEntryCheckoutSignupCartManager.access$200(DataEntryCheckoutSignupCartManager.this).trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_BILLING_BACK_BUTTON);
        DataEntryCheckoutSignupCartManager.access$300(DataEntryCheckoutSignupCartManager.this).setBackButtonInfo(true);
        checkout();
    }

    public void onClose()
    {
        DataEntryCheckoutSignupCartManager.access$100(DataEntryCheckoutSignupCartManager.this).close();
    }

    public void onComplete()
    {
        DataEntryCheckoutSignupCartManager.access$000(DataEntryCheckoutSignupCartManager.this).getCartCheckoutActionManager().checkout();
    }

    ()
    {
        this$0 = DataEntryCheckoutSignupCartManager.this;
        super();
    }
}
