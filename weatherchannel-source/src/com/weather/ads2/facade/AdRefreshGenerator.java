// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.weather.ads2.geo.ContextualGeoUpdater;
import com.weather.ads2.geo.DeviceLocationUpdater;
import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.ads2.targeting.TargetingManager;
import com.weather.ads2.weatherconditions.ContextualWeatherConditionUpdater;
import com.weather.beacons.targeting.ContextualGeoBeaconUpdater;
import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.locations.ActiveLocation;
import com.weather.dal2.locations.FixedLocationsSnapshot;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.weatherconnections.WeatherDataError;
import com.weather.util.UnitType;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.ads2.facade:
//            WxData, CurrentConditions, WeatherAlerts, Pollen, 
//            Forecast, Ski

public final class AdRefreshGenerator
{
    public static final class LastRefreshTrigger
    {

        private final SavedLocation location;
        private final long timeSent = System.currentTimeMillis();
        private final RecordSets weatherData;

        public boolean allowUpdate(SavedLocation savedlocation, RecordSets recordsets)
        {
            return !location.equals(savedlocation) || !Objects.equal(weatherData, recordsets) || System.currentTimeMillis() - timeSent >= TimeUnit.SECONDS.toMillis(2L);
        }

        public LastRefreshTrigger(SavedLocation savedlocation, RecordSets recordsets)
        {
            location = (SavedLocation)Preconditions.checkNotNull(savedlocation);
            weatherData = recordsets;
        }
    }


    private static final WxData EMPTY_WX_DATA;
    private static final String TAG = "AdRefreshGenerator";
    private boolean appIsInForeground;
    private final TwcBus bus;
    private final ContextualGeoBeaconUpdater contextualGeoBeaconUpdater;
    private final ContextualGeoUpdater contextualGeoUpdater;
    private final ContextualWeatherConditionUpdater contextualWeatherConditionUpdater;
    private SavedLocation currentLocation;
    private final Map currentWeatherMap = new ConcurrentHashMap();
    private final DeviceLocationUpdater deviceLocationUpdater;
    private AdRefreshEvent lastRefreshEvent;
    private final Object lock = new Object();
    private final Prefs prefs;
    private LastRefreshTrigger refreshTrigger;

    public AdRefreshGenerator(TwcBus twcbus, Prefs prefs1)
    {
        appIsInForeground = true;
        bus = twcbus;
        contextualWeatherConditionUpdater = new ContextualWeatherConditionUpdater(twcbus);
        contextualGeoUpdater = new ContextualGeoUpdater(twcbus);
        contextualGeoBeaconUpdater = new ContextualGeoBeaconUpdater(twcbus);
        deviceLocationUpdater = new DeviceLocationUpdater(twcbus);
        prefs = prefs1;
    }

    private void cleanupIfNeeded(LocationChange locationchange)
    {
        locationchange = locationchange.getFlags();
        if (locationchange.contains(com.weather.dal2.locations.LocationChange.Flags.ITEM_REMOVED) || locationchange.contains(com.weather.dal2.locations.LocationChange.Flags.ITEMS_REMOVED) || locationchange.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_DEACTIVATED) || locationchange.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE))
        {
            clearOldKeys();
        }
    }

    private void clear()
    {
        TargetingManager.INSTANCE.setInitialSettingComplete(false);
        lastRefreshEvent = null;
        currentWeatherMap.clear();
    }

    private void clearOldKeys()
    {
        Object obj = new SavedLocationsSnapshot();
        ArrayList arraylist = new ArrayList(((SavedLocationsSnapshot) (obj)).getFixedLocations());
        obj = ((SavedLocationsSnapshot) (obj)).getFollowMeLocation();
        if (obj != null)
        {
            arraylist.add(obj);
        }
        currentWeatherMap.keySet().retainAll(arraylist);
    }

    private void makeFacades(RecordSets recordsets)
    {
        Object obj = new SavedLocationsSnapshot();
        SavedLocation savedlocation = ((SavedLocationsSnapshot) (obj)).getFollowMeLocation();
        if (savedlocation != null)
        {
            makeFacades(recordsets, savedlocation);
        }
        for (obj = ((SavedLocationsSnapshot) (obj)).fixed().viewLocations().iterator(); ((Iterator) (obj)).hasNext(); makeFacades(recordsets, (SavedLocation)((Iterator) (obj)).next())) { }
    }

    private void makeFacades(RecordSets recordsets, SavedLocation savedlocation)
    {
        if (recordsets.hasDataFor(savedlocation))
        {
            recordsets = new WxData(new CurrentConditions(recordsets, savedlocation), new WeatherAlerts(recordsets, savedlocation), new Pollen(recordsets, savedlocation), new Forecast(recordsets.wxdv2DHRecord), new Ski(recordsets.wxdv2SkiResorts));
            currentWeatherMap.put(savedlocation, recordsets);
        }
    }

    private boolean postUpdates(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Not refreshing ads after weather update: current location is not set", new Object[0]);
            return false;
        }
        savedlocation = (WxData)currentWeatherMap.get(savedlocation);
        boolean flag;
        if (savedlocation != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Not updating ads after weather update: Current location does not have weather data", new Object[0]);
            savedlocation = EMPTY_WX_DATA;
        }
        contextualWeatherConditionUpdater.onWeatherUpdate(savedlocation);
        return flag;
    }

    private void sendAdRefresh(SavedLocation savedlocation)
    {
        TargetingManager.INSTANCE.setInitialSettingComplete(true);
        WxData wxdata = (WxData)currentWeatherMap.get(savedlocation);
        boolean flag;
        if (!prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ACTIVE, false) && (wxdata == null || wxdata.weatherAlerts.allowBrandedBackground))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "location=%s, allowBranded=%s", new Object[] {
            savedlocation, Boolean.valueOf(flag)
        });
        lastRefreshEvent = new AdRefreshEvent(savedlocation, flag);
        bus.post(lastRefreshEvent);
    }

    private void updateCurrentLocation(LocationChange locationchange)
    {
        boolean flag1 = true;
        LogUtil.v("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "updateCurrentLocation locationChange=%s", new Object[] {
            locationchange
        });
        EnumSet enumset = locationchange.getFlags();
        if (enumset.contains(com.weather.dal2.locations.LocationChange.Flags.ACTIVE))
        {
            locationchange = locationchange.getSnapshot().getActiveLocation();
            if (Objects.equal(currentLocation, locationchange))
            {
                LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Ignoring location change to the same location", new Object[0]);
                return;
            }
            currentLocation = locationchange;
            refreshTrigger = null;
            LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Current location has changed", new Object[0]);
            if (currentLocation != null)
            {
                contextualGeoUpdater.onLocationUpdate(currentLocation);
                contextualGeoBeaconUpdater.onLocationUpdate(currentLocation);
                boolean flag = flag1;
                if (!enumset.contains(com.weather.dal2.locations.LocationChange.Flags.ITEM_ADDED))
                {
                    flag = flag1;
                    if (!enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE))
                    {
                        if (enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATED))
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
                if (postUpdates(locationchange) && appIsInForeground && !flag)
                {
                    LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Requesting ad refresh due to current location change", new Object[0]);
                    sendAdRefresh(currentLocation);
                    return;
                }
            }
        }
    }

    private void updateDeviceLocation(LocationChange locationchange)
    {
        EnumSet enumset = locationchange.getFlags();
        boolean flag;
        if (enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE) || enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATED))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        locationchange = locationchange.getSnapshot().getFollowMeLocation();
        if (flag && locationchange != null)
        {
            deviceLocationUpdater.onLocationChange(locationchange);
        }
    }

    public AdRefreshEvent getCurrentRefreshEvent()
    {
        AdRefreshEvent adrefreshevent;
        synchronized (lock)
        {
            adrefreshevent = lastRefreshEvent;
        }
        return adrefreshevent;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAppEvent(AppEvent appevent)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        static class _cls1
        {

            static final int $SwitchMap$com$weather$dal2$system$AppEvent$Cause[];

            static 
            {
                $SwitchMap$com$weather$dal2$system$AppEvent$Cause = new int[com.weather.dal2.system.AppEvent.Cause.values().length];
                try
                {
                    $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_STOP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_START.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_CREATE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.weather.dal2.system.AppEvent.Cause[appevent.getCause().ordinal()];
        JVM INSTR tableswitch 1 2: default 72
    //                   1 43
    //                   2 60;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_60;
_L4:
        return;
_L2:
        appIsInForeground = false;
        clear();
          goto _L4
        appevent;
        obj;
        JVM INSTR monitorexit ;
        throw appevent;
        appIsInForeground = true;
        clear();
          goto _L4
    }

    public void onChange(LocationChange locationchange)
    {
        synchronized (lock)
        {
            LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "onChange: %s", new Object[] {
                locationchange
            });
            Preconditions.checkNotNull(locationchange);
            cleanupIfNeeded(locationchange);
            updateDeviceLocation(locationchange);
            updateCurrentLocation(locationchange);
        }
        return;
        locationchange;
        obj;
        JVM INSTR monitorexit ;
        throw locationchange;
    }

    public void onChange(UnitType unittype)
    {
        synchronized (lock)
        {
            LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Clearing data due to unit change", new Object[0]);
            clear();
        }
        return;
        exception;
        unittype;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onReceiveWeatherData(RecordSets recordsets)
    {
        boolean flag1 = false;
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation;
        LogUtil.v("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "onReceiveWeatherData: Weather data updated. recordSet=%s", new Object[] {
            recordsets
        });
        makeFacades(recordsets);
        savedlocation = currentLocation;
        if (savedlocation != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Current location is null during weather update", new Object[0]);
        if (savedlocation == null) goto _L2; else goto _L1
_L1:
        if (!recordsets.hasDataFor(savedlocation)) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        if (refreshTrigger == null || refreshTrigger.allowUpdate(currentLocation, recordsets))
        {
            flag1 = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (!postUpdates(savedlocation) || !flag1)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (!recordsets.isFromStaleData() && appIsInForeground)
        {
            LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Requesting ad refresh due to weather change", new Object[0]);
            sendAdRefresh(currentLocation);
            refreshTrigger = new LastRefreshTrigger(currentLocation, recordsets);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        recordsets;
        obj;
        JVM INSTR monitorexit ;
        throw recordsets;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onWeatherDataFailure(WeatherDataError weatherdataerror)
    {
        boolean flag1 = false;
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation;
        LogUtil.v("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "onWeatherDataFailure error=%s", new Object[] {
            weatherdataerror
        });
        savedlocation = weatherdataerror.getLocation();
        if (!weatherdataerror.postedStaleData())
        {
            currentWeatherMap.put(savedlocation, EMPTY_WX_DATA);
        }
        boolean flag;
        if (currentLocation != null && savedlocation.equals(currentLocation))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (refreshTrigger == null || refreshTrigger.allowUpdate(currentLocation, null))
        {
            flag1 = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (!postUpdates(currentLocation) || !flag1)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (appIsInForeground)
        {
            LogUtil.d("AdRefreshGenerator", LoggingMetaTags.TWC_AD, "Requesting ad refresh due to failed weather change", new Object[0]);
            sendAdRefresh(currentLocation);
            refreshTrigger = new LastRefreshTrigger(currentLocation, null);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        weatherdataerror;
        obj;
        JVM INSTR monitorexit ;
        throw weatherdataerror;
    }

    public void start()
    {
        contextualGeoUpdater.start();
        SavedLocation savedlocation;
        synchronized (lock)
        {
            currentLocation = ActiveLocation.getInstance().getLocation();
            savedlocation = currentLocation;
        }
        if (savedlocation != null)
        {
            contextualGeoUpdater.onLocationUpdate(savedlocation);
            contextualGeoBeaconUpdater.onLocationUpdate(savedlocation);
        }
        obj = (new FollowMeSnapshot()).getLocation();
        if (obj != null)
        {
            deviceLocationUpdater.onLocationChange(((SavedLocation) (obj)));
        }
        bus.register(this);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        EMPTY_WX_DATA = new WxData(CurrentConditions.EMPTY, WeatherAlerts.EMPTY, Pollen.EMPTY, Forecast.EMPTY, Ski.EMPTY);
    }
}
