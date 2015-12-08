// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Future;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingFuture

public static abstract class delegate extends ForwardingFuture
{

    private final Future _flddelegate;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected final Future _mthdelegate()
    {
        return _flddelegate;
    }

    protected (Future future)
    {
        _flddelegate = (Future)Preconditions.checkNotNull(future);
    }
}
