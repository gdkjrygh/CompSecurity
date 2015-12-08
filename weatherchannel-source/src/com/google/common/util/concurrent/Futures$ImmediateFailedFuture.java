// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.util.concurrent:
//            Futures

private static class thrown extends thrown
{

    private final Throwable thrown;

    public Object get()
        throws ExecutionException
    {
        throw new ExecutionException(thrown);
    }

    (Throwable throwable)
    {
        super(null);
        thrown = throwable;
    }
}
