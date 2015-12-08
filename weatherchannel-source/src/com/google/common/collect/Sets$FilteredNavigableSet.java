// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.NavigableSet;

// Referenced classes of package com.google.common.collect:
//            Sets, Iterables, Iterators

private static class it> extends it>
    implements NavigableSet
{

    public Object ceiling(Object obj)
    {
        return Iterables.getFirst(tailSet(obj, true), null);
    }

    public Iterator descendingIterator()
    {
        return Iterators.filter(unfiltered().descendingIterator(), predicate);
    }

    public NavigableSet descendingSet()
    {
        return Sets.filter(unfiltered().descendingSet(), predicate);
    }

    public Object floor(Object obj)
    {
        return Iterators.getNext(headSet(obj, true).descendingIterator(), null);
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return Sets.filter(unfiltered().headSet(obj, flag), predicate);
    }

    public Object higher(Object obj)
    {
        return Iterables.getFirst(tailSet(obj, false), null);
    }

    public Object last()
    {
        return descendingIterator().next();
    }

    public Object lower(Object obj)
    {
        return Iterators.getNext(headSet(obj, false).descendingIterator(), null);
    }

    public Object pollFirst()
    {
        return Iterables.removeFirstMatching(unfiltered(), predicate);
    }

    public Object pollLast()
    {
        return Iterables.removeFirstMatching(unfiltered().descendingSet(), predicate);
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return Sets.filter(unfiltered().subSet(obj, flag, obj1, flag1), predicate);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return Sets.filter(unfiltered().tailSet(obj, flag), predicate);
    }

    NavigableSet unfiltered()
    {
        return (NavigableSet)unfiltered;
    }

    _cls9(NavigableSet navigableset, Predicate predicate)
    {
        super(navigableset, predicate);
    }
}
