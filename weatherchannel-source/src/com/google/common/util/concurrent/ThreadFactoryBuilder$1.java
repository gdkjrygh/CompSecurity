// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.common.util.concurrent:
//            ThreadFactoryBuilder

static final class val.uncaughtExceptionHandler
    implements ThreadFactory
{

    final ThreadFactory val$backingThreadFactory;
    final AtomicLong val$count;
    final Boolean val$daemon;
    final String val$nameFormat;
    final Integer val$priority;
    final nHandler val$uncaughtExceptionHandler;

    public Thread newThread(Runnable runnable)
    {
        runnable = val$backingThreadFactory.newThread(runnable);
        if (val$nameFormat != null)
        {
            runnable.setName(String.format(val$nameFormat, new Object[] {
                Long.valueOf(val$count.getAndIncrement())
            }));
        }
        if (val$daemon != null)
        {
            runnable.setDaemon(val$daemon.booleanValue());
        }
        if (val$priority != null)
        {
            runnable.setPriority(val$priority.intValue());
        }
        if (val$uncaughtExceptionHandler != null)
        {
            runnable.setUncaughtExceptionHandler(val$uncaughtExceptionHandler);
        }
        return runnable;
    }

    (ThreadFactory threadfactory, String s, AtomicLong atomiclong, Boolean boolean1, Integer integer, nHandler nhandler)
    {
        val$backingThreadFactory = threadfactory;
        val$nameFormat = s;
        val$count = atomiclong;
        val$daemon = boolean1;
        val$priority = integer;
        val$uncaughtExceptionHandler = nhandler;
        super();
    }
}
