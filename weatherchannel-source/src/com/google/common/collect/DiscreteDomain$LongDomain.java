// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            DiscreteDomain

private static final class _cls9 extends DiscreteDomain
    implements Serializable
{

    private static final previous INSTANCE = new <init>();
    private static final long serialVersionUID = 0L;

    private Object readResolve()
    {
        return INSTANCE;
    }

    public volatile long distance(Comparable comparable, Comparable comparable1)
    {
        return distance((Long)comparable, (Long)comparable1);
    }

    public long distance(Long long1, Long long2)
    {
        long l1 = long2.longValue() - long1.longValue();
        long l;
        if (long2.longValue() > long1.longValue() && l1 < 0L)
        {
            l = 0x7fffffffffffffffL;
        } else
        {
            l = l1;
            if (long2.longValue() < long1.longValue())
            {
                l = l1;
                if (l1 > 0L)
                {
                    return 0x8000000000000000L;
                }
            }
        }
        return l;
    }

    public volatile Comparable maxValue()
    {
        return maxValue();
    }

    public Long maxValue()
    {
        return Long.valueOf(0x7fffffffffffffffL);
    }

    public volatile Comparable minValue()
    {
        return minValue();
    }

    public Long minValue()
    {
        return Long.valueOf(0x8000000000000000L);
    }

    public volatile Comparable next(Comparable comparable)
    {
        return next((Long)comparable);
    }

    public Long next(Long long1)
    {
        long l = long1.longValue();
        if (l == 0x7fffffffffffffffL)
        {
            return null;
        } else
        {
            return Long.valueOf(1L + l);
        }
    }

    public volatile Comparable previous(Comparable comparable)
    {
        return previous((Long)comparable);
    }

    public Long previous(Long long1)
    {
        long l = long1.longValue();
        if (l == 0x8000000000000000L)
        {
            return null;
        } else
        {
            return Long.valueOf(l - 1L);
        }
    }

    public String toString()
    {
        return "DiscreteDomain.longs()";
    }



    private _cls9()
    {
    }
}
