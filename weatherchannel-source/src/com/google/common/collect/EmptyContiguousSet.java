// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ContiguousSet, ImmutableList, EmptyImmutableSortedSet, Ordering, 
//            Iterators, DiscreteDomain, ImmutableSortedSet, UnmodifiableIterator, 
//            Range, BoundType

final class EmptyContiguousSet extends ContiguousSet
{
    private static final class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final DiscreteDomain domain;

        private Object readResolve()
        {
            return new EmptyContiguousSet(domain);
        }

        private SerializedForm(DiscreteDomain discretedomain)
        {
            domain = discretedomain;
        }

    }


    EmptyContiguousSet(DiscreteDomain discretedomain)
    {
        super(discretedomain);
    }

    public ImmutableList asList()
    {
        return ImmutableList.of();
    }

    ImmutableSortedSet createDescendingSet()
    {
        return new EmptyImmutableSortedSet(Ordering.natural().reverse());
    }

    public UnmodifiableIterator descendingIterator()
    {
        return Iterators.emptyIterator();
    }

    public volatile Iterator descendingIterator()
    {
        return descendingIterator();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Comparable first()
    {
        throw new NoSuchElementException();
    }

    public volatile Object first()
    {
        return first();
    }

    public int hashCode()
    {
        return 0;
    }

    ContiguousSet headSetImpl(Comparable comparable, boolean flag)
    {
        return this;
    }

    volatile ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return headSetImpl((Comparable)obj, flag);
    }

    int indexOf(Object obj)
    {
        return -1;
    }

    public ContiguousSet intersection(ContiguousSet contiguousset)
    {
        return this;
    }

    public boolean isEmpty()
    {
        return true;
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

    public Comparable last()
    {
        throw new NoSuchElementException();
    }

    public volatile Object last()
    {
        return last();
    }

    public Range range()
    {
        throw new NoSuchElementException();
    }

    public Range range(BoundType boundtype, BoundType boundtype1)
    {
        throw new NoSuchElementException();
    }

    public int size()
    {
        return 0;
    }

    ContiguousSet subSetImpl(Comparable comparable, boolean flag, Comparable comparable1, boolean flag1)
    {
        return this;
    }

    volatile ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subSetImpl((Comparable)obj, flag, (Comparable)obj1, flag1);
    }

    ContiguousSet tailSetImpl(Comparable comparable, boolean flag)
    {
        return this;
    }

    volatile ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return tailSetImpl((Comparable)obj, flag);
    }

    public String toString()
    {
        return "[]";
    }

    Object writeReplace()
    {
        return new SerializedForm(domain);
    }
}
