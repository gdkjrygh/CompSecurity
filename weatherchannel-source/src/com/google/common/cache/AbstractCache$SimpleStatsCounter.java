// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            AbstractCache, LongAddables, CacheStats, LongAddable

public static final class 
    implements 
{

    private final LongAddable evictionCount = LongAddables.create();
    private final LongAddable hitCount = LongAddables.create();
    private final LongAddable loadExceptionCount = LongAddables.create();
    private final LongAddable loadSuccessCount = LongAddables.create();
    private final LongAddable missCount = LongAddables.create();
    private final LongAddable totalLoadTime = LongAddables.create();

    public void incrementBy( )
    {
         = .ot();
        hitCount.add(.hitCount());
        missCount.add(.missCount());
        loadSuccessCount.add(.loadSuccessCount());
        loadExceptionCount.add(.loadExceptionCount());
        totalLoadTime.add(.totalLoadTime());
        evictionCount.add(.evictionCount());
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

    public ()
    {
    }
}
