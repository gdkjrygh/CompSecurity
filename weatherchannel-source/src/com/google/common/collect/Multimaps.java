// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ListMultimap, Multimap, SetMultimap, SortedSetMultimap, 
//            FilteredMultimap, FilteredEntryMultimap, FilteredSetMultimap, FilteredEntrySetMultimap, 
//            FilteredKeyListMultimap, FilteredKeyMultimap, Maps, FilteredKeySetMultimap, 
//            ImmutableListMultimap, Synchronized, ImmutableMultimap, ImmutableSetMultimap, 
//            AbstractListMultimap, AbstractMapBasedMultimap, AbstractSetMultimap, AbstractSortedSetMultimap, 
//            AbstractMultiset, CollectPreconditions, TransformedIterator, Multiset, 
//            AbstractMultimap, Lists, Collections2, Iterators, 
//            ForwardingMultimap, Multisets

public final class Multimaps
{
    static final class AsMap extends Maps.ImprovedAbstractMap
    {

        private final Multimap multimap;

        public void clear()
        {
            multimap.clear();
        }

        public boolean containsKey(Object obj)
        {
            return multimap.containsKey(obj);
        }

        protected Set createEntrySet()
        {
            return new EntrySet();
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Collection get(Object obj)
        {
            if (containsKey(obj))
            {
                return multimap.get(obj);
            } else
            {
                return null;
            }
        }

        public boolean isEmpty()
        {
            return multimap.isEmpty();
        }

        public Set keySet()
        {
            return multimap.keySet();
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Collection remove(Object obj)
        {
            if (containsKey(obj))
            {
                return multimap.removeAll(obj);
            } else
            {
                return null;
            }
        }

        void removeValuesForKey(Object obj)
        {
            multimap.keySet().remove(obj);
        }

        public int size()
        {
            return multimap.keySet().size();
        }


        AsMap(Multimap multimap1)
        {
            multimap = (Multimap)Preconditions.checkNotNull(multimap1);
        }
    }

    class AsMap.EntrySet extends Maps.EntrySet
    {

        final AsMap this$0;

        public Iterator iterator()
        {
            return Maps.asMapEntryIterator(multimap.keySet(), new Function() {

                final AsMap.EntrySet this$1;

                public volatile Object apply(Object obj)
                {
                    return apply(obj);
                }

                public Collection apply(Object obj)
                {
                    return multimap.get(obj);
                }

            
            {
                this$1 = AsMap.EntrySet.this;
                super();
            }
            });
        }

        Map map()
        {
            return AsMap.this;
        }

        public boolean remove(Object obj)
        {
            if (!contains(obj))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                removeValuesForKey(((java.util.Map.Entry) (obj)).getKey());
                return true;
            }
        }

        AsMap.EntrySet()
        {
            this$0 = AsMap.this;
            super();
        }
    }

    private static class CustomListMultimap extends AbstractListMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected volatile Collection createCollection()
        {
            return createCollection();
        }

        protected List createCollection()
        {
            return (List)factory.get();
        }

        CustomListMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    private static class CustomMultimap extends AbstractMapBasedMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected Collection createCollection()
        {
            return (Collection)factory.get();
        }

        CustomMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    private static class CustomSetMultimap extends AbstractSetMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected volatile Collection createCollection()
        {
            return createCollection();
        }

        protected Set createCollection()
        {
            return (Set)factory.get();
        }

        CustomSetMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    private static class CustomSortedSetMultimap extends AbstractSortedSetMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;
        transient Comparator valueComparator;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            valueComparator = ((SortedSet)factory.get()).comparator();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected volatile Collection createCollection()
        {
            return createCollection();
        }

        protected volatile Set createCollection()
        {
            return createCollection();
        }

        protected SortedSet createCollection()
        {
            return (SortedSet)factory.get();
        }

        public Comparator valueComparator()
        {
            return valueComparator;
        }

        CustomSortedSetMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
            valueComparator = ((SortedSet)supplier.get()).comparator();
        }
    }

    static abstract class Entries extends AbstractCollection
    {

        public void clear()
        {
            multimap().clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return multimap().containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        abstract Multimap multimap();

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return multimap().remove(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return multimap().size();
        }

        Entries()
        {
        }
    }

    static class Keys extends AbstractMultiset
    {

        final Multimap multimap;

        public void clear()
        {
            multimap.clear();
        }

        public boolean contains(Object obj)
        {
            return multimap.containsKey(obj);
        }

        public int count(Object obj)
        {
            obj = (Collection)Maps.safeGet(multimap.asMap(), obj);
            if (obj == null)
            {
                return 0;
            } else
            {
                return ((Collection) (obj)).size();
            }
        }

        Set createEntrySet()
        {
            return new KeysEntrySet();
        }

        int distinctElements()
        {
            return multimap.asMap().size();
        }

        public Set elementSet()
        {
            return multimap.keySet();
        }

        Iterator entryIterator()
        {
            return new TransformedIterator(multimap.asMap().entrySet().iterator()) {

                final Keys this$0;

                Multiset.Entry transform(java.util.Map.Entry entry)
                {
                    return entry. new Multisets.AbstractEntry() {

                        final Keys._cls1 this$1;
                        final java.util.Map.Entry val$backingEntry;

                        public int getCount()
                        {
                            return ((Collection)backingEntry.getValue()).size();
                        }

                        public Object getElement()
                        {
                            return backingEntry.getKey();
                        }

            
            {
                this$1 = final__pcls1;
                backingEntry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

                volatile Object transform(Object obj)
                {
                    return transform((java.util.Map.Entry)obj);
                }

            
            {
                this$0 = Keys.this;
                super(iterator);
            }
            };
        }

        public Iterator iterator()
        {
            return Maps.keyIterator(multimap.entries().iterator());
        }

        public int remove(Object obj, int i)
        {
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i != 0) goto _L2; else goto _L1
_L1:
            int j = count(obj);
_L4:
            return j;
_L2:
            obj = (Collection)Maps.safeGet(multimap.asMap(), obj);
            if (obj == null)
            {
                return 0;
            }
            int l = ((Collection) (obj)).size();
            if (i >= l)
            {
                ((Collection) (obj)).clear();
                return l;
            }
            obj = ((Collection) (obj)).iterator();
            int k = 0;
            do
            {
                j = l;
                if (k >= i)
                {
                    continue;
                }
                ((Iterator) (obj)).next();
                ((Iterator) (obj)).remove();
                k++;
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        Keys(Multimap multimap1)
        {
            multimap = multimap1;
        }
    }

    class Keys.KeysEntrySet extends Multisets.EntrySet
    {

        final Keys this$0;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Collection collection = (Collection)multimap.asMap().get(((Multiset.Entry) (obj)).getElement());
                flag = flag1;
                if (collection != null)
                {
                    flag = flag1;
                    if (collection.size() == ((Multiset.Entry) (obj)).getCount())
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public boolean isEmpty()
        {
            return multimap.isEmpty();
        }

        public Iterator iterator()
        {
            return entryIterator();
        }

        Multiset multiset()
        {
            return Keys.this;
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Collection collection = (Collection)multimap.asMap().get(((Multiset.Entry) (obj)).getElement());
                if (collection != null && collection.size() == ((Multiset.Entry) (obj)).getCount())
                {
                    collection.clear();
                    return true;
                }
            }
            return false;
        }

        public int size()
        {
            return distinctElements();
        }

        Keys.KeysEntrySet()
        {
            this$0 = Keys.this;
            super();
        }
    }

    private static class MapMultimap extends AbstractMultimap
        implements SetMultimap, Serializable
    {

        private static final long serialVersionUID = 0x6cdfd44a398c560fL;
        final Map map;

        public void clear()
        {
            map.clear();
        }

        public boolean containsEntry(Object obj, Object obj1)
        {
            return map.entrySet().contains(Maps.immutableEntry(obj, obj1));
        }

        public boolean containsKey(Object obj)
        {
            return map.containsKey(obj);
        }

        public boolean containsValue(Object obj)
        {
            return map.containsValue(obj);
        }

        Map createAsMap()
        {
            return new AsMap(this);
        }

        public volatile Collection entries()
        {
            return entries();
        }

        public Set entries()
        {
            return map.entrySet();
        }

        Iterator entryIterator()
        {
            return map.entrySet().iterator();
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public Set get(Object obj)
        {
            return ((_cls1) (obj)). new Sets.ImprovedAbstractSet() {

                final MapMultimap this$0;
                final Object val$key;

                public Iterator iterator()
                {
                    return new Iterator() {

                        int i;
                        final MapMultimap._cls1 this$1;

                        public boolean hasNext()
                        {
                            return i == 0 && map.containsKey(key);
                        }

                        public Object next()
                        {
                            if (!hasNext())
                            {
                                throw new NoSuchElementException();
                            } else
                            {
                                i = i + 1;
                                return map.get(key);
                            }
                        }

                        public void remove()
                        {
                            boolean flag = true;
                            if (i != 1)
                            {
                                flag = false;
                            }
                            CollectPreconditions.checkRemove(flag);
                            i = -1;
                            map.remove(key);
                        }

            
            {
                this$1 = MapMultimap._cls1.this;
                super();
            }
                    };
                }

                public int size()
                {
                    return !map.containsKey(key) ? 0 : 1;
                }

            
            {
                this$0 = final_mapmultimap;
                key = Object.this;
                super();
            }
            };
        }

        public int hashCode()
        {
            return map.hashCode();
        }

        public Set keySet()
        {
            return map.keySet();
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
            return map.entrySet().remove(Maps.immutableEntry(obj, obj1));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public Set removeAll(Object obj)
        {
            HashSet hashset = new HashSet(2);
            if (!map.containsKey(obj))
            {
                return hashset;
            } else
            {
                hashset.add(map.remove(obj));
                return hashset;
            }
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public Set replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public int size()
        {
            return map.size();
        }

        public Collection values()
        {
            return map.values();
        }

        MapMultimap(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }

    private static final class TransformedEntriesListMultimap extends TransformedEntriesMultimap
        implements ListMultimap
    {

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public List get(Object obj)
        {
            return transform(obj, fromMultimap.get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public List removeAll(Object obj)
        {
            return transform(obj, fromMultimap.removeAll(obj));
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public List replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        volatile Collection transform(Object obj, Collection collection)
        {
            return transform(obj, collection);
        }

        List transform(Object obj, Collection collection)
        {
            return Lists.transform((List)collection, Maps.asValueToValueFunction(transformer, obj));
        }

        TransformedEntriesListMultimap(ListMultimap listmultimap, Maps.EntryTransformer entrytransformer)
        {
            super(listmultimap, entrytransformer);
        }
    }

    private static class TransformedEntriesMultimap extends AbstractMultimap
    {

        final Multimap fromMultimap;
        final Maps.EntryTransformer transformer;

        public void clear()
        {
            fromMultimap.clear();
        }

        public boolean containsKey(Object obj)
        {
            return fromMultimap.containsKey(obj);
        }

        Map createAsMap()
        {
            return Maps.transformEntries(fromMultimap.asMap(), new Maps.EntryTransformer() {

                final TransformedEntriesMultimap this$0;

                public volatile Object transformEntry(Object obj, Object obj1)
                {
                    return transformEntry(obj, (Collection)obj1);
                }

                public Collection transformEntry(Object obj, Collection collection)
                {
                    return transform(obj, collection);
                }

            
            {
                this$0 = TransformedEntriesMultimap.this;
                super();
            }
            });
        }

        Collection createValues()
        {
            return Collections2.transform(fromMultimap.entries(), Maps.asEntryToValueFunction(transformer));
        }

        Iterator entryIterator()
        {
            return Iterators.transform(fromMultimap.entries().iterator(), Maps.asEntryToEntryFunction(transformer));
        }

        public Collection get(Object obj)
        {
            return transform(obj, fromMultimap.get(obj));
        }

        public boolean isEmpty()
        {
            return fromMultimap.isEmpty();
        }

        public Set keySet()
        {
            return fromMultimap.keySet();
        }

        public Multiset keys()
        {
            return fromMultimap.keys();
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
            return get(obj).remove(obj1);
        }

        public Collection removeAll(Object obj)
        {
            return transform(obj, fromMultimap.removeAll(obj));
        }

        public Collection replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public int size()
        {
            return fromMultimap.size();
        }

        Collection transform(Object obj, Collection collection)
        {
            obj = Maps.asValueToValueFunction(transformer, obj);
            if (collection instanceof List)
            {
                return Lists.transform((List)collection, ((Function) (obj)));
            } else
            {
                return Collections2.transform(collection, ((Function) (obj)));
            }
        }

        TransformedEntriesMultimap(Multimap multimap, Maps.EntryTransformer entrytransformer)
        {
            fromMultimap = (Multimap)Preconditions.checkNotNull(multimap);
            transformer = (Maps.EntryTransformer)Preconditions.checkNotNull(entrytransformer);
        }
    }

    private static class UnmodifiableListMultimap extends UnmodifiableMultimap
        implements ListMultimap
    {

        private static final long serialVersionUID = 0L;

        public ListMultimap _mthdelegate()
        {
            return (ListMultimap)super._mthdelegate();
        }

        public volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public List get(Object obj)
        {
            return Collections.unmodifiableList(_mthdelegate().get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public List removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public List replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        UnmodifiableListMultimap(ListMultimap listmultimap)
        {
            super(listmultimap);
        }
    }

    private static class UnmodifiableMultimap extends ForwardingMultimap
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Multimap _flddelegate;
        transient Collection entries;
        transient Set keySet;
        transient Multiset keys;
        transient Map map;
        transient Collection values;

        public Map asMap()
        {
            Map map2 = map;
            Map map1 = map2;
            if (map2 == null)
            {
                map1 = Collections.unmodifiableMap(Maps.transformValues(_flddelegate.asMap(), new Function() {

                    final UnmodifiableMultimap this$0;

                    public volatile Object apply(Object obj)
                    {
                        return apply((Collection)obj);
                    }

                    public Collection apply(Collection collection)
                    {
                        return Multimaps.unmodifiableValueCollection(collection);
                    }

            
            {
                this$0 = UnmodifiableMultimap.this;
                super();
            }
                }));
                map = map1;
            }
            return map1;
        }

        public void clear()
        {
            throw new UnsupportedOperationException();
        }

        protected Multimap _mthdelegate()
        {
            return _flddelegate;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public Collection entries()
        {
            Collection collection1 = entries;
            Collection collection = collection1;
            if (collection1 == null)
            {
                collection = Multimaps.unmodifiableEntries(_flddelegate.entries());
                entries = collection;
            }
            return collection;
        }

        public Collection get(Object obj)
        {
            return Multimaps.unmodifiableValueCollection(_flddelegate.get(obj));
        }

        public Set keySet()
        {
            Set set1 = keySet;
            Set set = set1;
            if (set1 == null)
            {
                set = Collections.unmodifiableSet(_flddelegate.keySet());
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
                multiset = Multisets.unmodifiableMultiset(_flddelegate.keys());
                keys = multiset;
            }
            return multiset;
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

        public Collection removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public Collection replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public Collection values()
        {
            Collection collection1 = values;
            Collection collection = collection1;
            if (collection1 == null)
            {
                collection = Collections.unmodifiableCollection(_flddelegate.values());
                values = collection;
            }
            return collection;
        }

        UnmodifiableMultimap(Multimap multimap)
        {
            _flddelegate = (Multimap)Preconditions.checkNotNull(multimap);
        }
    }

    private static class UnmodifiableSetMultimap extends UnmodifiableMultimap
        implements SetMultimap
    {

        private static final long serialVersionUID = 0L;

        public volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public SetMultimap _mthdelegate()
        {
            return (SetMultimap)super._mthdelegate();
        }

        public volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection entries()
        {
            return entries();
        }

        public Set entries()
        {
            return Maps.unmodifiableEntrySet(_mthdelegate().entries());
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public Set get(Object obj)
        {
            return Collections.unmodifiableSet(_mthdelegate().get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public Set removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public Set replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        UnmodifiableSetMultimap(SetMultimap setmultimap)
        {
            super(setmultimap);
        }
    }

    private static class UnmodifiableSortedSetMultimap extends UnmodifiableSetMultimap
        implements SortedSetMultimap
    {

        private static final long serialVersionUID = 0L;

        public volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile SetMultimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public SortedSetMultimap _mthdelegate()
        {
            return (SortedSetMultimap)super._mthdelegate();
        }

        public volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public volatile Set get(Object obj)
        {
            return get(obj);
        }

        public SortedSet get(Object obj)
        {
            return Collections.unmodifiableSortedSet(_mthdelegate().get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public volatile Set removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public SortedSet removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public volatile Set replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public SortedSet replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public Comparator valueComparator()
        {
            return _mthdelegate().valueComparator();
        }

        UnmodifiableSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
        {
            super(sortedsetmultimap);
        }
    }


    private Multimaps()
    {
    }

    public static Map asMap(ListMultimap listmultimap)
    {
        return listmultimap.asMap();
    }

    public static Map asMap(Multimap multimap)
    {
        return multimap.asMap();
    }

    public static Map asMap(SetMultimap setmultimap)
    {
        return setmultimap.asMap();
    }

    public static Map asMap(SortedSetMultimap sortedsetmultimap)
    {
        return sortedsetmultimap.asMap();
    }

    static boolean equalsImpl(Multimap multimap, Object obj)
    {
        if (obj == multimap)
        {
            return true;
        }
        if (obj instanceof Multimap)
        {
            obj = (Multimap)obj;
            return multimap.asMap().equals(((Multimap) (obj)).asMap());
        } else
        {
            return false;
        }
    }

    public static Multimap filterEntries(Multimap multimap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (multimap instanceof SetMultimap)
        {
            return filterEntries((SetMultimap)multimap, predicate);
        }
        if (multimap instanceof FilteredMultimap)
        {
            return filterFiltered((FilteredMultimap)multimap, predicate);
        } else
        {
            return new FilteredEntryMultimap((Multimap)Preconditions.checkNotNull(multimap), predicate);
        }
    }

    public static SetMultimap filterEntries(SetMultimap setmultimap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (setmultimap instanceof FilteredSetMultimap)
        {
            return filterFiltered((FilteredSetMultimap)setmultimap, predicate);
        } else
        {
            return new FilteredEntrySetMultimap((SetMultimap)Preconditions.checkNotNull(setmultimap), predicate);
        }
    }

    private static Multimap filterFiltered(FilteredMultimap filteredmultimap, Predicate predicate)
    {
        predicate = Predicates.and(filteredmultimap.entryPredicate(), predicate);
        return new FilteredEntryMultimap(filteredmultimap.unfiltered(), predicate);
    }

    private static SetMultimap filterFiltered(FilteredSetMultimap filteredsetmultimap, Predicate predicate)
    {
        predicate = Predicates.and(filteredsetmultimap.entryPredicate(), predicate);
        return new FilteredEntrySetMultimap(filteredsetmultimap.unfiltered(), predicate);
    }

    public static ListMultimap filterKeys(ListMultimap listmultimap, Predicate predicate)
    {
        if (listmultimap instanceof FilteredKeyListMultimap)
        {
            listmultimap = (FilteredKeyListMultimap)listmultimap;
            return new FilteredKeyListMultimap(listmultimap.unfiltered(), Predicates.and(((FilteredKeyListMultimap) (listmultimap)).keyPredicate, predicate));
        } else
        {
            return new FilteredKeyListMultimap(listmultimap, predicate);
        }
    }

    public static Multimap filterKeys(Multimap multimap, Predicate predicate)
    {
        if (multimap instanceof SetMultimap)
        {
            return filterKeys((SetMultimap)multimap, predicate);
        }
        if (multimap instanceof ListMultimap)
        {
            return filterKeys((ListMultimap)multimap, predicate);
        }
        if (multimap instanceof FilteredKeyMultimap)
        {
            multimap = (FilteredKeyMultimap)multimap;
            return new FilteredKeyMultimap(((FilteredKeyMultimap) (multimap)).unfiltered, Predicates.and(((FilteredKeyMultimap) (multimap)).keyPredicate, predicate));
        }
        if (multimap instanceof FilteredMultimap)
        {
            return filterFiltered((FilteredMultimap)multimap, Maps.keyPredicateOnEntries(predicate));
        } else
        {
            return new FilteredKeyMultimap(multimap, predicate);
        }
    }

    public static SetMultimap filterKeys(SetMultimap setmultimap, Predicate predicate)
    {
        if (setmultimap instanceof FilteredKeySetMultimap)
        {
            setmultimap = (FilteredKeySetMultimap)setmultimap;
            return new FilteredKeySetMultimap(setmultimap.unfiltered(), Predicates.and(((FilteredKeySetMultimap) (setmultimap)).keyPredicate, predicate));
        }
        if (setmultimap instanceof FilteredSetMultimap)
        {
            return filterFiltered((FilteredSetMultimap)setmultimap, Maps.keyPredicateOnEntries(predicate));
        } else
        {
            return new FilteredKeySetMultimap(setmultimap, predicate);
        }
    }

    public static Multimap filterValues(Multimap multimap, Predicate predicate)
    {
        return filterEntries(multimap, Maps.valuePredicateOnEntries(predicate));
    }

    public static SetMultimap filterValues(SetMultimap setmultimap, Predicate predicate)
    {
        return filterEntries(setmultimap, Maps.valuePredicateOnEntries(predicate));
    }

    public static SetMultimap forMap(Map map)
    {
        return new MapMultimap(map);
    }

    public static ImmutableListMultimap index(Iterable iterable, Function function)
    {
        return index(iterable.iterator(), function);
    }

    public static ImmutableListMultimap index(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(function);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        Object obj;
        for (; iterator.hasNext(); builder.put(function.apply(obj), obj))
        {
            obj = iterator.next();
            Preconditions.checkNotNull(obj, iterator);
        }

        return builder.build();
    }

    public static Multimap invertFrom(Multimap multimap, Multimap multimap1)
    {
        Preconditions.checkNotNull(multimap1);
        java.util.Map.Entry entry;
        for (multimap = multimap.entries().iterator(); multimap.hasNext(); multimap1.put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)multimap.next();
        }

        return multimap1;
    }

    public static ListMultimap newListMultimap(Map map, Supplier supplier)
    {
        return new CustomListMultimap(map, supplier);
    }

    public static Multimap newMultimap(Map map, Supplier supplier)
    {
        return new CustomMultimap(map, supplier);
    }

    public static SetMultimap newSetMultimap(Map map, Supplier supplier)
    {
        return new CustomSetMultimap(map, supplier);
    }

    public static SortedSetMultimap newSortedSetMultimap(Map map, Supplier supplier)
    {
        return new CustomSortedSetMultimap(map, supplier);
    }

    public static ListMultimap synchronizedListMultimap(ListMultimap listmultimap)
    {
        return Synchronized.listMultimap(listmultimap, null);
    }

    public static Multimap synchronizedMultimap(Multimap multimap)
    {
        return Synchronized.multimap(multimap, null);
    }

    public static SetMultimap synchronizedSetMultimap(SetMultimap setmultimap)
    {
        return Synchronized.setMultimap(setmultimap, null);
    }

    public static SortedSetMultimap synchronizedSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
    {
        return Synchronized.sortedSetMultimap(sortedsetmultimap, null);
    }

    public static ListMultimap transformEntries(ListMultimap listmultimap, Maps.EntryTransformer entrytransformer)
    {
        return new TransformedEntriesListMultimap(listmultimap, entrytransformer);
    }

    public static Multimap transformEntries(Multimap multimap, Maps.EntryTransformer entrytransformer)
    {
        return new TransformedEntriesMultimap(multimap, entrytransformer);
    }

    public static ListMultimap transformValues(ListMultimap listmultimap, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(listmultimap, Maps.asEntryTransformer(function));
    }

    public static Multimap transformValues(Multimap multimap, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(multimap, Maps.asEntryTransformer(function));
    }

    private static Collection unmodifiableEntries(Collection collection)
    {
        if (collection instanceof Set)
        {
            return Maps.unmodifiableEntrySet((Set)collection);
        } else
        {
            return new Maps.UnmodifiableEntries(Collections.unmodifiableCollection(collection));
        }
    }

    public static ListMultimap unmodifiableListMultimap(ImmutableListMultimap immutablelistmultimap)
    {
        return (ListMultimap)Preconditions.checkNotNull(immutablelistmultimap);
    }

    public static ListMultimap unmodifiableListMultimap(ListMultimap listmultimap)
    {
        if ((listmultimap instanceof UnmodifiableListMultimap) || (listmultimap instanceof ImmutableListMultimap))
        {
            return listmultimap;
        } else
        {
            return new UnmodifiableListMultimap(listmultimap);
        }
    }

    public static Multimap unmodifiableMultimap(ImmutableMultimap immutablemultimap)
    {
        return (Multimap)Preconditions.checkNotNull(immutablemultimap);
    }

    public static Multimap unmodifiableMultimap(Multimap multimap)
    {
        if ((multimap instanceof UnmodifiableMultimap) || (multimap instanceof ImmutableMultimap))
        {
            return multimap;
        } else
        {
            return new UnmodifiableMultimap(multimap);
        }
    }

    public static SetMultimap unmodifiableSetMultimap(ImmutableSetMultimap immutablesetmultimap)
    {
        return (SetMultimap)Preconditions.checkNotNull(immutablesetmultimap);
    }

    public static SetMultimap unmodifiableSetMultimap(SetMultimap setmultimap)
    {
        if ((setmultimap instanceof UnmodifiableSetMultimap) || (setmultimap instanceof ImmutableSetMultimap))
        {
            return setmultimap;
        } else
        {
            return new UnmodifiableSetMultimap(setmultimap);
        }
    }

    public static SortedSetMultimap unmodifiableSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
    {
        if (sortedsetmultimap instanceof UnmodifiableSortedSetMultimap)
        {
            return sortedsetmultimap;
        } else
        {
            return new UnmodifiableSortedSetMultimap(sortedsetmultimap);
        }
    }

    private static Collection unmodifiableValueCollection(Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set)
        {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List)
        {
            return Collections.unmodifiableList((List)collection);
        } else
        {
            return Collections.unmodifiableCollection(collection);
        }
    }


}
