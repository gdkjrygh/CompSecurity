// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.google.common.util.concurrent:
//            Futures, AsyncSettableFuture, ListenableFuture

static final class val.future
    implements Runnable
{

    final ConcurrentLinkedQueue val$delegates;
    final ListenableFuture val$future;

    public void run()
    {
        ((AsyncSettableFuture)val$delegates.remove()).setFuture(val$future);
    }

    Future(ConcurrentLinkedQueue concurrentlinkedqueue, ListenableFuture listenablefuture)
    {
        val$delegates = concurrentlinkedqueue;
        val$future = listenablefuture;
        super();
    }
}
