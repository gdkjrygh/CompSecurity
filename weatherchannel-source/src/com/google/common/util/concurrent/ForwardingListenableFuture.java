// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingFuture, ListenableFuture

public abstract class ForwardingListenableFuture extends ForwardingFuture
    implements ListenableFuture
{
    public static abstract class SimpleForwardingListenableFuture extends ForwardingListenableFuture
    {

        private final ListenableFuture _flddelegate;

        protected final ListenableFuture _mthdelegate()
        {
            return _flddelegate;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Future _mthdelegate()
        {
            return _mthdelegate();
        }

        protected SimpleForwardingListenableFuture(ListenableFuture listenablefuture)
        {
            _flddelegate = (ListenableFuture)Preconditions.checkNotNull(listenablefuture);
        }
    }


    protected ForwardingListenableFuture()
    {
    }

    public void addListener(Runnable runnable, Executor executor)
    {
        _mthdelegate().addListener(runnable, executor);
    }

    protected abstract ListenableFuture _mthdelegate();

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Future _mthdelegate()
    {
        return _mthdelegate();
    }
}
