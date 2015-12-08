// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.paypal;

import android.app.Activity;
import com.braintreepayments.api.Braintree;
import com.contextlogic.wish.api.data.WishCart;

// Referenced classes of package com.contextlogic.wish.paypal:
//            PayPalManager

class this._cls1
    implements com.braintreepayments.api.eSetupFinishedListener
{

    final entCallback this$1;

    public void onBraintreeSetupFinished(boolean flag, Braintree braintree, String s, Exception exception)
    {
        if (flag && braintree != null)
        {
            PayPalManager.access$002(_fld0, braintree);
            startPayment(activity, cart, forceUsd, callback);
        } else
        if (PayPalManager.access$100(_fld0) != null)
        {
            PayPalManager.access$100(_fld0).onPaymentError();
            PayPalManager.access$102(_fld0, null);
            return;
        }
    }

    entCallback()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/paypal/PayPalManager$1

/* anonymous class */
    class PayPalManager._cls1
        implements com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback
    {

        final PayPalManager this$0;
        final Activity val$activity;
        final PayPalManager.PaymentCallback val$callback;
        final WishCart val$cart;
        final boolean val$forceUsd;

        public void onServiceSucceeded(String s)
        {
            Braintree.setup(activity, s, new PayPalManager._cls1._cls1());
        }

            
            {
                this$0 = final_paypalmanager;
                activity = activity1;
                cart = wishcart;
                forceUsd = flag;
                callback = PayPalManager.PaymentCallback.this;
                super();
            }
    }

}
