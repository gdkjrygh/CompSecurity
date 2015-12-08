// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            WrappingExecutorService

abstract class WrappingScheduledExecutorService extends WrappingExecutorService
    implements ScheduledExecutorService
{

    final ScheduledExecutorService _flddelegate;

    protected WrappingScheduledExecutorService(ScheduledExecutorService scheduledexecutorservice)
    {
        super(scheduledexecutorservice);
        _flddelegate = scheduledexecutorservice;
    }

    public final ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
    {
        return _flddelegate.schedule(wrapTask(runnable), l, timeunit);
    }

    public final ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
    {
        return _flddelegate.schedule(wrapTask(callable), l, timeunit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        return _flddelegate.scheduleAtFixedRate(wrapTask(runnable), l, l1, timeunit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        return _flddelegate.scheduleWithFixedDelay(wrapTask(runnable), l, l1, timeunit);
    }
}
