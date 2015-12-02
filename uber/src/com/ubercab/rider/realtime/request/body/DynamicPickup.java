// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_DynamicPickup

public abstract class DynamicPickup
{

    public DynamicPickup()
    {
    }

    public static DynamicPickup create(boolean flag)
    {
        return (new Shape_DynamicPickup()).setEnabled(flag);
    }

    public abstract boolean getEnabled();

    abstract DynamicPickup setEnabled(boolean flag);
}
