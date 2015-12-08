// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Multiset, Multisets, Iterators

public abstract class ForwardingMultiset extends ForwardingCollection
    implements Multiset
{
    protected class StandardElementSet extends Multisets.ElementSet
    {

        final ForwardingMultiset this$0;

        Multiset multiset()
        {
            return ForwardingMultiset.this;
        }

        public StandardElementSet()
        {
            this$0 = ForwardingMultiset.this;
            super();
        }
    }


    protected ForwardingMultiset()
    {
    }

    public int add(Object obj, int i)
    {
        return _mthdelegate().add(obj, i);
    }

    public int count(Object obj)
    {
        return _mthdelegate().count(obj);
    }

    protected abstract Multiset _mthdelegate();

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
        return _mthdelegate().elementSet();
    }

    public Set entrySet()
    {
        return _mthdelegate().entrySet();
    }

    public boolean equals(Object obj)
    {
        return obj == this || _mthdelegate().equals(obj);
    }

    public int hashCode()
    {
        return _mthdelegate().hashCode();
    }

    public int remove(Object obj, int i)
    {
        return _mthdelegate().remove(obj, i);
    }

    public int setCount(Object obj, int i)
    {
        return _mthdelegate().setCount(obj, i);
    }

    public boolean setCount(Object obj, int i, int j)
    {
        return _mthdelegate().setCount(obj, i, j);
    }

    protected boolean standardAdd(Object obj)
    {
        add(obj, 1);
        return true;
    }

    protected boolean standardAddAll(Collection collection)
    {
        return Multisets.addAllImpl(this, collection);
    }

    protected void standardClear()
    {
        Iterators.clear(entrySet().iterator());
    }

    protected boolean standardContains(Object obj)
    {
        return count(obj) > 0;
    }

    protected int standardCount(Object obj)
    {
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            if (Objects.equal(entry.getElement(), obj))
            {
                return entry.getCount();
            }
        }

        return 0;
    }

    protected boolean standardEquals(Object obj)
    {
        return Multisets.equalsImpl(this, obj);
    }

    protected int standardHashCode()
    {
        return entrySet().hashCode();
    }

    protected Iterator standardIterator()
    {
        return Multisets.iteratorImpl(this);
    }

    protected boolean standardRemove(Object obj)
    {
        return remove(obj, 1) > 0;
    }

    protected boolean standardRemoveAll(Collection collection)
    {
        return Multisets.removeAllImpl(this, collection);
    }

    protected boolean standardRetainAll(Collection collection)
    {
        return Multisets.retainAllImpl(this, collection);
    }

    protected int standardSetCount(Object obj, int i)
    {
        return Multisets.setCountImpl(this, obj, i);
    }

    protected boolean standardSetCount(Object obj, int i, int j)
    {
        return Multisets.setCountImpl(this, obj, i, j);
    }

    protected int standardSize()
    {
        return Multisets.sizeImpl(this);
    }

    protected String standardToString()
    {
        return entrySet().toString();
    }
}
