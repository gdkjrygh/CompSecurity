// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            AbstractFuture, RetryState, RetryPolicy, Backoff, 
//            RetryThreadPoolExecutor

class RetryFuture extends AbstractFuture
    implements Runnable
{

    private final RetryThreadPoolExecutor executor;
    RetryState retryState;
    private final AtomicReference runner = new AtomicReference();
    private final Callable task;

    RetryFuture(Callable callable, RetryState retrystate, RetryThreadPoolExecutor retrythreadpoolexecutor)
    {
        task = callable;
        retryState = retrystate;
        executor = retrythreadpoolexecutor;
    }

    private Backoff getBackoff()
    {
        return retryState.getBackoff();
    }

    private int getRetryCount()
    {
        return retryState.getRetryCount();
    }

    private RetryPolicy getRetryPolicy()
    {
        return retryState.getRetryPolicy();
    }

    protected void interruptTask()
    {
        Thread thread = (Thread)runner.getAndSet(null);
        if (thread != null)
        {
            thread.interrupt();
        }
    }

    public void run()
    {
        if (isDone() || !runner.compareAndSet(null, Thread.currentThread()))
        {
            return;
        }
        set(task.call());
        runner.getAndSet(null);
        return;
        Object obj;
        obj;
        if (!getRetryPolicy().shouldRetry(getRetryCount(), ((Throwable) (obj)))) goto _L2; else goto _L1
_L1:
        long l = getBackoff().getDelayMillis(getRetryCount());
        retryState = retryState.nextRetryState();
        executor.schedule(this, l, TimeUnit.MILLISECONDS);
_L4:
        runner.getAndSet(null);
        return;
_L2:
        setException(((Throwable) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        runner.getAndSet(null);
        throw obj;
    }
}
