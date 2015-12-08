// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            ListeningExecutorService, ListenableScheduledFuture

public interface ListeningScheduledExecutorService
    extends ScheduledExecutorService, ListeningExecutorService
{

    public abstract ListenableScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit);

    public abstract ListenableScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit);

    public abstract ListenableScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit);

    public abstract ListenableScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit);
}
