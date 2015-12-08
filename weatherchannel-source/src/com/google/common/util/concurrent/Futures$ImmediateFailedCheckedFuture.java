// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            CheckedFuture, Futures

private static class thrown extends thrown
    implements CheckedFuture
{

    private final Exception thrown;

    public Object checkedGet()
        throws Exception
    {
        throw thrown;
    }

    public Object checkedGet(long l, TimeUnit timeunit)
        throws Exception
    {
        Preconditions.checkNotNull(timeunit);
        throw thrown;
    }

    public Object get()
        throws ExecutionException
    {
        throw new ExecutionException(thrown);
    }

    (Exception exception)
    {
        super(null);
        thrown = exception;
    }
}
