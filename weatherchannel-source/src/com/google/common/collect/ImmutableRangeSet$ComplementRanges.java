// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, ImmutableRangeSet, Range, Iterables, 
//            Cut

private final class size extends ImmutableList
{

    private final boolean positiveBoundedAbove;
    private final boolean positiveBoundedBelow;
    private final int size;
    final ImmutableRangeSet this$0;

    public Range get(int i)
    {
        Preconditions.checkElementIndex(i, size);
        Cut cut;
        Object obj;
        if (positiveBoundedBelow)
        {
            if (i == 0)
            {
                cut = Cut.belowAll();
            } else
            {
                cut = ((Range)ImmutableRangeSet.access$000(ImmutableRangeSet.this).get(i - 1)).upperBound;
            }
        } else
        {
            cut = ((Range)ImmutableRangeSet.access$000(ImmutableRangeSet.this).get(i)).upperBound;
        }
        if (positiveBoundedAbove && i == size - 1)
        {
            obj = Cut.aboveAll();
        } else
        {
            obj = ImmutableRangeSet.access$000(ImmutableRangeSet.this);
            int j;
            if (positiveBoundedBelow)
            {
                j = 0;
            } else
            {
                j = 1;
            }
            obj = ((Range)((ImmutableList) (obj)).get(j + i)).lowerBound;
        }
        return Range.create(cut, ((Cut) (obj)));
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    boolean isPartialView()
    {
        return true;
    }

    public int size()
    {
        return size;
    }

    ()
    {
        this$0 = ImmutableRangeSet.this;
        super();
        positiveBoundedBelow = ((Range)ImmutableRangeSet.access$000(ImmutableRangeSet.this).get(0)).hasLowerBound();
        positiveBoundedAbove = ((Range)Iterables.getLast(ImmutableRangeSet.access$000(ImmutableRangeSet.this))).hasUpperBound();
        int j = ImmutableRangeSet.access$000(ImmutableRangeSet.this).size() - 1;
        int i = j;
        if (positiveBoundedBelow)
        {
            i = j + 1;
        }
        j = i;
        if (positiveBoundedAbove)
        {
            j = i + 1;
        }
        size = j;
    }
}
