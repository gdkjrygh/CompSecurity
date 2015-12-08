// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.weather.util.geometry.LatLng;
import java.util.Comparator;
import org.jgeohash.distance.DistanceCalculator;
import org.jgeohash.distance.MeasuringUnit;

// Referenced classes of package com.weather.commons.tropical:
//            Storms, StormData

class val.point
    implements Comparator
{

    final Storms this$0;
    final LatLng val$point;

    public int compare(StormData stormdata, StormData stormdata1)
    {
        stormdata = stormdata.getCurrentPosition();
        double d = DistanceCalculator.distance(val$point.latitude, val$point.longitude, ((LatLng) (stormdata)).latitude, ((LatLng) (stormdata)).longitude, MeasuringUnit.KILOMETER);
        stormdata = stormdata1.getCurrentPosition();
        return Double.compare(d, DistanceCalculator.distance(val$point.latitude, val$point.longitude, ((LatLng) (stormdata)).latitude, ((LatLng) (stormdata)).longitude, MeasuringUnit.KILOMETER));
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((StormData)obj, (StormData)obj1);
    }

    ()
    {
        this$0 = final_storms;
        val$point = LatLng.this;
        super();
    }
}
