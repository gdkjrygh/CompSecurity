// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Future;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingListenableFuture, ListenableFuture

public static abstract class delegate extends ForwardingListenableFuture
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

    protected (ListenableFuture listenablefuture)
    {
        _flddelegate = (ListenableFuture)Preconditions.checkNotNull(listenablefuture);
    }
}
