// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class ThreadFactoryBuilder
{

    private ThreadFactory backingThreadFactory;
    private Boolean daemon;
    private String nameFormat;
    private Integer priority;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    public ThreadFactoryBuilder()
    {
        nameFormat = null;
        daemon = null;
        priority = null;
        uncaughtExceptionHandler = null;
        backingThreadFactory = null;
    }

    private static ThreadFactory build(ThreadFactoryBuilder threadfactorybuilder)
    {
        String s = threadfactorybuilder.nameFormat;
        Boolean boolean1 = threadfactorybuilder.daemon;
        Integer integer = threadfactorybuilder.priority;
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = threadfactorybuilder.uncaughtExceptionHandler;
        AtomicLong atomiclong;
        if (threadfactorybuilder.backingThreadFactory != null)
        {
            threadfactorybuilder = threadfactorybuilder.backingThreadFactory;
        } else
        {
            threadfactorybuilder = Executors.defaultThreadFactory();
        }
        if (s != null)
        {
            atomiclong = new AtomicLong(0L);
        } else
        {
            atomiclong = null;
        }
        return new ThreadFactory(threadfactorybuilder, s, atomiclong, boolean1, integer, uncaughtexceptionhandler) {

            final ThreadFactory val$backingThreadFactory;
            final AtomicLong val$count;
            final Boolean val$daemon;
            final String val$nameFormat;
            final Integer val$priority;
            final Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler;

            public Thread newThread(Runnable runnable)
            {
                runnable = backingThreadFactory.newThread(runnable);
                if (nameFormat != null)
                {
                    runnable.setName(String.format(nameFormat, new Object[] {
                        Long.valueOf(count.getAndIncrement())
                    }));
                }
                if (daemon != null)
                {
                    runnable.setDaemon(daemon.booleanValue());
                }
                if (priority != null)
                {
                    runnable.setPriority(priority.intValue());
                }
                if (uncaughtExceptionHandler != null)
                {
                    runnable.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return runnable;
            }

            
            {
                backingThreadFactory = threadfactory;
                nameFormat = s;
                count = atomiclong;
                daemon = boolean1;
                priority = integer;
                uncaughtExceptionHandler = uncaughtexceptionhandler;
                super();
            }
        };
    }

    public ThreadFactory build()
    {
        return build(this);
    }

    public ThreadFactoryBuilder setDaemon(boolean flag)
    {
        daemon = Boolean.valueOf(flag);
        return this;
    }

    public ThreadFactoryBuilder setNameFormat(String s)
    {
        String.format(s, new Object[] {
            Integer.valueOf(0)
        });
        nameFormat = s;
        return this;
    }

    public ThreadFactoryBuilder setPriority(int i)
    {
        boolean flag;
        if (i >= 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Thread priority (%s) must be >= %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(1)
        });
        if (i <= 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Thread priority (%s) must be <= %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(10)
        });
        priority = Integer.valueOf(i);
        return this;
    }

    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadfactory)
    {
        backingThreadFactory = (ThreadFactory)Preconditions.checkNotNull(threadfactory);
        return this;
    }

    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)Preconditions.checkNotNull(uncaughtexceptionhandler);
        return this;
    }
}
