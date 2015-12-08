// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Throwables;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractIdleService, AbstractService, MoreExecutors

class this._cls1
    implements Runnable
{

    final tifyFailed this$1;

    public void run()
    {
        try
        {
            startUp();
            tifyStarted();
            return;
        }
        catch (Throwable throwable)
        {
            tifyFailed(throwable);
            throw Throwables.propagate(throwable);
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/common/util/concurrent/AbstractIdleService$2

/* anonymous class */
    class AbstractIdleService._cls2 extends AbstractService
    {

        final AbstractIdleService this$0;

        protected final void doStart()
        {
            MoreExecutors.renamingDecorator(executor(), AbstractIdleService.access$000(AbstractIdleService.this)).execute(new AbstractIdleService._cls2._cls1());
        }

        protected final void doStop()
        {
            MoreExecutors.renamingDecorator(executor(), AbstractIdleService.access$000(AbstractIdleService.this)).execute(new AbstractIdleService._cls2._cls2());
        }

            
            {
                this$0 = AbstractIdleService.this;
                super();
            }

        // Unreferenced inner class com/google/common/util/concurrent/AbstractIdleService$2$2

/* anonymous class */
        class AbstractIdleService._cls2._cls2
            implements Runnable
        {

            final AbstractIdleService._cls2 this$1;

            public void run()
            {
                try
                {
                    shutDown();
                    notifyStopped();
                    return;
                }
                catch (Throwable throwable)
                {
                    notifyFailed(throwable);
                    throw Throwables.propagate(throwable);
                }
            }

                    
                    {
                        this$1 = AbstractIdleService._cls2.this;
                        super();
                    }
        }

    }

}
