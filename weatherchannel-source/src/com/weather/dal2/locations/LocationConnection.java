// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.weather.dal2.TwcDataServer;
import com.weather.dal2.cache.ObjectBuilder;
import com.weather.dal2.fileconnections.FileBackedConnectionCache;
import com.weather.dal2.fileconnections.FileBackedConnectionCacheBuilder;
import com.weather.dal2.net.Receiver;
import com.weather.util.device.LocaleUtil;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.locations:
//            SavedLocation

public final class LocationConnection
{

    private static final ObjectBuilder BUILDER = new _cls1();
    private static final int FILE_CACHE_EXPIRATION_IN_MINUTES;
    private static final String FILE_CACHE_ID = "LOCATION";
    private static final int FILE_CACHE_MAX_SIZE = 40;
    private static final LocationConnection INSTANCE = new LocationConnection();
    private static final String KEY_TYPE_URL = (new StringBuilder()).append(TwcDataServer.getDsxDataUrl()).append("/wxd/v%d/loc/%s/%s?api=%s").toString();
    private static final String LAT_LONG_URL = (new StringBuilder()).append(TwcDataServer.getDsxDataUrl()).append("/wxd/v%d/loc/%s/%.2f,%.2f?api=%s").toString();
    public static final int OBJ_CACHE_EXPIRATION_HOURS = 12;
    private static final int OBJ_CACHE_EXPIRATION_IN_MINUTES;
    private static final int OBJ_CACHE_MAX_SIZE = 12;
    private static final int VER = 2;
    private final FileBackedConnectionCache doubleCache;

    private LocationConnection()
    {
        doubleCache = (new FileBackedConnectionCacheBuilder()).objCache(12, OBJ_CACHE_EXPIRATION_IN_MINUTES).fileCache(40, FILE_CACHE_EXPIRATION_IN_MINUTES, "LOCATION").objectBuilder(BUILDER).build();
    }

    public static LocationConnection getInstance()
    {
        return INSTANCE;
    }

    public void asyncFetch(double d, double d1, Receiver receiver, Object obj, boolean flag)
    {
        String s = String.format(Locale.ENGLISH, LAT_LONG_URL, new Object[] {
            Integer.valueOf(2), LocaleUtil.getLocale(), Double.valueOf(d), Double.valueOf(d1), TwcDataServer.getApiKey()
        });
    /* block-local class not found */
    class LatLongReceiver {}

        receiver = new LatLongReceiver(receiver, d, d1);
        doubleCache.asyncFetch(s, flag, receiver, obj);
    }

    public void asyncFetch(String s, Receiver receiver, Object obj, boolean flag)
    {
        s = String.format(Locale.ENGLISH, KEY_TYPE_URL, new Object[] {
            Integer.valueOf(2), LocaleUtil.getLocale(), s, TwcDataServer.getApiKey()
        });
        doubleCache.asyncFetch(s, flag, receiver, obj);
    }

    public SavedLocation fetch(double d, double d1, boolean flag)
        throws Exception
    {
        Object obj = String.format(Locale.ENGLISH, LAT_LONG_URL, new Object[] {
            Integer.valueOf(2), LocaleUtil.getLocale(), Double.valueOf(d), Double.valueOf(d1), TwcDataServer.getApiKey()
        });
        obj = (SavedLocation)doubleCache.fetch(((String) (obj)), flag);
        ((SavedLocation) (obj)).setLatLong(d, d1);
        return ((SavedLocation) (obj));
    }

    public SavedLocation fetch(String s, boolean flag)
        throws Exception
    {
        s = String.format(Locale.ENGLISH, KEY_TYPE_URL, new Object[] {
            Integer.valueOf(2), LocaleUtil.getLocale(), s, TwcDataServer.getApiKey()
        });
        return (SavedLocation)doubleCache.fetch(s, flag);
    }

    static 
    {
        OBJ_CACHE_EXPIRATION_IN_MINUTES = (int)TimeUnit.HOURS.toMinutes(12L);
        FILE_CACHE_EXPIRATION_IN_MINUTES = (int)TimeUnit.DAYS.toMinutes(1L);
    }

    /* member class not found */
    class _cls1 {}

}
