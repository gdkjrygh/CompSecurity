// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishPaymentProcessorData
    implements Serializable
{

    private static final long serialVersionUID = 0xe41a30b6be21befaL;
    private String adyenKey;
    private String braintreeCollectorMerchantId;
    private String braintreeCollectorUrl;
    private String braintreeKey;
    private String ebanxApiUrl;
    private String ebanxKey;
    private String paypalKey;
    private String stripeKey;
    private boolean useTestMode;
    private String visaKey;

    public WishPaymentProcessorData(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            paypalKey = jsonobject.getString("paypal_key");
            visaKey = jsonobject.getString("visa_key");
            stripeKey = jsonobject.getString("stripe_key");
            braintreeCollectorUrl = jsonobject.getString("braintree_collector_url");
            braintreeCollectorMerchantId = jsonobject.getString("braintree_collector_merchant_id");
            braintreeKey = jsonobject.getString("braintree_key");
            ebanxKey = jsonobject.getString("ebanx_key");
            ebanxApiUrl = jsonobject.getString("ebanx_api_url");
            adyenKey = jsonobject.getString("adyen_key");
            useTestMode = jsonobject.getBoolean("use_test_mode");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getAdyenKey()
    {
        return adyenKey;
    }

    public String getBraintreeCollectorMerchantId()
    {
        return braintreeCollectorMerchantId;
    }

    public String getBraintreeCollectorUrl()
    {
        return braintreeCollectorUrl;
    }

    public String getBraintreeKey()
    {
        return braintreeKey;
    }

    public String getEbanxApiUrl()
    {
        return ebanxApiUrl;
    }

    public String getEbanxKey()
    {
        return ebanxKey;
    }

    public JSONObject getJSONObject()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("paypal_key", paypalKey);
            jsonobject.put("visa_key", visaKey);
            jsonobject.put("stripe_key", stripeKey);
            jsonobject.put("braintree_collector_url", braintreeCollectorUrl);
            jsonobject.put("braintree_collector_merchant_id", braintreeCollectorMerchantId);
            jsonobject.put("braintree_key", braintreeKey);
            jsonobject.put("ebanx_key", ebanxKey);
            jsonobject.put("ebanx_api_url", ebanxApiUrl);
            jsonobject.put("adyen_key", adyenKey);
            jsonobject.put("use_test_mode", useTestMode);
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return jsonobject;
    }

    public String getPaypalKey()
    {
        return paypalKey;
    }

    public String getStripeKey()
    {
        return stripeKey;
    }

    public String getVisaKey()
    {
        return visaKey;
    }

    public boolean useTestMode()
    {
        return useTestMode;
    }
}
