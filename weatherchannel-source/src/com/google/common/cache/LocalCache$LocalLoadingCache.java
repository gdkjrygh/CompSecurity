// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            LoadingCache, LocalCache, CacheLoader, CacheBuilder

static class init> extends init>
    implements LoadingCache
{

    private static final long serialVersionUID = 1L;

    public final Object apply(Object obj)
    {
        return getUnchecked(obj);
    }

    public Object get(Object obj)
        throws ExecutionException
    {
        return localCache.getOrLoad(obj);
    }

    public ImmutableMap getAll(Iterable iterable)
        throws ExecutionException
    {
        return localCache.getAll(iterable);
    }

    public Object getUnchecked(Object obj)
    {
        try
        {
            obj = get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new UncheckedExecutionException(((ExecutionException) (obj)).getCause());
        }
        return obj;
    }

    public void refresh(Object obj)
    {
        localCache.refresh(obj);
    }

    Object writeReplace()
    {
        return new onProxy(localCache);
    }

    onProxy(CacheBuilder cachebuilder, CacheLoader cacheloader)
    {
        super(new LocalCache(cachebuilder, (CacheLoader)Preconditions.checkNotNull(cacheloader)), null);
    }
}
