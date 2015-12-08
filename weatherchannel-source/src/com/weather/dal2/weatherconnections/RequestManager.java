// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.weatherconnections;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.weather.dal2.DalPrefs;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.lbs.LbsServiceController;
import com.weather.dal2.locations.ActiveLocation;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.SystemEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.DeviceUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.weatherconnections:
//            RefreshService, CachingDsxDataFetcher

public final class RequestManager
{

    private static final long INTERVAL;
    private static final long INTERVAL_IN_MINUTES = 16L;
    private static final String TAG = "RequestManager";
    private static final RequestManager instance = new RequestManager();
    private final AlarmManager alarmManager;
    private final PendingIntent pendingIntent;

    private RequestManager()
    {
        Context context = AbstractTwcApplication.getRootContext();
        alarmManager = (AlarmManager)context.getSystemService("alarm");
        pendingIntent = PendingIntent.getService(context, 0, new Intent(context, com/weather/dal2/weatherconnections/RefreshService), 0x8000000);
    }

    private static void addAlertLocations(Collection collection, SavedLocationsSnapshot savedlocationssnapshot)
    {
        Iterator iterator = savedlocationssnapshot.getFixedLocations().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature) && !collection.contains(savedlocation))
            {
                collection.add(savedlocation);
            }
        } while (true);
        savedlocationssnapshot = savedlocationssnapshot.getFollowMeLocation();
        if (savedlocationssnapshot != null && !collection.contains(savedlocationssnapshot) && savedlocationssnapshot.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature))
        {
            collection.add(savedlocationssnapshot);
        }
    }

    private static void addCurrentLocation(Collection collection, SavedLocationsSnapshot savedlocationssnapshot)
    {
        savedlocationssnapshot = savedlocationssnapshot.getActiveLocation();
        if (savedlocationssnapshot != null && !collection.contains(savedlocationssnapshot))
        {
            collection.add(savedlocationssnapshot);
        }
    }

    private static void addFixedLocations(Collection collection, SavedLocationsSnapshot savedlocationssnapshot)
    {
        savedlocationssnapshot = savedlocationssnapshot.getFixedLocations().iterator();
        do
        {
            if (!savedlocationssnapshot.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)savedlocationssnapshot.next();
            if (!collection.contains(savedlocation))
            {
                collection.add(savedlocation);
            }
        } while (true);
    }

    private static void addFollowMeLocation(Collection collection, SavedLocationsSnapshot savedlocationssnapshot)
    {
        savedlocationssnapshot = savedlocationssnapshot.getFollowMeLocation();
        if (savedlocationssnapshot != null && !collection.contains(savedlocationssnapshot))
        {
            collection.add(savedlocationssnapshot);
        }
    }

    private static void addWidgetLocations(Collection collection, SavedLocationsSnapshot savedlocationssnapshot)
    {
        savedlocationssnapshot = savedlocationssnapshot.getWidgetLocations().iterator();
        do
        {
            if (!savedlocationssnapshot.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)savedlocationssnapshot.next();
            if (!collection.contains(savedlocation))
            {
                collection.add(savedlocation);
            }
        } while (true);
    }

    private static Iterable buildBigList()
    {
        LogUtil.d("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "buildBigList()", new Object[0]);
        java.util.ArrayList arraylist = Lists.newArrayList();
        SavedLocationsSnapshot savedlocationssnapshot = new SavedLocationsSnapshot();
        addCurrentLocation(arraylist, savedlocationssnapshot);
        addFollowMeLocation(arraylist, savedlocationssnapshot);
        addFixedLocations(arraylist, savedlocationssnapshot);
        addWidgetLocations(arraylist, savedlocationssnapshot);
        return arraylist;
    }

    private static Iterable buildSmallList()
    {
        LogUtil.d("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "buildSmallList()", new Object[0]);
        java.util.ArrayList arraylist = Lists.newArrayList();
        SavedLocationsSnapshot savedlocationssnapshot = new SavedLocationsSnapshot();
        addWidgetLocations(arraylist, savedlocationssnapshot);
        addAlertLocations(arraylist, savedlocationssnapshot);
        addCurrentLocation(arraylist, savedlocationssnapshot);
        return arraylist;
    }

    public static RequestManager getInstance()
    {
        return instance;
    }

    private void scheduleNextRefresh()
    {
        LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "scheduleNextRefresh", new Object[0]);
        alarmManager.cancel(pendingIntent);
        alarmManager.set(3, SystemClock.elapsedRealtime() + INTERVAL, pendingIntent);
    }

    private static void sendRequest(SavedLocation savedlocation, boolean flag)
    {
        if (savedlocation != null)
        {
            CachingDsxDataFetcher.getInstance().request(savedlocation, flag);
        }
    }

    private static void sendRequests(Iterable iterable, boolean flag)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); sendRequest((SavedLocation)iterable.next(), flag)) { }
    }

    public void doForcedRefresh()
    {
        LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "doForcedRefresh", new Object[0]);
        sendRequests(buildBigList(), true);
        LbsServiceController.getInstance().onManualRefresh();
        sendRequest(ActiveLocation.getInstance().getLocation(), true);
    }

    void doRefresh()
    {
        LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "doRefresh", new Object[0]);
        if (DeviceUtils.isScreenOn())
        {
            if (DeviceUtils.isBatteryChargedOrCharging(0.10000000000000001D))
            {
                if (DalPrefs.getInstance().getBoolean(com.weather.dal2.DalPrefs.Keys.IS_APP_RUNNING, false))
                {
                    sendRequests(buildBigList(), false);
                } else
                {
                    sendRequests(buildSmallList(), false);
                }
            }
            scheduleNextRefresh();
        }
    }

    public void onAppEvent(AppEvent appevent)
    {
        appevent = appevent.getCause();
        if (appevent == com.weather.dal2.system.AppEvent.Cause.APP_START)
        {
            LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "onAppEvent", new Object[] {
                appevent
            });
            DalPrefs.getInstance().putBoolean(com.weather.dal2.DalPrefs.Keys.IS_APP_RUNNING, true);
            sendRequests(buildBigList(), false);
        } else
        if (appevent == com.weather.dal2.system.AppEvent.Cause.APP_STOP)
        {
            LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "onAppEvent", new Object[] {
                appevent
            });
            DalPrefs.getInstance().putBoolean(com.weather.dal2.DalPrefs.Keys.IS_APP_RUNNING, false);
            return;
        }
    }

    public void onLocationChange(LocationChange locationchange)
    {
        LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "onLocationChange", new Object[] {
            locationchange.getLocation()
        });
        if (!Sets.intersection(EnumSet.of(com.weather.dal2.locations.LocationChange.Flags.ITEM_ADDED, com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATED, com.weather.dal2.locations.LocationChange.Flags.WIDGET_ADDED, com.weather.dal2.locations.LocationChange.Flags.LIST_CREATED), locationchange.getFlags()).isEmpty())
        {
            LogUtil.d("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "change flags empty", new Object[0]);
            sendRequests(buildBigList(), false);
        } else
        if (locationchange.getFlags().contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE))
        {
            LogUtil.d("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "change: %s", new Object[] {
                locationchange.getFlags().toString()
            });
            locationchange = locationchange.getLocation();
            if (locationchange != null && DeviceUtils.isScreenOn())
            {
                CachingDsxDataFetcher.getInstance().request(locationchange, false);
                return;
            }
        }
    }

    public void onSystemEvent(SystemEvent systemevent)
    {
        systemevent = systemevent.getCause();
        if (systemevent == com.weather.dal2.system.SystemEvent.Cause.BOOT)
        {
            LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "onSystemEvent", new Object[] {
                systemevent
            });
            DalPrefs.getInstance().putBoolean(com.weather.dal2.DalPrefs.Keys.IS_APP_RUNNING, false);
        } else
        {
            if (systemevent == com.weather.dal2.system.SystemEvent.Cause.USER_PRESENT)
            {
                LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "onSystemEvent", new Object[] {
                    systemevent
                });
                sendRequests(buildSmallList(), false);
                scheduleNextRefresh();
                return;
            }
            if (systemevent == com.weather.dal2.system.SystemEvent.Cause.NETWORK_UP && DeviceUtils.isScreenOn())
            {
                LogUtil.method("RequestManager", LoggingMetaTags.TWC_DAL_WXD, "onSystemEvent", new Object[] {
                    systemevent
                });
                sendRequests(buildSmallList(), false);
                return;
            }
        }
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

    static 
    {
        INTERVAL = TimeUnit.MINUTES.toMillis(16L);
    }
}
