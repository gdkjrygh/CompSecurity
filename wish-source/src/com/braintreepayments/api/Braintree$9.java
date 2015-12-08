// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.CardBuilder;
import org.json.JSONException;

// Referenced classes of package com.braintreepayments.api:
//            Braintree, BraintreeApi

class val.amount
    implements Runnable
{

    final Braintree this$0;
    final Activity val$activity;
    final String val$amount;
    final CardBuilder val$cardBuilder;
    final int val$requestCode;

    public void run()
    {
        try
        {
            String s = Braintree.access$300(Braintree.this).tokenize(val$cardBuilder);
            startThreeDSecureVerification(val$activity, val$requestCode, s, val$amount);
            return;
        }
        catch (BraintreeException braintreeexception)
        {
            postUnrecoverableErrorToListeners(braintreeexception);
            return;
        }
        catch (ErrorWithResponse errorwithresponse)
        {
            Braintree.access$600(Braintree.this, errorwithresponse);
            return;
        }
        catch (JSONException jsonexception)
        {
            postUnrecoverableErrorToListeners(jsonexception);
        }
    }

    uilder()
    {
        this$0 = final_braintree;
        val$cardBuilder = cardbuilder;
        val$activity = activity1;
        val$requestCode = i;
        val$amount = String.this;
        super();
    }
}
