// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            Cache, LocalCache, CacheBuilder, CacheStats, 
//            CacheLoader

static class <init>
    implements Cache, Serializable
{

    private static final long serialVersionUID = 1L;
    final LocalCache localCache;

    public ConcurrentMap asMap()
    {
        return localCache;
    }

    public void cleanUp()
    {
        localCache.cleanUp();
    }

    public Object get(Object obj, final Callable valueLoader)
        throws ExecutionException
    {
        Preconditions.checkNotNull(valueLoader);
        return localCache.get(obj, new CacheLoader() {

            final LocalCache.LocalManualCache this$0;
            final Callable val$valueLoader;

            public Object load(Object obj1)
                throws Exception
            {
                return valueLoader.call();
            }

            
            {
                this$0 = LocalCache.LocalManualCache.this;
                valueLoader = callable;
                super();
            }
        });
    }

    public ImmutableMap getAllPresent(Iterable iterable)
    {
        return localCache.getAllPresent(iterable);
    }

    public Object getIfPresent(Object obj)
    {
        return localCache.getIfPresent(obj);
    }

    public void invalidate(Object obj)
    {
        Preconditions.checkNotNull(obj);
        localCache.remove(obj);
    }

    public void invalidateAll()
    {
        localCache.clear();
    }

    public void invalidateAll(Iterable iterable)
    {
        localCache.invalidateAll(iterable);
    }

    public void put(Object obj, Object obj1)
    {
        localCache.put(obj, obj1);
    }

    public void putAll(Map map)
    {
        localCache.putAll(map);
    }

    public long size()
    {
        return localCache.longSize();
    }

    public CacheStats stats()
    {
        nter nter = new nter();
        nter.incrementBy(localCache.globalStatsCounter);
        nter anter[] = localCache.segments;
        int j = anter.length;
        for (int i = 0; i < j; i++)
        {
            nter.incrementBy(anter[i].ter);
        }

        return nter.snapshot();
    }

    Object writeReplace()
    {
        return new onProxy(localCache);
    }

    _cls1.val.valueLoader(CacheBuilder cachebuilder)
    {
        this(new LocalCache(cachebuilder, null));
    }

    private <init>(LocalCache localcache)
    {
        localCache = localcache;
    }

    localCache(LocalCache localcache, localCache localcache1)
    {
        this(localcache);
    }
}
