// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractCheckedFuture, Futures, ListenableFuture

private static class mapper extends AbstractCheckedFuture
{

    final Function mapper;

    protected Exception mapException(Exception exception)
    {
        return (Exception)mapper.apply(exception);
    }

    (ListenableFuture listenablefuture, Function function)
    {
        super(listenablefuture);
        mapper = (Function)Preconditions.checkNotNull(function);
    }
}
