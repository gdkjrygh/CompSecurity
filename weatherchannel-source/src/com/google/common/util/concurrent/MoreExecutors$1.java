// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.common.util.concurrent:
//            MoreExecutors, ListenableFuture

static final class val.future
    implements Runnable
{

    final ListenableFuture val$future;
    final BlockingQueue val$queue;

    public void run()
    {
        val$queue.add(val$future);
    }

    (BlockingQueue blockingqueue, ListenableFuture listenablefuture)
    {
        val$queue = blockingqueue;
        val$future = listenablefuture;
        super();
    }
}
