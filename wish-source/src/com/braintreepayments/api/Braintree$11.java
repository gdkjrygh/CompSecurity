// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.PayPalAccountBuilder;
import com.braintreepayments.api.models.PaymentMethod;

// Referenced classes of package com.braintreepayments.api:
//            Braintree, BraintreeApi, PayPal

class er
    implements Runnable
{

    final Braintree this$0;
    final com.braintreepayments.api.models..Builder val$paymentMethodBuilder;

    public void run()
    {
        PaymentMethod paymentmethod;
        paymentmethod = Braintree.access$300(Braintree.this).create(val$paymentMethodBuilder);
        Braintree.access$800(Braintree.this, paymentmethod);
        if (val$paymentMethodBuilder instanceof PayPalAccountBuilder)
        {
            if (!PayPal.isCheckoutRequest().booleanValue())
            {
                break MISSING_BLOCK_LABEL_71;
            }
            sendAnalyticsEvent("paypal-single-payment.tokenize.succeeded");
        }
_L1:
        Braintree.access$900(Braintree.this, paymentmethod);
        Braintree.access$1000(Braintree.this, paymentmethod.getNonce());
        return;
        try
        {
            sendAnalyticsEvent("paypal-future-payments.tokenize.succeeded");
        }
        catch (BraintreeException braintreeexception)
        {
            postUnrecoverableErrorToListeners(braintreeexception);
            return;
        }
        catch (ErrorWithResponse errorwithresponse)
        {
            if (val$paymentMethodBuilder instanceof PayPalAccountBuilder)
            {
                if (PayPal.isCheckoutRequest().booleanValue())
                {
                    sendAnalyticsEvent("paypal-single-payment.tokenize.failed");
                } else
                {
                    sendAnalyticsEvent("paypal-future-payments.tokenize.failed");
                }
            }
            Braintree.access$600(Braintree.this, errorwithresponse);
            return;
        }
          goto _L1
    }

    er()
    {
        this$0 = final_braintree;
        val$paymentMethodBuilder = com.braintreepayments.api.models..Builder.this;
        super();
    }
}
