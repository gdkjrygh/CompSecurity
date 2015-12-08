// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            SortedMultiset, BoundType, Multiset

final class SortedMultisets
{
    static class ElementSet extends Multisets.ElementSet
        implements SortedSet
    {

        private final SortedMultiset multiset;

        public Comparator comparator()
        {
            return multiset().comparator();
        }

        public Object first()
        {
            return SortedMultisets.getElementOrThrow(multiset().firstEntry());
        }

        public SortedSet headSet(Object obj)
        {
            return multiset().headMultiset(obj, BoundType.OPEN).elementSet();
        }

        public Object last()
        {
            return SortedMultisets.getElementOrThrow(multiset().lastEntry());
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

        ElementSet(SortedMultiset sortedmultiset)
        {
            multiset = sortedmultiset;
        }
    }

    static class NavigableElementSet extends ElementSet
        implements NavigableSet
    {

        public Object ceiling(Object obj)
        {
            return SortedMultisets.getElementOrNull(multiset().tailMultiset(obj, BoundType.CLOSED).firstEntry());
        }

        public Iterator descendingIterator()
        {
            return descendingSet().iterator();
        }

        public NavigableSet descendingSet()
        {
            return new NavigableElementSet(multiset().descendingMultiset());
        }

        public Object floor(Object obj)
        {
            return SortedMultisets.getElementOrNull(multiset().headMultiset(obj, BoundType.CLOSED).lastEntry());
        }

        public NavigableSet headSet(Object obj, boolean flag)
        {
            return new NavigableElementSet(multiset().headMultiset(obj, BoundType.forBoolean(flag)));
        }

        public Object higher(Object obj)
        {
            return SortedMultisets.getElementOrNull(multiset().tailMultiset(obj, BoundType.OPEN).firstEntry());
        }

        public Object lower(Object obj)
        {
            return SortedMultisets.getElementOrNull(multiset().headMultiset(obj, BoundType.OPEN).lastEntry());
        }

        public Object pollFirst()
        {
            return SortedMultisets.getElementOrNull(multiset().pollFirstEntry());
        }

        public Object pollLast()
        {
            return SortedMultisets.getElementOrNull(multiset().pollLastEntry());
        }

        public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return new NavigableElementSet(multiset().subMultiset(obj, BoundType.forBoolean(flag), obj1, BoundType.forBoolean(flag1)));
        }

        public NavigableSet tailSet(Object obj, boolean flag)
        {
            return new NavigableElementSet(multiset().tailMultiset(obj, BoundType.forBoolean(flag)));
        }

        NavigableElementSet(SortedMultiset sortedmultiset)
        {
            super(sortedmultiset);
        }
    }


    private SortedMultisets()
    {
    }

    private static Object getElementOrNull(Multiset.Entry entry)
    {
        if (entry == null)
        {
            return null;
        } else
        {
            return entry.getElement();
        }
    }

    private static Object getElementOrThrow(Multiset.Entry entry)
    {
        if (entry == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return entry.getElement();
        }
    }


}
