// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            Service, AbstractService, MoreExecutors

public abstract class AbstractExecutionThreadService
    implements Service
{

    private static final Logger logger = Logger.getLogger(com/google/common/util/concurrent/AbstractExecutionThreadService.getName());
    private final Service _flddelegate = new AbstractService() {

        final AbstractExecutionThreadService this$0;

        protected final void doStart()
        {
            MoreExecutors.renamingDecorator(executor(), new Supplier() {

                final _cls1 this$1;

                public volatile Object get()
                {
                    return get();
                }

                public String get()
                {
                    return serviceName();
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            }).execute(new Runnable() {

                final _cls1 this$1;

                public void run()
                {
                    Throwable throwable;
                    boolean flag;
                    try
                    {
                        startUp();
                        notifyStarted();
                        flag = isRunning();
                    }
                    catch (Throwable throwable1)
                    {
                        notifyFailed(throwable1);
                        throw Throwables.propagate(throwable1);
                    }
                    if (!flag)
                    {
                        break MISSING_BLOCK_LABEL_39;
                    }
                    AbstractExecutionThreadService.this.run();
                    shutDown();
                    notifyStopped();
                    return;
                    throwable;
                    shutDown();
_L1:
                    throw throwable;
                    Exception exception;
                    exception;
                    AbstractExecutionThreadService.logger.log(Level.WARNING, "Error while attempting to shut down the service after failure.", exception);
                      goto _L1
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            });
        }

        protected void doStop()
        {
            triggerShutdown();
        }

            
            {
                this$0 = AbstractExecutionThreadService.this;
                super();
            }
    };

    protected AbstractExecutionThreadService()
    {
    }

    public final void addListener(Service.Listener listener, Executor executor1)
    {
        _flddelegate.addListener(listener, executor1);
    }

    public final void awaitRunning()
    {
        _flddelegate.awaitRunning();
    }

    public final void awaitRunning(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        _flddelegate.awaitRunning(l, timeunit);
    }

    public final void awaitTerminated()
    {
        _flddelegate.awaitTerminated();
    }

    public final void awaitTerminated(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        _flddelegate.awaitTerminated(l, timeunit);
    }

    protected Executor executor()
    {
        return new Executor() {

            final AbstractExecutionThreadService this$0;

            public void execute(Runnable runnable)
            {
                MoreExecutors.newThread(serviceName(), runnable).start();
            }

            
            {
                this$0 = AbstractExecutionThreadService.this;
                super();
            }
        };
    }

    public final Throwable failureCause()
    {
        return _flddelegate.failureCause();
    }

    public final boolean isRunning()
    {
        return _flddelegate.isRunning();
    }

    protected abstract void run()
        throws Exception;

    protected String serviceName()
    {
        return getClass().getSimpleName();
    }

    protected void shutDown()
        throws Exception
    {
    }

    public final Service startAsync()
    {
        _flddelegate.startAsync();
        return this;
    }

    protected void startUp()
        throws Exception
    {
    }

    public final Service.State state()
    {
        return _flddelegate.state();
    }

    public final Service stopAsync()
    {
        _flddelegate.stopAsync();
        return this;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(serviceName()));
        String s1 = String.valueOf(String.valueOf(state()));
        return (new StringBuilder(s.length() + 3 + s1.length())).append(s).append(" [").append(s1).append("]").toString();
    }

    protected void triggerShutdown()
    {
    }


}
