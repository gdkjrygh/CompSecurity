// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multimap, SetMultimap, Multimaps, Iterators, 
//            Maps, Multiset, Sets

abstract class AbstractMultimap
    implements Multimap
{
    private class Entries extends Multimaps.Entries
    {

        final AbstractMultimap this$0;

        public Iterator iterator()
        {
            return entryIterator();
        }

        Multimap multimap()
        {
            return AbstractMultimap.this;
        }

        private Entries()
        {
            this$0 = AbstractMultimap.this;
            super();
        }

    }

    private class EntrySet extends Entries
        implements Set
    {

        final AbstractMultimap this$0;

        public boolean equals(Object obj)
        {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode()
        {
            return Sets.hashCodeImpl(this);
        }

        private EntrySet()
        {
            this$0 = AbstractMultimap.this;
            super();
        }

    }

    class Values extends AbstractCollection
    {

        final AbstractMultimap this$0;

        public void clear()
        {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsValue(obj);
        }

        public Iterator iterator()
        {
            return valueIterator();
        }

        public int size()
        {
            return AbstractMultimap.this.size();
        }

        Values()
        {
            this$0 = AbstractMultimap.this;
            super();
        }
    }


    private transient Map asMap;
    private transient Collection entries;
    private transient Set keySet;
    private transient Multiset keys;
    private transient Collection values;

    AbstractMultimap()
    {
    }

    public Map asMap()
    {
        Map map1 = asMap;
        Map map = map1;
        if (map1 == null)
        {
            map = createAsMap();
            asMap = map;
        }
        return map;
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        obj = (Collection)asMap().get(obj);
        return obj != null && ((Collection) (obj)).contains(obj1);
    }

    public boolean containsValue(Object obj)
    {
        for (Iterator iterator = asMap().values().iterator(); iterator.hasNext();)
        {
            if (((Collection)iterator.next()).contains(obj))
            {
                return true;
            }
        }

        return false;
    }

    abstract Map createAsMap();

    Collection createEntries()
    {
        if (this instanceof SetMultimap)
        {
            return new EntrySet();
        } else
        {
            return new Entries();
        }
    }

    Set createKeySet()
    {
        return new Maps.KeySet(asMap());
    }

    Multiset createKeys()
    {
        return new Multimaps.Keys(this);
    }

    Collection createValues()
    {
        return new Values();
    }

    public Collection entries()
    {
        Collection collection1 = entries;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createEntries();
            entries = collection;
        }
        return collection;
    }

    abstract Iterator entryIterator();

    public boolean equals(Object obj)
    {
        return Multimaps.equalsImpl(this, obj);
    }

    public int hashCode()
    {
        return asMap().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        Set set1 = keySet;
        Set set = set1;
        if (set1 == null)
        {
            set = createKeySet();
            keySet = set;
        }
        return set;
    }

    public Multiset keys()
    {
        Multiset multiset1 = keys;
        Multiset multiset = multiset1;
        if (multiset1 == null)
        {
            multiset = createKeys();
            keys = multiset;
        }
        return multiset;
    }

    public boolean put(Object obj, Object obj1)
    {
        return get(obj).add(obj1);
    }

    public boolean putAll(Multimap multimap)
    {
        boolean flag = false;
        for (multimap = multimap.entries().iterator(); multimap.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)multimap.next();
            flag |= put(entry.getKey(), entry.getValue());
        }

        return flag;
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if (!(iterable instanceof Collection)) goto _L2; else goto _L1
_L1:
        iterable = (Collection)iterable;
        if (iterable.isEmpty() || !get(obj).addAll(iterable)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        iterable = iterable.iterator();
        if (!iterable.hasNext() || !Iterators.addAll(get(obj), iterable))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean remove(Object obj, Object obj1)
    {
        obj = (Collection)asMap().get(obj);
        return obj != null && ((Collection) (obj)).remove(obj1);
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        Collection collection = removeAll(obj);
        putAll(obj, iterable);
        return collection;
    }

    public String toString()
    {
        return asMap().toString();
    }

    Iterator valueIterator()
    {
        return Maps.valueIterator(entries().iterator());
    }

    public Collection values()
    {
        Collection collection1 = values;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createValues();
            values = collection;
        }
        return collection;
    }
}
