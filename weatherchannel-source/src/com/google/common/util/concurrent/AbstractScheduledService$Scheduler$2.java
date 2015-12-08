// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractScheduledService, AbstractService

static final class nit> extends nit>
{

    final long val$initialDelay;
    final long val$period;
    final TimeUnit val$unit;

    public Future schedule(AbstractService abstractservice, ScheduledExecutorService scheduledexecutorservice, Runnable runnable)
    {
        return scheduledexecutorservice.scheduleAtFixedRate(runnable, val$initialDelay, val$period, val$unit);
    }

    (long l, long l1, TimeUnit timeunit)
    {
        val$initialDelay = l;
        val$period = l1;
        val$unit = timeunit;
        super(null);
    }
}
