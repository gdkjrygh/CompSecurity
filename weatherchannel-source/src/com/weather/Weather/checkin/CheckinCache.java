// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.weather.dal2.checkin.Checkin;
import com.weather.dal2.checkin.CheckinFactory;
import com.weather.dal2.checkin.CheckinFetcher;
import com.weather.dal2.checkin.CheckinRequester;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.geometry.LatLng;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.time.TimeProvider;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinClusterItem, CheckinPrefs

public class CheckinCache
{
    public static class CheckinClusterItemFactory
        implements CheckinFactory
    {

        public CheckinClusterItem create(double d, double d1, byte byte0, String s)
        {
            boolean flag;
            if (s != null && s.equals(CheckinCache.myLastCheckinId.get()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return new CheckinClusterItem(d, d1, byte0, flag);
        }

        public volatile Checkin create(double d, double d1, byte byte0, String s)
        {
            return create(d, d1, byte0, s);
        }

        public CheckinClusterItemFactory()
        {
        }
    }


    public static final int CHECKIN_LIFE_MINUTES = 5;
    public static final CheckinFetcher NEAR_ME_CACHE;
    private static final String TAG = "CheckinCache";
    private static final Cache myCheckins;
    private static final AtomicReference myLastCheckinId = new AtomicReference();
    private static final AtomicLong myLastCheckinTime = new AtomicLong(0L);

    private CheckinCache()
    {
    }

    public static CheckinClusterItem checkMeIn(double d, double d1, byte byte0, String s, TimeProvider timeprovider)
    {
        CheckinClusterItem checkinclusteritem = new CheckinClusterItem(d, d1, byte0, true);
        setMyCheckinInfo(timeprovider.currentTimeMillis(), s, checkinclusteritem);
        myCheckins.put(s, checkinclusteritem);
        return checkinclusteritem;
    }

    static void clearMyCheckinInfo()
    {
        com/weather/Weather/checkin/CheckinCache;
        JVM INSTR monitorenter ;
        CheckinPrefs.getInstance().clear();
        myCheckins.invalidateAll();
        myLastCheckinId.set(null);
        myLastCheckinTime.set(0L);
        com/weather/Weather/checkin/CheckinCache;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static long getLocalCheckinExpirationTime()
    {
        return (getMyCheckinTime() + TimeUnit.MINUTES.toMillis(5L)) - 1L;
    }

    public static CheckinClusterItem getMyCheckin(TimeProvider timeprovider)
    {
        String s = (String)myLastCheckinId.get();
        long l;
        if (s != null)
        {
            if (timeprovider.currentTimeMillis() <= (l = getLocalCheckinExpirationTime()))
            {
                return (CheckinClusterItem)myCheckins.getIfPresent(s);
            }
        }
        return null;
    }

    public static long getMyCheckinTime()
    {
        return myLastCheckinTime.get();
    }

    private static void setMyCheckinInfo(long l, String s, CheckinClusterItem checkinclusteritem)
    {
        com/weather/Weather/checkin/CheckinCache;
        JVM INSTR monitorenter ;
        Prefs prefs = CheckinPrefs.getInstance();
        prefs.putLong(CheckinPrefs.Keys.LAST_CHECKIN_TIME, l);
        prefs.putString(CheckinPrefs.Keys.LAST_CHECKIN_ID, s);
        prefs.putDouble(CheckinPrefs.Keys.LAST_CHECKIN_LAT, checkinclusteritem.getLatitude());
        prefs.putDouble(CheckinPrefs.Keys.LAST_CHECKIN_LONG, checkinclusteritem.getLongitude());
        prefs.putInt(CheckinPrefs.Keys.LAST_CHECKIN_CODE, checkinclusteritem.getUserIconCode());
        updateMyCheckinInfoFromDisk();
        com/weather/Weather/checkin/CheckinCache;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private static void updateMyCheckinInfoFromDisk()
    {
        com/weather/Weather/checkin/CheckinCache;
        JVM INSTR monitorenter ;
        double d;
        double d1;
        String s;
        int i;
        long l;
        Prefs prefs = CheckinPrefs.getInstance();
        l = prefs.getLong(CheckinPrefs.Keys.LAST_CHECKIN_TIME, 0L);
        s = prefs.getString(CheckinPrefs.Keys.LAST_CHECKIN_ID, "");
        d = prefs.getDouble(CheckinPrefs.Keys.LAST_CHECKIN_LAT, (0.0D / 0.0D));
        d1 = prefs.getDouble(CheckinPrefs.Keys.LAST_CHECKIN_LONG, (0.0D / 0.0D));
        i = prefs.getInt(CheckinPrefs.Keys.LAST_CHECKIN_CODE, -1);
        LogUtil.d("CheckinCache", LoggingMetaTags.TWC_SOCIAL, "time=%s, id=%s, lat=%s, lng=%s, code=%s", new Object[] {
            Long.valueOf(l), s, Double.valueOf(d), Double.valueOf(d1), Integer.valueOf(i)
        });
        if (l == 0L) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(s) || Double.isNaN(d) || Double.isNaN(d1) || i < 0) goto _L2; else goto _L3
_L3:
        if (LatLng.isValid(Double.valueOf(d), Double.valueOf(d1))) goto _L4; else goto _L2
_L2:
        LogUtil.d("CheckinCache", LoggingMetaTags.TWC_SOCIAL, "no valid last checkin found.", new Object[0]);
        myLastCheckinTime.set(0L);
        myLastCheckinId.set(null);
_L6:
        com/weather/Weather/checkin/CheckinCache;
        JVM INSTR monitorexit ;
        return;
_L4:
        myLastCheckinTime.set(l);
        myLastCheckinId.set(s);
        CheckinClusterItem checkinclusteritem = new CheckinClusterItem(d, d1, (byte)i, true);
        myCheckins.put(s, checkinclusteritem);
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        myCheckins = CacheBuilder.newBuilder().maximumSize(1L).expireAfterWrite(5L, TimeUnit.MINUTES).build();
        Resources resources = AbstractTwcApplication.getRootContext().getResources();
        NEAR_ME_CACHE = new CheckinFetcher(new CheckinRequester(new CheckinClusterItemFactory()), resources.getInteger(0x7f09000e), resources.getInteger(0x7f090010), resources.getInteger(0x7f09000f));
        updateMyCheckinInfoFromDisk();
    }

}
