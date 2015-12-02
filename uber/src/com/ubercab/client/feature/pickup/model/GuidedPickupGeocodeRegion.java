// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupGeocodeRegion

public abstract class GuidedPickupGeocodeRegion
{

    public static final String KIND_HOTSPOT = "hotspot";
    public static final String KIND_VENUE = "venue";
    private static final String STATUS_FAILURE = "failure";
    private static final String STATUS_SUCCESS = "success";
    public static final String SUBTYPE_BLOCK = "block";
    public static final String SUBTYPE_BUILDING = "building";

    public GuidedPickupGeocodeRegion()
    {
    }

    public static GuidedPickupGeocodeRegion create(List list, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "success";
        } else
        {
            s = "failure";
        }
        return (new Shape_GuidedPickupGeocodeRegion()).setData(list).setStatus(s);
    }

    public abstract List getData();

    public abstract String getStatus();

    abstract GuidedPickupGeocodeRegion setData(List list);

    abstract GuidedPickupGeocodeRegion setStatus(String s);
}
