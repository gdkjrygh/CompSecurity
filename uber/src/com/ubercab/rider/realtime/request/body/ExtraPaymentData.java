// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ExtraPaymentData

public abstract class ExtraPaymentData
{

    public ExtraPaymentData()
    {
    }

    public static ExtraPaymentData create()
    {
        return new Shape_ExtraPaymentData();
    }

    public abstract String getPayPalCorrelationId();

    public abstract String getPaymentProfileUuid();

    public abstract Boolean getUseAmexReward();

    public abstract ExtraPaymentData setPayPalCorrelationId(String s);

    public abstract ExtraPaymentData setPaymentProfileUuid(String s);

    public abstract ExtraPaymentData setUseAmexReward(Boolean boolean1);
}
