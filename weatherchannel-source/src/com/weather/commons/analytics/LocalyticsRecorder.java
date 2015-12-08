// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.weather.commons.analytics:
//            Recorder, LocalyticsStopwatch, Attribute

public class LocalyticsRecorder
    implements Recorder
{

    private static final String TAG = "LocalyticsRecorder";
    private final ConcurrentMap incrementableValuesMap;
    private final ConcurrentMap stopWatchMap;
    private final ConcurrentMap summaryMap;
    private final Ticker ticker;

    public LocalyticsRecorder()
    {
        this(Ticker.systemTicker());
    }

    protected LocalyticsRecorder(Ticker ticker1)
    {
        summaryMap = new ConcurrentHashMap();
        incrementableValuesMap = new ConcurrentHashMap();
        stopWatchMap = new ConcurrentHashMap();
        ticker = ticker1;
    }

    public void clearData()
    {
        summaryMap.clear();
        incrementableValuesMap.clear();
        stopWatchMap.clear();
    }

    public Map getAttributesMap()
    {
        HashMap hashmap = new HashMap(summaryMap);
        java.util.Map.Entry entry;
        for (Iterator iterator = incrementableValuesMap.entrySet().iterator(); iterator.hasNext(); hashmap.put(entry.getKey(), ((AtomicInteger)entry.getValue()).toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator1 = stopWatchMap.entrySet().iterator(); iterator1.hasNext(); hashmap.put(entry1.getKey(), ((LocalyticsStopwatch)entry1.getValue()).getAttributeValue()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        return hashmap;
    }

    public boolean hasAttributes()
    {
        return !summaryMap.isEmpty() || !incrementableValuesMap.isEmpty() || !stopWatchMap.isEmpty();
    }

    public void incrementValue(Attribute attribute)
    {
        Preconditions.checkNotNull(attribute);
        AtomicInteger atomicinteger = new AtomicInteger();
        AtomicInteger atomicinteger1 = (AtomicInteger)incrementableValuesMap.putIfAbsent(attribute, atomicinteger);
        attribute = atomicinteger;
        if (atomicinteger1 != null)
        {
            attribute = atomicinteger1;
        }
        attribute.incrementAndGet();
    }

    public void initIncrementalValue(Attribute attribute)
    {
        incrementableValuesMap.putIfAbsent(attribute, new AtomicInteger());
    }

    public void pauseStopwatch(Attribute attribute)
    {
        attribute = (LocalyticsStopwatch)stopWatchMap.get(attribute);
        if (attribute != null)
        {
            attribute.pause();
        }
    }

    public void putValue(Attribute attribute, String s)
    {
        Preconditions.checkNotNull(attribute);
        Preconditions.checkNotNull(s);
        summaryMap.put(attribute, s);
    }

    public void putValueIfAbsent(Attribute attribute, String s)
    {
        Preconditions.checkNotNull(attribute);
        Preconditions.checkNotNull(s);
        if (summaryMap.putIfAbsent(attribute, s) != null)
        {
            LogUtil.d("LocalyticsRecorder", LoggingMetaTags.TWC_LOCALYTICS, (new StringBuilder()).append("given key ").append(attribute.getName()).append(" already exists, ignoring new value").toString(), new Object[0]);
        }
    }

    public void resumeStopwatch(Attribute attribute)
    {
        attribute = (LocalyticsStopwatch)stopWatchMap.get(attribute);
        if (attribute != null)
        {
            attribute.resume();
        }
    }

    public void startMinuteStopwatch(Attribute attribute)
    {
        LocalyticsStopwatch localyticsstopwatch = LocalyticsStopwatch.newStopwatchForMinuteBucket(ticker);
        localyticsstopwatch.start();
        stopWatchMap.put(attribute, localyticsstopwatch);
    }

    public void startSecondsStopwatch(Attribute attribute)
    {
        LocalyticsStopwatch localyticsstopwatch = LocalyticsStopwatch.newStopwatchForSecondBucket(ticker);
        localyticsstopwatch.start();
        stopWatchMap.put(attribute, localyticsstopwatch);
    }
}
