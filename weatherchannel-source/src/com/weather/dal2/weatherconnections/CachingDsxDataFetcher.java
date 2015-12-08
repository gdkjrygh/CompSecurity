// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.weatherconnections;

import com.google.common.cache.Cache;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.cache.LanguageDependentCaches;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.cache.NonLoadingDiskCache;
import com.weather.dal2.dsx.DsxRecordEnum;
import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.EnumSet;
import java.util.Locale;

// Referenced classes of package com.weather.dal2.weatherconnections:
//            AbstractCachingDataFetcher

public class CachingDsxDataFetcher extends AbstractCachingDataFetcher
{

    private static final String CACHE_ID = "STALE_WEATHER_DATA";
    private static final String TAG = "CachingDsxDataFetcher";
    private static final CachingDsxDataFetcher instance = new CachingDsxDataFetcher();
    private final NonLoadingDiskCache diskCache;
    private final MemCache memCache = new MemCache(new MemCacheLoader(null), 20, 5, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy), null);

    private CachingDsxDataFetcher()
    {
    /* block-local class not found */
    class MemCacheLoader {}

        NonLoadingDiskCache nonloadingdiskcache;
        try
        {
            nonloadingdiskcache = NonLoadingDiskCache.open(20, 240, "STALE_WEATHER_DATA");
        }
        catch (Exception exception)
        {
            EventLog.w("CachingDsxDataFetcher", (new StringBuilder()).append("Couldn't open tolerably stale cache: ").append(exception).toString());
            exception = null;
        }
        diskCache = nonloadingdiskcache;
        LanguageDependentCaches.getInstance().add(memCache.getLoadingCache());
    }

    public static String buildUrl(String s)
    {
        String s1 = LocaleUtil.getLocale().toString();
        return (new StringBuilder()).append(TwcDataServer.getDsxDataUrl()).append(DsxRecordEnum.getPathWithLocaleAndKeyTypeCountry(s1, s)).toString();
    }

    public static CachingDsxDataFetcher getInstance()
    {
        return instance;
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

    void request(SavedLocation savedlocation, boolean flag)
    {
    /* block-local class not found */
    class KeyType {}

        KeyType keytype = new KeyType(savedlocation, flag, null);
        RecordSets recordsets;
        boolean flag1;
        if (flag)
        {
            recordsets = null;
        } else
        {
            recordsets = (RecordSets)memCache.getLoadingCache().getIfPresent(keytype);
        }
        if (recordsets != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            DataAccessLayer.BUS.post(RecordSets.create(recordsets, com.weather.dal2.dsx.RecordSets.RecordSetsSource.MEM_CACHE));
            return;
        } else
        {
            LogUtil.method("CachingDsxDataFetcher", LoggingMetaTags.TWC_DAL_WXD, "request", new Object[] {
                savedlocation, Boolean.valueOf(flag)
            });
    /* block-local class not found */
    class WeatherDataReceiver {}

            memCache.asyncFetch(keytype, flag, new WeatherDataReceiver(savedlocation, flag), null);
            return;
        }
    }



    // Unreferenced inner class com/weather/dal2/weatherconnections/CachingDsxDataFetcher$WeatherDataException
    /* block-local class not found */
    class WeatherDataException {}

}
