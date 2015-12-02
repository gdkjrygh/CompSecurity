// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.response;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.response:
//            Shape_AirtelCheckBonusResponse

public abstract class AirtelCheckBonusResponse
{

    public AirtelCheckBonusResponse()
    {
    }

    public static AirtelCheckBonusResponse create(boolean flag)
    {
        return (new Shape_AirtelCheckBonusResponse()).setEligibleForBonus(flag);
    }

    public abstract boolean getEligibleForBonus();

    abstract AirtelCheckBonusResponse setEligibleForBonus(boolean flag);
}
