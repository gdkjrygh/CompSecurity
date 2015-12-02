// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_AcceptFareSplitBody, ExtraPaymentData

public abstract class AcceptFareSplitBody
{

    public AcceptFareSplitBody()
    {
    }

    public static AcceptFareSplitBody create()
    {
        return new Shape_AcceptFareSplitBody();
    }

    public abstract ExtraPaymentData getExtraPaymentData();

    public abstract String getPaymentProfileId();

    public abstract boolean getUseCredits();

    public abstract AcceptFareSplitBody setExtraPaymentData(ExtraPaymentData extrapaymentdata);

    public abstract AcceptFareSplitBody setPaymentProfileId(String s);

    public abstract AcceptFareSplitBody setUseCredits(boolean flag);
}
