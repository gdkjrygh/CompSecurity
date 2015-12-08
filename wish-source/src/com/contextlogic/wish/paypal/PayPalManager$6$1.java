// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.paypal;

import android.app.Activity;
import com.braintreepayments.api.Braintree;

// Referenced classes of package com.contextlogic.wish.paypal:
//            PayPalManager

class this._cls1
    implements com.braintreepayments.api.eSetupFinishedListener
{

    final rePaymentCallback this$1;

    public void onBraintreeSetupFinished(boolean flag, Braintree braintree, String s, Exception exception)
    {
        if (flag && braintree != null)
        {
            PayPalManager.access$002(_fld0, braintree);
            startFuturePayment(activity, futurePaymentCallback);
        } else
        if (PayPalManager.access$200(_fld0) != null)
        {
            PayPalManager.access$200(_fld0).onFuturePaymentError();
            PayPalManager.access$202(_fld0, null);
            return;
        }
    }

    rePaymentCallback()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/paypal/PayPalManager$6

/* anonymous class */
    class PayPalManager._cls6
        implements com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback
    {

        final PayPalManager this$0;
        final Activity val$activity;
        final PayPalManager.FuturePaymentCallback val$futurePaymentCallback;

        public void onServiceSucceeded(String s)
        {
            Braintree.setup(activity, s, new PayPalManager._cls6._cls1());
        }

            
            {
                this$0 = final_paypalmanager;
                activity = activity1;
                futurePaymentCallback = PayPalManager.FuturePaymentCallback.this;
                super();
            }
    }

}
