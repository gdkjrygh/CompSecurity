// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupGeocodeRegion_RegionProperties

public abstract class rties
{

    public static rties create()
    {
        return new Shape_GuidedPickupGeocodeRegion_RegionProperties();
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getShortName();

    abstract rties setId(String s);

    abstract rties setName(String s);

    abstract rties setShortName(String s);

    public rties()
    {
    }
}
