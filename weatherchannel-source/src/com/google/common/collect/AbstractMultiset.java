// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, Multisets, Iterators

abstract class AbstractMultiset extends AbstractCollection
    implements Multiset
{
    class ElementSet extends Multisets.ElementSet
    {

        final AbstractMultiset this$0;

        Multiset multiset()
        {
            return AbstractMultiset.this;
        }

        ElementSet()
        {
            this$0 = AbstractMultiset.this;
            super();
        }
    }

    class EntrySet extends Multisets.EntrySet
    {

        final AbstractMultiset this$0;

        public Iterator iterator()
        {
            return entryIterator();
        }

        Multiset multiset()
        {
            return AbstractMultiset.this;
        }

        public int size()
        {
            return distinctElements();
        }

        EntrySet()
        {
            this$0 = AbstractMultiset.this;
            super();
        }
    }


    private transient Set elementSet;
    private transient Set entrySet;

    AbstractMultiset()
    {
    }

    public int add(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        add(obj, 1);
        return true;
    }

    public boolean addAll(Collection collection)
    {
        return Multisets.addAllImpl(this, collection);
    }

    public void clear()
    {
        Iterators.clear(entryIterator());
    }

    public boolean contains(Object obj)
    {
        return count(obj) > 0;
    }

    public int count(Object obj)
    {
        for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
            if (Objects.equal(entry.getElement(), obj))
            {
                return entry.getCount();
            }
        }

        return 0;
    }

    Set createElementSet()
    {
        return new ElementSet();
    }

    Set createEntrySet()
    {
        return new EntrySet();
    }

    abstract int distinctElements();

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

    public boolean equals(Object obj)
    {
        return Multisets.equalsImpl(this, obj);
    }

    public int hashCode()
    {
        return entrySet().hashCode();
    }

    public boolean isEmpty()
    {
        return entrySet().isEmpty();
    }

    public Iterator iterator()
    {
        return Multisets.iteratorImpl(this);
    }

    public int remove(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj)
    {
        return remove(obj, 1) > 0;
    }

    public boolean removeAll(Collection collection)
    {
        return Multisets.removeAllImpl(this, collection);
    }

    public boolean retainAll(Collection collection)
    {
        return Multisets.retainAllImpl(this, collection);
    }

    public int setCount(Object obj, int i)
    {
        return Multisets.setCountImpl(this, obj, i);
    }

    public boolean setCount(Object obj, int i, int j)
    {
        return Multisets.setCountImpl(this, obj, i, j);
    }

    public int size()
    {
        return Multisets.sizeImpl(this);
    }

    public String toString()
    {
        return entrySet().toString();
    }
}
