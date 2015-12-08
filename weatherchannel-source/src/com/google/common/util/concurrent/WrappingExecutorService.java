// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

abstract class WrappingExecutorService
    implements ExecutorService
{

    private final ExecutorService _flddelegate;

    protected WrappingExecutorService(ExecutorService executorservice)
    {
        _flddelegate = (ExecutorService)Preconditions.checkNotNull(executorservice);
    }

    private final ImmutableList wrapTasks(Collection collection)
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        for (collection = collection.iterator(); collection.hasNext(); builder.add(wrapTask((Callable)collection.next()))) { }
        return builder.build();
    }

    public final boolean awaitTermination(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _flddelegate.awaitTermination(l, timeunit);
    }

    public final void execute(Runnable runnable)
    {
        _flddelegate.execute(wrapTask(runnable));
    }

    public final List invokeAll(Collection collection)
        throws InterruptedException
    {
        return _flddelegate.invokeAll(wrapTasks(collection));
    }

    public final List invokeAll(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _flddelegate.invokeAll(wrapTasks(collection), l, timeunit);
    }

    public final Object invokeAny(Collection collection)
        throws InterruptedException, ExecutionException
    {
        return _flddelegate.invokeAny(wrapTasks(collection));
    }

    public final Object invokeAny(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return _flddelegate.invokeAny(wrapTasks(collection), l, timeunit);
    }

    public final boolean isShutdown()
    {
        return _flddelegate.isShutdown();
    }

    public final boolean isTerminated()
    {
        return _flddelegate.isTerminated();
    }

    public final void shutdown()
    {
        _flddelegate.shutdown();
    }

    public final List shutdownNow()
    {
        return _flddelegate.shutdownNow();
    }

    public final Future submit(Runnable runnable)
    {
        return _flddelegate.submit(wrapTask(runnable));
    }

    public final Future submit(Runnable runnable, Object obj)
    {
        return _flddelegate.submit(wrapTask(runnable), obj);
    }

    public final Future submit(Callable callable)
    {
        return _flddelegate.submit(wrapTask((Callable)Preconditions.checkNotNull(callable)));
    }

    protected Runnable wrapTask(Runnable runnable)
    {
        return new Runnable() {

            final WrappingExecutorService this$0;
            final Callable val$wrapped;

            public void run()
            {
                try
                {
                    wrapped.call();
                    return;
                }
                catch (Exception exception)
                {
                    Throwables.propagate(exception);
                }
            }

            
            {
                this$0 = WrappingExecutorService.this;
                wrapped = callable;
                super();
            }
        };
    }

    protected abstract Callable wrapTask(Callable callable);
}
