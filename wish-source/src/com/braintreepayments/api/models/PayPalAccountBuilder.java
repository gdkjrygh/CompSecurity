// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            PayPalAccount, PaymentMethodOptions, Metadata, PaymentMethod

public class PayPalAccountBuilder
    implements PaymentMethod.Builder
{

    private String mAuthorizationCode;
    private String mClientMetadataId;
    private String mEmail;
    private String mIntegration;
    private JSONObject mOtcResponse;
    private PaymentMethodOptions mPaymentMethodOptions;
    private String mSource;

    public PayPalAccountBuilder()
    {
        mIntegration = "custom";
    }

    public PayPalAccountBuilder authorizationCode(String s)
    {
        mAuthorizationCode = s;
        return this;
    }

    public PayPalAccount build()
    {
        PayPalAccount paypalaccount = new PayPalAccount();
        paypalaccount.setConsentCode(mAuthorizationCode);
        paypalaccount.setClientMetadataId(mClientMetadataId);
        paypalaccount.setOptions(mPaymentMethodOptions);
        paypalaccount.setSource(mSource);
        return paypalaccount;
    }

    public volatile PaymentMethod build()
    {
        return build();
    }

    public PayPalAccountBuilder clientMetadataId(String s)
    {
        mClientMetadataId = s;
        return this;
    }

    public PayPalAccountBuilder email(String s)
    {
        mEmail = s;
        return this;
    }

    public PayPalAccount fromJson(String s)
    {
        s = PayPalAccount.fromJson(s);
        if (s.getEmail() == null)
        {
            s.setEmail(mEmail);
        }
        return s;
    }

    public volatile PaymentMethod fromJson(String s)
    {
        return fromJson(s);
    }

    public String getApiPath()
    {
        return "paypal_accounts";
    }

    public String getApiResource()
    {
        return "paypalAccounts";
    }

    public PayPalAccountBuilder integration(String s)
    {
        mIntegration = s;
        return this;
    }

    public volatile PaymentMethod.Builder integration(String s)
    {
        return integration(s);
    }

    public PayPalAccountBuilder otcResponse(JSONObject jsonobject)
    {
        mOtcResponse = jsonobject;
        return this;
    }

    public PayPalAccountBuilder source(String s)
    {
        mSource = s;
        return this;
    }

    public volatile PaymentMethod.Builder source(String s)
    {
        return source(s);
    }

    public String toJsonString()
    {
        JSONObject jsonobject = new JSONObject();
        boolean flag;
        if (mPaymentMethodOptions != null && mPaymentMethodOptions.getValidate())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            mOtcResponse.put("options", (new JSONObject()).put("validate", flag));
            jsonobject.put("paypal_account", mOtcResponse);
            jsonobject.put("correlation_id", mClientMetadataId);
            jsonobject.put("_meta", new JSONObject((new Gson()).toJson(new Metadata(mIntegration, mSource))));
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    public PayPalAccountBuilder validate(boolean flag)
    {
        mPaymentMethodOptions = new PaymentMethodOptions();
        mPaymentMethodOptions.setValidate(flag);
        return this;
    }

    public volatile PaymentMethod.Builder validate(boolean flag)
    {
        return validate(flag);
    }
}
