// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.paypal;


// Referenced classes of package com.contextlogic.wish.paypal:
//            PayPalManager

class this._cls0
    implements com.braintreepayments.api.tMethodNonceListener
{

    final PayPalManager this$0;

    public void onPaymentMethodNonce(String s)
    {
        if (PayPalManager.access$100(PayPalManager.this) != null)
        {
            PayPalManager.access$100(PayPalManager.this).onPaymentSucceeded(s);
            PayPalManager.access$102(PayPalManager.this, null);
        }
    }

    ymentCallback()
    {
        this$0 = PayPalManager.this;
        super();
    }
}
