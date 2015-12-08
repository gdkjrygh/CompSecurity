// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingObject;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class ForwardingExecutorService extends ForwardingObject
    implements ExecutorService
{

    protected ForwardingExecutorService()
    {
    }

    public boolean awaitTermination(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().awaitTermination(l, timeunit);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract ExecutorService _mthdelegate();

    public void execute(Runnable runnable)
    {
        _mthdelegate().execute(runnable);
    }

    public List invokeAll(Collection collection)
        throws InterruptedException
    {
        return _mthdelegate().invokeAll(collection);
    }

    public List invokeAll(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().invokeAll(collection, l, timeunit);
    }

    public Object invokeAny(Collection collection)
        throws InterruptedException, ExecutionException
    {
        return _mthdelegate().invokeAny(collection);
    }

    public Object invokeAny(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return _mthdelegate().invokeAny(collection, l, timeunit);
    }

    public boolean isShutdown()
    {
        return _mthdelegate().isShutdown();
    }

    public boolean isTerminated()
    {
        return _mthdelegate().isTerminated();
    }

    public void shutdown()
    {
        _mthdelegate().shutdown();
    }

    public List shutdownNow()
    {
        return _mthdelegate().shutdownNow();
    }

    public Future submit(Runnable runnable)
    {
        return _mthdelegate().submit(runnable);
    }

    public Future submit(Runnable runnable, Object obj)
    {
        return _mthdelegate().submit(runnable, obj);
    }

    public Future submit(Callable callable)
    {
        return _mthdelegate().submit(callable);
    }
}
