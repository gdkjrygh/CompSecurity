// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import android.net.Uri;
import com.adobe.mobile.Analytics;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.weather.ads2.config.AdConfig;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.config.AdUnitPrefix;
import com.weather.ads2.facade.AdRefreshGenerator;
import com.weather.ads2.factual.FactualConnection;
import com.weather.ads2.lotame.LotameConnectionV1;
import com.weather.ads2.lotame.LotameConnectionV2;
import com.weather.ads2.util.AppVersion;
import com.weather.ads2.util.LaunchHistory;
import com.weather.ads2.weatherfx.WeatherFxConnection;
import com.weather.beacons.config.BeaconConfig;
import com.weather.beacons.targeting.BeaconTargetingChange;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.beacons.targeting.StaticBeaconParameters;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.DeviceUtils;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.UIUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.ads2.targeting:
//            AdTargetingParam, ViewCount, AdCallData, TwcAdRequest, 
//            AdTargetingChange, TargetingDataConnection, StaticAdParameters, DemographicsParameters

public class TargetingManager
{

    private static final BeaconTargetingParam BEACON_TARGETING_PARAMS[] = BeaconTargetingParam.values();
    private static final Pattern BRACKETED_FOR_REPLACEMENT = Pattern.compile("%%.*?%%");
    private static final String BREAKING_NEWS_KEY = "bn";
    private static final String CONNECTION = "connection";
    public static final TargetingManager INSTANCE;
    private static final String LANG_KEY = "lang";
    private static final String LOCALE_KEY = "locale";
    private static final String ORD_KEY = "ord";
    private static final String ORIENTATION = "orientation";
    private static final String REQUESTS_IN_QUEUE = "requestsinqueue";
    private static final String SLOT_NAME_KEY = "slotName";
    private static final String TAG = "TargetingManager";
    private static final AdTargetingParam TARGETING_PARAMS[] = AdTargetingParam.values();
    public static final String VALUE_NL = "nl";
    private static final String VERSION_KEY = "ver";
    private final Map adParametersMap = new ConcurrentHashMap(AdTargetingParam.values().length);
    private final List adTargetingConnections;
    private final Map beaconsParametersMap = new ConcurrentHashMap(BeaconTargetingParam.values().length);
    private final TwcBus bus;
    private volatile boolean initialSettingComplete;
    private final Object lock = new Object();
    private final Prefs twcPrefs;
    private final ViewCount viewCount;

    TargetingManager(TwcBus twcbus, Collection collection, Prefs prefs, ViewCount viewcount)
    {
        bus = twcbus;
        twcPrefs = prefs;
        viewCount = viewcount;
        adTargetingConnections = ImmutableList.copyOf(collection);
    }

    public static String encode(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return "nl";
        } else
        {
            return Uri.encode(s);
        }
    }

    private static String getDeviceLanguage()
    {
        String s1 = LocaleUtil.getLocale().getLanguage();
        String s = s1;
        if (s1.isEmpty())
        {
            s = "nl";
        }
        return s;
    }

    private static String getDeviceLocale()
    {
        String s1 = Locale.getDefault().toString();
        String s = s1;
        if (s1.isEmpty())
        {
            s = "nl";
        }
        return s;
    }

    private static String getViewValue(long l)
    {
        if (l == 0L)
        {
            return "1";
        }
        if (l == 1L)
        {
            return "2";
        } else
        {
            return "-1";
        }
    }

    public String addUnicornParameters(String s, AdCallData adcalldata, AdConfig adconfig)
    {
        return replaceTokenForAdUrl((new StringBuilder()).append(s).append('?').append(adconfig.getUmUri()).toString(), adcalldata, adconfig);
    }

    public Map getAdParametersMap()
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        AdTargetingParam aadtargetingparam[] = TARGETING_PARAMS;
        int j = aadtargetingparam.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aadtargetingparam[i];
            if (obj == AdTargetingParam.LPID)
            {
                continue;
            }
            String s = (String)adParametersMap.get(obj);
            String s1 = ((AdTargetingParam) (obj)).getParameterKey();
            obj = s;
            if (s == null)
            {
                obj = "nl";
            }
            builder.put(s1, obj);
        }

        builder.put("locale", getDeviceLocale());
        builder.put("lang", getDeviceLanguage());
        return builder.build();
    }

    public TwcAdRequest getAdRequest(AdCallData adcalldata)
    {
        HashMap hashmap = Maps.newHashMap();
        hashmap.putAll(getAdParametersMap());
        hashmap.put("ord", encode(adcalldata.random));
        hashmap.put("ver", AppVersion.getInstance().getAdAppVersion());
        Object obj;
        if (twcPrefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ACTIVE, false))
        {
            obj = "y";
        } else
        {
            obj = "n";
        }
        hashmap.put("bn", obj);
        obj = viewCount.getCount();
        if (adcalldata.configUnit != null)
        {
            String s = adcalldata.configUnit.getSlotName();
            hashmap.put("slotName", encode(s));
            if (s.contains("feed"))
            {
                hashmap.put(AdTargetingParam.VIEW.getParameterKey(), getViewValue(((ViewCount.CountInfo) (obj)).count));
            }
            hashmap.putAll(adcalldata.configUnit.getParameters());
        }
        return new TwcAdRequest(hashmap, ((ViewCount.CountInfo) (obj)).countId);
    }

    public Map getBeaconContextData(String s, BeaconConfig beaconconfig)
    {
        return getBeaconContextData(s, beaconconfig, null);
    }

    public Map getBeaconContextData(String s, BeaconConfig beaconconfig, Map map)
    {
        Object obj = beaconconfig.getBeacon(s);
        map = getBeaconTargeting(map);
        s = beaconconfig.getStaticParameters(((com.weather.beacons.config.Beacon) (obj)));
        beaconconfig = beaconconfig.getDynamicParameters(((com.weather.beacons.config.Beacon) (obj)));
        obj = new HashMap(s.size() + beaconconfig.size());
        ((Map) (obj)).putAll(s);
        String s1;
        for (Iterator iterator = beaconconfig.iterator(); iterator.hasNext(); ((Map) (obj)).put(s1, s))
        {
            s1 = (String)iterator.next();
            beaconconfig = (String)map.get(s1);
            s = beaconconfig;
            if (beaconconfig == null)
            {
                s = "nl";
            }
        }

        return ((Map) (obj));
    }

    public Map getBeaconParametersMap(Map map)
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        BeaconTargetingParam abeacontargetingparam[] = BEACON_TARGETING_PARAMS;
        int j = abeacontargetingparam.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = abeacontargetingparam[i];
            String s1 = null;
            if (map != null)
            {
                s1 = (String)map.get(obj);
            }
            String s = s1;
            if (s1 == null)
            {
                s = (String)INSTANCE.beaconsParametersMap.get(obj);
            }
            obj = ((BeaconTargetingParam) (obj)).getParameterKey();
            s1 = s;
            if (s == null)
            {
                s1 = "nl";
            }
            builder.put(obj, s1);
        }

        try
        {
            map = builder.build();
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            EventLog.e("TargetingManager", (new StringBuilder()).append("Error constructing beacon parameter map: ").append(map).toString());
            return new HashMap();
        }
        return map;
    }

    public Map getBeaconTargeting(Map map)
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.putAll(getAdParametersMap());
        builder.putAll(INSTANCE.getBeaconParametersMap(map));
        android.content.Context context = AbstractTwcApplication.getRootContext();
        builder.put("ver", AppVersion.getInstance().getAdAppVersion());
        if (DeviceUtils.isNetworkConnected(context))
        {
            map = "online";
        } else
        {
            map = "offline";
        }
        builder.put("connection", map);
        if (UIUtil.isInLandscape(context))
        {
            map = "Landscape";
        } else
        {
            map = "Portrait";
        }
        builder.put("orientation", map);
        builder.put("requestsinqueue", String.valueOf(Analytics.getQueueSize()));
        if (INSTANCE.twcPrefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ACTIVE, false))
        {
            map = "y";
        } else
        {
            map = "n";
        }
        builder.put("bn", map);
        return builder.build();
    }

    public boolean isInitialSettingComplete()
    {
        return initialSettingComplete;
    }

    public void onAdTargetingDataUpdate(AdTargetingChange adtargetingchange)
    {
        Map map = adtargetingchange.getChangedParameters();
        adParametersMap.putAll(map);
        LogUtil.v("TargetingManager", LoggingMetaTags.TWC_AD, "onAdTargetingDataUpdate:\nchangeRecord=%s,\ngetAdParametersMap()=%s", new Object[] {
            adtargetingchange, getAdParametersMap()
        });
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
                    $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_START.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_STOP.ordinal()] = 2;
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
        JVM INSTR tableswitch 1 2: default 62
    //                   1 43
    //                   2 55;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_55;
_L4:
        return;
_L2:
        startAdTargetingConnections();
          goto _L4
        appevent;
        obj;
        JVM INSTR monitorexit ;
        throw appevent;
        stopAdTargetingConnections();
          goto _L4
    }

    public void onBeaconTargetingDataUpdate(BeaconTargetingChange beacontargetingchange)
    {
        beacontargetingchange = beacontargetingchange.getChangedParameters();
        beaconsParametersMap.putAll(beacontargetingchange);
    }

    public void refresh(boolean flag)
    {
        for (Iterator iterator = adTargetingConnections.iterator(); iterator.hasNext(); ((TargetingDataConnection)iterator.next()).refresh(flag)) { }
    }

    public String replaceIMAParameters(AdCallData adcalldata, AdConfig adconfig, String s)
    {
        String s1 = adconfig.getImaVideoAdUrl();
        if (s1 != null)
        {
            return replaceTokenForAdUrl(s1, adcalldata, adconfig, s);
        } else
        {
            return null;
        }
    }

    public String replaceTokenForAdUrl(String s, AdCallData adcalldata, AdConfig adconfig)
    {
        return replaceTokenForAdUrl(s, adcalldata, adconfig, null);
    }

    public String replaceTokenForAdUrl(String s, AdCallData adcalldata, AdConfig adconfig, String s1)
    {
        for (Iterator iterator = getAdRequest(adcalldata).getTargetingParameters().entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s2 = (String)((java.util.Map.Entry) (obj)).getKey();
            String s3 = adconfig.getSubstitutionToken(s2);
            String s4 = (String)((java.util.Map.Entry) (obj)).getValue();
            obj = s;
            if (s3 != null)
            {
                obj = s.replace(s3, s4);
            }
            s = ((String) (obj)).replace((new StringBuilder()).append("%%").append(s2).append("%%").toString(), s4);
        }

        adconfig = adcalldata.configUnit;
        adcalldata = s;
        if (adconfig != null)
        {
            adcalldata = s.replace("%%AdUnitPrefix%%%%AdUnitSuffix%%", encode(adconfig.getAdUnitId()));
        }
        s = adcalldata;
        if (adconfig != null)
        {
            s = adcalldata;
            if (((AdConfigUnit) (adconfig)).prefix != null)
            {
                s = adcalldata;
                if (s1 != null)
                {
                    s = adcalldata.replace("%%AdUnitPrefix%%%%AdVideoUnitSuffix%%", encode((new StringBuilder()).append(((AdConfigUnit) (adconfig)).prefix.getAdUnitPrefix()).append(s1).toString()));
                }
            }
        }
        return BRACKETED_FOR_REPLACEMENT.matcher(s).replaceAll("nl");
    }

    public void setInitialSettingComplete(boolean flag)
    {
        initialSettingComplete = flag;
    }

    public void start()
    {
        bus.register(this);
        (new StaticAdParameters()).start();
        beaconsParametersMap.putAll(StaticBeaconParameters.getStaticParameters());
        (new AdRefreshGenerator(bus, TwcPrefs.getInstance())).start();
        (new DemographicsParameters(bus)).start();
        LaunchHistory.getInstance().init(bus);
    }

    public void startAdTargetingConnections()
    {
        for (Iterator iterator = adTargetingConnections.iterator(); iterator.hasNext(); ((TargetingDataConnection)iterator.next()).start()) { }
    }

    public void stopAdTargetingConnections()
    {
        for (Iterator iterator = adTargetingConnections.iterator(); iterator.hasNext(); ((TargetingDataConnection)iterator.next()).stop()) { }
    }

    static 
    {
        TargetingManager targetingmanager;
        if (LocaleUtil.isDeviceInGermany())
        {
            targetingmanager = new TargetingManager(DataAccessLayer.BUS, ImmutableList.of(new WeatherFxConnection(DataAccessLayer.BUS, AdConfigManager.INSTANCE)), TwcPrefs.getInstance(), ViewCount.INSTANCE);
        } else
        {
            targetingmanager = new TargetingManager(DataAccessLayer.BUS, ImmutableList.of(new WeatherFxConnection(DataAccessLayer.BUS, AdConfigManager.INSTANCE), new LotameConnectionV1(DataAccessLayer.BUS), new LotameConnectionV2(DataAccessLayer.BUS), new FactualConnection(DataAccessLayer.BUS)), TwcPrefs.getInstance(), ViewCount.INSTANCE);
        }
        INSTANCE = targetingmanager;
    }
}
