// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.model.Location;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_RiderSetInfoBody

public abstract class RiderSetInfoBody
{

    public RiderSetInfoBody()
    {
    }

    public static RiderSetInfoBody create(Location location)
    {
        return (new Shape_RiderSetInfoBody()).setDestination(location);
    }

    public abstract Location getDestination();

    abstract RiderSetInfoBody setDestination(Location location);
}
