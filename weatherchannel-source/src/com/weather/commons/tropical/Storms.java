// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.weather.util.geometry.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import org.jgeohash.distance.DistanceCalculator;
import org.jgeohash.distance.MeasuringUnit;

// Referenced classes of package com.weather.commons.tropical:
//            StormData

public class Storms
{

    public static final Storms EMPTY = new Storms(ImmutableList.of(), false);
    private final boolean dataAvailable;
    private final Map stormIdToDataMap;

    public Storms(Iterable iterable)
    {
        this(iterable, true);
    }

    private Storms(Iterable iterable, boolean flag)
    {
        stormIdToDataMap = Maps.uniqueIndex(iterable, stormId());
        dataAvailable = flag;
    }

    private Function stormId()
    {
        return new Function() {

            final Storms this$0;

            public volatile Object apply(Object obj)
            {
                return apply((StormData)obj);
            }

            public String apply(StormData stormdata)
            {
                if (stormdata == null)
                {
                    return null;
                } else
                {
                    return stormdata.getStormId();
                }
            }

            
            {
                this$0 = Storms.this;
                super();
            }
        };
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (Storms)obj;
                    flag = flag1;
                    if (dataAvailable == ((Storms) (obj)).dataAvailable)
                    {
                        return stormIdToDataMap.equals(((Storms) (obj)).stormIdToDataMap);
                    }
                }
            }
        }
        return flag;
    }

    public StormData getDataFor(String s)
    {
        return (StormData)stormIdToDataMap.get(s);
    }

    public Iterable getStormIds()
    {
        return new ArrayList(stormIdToDataMap.keySet());
    }

    public Iterable getStormIdsOrderedByNearest(final LatLng point)
    {
        ArrayList arraylist = new ArrayList(stormIdToDataMap.values());
        Collections.sort(arraylist, new Comparator() {

            final Storms this$0;
            final LatLng val$point;

            public int compare(StormData stormdata, StormData stormdata1)
            {
                stormdata = stormdata.getCurrentPosition();
                double d = DistanceCalculator.distance(point.latitude, point.longitude, ((LatLng) (stormdata)).latitude, ((LatLng) (stormdata)).longitude, MeasuringUnit.KILOMETER);
                stormdata = stormdata1.getCurrentPosition();
                return Double.compare(d, DistanceCalculator.distance(point.latitude, point.longitude, ((LatLng) (stormdata)).latitude, ((LatLng) (stormdata)).longitude, MeasuringUnit.KILOMETER));
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((StormData)obj, (StormData)obj1);
            }

            
            {
                this$0 = Storms.this;
                point = latlng;
                super();
            }
        });
        return Lists.transform(arraylist, stormId());
    }

    public int hashCode()
    {
        int j = stormIdToDataMap.hashCode();
        int i;
        if (dataAvailable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return j * 31 + i;
    }

    public boolean isDataAvailable()
    {
        return dataAvailable;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Storms{stormIdToDataMap=").append(stormIdToDataMap).append(", dataAvailable=").append(dataAvailable).append('}').toString();
    }

}
