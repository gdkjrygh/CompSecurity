// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.weather.dal2.eventlog.logs.EventLog;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.locations:
//            LocationArrayStorage, LocationUtils, SavedLocation, LocationChange, 
//            FollowMe

public final class WidgetLocations
{

    private static final String TAG = "WidgetLocations";
    private static final WidgetLocations instance = new WidgetLocations();
    private final List locations;
    private final LocationArrayStorage storage = LocationArrayStorage.createInstance("WidgetLocations");

    private WidgetLocations()
    {
        locations = storage.load(LocationPrefs.Keys.WIDGET_LOCATIONS);
    }

    public static WidgetLocations getInstance()
    {
        return instance;
    }

    public void addLocation(SavedLocation savedlocation, int i)
    {
        Preconditions.checkNotNull(savedlocation);
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            savedlocation.addWidgetId(Integer.valueOf(i));
            locations.add(savedlocation);
            LocationChange.broadcast(EnumSet.of(LocationChange.Flags.WIDGET_ADDED), savedlocation);
        }
        return;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public void removeAllLocations()
    {
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            locations.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void removeLocation(Integer integer)
    {
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        java.util.ArrayList arraylist;
        arraylist = Lists.newArrayList();
        Iterator iterator = locations.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            if (savedlocation.getWidgetIds().contains(integer))
            {
                arraylist.add(savedlocation);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_74;
        integer;
        obj;
        JVM INSTR monitorexit ;
        throw integer;
        locations.removeAll(arraylist);
        FollowMe.getInstance().removeWidget(integer);
        obj;
        JVM INSTR monitorexit ;
    }

    public void store()
    {
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            storage.store(locations, LocationPrefs.Keys.WIDGET_LOCATIONS);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    List viewLocations()
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = locations.iterator(); iterator.hasNext(); arraylist.add(SavedLocation.newInstance((SavedLocation)iterator.next()))) { }
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            EventLog.w("WidgetLocations", ((JSONException) (obj)).toString(), ((Throwable) (obj)));
        }
        return arraylist;
        obj;
        JVM INSTR monitorexit ;
        return arraylist;
    }

}
