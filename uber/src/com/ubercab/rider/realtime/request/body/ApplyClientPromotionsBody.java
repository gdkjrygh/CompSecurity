// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ApplyClientPromotionsBody

public abstract class ApplyClientPromotionsBody
{

    public ApplyClientPromotionsBody()
    {
    }

    public static ApplyClientPromotionsBody create(String s, boolean flag)
    {
        return (new Shape_ApplyClientPromotionsBody()).setCode(s).setConfirmed(flag);
    }

    public abstract String getCode();

    public abstract boolean getConfirmed();

    abstract ApplyClientPromotionsBody setCode(String s);

    abstract ApplyClientPromotionsBody setConfirmed(boolean flag);
}
