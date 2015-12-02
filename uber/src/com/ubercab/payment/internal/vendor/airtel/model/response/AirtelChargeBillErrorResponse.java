// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.response;

import com.ubercab.payment.internal.network.model.CheckBalanceResponse;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.response:
//            Shape_AirtelChargeBillErrorResponse

public abstract class AirtelChargeBillErrorResponse
{

    public static final String ERROR_ADD_FUNDS_REQUIRED = "add_funds_required";

    public AirtelChargeBillErrorResponse()
    {
    }

    public static AirtelChargeBillErrorResponse create(String s, CheckBalanceResponse checkbalanceresponse)
    {
        return (new Shape_AirtelChargeBillErrorResponse()).setError(s).setErrorObj(checkbalanceresponse);
    }

    public abstract String getError();

    public abstract CheckBalanceResponse getErrorObj();

    abstract AirtelChargeBillErrorResponse setError(String s);

    abstract AirtelChargeBillErrorResponse setErrorObj(CheckBalanceResponse checkbalanceresponse);
}
