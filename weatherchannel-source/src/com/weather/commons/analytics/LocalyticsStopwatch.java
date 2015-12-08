// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.google.common.base.Ticker;
import java.util.concurrent.TimeUnit;

public class LocalyticsStopwatch
{

    private final Object lock;
    private final TimeUnit precision;
    private final Stopwatch stopwatch;
    private final Function stringConvert;

    private LocalyticsStopwatch(TimeUnit timeunit, Function function, Ticker ticker)
    {
        lock = new Object();
        precision = (TimeUnit)Preconditions.checkNotNull(timeunit);
        stringConvert = (Function)Preconditions.checkNotNull(function);
        synchronized (lock)
        {
            stopwatch = Stopwatch.createUnstarted(ticker);
        }
        return;
        function;
        timeunit;
        JVM INSTR monitorexit ;
        throw function;
    }

    public static LocalyticsStopwatch newStopwatchForMinuteBucket(Ticker ticker)
    {
        return new LocalyticsStopwatch(TimeUnit.MINUTES, LocalyticsBuckets.TimeSpentInMinutes.getMinutesToStringConverter(), ticker);
    }

    public static LocalyticsStopwatch newStopwatchForSecondBucket(Ticker ticker)
    {
        return new LocalyticsStopwatch(TimeUnit.SECONDS, LocalyticsBuckets.TimeSpentInSeconds.getSecondsToStringConverter(), ticker);
    }

    public String getAttributeValue()
    {
        String s;
        synchronized (lock)
        {
            s = Strings.nullToEmpty((String)stringConvert.apply(Long.valueOf(stopwatch.elapsed(precision))));
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void pause()
    {
        synchronized (lock)
        {
            if (stopwatch.isRunning())
            {
                stopwatch.stop();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (lock)
        {
            if (!stopwatch.isRunning())
            {
                stopwatch.start();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void start()
    {
        synchronized (lock)
        {
            stopwatch.reset();
            stopwatch.start();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
