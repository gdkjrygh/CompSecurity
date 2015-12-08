// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            Uninterruptibles

public abstract class RateLimiter
{
    static abstract class SleepingStopwatch
    {

        static final SleepingStopwatch createFromSystemTimer()
        {
            return new SleepingStopwatch() {

                final Stopwatch stopwatch = Stopwatch.createStarted();

                long readMicros()
                {
                    return stopwatch.elapsed(TimeUnit.MICROSECONDS);
                }

                void sleepMicrosUninterruptibly(long l)
                {
                    if (l > 0L)
                    {
                        Uninterruptibles.sleepUninterruptibly(l, TimeUnit.MICROSECONDS);
                    }
                }

            };
        }

        abstract long readMicros();

        abstract void sleepMicrosUninterruptibly(long l);

        SleepingStopwatch()
        {
        }
    }


    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    RateLimiter(SleepingStopwatch sleepingstopwatch)
    {
        stopwatch = (SleepingStopwatch)Preconditions.checkNotNull(sleepingstopwatch);
    }

    private boolean canAcquire(long l, long l1)
    {
        return queryEarliestAvailable(l) - l1 <= l;
    }

    private static int checkPermits(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Requested permits (%s) must be positive", new Object[] {
            Integer.valueOf(i)
        });
        return i;
    }

    public static RateLimiter create(double d)
    {
        return create(SleepingStopwatch.createFromSystemTimer(), d);
    }

    public static RateLimiter create(double d, long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "warmupPeriod must not be negative: %s", new Object[] {
            Long.valueOf(l)
        });
        return create(SleepingStopwatch.createFromSystemTimer(), d, l, timeunit);
    }

    static RateLimiter create(SleepingStopwatch sleepingstopwatch, double d)
    {
        sleepingstopwatch = new SmoothRateLimiter.SmoothBursty(sleepingstopwatch, 1.0D);
        sleepingstopwatch.setRate(d);
        return sleepingstopwatch;
    }

    static RateLimiter create(SleepingStopwatch sleepingstopwatch, double d, long l, TimeUnit timeunit)
    {
        sleepingstopwatch = new SmoothRateLimiter.SmoothWarmingUp(sleepingstopwatch, l, timeunit);
        sleepingstopwatch.setRate(d);
        return sleepingstopwatch;
    }

    private Object mutex()
    {
        Object obj = mutexDoNotUseDirectly;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        Object obj1 = mutexDoNotUseDirectly;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = new Object();
        mutexDoNotUseDirectly = obj;
        this;
        JVM INSTR monitorexit ;
        return obj;
_L4:
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
_L2:
        return obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public double acquire()
    {
        return acquire(1);
    }

    public double acquire(int i)
    {
        long l = reserve(i);
        stopwatch.sleepMicrosUninterruptibly(l);
        return (1.0D * (double)l) / (double)TimeUnit.SECONDS.toMicros(1L);
    }

    abstract double doGetRate();

    abstract void doSetRate(double d, long l);

    public final double getRate()
    {
        double d;
        synchronized (mutex())
        {
            d = doGetRate();
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract long queryEarliestAvailable(long l);

    final long reserve(int i)
    {
        checkPermits(i);
        long l;
        synchronized (mutex())
        {
            l = reserveAndGetWaitLength(i, stopwatch.readMicros());
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final long reserveAndGetWaitLength(int i, long l)
    {
        return Math.max(reserveEarliestAvailable(i, l) - l, 0L);
    }

    abstract long reserveEarliestAvailable(int i, long l);

    public final void setRate(double d)
    {
        boolean flag;
        if (d > 0.0D && !Double.isNaN(d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "rate must be positive");
        synchronized (mutex())
        {
            doSetRate(d, stopwatch.readMicros());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return String.format("RateLimiter[stableRate=%3.1fqps]", new Object[] {
            Double.valueOf(getRate())
        });
    }

    public boolean tryAcquire()
    {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i)
    {
        return tryAcquire(i, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, long l, TimeUnit timeunit)
    {
        long l1;
label0:
        {
            l = Math.max(timeunit.toMicros(l), 0L);
            checkPermits(i);
            synchronized (mutex())
            {
                l1 = stopwatch.readMicros();
                if (canAcquire(l1, l))
                {
                    break label0;
                }
            }
            return false;
        }
        l = reserveAndGetWaitLength(i, l1);
        timeunit;
        JVM INSTR monitorexit ;
        stopwatch.sleepMicrosUninterruptibly(l);
        return true;
        exception;
        timeunit;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean tryAcquire(long l, TimeUnit timeunit)
    {
        return tryAcquire(1, l, timeunit);
    }
}
