// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Future;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingCheckedFuture, CheckedFuture, ListenableFuture

public static abstract class delegate extends ForwardingCheckedFuture
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

    protected (CheckedFuture checkedfuture)
    {
        _flddelegate = (CheckedFuture)Preconditions.checkNotNull(checkedfuture);
    }
}
