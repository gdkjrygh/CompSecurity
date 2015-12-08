// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.distance;


// Referenced classes of package com.spatial4j.core.distance:
//            GeodesicSphereDistCalc, DistanceUtils

public static class A extends GeodesicSphereDistCalc
{

    protected double distanceLatLonRAD(double d, double d1, double d2, double d3)
    {
        return DistanceUtils.distVincentyRAD(d, d1, d2, d3);
    }

    public A()
    {
    }
}
