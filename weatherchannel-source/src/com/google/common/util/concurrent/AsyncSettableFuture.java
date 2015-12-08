// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Future;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingListenableFuture, Futures, ListenableFuture, AbstractFuture

final class AsyncSettableFuture extends ForwardingListenableFuture
{
    private static final class NestedFuture extends AbstractFuture
    {

        boolean setFuture(ListenableFuture listenablefuture)
        {
            boolean flag = set(listenablefuture);
            if (isCancelled())
            {
                listenablefuture.cancel(wasInterrupted());
            }
            return flag;
        }

        private NestedFuture()
        {
        }

    }


    private final ListenableFuture dereferenced;
    private final NestedFuture nested = new NestedFuture();

    private AsyncSettableFuture()
    {
        dereferenced = Futures.dereference(nested);
    }

    public static AsyncSettableFuture create()
    {
        return new AsyncSettableFuture();
    }

    protected ListenableFuture _mthdelegate()
    {
        return dereferenced;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Future _mthdelegate()
    {
        return _mthdelegate();
    }

    public boolean isSet()
    {
        return nested.isDone();
    }

    public boolean setException(Throwable throwable)
    {
        return setFuture(Futures.immediateFailedFuture(throwable));
    }

    public boolean setFuture(ListenableFuture listenablefuture)
    {
        return nested.setFuture((ListenableFuture)Preconditions.checkNotNull(listenablefuture));
    }

    public boolean setValue(Object obj)
    {
        return setFuture(Futures.immediateFuture(obj));
    }
}
