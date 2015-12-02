// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_UpdatePaymentProfileRewardBody

public abstract class UpdatePaymentProfileRewardBody
{

    public UpdatePaymentProfileRewardBody()
    {
    }

    public static UpdatePaymentProfileRewardBody create(String s)
    {
        return (new Shape_UpdatePaymentProfileRewardBody()).setType(s);
    }

    public abstract String getType();

    public abstract Boolean isEnable();

    public abstract Boolean isEnroll();

    public abstract UpdatePaymentProfileRewardBody setEnable(Boolean boolean1);

    public abstract UpdatePaymentProfileRewardBody setEnroll(Boolean boolean1);

    abstract UpdatePaymentProfileRewardBody setType(String s);
}
