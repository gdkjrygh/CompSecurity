// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import gki;
import gkk;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            Shape_DynamicPickupsResponse, GeoJsonPoint

public abstract class DynamicPickupsResponse
{

    public DynamicPickupsResponse()
    {
    }

    public static transient DynamicPickupsResponse create(int i, GeoJsonPoint ageojsonpoint[])
    {
        ageojsonpoint = gkk.a(gki.a(Arrays.asList(ageojsonpoint), new _cls1()));
        ageojsonpoint = FeatureCollection.create((PickupLocation[])ageojsonpoint.toArray(new PickupLocation[ageojsonpoint.size()]));
        return (new Shape_DynamicPickupsResponse()).setMaximumWalkingRadius(Integer.valueOf(i)).setPickupLocations(ageojsonpoint);
    }

    public abstract Integer getMaximumWalkingRadius();

    public abstract FeatureCollection getPickupLocations();

    abstract DynamicPickupsResponse setMaximumWalkingRadius(Integer integer);

    abstract DynamicPickupsResponse setPickupLocations(FeatureCollection featurecollection);

    /* member class not found */
    class _cls1 {}


    private class PickupLocation
        implements GeoJsonFeature
    {

        public static PickupLocation create(GeoJsonPoint geojsonpoint)
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

        public abstract PickupLocationProperties getProperties();

        public volatile Object getProperties()
        {
            return getProperties();
        }

        abstract PickupLocation setGeometry(GeoJsonPoint geojsonpoint);

        abstract PickupLocation setId(String s);

        abstract PickupLocation setProperties(PickupLocationProperties pickuplocationproperties);

        public PickupLocation()
        {
        }
    }


    private class FeatureCollection
        implements GeoJsonCollection
    {

        public static transient FeatureCollection create(PickupLocation apickuplocation[])
        {
            return (new Shape_DynamicPickupsResponse_FeatureCollection()).setFeatures(Arrays.asList(apickuplocation));
        }

        public abstract List getFeatures();

        abstract FeatureCollection setFeatures(List list);

        public FeatureCollection()
        {
        }
    }

}
