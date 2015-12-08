// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractListeningExecutorService, MoreExecutors

private static class delegate extends AbstractListeningExecutorService
{

    private final ExecutorService _flddelegate;

    public boolean awaitTermination(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _flddelegate.awaitTermination(l, timeunit);
    }

    public void execute(Runnable runnable)
    {
        _flddelegate.execute(runnable);
    }

    public boolean isShutdown()
    {
        return _flddelegate.isShutdown();
    }

    public boolean isTerminated()
    {
        return _flddelegate.isTerminated();
    }

    public void shutdown()
    {
        _flddelegate.shutdown();
    }

    public List shutdownNow()
    {
        return _flddelegate.shutdownNow();
    }

    (ExecutorService executorservice)
    {
        _flddelegate = (ExecutorService)Preconditions.checkNotNull(executorservice);
    }
}
