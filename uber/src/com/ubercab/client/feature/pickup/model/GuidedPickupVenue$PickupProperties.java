// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenue_PickupProperties

public abstract class rties
    implements NamedFeatureProperties
{

    public static rties create(String s, String s1, String s2)
    {
        return (new Shape_GuidedPickupVenue_PickupProperties()).setId(s).setName(s1).setShortName(s2);
    }

    abstract setShortName setId(String s);

    abstract setShortName setName(String s);

    abstract setShortName setShortName(String s);

    public rties()
    {
    }
}
