// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.geo;

import android.net.Uri;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.targeting.AdTargetingChange;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.ads2.weatherfx.ScatterShot;
import com.weather.ads2.weatherfx.ScatterShotUpdateEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Map;

public final class ContextualGeoUpdater
{

    private static final String TAG = "ContextualGeoUpdater";
    private final TwcBus bus;
    private volatile String currentZip;
    private volatile Map scatterShotMap;

    public ContextualGeoUpdater(TwcBus twcbus)
    {
        scatterShotMap = ImmutableMap.of();
        bus = twcbus;
    }

    private static String convertEmpty(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!s.isEmpty())
                {
                    break label0;
                }
            }
            s1 = "nl";
        }
        return s1;
    }

    private static String formatValue(String s)
    {
        if (Strings.isNullOrEmpty(s) || "*".equals(s) || "null".equals(s))
        {
            s = "nl";
        } else
        {
            String s1 = Uri.encode(s);
            s = s1;
            if (s1 == null)
            {
                return "nl";
            }
        }
        return s;
    }

    private Map getCurrentScatterShotTargeting()
    {
        Object obj = (ScatterShot)scatterShotMap.get(currentZip);
        String s;
        if (obj == null)
        {
            s = "nl";
            obj = "nl";
        } else
        {
            s = convertEmpty(((ScatterShot) (obj)).getZcs());
            obj = convertEmpty(((ScatterShot) (obj)).getNzcs());
        }
        return ImmutableMap.of(AdTargetingParam.ZCS, s, AdTargetingParam.NZCS, obj);
    }

    public void onLocationUpdate(SavedLocation savedlocation)
    {
        currentZip = savedlocation.getZipCode();
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(AdTargetingParam.LOCATION_COUNTRY_CODE, formatValue(savedlocation.getCountryCode()));
        builder.put(AdTargetingParam.LOCATION_STATE, formatValue(savedlocation.getState()));
        builder.put(AdTargetingParam.LOCATION_CITY, formatValue(savedlocation.getCity()));
        builder.put(AdTargetingParam.LOCATION_ZIP, formatValue(currentZip));
        builder.put(AdTargetingParam.LOCATION_DMA, formatValue(String.valueOf(savedlocation.getDma())));
        builder.putAll(getCurrentScatterShotTargeting());
        bus.post(new AdTargetingChange(builder.build()));
    }

    public void onScatterShotUpdate(ScatterShotUpdateEvent scattershotupdateevent)
    {
        LogUtil.v("ContextualGeoUpdater", LoggingMetaTags.TWC_AD, (new StringBuilder()).append("onScatterShotUpdate(), updateEvent=").append(scattershotupdateevent).toString(), new Object[0]);
        scatterShotMap = ImmutableMap.copyOf(scattershotupdateevent.getZipCodeToScatterShotMap());
        scattershotupdateevent = getCurrentScatterShotTargeting();
        bus.post(new AdTargetingChange(scattershotupdateevent));
    }

    public void start()
    {
        bus.register(this);
    }
}
