// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.paypal;

import com.braintreepayments.api.exceptions.ErrorWithResponse;

// Referenced classes of package com.contextlogic.wish.paypal:
//            PayPalManager

class this._cls0
    implements com.braintreepayments.api.istener
{

    final PayPalManager this$0;

    public void onRecoverableError(ErrorWithResponse errorwithresponse)
    {
        if (PayPalManager.access$200(PayPalManager.this) != null)
        {
            PayPalManager.access$200(PayPalManager.this).onFuturePaymentError();
            PayPalManager.access$202(PayPalManager.this, null);
        }
    }

    public void onUnrecoverableError(Throwable throwable)
    {
        if (PayPalManager.access$200(PayPalManager.this) != null)
        {
            PayPalManager.access$200(PayPalManager.this).onFuturePaymentError();
            PayPalManager.access$202(PayPalManager.this, null);
        }
    }

    hResponse()
    {
        this$0 = PayPalManager.this;
        super();
    }
}
