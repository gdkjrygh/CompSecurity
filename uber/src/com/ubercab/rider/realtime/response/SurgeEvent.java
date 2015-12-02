// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_SurgeEvent

public abstract class SurgeEvent
{

    public SurgeEvent()
    {
    }

    public static SurgeEvent create()
    {
        return new Shape_SurgeEvent();
    }

    public abstract Float getMultiplier();

    public abstract boolean getTriggered();

    public abstract SurgeEvent setMultiplier(Float float1);

    public abstract SurgeEvent setTriggered(boolean flag);
}
