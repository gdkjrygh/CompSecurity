// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingObject, Iterators, Collections2, ObjectArrays

public abstract class ForwardingCollection extends ForwardingObject
    implements Collection
{

    protected ForwardingCollection()
    {
    }

    public boolean add(Object obj)
    {
        return _mthdelegate().add(obj);
    }

    public boolean addAll(Collection collection)
    {
        return _mthdelegate().addAll(collection);
    }

    public void clear()
    {
        _mthdelegate().clear();
    }

    public boolean contains(Object obj)
    {
        return _mthdelegate().contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return _mthdelegate().containsAll(collection);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract Collection _mthdelegate();

    public boolean isEmpty()
    {
        return _mthdelegate().isEmpty();
    }

    public Iterator iterator()
    {
        return _mthdelegate().iterator();
    }

    public boolean remove(Object obj)
    {
        return _mthdelegate().remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return _mthdelegate().removeAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return _mthdelegate().retainAll(collection);
    }

    public int size()
    {
        return _mthdelegate().size();
    }

    protected boolean standardAddAll(Collection collection)
    {
        return Iterators.addAll(this, collection.iterator());
    }

    protected void standardClear()
    {
        Iterators.clear(iterator());
    }

    protected boolean standardContains(Object obj)
    {
        return Iterators.contains(iterator(), obj);
    }

    protected boolean standardContainsAll(Collection collection)
    {
        return Collections2.containsAllImpl(this, collection);
    }

    protected boolean standardIsEmpty()
    {
        return !iterator().hasNext();
    }

    protected boolean standardRemove(Object obj)
    {
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            if (Objects.equal(iterator1.next(), obj))
            {
                iterator1.remove();
                return true;
            }
        }

        return false;
    }

    protected boolean standardRemoveAll(Collection collection)
    {
        return Iterators.removeAll(iterator(), collection);
    }

    protected boolean standardRetainAll(Collection collection)
    {
        return Iterators.retainAll(iterator(), collection);
    }

    protected Object[] standardToArray()
    {
        return toArray(new Object[size()]);
    }

    protected Object[] standardToArray(Object aobj[])
    {
        return ObjectArrays.toArrayImpl(this, aobj);
    }

    protected String standardToString()
    {
        return Collections2.toStringImpl(this);
    }

    public Object[] toArray()
    {
        return _mthdelegate().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return _mthdelegate().toArray(aobj);
    }
}
