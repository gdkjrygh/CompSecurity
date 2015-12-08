// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractExecutionThreadService, AbstractService, MoreExecutors

class this._cls1
    implements Supplier
{

    final iceName this$1;

    public volatile Object get()
    {
        return get();
    }

    public String get()
    {
        return serviceName();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/common/util/concurrent/AbstractExecutionThreadService$1

/* anonymous class */
    class AbstractExecutionThreadService._cls1 extends AbstractService
    {

        final AbstractExecutionThreadService this$0;

        protected final void doStart()
        {
            MoreExecutors.renamingDecorator(executor(), new AbstractExecutionThreadService._cls1._cls1()).execute(new AbstractExecutionThreadService._cls1._cls2());
        }

        protected void doStop()
        {
            triggerShutdown();
        }

            
            {
                this$0 = AbstractExecutionThreadService.this;
                super();
            }

        // Unreferenced inner class com/google/common/util/concurrent/AbstractExecutionThreadService$1$2

/* anonymous class */
        class AbstractExecutionThreadService._cls1._cls2
            implements Runnable
        {

            final AbstractExecutionThreadService._cls1 this$1;

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
                AbstractExecutionThreadService.access$000().log(Level.WARNING, "Error while attempting to shut down the service after failure.", exception);
                  goto _L1
            }

                    
                    {
                        this$1 = AbstractExecutionThreadService._cls1.this;
                        super();
                    }
        }

    }

}
