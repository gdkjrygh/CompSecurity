// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import com.google.common.base.Ticker;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.net.Receiver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;

public class PastPollenDataFetcher
{

    private static final int EXPIRATION_IN_MINUTES = 5;
    public static final String KEY = "PastPollen";
    private static final long MILLI_SECONDS_IN_A_DAY = 0x5265c00L;
    private static final int RECORDS_TO_BE_REQUESTED = 1;
    private static final String TAG = "PastPollenDataFetcher";
    private static final PastPollenDataFetcher instance = new PastPollenDataFetcher();
    private final MemCache pastPollenCache = new MemCache(new PastPollenCacheLoader(ConfigurationManagers.getInstance()), 1, 5, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy), Ticker.systemTicker());

    private PastPollenDataFetcher()
    {
    /* block-local class not found */
    class PastPollenCacheLoader {}

    }

    public static PastPollenDataFetcher getInstance()
    {
        return instance;
    }

    public static String getYesterdayDateStringInyyyyMMddFormat()
    {
        Date date = new Date(System.currentTimeMillis() - 0x5265c00L);
        return (new SimpleDateFormat("yyyyMMdd", Locale.US)).format(date);
    }

    public void refresh(boolean flag, Receiver receiver, Object obj)
    {
        pastPollenCache.asyncFetch("PastPollen", flag, receiver, obj);
    }

}
