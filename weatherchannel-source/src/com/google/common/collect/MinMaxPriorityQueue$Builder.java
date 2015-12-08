// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            MinMaxPriorityQueue, Ordering

public static final class <init>
{

    private static final int UNSET_EXPECTED_SIZE = -1;
    private final Comparator comparator;
    private int expectedSize;
    private int maximumSize;

    private Ordering ordering()
    {
        return Ordering.from(comparator);
    }

    public MinMaxPriorityQueue create()
    {
        return create(((Iterable) (Collections.emptySet())));
    }

    public MinMaxPriorityQueue create(Iterable iterable)
    {
        MinMaxPriorityQueue minmaxpriorityqueue = new MinMaxPriorityQueue(this, MinMaxPriorityQueue.initialQueueSize(expectedSize, maximumSize, iterable), null);
        for (iterable = iterable.iterator(); iterable.hasNext(); minmaxpriorityqueue.offer(iterable.next())) { }
        return minmaxpriorityqueue;
    }

    public maximumSize expectedSize(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        expectedSize = i;
        return this;
    }

    public expectedSize maximumSize(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        maximumSize = i;
        return this;
    }



    private (Comparator comparator1)
    {
        expectedSize = -1;
        maximumSize = 0x7fffffff;
        comparator = (Comparator)Preconditions.checkNotNull(comparator1);
    }

    comparator(Comparator comparator1, comparator comparator2)
    {
        this(comparator1);
    }
}
