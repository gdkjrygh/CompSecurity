// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;


// Referenced classes of package com.ubercab.rider.realtime.model:
//            GeoJsonFeature, Shape_DynamicPickupsResponse_PickupLocation, GeoJsonPoint, GeoJsonGeometry

public abstract class roperties
    implements GeoJsonFeature
{

    public static roperties create(GeoJsonPoint geojsonpoint)
    {
        return (new Shape_DynamicPickupsResponse_PickupLocation()).setGeometry(geojsonpoint);
    }

    public int getChirality()
    {
        return 0;
    }

    public volatile GeoJsonGeometry getGeometry()
    {
        return getGeometry();
    }

    public abstract GeoJsonPoint getGeometry();

    public abstract String getId();

    public abstract roperties getProperties();

    public volatile Object getProperties()
    {
        return getProperties();
    }

    abstract getProperties setGeometry(GeoJsonPoint geojsonpoint);

    abstract getProperties setId(String s);

    abstract roperties setProperties(roperties roperties);

    public roperties()
    {
    }
}
