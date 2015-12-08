// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.cache:
//            ForwardingCache, Cache

public static abstract class delegate extends ForwardingCache
{

    private final Cache _flddelegate;

    protected final Cache _mthdelegate()
    {
        return _flddelegate;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected (Cache cache)
    {
        _flddelegate = (Cache)Preconditions.checkNotNull(cache);
    }
}
