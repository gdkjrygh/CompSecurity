// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.analytics;

import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.targeting.TargetingManager;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class Analytics
{

    private static final String TAG = "Analytics";
    private static final ScheduledExecutorService beaconExecutor = Executors.newSingleThreadScheduledExecutor();

    private Analytics()
    {
    }

    public static String contextDataString(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            stringbuilder.append((String)entry.getKey()).append("=\"").append(entry.getValue()).append('"');
            if (map.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static void trackAction(String s, Map map)
    {
        beaconExecutor.submit(new Runnable(s, map) {

            final String val$beaconString;
            final Map val$extraParameterData;

            public void run()
            {
                try
                {
                    Object obj = AdConfigManager.INSTANCE.getBeaconConfig();
                    obj = TargetingManager.INSTANCE.getBeaconContextData(beaconString, ((com.weather.beacons.config.BeaconConfig) (obj)), extraParameterData);
                    com.adobe.mobile.Analytics.trackAction(beaconString, ((Map) (obj)));
                    LogUtil.d("Analytics", LoggingMetaTags.TWC_BEACON, "action beacon: beaconString=%s, contextData=%s", new Object[] {
                        beaconString, Analytics.contextDataString(((Map) (obj)))
                    });
                    return;
                }
                catch (ConfigException configexception)
                {
                    EventLog.e("Analytics", (new StringBuilder()).append("error firing action beacon ").append(beaconString).toString(), configexception);
                }
            }

            
            {
                beaconString = s;
                extraParameterData = map;
                super();
            }
        });
    }

    public static void trackState(String s, Map map)
    {
        beaconExecutor.submit(new Runnable(s, map) {

            final String val$beaconString;
            final Map val$extraParameterData;

            public void run()
            {
                try
                {
                    Object obj = AdConfigManager.INSTANCE.getBeaconConfig();
                    obj = TargetingManager.INSTANCE.getBeaconContextData(beaconString, ((com.weather.beacons.config.BeaconConfig) (obj)), extraParameterData);
                    com.adobe.mobile.Analytics.trackState(beaconString, ((Map) (obj)));
                    LogUtil.d("Analytics", LoggingMetaTags.TWC_BEACON, "state beacon: beaconString=%s, contextData=%s", new Object[] {
                        beaconString, Analytics.contextDataString(((Map) (obj)))
                    });
                    return;
                }
                catch (ConfigException configexception)
                {
                    EventLog.e("Analytics", (new StringBuilder()).append("error firing state beacon ").append(beaconString).toString(), configexception);
                }
            }

            
            {
                beaconString = s;
                extraParameterData = map;
                super();
            }
        });
    }

}
