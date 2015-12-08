// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishBraintreePayPalInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x47a7eed706aa3365L;
    private String paymentMethodToken;

    public WishBraintreePayPalInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            if (jsonobject.has("payment_method_token") && !jsonobject.isNull("payment_method_token"))
            {
                paymentMethodToken = jsonobject.getString("payment_method_token");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        paymentMethodToken = null;
        return;
    }

    public String getPaymentMethodToken()
    {
        return paymentMethodToken;
    }

    public void revokePaymentMethodToken()
    {
        paymentMethodToken = null;
    }
}
