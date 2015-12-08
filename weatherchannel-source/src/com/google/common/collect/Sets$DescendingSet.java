// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ForwardingNavigableSet, Sets, Ordering

static class forward extends ForwardingNavigableSet
{

    private final NavigableSet forward;

    private static Ordering reverse(Comparator comparator1)
    {
        return Ordering.from(comparator1).reverse();
    }

    public Object ceiling(Object obj)
    {
        return forward.floor(obj);
    }

    public Comparator comparator()
    {
        Comparator comparator1 = forward.comparator();
        if (comparator1 == null)
        {
            return Ordering.natural().reverse();
        } else
        {
            return reverse(comparator1);
        }
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected NavigableSet _mthdelegate()
    {
        return forward;
    }

    protected volatile Set _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile SortedSet _mthdelegate()
    {
        return _mthdelegate();
    }

    public Iterator descendingIterator()
    {
        return forward.iterator();
    }

    public NavigableSet descendingSet()
    {
        return forward;
    }

    public Object first()
    {
        return forward.last();
    }

    public Object floor(Object obj)
    {
        return forward.ceiling(obj);
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return forward.tailSet(obj, flag).descendingSet();
    }

    public SortedSet headSet(Object obj)
    {
        return standardHeadSet(obj);
    }

    public Object higher(Object obj)
    {
        return forward.lower(obj);
    }

    public Iterator iterator()
    {
        return forward.descendingIterator();
    }

    public Object last()
    {
        return forward.first();
    }

    public Object lower(Object obj)
    {
        return forward.higher(obj);
    }

    public Object pollFirst()
    {
        return forward.pollLast();
    }

    public Object pollLast()
    {
        return forward.pollFirst();
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return forward.subSet(obj1, flag1, obj, flag).descendingSet();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return standardSubSet(obj, obj1);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return forward.headSet(obj, flag).descendingSet();
    }

    public SortedSet tailSet(Object obj)
    {
        return standardTailSet(obj);
    }

    public Object[] toArray()
    {
        return standardToArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return standardToArray(aobj);
    }

    public String toString()
    {
        return standardToString();
    }

    Set(NavigableSet navigableset)
    {
        forward = navigableset;
    }
}
