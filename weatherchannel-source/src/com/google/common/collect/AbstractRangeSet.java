// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            RangeSet, Range

abstract class AbstractRangeSet
    implements RangeSet
{

    AbstractRangeSet()
    {
    }

    public void add(Range range)
    {
        throw new UnsupportedOperationException();
    }

    public void addAll(RangeSet rangeset)
    {
        for (rangeset = rangeset.asRanges().iterator(); rangeset.hasNext(); add((Range)rangeset.next())) { }
    }

    public void clear()
    {
        remove(Range.all());
    }

    public boolean contains(Comparable comparable)
    {
        return rangeContaining(comparable) != null;
    }

    public abstract boolean encloses(Range range);

    public boolean enclosesAll(RangeSet rangeset)
    {
        for (rangeset = rangeset.asRanges().iterator(); rangeset.hasNext();)
        {
            if (!encloses((Range)rangeset.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof RangeSet)
        {
            obj = (RangeSet)obj;
            return asRanges().equals(((RangeSet) (obj)).asRanges());
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return asRanges().hashCode();
    }

    public boolean isEmpty()
    {
        return asRanges().isEmpty();
    }

    public abstract Range rangeContaining(Comparable comparable);

    public void remove(Range range)
    {
        throw new UnsupportedOperationException();
    }

    public void removeAll(RangeSet rangeset)
    {
        for (rangeset = rangeset.asRanges().iterator(); rangeset.hasNext(); remove((Range)rangeset.next())) { }
    }

    public final String toString()
    {
        return asRanges().toString();
    }
}
