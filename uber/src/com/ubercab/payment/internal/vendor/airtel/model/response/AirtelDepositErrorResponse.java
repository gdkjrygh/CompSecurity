// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.response;

import com.ubercab.payment.internal.vendor.airtel.model.AirtelDepositErrorObject;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.response:
//            Shape_AirtelDepositErrorResponse

public abstract class AirtelDepositErrorResponse
{

    public static final String ERROR_RESPONSE_REQUEST_2FA = "web_auth_required";
    public static final String ERROR_RESPONSE_REQUEST_CREDIT_CARD = "card_entry_required";
    public static final String ERROR_RESPONSE_REQUEST_CVV = "cvv_entry_required";

    public AirtelDepositErrorResponse()
    {
    }

    public static AirtelDepositErrorResponse create(String s, String s1, AirtelDepositErrorObject airteldepositerrorobject)
    {
        return (new Shape_AirtelDepositErrorResponse()).setCode(s).setError(s1).setErrorObj(airteldepositerrorobject);
    }

    public abstract String getCode();

    public abstract String getError();

    public abstract AirtelDepositErrorObject getErrorObj();

    abstract AirtelDepositErrorResponse setCode(String s);

    abstract AirtelDepositErrorResponse setError(String s);

    abstract AirtelDepositErrorResponse setErrorObj(AirtelDepositErrorObject airteldepositerrorobject);
}
