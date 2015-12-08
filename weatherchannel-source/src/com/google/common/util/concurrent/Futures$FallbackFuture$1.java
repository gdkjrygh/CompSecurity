// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            FutureCallback, Futures, FutureFallback, ListenableFuture, 
//            MoreExecutors

class val.fallback
    implements FutureCallback
{

    final t this$0;
    final FutureFallback val$fallback;

    public void onFailure(Throwable throwable)
    {
        if (Cancelled())
        {
            return;
        }
        try
        {
            cess._mth102(this._cls0.this, val$fallback.create(throwable));
            if (Cancelled())
            {
                cess._mth100(this._cls0.this).cancel(sInterrupted());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            tException(throwable);
            return;
        }
        Futures.addCallback(cess._mth100(this._cls0.this), new FutureCallback() {

            final Futures.FallbackFuture._cls1 this$1;

            public void onFailure(Throwable throwable1)
            {
                if (Futures.FallbackFuture.access$100(this$0).isCancelled())
                {
                    cancel(false);
                    return;
                } else
                {
                    setException(throwable1);
                    return;
                }
            }

            public void onSuccess(Object obj)
            {
                set(obj);
            }

            
            {
                this$1 = Futures.FallbackFuture._cls1.this;
                super();
            }
        }, MoreExecutors.directExecutor());
        return;
    }

    public void onSuccess(Object obj)
    {
        t(obj);
    }

    _cls1.this._cls1()
    {
        this$0 = final__pcls1;
        val$fallback = FutureFallback.this;
        super();
    }
}
