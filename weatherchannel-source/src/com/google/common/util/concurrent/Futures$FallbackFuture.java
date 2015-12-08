// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture, Futures, ListenableFuture, FutureFallback, 
//            FutureCallback, MoreExecutors

private static class set extends AbstractFuture
{

    private volatile ListenableFuture running;

    public boolean cancel(boolean flag)
    {
        if (super.cancel(flag))
        {
            running.cancel(flag);
            return true;
        } else
        {
            return false;
        }
    }



/*
    static ListenableFuture access$102(_cls1._cls1 _pcls1, ListenableFuture listenablefuture)
    {
        _pcls1.running = listenablefuture;
        return listenablefuture;
    }

*/

    _cls1.val.fallback(ListenableFuture listenablefuture, final FutureFallback fallback, Executor executor)
    {
        running = listenablefuture;
        Futures.addCallback(running, new FutureCallback() {

            final Futures.FallbackFuture this$0;
            final FutureFallback val$fallback;

            public void onFailure(Throwable throwable)
            {
                if (isCancelled())
                {
                    return;
                }
                try
                {
                    running = fallback.create(throwable);
                    if (isCancelled())
                    {
                        running.cancel(wasInterrupted());
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable)
                {
                    setException(throwable);
                    return;
                }
                Futures.addCallback(running, new FutureCallback() {

                    final _cls1 this$1;

                    public void onFailure(Throwable throwable)
                    {
                        if (running.isCancelled())
                        {
                            cancel(false);
                            return;
                        } else
                        {
                            setException(throwable);
                            return;
                        }
                    }

                    public void onSuccess(Object obj)
                    {
                        set(obj);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                }, MoreExecutors.directExecutor());
                return;
            }

            public void onSuccess(Object obj)
            {
                set(obj);
            }

            
            {
                this$0 = Futures.FallbackFuture.this;
                fallback = futurefallback;
                super();
            }
        }, executor);
    }
}
