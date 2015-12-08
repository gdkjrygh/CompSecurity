// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ForwardingSortedSet, Iterators

public abstract class ForwardingNavigableSet extends ForwardingSortedSet
    implements NavigableSet
{
    protected class StandardDescendingSet extends Sets.DescendingSet
    {

        final ForwardingNavigableSet this$0;

        public StandardDescendingSet()
        {
            this$0 = ForwardingNavigableSet.this;
            super(ForwardingNavigableSet.this);
        }
    }


    protected ForwardingNavigableSet()
    {
    }

    public Object ceiling(Object obj)
    {
        return _mthdelegate().ceiling(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract NavigableSet _mthdelegate();

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
        return _mthdelegate().descendingIterator();
    }

    public NavigableSet descendingSet()
    {
        return _mthdelegate().descendingSet();
    }

    public Object floor(Object obj)
    {
        return _mthdelegate().floor(obj);
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return _mthdelegate().headSet(obj, flag);
    }

    public Object higher(Object obj)
    {
        return _mthdelegate().higher(obj);
    }

    public Object lower(Object obj)
    {
        return _mthdelegate().lower(obj);
    }

    public Object pollFirst()
    {
        return _mthdelegate().pollFirst();
    }

    public Object pollLast()
    {
        return _mthdelegate().pollLast();
    }

    protected Object standardCeiling(Object obj)
    {
        return Iterators.getNext(tailSet(obj, true).iterator(), null);
    }

    protected Object standardFirst()
    {
        return iterator().next();
    }

    protected Object standardFloor(Object obj)
    {
        return Iterators.getNext(headSet(obj, true).descendingIterator(), null);
    }

    protected SortedSet standardHeadSet(Object obj)
    {
        return headSet(obj, false);
    }

    protected Object standardHigher(Object obj)
    {
        return Iterators.getNext(tailSet(obj, false).iterator(), null);
    }

    protected Object standardLast()
    {
        return descendingIterator().next();
    }

    protected Object standardLower(Object obj)
    {
        return Iterators.getNext(headSet(obj, false).descendingIterator(), null);
    }

    protected Object standardPollFirst()
    {
        return Iterators.pollNext(iterator());
    }

    protected Object standardPollLast()
    {
        return Iterators.pollNext(descendingIterator());
    }

    protected NavigableSet standardSubSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return tailSet(obj, flag).headSet(obj1, flag1);
    }

    protected SortedSet standardSubSet(Object obj, Object obj1)
    {
        return subSet(obj, true, obj1, false);
    }

    protected SortedSet standardTailSet(Object obj)
    {
        return tailSet(obj, true);
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return _mthdelegate().subSet(obj, flag, obj1, flag1);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return _mthdelegate().tailSet(obj, flag);
    }
}
