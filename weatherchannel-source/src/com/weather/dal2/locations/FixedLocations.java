// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.locations:
//            LocationArrayStorage, ActiveLocation, LocationChange, SavedLocation, 
//            LocationUtils

public class FixedLocations
{

    public static final String HOME = "home";
    public static final int MAX_SAVED_LOCATIONS = 10;
    public static final String OTHER = "other";
    private static final String TAG = "FixedLocations";
    public static final String WORK = "work";
    private static final FixedLocations instance = new FixedLocations();
    private final List locations;
    private final LocationArrayStorage storage = LocationArrayStorage.createInstance("FixedLocations");

    private FixedLocations()
    {
        locations = storage.load(LocationPrefs.Keys.FIXED_LOCATIONS);
    }

    private LocationChange delete(SavedLocation savedlocation)
    {
        EnumSet enumset = EnumSet.noneOf(com/weather/dal2/locations/LocationChange$Flags);
        if (locations.contains(savedlocation))
        {
            SavedLocation savedlocation1 = getRealLocation(savedlocation);
            if (locations.remove(savedlocation1))
            {
                enumset.add(LocationChange.Flags.LIST);
                enumset.add(LocationChange.Flags.ITEM_REMOVED);
                if (ActiveLocation.getInstance().normalize())
                {
                    enumset.add(LocationChange.Flags.ACTIVE);
                }
            }
        }
        return LocationChange.newLocationChange(enumset, savedlocation);
    }

    public static FixedLocations getInstance()
    {
        return instance;
    }

    private SavedLocation getRealLocation(SavedLocation savedlocation)
    {
        int i = locations.indexOf(savedlocation);
        if (i == -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(savedlocation).append(" not found").toString());
        } else
        {
            return (SavedLocation)locations.get(i);
        }
    }

    private EnumSet move(int i, int j)
    {
        EnumSet enumset = EnumSet.noneOf(com/weather/dal2/locations/LocationChange$Flags);
        if (i == j)
        {
            return enumset;
        } else
        {
            SavedLocation savedlocation = (SavedLocation)locations.get(i);
            SavedLocation savedlocation1 = (SavedLocation)locations.get(j);
            locations.set(j, savedlocation);
            locations.set(i, savedlocation1);
            enumset.add(LocationChange.Flags.LIST);
            return enumset;
        }
    }

    public boolean addLocation(SavedLocation savedlocation)
    {
label0:
        {
            Preconditions.checkNotNull(savedlocation);
            synchronized (LocationUtils.LOCATION_LOCK)
            {
                if (!locations.contains(savedlocation))
                {
                    break label0;
                }
            }
            return false;
        }
        savedlocation = addToList(savedlocation);
        if (savedlocation.getFlags().isEmpty())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        EnumSet enumset = EnumSet.copyOf(savedlocation.getFlags());
        if (ActiveLocation.getInstance().setLocation(savedlocation.getLocation(), false))
        {
            enumset.add(LocationChange.Flags.ACTIVE);
        }
        LocationChange.broadcast(enumset, savedlocation.getLocation());
        return true;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public void addTagToLocation(SavedLocation savedlocation, String s)
    {
        Preconditions.checkNotNull(savedlocation);
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            savedlocation = getRealLocation(savedlocation);
            clearTagInAllLocations(s);
            savedlocation.setTag(s);
        }
        return;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    LocationChange addToList(SavedLocation savedlocation)
    {
        LogUtil.method("FixedLocations", LoggingMetaTags.TWC_DAL_LOCATIONS, "addToList", new Object[] {
            savedlocation
        });
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        EnumSet enumset;
        enumset = EnumSet.noneOf(com/weather/dal2/locations/LocationChange$Flags);
        if (locations.size() >= 10)
        {
            LocationChange locationchange = delete((SavedLocation)locations.get(9));
            enumset.addAll(locationchange.getFlags());
            locationchange.getLocation();
        }
        try
        {
            SavedLocation savedlocation1 = SavedLocation.newInstance(savedlocation);
            savedlocation1.clearWidgetIds();
            savedlocation1.addWidgetId(Integer.valueOf(-1));
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.pollen, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.heavy_rain, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.thunderstorm, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.extreme_heat, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.high_wind, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.extreme_cold, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.heavy_snowfall, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.ice, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.dense_fog, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.temperature, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.severe, false);
            savedlocation1.addRemoveAlertType(SavedLocation.AlertType.rainSnow, false);
            savedlocation1.setAddress("");
            savedlocation1.clearTags();
            locations.add(0, savedlocation1);
            enumset.add(LocationChange.Flags.LIST);
            enumset.add(LocationChange.Flags.ITEM_ADDED);
            if (ActiveLocation.getInstance().normalize())
            {
                enumset.add(LocationChange.Flags.ACTIVE);
            }
        }
        catch (JSONException jsonexception) { }
        savedlocation = LocationChange.newLocationChange(enumset, savedlocation);
        return savedlocation;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public void clearTagInAllLocations(String s)
    {
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = locations.iterator(); iterator.hasNext(); getRealLocation((SavedLocation)iterator.next()).clearTag(s)) { }
        break MISSING_BLOCK_LABEL_50;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
    }

    public void clearTags(SavedLocation savedlocation)
    {
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            Preconditions.checkNotNull(savedlocation);
            getRealLocation(savedlocation).clearTags();
        }
        return;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public void createNewLocationList(List list)
    {
        Preconditions.checkNotNull(locations);
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        EnumSet enumset;
        locations.clear();
        enumset = EnumSet.noneOf(com/weather/dal2/locations/LocationChange$Flags);
        int i = 0;
        int j = Math.min(list.size(), 10);
        while (i < j) 
        {
            try
            {
                SavedLocation savedlocation = SavedLocation.newInstance((SavedLocation)list.get(i));
                savedlocation.addWidgetId(Integer.valueOf(-1));
                locations.add(i, savedlocation);
                enumset.add(LocationChange.Flags.LIST);
                enumset.add(LocationChange.Flags.LIST_CREATED);
            }
            catch (JSONException jsonexception) { }
            finally { }
            i++;
        }
        if (!enumset.isEmpty())
        {
            LocationChange.broadcast(enumset, null);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public boolean isEmpty()
    {
        boolean flag;
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            flag = locations.isEmpty();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean moveWithinList(int i, int j)
    {
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        EnumSet enumset;
        int k = locations.size();
        Preconditions.checkElementIndex(i, k);
        Preconditions.checkElementIndex(j, k);
        enumset = move(i, j);
        Exception exception;
        boolean flag;
        if (!enumset.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        LocationChange.broadcast(enumset, null);
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

    public void removeAllLocations()
    {
        LogUtil.d("FixedLocations", LoggingMetaTags.TWC_DAL_LOCATIONS, "removeAllLocations", new Object[0]);
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        do
        {
            if (locations.isEmpty())
            {
                break;
            }
            LocationChange locationchange = delete((SavedLocation)locations.get(0));
            if (!locationchange.getFlags().isEmpty())
            {
                LocationChange.broadcast(locationchange.getFlags(), locationchange.getLocation());
            }
        } while (true);
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean removeLocation(SavedLocation savedlocation)
    {
label0:
        {
            Preconditions.checkNotNull(savedlocation);
            synchronized (LocationUtils.LOCATION_LOCK)
            {
                savedlocation = delete(savedlocation);
                if (!savedlocation.getFlags().isEmpty())
                {
                    break label0;
                }
            }
            return false;
        }
        LocationChange.broadcast(savedlocation.getFlags(), savedlocation.getLocation());
        obj;
        JVM INSTR monitorexit ;
        return true;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public boolean removeLocations(Set set)
    {
        Preconditions.checkNotNull(set);
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        EnumSet enumset;
        enumset = EnumSet.noneOf(com/weather/dal2/locations/LocationChange$Flags);
        for (set = set.iterator(); set.hasNext(); enumset.addAll(delete((SavedLocation)set.next()).getFlags())) { }
        break MISSING_BLOCK_LABEL_62;
        set;
        obj;
        JVM INSTR monitorexit ;
        throw set;
        if (enumset.isEmpty())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        LocationChange.broadcast(enumset, null);
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public void setAddress(SavedLocation savedlocation, String s)
    {
        Preconditions.checkNotNull(savedlocation);
        Preconditions.checkNotNull(s);
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            getRealLocation(savedlocation).setAddress(s);
            LocationChange.broadcast(EnumSet.of(LocationChange.Flags.ADDRESS_CHANGE), savedlocation);
        }
        return;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public void setNickname(SavedLocation savedlocation, String s)
    {
        Preconditions.checkNotNull(savedlocation);
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            savedlocation.setNickname(s);
        }
        return;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public void setNotification(SavedLocation savedlocation, SavedLocation.AlertType alerttype, boolean flag)
    {
        Preconditions.checkNotNull(savedlocation);
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            getRealLocation(savedlocation).addRemoveAlertType(alerttype, flag);
            LocationChange.broadcast(EnumSet.of(LocationChange.Flags.NOTIFICATION_CHANGE), savedlocation);
        }
        return;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public int size()
    {
        int i;
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            i = locations.size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void store()
    {
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            storage.store(locations, LocationPrefs.Keys.FIXED_LOCATIONS);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List viewLocations()
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
            EventLog.w("FixedLocations", ((JSONException) (obj)).toString(), ((Throwable) (obj)));
        }
        return arraylist;
        obj;
        JVM INSTR monitorexit ;
        return arraylist;
    }

}
