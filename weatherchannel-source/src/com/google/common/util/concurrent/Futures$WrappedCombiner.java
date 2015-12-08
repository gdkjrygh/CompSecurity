// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.util.concurrent:
//            Futures

private static final class delegate
    implements Callable
{

    final Callable _flddelegate;
    ancel outputFuture;

    public Object call()
        throws Exception
    {
        Object obj = _flddelegate.call();
        return obj;
        Object obj1;
        obj1;
        outputFuture.etException(((ExecutionException) (obj1)).getCause());
_L2:
        return null;
        obj1;
        outputFuture.ancel(false);
        if (true) goto _L2; else goto _L1
_L1:
    }

    (Callable callable)
    {
        _flddelegate = (Callable)Preconditions.checkNotNull(callable);
    }
}
