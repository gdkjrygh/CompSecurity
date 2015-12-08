// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Intent;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.Card;
import com.braintreepayments.api.models.ThreeDSecureLookup;
import com.braintreepayments.api.threedsecure.ThreeDSecureWebViewActivity;
import org.json.JSONException;

// Referenced classes of package com.braintreepayments.api:
//            Braintree, BraintreeApi

class val.requestCode
    implements Runnable
{

    final Braintree this$0;
    final Activity val$activity;
    final String val$amount;
    final String val$nonce;
    final int val$requestCode;

    public void run()
    {
        Object obj;
        obj = Braintree.access$300(Braintree.this).threeDSecureLookup(val$nonce, val$amount);
        if (((ThreeDSecureLookup) (obj)).getAcsUrl() != null)
        {
            obj = (new Intent(val$activity, com/braintreepayments/api/threedsecure/ThreeDSecureWebViewActivity)).putExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_LOOKUP", ((android.os.Parcelable) (obj)));
            val$activity.startActivityForResult(((Intent) (obj)), val$requestCode);
            return;
        }
        try
        {
            Braintree.access$900(Braintree.this, ((ThreeDSecureLookup) (obj)).getCard());
            Braintree.access$1000(Braintree.this, ((ThreeDSecureLookup) (obj)).getCard().getNonce());
            return;
        }
        catch (BraintreeException braintreeexception)
        {
            postUnrecoverableErrorToListeners(braintreeexception);
            return;
        }
        catch (JSONException jsonexception)
        {
            postUnrecoverableErrorToListeners(jsonexception);
            return;
        }
        catch (ErrorWithResponse errorwithresponse)
        {
            Braintree.access$600(Braintree.this, errorwithresponse);
        }
        return;
    }

    rorWithResponse()
    {
        this$0 = final_braintree;
        val$nonce = s;
        val$amount = s1;
        val$activity = activity1;
        val$requestCode = I.this;
        super();
    }
}
