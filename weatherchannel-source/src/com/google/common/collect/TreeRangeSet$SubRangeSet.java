// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            TreeRangeSet, Range, ImmutableRangeSet, RangeSet

private final class restriction extends TreeRangeSet
{

    private final Range restriction;
    final TreeRangeSet this$0;

    public void add(Range range)
    {
        Preconditions.checkArgument(restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", new Object[] {
            range, restriction
        });
        super.add(range);
    }

    public void clear()
    {
        TreeRangeSet.this.remove(restriction);
    }

    public boolean contains(Comparable comparable)
    {
        return restriction.contains(comparable) && TreeRangeSet.this.contains(comparable);
    }

    public boolean encloses(Range range)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!restriction.isEmpty())
        {
            flag = flag1;
            if (restriction.encloses(range))
            {
                range = TreeRangeSet.access$600(TreeRangeSet.this, range);
                flag = flag1;
                if (range != null)
                {
                    flag = flag1;
                    if (!range.intersection(restriction).isEmpty())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public Range rangeContaining(Comparable comparable)
    {
        if (restriction.contains(comparable))
        {
            if ((comparable = TreeRangeSet.this.rangeContaining(comparable)) != null)
            {
                return comparable.intersection(restriction);
            }
        }
        return null;
    }

    public void remove(Range range)
    {
        if (range.isConnected(restriction))
        {
            TreeRangeSet.this.remove(range.intersection(restriction));
        }
    }

    public RangeSet subRangeSet(Range range)
    {
        if (range.encloses(restriction))
        {
            return this;
        }
        if (range.isConnected(restriction))
        {
            return new <init>(restriction.intersection(range));
        } else
        {
            return ImmutableRangeSet.of();
        }
    }

    angesByLowerBound(Range range)
    {
        this$0 = TreeRangeSet.this;
        super(new angesByLowerBound(Range.all(), range, rangesByLowerBound, null), null);
        restriction = range;
    }
}
