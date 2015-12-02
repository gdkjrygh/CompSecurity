// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_DisableEmergencyBody

public abstract class DisableEmergencyBody
{

    public DisableEmergencyBody()
    {
    }

    public static DisableEmergencyBody create()
    {
        return new Shape_DisableEmergencyBody();
    }

    public abstract Long getCreatedAt();

    public abstract DisableEmergencyBody setCreatedAt(Long long1);
}
