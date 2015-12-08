// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, ImmutableRangeMap, Range

class  extends ImmutableList
{

    final ImmutableRangeMap this$0;
    final int val$len;
    final int val$off;
    final Range val$range;

    public Range get(int i)
    {
        Preconditions.checkElementIndex(i, val$len);
        if (i == 0 || i == val$len - 1)
        {
            return ((Range)ImmutableRangeMap.access$000(ImmutableRangeMap.this).get(val$off + i)).intersection(val$range);
        } else
        {
            return (Range)ImmutableRangeMap.access$000(ImmutableRangeMap.this).get(val$off + i);
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
        return val$len;
    }

    ()
    {
        this$0 = final_immutablerangemap;
        val$len = i;
        val$off = j;
        val$range = Range.this;
        super();
    }
}
