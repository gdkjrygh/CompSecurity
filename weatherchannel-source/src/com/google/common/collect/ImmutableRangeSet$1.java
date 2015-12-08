// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, ImmutableRangeSet, Range

class  extends ImmutableList
{

    final ImmutableRangeSet this$0;
    final int val$fromIndex;
    final int val$length;
    final Range val$range;

    public Range get(int i)
    {
        Preconditions.checkElementIndex(i, val$length);
        if (i == 0 || i == val$length - 1)
        {
            return ((Range)ImmutableRangeSet.access$000(ImmutableRangeSet.this).get(val$fromIndex + i)).intersection(val$range);
        } else
        {
            return (Range)ImmutableRangeSet.access$000(ImmutableRangeSet.this).get(val$fromIndex + i);
        }
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
        return val$length;
    }

    ()
    {
        this$0 = final_immutablerangeset;
        val$length = i;
        val$fromIndex = j;
        val$range = Range.this;
        super();
    }
}
