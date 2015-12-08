// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            ForwardingCache, LoadingCache, Cache

public abstract class ForwardingLoadingCache extends ForwardingCache
    implements LoadingCache
{
    public static abstract class SimpleForwardingLoadingCache extends ForwardingLoadingCache
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

        protected SimpleForwardingLoadingCache(LoadingCache loadingcache)
        {
            _flddelegate = (LoadingCache)Preconditions.checkNotNull(loadingcache);
        }
    }


    protected ForwardingLoadingCache()
    {
    }

    public Object apply(Object obj)
    {
        return _mthdelegate().apply(obj);
    }

    protected volatile Cache _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract LoadingCache _mthdelegate();

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public Object get(Object obj)
        throws ExecutionException
    {
        return _mthdelegate().get(obj);
    }

    public ImmutableMap getAll(Iterable iterable)
        throws ExecutionException
    {
        return _mthdelegate().getAll(iterable);
    }

    public Object getUnchecked(Object obj)
    {
        return _mthdelegate().getUnchecked(obj);
    }

    public void refresh(Object obj)
    {
        _mthdelegate().refresh(obj);
    }
}
