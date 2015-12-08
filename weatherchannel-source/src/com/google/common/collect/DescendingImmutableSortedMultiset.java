// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMultiset, ImmutableSortedSet, ImmutableSet, ImmutableList, 
//            SortedMultiset, BoundType

final class DescendingImmutableSortedMultiset extends ImmutableSortedMultiset
{

    private final transient ImmutableSortedMultiset forward;

    DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutablesortedmultiset)
    {
        forward = immutablesortedmultiset;
    }

    public int count(Object obj)
    {
        return forward.count(obj);
    }

    public ImmutableSortedMultiset descendingMultiset()
    {
        return forward;
    }

    public volatile SortedMultiset descendingMultiset()
    {
        return descendingMultiset();
    }

    public ImmutableSortedSet elementSet()
    {
        return forward.elementSet().descendingSet();
    }

    public volatile NavigableSet elementSet()
    {
        return elementSet();
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    public volatile SortedSet elementSet()
    {
        return elementSet();
    }

    public Multiset.Entry firstEntry()
    {
        return forward.lastEntry();
    }

    Multiset.Entry getEntry(int i)
    {
        return (Multiset.Entry)forward.entrySet().asList().reverse().get(i);
    }

    public ImmutableSortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return forward.tailMultiset(obj, boundtype).descendingMultiset();
    }

    public volatile SortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return headMultiset(obj, boundtype);
    }

    boolean isPartialView()
    {
        return forward.isPartialView();
    }

    public Multiset.Entry lastEntry()
    {
        return forward.firstEntry();
    }

    public int size()
    {
        return forward.size();
    }

    public ImmutableSortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return forward.headMultiset(obj, boundtype).descendingMultiset();
    }

    public volatile SortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return tailMultiset(obj, boundtype);
    }
}
