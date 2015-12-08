// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.common.util.concurrent:
//            ListenableFutureTask, Futures, ListenableFuture

private static final class futures extends ListenableFutureTask
{

    ImmutableList futures;

    public boolean cancel(boolean flag)
    {
        Object obj = futures;
        if (super.cancel(flag))
        {
            for (obj = ((ImmutableList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ListenableFuture)((Iterator) (obj)).next()).cancel(flag)) { }
            return true;
        } else
        {
            return false;
        }
    }

    protected void done()
    {
        super.done();
        futures = null;
    }

    protected void setException(Throwable throwable)
    {
        super.setException(throwable);
    }

    (Callable callable, ImmutableList immutablelist)
    {
        super(callable);
        futures = immutablelist;
    }
}
