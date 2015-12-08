// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.lbs;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import com.google.common.collect.ImmutableList;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.dal2.lbs:
//            LbsSystem, LbsService

class LegacyLbsSystem extends LbsSystem
{

    private static final String TAG = "LegacyLbsSystem";
    private volatile boolean isConnected;
    private volatile boolean isScheduled;

    LegacyLbsSystem()
    {
    }

    private static Location findBestLastLocation()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = ImmutableList.of("gps", "passive", "network").iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Location location1 = getLastKnownLocation((String)((Iterator) (obj)).next());
            if (location1 != null)
            {
                arraylist.add(location1);
            }
        } while (true);
        if (arraylist.size() == 1)
        {
            return (Location)arraylist.get(0);
        }
        long l = System.currentTimeMillis();
        long l1 = interval;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext();)
        {
            Location location2 = (Location)((Iterator) (obj)).next();
            if (location2.getTime() >= l - l1)
            {
                return location2;
            }
        }

        obj = null;
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Location location = (Location)iterator.next();
            if (obj == null)
            {
                obj = location;
            } else
            if (location.getTime() > ((Location) (obj)).getTime())
            {
                obj = location;
            }
        } while (true);
        return ((Location) (obj));
    }

    private static Location getLastKnownLocation(String s)
        throws IllegalArgumentException
    {
        Location location = null;
        LocationManager locationmanager = getLocationManager();
        if (locationmanager.isProviderEnabled(s))
        {
            location = locationmanager.getLastKnownLocation(s);
        }
        return location;
    }

    protected void connect()
    {
        LogUtil.method("LegacyLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "LegacyLbsSystem.connect", new Object[0]);
        String s;
        LocationManager locationmanager;
        if (onlyGpsEnabled())
        {
            s = "gps";
        } else
        {
            s = "network";
        }
        locationmanager = getLocationManager();
        locationmanager.requestLocationUpdates(s, interval, 50F, pendingIntent);
        if (locationmanager.isProviderEnabled("passive"))
        {
            locationmanager.requestLocationUpdates("passive", fastestInterval, 50F, pendingIntent);
        }
        isConnected = true;
        isScheduled = true;
        onConnectionSuccess();
    }

    protected void disable()
    {
        isConnected = false;
        isScheduled = false;
        getLocationManager().removeUpdates(pendingIntent);
    }

    protected void doSingleShotUpdate()
    {
        LogUtil.method("LegacyLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "LegacyLbsSystem.doSingleShotUpdate", new Object[0]);
        String s;
        LocationManager locationmanager;
        android.content.Context context;
        if (onlyGpsEnabled())
        {
            s = "gps";
        } else
        {
            s = "network";
        }
        locationmanager = getLocationManager();
        context = AbstractTwcApplication.getRootContext();
        locationmanager.requestSingleUpdate(s, PendingIntent.getService(context, 1, new Intent(context, com/weather/dal2/lbs/LbsService), 0x10000000));
    }

    protected Location getLastLocation()
    {
        return findBestLastLocation();
    }

    protected boolean isConnected()
    {
        return isConnected;
    }

    protected boolean isScheduled()
    {
        return isScheduled;
    }
}
