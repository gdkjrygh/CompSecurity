// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableRangeSet, TreeRangeSet, Range, RangeSet

public static class _cls9
{

    private final RangeSet rangeSet = TreeRangeSet.create();

    public _cls9 add(Range range)
    {
        if (range.isEmpty())
        {
            range = String.valueOf(String.valueOf(range));
            throw new IllegalArgumentException((new StringBuilder(range.length() + 33)).append("range must not be empty, but was ").append(range).toString());
        }
        if (!rangeSet.complement().encloses(range))
        {
            Iterator iterator = rangeSet.asRanges().iterator();
            while (iterator.hasNext()) 
            {
                Range range1 = (Range)iterator.next();
                boolean flag;
                if (!range1.isConnected(range) || range1.intersection(range).isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Ranges may not overlap, but received %s and %s", new Object[] {
                    range1, range
                });
            }
            throw new AssertionError("should have thrown an IAE above");
        } else
        {
            rangeSet.add(range);
            return this;
        }
    }

    public rangeSet addAll(RangeSet rangeset)
    {
        for (rangeset = rangeset.asRanges().iterator(); rangeset.hasNext(); add((Range)rangeset.next())) { }
        return this;
    }

    public ImmutableRangeSet build()
    {
        return ImmutableRangeSet.copyOf(rangeSet);
    }

    public _cls9()
    {
    }
}
