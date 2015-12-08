// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture, MoreExecutors

private static final class delegate extends AbstractFuture
    implements Runnable
{

    private final Runnable _flddelegate;

    public void run()
    {
        try
        {
            _flddelegate.run();
            return;
        }
        catch (Throwable throwable)
        {
            setException(throwable);
            throw Throwables.propagate(throwable);
        }
    }

    public (Runnable runnable)
    {
        _flddelegate = (Runnable)Preconditions.checkNotNull(runnable);
    }
}
