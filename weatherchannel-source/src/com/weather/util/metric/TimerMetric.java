// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import com.weather.util.time.TimeProviderTicker;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.util.metric:
//            BaseMetric, Metric

public class TimerMetric extends BaseMetric
    implements Comparable
{

    private Date initialStartTime;
    final Object lock;
    private final TimeUnit precision;
    private final Stopwatch stopwatch;
    private final TimeProvider timeProvider;

    public TimerMetric(String s, String s1)
    {
        this(s, s1, ((TimeProvider) (new SystemTimeProvider())), TimeUnit.MILLISECONDS);
    }

    public TimerMetric(String s, String s1, TimeProvider timeprovider, TimeUnit timeunit)
    {
        super(s, s1);
        lock = new Object();
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
        precision = (TimeUnit)Preconditions.checkNotNull(timeunit);
        stopwatch = Stopwatch.createUnstarted(new TimeProviderTicker(timeprovider));
    }

    public int compareTo(TimerMetric timermetric)
    {
        return getName().compareTo(timermetric.getName());
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TimerMetric)obj);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof TimerMetric))
        {
            return false;
        } else
        {
            return ((Metric)obj).getName().equals(getName());
        }
    }

    public long getElapsedTime()
    {
        long l;
        synchronized (lock)
        {
            l = stopwatch.elapsed(precision);
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Date getInitialStartTime()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (initialStartTime == null)
        {
            throw new IllegalStateException("start() must be called before calling getInitialStartTime()");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Date date = new Date(initialStartTime.getTime());
        obj;
        JVM INSTR monitorexit ;
        return date;
    }

    public boolean hasFinished()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (hasStarted() && !isRunning())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean hasStarted()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (initialStartTime != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int hashCode()
    {
        return getName().hashCode() + 527;
    }

    public boolean isRunning()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = stopwatch.isRunning();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public TimerMetric reset()
    {
        synchronized (lock)
        {
            stopwatch.reset();
            initialStartTime = null;
        }
        return this;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public TimerMetric start()
    {
        synchronized (lock)
        {
            if (!isRunning())
            {
                if (initialStartTime == null)
                {
                    initialStartTime = new Date(timeProvider.currentTimeMillis());
                }
                stopwatch.start();
            }
        }
        return this;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public TimerMetric stop()
    {
        synchronized (lock)
        {
            if (isRunning())
            {
                stopwatch.stop();
            }
        }
        return this;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
