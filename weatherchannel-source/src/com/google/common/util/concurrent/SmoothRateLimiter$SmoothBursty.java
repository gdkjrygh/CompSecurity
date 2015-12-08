// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            SmoothRateLimiter

static final class maxBurstSeconds extends SmoothRateLimiter
{

    final double maxBurstSeconds;

    void doSetRate(double d, double d1)
    {
        d1 = 0.0D;
        double d2 = maxPermits;
        maxPermits = maxBurstSeconds * d;
        if (d2 == (1.0D / 0.0D))
        {
            storedPermits = maxPermits;
            return;
        }
        if (d2 == 0.0D)
        {
            d = d1;
        } else
        {
            d = (storedPermits * maxPermits) / d2;
        }
        storedPermits = d;
    }

    long storedPermitsToWaitTime(double d, double d1)
    {
        return 0L;
    }

    ( , double d)
    {
        super(, null);
        maxBurstSeconds = d;
    }
}
