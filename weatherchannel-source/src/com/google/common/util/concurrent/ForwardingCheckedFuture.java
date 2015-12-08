// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingListenableFuture, CheckedFuture, ListenableFuture

public abstract class ForwardingCheckedFuture extends ForwardingListenableFuture
    implements CheckedFuture
{
    public static abstract class SimpleForwardingCheckedFuture extends ForwardingCheckedFuture
    {

        private final CheckedFuture _flddelegate;

        protected final CheckedFuture _mthdelegate()
        {
            return _flddelegate;
        }

        protected volatile ListenableFuture _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Future _mthdelegate()
        {
            return _mthdelegate();
        }

        protected SimpleForwardingCheckedFuture(CheckedFuture checkedfuture)
        {
            _flddelegate = (CheckedFuture)Preconditions.checkNotNull(checkedfuture);
        }
    }


    public ForwardingCheckedFuture()
    {
    }

    public Object checkedGet()
        throws Exception
    {
        return _mthdelegate().checkedGet();
    }

    public Object checkedGet(long l, TimeUnit timeunit)
        throws TimeoutException, Exception
    {
        return _mthdelegate().checkedGet(l, timeunit);
    }

    protected abstract CheckedFuture _mthdelegate();

    protected volatile ListenableFuture _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Future _mthdelegate()
    {
        return _mthdelegate();
    }
}
