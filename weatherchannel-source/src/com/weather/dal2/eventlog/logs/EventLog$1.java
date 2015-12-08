// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.weather.dal2.eventlog.logs:
//            EventLog

static final class val.latch
    implements Runnable
{

    final CountDownLatch val$latch;

    public void run()
    {
        val$latch.countDown();
    }

    (CountDownLatch countdownlatch)
    {
        val$latch = countdownlatch;
        super();
    }
}
