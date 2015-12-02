// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.param.Location;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_BootstrapRiderBody

public abstract class BootstrapRiderBody
{

    public BootstrapRiderBody()
    {
    }

    public static BootstrapRiderBody create()
    {
        return new Shape_BootstrapRiderBody();
    }

    public abstract Map getCachedMessages();

    public abstract Location getTargetLocation();

    public abstract BootstrapRiderBody setCachedMessages(Map map);

    public abstract BootstrapRiderBody setTargetLocation(Location location);
}
