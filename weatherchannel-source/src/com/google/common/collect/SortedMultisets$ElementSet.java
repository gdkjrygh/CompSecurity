// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            SortedMultisets, SortedMultiset, BoundType, Multiset

static class multiset extends multiset
    implements SortedSet
{

    private final SortedMultiset multiset;

    public Comparator comparator()
    {
        return multiset().comparator();
    }

    public Object first()
    {
        return SortedMultisets.access$000(multiset().firstEntry());
    }

    public SortedSet headSet(Object obj)
    {
        return multiset().headMultiset(obj, BoundType.OPEN).elementSet();
    }

    public Object last()
    {
        return SortedMultisets.access$000(multiset().lastEntry());
    }

    volatile Multiset multiset()
    {
        return multiset();
    }

    final SortedMultiset multiset()
    {
        return multiset;
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return multiset().subMultiset(obj, BoundType.CLOSED, obj1, BoundType.OPEN).elementSet();
    }

    public SortedSet tailSet(Object obj)
    {
        return multiset().tailMultiset(obj, BoundType.CLOSED).elementSet();
    }

    (SortedMultiset sortedmultiset)
    {
        multiset = sortedmultiset;
    }
}
