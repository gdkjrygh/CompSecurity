// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.util.concurrent:
//            Futures, Uninterruptibles, ListenableFuture

class val.outputFuture
    implements Runnable
{

    final this._cls0 this$0;
    final ListenableFuture val$outputFuture;

    public void run()
    {
        t(Uninterruptibles.getUninterruptibly(val$outputFuture));
        cess._mth302(this._cls0.this, null);
        return;
        Object obj;
        obj;
        ncel(false);
        cess._mth302(this._cls0.this, null);
        return;
        obj;
        tException(((ExecutionException) (obj)).getCause());
        cess._mth302(this._cls0.this, null);
        return;
        obj;
        cess._mth302(this._cls0.this, null);
        throw obj;
    }

    ()
    {
        this$0 = final_;
        val$outputFuture = ListenableFuture.this;
        super();
    }
}
