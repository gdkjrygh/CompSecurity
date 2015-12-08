// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.lbs;

import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.weather.dal2.cache.NonLoadingDiskCache;
import com.weather.dal2.config.DalConfig;
import com.weather.dal2.config.DalConfigManager;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.eventlog.tracking.TrackingBatchedEventReport;
import com.weather.dal2.eventlog.tracking.TrackingBatchedItem;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.LatLongExtra;
import com.weather.dal2.locations.LocationConnection;
import com.weather.dal2.locations.LocationUtils;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.sensors.PressureSensor;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.lbs:
//            LbsLocationUpdateUtil

public class LbsService extends IntentService
{

    private static final String CACHE_ID = "LBS";
    public static final double CURLOC_MIN_DISPLACEMENT_KM = 0.5D;
    private static final int EXPIRATION;
    static final String KEY_LAST_LOCATION_LAT_LNG = "com.weather.dal2.lbs.LAST_LOCATION_LAT_LNG";
    public static final String KEY_LOCATION = "location";
    private static final int MAX_SIZE = 100;
    private static final String TAG = "LbsService";
    private final DalConfig dalConfig;
    private NonLoadingDiskCache diskCache;
    private final FollowMe followMe;
    private final LbsLocationUpdateUtil lbsLocationUpdateUtil;
    private final TrackingBatchedEventReport trackingBatchedEventReport;

    public LbsService()
    {
        this(DalConfigManager.INSTANCE.getDalConfig(), LbsLocationUpdateUtil.getInstance(), FollowMe.getInstance(), TrackingBatchedEventReport.getInstance());
    }

    LbsService(DalConfig dalconfig, LbsLocationUpdateUtil lbslocationupdateutil, FollowMe followme, TrackingBatchedEventReport trackingbatchedeventreport)
    {
        super("LbsService");
        dalConfig = dalconfig;
        lbsLocationUpdateUtil = lbslocationupdateutil;
        followMe = followme;
        trackingBatchedEventReport = trackingbatchedeventreport;
        setDiskLbs();
    }

    private SavedLocation fetchSavedLocation(double d, double d1)
    {
        SavedLocation savedlocation;
        String s;
        String s1;
        LogUtil.method("LbsService", LoggingMetaTags.TWC_DAL_LBS, "fetchSavedLocation", new Object[] {
            Double.valueOf(d), Double.valueOf(d1)
        });
        Object obj1 = null;
        Object obj = null;
        s = LocationUtils.formatLatLong(d, d1, 4);
        savedlocation = obj;
        if (diskCache == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        s1 = diskCache.get(s);
        savedlocation = obj;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        savedlocation = obj1;
        SavedLocation savedlocation1 = SavedLocation.deSerialize(s1);
        savedlocation = savedlocation1;
        LogUtil.d("LbsService", LoggingMetaTags.TWC_DAL_LBS, "cache hit: %s, %s", new Object[] {
            s, savedlocation1.getCity()
        });
        savedlocation = savedlocation1;
_L2:
        SavedLocation savedlocation2 = savedlocation;
        if (savedlocation != null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        JSONException jsonexception;
        SavedLocation savedlocation3;
        try
        {
            savedlocation3 = LocationConnection.getInstance().fetch(d, d1, false);
        }
        catch (Exception exception)
        {
            EventLog.w("LbsService", (new StringBuilder()).append("LocationConnection.fetch() failure: ").append(exception).toString());
            return savedlocation;
        }
        savedlocation = savedlocation3;
        LogUtil.d("LbsService", LoggingMetaTags.TWC_DAL_LBS, "LocationConnection key: %s, %s", new Object[] {
            s, savedlocation3
        });
        savedlocation2 = savedlocation3;
        savedlocation = savedlocation3;
        if (diskCache == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        savedlocation = savedlocation3;
        diskCache.put(s, savedlocation3.serialize());
        savedlocation2 = savedlocation3;
        return savedlocation2;
        jsonexception;
        EventLog.w("LbsService", (new StringBuilder()).append("Exception serializing location: ").append(jsonexception).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Location getLocationExtra(Bundle bundle)
    {
        if (bundle.containsKey("com.google.android.location.LOCATION"))
        {
            bundle = ((Bundle) (bundle.get("com.google.android.location.LOCATION")));
        } else
        {
            bundle = ((Bundle) (bundle.get("location")));
        }
        return (Location)(Location)bundle;
    }

    private boolean isFollowMeTrackingEnabled()
    {
        return dalConfig.getFollowMeTracking().isEnabled();
    }

    private void processTrackedBatchedItem(double d, double d1, double d2, SavedLocation savedlocation)
    {
        if (isFollowMeTrackingEnabled())
        {
            savedlocation = new TrackingBatchedItem(d, d1, d2, savedlocation, PressureSensor.getInstance().getPressure());
            trackingBatchedEventReport.process(savedlocation);
            LogUtil.d("LbsService", LoggingMetaTags.TWC_DAL_LBS, "LbsService:processTrackedBatchedItem:Processing Location Update Log", new Object[0]);
        }
    }

    private void setDiskLbs()
    {
        NonLoadingDiskCache nonloadingdiskcache;
        try
        {
            nonloadingdiskcache = NonLoadingDiskCache.open(100, EXPIRATION, "LBS");
        }
        catch (Exception exception)
        {
            EventLog.w("LbsService", (new StringBuilder()).append("Couldn't open disk cache: ").append(exception).toString());
            exception = null;
        }
        diskCache = nonloadingdiskcache;
    }

    private void updateLocation(double d, double d1, double d2, boolean flag)
    {
        SavedLocation savedlocation = fetchSavedLocation(d, d1);
        if (savedlocation != null)
        {
            if (flag)
            {
                followMe.handleNewLbsLocation(savedlocation, false);
                LogUtil.d("LbsService", LoggingMetaTags.TWC_DAL_LBS, "LbsService:updateLocation:Last Known Location", new Object[0]);
            } else
            if (lbsLocationUpdateUtil.canUpdate(d, d1))
            {
                LogUtil.d("LbsService", LoggingMetaTags.TWC_DAL_LBS, "LbsService:updateLocation:Time to update  new fix", new Object[0]);
                savedlocation.setAccuracy(d2);
                processTrackedBatchedItem(d, d1, d2, savedlocation);
                followMe.handleNewLbsLocation(savedlocation, lbsLocationUpdateUtil.locationHasDisplace(d, d1, 0.5D));
                lbsLocationUpdateUtil.commitUpdateTimeAndLatLng(d, d1);
                return;
            }
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        Location location;
        if (intent == null || intent.getExtras() == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        intent = intent.getExtras();
        location = getLocationExtra(intent);
        if (!intent.containsKey("com.weather.dal2.lbs.LAST_LOCATION_LAT_LNG")) goto _L2; else goto _L1
_L1:
        LogUtil.d("LbsService", LoggingMetaTags.TWC_DAL_LBS, "Last Location Fix", new Object[0]);
        intent = (LatLongExtra)Preconditions.checkNotNull(intent.get("com.weather.dal2.lbs.LAST_LOCATION_LAT_LNG"));
        updateLocation(intent.getLat(), intent.getLng(), 0.0D, true);
_L4:
        return;
_L2:
        if (intent.containsKey("providerEnabled"))
        {
            LogUtil.d("LbsService", LoggingMetaTags.TWC_DAL_LBS, "Provider enabled or disabled", new Object[0]);
            return;
        }
        if (location == null) goto _L4; else goto _L3
_L3:
        updateLocation(location.getLatitude(), location.getLongitude(), location.getAccuracy(), false);
        return;
        LogUtil.w("LbsService", LoggingMetaTags.TWC_DAL_LBS, "Fix with no extras or null intent.", new Object[0]);
        return;
    }

    static 
    {
        EXPIRATION = Ints.checkedCast(TimeUnit.DAYS.toMinutes(7L));
    }
}
