// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.param.Location;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_AnalyticsEventBody

public abstract class AnalyticsEventBody
{

    public AnalyticsEventBody()
    {
    }

    public static AnalyticsEventBody create()
    {
        return new Shape_AnalyticsEventBody();
    }

    public abstract String getAction();

    public abstract Location getLocation();

    public abstract String getType();

    public abstract AnalyticsEventBody setAction(String s);

    public abstract AnalyticsEventBody setLocation(Location location);

    public abstract AnalyticsEventBody setType(String s);
}
