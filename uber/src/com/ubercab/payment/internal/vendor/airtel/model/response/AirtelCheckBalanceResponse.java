// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.response;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.response:
//            Shape_AirtelCheckBalanceResponse

public abstract class AirtelCheckBalanceResponse
{

    public AirtelCheckBalanceResponse()
    {
    }

    public static AirtelCheckBalanceResponse create()
    {
        return new Shape_AirtelCheckBalanceResponse();
    }

    public abstract double getBalance();

    abstract AirtelCheckBalanceResponse setBalance(double d);
}
