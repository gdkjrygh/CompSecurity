// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

public final class CacheStats
{

    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long l, long l1, long l2, long l3, long l4, long l5)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l2 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l3 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l4 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l5 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        hitCount = l;
        missCount = l1;
        loadSuccessCount = l2;
        loadExceptionCount = l3;
        totalLoadTime = l4;
        evictionCount = l5;
    }

    public double averageLoadPenalty()
    {
        long l = loadSuccessCount + loadExceptionCount;
        if (l == 0L)
        {
            return 0.0D;
        } else
        {
            return (double)totalLoadTime / (double)l;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof CacheStats)
        {
            obj = (CacheStats)obj;
            flag = flag1;
            if (hitCount == ((CacheStats) (obj)).hitCount)
            {
                flag = flag1;
                if (missCount == ((CacheStats) (obj)).missCount)
                {
                    flag = flag1;
                    if (loadSuccessCount == ((CacheStats) (obj)).loadSuccessCount)
                    {
                        flag = flag1;
                        if (loadExceptionCount == ((CacheStats) (obj)).loadExceptionCount)
                        {
                            flag = flag1;
                            if (totalLoadTime == ((CacheStats) (obj)).totalLoadTime)
                            {
                                flag = flag1;
                                if (evictionCount == ((CacheStats) (obj)).evictionCount)
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public long evictionCount()
    {
        return evictionCount;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Long.valueOf(hitCount), Long.valueOf(missCount), Long.valueOf(loadSuccessCount), Long.valueOf(loadExceptionCount), Long.valueOf(totalLoadTime), Long.valueOf(evictionCount)
        });
    }

    public long hitCount()
    {
        return hitCount;
    }

    public double hitRate()
    {
        long l = requestCount();
        if (l == 0L)
        {
            return 1.0D;
        } else
        {
            return (double)hitCount / (double)l;
        }
    }

    public long loadCount()
    {
        return loadSuccessCount + loadExceptionCount;
    }

    public long loadExceptionCount()
    {
        return loadExceptionCount;
    }

    public double loadExceptionRate()
    {
        long l = loadSuccessCount + loadExceptionCount;
        if (l == 0L)
        {
            return 0.0D;
        } else
        {
            return (double)loadExceptionCount / (double)l;
        }
    }

    public long loadSuccessCount()
    {
        return loadSuccessCount;
    }

    public CacheStats minus(CacheStats cachestats)
    {
        return new CacheStats(Math.max(0L, hitCount - cachestats.hitCount), Math.max(0L, missCount - cachestats.missCount), Math.max(0L, loadSuccessCount - cachestats.loadSuccessCount), Math.max(0L, loadExceptionCount - cachestats.loadExceptionCount), Math.max(0L, totalLoadTime - cachestats.totalLoadTime), Math.max(0L, evictionCount - cachestats.evictionCount));
    }

    public long missCount()
    {
        return missCount;
    }

    public double missRate()
    {
        long l = requestCount();
        if (l == 0L)
        {
            return 0.0D;
        } else
        {
            return (double)missCount / (double)l;
        }
    }

    public CacheStats plus(CacheStats cachestats)
    {
        return new CacheStats(hitCount + cachestats.hitCount, missCount + cachestats.missCount, loadSuccessCount + cachestats.loadSuccessCount, loadExceptionCount + cachestats.loadExceptionCount, totalLoadTime + cachestats.totalLoadTime, evictionCount + cachestats.evictionCount);
    }

    public long requestCount()
    {
        return hitCount + missCount;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("hitCount", hitCount).add("missCount", missCount).add("loadSuccessCount", loadSuccessCount).add("loadExceptionCount", loadExceptionCount).add("totalLoadTime", totalLoadTime).add("evictionCount", evictionCount).toString();
    }

    public long totalLoadTime()
    {
        return totalLoadTime;
    }
}
