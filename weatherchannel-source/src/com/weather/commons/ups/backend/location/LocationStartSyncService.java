// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.ups.backend.location:
//            UpsLocationManager, LocationSyncScheduler

public class LocationStartSyncService extends IntentService
{

    public static final String ONE_SHOT = "one_shot";
    private static final long RETRY_INTERVAL_MILLIS_ON_FAILURE = 0x493e0L;
    public static final String RETRY_ON_FAILURE = "retry_on_failure";
    public static final long SYNC_INTERVAL_MILLIS = 0x36ee80L;
    private static final String TAG = "LocationStartSyncService";
    private static long lastSuccessfulSync = -1L;
    private static int syncFailureCount = 0;

    public LocationStartSyncService()
    {
        super("LocationStartSyncService");
    }

    private static long getLastSyncTimeFromPref()
    {
        lastSuccessfulSync = TwcPrefs.getInstance().getLong(com.weather.util.prefs.TwcPrefs.Keys.LAST_SUCCESSFUL_START_SYNC_TIME, -1L);
        return lastSuccessfulSync;
    }

    private static void setLastSuccessfulSync(long l)
    {
        com/weather/commons/ups/backend/location/LocationStartSyncService;
        JVM INSTR monitorenter ;
        lastSuccessfulSync = l;
        TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.LAST_SUCCESSFUL_START_SYNC_TIME, lastSuccessfulSync);
        com/weather/commons/ups/backend/location/LocationStartSyncService;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean successfullySyncedOneHourAgo()
    {
        while (lastSuccessfulSync == -1L && getLastSyncTimeFromPref() == -1L || System.currentTimeMillis() - lastSuccessfulSync > 0x36ee80L) 
        {
            return false;
        }
        return true;
    }

    public static void suppressSync()
    {
        setLastSuccessfulSync(System.currentTimeMillis());
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        LogUtil.v("LocationStartSyncService", LoggingMetaTags.TWC_UPS, "onHandleIntent %s", new Object[] {
            intent
        });
        com/weather/commons/ups/backend/location/LocationStartSyncService;
        JVM INSTR monitorenter ;
        int i = TwcPrefs.getInstance().getInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_ANON_ACCOUNT.getValue());
        if (com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.getValue() == i)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        com/weather/commons/ups/backend/location/LocationStartSyncService;
        JVM INSTR monitorexit ;
        return;
        intent;
        com/weather/commons/ups/backend/location/LocationStartSyncService;
        JVM INSTR monitorexit ;
        throw intent;
        List list;
        if (successfullySyncedOneHourAgo())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        Log.i("LocationStartSyncService", "location update service: start syncing");
        list = FixedLocations.getInstance().viewLocations();
        Object obj = null;
        Iterator iterator = FixedLocations.getInstance().viewLocations().iterator();
_L2:
        SavedLocation savedlocation = obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        savedlocation = (SavedLocation)iterator.next();
        if (!savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature)) goto _L2; else goto _L1
_L1:
        UpsLocationManager.getInstance().loadLocationsFromDsx();
        if (savedlocation == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        FixedLocations.getInstance().setNotification(savedlocation, com.weather.dal2.locations.SavedLocation.AlertType.temperature, true);
        setLastSuccessfulSync(System.currentTimeMillis());
        syncFailureCount = 0;
        if (!intent.getBooleanExtra("one_shot", false))
        {
            LocationSyncScheduler.reScheduleSync(AbstractTwcApplication.getRootContext(), 0x36ee80L, true, false);
        }
        BasicDemographicsStorage.getInstance().write(AccountManager.getInstance().getDemographics());
_L3:
        com/weather/commons/ups/backend/location/LocationStartSyncService;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        int j;
        if (!intent.getBooleanExtra("retry_on_failure", true))
        {
            break MISSING_BLOCK_LABEL_270;
        }
        j = syncFailureCount + 1;
        syncFailureCount = j;
        if (j > 3)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        LocationSyncScheduler.reScheduleSync(AbstractTwcApplication.getRootContext(), 0x493e0L, true, intent.getBooleanExtra("one_shot", false));
_L4:
        FixedLocations.getInstance().createNewLocationList(list);
        Log.e("LocationStartSyncService", exception.getMessage(), exception);
          goto _L3
        setLastSuccessfulSync(System.currentTimeMillis());
          goto _L4
    }

}
