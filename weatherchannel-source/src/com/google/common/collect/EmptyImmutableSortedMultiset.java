// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMultiset, ImmutableSortedSet, ImmutableList, Multiset, 
//            Iterators, BoundType, SortedMultiset, UnmodifiableIterator

final class EmptyImmutableSortedMultiset extends ImmutableSortedMultiset
{

    private final ImmutableSortedSet elementSet;

    EmptyImmutableSortedMultiset(Comparator comparator)
    {
        elementSet = ImmutableSortedSet.emptySet(comparator);
    }

    public ImmutableList asList()
    {
        return ImmutableList.of();
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    int copyIntoArray(Object aobj[], int i)
    {
        return i;
    }

    public int count(Object obj)
    {
        return 0;
    }

    public ImmutableSortedSet elementSet()
    {
        return elementSet;
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

    public boolean equals(Object obj)
    {
        if (obj instanceof Multiset)
        {
            return ((Multiset)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Multiset.Entry firstEntry()
    {
        return null;
    }

    Multiset.Entry getEntry(int i)
    {
        throw new AssertionError("should never be called");
    }

    public ImmutableSortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(boundtype);
        return this;
    }

    public volatile SortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return headMultiset(obj, boundtype);
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.emptyIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public Multiset.Entry lastEntry()
    {
        return null;
    }

    public int size()
    {
        return 0;
    }

    public ImmutableSortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(boundtype);
        return this;
    }

    public volatile SortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return tailMultiset(obj, boundtype);
    }
}
