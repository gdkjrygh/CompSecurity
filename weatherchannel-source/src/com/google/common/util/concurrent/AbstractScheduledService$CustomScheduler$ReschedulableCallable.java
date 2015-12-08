// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingFuture, AbstractScheduledService, AbstractService

private class service extends ForwardingFuture
    implements Callable
{

    private Future currentFuture;
    private final ScheduledExecutorService executor;
    private final ReentrantLock lock = new ReentrantLock();
    private final AbstractService service;
    final lock this$0;
    private final Runnable wrappedRunnable;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        wrappedRunnable.run();
        reschedule();
        return null;
    }

    public boolean cancel(boolean flag)
    {
        lock.lock();
        flag = currentFuture.cancel(flag);
        lock.unlock();
        return flag;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Future _mthdelegate()
    {
        throw new UnsupportedOperationException("Only cancel is supported by this future");
    }

    public void reschedule()
    {
        lock.lock();
        if (currentFuture == null || !currentFuture.isCancelled())
        {
            delegate delegate1 = currentFuture.this.currentFuture();
            currentFuture = executor.schedule(this, executor(delegate1), executor(delegate1));
        }
        lock.unlock();
        return;
        Object obj;
        obj;
        service.notifyFailed(((Throwable) (obj)));
        lock.unlock();
        return;
        obj;
        lock.unlock();
        throw obj;
    }

    (AbstractService abstractservice, ScheduledExecutorService scheduledexecutorservice, Runnable runnable)
    {
        this$0 = this._cls0.this;
        super();
        wrappedRunnable = runnable;
        executor = scheduledexecutorservice;
        service = abstractservice;
    }
}
