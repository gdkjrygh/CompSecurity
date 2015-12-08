// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.nhc;

import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableList;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.facade.WeatherAlert;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.dal2.net.MetricsHttpGetRequest;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.device.LocaleUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class NhcWeatherAlertFetcher
{
    private static class WeatherAlertCacheLoader extends CacheLoader
    {

        private final ConfigurationManagers configurationManagers;

        private List makeAlertList(Iterable iterable)
        {
            ArrayList arraylist = new ArrayList();
            for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(new WeatherAlert((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc)iterable.next()))) { }
        /* block-local class not found */
        class _cls2 {}

            Collections.sort(arraylist, new _cls2());
            return ImmutableList.copyOf(arraylist);
        }

        public volatile Object load(Object obj)
            throws Exception
        {
            return load(obj);
        }

        public List load(Object obj)
            throws Exception
        {
            obj = configurationManagers.getFlagshipConfig();
            obj = (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.Metric.MetricTag.TIMER_NHC_ALERT_DATA_REQUEST)).fetch(((FlagshipConfig) (obj)).nhcDetailsUrl, true);
        /* block-local class not found */
        class _cls1 {}

            if (((String) (obj)).isEmpty())
            {
                return new ArrayList();
            } else
            {
                return makeAlertList((List)JsonObjectMapper.fromJson(((String) (obj)), (new _cls1()).getType()));
            }
        }

        WeatherAlertCacheLoader(ConfigurationManagers configurationmanagers)
        {
            configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        }
    }


    private static final Object KEY = new Object();
    private static final String TAG = "NhcWeatherAlertFetcher";
    private final MemCache alertMemCache;

    public NhcWeatherAlertFetcher(ConfigurationManagers configurationmanagers)
    {
        this(configurationmanagers, Ticker.systemTicker());
    }

    NhcWeatherAlertFetcher(ConfigurationManagers configurationmanagers, Ticker ticker)
    {
        alertMemCache = new MemCache(new WeatherAlertCacheLoader(configurationmanagers), 1, 5, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy), ticker);
    }

    public static WeatherAlert getTropicalOutlook(Iterable iterable, String s)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            WeatherAlert weatheralert = (WeatherAlert)iterable.next();
            if (s.equals(weatheralert.getAreaId()) && weatheralert.isTropicalOutlook())
            {
                return weatheralert;
            }
        }

        return null;
    }

    public static WeatherAlert getWeatherAlert(Iterable iterable, String s, NhcDetailsActivity.NhcData nhcdata)
    {
        Object obj = null;
        Iterator iterator = iterable.iterator();
        iterable = obj;
        while (iterator.hasNext()) 
        {
            WeatherAlert weatheralert = (WeatherAlert)iterator.next();
            if (s.equals(weatheralert.getTropicalCycloneId()) && (nhcdata == NhcDetailsActivity.NhcData.PUBLIC_ADVISORY && weatheralert.isTropicalPublicAdvisory() || nhcdata == NhcDetailsActivity.NhcData.DISCUSSION_DETAILS && weatheralert.isTropicalDiscussion()))
            {
                Object obj1 = iterable;
                if (iterable == null)
                {
                    obj1 = iterable;
                    if (weatheralert.getLanguage().equals(LocaleUtil.getTwoPartLocale(Locale.US)))
                    {
                        obj1 = weatheralert;
                    }
                }
                iterable = ((Iterable) (obj1));
                if (LocaleUtil.getStrings(weatheralert.getLanguage())[0].equals(LocaleUtil.getLocale().getLanguage()))
                {
                    return weatheralert;
                }
            }
        }
        return iterable;
    }

    public void refresh(boolean flag, Receiver receiver, Object obj)
    {
        alertMemCache.asyncFetch(KEY, flag, receiver, obj);
    }

}
