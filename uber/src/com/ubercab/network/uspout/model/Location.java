// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout.model;


// Referenced classes of package com.ubercab.network.uspout.model:
//            Shape_Location

abstract class Location
{

    Location()
    {
    }

    static Location create(Double double1, Double double2)
    {
        return (new Shape_Location()).setLatitude(double1).setLongitude(double2);
    }

    abstract Double getLatitude();

    abstract Double getLongitude();

    abstract Location setLatitude(Double double1);

    abstract Location setLongitude(Double double1);
}
