// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.weather.dal2.eventlog.logs.EventLog;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

// Referenced classes of package com.weather.dal2.locations:
//            SavedLocation, SavedLocationsSnapshot, LocationUtils, FollowMeSnapshot, 
//            FixedLocationsSnapshot, LocationChange

public class ActiveLocation
{

    private static final String TAG = "ActiveLocation";
    private static final ActiveLocation instance = new ActiveLocation();
    private volatile SavedLocation location;

    public ActiveLocation()
    {
    }

    public static ActiveLocation getInstance()
    {
        return instance;
    }

    private boolean isValidLocation(SavedLocation savedlocation, Collection collection)
    {
        return savedlocation != null && savedlocation.equals(location) || collection.contains(location);
    }

    public SavedLocation getLocation()
    {
        normalize();
        return location;
    }

    public Integer getNavigationIndex()
    {
        normalize();
        if (location == null)
        {
            return null;
        }
        Object obj = new SavedLocationsSnapshot();
        SavedLocation savedlocation = ((SavedLocationsSnapshot) (obj)).getFollowMeLocation();
        obj = ((SavedLocationsSnapshot) (obj)).getFixedLocations();
        if (savedlocation != null)
        {
            if (savedlocation.equals(location))
            {
                return Integer.valueOf(0);
            }
            int i = ((List) (obj)).indexOf(location);
            if (i != -1)
            {
                return Integer.valueOf(i + 1);
            } else
            {
                EventLog.e("ActiveLocation", (new StringBuilder()).append("Location not found: ").append(location).toString());
                return null;
            }
        } else
        {
            return Integer.valueOf(((List) (obj)).indexOf(location));
        }
    }

    public boolean isActiveLocation(SavedLocation savedlocation)
    {
        if (savedlocation != null)
        {
            return savedlocation.equals(location);
        } else
        {
            return false;
        }
    }

    boolean normalize()
    {
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1 = false;
        SavedLocation savedlocation;
        List list;
        Object obj1;
        savedlocation = (new FollowMeSnapshot()).getLocation();
        obj1 = new FixedLocationsSnapshot();
        list = ((FixedLocationsSnapshot) (obj1)).viewLocations();
        if (location == null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (isValidLocation(savedlocation, list)) goto _L3; else goto _L2
_L2:
        obj1 = ((FixedLocationsSnapshot) (obj1)).getFirstLocationWithTag("home");
        if (savedlocation == null) goto _L5; else goto _L4
_L4:
        location = savedlocation;
        flag = true;
_L3:
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        location = ((SavedLocation) (obj1));
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        location = (SavedLocation)list.get(0);
        flag = true;
        continue; /* Loop/switch isn't completed */
        flag = flag1;
        if (location == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        location = null;
        flag = true;
        if (true) goto _L3; else goto _L6
_L6:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setLocation(SavedLocation savedlocation)
    {
        setLocation(savedlocation, true);
    }

    boolean setLocation(SavedLocation savedlocation, boolean flag)
    {
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        if (!isActiveLocation(savedlocation))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        location = savedlocation;
        if (!flag1 || !flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        LocationChange.broadcast(EnumSet.of(LocationChange.Flags.ACTIVE), location);
        obj;
        JVM INSTR monitorexit ;
        return flag1;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

}
