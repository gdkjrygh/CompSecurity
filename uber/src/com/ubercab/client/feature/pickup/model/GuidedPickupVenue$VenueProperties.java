// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenue_VenueProperties

public abstract class rties
    implements NamedFeatureProperties
{

    public static rties create(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            rties rties)
    {
        return (new Shape_GuidedPickupVenue_VenueProperties()).setId(s).setName(s1).setShortName(s2).setSubType(s5).setLocationSelectionDescription(s3).setLocationSelectionTitle(s4).setWelcomeDescription(s6).setWelcomeTitle(s7).setZones(rties);
    }

    public abstract String getId();

    public abstract String getLocationSelectionDescription();

    public abstract String getLocationSelectionTitle();

    public abstract String getSubType();

    public abstract String getWelcomeDescription();

    public abstract String getWelcomeTitle();

    public abstract setZones getZones();

    abstract setZones setId(String s);

    abstract setZones setLocationSelectionDescription(String s);

    abstract setZones setLocationSelectionTitle(String s);

    abstract setZones setName(String s);

    abstract setZones setShortName(String s);

    abstract setZones setSubType(String s);

    abstract setZones setWelcomeDescription(String s);

    abstract setZones setWelcomeTitle(String s);

    abstract setZones setZones(setZones setzones);

    public rties()
    {
    }
}
