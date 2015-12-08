// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import org.json.JSONException;
import org.json.JSONObject;

public class PayPalPaymentResource
{

    private String mRedirectUrl;

    public PayPalPaymentResource()
    {
    }

    public static PayPalPaymentResource fromJson(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        PayPalPaymentResource paypalpaymentresource = new PayPalPaymentResource();
        JSONObject jsonobject = s.optJSONObject("paymentResource");
        if (jsonobject != null)
        {
            paypalpaymentresource.redirectUrl(jsonobject.optString("redirectUrl"));
            return paypalpaymentresource;
        } else
        {
            paypalpaymentresource.redirectUrl(s.optJSONObject("agreementSetup").optString("approvalUrl"));
            return paypalpaymentresource;
        }
    }

    public String getRedirectUrl()
    {
        return mRedirectUrl;
    }

    public PayPalPaymentResource redirectUrl(String s)
    {
        mRedirectUrl = s;
        return this;
    }
}
