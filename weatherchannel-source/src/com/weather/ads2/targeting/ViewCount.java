// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.weather.util.date.DateUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewCount
{
    public static class CountInfo
    {

        private static final AtomicInteger ID_COUNTER = new AtomicInteger();
        public final long count;
        public final int countId;


        public CountInfo(long l)
        {
            count = l;
            countId = ID_COUNTER.incrementAndGet();
        }
    }

    static final class PrefsKeys extends Enum
    {

        private static final PrefsKeys $VALUES[];
        public static final PrefsKeys LAST_SAVED_MS;
        public static final PrefsKeys VIEW_COUNT;

        public static PrefsKeys valueOf(String s)
        {
            return (PrefsKeys)Enum.valueOf(com/weather/ads2/targeting/ViewCount$PrefsKeys, s);
        }

        public static PrefsKeys[] values()
        {
            return (PrefsKeys[])$VALUES.clone();
        }

        static 
        {
            VIEW_COUNT = new PrefsKeys("VIEW_COUNT", 0);
            LAST_SAVED_MS = new PrefsKeys("LAST_SAVED_MS", 1);
            $VALUES = (new PrefsKeys[] {
                VIEW_COUNT, LAST_SAVED_MS
            });
        }

        private PrefsKeys(String s, int i)
        {
            super(s, i);
        }
    }


    public static final ViewCount INSTANCE = new ViewCount(SystemTimeProvider.getInstance(), new Prefs("VIEW_COUNT_PREFS"));
    private static final String PREFS_FILE_NAME = "VIEW_COUNT_PREFS";
    private CountInfo countInfo;
    private long lastSaveTimeMs;
    private final Object lock = new Object();
    private final Prefs prefs;
    private final TimeProvider timeProvider;

    ViewCount(TimeProvider timeprovider, Prefs prefs1)
    {
        timeProvider = timeprovider;
        prefs = prefs1;
        lastSaveTimeMs = prefs1.getLong(PrefsKeys.LAST_SAVED_MS, 0L);
        countInfo = new CountInfo(prefs1.getLong(PrefsKeys.VIEW_COUNT, 0L));
    }

    private void updateCount(long l, boolean flag)
    {
        lastSaveTimeMs = timeProvider.currentTimeMillis();
        countInfo = new CountInfo(l);
        if (flag)
        {
            prefs.putLong(PrefsKeys.LAST_SAVED_MS, lastSaveTimeMs);
            prefs.putLong(PrefsKeys.VIEW_COUNT, l);
        }
    }

    public CountInfo getCount()
    {
        CountInfo countinfo;
        synchronized (lock)
        {
            if (!DateUtil.isSameDay(TimeZone.getDefault(), lastSaveTimeMs, timeProvider.currentTimeMillis()))
            {
                updateCount(0L, false);
            }
            countinfo = countInfo;
        }
        return countinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void incrementCount(int i)
    {
        long l = 1L;
        synchronized (lock)
        {
            if (i == countInfo.countId)
            {
                if (DateUtil.isSameDay(TimeZone.getDefault(), lastSaveTimeMs, timeProvider.currentTimeMillis()))
                {
                    l = 1L + countInfo.count;
                }
                updateCount(l, true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
