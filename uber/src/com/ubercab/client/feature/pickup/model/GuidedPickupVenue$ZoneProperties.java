// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenue_ZoneProperties

public abstract class n
    implements NamedFeatureProperties
{

    public static n create(String s, String s1, String s2, n n)
    {
        return (new Shape_GuidedPickupVenue_ZoneProperties()).setId(s).setName(s1).setShortName(s2).setPickupLocations(n);
    }

    public abstract n getPickupLocations();

    abstract n setId(String s);

    abstract n setName(String s);

    abstract n setPickupLocations(n n);

    abstract n setShortName(String s);

    public n()
    {
    }
}
