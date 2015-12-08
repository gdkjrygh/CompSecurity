// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            RateLimiter, Uninterruptibles

static final class  extends 
{

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

    ()
    {
    }
}
