// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingExecutorService, ListeningExecutorService, ListenableFuture

public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService
    implements ListeningExecutorService
{

    protected ForwardingListeningExecutorService()
    {
    }

    protected abstract ListeningExecutorService _mthdelegate();

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile ExecutorService _mthdelegate()
    {
        return _mthdelegate();
    }

    public ListenableFuture submit(Runnable runnable)
    {
        return _mthdelegate().submit(runnable);
    }

    public ListenableFuture submit(Runnable runnable, Object obj)
    {
        return _mthdelegate().submit(runnable, obj);
    }

    public ListenableFuture submit(Callable callable)
    {
        return _mthdelegate().submit(callable);
    }

    public volatile Future submit(Runnable runnable)
    {
        return submit(runnable);
    }

    public volatile Future submit(Runnable runnable, Object obj)
    {
        return submit(runnable, obj);
    }

    public volatile Future submit(Callable callable)
    {
        return submit(callable);
    }
}
