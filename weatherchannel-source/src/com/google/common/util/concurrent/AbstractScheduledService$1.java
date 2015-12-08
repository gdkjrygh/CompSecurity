// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractService, AbstractScheduledService, MoreExecutors

class this._cls0 extends AbstractService
{

    private volatile ScheduledExecutorService executorService;
    private final ReentrantLock lock = new ReentrantLock();
    private volatile Future runningTask;
    private final Runnable task = new Runnable() {

        final AbstractScheduledService._cls1 this$1;

        public void run()
        {
            lock.lock();
            runOneIteration();
            lock.unlock();
            return;
            Object obj;
            obj;
            shutDown();
_L1:
            notifyFailed(((Throwable) (obj)));
            throw Throwables.propagate(((Throwable) (obj)));
            obj;
            lock.unlock();
            throw obj;
            Exception exception;
            exception;
            AbstractScheduledService.access$200().log(Level.WARNING, "Error while attempting to shut down the service after failure.", exception);
              goto _L1
        }

            
            {
                this$1 = AbstractScheduledService._cls1.this;
                super();
            }
    };
    final AbstractScheduledService this$0;

    protected final void doStart()
    {
        executorService = MoreExecutors.renamingDecorator(executor(), new Supplier() {

            final AbstractScheduledService._cls1 this$1;

            public volatile Object get()
            {
                return get();
            }

            public String get()
            {
                String s = String.valueOf(String.valueOf(serviceName()));
                String s1 = String.valueOf(String.valueOf(state()));
                return (new StringBuilder(s.length() + 1 + s1.length())).append(s).append(" ").append(s1).toString();
            }

            
            {
                this$1 = AbstractScheduledService._cls1.this;
                super();
            }
        });
        executorService.execute(new Runnable() {

            final AbstractScheduledService._cls1 this$1;

            public void run()
            {
                lock.lock();
                startUp();
                runningTask = scheduler().schedule(AbstractScheduledService.access$400(this$0), executorService, task);
                notifyStarted();
                lock.unlock();
                return;
                Object obj;
                obj;
                notifyFailed(((Throwable) (obj)));
                throw Throwables.propagate(((Throwable) (obj)));
                obj;
                lock.unlock();
                throw obj;
            }

            
            {
                this$1 = AbstractScheduledService._cls1.this;
                super();
            }
        });
    }

    protected final void doStop()
    {
        runningTask.cancel(false);
        executorService.execute(new Runnable() {

            final AbstractScheduledService._cls1 this$1;

            public void run()
            {
                Service.State state;
                Service.State state1;
                try
                {
                    lock.lock();
                }
                catch (Throwable throwable)
                {
                    notifyFailed(throwable);
                    throw Throwables.propagate(throwable);
                }
                state = AbstractScheduledService._cls1.this.state();
                state1 = Service.State.STOPPING;
                if (state == state1)
                {
                    break MISSING_BLOCK_LABEL_38;
                }
                lock.unlock();
                return;
                shutDown();
                lock.unlock();
                notifyStopped();
                return;
                Exception exception;
                exception;
                lock.unlock();
                throw exception;
            }

            
            {
                this$1 = AbstractScheduledService._cls1.this;
                super();
            }
        });
    }



/*
    static Future access$302(_cls4 _pcls4, Future future)
    {
        _pcls4.runningTask = future;
        return future;
    }

*/



    _cls4.this._cls1()
    {
        this$0 = AbstractScheduledService.this;
        super();
    }
}
