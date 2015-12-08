// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            Cache, CacheStats, LongAddables, LongAddable

public abstract class AbstractCache
    implements Cache
{
    public static final class SimpleStatsCounter
        implements StatsCounter
    {

        private final LongAddable evictionCount = LongAddables.create();
        private final LongAddable hitCount = LongAddables.create();
        private final LongAddable loadExceptionCount = LongAddables.create();
        private final LongAddable loadSuccessCount = LongAddables.create();
        private final LongAddable missCount = LongAddables.create();
        private final LongAddable totalLoadTime = LongAddables.create();

        public void incrementBy(StatsCounter statscounter)
        {
            statscounter = statscounter.snapshot();
            hitCount.add(statscounter.hitCount());
            missCount.add(statscounter.missCount());
            loadSuccessCount.add(statscounter.loadSuccessCount());
            loadExceptionCount.add(statscounter.loadExceptionCount());
            totalLoadTime.add(statscounter.totalLoadTime());
            evictionCount.add(statscounter.evictionCount());
        }

        public void recordEviction()
        {
            evictionCount.increment();
        }

        public void recordHits(int i)
        {
            hitCount.add(i);
        }

        public void recordLoadException(long l)
        {
            loadExceptionCount.increment();
            totalLoadTime.add(l);
        }

        public void recordLoadSuccess(long l)
        {
            loadSuccessCount.increment();
            totalLoadTime.add(l);
        }

        public void recordMisses(int i)
        {
            missCount.add(i);
        }

        public CacheStats snapshot()
        {
            return new CacheStats(hitCount.sum(), missCount.sum(), loadSuccessCount.sum(), loadExceptionCount.sum(), totalLoadTime.sum(), evictionCount.sum());
        }

        public SimpleStatsCounter()
        {
        }
    }

    public static interface StatsCounter
    {

        public abstract void recordEviction();

        public abstract void recordHits(int i);

        public abstract void recordLoadException(long l);

        public abstract void recordLoadSuccess(long l);

        public abstract void recordMisses(int i);

        public abstract CacheStats snapshot();
    }


    protected AbstractCache()
    {
    }

    public ConcurrentMap asMap()
    {
        throw new UnsupportedOperationException();
    }

    public void cleanUp()
    {
    }

    public Object get(Object obj, Callable callable)
        throws ExecutionException
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableMap getAllPresent(Iterable iterable)
    {
        java.util.LinkedHashMap linkedhashmap = Maps.newLinkedHashMap();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = iterable.next();
            if (!linkedhashmap.containsKey(obj))
            {
                Object obj1 = getIfPresent(obj);
                if (obj1 != null)
                {
                    linkedhashmap.put(obj, obj1);
                }
            }
        } while (true);
        return ImmutableMap.copyOf(linkedhashmap);
    }

    public void invalidate(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public void invalidateAll()
    {
        throw new UnsupportedOperationException();
    }

    public void invalidateAll(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); invalidate(iterable.next())) { }
    }

    public void put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public long size()
    {
        throw new UnsupportedOperationException();
    }

    public CacheStats stats()
    {
        throw new UnsupportedOperationException();
    }
}
