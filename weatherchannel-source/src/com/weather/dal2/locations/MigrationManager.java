// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.weather.dal.locations.FollowMeStatus;
import com.weather.dal.locations.LocationItem;
import com.weather.dal.locations.LocationItemOptions;
import com.weather.dal.locations.LocationType;
import com.weather.dal.locations.LocationsArchiver;
import com.weather.dal.locations.SavedLocationsData;
import com.weather.dal.locations.SerialArchiver;
import com.weather.dal.locations.TwcLocation;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.dal2.locations:
//            FollowMe, LocationConnection, LocationChange

public class MigrationManager
{

    private static boolean alreadyHasSevereNotification;
    private static boolean alreadyHasTemperatureNotification;
    private final LocationsArchiver archiver;
    private final SavedLocationsData data = readOldLocationsData();

    public MigrationManager()
    {
        archiver = SerialArchiver.INSTANCE;
    }

    public void migrate()
    {
        if (data != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        boolean flag;
        boolean flag3;
        boolean flag4;
        flag4 = false;
        flag3 = false;
        flag = false;
        obj = data.getFollowMeStatus();
        if (obj != null)
        {
            boolean flag1;
            boolean flag5;
            boolean flag7;
            if (((FollowMeStatus) (obj)).getItem().getOptions().getSevereNotification() != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag5 = ((FollowMeStatus) (obj)).getItem().getOptions().hasTemperatureNotification();
            flag7 = flag5;
            obj = ((FollowMeStatus) (obj)).getItem().getWidgetIds().iterator();
            do
            {
                flag4 = flag1;
                flag3 = flag5;
                flag = flag7;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Integer integer = (Integer)((Iterator) (obj)).next();
                if (integer.intValue() != -1)
                {
                    FollowMe.getInstance().activateLbs(integer.intValue());
                }
            } while (true);
        } else
        {
            FollowMe.getInstance().activateLbs(-1);
        }
        obj = data.getLocationsList().iterator();
_L4:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj1 = (LocationItem)((Iterator) (obj)).next();
            TwcLocation twclocation = ((LocationItem) (obj1)).getLocation();
            boolean flag2 = flag;
            if (!((LocationItem) (obj1)).fromWidget())
            {
                boolean flag6 = ((LocationItem) (obj1)).getOptions().hasTemperatureNotification();
    /* block-local class not found */
    class FixedLocationReceiver {}

    /* block-local class not found */
    class WidgetLocationReceiver {}

                Integer integer1;
                if (flag6 && !flag)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                LocationConnection.getInstance().asyncFetch((new StringBuilder()).append(twclocation.getKey()).append(':').append(twclocation.getType().getValue()).append(':').append(twclocation.getCountryCode()).toString(), new FixedLocationReceiver(((LocationItem) (obj1)).getOptions().getSevereNotification(), flag2, flag4, flag3), null, true);
                flag2 = flag | flag6;
            }
            obj1 = ((LocationItem) (obj1)).getWidgetIds();
            if (((Integer)((List) (obj1)).get(0)).intValue() != -1)
            {
                break;
            }
            flag = flag2;
        } while (((List) (obj1)).size() <= 1);
        obj1 = ((List) (obj1)).iterator();
_L5:
        flag = flag2;
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        integer1 = (Integer)((Iterator) (obj1)).next();
        LocationConnection.getInstance().asyncFetch((new StringBuilder()).append(twclocation.getKey()).append(':').append(twclocation.getType().getValue()).append(':').append(twclocation.getCountryCode()).toString(), new WidgetLocationReceiver(integer1), null, true);
          goto _L5
          goto _L4
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onReceiveNewLbsLocation(LocationChange locationchange)
    {
        if (locationchange.getFlags().contains(LocationChange.Flags.FOLLOW_ME_ACTIVATED))
        {
            locationchange = data.getFollowMeStatus();
            if (locationchange != null)
            {
                FollowMe followme = FollowMe.getInstance();
                boolean flag;
                if (locationchange.getItem().getOptions().getSevereNotification() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                followme.setSevereNotification(flag);
                FollowMe.getInstance().setTemperatureNotification(locationchange.getItem().getOptions().hasTemperatureNotification());
            }
            DataAccessLayer.BUS.unregister(this);
        }
    }

    public final SavedLocationsData readOldLocationsData()
    {
        SavedLocationsData savedlocationsdata1 = archiver.load();
        SavedLocationsData savedlocationsdata = savedlocationsdata1;
        if (savedlocationsdata1 == null)
        {
            savedlocationsdata = new SavedLocationsData();
        }
        return savedlocationsdata;
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }



/*
    static boolean access$002(boolean flag)
    {
        alreadyHasSevereNotification = flag;
        return flag;
    }

*/



/*
    static boolean access$102(boolean flag)
    {
        alreadyHasTemperatureNotification = flag;
        return flag;
    }

*/

    // Unreferenced inner class com/weather/dal2/locations/MigrationManager$LocationReceiver
    /* block-local class not found */
    class LocationReceiver {}

}
