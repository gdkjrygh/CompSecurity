// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.dal2.locations:
//            SavedLocation, LocationUtils, CurrentLocationChangeEvent

public class CurrentLocation
{

    private static final String TAG = "CurrentLocation";
    private static final CurrentLocation instance = new CurrentLocation();
    private volatile CurrentLocationChangeEvent lastCurrentLocationChangeEvent;
    private volatile SavedLocation location;

    public CurrentLocation()
    {
    }

    public static CurrentLocation getInstance()
    {
        return instance;
    }

    public CurrentLocationChangeEvent getLastCurrentLocationChangeEvent()
    {
        return lastCurrentLocationChangeEvent;
    }

    public SavedLocation getLocation()
    {
        return location;
    }

    public boolean isCurrentLocation(SavedLocation savedlocation)
    {
        if (savedlocation != null)
        {
            return savedlocation.equals(location);
        } else
        {
            return false;
        }
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

    public void setLocation(SavedLocation savedlocation, String s, CurrentLocationChangeEvent.Cause cause)
    {
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            LogUtil.method("CurrentLocation", LoggingMetaTags.TWC_DAL_LOCATIONS, "setLocation", new Object[] {
                savedlocation, s
            });
            if (!isCurrentLocation(savedlocation))
            {
                LogUtil.d("CurrentLocation", LoggingMetaTags.TWC_DAL_LOCATIONS, "setLocation(): changing current location", new Object[0]);
                location = savedlocation;
                lastCurrentLocationChangeEvent = new CurrentLocationChangeEvent(cause);
                lastCurrentLocationChangeEvent.setOriginTag(s);
                DataAccessLayer.BUS.post(lastCurrentLocationChangeEvent);
            }
        }
        return;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

}
