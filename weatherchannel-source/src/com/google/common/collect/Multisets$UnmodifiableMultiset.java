// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMultiset, Multisets, Multiset, Iterators

static class delegate extends ForwardingMultiset
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Multiset _flddelegate;
    transient Set elementSet;
    transient Set entrySet;

    public int add(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    Set createElementSet()
    {
        return Collections.unmodifiableSet(_flddelegate.elementSet());
    }

    protected Multiset _mthdelegate()
    {
        return _flddelegate;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    public Set elementSet()
    {
        Set set1 = elementSet;
        Set set = set1;
        if (set1 == null)
        {
            set = createElementSet();
            elementSet = set;
        }
        return set;
    }

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = Collections.unmodifiableSet(_flddelegate.entrySet());
            entrySet = set;
        }
        return set;
    }

    public Iterator iterator()
    {
        return Iterators.unmodifiableIterator(_flddelegate.iterator());
    }

    public int remove(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public int setCount(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(Object obj, int i, int j)
    {
        throw new UnsupportedOperationException();
    }

    (Multiset multiset)
    {
        _flddelegate = multiset;
    }
}
