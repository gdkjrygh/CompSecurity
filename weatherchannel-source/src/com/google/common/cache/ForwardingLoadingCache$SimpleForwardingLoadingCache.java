// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.cache:
//            ForwardingLoadingCache, LoadingCache, Cache

public static abstract class delegate extends ForwardingLoadingCache
{

    private final LoadingCache _flddelegate;

    protected volatile Cache _mthdelegate()
    {
        return _mthdelegate();
    }

    protected final LoadingCache _mthdelegate()
    {
        return _flddelegate;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Q(LoadingCache loadingcache)
    {
        _flddelegate = (LoadingCache)Preconditions.checkNotNull(loadingcache);
    }
}
