// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Lists

public abstract class ForwardingList extends ForwardingCollection
    implements List
{

    protected ForwardingList()
    {
    }

    public void add(int i, Object obj)
    {
        _mthdelegate().add(i, obj);
    }

    public boolean addAll(int i, Collection collection)
    {
        return _mthdelegate().addAll(i, collection);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract List _mthdelegate();

    public boolean equals(Object obj)
    {
        return obj == this || _mthdelegate().equals(obj);
    }

    public Object get(int i)
    {
        return _mthdelegate().get(i);
    }

    public int hashCode()
    {
        return _mthdelegate().hashCode();
    }

    public int indexOf(Object obj)
    {
        return _mthdelegate().indexOf(obj);
    }

    public int lastIndexOf(Object obj)
    {
        return _mthdelegate().lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        return _mthdelegate().listIterator();
    }

    public ListIterator listIterator(int i)
    {
        return _mthdelegate().listIterator(i);
    }

    public Object remove(int i)
    {
        return _mthdelegate().remove(i);
    }

    public Object set(int i, Object obj)
    {
        return _mthdelegate().set(i, obj);
    }

    protected boolean standardAdd(Object obj)
    {
        add(size(), obj);
        return true;
    }

    protected boolean standardAddAll(int i, Iterable iterable)
    {
        return Lists.addAllImpl(this, i, iterable);
    }

    protected boolean standardEquals(Object obj)
    {
        return Lists.equalsImpl(this, obj);
    }

    protected int standardHashCode()
    {
        return Lists.hashCodeImpl(this);
    }

    protected int standardIndexOf(Object obj)
    {
        return Lists.indexOfImpl(this, obj);
    }

    protected Iterator standardIterator()
    {
        return listIterator();
    }

    protected int standardLastIndexOf(Object obj)
    {
        return Lists.lastIndexOfImpl(this, obj);
    }

    protected ListIterator standardListIterator()
    {
        return listIterator(0);
    }

    protected ListIterator standardListIterator(int i)
    {
        return Lists.listIteratorImpl(this, i);
    }

    protected List standardSubList(int i, int j)
    {
        return Lists.subListImpl(this, i, j);
    }

    public List subList(int i, int j)
    {
        return _mthdelegate().subList(i, j);
    }
}
