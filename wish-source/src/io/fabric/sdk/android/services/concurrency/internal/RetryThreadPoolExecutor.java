// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            RetryFuture, RetryState, Backoff, RetryPolicy

public class RetryThreadPoolExecutor extends ScheduledThreadPoolExecutor
{

    private final Backoff backoff;
    private final RetryPolicy retryPolicy;

    public RetryThreadPoolExecutor(int i, RetryPolicy retrypolicy, Backoff backoff1)
    {
        this(i, Executors.defaultThreadFactory(), retrypolicy, backoff1);
    }

    public RetryThreadPoolExecutor(int i, ThreadFactory threadfactory, RetryPolicy retrypolicy, Backoff backoff1)
    {
        super(i, threadfactory);
        if (retrypolicy == null)
        {
            throw new NullPointerException("retry policy must not be null");
        }
        if (backoff1 == null)
        {
            throw new NullPointerException("backoff must not be null");
        } else
        {
            retryPolicy = retrypolicy;
            backoff = backoff1;
            return;
        }
    }

    private Future scheduleWithRetryInternal(Callable callable)
    {
        if (callable == null)
        {
            throw new NullPointerException();
        } else
        {
            callable = new RetryFuture(callable, new RetryState(backoff, retryPolicy), this);
            execute(callable);
            return callable;
        }
    }

    public Backoff getBackoff()
    {
        return backoff;
    }

    public RetryPolicy getRetryPolicy()
    {
        return retryPolicy;
    }

    public Future scheduleWithRetry(Runnable runnable)
    {
        return scheduleWithRetryInternal(Executors.callable(runnable));
    }

    public Future scheduleWithRetry(Runnable runnable, Object obj)
    {
        return scheduleWithRetryInternal(Executors.callable(runnable, obj));
    }

    public Future scheduleWithRetry(Callable callable)
    {
        return scheduleWithRetryInternal(callable);
    }
}
