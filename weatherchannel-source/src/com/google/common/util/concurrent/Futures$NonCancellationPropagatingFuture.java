// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture, Futures, MoreExecutors, ListenableFuture, 
//            FutureCallback

private static class set extends AbstractFuture
{

    _cls1.val.delegate(final ListenableFuture delegate)
    {
        Preconditions.checkNotNull(delegate);
        Futures.addCallback(delegate, new FutureCallback() {

            final Futures.NonCancellationPropagatingFuture this$0;
            final ListenableFuture val$delegate;

            public void onFailure(Throwable throwable)
            {
                if (delegate.isCancelled())
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
                this$0 = Futures.NonCancellationPropagatingFuture.this;
                delegate = listenablefuture;
                super();
            }
        }, MoreExecutors.directExecutor());
    }
}
