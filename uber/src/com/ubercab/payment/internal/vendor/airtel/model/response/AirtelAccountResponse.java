// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.response;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.response:
//            Shape_AirtelAccountResponse

public abstract class AirtelAccountResponse
{

    public AirtelAccountResponse()
    {
    }

    public static AirtelAccountResponse create(String s)
    {
        return (new Shape_AirtelAccountResponse()).setPaymentReferenceNumber(s);
    }

    public abstract String getPaymentReferenceNumber();

    abstract AirtelAccountResponse setPaymentReferenceNumber(String s);
}
