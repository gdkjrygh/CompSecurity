// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            FutureCallback, Futures, ListenableFuture

class val.delegate
    implements FutureCallback
{

    final t this$0;
    final ListenableFuture val$delegate;

    public void onFailure(Throwable throwable)
    {
        if (val$delegate.isCancelled())
        {
            ncel(false);
            return;
        } else
        {
            tException(throwable);
            return;
        }
    }

    public void onSuccess(Object obj)
    {
        t(obj);
    }

    ()
    {
        this$0 = final_;
        val$delegate = ListenableFuture.this;
        super();
    }
}
