// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.request;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.request:
//            Shape_AirtelChargeBillRequest

public abstract class AirtelChargeBillRequest
{

    public AirtelChargeBillRequest()
    {
    }

    public static AirtelChargeBillRequest create(String s)
    {
        return (new Shape_AirtelChargeBillRequest()).setPaymentProfileUUID(s);
    }

    public abstract String getPaymentProfileUUID();

    abstract AirtelChargeBillRequest setPaymentProfileUUID(String s);
}
