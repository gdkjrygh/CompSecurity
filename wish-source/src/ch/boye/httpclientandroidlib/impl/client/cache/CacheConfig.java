// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;


public class CacheConfig
{

    public static final int DEFAULT_ASYNCHRONOUS_WORKERS_CORE = 1;
    public static final int DEFAULT_ASYNCHRONOUS_WORKERS_MAX = 1;
    public static final int DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS = 60;
    public static final boolean DEFAULT_HEURISTIC_CACHING_ENABLED = false;
    public static final float DEFAULT_HEURISTIC_COEFFICIENT = 0.1F;
    public static final long DEFAULT_HEURISTIC_LIFETIME = 0L;
    public static final int DEFAULT_MAX_CACHE_ENTRIES = 1000;
    public static final int DEFAULT_MAX_OBJECT_SIZE_BYTES = 8192;
    public static final int DEFAULT_MAX_UPDATE_RETRIES = 1;
    public static final int DEFAULT_REVALIDATION_QUEUE_SIZE = 100;
    private int asynchronousWorkerIdleLifetimeSecs;
    private int asynchronousWorkersCore;
    private int asynchronousWorkersMax;
    private boolean heuristicCachingEnabled;
    private float heuristicCoefficient;
    private long heuristicDefaultLifetime;
    private boolean isSharedCache;
    private int maxCacheEntries;
    private long maxObjectSize;
    private int maxUpdateRetries;
    private int revalidationQueueSize;

    public CacheConfig()
    {
        maxObjectSize = 8192L;
        maxCacheEntries = 1000;
        maxUpdateRetries = 1;
        heuristicCachingEnabled = false;
        heuristicCoefficient = 0.1F;
        heuristicDefaultLifetime = 0L;
        isSharedCache = true;
        asynchronousWorkersMax = 1;
        asynchronousWorkersCore = 1;
        asynchronousWorkerIdleLifetimeSecs = 60;
        revalidationQueueSize = 100;
    }

    public int getAsynchronousWorkerIdleLifetimeSecs()
    {
        return asynchronousWorkerIdleLifetimeSecs;
    }

    public int getAsynchronousWorkersCore()
    {
        return asynchronousWorkersCore;
    }

    public int getAsynchronousWorkersMax()
    {
        return asynchronousWorkersMax;
    }

    public float getHeuristicCoefficient()
    {
        return heuristicCoefficient;
    }

    public long getHeuristicDefaultLifetime()
    {
        return heuristicDefaultLifetime;
    }

    public int getMaxCacheEntries()
    {
        return maxCacheEntries;
    }

    public long getMaxObjectSize()
    {
        return maxObjectSize;
    }

    public int getMaxObjectSizeBytes()
    {
        if (maxObjectSize > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)maxObjectSize;
        }
    }

    public int getMaxUpdateRetries()
    {
        return maxUpdateRetries;
    }

    public int getRevalidationQueueSize()
    {
        return revalidationQueueSize;
    }

    public boolean isHeuristicCachingEnabled()
    {
        return heuristicCachingEnabled;
    }

    public boolean isSharedCache()
    {
        return isSharedCache;
    }

    public void setAsynchronousWorkerIdleLifetimeSecs(int i)
    {
        asynchronousWorkerIdleLifetimeSecs = i;
    }

    public void setAsynchronousWorkersCore(int i)
    {
        asynchronousWorkersCore = i;
    }

    public void setAsynchronousWorkersMax(int i)
    {
        asynchronousWorkersMax = i;
    }

    public void setHeuristicCachingEnabled(boolean flag)
    {
        heuristicCachingEnabled = flag;
    }

    public void setHeuristicCoefficient(float f)
    {
        heuristicCoefficient = f;
    }

    public void setHeuristicDefaultLifetime(long l)
    {
        heuristicDefaultLifetime = l;
    }

    public void setMaxCacheEntries(int i)
    {
        maxCacheEntries = i;
    }

    public void setMaxObjectSize(long l)
    {
        maxObjectSize = l;
    }

    public void setMaxObjectSizeBytes(int i)
    {
        if (i > 0x7fffffff)
        {
            maxObjectSize = 0x7fffffffL;
            return;
        } else
        {
            maxObjectSize = i;
            return;
        }
    }

    public void setMaxUpdateRetries(int i)
    {
        maxUpdateRetries = i;
    }

    public void setRevalidationQueueSize(int i)
    {
        revalidationQueueSize = i;
    }

    public void setSharedCache(boolean flag)
    {
        isSharedCache = flag;
    }
}
