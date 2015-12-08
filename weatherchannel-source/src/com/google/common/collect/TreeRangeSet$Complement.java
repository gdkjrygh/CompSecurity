// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            TreeRangeSet, Range, RangeSet

private final class erBound extends TreeRangeSet
{

    final TreeRangeSet this$0;

    public void add(Range range)
    {
        TreeRangeSet.this.remove(range);
    }

    public RangeSet complement()
    {
        return TreeRangeSet.this;
    }

    public boolean contains(Comparable comparable)
    {
        return !TreeRangeSet.this.contains(comparable);
    }

    public void remove(Range range)
    {
        TreeRangeSet.this.add(range);
    }

    angesByLowerBound()
    {
        this$0 = TreeRangeSet.this;
        super(new angesByLowerBound(rangesByLowerBound), null);
    }
}
