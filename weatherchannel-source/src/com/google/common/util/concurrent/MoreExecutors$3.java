// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.common.util.concurrent:
//            WrappingExecutorService, MoreExecutors, Callables

static final class Service extends WrappingExecutorService
{

    final Supplier val$nameSupplier;

    protected Runnable wrapTask(Runnable runnable)
    {
        return Callables.threadRenaming(runnable, val$nameSupplier);
    }

    protected Callable wrapTask(Callable callable)
    {
        return Callables.threadRenaming(callable, val$nameSupplier);
    }

    Service(ExecutorService executorservice, Supplier supplier)
    {
        val$nameSupplier = supplier;
        super(executorservice);
    }
}
