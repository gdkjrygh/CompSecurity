// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.DialogInterface;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCartShippingView, SignupCartDataEntryCallback

class this._cls0
    implements android.content.stener
{

    final SignupCartShippingView this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SignupCartShippingView.access$100(SignupCartShippingView.this);
        SignupCartShippingView.access$200(SignupCartShippingView.this, WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_SHIPPING_CANCEL_BUTTON);
        ((SignupCartDataEntryCallback)SignupCartShippingView.access$300(SignupCartShippingView.this)).onClose();
    }

    ck()
    {
        this$0 = SignupCartShippingView.this;
        super();
    }
}
