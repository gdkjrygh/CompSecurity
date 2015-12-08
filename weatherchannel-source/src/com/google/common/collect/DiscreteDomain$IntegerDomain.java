// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            DiscreteDomain

private static final class  extends DiscreteDomain
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
        return distance((Integer)comparable, (Integer)comparable1);
    }

    public long distance(Integer integer, Integer integer1)
    {
        return (long)integer1.intValue() - (long)integer.intValue();
    }

    public volatile Comparable maxValue()
    {
        return maxValue();
    }

    public Integer maxValue()
    {
        return Integer.valueOf(0x7fffffff);
    }

    public volatile Comparable minValue()
    {
        return minValue();
    }

    public Integer minValue()
    {
        return Integer.valueOf(0x80000000);
    }

    public volatile Comparable next(Comparable comparable)
    {
        return next((Integer)comparable);
    }

    public Integer next(Integer integer)
    {
        int i = integer.intValue();
        if (i == 0x7fffffff)
        {
            return null;
        } else
        {
            return Integer.valueOf(i + 1);
        }
    }

    public volatile Comparable previous(Comparable comparable)
    {
        return previous((Integer)comparable);
    }

    public Integer previous(Integer integer)
    {
        int i = integer.intValue();
        if (i == 0x80000000)
        {
            return null;
        } else
        {
            return Integer.valueOf(i - 1);
        }
    }

    public String toString()
    {
        return "DiscreteDomain.integers()";
    }



    private ()
    {
    }
}
