// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.weather.Weather.app:
//            FlagshipApplication

static final class 
    implements ThreadFactory
{

    private final AtomicInteger threadCount = new AtomicInteger();

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, (new StringBuilder()).append("ConfigUpdate-").append(threadCount.incrementAndGet()).toString());
        runnable.setDaemon(true);
        return runnable;
    }

    ()
    {
    }
}
