// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.config:
//            ModulesConfig, ModuleConfig

public class ActivitiesConfig
{

    public static final String AIRPORT = "airport";
    public static final String BOAT = "boat";
    public static final String BREAKING_NEWS = "breaking-news";
    public static final String CHECKIN = "check-in";
    public static final String CURRENT_CONDITIONS = "current-conditions";
    public static final String HOURLY = "hourly";
    public static final String MAP = "map";
    public static final String NEWS = "news";
    public static final String POLLEN = "pollen";
    public static final String SEVERE_WEATHER_ALERT = "severe_weather_alert";
    private static final String SEVERE_WEATHER_ALERT_AD_SLOT = "weather.severe";
    public static final String TEN_DAY = "ten-day";
    public static final String TWC_PRESENTS = "twcpresents";
    public static final String VIDEO = "video";
    private static final Map adSlotsMap = ImmutableMap.of("severe_weather_alert", "weather.severe");
    private final ModulesConfig modulesConfig;

    public ActivitiesConfig(ModulesConfig modulesconfig)
    {
        modulesConfig = modulesconfig;
    }

    public String getAdSlot(String s)
    {
        if (modulesConfig == null)
        {
            return null;
        }
        String s1 = (String)adSlotsMap.get(Preconditions.checkNotNull(s));
        Object obj = s1;
        if (s1 == null)
        {
            ModuleConfig moduleconfig = modulesConfig.getMConfig(s);
            obj = moduleconfig;
            if (moduleconfig == null)
            {
                obj = moduleconfig;
                if ("map".equals(s))
                {
                    obj = modulesConfig.getMConfig("hurricane");
                }
            }
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((ModuleConfig) (obj)).adSlotName;
            }
        }
        return ((String) (obj));
    }

}
