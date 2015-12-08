// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import io.fabric.sdk.android.services.concurrency.internal.RetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            BackgroundPriorityRunnable

public final class ExecutorUtils
{

    private static final long DEFAULT_TERMINATION_TIMEOUT = 2L;

    private ExecutorUtils()
    {
    }

    private static final void addDelayedShutdownHook(String s, ExecutorService executorservice)
    {
        addDelayedShutdownHook(s, executorservice, 2L, TimeUnit.SECONDS);
    }

    public static final void addDelayedShutdownHook(String s, ExecutorService executorservice, long l, TimeUnit timeunit)
    {
        Runtime.getRuntime().addShutdownHook(new Thread(new BackgroundPriorityRunnable(s, executorservice, l, timeunit) {

            final ExecutorService val$service;
            final String val$serviceName;
            final long val$terminationTimeout;
            final TimeUnit val$timeUnit;

            public void onRun()
            {
                try
                {
                    Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Executing shutdown hook for ").append(serviceName).toString());
                    service.shutdown();
                    if (!service.awaitTermination(terminationTimeout, timeUnit))
                    {
                        Fabric.getLogger().d("Fabric", (new StringBuilder()).append(serviceName).append(" did not shut down in the").append(" allocated time. Requesting immediate shutdown.").toString());
                        service.shutdownNow();
                    }
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    Fabric.getLogger().d("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
                        serviceName
                    }));
                }
                service.shutdownNow();
            }

            
            {
                serviceName = s;
                service = executorservice;
                terminationTimeout = l;
                timeUnit = timeunit;
                super();
            }
        }, (new StringBuilder()).append("Crashlytics Shutdown Hook for ").append(s).toString()));
    }

    public static RetryThreadPoolExecutor buildRetryThreadPoolExecutor(String s, int i, RetryPolicy retrypolicy, Backoff backoff)
    {
        retrypolicy = new RetryThreadPoolExecutor(i, getNamedThreadFactory(s), retrypolicy, backoff);
        addDelayedShutdownHook(s, retrypolicy);
        return retrypolicy;
    }

    public static ExecutorService buildSingleThreadExecutorService(String s)
    {
        ExecutorService executorservice = Executors.newSingleThreadExecutor(getNamedThreadFactory(s));
        addDelayedShutdownHook(s, executorservice);
        return executorservice;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String s)
    {
        ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(s));
        addDelayedShutdownHook(s, scheduledexecutorservice);
        return scheduledexecutorservice;
    }

    public static final ThreadFactory getNamedThreadFactory(String s)
    {
        return new ThreadFactory(s, new AtomicLong(1L)) {

            final AtomicLong val$count;
            final String val$threadNameTemplate;

            public Thread newThread(Runnable runnable)
            {
                runnable = Executors.defaultThreadFactory().newThread(runnable. new BackgroundPriorityRunnable() {

                    final _cls1 this$0;
                    final Runnable val$runnable;

                    public void onRun()
                    {
                        runnable.run();
                    }

            
            {
                this$0 = final__pcls1;
                runnable = Runnable.this;
                super();
            }
                });
                runnable.setName((new StringBuilder()).append(threadNameTemplate).append(count.getAndIncrement()).toString());
                return runnable;
            }

            
            {
                threadNameTemplate = s;
                count = atomiclong;
                super();
            }
        };
    }
}
