// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_LocationBody

public abstract class LocationBody
{

    public LocationBody()
    {
    }

    public static LocationBody create()
    {
        return new Shape_LocationBody();
    }

    public abstract Float getLatitude();

    public abstract Float getLongitude();

    public abstract LocationBody setLatitude(Float float1);

    public abstract LocationBody setLongitude(Float float1);
}
