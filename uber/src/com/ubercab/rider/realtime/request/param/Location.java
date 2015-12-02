// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.param;


// Referenced classes of package com.ubercab.rider.realtime.request.param:
//            Shape_Location

public abstract class Location
{

    public Location()
    {
    }

    public static Location create(double d, double d1)
    {
        return (new Shape_Location()).setLatitude(d).setLongitude(d1);
    }

    public abstract double getLatitude();

    public abstract double getLongitude();

    abstract Location setLatitude(double d);

    abstract Location setLongitude(double d);
}
