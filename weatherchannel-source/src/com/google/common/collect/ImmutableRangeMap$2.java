// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            ImmutableRangeMap, Range, ImmutableList, RangeMap

class nit> extends ImmutableRangeMap
{

    final ImmutableRangeMap this$0;
    final ImmutableRangeMap val$outer;
    final Range val$range;

    public volatile Map asMapOfRanges()
    {
        return super.asMapOfRanges();
    }

    public ImmutableRangeMap subRangeMap(Range range1)
    {
        if (val$range.isConnected(range1))
        {
            return val$outer.subRangeMap(range1.intersection(val$range));
        } else
        {
            return ImmutableRangeMap.of();
        }
    }

    public volatile RangeMap subRangeMap(Range range1)
    {
        return subRangeMap(range1);
    }

    (Range range1, ImmutableRangeMap immutablerangemap1)
    {
        this$0 = final_immutablerangemap;
        val$range = range1;
        val$outer = immutablerangemap1;
        super(final_immutablelist, ImmutableList.this);
    }
}
