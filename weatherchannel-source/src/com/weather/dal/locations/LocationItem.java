// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.weather.dal.locations:
//            LocationItemOptions, TwcLocation

public class LocationItem
    implements Serializable
{

    public static final int APP_ORIGINATED = -1;
    private static final String TAG = "LocationItem";
    private static final long serialVersionUID = 0xc8e9ab4ecd39f3abL;
    private long lastUpdated;
    private TwcLocation location;
    private LocationItemOptions options;
    private final List widgetIds;

    LocationItem(LocationItem locationitem)
    {
        Preconditions.checkNotNull(locationitem);
        location = locationitem.location;
        widgetIds = Lists.newArrayList(locationitem.widgetIds);
        options = locationitem.options;
        lastUpdated = locationitem.lastUpdated;
    }

    LocationItem(TwcLocation twclocation, String s, int i)
    {
        location = twclocation;
        options = new LocationItemOptions(s, null, false, null);
        widgetIds = Lists.newArrayList(new Integer[] {
            Integer.valueOf(i)
        });
        lastUpdated = System.currentTimeMillis();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LocationItem)obj;
            if (!location.equals(((LocationItem) (obj)).location))
            {
                Log.i("LocationItem", "locations are different");
                return false;
            }
            if (!options.equals(((LocationItem) (obj)).options))
            {
                Log.i("LocationItem", "options are different");
                return false;
            }
            if (!widgetIds.equals(((LocationItem) (obj)).widgetIds))
            {
                Log.i("LocationItem", "widgetIds are different");
                return false;
            }
        }
        return true;
    }

    public boolean fromWidget()
    {
        return !((Integer)widgetIds.get(0)).equals(Integer.valueOf(-1));
    }

    public long getLastUpdated()
    {
        return lastUpdated;
    }

    public TwcLocation getLocation()
    {
        return location;
    }

    public LocationItemOptions getOptions()
    {
        return options;
    }

    public List getWidgetIds()
    {
        return widgetIds;
    }

    public int hashCode()
    {
        return ((location.hashCode() + 31) * 31 + options.hashCode()) * 31 + widgetIds.hashCode();
    }

    public void setLastUpdated(long l)
    {
        lastUpdated = l;
    }

    public void setLocation(TwcLocation twclocation)
    {
        location = twclocation;
    }

    public void setOptions(LocationItemOptions locationitemoptions)
    {
        options = locationitemoptions;
    }

    public String toString()
    {
        return location.getCity();
    }
}
