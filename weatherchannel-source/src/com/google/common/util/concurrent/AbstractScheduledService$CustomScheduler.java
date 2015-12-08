// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractScheduledService, AbstractService, ForwardingFuture

public static abstract class  extends 
{
    private class ReschedulableCallable extends ForwardingFuture
        implements Callable
    {

        private Future currentFuture;
        private final ScheduledExecutorService executor;
        private final ReentrantLock lock = new ReentrantLock();
        private final AbstractService service;
        final AbstractScheduledService.CustomScheduler this$0;
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
                Schedule schedule1 = getNextSchedule();
                currentFuture = executor.schedule(this, schedule1.delay, schedule1.unit);
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

        ReschedulableCallable(AbstractService abstractservice, ScheduledExecutorService scheduledexecutorservice, Runnable runnable)
        {
            this$0 = AbstractScheduledService.CustomScheduler.this;
            super();
            wrappedRunnable = runnable;
            executor = scheduledexecutorservice;
            service = abstractservice;
        }
    }

    protected static final class Schedule
    {

        private final long delay;
        private final TimeUnit unit;



        public Schedule(long l, TimeUnit timeunit)
        {
            delay = l;
            unit = (TimeUnit)Preconditions.checkNotNull(timeunit);
        }
    }


    protected abstract Schedule getNextSchedule()
        throws Exception;

    final Future schedule(AbstractService abstractservice, ScheduledExecutorService scheduledexecutorservice, Runnable runnable)
    {
        abstractservice = new ReschedulableCallable(abstractservice, scheduledexecutorservice, runnable);
        abstractservice.reschedule();
        return abstractservice;
    }

    public Schedule.unit()
    {
        super(null);
    }
}
