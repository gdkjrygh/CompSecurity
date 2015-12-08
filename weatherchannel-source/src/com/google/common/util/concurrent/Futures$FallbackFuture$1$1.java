// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            FutureCallback, Futures, ListenableFuture, FutureFallback, 
//            MoreExecutors

class this._cls1
    implements FutureCallback
{

    final xception this$1;

    public void onFailure(Throwable throwable)
    {
        if (ss._mth100(_fld0).isCancelled())
        {
            el(false);
            return;
        } else
        {
            xception(throwable);
            return;
        }
    }

    public void onSuccess(Object obj)
    {
        xception(obj);
    }

    l.fallback()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/common/util/concurrent/Futures$FallbackFuture$1

/* anonymous class */
    class Futures.FallbackFuture._cls1
        implements FutureCallback
    {

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
                Futures.FallbackFuture.access$102(Futures.FallbackFuture.this, fallback.create(throwable));
                if (isCancelled())
                {
                    Futures.FallbackFuture.access$100(Futures.FallbackFuture.this).cancel(wasInterrupted());
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                setException(throwable);
                return;
            }
            Futures.addCallback(Futures.FallbackFuture.access$100(Futures.FallbackFuture.this), new Futures.FallbackFuture._cls1._cls1(), MoreExecutors.directExecutor());
            return;
        }

        public void onSuccess(Object obj)
        {
            set(obj);
        }

            
            {
                this$0 = final_fallbackfuture;
                fallback = FutureFallback.this;
                super();
            }
    }

}
