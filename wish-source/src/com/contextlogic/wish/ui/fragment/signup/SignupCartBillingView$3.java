// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.DialogInterface;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCartBillingView, SignupCartDataEntryCallback

class this._cls0
    implements android.content.istener
{

    final SignupCartBillingView this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SignupCartBillingView.access$300(SignupCartBillingView.this);
        SignupCartBillingView.access$400(SignupCartBillingView.this, WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_BILLING_CANCEL_BUTTON);
        ((SignupCartDataEntryCallback)SignupCartBillingView.access$500(SignupCartBillingView.this)).onClose();
    }

    ack()
    {
        this$0 = SignupCartBillingView.this;
        super();
    }
}
