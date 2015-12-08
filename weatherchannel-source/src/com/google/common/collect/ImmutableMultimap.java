// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, ImmutableListMultimap, ImmutableMap, ImmutableCollection, 
//            ImmutableMultiset, Multimap, Multiset, UnmodifiableIterator, 
//            ImmutableSet, Lists, Ordering, CollectPreconditions, 
//            Iterables, AbstractMapBasedMultimap, Serialization, ImmutableSetMultimap, 
//            Iterators, Maps, ImmutableList, Multisets

public abstract class ImmutableMultimap extends AbstractMultimap
    implements Serializable
{
    public static class Builder
    {

        Multimap builderMultimap;
        Comparator keyComparator;
        Comparator valueComparator;

        public ImmutableMultimap build()
        {
            if (valueComparator != null)
            {
                for (Iterator iterator = builderMultimap.asMap().values().iterator(); iterator.hasNext(); Collections.sort((List)(Collection)iterator.next(), valueComparator)) { }
            }
            if (keyComparator != null)
            {
                BuilderMultimap buildermultimap = new BuilderMultimap();
                Object obj = Lists.newArrayList(builderMultimap.asMap().entrySet());
                Collections.sort(((List) (obj)), Ordering.from(keyComparator).onKeys());
                java.util.Map.Entry entry;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); buildermultimap.putAll(entry.getKey(), (Iterable)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                }

                builderMultimap = buildermultimap;
            }
            return ImmutableMultimap.copyOf(builderMultimap);
        }

        public Builder orderKeysBy(Comparator comparator)
        {
            keyComparator = (Comparator)Preconditions.checkNotNull(comparator);
            return this;
        }

        public Builder orderValuesBy(Comparator comparator)
        {
            valueComparator = (Comparator)Preconditions.checkNotNull(comparator);
            return this;
        }

        public Builder put(Object obj, Object obj1)
        {
            CollectPreconditions.checkEntryNotNull(obj, obj1);
            builderMultimap.put(obj, obj1);
            return this;
        }

        public Builder put(java.util.Map.Entry entry)
        {
            return put(entry.getKey(), entry.getValue());
        }

        public Builder putAll(Multimap multimap)
        {
            java.util.Map.Entry entry;
            for (multimap = multimap.asMap().entrySet().iterator(); multimap.hasNext(); putAll(entry.getKey(), (Iterable)entry.getValue()))
            {
                entry = (java.util.Map.Entry)multimap.next();
            }

            return this;
        }

        public Builder putAll(Object obj, Iterable iterable)
        {
            if (obj == null)
            {
                obj = String.valueOf(Iterables.toString(iterable));
                if (((String) (obj)).length() != 0)
                {
                    obj = "null key in entry: null=".concat(((String) (obj)));
                } else
                {
                    obj = new String("null key in entry: null=");
                }
                throw new NullPointerException(((String) (obj)));
            }
            Collection collection = builderMultimap.get(obj);
            Object obj1;
            for (iterable = iterable.iterator(); iterable.hasNext(); collection.add(obj1))
            {
                obj1 = iterable.next();
                CollectPreconditions.checkEntryNotNull(obj, obj1);
            }

            return this;
        }

        public transient Builder putAll(Object obj, Object aobj[])
        {
            return putAll(obj, ((Iterable) (Arrays.asList(aobj))));
        }

        public Builder()
        {
            builderMultimap = new BuilderMultimap();
        }
    }

    private static class BuilderMultimap extends AbstractMapBasedMultimap
    {

        private static final long serialVersionUID = 0L;

        Collection createCollection()
        {
            return Lists.newArrayList();
        }

        BuilderMultimap()
        {
            super(new LinkedHashMap());
        }
    }

    private static class EntryCollection extends ImmutableCollection
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMultimap multimap;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return multimap.containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        boolean isPartialView()
        {
            return multimap.isPartialView();
        }

        public UnmodifiableIterator iterator()
        {
            return multimap.entryIterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return multimap.size();
        }

        EntryCollection(ImmutableMultimap immutablemultimap)
        {
            multimap = immutablemultimap;
        }
    }

    static class FieldSettersHolder
    {

        static final Serialization.FieldSetter EMPTY_SET_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ImmutableSetMultimap, "emptySet");
        static final Serialization.FieldSetter MAP_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ImmutableMultimap, "map");
        static final Serialization.FieldSetter SIZE_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ImmutableMultimap, "size");


        FieldSettersHolder()
        {
        }
    }

    private abstract class Itr extends UnmodifiableIterator
    {

        Object key;
        final Iterator mapIterator;
        final ImmutableMultimap this$0;
        Iterator valueIterator;

        public boolean hasNext()
        {
            return mapIterator.hasNext() || valueIterator.hasNext();
        }

        public Object next()
        {
            if (!valueIterator.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)mapIterator.next();
                key = entry.getKey();
                valueIterator = ((Collection)entry.getValue()).iterator();
            }
            return output(key, valueIterator.next());
        }

        abstract Object output(Object obj, Object obj1);

        private Itr()
        {
            this$0 = ImmutableMultimap.this;
            super();
            mapIterator = asMap().entrySet().iterator();
            key = null;
            valueIterator = Iterators.emptyIterator();
        }

    }

    class Keys extends ImmutableMultiset
    {

        final ImmutableMultimap this$0;

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public int count(Object obj)
        {
            obj = (Collection)map.get(obj);
            if (obj == null)
            {
                return 0;
            } else
            {
                return ((Collection) (obj)).size();
            }
        }

        public Set elementSet()
        {
            return keySet();
        }

        Multiset.Entry getEntry(int i)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.entrySet().asList().get(i);
            return Multisets.immutableEntry(entry.getKey(), ((Collection)entry.getValue()).size());
        }

        boolean isPartialView()
        {
            return true;
        }

        public int size()
        {
            return ImmutableMultimap.this.size();
        }

        Keys()
        {
            this$0 = ImmutableMultimap.this;
            super();
        }
    }

    private static final class Values extends ImmutableCollection
    {

        private static final long serialVersionUID = 0L;
        private final transient ImmutableMultimap multimap;

        public boolean contains(Object obj)
        {
            return multimap.containsValue(obj);
        }

        int copyIntoArray(Object aobj[], int i)
        {
            for (Iterator iterator1 = multimap.map.values().iterator(); iterator1.hasNext();)
            {
                i = ((ImmutableCollection)iterator1.next()).copyIntoArray(aobj, i);
            }

            return i;
        }

        boolean isPartialView()
        {
            return true;
        }

        public UnmodifiableIterator iterator()
        {
            return multimap.valueIterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return multimap.size();
        }

        Values(ImmutableMultimap immutablemultimap)
        {
            multimap = immutablemultimap;
        }
    }


    private static final long serialVersionUID = 0L;
    final transient ImmutableMap map;
    final transient int size;

    ImmutableMultimap(ImmutableMap immutablemap, int i)
    {
        map = immutablemap;
        size = i;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableMultimap copyOf(Multimap multimap)
    {
        if (multimap instanceof ImmutableMultimap)
        {
            ImmutableMultimap immutablemultimap = (ImmutableMultimap)multimap;
            if (!immutablemultimap.isPartialView())
            {
                return immutablemultimap;
            }
        }
        return ImmutableListMultimap.copyOf(multimap);
    }

    public static ImmutableMultimap of()
    {
        return ImmutableListMultimap.of();
    }

    public static ImmutableMultimap of(Object obj, Object obj1)
    {
        return ImmutableListMultimap.of(obj, obj1);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3, obj4, obj5);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public ImmutableMap asMap()
    {
        return map;
    }

    public volatile Map asMap()
    {
        return asMap();
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public volatile boolean containsEntry(Object obj, Object obj1)
    {
        return super.containsEntry(obj, obj1);
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return obj != null && super.containsValue(obj);
    }

    Map createAsMap()
    {
        throw new AssertionError("should never be called");
    }

    ImmutableCollection createEntries()
    {
        return new EntryCollection(this);
    }

    volatile Collection createEntries()
    {
        return createEntries();
    }

    ImmutableMultiset createKeys()
    {
        return new Keys();
    }

    volatile Multiset createKeys()
    {
        return createKeys();
    }

    ImmutableCollection createValues()
    {
        return new Values(this);
    }

    volatile Collection createValues()
    {
        return createValues();
    }

    public ImmutableCollection entries()
    {
        return (ImmutableCollection)super.entries();
    }

    public volatile Collection entries()
    {
        return entries();
    }

    UnmodifiableIterator entryIterator()
    {
        return new Itr() {

            final ImmutableMultimap this$0;

            volatile Object output(Object obj, Object obj1)
            {
                return output(obj, obj1);
            }

            java.util.Map.Entry output(Object obj, Object obj1)
            {
                return Maps.immutableEntry(obj, obj1);
            }

            
            {
                this$0 = ImmutableMultimap.this;
                super();
            }
        };
    }

    volatile Iterator entryIterator()
    {
        return entryIterator();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public abstract ImmutableCollection get(Object obj);

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public abstract ImmutableMultimap inverse();

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    boolean isPartialView()
    {
        return map.isPartialView();
    }

    public ImmutableSet keySet()
    {
        return map.keySet();
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public ImmutableMultiset keys()
    {
        return (ImmutableMultiset)super.keys();
    }

    public volatile Multiset keys()
    {
        return keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Multimap multimap)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableCollection removeAll(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public ImmutableCollection replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public int size()
    {
        return size;
    }

    public volatile String toString()
    {
        return super.toString();
    }

    UnmodifiableIterator valueIterator()
    {
        return new Itr() {

            final ImmutableMultimap this$0;

            Object output(Object obj, Object obj1)
            {
                return obj1;
            }

            
            {
                this$0 = ImmutableMultimap.this;
                super();
            }
        };
    }

    volatile Iterator valueIterator()
    {
        return valueIterator();
    }

    public ImmutableCollection values()
    {
        return (ImmutableCollection)super.values();
    }

    public volatile Collection values()
    {
        return values();
    }
}
