// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            SmoothRateLimiter

static final class warmupPeriodMicros extends SmoothRateLimiter
{

    private double halfPermits;
    private double slope;
    private final long warmupPeriodMicros;

    private double permitsToTime(double d)
    {
        return stableIntervalMicros + slope * d;
    }

    void doSetRate(double d, double d1)
    {
        d = maxPermits;
        maxPermits = (double)warmupPeriodMicros / d1;
        halfPermits = maxPermits / 2D;
        slope = (d1 * 3D - d1) / halfPermits;
        if (d == (1.0D / 0.0D))
        {
            storedPermits = 0.0D;
            return;
        }
        if (d == 0.0D)
        {
            d = maxPermits;
        } else
        {
            d = (storedPermits * maxPermits) / d;
        }
        storedPermits = d;
    }

    long storedPermitsToWaitTime(double d, double d1)
    {
        double d2 = d - halfPermits;
        long l = 0L;
        d = d1;
        if (d2 > 0.0D)
        {
            d = Math.min(d2, d1);
            l = (long)(((permitsToTime(d2) + permitsToTime(d2 - d)) * d) / 2D);
            d = d1 - d;
        }
        return (long)((double)l + stableIntervalMicros * d);
    }

    I(I i, long l, TimeUnit timeunit)
    {
        super(i, null);
        warmupPeriodMicros = timeunit.toMicros(l);
    }
}
