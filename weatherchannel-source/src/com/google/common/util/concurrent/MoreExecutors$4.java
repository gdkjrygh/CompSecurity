// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.common.util.concurrent:
//            WrappingScheduledExecutorService, MoreExecutors, Callables

static final class dExecutorService extends WrappingScheduledExecutorService
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

    dExecutorService(ScheduledExecutorService scheduledexecutorservice, Supplier supplier)
    {
        val$nameSupplier = supplier;
        super(scheduledexecutorservice);
    }
}
