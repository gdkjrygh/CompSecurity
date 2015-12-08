// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;

// Referenced classes of package com.weather.dal.locations:
//            SerialArchiver, LocationsArchiver, SavedLocationsData, SavedLocationsSnapshot, 
//            LbsState, PointerList, Pointer

public final class SavedLocations
{

    public static final int FOLLOW_ME_INDEX = -2;
    public static final String LOCATION_CHANGE_EXTRA = "com.weather.Weather.LOCATION_CHANGE_EXTRA";
    public static final String LOCATION_CHANGE_INTENT = "com.weather.Weather.LOCATION_CHANGE";
    public static final int MAX_SAVED_LOCATIONS = 10;
    public static final int NONE = -1;
    private static final String TAG = "SavedLocations";
    private static SavedLocations instance;
    private Timer activationTimer;
    private final LocationsArchiver archiver;
    private final SavedLocationsData data;
    private SavedLocationsSnapshot lastSnapshot;
    private final Object lock;

    private SavedLocations()
    {
        lock = new Object();
        activationTimer = new Timer();
        archiver = SerialArchiver.INSTANCE;
        SavedLocationsData savedlocationsdata = archiver.load();
        if (savedlocationsdata == null)
        {
            data = new SavedLocationsData();
        } else
        {
            data = savedlocationsdata;
        }
        lastSnapshot = new SavedLocationsSnapshot(data);
    }

    private SavedLocations(SavedLocationsData savedlocationsdata, LocationsArchiver locationsarchiver)
    {
        lock = new Object();
        activationTimer = new Timer();
        data = savedlocationsdata;
        archiver = locationsarchiver;
    }

    private static void forceLoad()
    {
        synchronized (instance.lock)
        {
            instance = new SavedLocations();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static SavedLocations getInstance()
    {
        com/weather/dal/locations/SavedLocations;
        JVM INSTR monitorenter ;
        SavedLocations savedlocations;
        if (instance == null)
        {
            instance = new SavedLocations();
        }
        savedlocations = instance;
        com/weather/dal/locations/SavedLocations;
        JVM INSTR monitorexit ;
        return savedlocations;
        Exception exception;
        exception;
        com/weather/dal/locations/SavedLocations;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public SavedLocationsSnapshot createSnapshot()
    {
        return lastSnapshot;
    }

    public boolean isAwaitingActivation()
    {
        return data.getLbsState().isAwaitingActivation();
    }

    public void removeAllLocations()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = data.getPointers().iterator(); iterator.hasNext(); ((Pointer)iterator.next()).clear()) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ArrayList arraylist = new ArrayList();
        data.setLocationsList(arraylist);
        data.setFollowMeStatus(null);
        lastSnapshot = new SavedLocationsSnapshot(data);
        obj;
        JVM INSTR monitorexit ;
    }
}
