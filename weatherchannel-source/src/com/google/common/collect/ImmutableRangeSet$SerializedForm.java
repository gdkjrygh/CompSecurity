// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableRangeSet, ImmutableList, Range

private static final class ranges
    implements Serializable
{

    private final ImmutableList ranges;

    Object readResolve()
    {
        if (ranges.isEmpty())
        {
            return ImmutableRangeSet.of();
        }
        if (ranges.equals(ImmutableList.of(Range.all())))
        {
            return ImmutableRangeSet.all();
        } else
        {
            return new ImmutableRangeSet(ranges);
        }
    }

    (ImmutableList immutablelist)
    {
        ranges = immutablelist;
    }
}
