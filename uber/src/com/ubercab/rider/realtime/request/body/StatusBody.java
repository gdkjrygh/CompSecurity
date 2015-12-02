// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.param.Location;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_StatusBody

public abstract class StatusBody
{

    public StatusBody()
    {
    }

    public static StatusBody create()
    {
        return new Shape_StatusBody();
    }

    public abstract Location getTargetLocation();

    public abstract Location getTargetLocationSynced();

    public abstract StatusBody setTargetLocation(Location location);

    public abstract StatusBody setTargetLocationSynced(Location location);
}
