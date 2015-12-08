// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            SortedMultiset, Sets, Multisets, Multiset, 
//            BoundType

final class UnmodifiableSortedMultiset extends Multisets.UnmodifiableMultiset
    implements SortedMultiset
{

    private static final long serialVersionUID = 0L;
    private transient UnmodifiableSortedMultiset descendingMultiset;

    UnmodifiableSortedMultiset(SortedMultiset sortedmultiset)
    {
        super(sortedmultiset);
    }

    public Comparator comparator()
    {
        return _mthdelegate().comparator();
    }

    NavigableSet createElementSet()
    {
        return Sets.unmodifiableNavigableSet(_mthdelegate().elementSet());
    }

    volatile Set createElementSet()
    {
        return createElementSet();
    }

    protected volatile Multiset _mthdelegate()
    {
        return _mthdelegate();
    }

    protected SortedMultiset _mthdelegate()
    {
        return (SortedMultiset)super._mthdelegate();
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
        UnmodifiableSortedMultiset unmodifiablesortedmultiset = descendingMultiset;
        if (unmodifiablesortedmultiset == null)
        {
            unmodifiablesortedmultiset = new UnmodifiableSortedMultiset(_mthdelegate().descendingMultiset());
            unmodifiablesortedmultiset.descendingMultiset = this;
            descendingMultiset = unmodifiablesortedmultiset;
            return unmodifiablesortedmultiset;
        } else
        {
            return unmodifiablesortedmultiset;
        }
    }

    public NavigableSet elementSet()
    {
        return (NavigableSet)super.elementSet();
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
        return _mthdelegate().firstEntry();
    }

    public SortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return Multisets.unmodifiableSortedMultiset(_mthdelegate().headMultiset(obj, boundtype));
    }

    public Multiset.Entry lastEntry()
    {
        return _mthdelegate().lastEntry();
    }

    public Multiset.Entry pollFirstEntry()
    {
        throw new UnsupportedOperationException();
    }

    public Multiset.Entry pollLastEntry()
    {
        throw new UnsupportedOperationException();
    }

    public SortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        return Multisets.unmodifiableSortedMultiset(_mthdelegate().subMultiset(obj, boundtype, obj1, boundtype1));
    }

    public SortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return Multisets.unmodifiableSortedMultiset(_mthdelegate().tailMultiset(obj, boundtype));
    }
}
