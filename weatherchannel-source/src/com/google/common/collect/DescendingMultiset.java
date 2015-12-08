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
//            ForwardingMultiset, SortedMultiset, Ordering, Multisets, 
//            Multiset, BoundType

abstract class DescendingMultiset extends ForwardingMultiset
    implements SortedMultiset
{

    private transient Comparator comparator;
    private transient NavigableSet elementSet;
    private transient Set entrySet;

    DescendingMultiset()
    {
    }

    public Comparator comparator()
    {
        Comparator comparator1 = comparator;
        Object obj = comparator1;
        if (comparator1 == null)
        {
            obj = Ordering.from(forwardMultiset().comparator()).reverse();
            comparator = ((Comparator) (obj));
        }
        return ((Comparator) (obj));
    }

    Set createEntrySet()
    {
        return new Multisets.EntrySet() {

            final DescendingMultiset this$0;

            public Iterator iterator()
            {
                return entryIterator();
            }

            Multiset multiset()
            {
                return DescendingMultiset.this;
            }

            public int size()
            {
                return forwardMultiset().entrySet().size();
            }

            
            {
                this$0 = DescendingMultiset.this;
                super();
            }
        };
    }

    protected Multiset _mthdelegate()
    {
        return forwardMultiset();
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    public SortedMultiset descendingMultiset()
    {
        return forwardMultiset();
    }

    public NavigableSet elementSet()
    {
        NavigableSet navigableset = elementSet;
        Object obj = navigableset;
        if (navigableset == null)
        {
            obj = new SortedMultisets.NavigableElementSet(this);
            elementSet = ((NavigableSet) (obj));
        }
        return ((NavigableSet) (obj));
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    public volatile SortedSet elementSet()
    {
        return elementSet();
    }

    abstract Iterator entryIterator();

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = createEntrySet();
            entrySet = set;
        }
        return set;
    }

    public Multiset.Entry firstEntry()
    {
        return forwardMultiset().lastEntry();
    }

    abstract SortedMultiset forwardMultiset();

    public SortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return forwardMultiset().tailMultiset(obj, boundtype).descendingMultiset();
    }

    public Iterator iterator()
    {
        return Multisets.iteratorImpl(this);
    }

    public Multiset.Entry lastEntry()
    {
        return forwardMultiset().firstEntry();
    }

    public Multiset.Entry pollFirstEntry()
    {
        return forwardMultiset().pollLastEntry();
    }

    public Multiset.Entry pollLastEntry()
    {
        return forwardMultiset().pollFirstEntry();
    }

    public SortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        return forwardMultiset().subMultiset(obj1, boundtype1, obj, boundtype).descendingMultiset();
    }

    public SortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return forwardMultiset().headMultiset(obj, boundtype).descendingMultiset();
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
        return entrySet().toString();
    }
}
