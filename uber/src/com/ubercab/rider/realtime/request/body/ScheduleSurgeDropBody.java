// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.param.Location;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ScheduleSurgeDropBody

public abstract class ScheduleSurgeDropBody
{

    public static final String SURGE_DROP = "SurgeDrop";

    public ScheduleSurgeDropBody()
    {
    }

    public static ScheduleSurgeDropBody create()
    {
        return (new Shape_ScheduleSurgeDropBody()).setNotificationName("SurgeDrop");
    }

    public abstract long getFareId();

    public abstract String getNotificationName();

    public abstract Location getPickupLocation();

    public abstract int getVehicleViewId();

    public abstract ScheduleSurgeDropBody setFareId(long l);

    abstract ScheduleSurgeDropBody setNotificationName(String s);

    public abstract ScheduleSurgeDropBody setPickupLocation(Location location);

    public abstract ScheduleSurgeDropBody setVehicleViewId(int i);
}
