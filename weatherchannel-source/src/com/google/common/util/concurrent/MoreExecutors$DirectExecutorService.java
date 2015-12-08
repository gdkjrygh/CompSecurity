// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractListeningExecutorService, MoreExecutors

private static class <init> extends AbstractListeningExecutorService
{

    private final Lock lock;
    private int runningTasks;
    private boolean shutdown;
    private final Condition termination;

    private void endTask()
    {
        lock.lock();
        runningTasks = runningTasks - 1;
        if (isTerminated())
        {
            termination.signalAll();
        }
        lock.unlock();
        return;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    private void startTask()
    {
        lock.lock();
        if (isShutdown())
        {
            throw new RejectedExecutionException("Executor already shutdown");
        }
        break MISSING_BLOCK_LABEL_38;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
        runningTasks = runningTasks + 1;
        lock.unlock();
        return;
    }

    public boolean awaitTermination(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        l = timeunit.toNanos(l);
        lock.lock();
_L1:
        boolean flag = isTerminated();
        if (flag)
        {
            lock.unlock();
            return true;
        }
        if (l <= 0L)
        {
            lock.unlock();
            return false;
        }
        l = termination.awaitNanos(l);
          goto _L1
        timeunit;
        lock.unlock();
        throw timeunit;
    }

    public void execute(Runnable runnable)
    {
        startTask();
        runnable.run();
        endTask();
        return;
        runnable;
        endTask();
        throw runnable;
    }

    public boolean isShutdown()
    {
        lock.lock();
        boolean flag = shutdown;
        lock.unlock();
        return flag;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public boolean isTerminated()
    {
        lock.lock();
        if (!shutdown) goto _L2; else goto _L1
_L1:
        int i = runningTasks;
        if (i != 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        lock.unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public void shutdown()
    {
        lock.lock();
        shutdown = true;
        lock.unlock();
        return;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public List shutdownNow()
    {
        shutdown();
        return Collections.emptyList();
    }

    private ()
    {
        lock = new ReentrantLock();
        termination = lock.newCondition();
        runningTasks = 0;
        shutdown = false;
    }

    shutdown(shutdown shutdown1)
    {
        this();
    }
}
