// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            ListenableFuture

public interface ListeningExecutorService
    extends ExecutorService
{

    public abstract List invokeAll(Collection collection)
        throws InterruptedException;

    public abstract List invokeAll(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException;

    public abstract ListenableFuture submit(Runnable runnable);

    public abstract ListenableFuture submit(Runnable runnable, Object obj);

    public abstract ListenableFuture submit(Callable callable);
}
