// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            Collections2, Platform, CollectPreconditions, Iterators, 
//            BiMap, ImmutableMap, ImmutableEntry, ImmutableEnumMap, 
//            MapMaker, Ordering, Synchronized, MapDifference, 
//            SortedMapDifference, UnmodifiableIterator, Sets, ForwardingMap, 
//            ForwardingSet, TransformedIterator, ForwardingMapEntry, Iterables, 
//            Lists, AbstractNavigableMap, ForwardingCollection, ForwardingSortedMap, 
//            AbstractMapEntry, ForwardingSortedSet, ForwardingNavigableSet

public final class Maps
{
    private static abstract class AbstractFilteredMap extends ImprovedAbstractMap
    {

        final Predicate predicate;
        final Map unfiltered;

        boolean apply(Object obj, Object obj1)
        {
            return predicate.apply(Maps.immutableEntry(obj, obj1));
        }

        public boolean containsKey(Object obj)
        {
            return unfiltered.containsKey(obj) && apply(obj, unfiltered.get(obj));
        }

        Collection createValues()
        {
            return new FilteredMapValues(this, unfiltered, predicate);
        }

        public Object get(Object obj)
        {
            Object obj1 = unfiltered.get(obj);
            if (obj1 != null && apply(obj, obj1))
            {
                return obj1;
            } else
            {
                return null;
            }
        }

        public boolean isEmpty()
        {
            return entrySet().isEmpty();
        }

        public Object put(Object obj, Object obj1)
        {
            Preconditions.checkArgument(apply(obj, obj1));
            return unfiltered.put(obj, obj1);
        }

        public void putAll(Map map)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); Preconditions.checkArgument(apply(entry.getKey(), entry.getValue())))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            unfiltered.putAll(map);
        }

        public Object remove(Object obj)
        {
            if (containsKey(obj))
            {
                return unfiltered.remove(obj);
            } else
            {
                return null;
            }
        }

        AbstractFilteredMap(Map map, Predicate predicate1)
        {
            unfiltered = map;
            predicate = predicate1;
        }
    }

    private static class AsMapView extends ImprovedAbstractMap
    {

        final Function function;
        private final Set set;

        Set backingSet()
        {
            return set;
        }

        public void clear()
        {
            backingSet().clear();
        }

        public boolean containsKey(Object obj)
        {
            return backingSet().contains(obj);
        }

        protected Set createEntrySet()
        {
            return new EntrySet() {

                final AsMapView this$0;

                public Iterator iterator()
                {
                    return Maps.asMapEntryIterator(backingSet(), function);
                }

                Map map()
                {
                    return AsMapView.this;
                }

            
            {
                this$0 = AsMapView.this;
                super();
            }
            };
        }

        public Set createKeySet()
        {
            return Maps.removeOnlySet(backingSet());
        }

        Collection createValues()
        {
            return Collections2.transform(set, function);
        }

        public Object get(Object obj)
        {
            if (Collections2.safeContains(backingSet(), obj))
            {
                return function.apply(obj);
            } else
            {
                return null;
            }
        }

        public Object remove(Object obj)
        {
            if (backingSet().remove(obj))
            {
                return function.apply(obj);
            } else
            {
                return null;
            }
        }

        public int size()
        {
            return backingSet().size();
        }

        AsMapView(Set set1, Function function1)
        {
            set = (Set)Preconditions.checkNotNull(set1);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }

    private static final class BiMapConverter extends Converter
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final BiMap bimap;

        private static Object convert(BiMap bimap1, Object obj)
        {
            bimap1 = ((BiMap) (bimap1.get(obj)));
            boolean flag;
            if (bimap1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "No non-null mapping present for input: %s", new Object[] {
                obj
            });
            return bimap1;
        }

        protected Object doBackward(Object obj)
        {
            return convert(bimap.inverse(), obj);
        }

        protected Object doForward(Object obj)
        {
            return convert(bimap, obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof BiMapConverter)
            {
                obj = (BiMapConverter)obj;
                return bimap.equals(((BiMapConverter) (obj)).bimap);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return bimap.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(bimap));
            return (new StringBuilder(s.length() + 18)).append("Maps.asConverter(").append(s).append(")").toString();
        }

        BiMapConverter(BiMap bimap1)
        {
            bimap = (BiMap)Preconditions.checkNotNull(bimap1);
        }
    }

    static abstract class DescendingMap extends ForwardingMap
        implements NavigableMap
    {

        private transient Comparator comparator;
        private transient Set entrySet;
        private transient NavigableSet navigableKeySet;

        private static Ordering reverse(Comparator comparator1)
        {
            return Ordering.from(comparator1).reverse();
        }

        public java.util.Map.Entry ceilingEntry(Object obj)
        {
            return forward().floorEntry(obj);
        }

        public Object ceilingKey(Object obj)
        {
            return forward().floorKey(obj);
        }

        public Comparator comparator()
        {
            Comparator comparator1 = comparator;
            Object obj = comparator1;
            if (comparator1 == null)
            {
                Comparator comparator2 = forward().comparator();
                obj = comparator2;
                if (comparator2 == null)
                {
                    obj = Ordering.natural();
                }
                obj = reverse(((Comparator) (obj)));
                comparator = ((Comparator) (obj));
            }
            return ((Comparator) (obj));
        }

        Set createEntrySet()
        {
            return new EntrySet() {

                final DescendingMap this$0;

                public Iterator iterator()
                {
                    return entryIterator();
                }

                Map map()
                {
                    return DescendingMap.this;
                }

            
            {
                this$0 = DescendingMap.this;
                super();
            }
            };
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected final Map _mthdelegate()
        {
            return forward();
        }

        public NavigableSet descendingKeySet()
        {
            return forward().navigableKeySet();
        }

        public NavigableMap descendingMap()
        {
            return forward();
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

        public java.util.Map.Entry firstEntry()
        {
            return forward().lastEntry();
        }

        public Object firstKey()
        {
            return forward().lastKey();
        }

        public java.util.Map.Entry floorEntry(Object obj)
        {
            return forward().ceilingEntry(obj);
        }

        public Object floorKey(Object obj)
        {
            return forward().ceilingKey(obj);
        }

        abstract NavigableMap forward();

        public NavigableMap headMap(Object obj, boolean flag)
        {
            return forward().tailMap(obj, flag).descendingMap();
        }

        public SortedMap headMap(Object obj)
        {
            return headMap(obj, false);
        }

        public java.util.Map.Entry higherEntry(Object obj)
        {
            return forward().lowerEntry(obj);
        }

        public Object higherKey(Object obj)
        {
            return forward().lowerKey(obj);
        }

        public Set keySet()
        {
            return navigableKeySet();
        }

        public java.util.Map.Entry lastEntry()
        {
            return forward().firstEntry();
        }

        public Object lastKey()
        {
            return forward().firstKey();
        }

        public java.util.Map.Entry lowerEntry(Object obj)
        {
            return forward().higherEntry(obj);
        }

        public Object lowerKey(Object obj)
        {
            return forward().higherKey(obj);
        }

        public NavigableSet navigableKeySet()
        {
            NavigableSet navigableset = navigableKeySet;
            Object obj = navigableset;
            if (navigableset == null)
            {
                obj = new NavigableKeySet(this);
                navigableKeySet = ((NavigableSet) (obj));
            }
            return ((NavigableSet) (obj));
        }

        public java.util.Map.Entry pollFirstEntry()
        {
            return forward().pollLastEntry();
        }

        public java.util.Map.Entry pollLastEntry()
        {
            return forward().pollFirstEntry();
        }

        public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return forward().subMap(obj1, flag1, obj, flag).descendingMap();
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return subMap(obj, true, obj1, false);
        }

        public NavigableMap tailMap(Object obj, boolean flag)
        {
            return forward().headMap(obj, flag).descendingMap();
        }

        public SortedMap tailMap(Object obj)
        {
            return tailMap(obj, true);
        }

        public String toString()
        {
            return standardToString();
        }

        public Collection values()
        {
            return new Values(this);
        }

        DescendingMap()
        {
        }
    }

    private static abstract class EntryFunction extends Enum
        implements Function
    {

        private static final EntryFunction $VALUES[];
        public static final EntryFunction KEY;
        public static final EntryFunction VALUE;

        public static EntryFunction valueOf(String s)
        {
            return (EntryFunction)Enum.valueOf(com/google/common/collect/Maps$EntryFunction, s);
        }

        public static EntryFunction[] values()
        {
            return (EntryFunction[])$VALUES.clone();
        }

        static 
        {
            KEY = new EntryFunction("KEY", 0) {

                public volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public Object apply(java.util.Map.Entry entry)
                {
                    return entry.getKey();
                }

            };
            VALUE = new EntryFunction("VALUE", 1) {

                public volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public Object apply(java.util.Map.Entry entry)
                {
                    return entry.getValue();
                }

            };
            $VALUES = (new EntryFunction[] {
                KEY, VALUE
            });
        }

        private EntryFunction(String s, int i)
        {
            super(s, i);
        }

    }

    static abstract class EntrySet extends Sets.ImprovedAbstractSet
    {

        public void clear()
        {
            map().clear();
        }

        public boolean contains(Object obj)
        {
            boolean flag;
label0:
            {
                boolean flag1 = false;
                flag = flag1;
                if (!(obj instanceof java.util.Map.Entry))
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                Object obj2 = Maps.safeGet(map(), obj1);
                flag = flag1;
                if (!Objects.equal(obj2, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    break label0;
                }
                if (obj2 == null)
                {
                    flag = flag1;
                    if (!map().containsKey(obj1))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            return flag;
        }

        public boolean isEmpty()
        {
            return map().isEmpty();
        }

        abstract Map map();

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = (java.util.Map.Entry)obj;
                return map().keySet().remove(((java.util.Map.Entry) (obj)).getKey());
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.removeAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                return Sets.removeAllImpl(this, collection.iterator());
            }
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.retainAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                java.util.HashSet hashset = Sets.newHashSetWithExpectedSize(collection.size());
                collection = collection.iterator();
                do
                {
                    if (!collection.hasNext())
                    {
                        break;
                    }
                    Object obj = collection.next();
                    if (contains(obj))
                    {
                        hashset.add(((java.util.Map.Entry)obj).getKey());
                    }
                } while (true);
                return map().keySet().retainAll(hashset);
            }
            return flag;
        }

        public int size()
        {
            return map().size();
        }

        EntrySet()
        {
        }
    }

    public static interface EntryTransformer
    {

        public abstract Object transformEntry(Object obj, Object obj1);
    }

    static final class FilteredEntryBiMap extends FilteredEntryMap
        implements BiMap
    {

        private final BiMap inverse;

        private static Predicate inversePredicate(Predicate predicate)
        {
            return new Predicate(predicate) {

                final Predicate val$forwardPredicate;

                public volatile boolean apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public boolean apply(java.util.Map.Entry entry)
                {
                    return forwardPredicate.apply(Maps.immutableEntry(entry.getValue(), entry.getKey()));
                }

            
            {
                forwardPredicate = predicate;
                super();
            }
            };
        }

        public Object forcePut(Object obj, Object obj1)
        {
            Preconditions.checkArgument(apply(obj, obj1));
            return unfiltered().forcePut(obj, obj1);
        }

        public BiMap inverse()
        {
            return inverse;
        }

        BiMap unfiltered()
        {
            return (BiMap)unfiltered;
        }

        public volatile Collection values()
        {
            return values();
        }

        public Set values()
        {
            return inverse.keySet();
        }

        FilteredEntryBiMap(BiMap bimap, Predicate predicate)
        {
            super(bimap, predicate);
            inverse = new FilteredEntryBiMap(bimap.inverse(), inversePredicate(predicate), this);
        }

        private FilteredEntryBiMap(BiMap bimap, Predicate predicate, BiMap bimap1)
        {
            super(bimap, predicate);
            inverse = bimap1;
        }
    }

    static class FilteredEntryMap extends AbstractFilteredMap
    {

        final Set filteredEntrySet;

        protected Set createEntrySet()
        {
            return new EntrySet();
        }

        Set createKeySet()
        {
            return new KeySet();
        }

        FilteredEntryMap(Map map, Predicate predicate)
        {
            super(map, predicate);
            filteredEntrySet = Sets.filter(map.entrySet(), this.predicate);
        }
    }

    private class FilteredEntryMap.EntrySet extends ForwardingSet
    {

        final FilteredEntryMap this$0;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return filteredEntrySet;
        }

        public Iterator iterator()
        {
            return new TransformedIterator(filteredEntrySet.iterator()) {

                final FilteredEntryMap.EntrySet this$1;

                volatile Object transform(Object obj)
                {
                    return transform((java.util.Map.Entry)obj);
                }

                java.util.Map.Entry transform(java.util.Map.Entry entry)
                {
                    return entry. new ForwardingMapEntry() {

                        final FilteredEntryMap.EntrySet._cls1 this$2;
                        final java.util.Map.Entry val$entry;

                        protected volatile Object _mthdelegate()
                        {
                            return _mthdelegate();
                        }

                        protected java.util.Map.Entry _mthdelegate()
                        {
                            return entry;
                        }

                        public Object setValue(Object obj)
                        {
                            Preconditions.checkArgument(apply(getKey(), obj));
                            return super.setValue(obj);
                        }

            
            {
                this$2 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

            
            {
                this$1 = FilteredEntryMap.EntrySet.this;
                super(iterator);
            }
            };
        }

        private FilteredEntryMap.EntrySet()
        {
            this$0 = FilteredEntryMap.this;
            super();
        }

    }

    class FilteredEntryMap.KeySet extends KeySet
    {

        final FilteredEntryMap this$0;

        private boolean removeIf(Predicate predicate)
        {
            return Iterables.removeIf(unfiltered.entrySet(), Predicates.and(FilteredEntryMap.this.predicate, Maps.keyPredicateOnEntries(predicate)));
        }

        public boolean remove(Object obj)
        {
            if (containsKey(obj))
            {
                unfiltered.remove(obj);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            return removeIf(Predicates.in(collection));
        }

        public boolean retainAll(Collection collection)
        {
            return removeIf(Predicates.not(Predicates.in(collection)));
        }

        public Object[] toArray()
        {
            return Lists.newArrayList(iterator()).toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return Lists.newArrayList(iterator()).toArray(aobj);
        }

        FilteredEntryMap.KeySet()
        {
            this$0 = FilteredEntryMap.this;
            super(FilteredEntryMap.this);
        }
    }

    private static class FilteredEntryNavigableMap extends AbstractNavigableMap
    {

        private final Predicate entryPredicate;
        private final Map filteredDelegate;
        private final NavigableMap unfiltered;

        public void clear()
        {
            filteredDelegate.clear();
        }

        public Comparator comparator()
        {
            return unfiltered.comparator();
        }

        public boolean containsKey(Object obj)
        {
            return filteredDelegate.containsKey(obj);
        }

        Iterator descendingEntryIterator()
        {
            return Iterators.filter(unfiltered.descendingMap().entrySet().iterator(), entryPredicate);
        }

        public NavigableMap descendingMap()
        {
            return Maps.filterEntries(unfiltered.descendingMap(), entryPredicate);
        }

        Iterator entryIterator()
        {
            return Iterators.filter(unfiltered.entrySet().iterator(), entryPredicate);
        }

        public Set entrySet()
        {
            return filteredDelegate.entrySet();
        }

        public Object get(Object obj)
        {
            return filteredDelegate.get(obj);
        }

        public NavigableMap headMap(Object obj, boolean flag)
        {
            return Maps.filterEntries(unfiltered.headMap(obj, flag), entryPredicate);
        }

        public boolean isEmpty()
        {
            return !Iterables.any(unfiltered.entrySet(), entryPredicate);
        }

        public NavigableSet navigableKeySet()
        {
            return new NavigableKeySet(this) {

                final FilteredEntryNavigableMap this$0;

                public boolean removeAll(Collection collection)
                {
                    return Iterators.removeIf(unfiltered.entrySet().iterator(), Predicates.and(entryPredicate, Maps.keyPredicateOnEntries(Predicates.in(collection))));
                }

                public boolean retainAll(Collection collection)
                {
                    return Iterators.removeIf(unfiltered.entrySet().iterator(), Predicates.and(entryPredicate, Maps.keyPredicateOnEntries(Predicates.not(Predicates.in(collection)))));
                }

            
            {
                this$0 = FilteredEntryNavigableMap.this;
                super(navigablemap);
            }
            };
        }

        public java.util.Map.Entry pollFirstEntry()
        {
            return (java.util.Map.Entry)Iterables.removeFirstMatching(unfiltered.entrySet(), entryPredicate);
        }

        public java.util.Map.Entry pollLastEntry()
        {
            return (java.util.Map.Entry)Iterables.removeFirstMatching(unfiltered.descendingMap().entrySet(), entryPredicate);
        }

        public Object put(Object obj, Object obj1)
        {
            return filteredDelegate.put(obj, obj1);
        }

        public void putAll(Map map)
        {
            filteredDelegate.putAll(map);
        }

        public Object remove(Object obj)
        {
            return filteredDelegate.remove(obj);
        }

        public int size()
        {
            return filteredDelegate.size();
        }

        public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return Maps.filterEntries(unfiltered.subMap(obj, flag, obj1, flag1), entryPredicate);
        }

        public NavigableMap tailMap(Object obj, boolean flag)
        {
            return Maps.filterEntries(unfiltered.tailMap(obj, flag), entryPredicate);
        }

        public Collection values()
        {
            return new FilteredMapValues(this, unfiltered, entryPredicate);
        }



        FilteredEntryNavigableMap(NavigableMap navigablemap, Predicate predicate)
        {
            unfiltered = (NavigableMap)Preconditions.checkNotNull(navigablemap);
            entryPredicate = predicate;
            filteredDelegate = new FilteredEntryMap(navigablemap, predicate);
        }
    }

    private static class FilteredEntrySortedMap extends FilteredEntryMap
        implements SortedMap
    {

        public Comparator comparator()
        {
            return sortedMap().comparator();
        }

        volatile Set createKeySet()
        {
            return createKeySet();
        }

        SortedSet createKeySet()
        {
            return new SortedKeySet();
        }

        public Object firstKey()
        {
            return keySet().iterator().next();
        }

        public SortedMap headMap(Object obj)
        {
            return new FilteredEntrySortedMap(sortedMap().headMap(obj), predicate);
        }

        public volatile Set keySet()
        {
            return keySet();
        }

        public SortedSet keySet()
        {
            return (SortedSet)super.keySet();
        }

        public Object lastKey()
        {
            Object obj = sortedMap();
            do
            {
                obj = ((SortedMap) (obj)).lastKey();
                if (apply(obj, unfiltered.get(obj)))
                {
                    return obj;
                }
                obj = sortedMap().headMap(obj);
            } while (true);
        }

        SortedMap sortedMap()
        {
            return (SortedMap)unfiltered;
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return new FilteredEntrySortedMap(sortedMap().subMap(obj, obj1), predicate);
        }

        public SortedMap tailMap(Object obj)
        {
            return new FilteredEntrySortedMap(sortedMap().tailMap(obj), predicate);
        }

        FilteredEntrySortedMap(SortedMap sortedmap, Predicate predicate)
        {
            super(sortedmap, predicate);
        }
    }

    class FilteredEntrySortedMap.SortedKeySet extends FilteredEntryMap.KeySet
        implements SortedSet
    {

        final FilteredEntrySortedMap this$0;

        public Comparator comparator()
        {
            return sortedMap().comparator();
        }

        public Object first()
        {
            return firstKey();
        }

        public SortedSet headSet(Object obj)
        {
            return (SortedSet)headMap(obj).keySet();
        }

        public Object last()
        {
            return lastKey();
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            return (SortedSet)subMap(obj, obj1).keySet();
        }

        public SortedSet tailSet(Object obj)
        {
            return (SortedSet)tailMap(obj).keySet();
        }

        FilteredEntrySortedMap.SortedKeySet()
        {
            this$0 = FilteredEntrySortedMap.this;
            super();
        }
    }

    private static class FilteredKeyMap extends AbstractFilteredMap
    {

        Predicate keyPredicate;

        public boolean containsKey(Object obj)
        {
            return unfiltered.containsKey(obj) && keyPredicate.apply(obj);
        }

        protected Set createEntrySet()
        {
            return Sets.filter(unfiltered.entrySet(), predicate);
        }

        Set createKeySet()
        {
            return Sets.filter(unfiltered.keySet(), keyPredicate);
        }

        FilteredKeyMap(Map map, Predicate predicate, Predicate predicate1)
        {
            super(map, predicate1);
            keyPredicate = predicate;
        }
    }

    private static final class FilteredMapValues extends Values
    {

        Predicate predicate;
        Map unfiltered;

        private boolean removeIf(Predicate predicate1)
        {
            return Iterables.removeIf(unfiltered.entrySet(), Predicates.and(predicate, Maps.valuePredicateOnEntries(predicate1)));
        }

        public boolean remove(Object obj)
        {
            return Iterables.removeFirstMatching(unfiltered.entrySet(), Predicates.and(predicate, Maps.valuePredicateOnEntries(Predicates.equalTo(obj)))) != null;
        }

        public boolean removeAll(Collection collection)
        {
            return removeIf(Predicates.in(collection));
        }

        public boolean retainAll(Collection collection)
        {
            return removeIf(Predicates.not(Predicates.in(collection)));
        }

        public Object[] toArray()
        {
            return Lists.newArrayList(iterator()).toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return Lists.newArrayList(iterator()).toArray(aobj);
        }

        FilteredMapValues(Map map, Map map1, Predicate predicate1)
        {
            super(map);
            unfiltered = map1;
            predicate = predicate1;
        }
    }

    static abstract class ImprovedAbstractMap extends AbstractMap
    {

        private transient Set entrySet;
        private transient Set keySet;
        private transient Collection values;

        abstract Set createEntrySet();

        Set createKeySet()
        {
            return new KeySet(this);
        }

        Collection createValues()
        {
            return new Values(this);
        }

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

        ImprovedAbstractMap()
        {
        }
    }

    static class KeySet extends Sets.ImprovedAbstractSet
    {

        final Map map;

        public void clear()
        {
            map().clear();
        }

        public boolean contains(Object obj)
        {
            return map().containsKey(obj);
        }

        public boolean isEmpty()
        {
            return map().isEmpty();
        }

        public Iterator iterator()
        {
            return Maps.keyIterator(map().entrySet().iterator());
        }

        Map map()
        {
            return map;
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                map().remove(obj);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return map().size();
        }

        KeySet(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }

    static class MapDifferenceImpl
        implements MapDifference
    {

        final Map differences;
        final Map onBoth;
        final Map onlyOnLeft;
        final Map onlyOnRight;

        public boolean areEqual()
        {
            return onlyOnLeft.isEmpty() && onlyOnRight.isEmpty() && differences.isEmpty();
        }

        public Map entriesDiffering()
        {
            return differences;
        }

        public Map entriesInCommon()
        {
            return onBoth;
        }

        public Map entriesOnlyOnLeft()
        {
            return onlyOnLeft;
        }

        public Map entriesOnlyOnRight()
        {
            return onlyOnRight;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof MapDifference)
                {
                    if (!entriesOnlyOnLeft().equals(((MapDifference) (obj = (MapDifference)obj)).entriesOnlyOnLeft()) || !entriesOnlyOnRight().equals(((MapDifference) (obj)).entriesOnlyOnRight()) || !entriesInCommon().equals(((MapDifference) (obj)).entriesInCommon()) || !entriesDiffering().equals(((MapDifference) (obj)).entriesDiffering()))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering()
            });
        }

        public String toString()
        {
            if (areEqual())
            {
                return "equal";
            }
            StringBuilder stringbuilder = new StringBuilder("not equal");
            if (!onlyOnLeft.isEmpty())
            {
                stringbuilder.append(": only on left=").append(onlyOnLeft);
            }
            if (!onlyOnRight.isEmpty())
            {
                stringbuilder.append(": only on right=").append(onlyOnRight);
            }
            if (!differences.isEmpty())
            {
                stringbuilder.append(": value differences=").append(differences);
            }
            return stringbuilder.toString();
        }

        MapDifferenceImpl(Map map, Map map1, Map map2, Map map3)
        {
            onlyOnLeft = Maps.unmodifiableMap(map);
            onlyOnRight = Maps.unmodifiableMap(map1);
            onBoth = Maps.unmodifiableMap(map2);
            differences = Maps.unmodifiableMap(map3);
        }
    }

    private static final class NavigableAsMapView extends AbstractNavigableMap
    {

        private final Function function;
        private final NavigableSet set;

        public void clear()
        {
            set.clear();
        }

        public Comparator comparator()
        {
            return set.comparator();
        }

        Iterator descendingEntryIterator()
        {
            return descendingMap().entrySet().iterator();
        }

        public NavigableMap descendingMap()
        {
            return Maps.asMap(set.descendingSet(), function);
        }

        Iterator entryIterator()
        {
            return Maps.asMapEntryIterator(set, function);
        }

        public Object get(Object obj)
        {
            if (Collections2.safeContains(set, obj))
            {
                return function.apply(obj);
            } else
            {
                return null;
            }
        }

        public NavigableMap headMap(Object obj, boolean flag)
        {
            return Maps.asMap(set.headSet(obj, flag), function);
        }

        public NavigableSet navigableKeySet()
        {
            return Maps.removeOnlyNavigableSet(set);
        }

        public int size()
        {
            return set.size();
        }

        public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return Maps.asMap(set.subSet(obj, flag, obj1, flag1), function);
        }

        public NavigableMap tailMap(Object obj, boolean flag)
        {
            return Maps.asMap(set.tailSet(obj, flag), function);
        }

        NavigableAsMapView(NavigableSet navigableset, Function function1)
        {
            set = (NavigableSet)Preconditions.checkNotNull(navigableset);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }

    static class NavigableKeySet extends SortedKeySet
        implements NavigableSet
    {

        public Object ceiling(Object obj)
        {
            return map().ceilingKey(obj);
        }

        public Iterator descendingIterator()
        {
            return descendingSet().iterator();
        }

        public NavigableSet descendingSet()
        {
            return map().descendingKeySet();
        }

        public Object floor(Object obj)
        {
            return map().floorKey(obj);
        }

        public NavigableSet headSet(Object obj, boolean flag)
        {
            return map().headMap(obj, flag).navigableKeySet();
        }

        public SortedSet headSet(Object obj)
        {
            return headSet(obj, false);
        }

        public Object higher(Object obj)
        {
            return map().higherKey(obj);
        }

        public Object lower(Object obj)
        {
            return map().lowerKey(obj);
        }

        volatile Map map()
        {
            return map();
        }

        NavigableMap map()
        {
            return (NavigableMap)map;
        }

        volatile SortedMap map()
        {
            return map();
        }

        public Object pollFirst()
        {
            return Maps.keyOrNull(map().pollFirstEntry());
        }

        public Object pollLast()
        {
            return Maps.keyOrNull(map().pollLastEntry());
        }

        public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return map().subMap(obj, flag, obj1, flag1).navigableKeySet();
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            return subSet(obj, true, obj1, false);
        }

        public NavigableSet tailSet(Object obj, boolean flag)
        {
            return map().tailMap(obj, flag).navigableKeySet();
        }

        public SortedSet tailSet(Object obj)
        {
            return tailSet(obj, true);
        }

        NavigableKeySet(NavigableMap navigablemap)
        {
            super(navigablemap);
        }
    }

    private static class SortedAsMapView extends AsMapView
        implements SortedMap
    {

        volatile Set backingSet()
        {
            return backingSet();
        }

        SortedSet backingSet()
        {
            return (SortedSet)super.backingSet();
        }

        public Comparator comparator()
        {
            return backingSet().comparator();
        }

        public Object firstKey()
        {
            return backingSet().first();
        }

        public SortedMap headMap(Object obj)
        {
            return Maps.asMap(backingSet().headSet(obj), function);
        }

        public Set keySet()
        {
            return Maps.removeOnlySortedSet(backingSet());
        }

        public Object lastKey()
        {
            return backingSet().last();
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return Maps.asMap(backingSet().subSet(obj, obj1), function);
        }

        public SortedMap tailMap(Object obj)
        {
            return Maps.asMap(backingSet().tailSet(obj), function);
        }

        SortedAsMapView(SortedSet sortedset, Function function)
        {
            super(sortedset, function);
        }
    }

    static class SortedKeySet extends KeySet
        implements SortedSet
    {

        public Comparator comparator()
        {
            return map().comparator();
        }

        public Object first()
        {
            return map().firstKey();
        }

        public SortedSet headSet(Object obj)
        {
            return new SortedKeySet(map().headMap(obj));
        }

        public Object last()
        {
            return map().lastKey();
        }

        volatile Map map()
        {
            return map();
        }

        SortedMap map()
        {
            return (SortedMap)super.map();
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            return new SortedKeySet(map().subMap(obj, obj1));
        }

        public SortedSet tailSet(Object obj)
        {
            return new SortedKeySet(map().tailMap(obj));
        }

        SortedKeySet(SortedMap sortedmap)
        {
            super(sortedmap);
        }
    }

    static class SortedMapDifferenceImpl extends MapDifferenceImpl
        implements SortedMapDifference
    {

        public volatile Map entriesDiffering()
        {
            return entriesDiffering();
        }

        public SortedMap entriesDiffering()
        {
            return (SortedMap)super.entriesDiffering();
        }

        public volatile Map entriesInCommon()
        {
            return entriesInCommon();
        }

        public SortedMap entriesInCommon()
        {
            return (SortedMap)super.entriesInCommon();
        }

        public volatile Map entriesOnlyOnLeft()
        {
            return entriesOnlyOnLeft();
        }

        public SortedMap entriesOnlyOnLeft()
        {
            return (SortedMap)super.entriesOnlyOnLeft();
        }

        public volatile Map entriesOnlyOnRight()
        {
            return entriesOnlyOnRight();
        }

        public SortedMap entriesOnlyOnRight()
        {
            return (SortedMap)super.entriesOnlyOnRight();
        }

        SortedMapDifferenceImpl(SortedMap sortedmap, SortedMap sortedmap1, SortedMap sortedmap2, SortedMap sortedmap3)
        {
            super(sortedmap, sortedmap1, sortedmap2, sortedmap3);
        }
    }

    static class TransformedEntriesMap extends ImprovedAbstractMap
    {

        final Map fromMap;
        final EntryTransformer transformer;

        public void clear()
        {
            fromMap.clear();
        }

        public boolean containsKey(Object obj)
        {
            return fromMap.containsKey(obj);
        }

        protected Set createEntrySet()
        {
            return new EntrySet() {

                final TransformedEntriesMap this$0;

                public Iterator iterator()
                {
                    return Iterators.transform(fromMap.entrySet().iterator(), Maps.asEntryToEntryFunction(transformer));
                }

                Map map()
                {
                    return TransformedEntriesMap.this;
                }

            
            {
                this$0 = TransformedEntriesMap.this;
                super();
            }
            };
        }

        public Object get(Object obj)
        {
            Object obj1 = fromMap.get(obj);
            if (obj1 != null || fromMap.containsKey(obj))
            {
                return transformer.transformEntry(obj, obj1);
            } else
            {
                return null;
            }
        }

        public Set keySet()
        {
            return fromMap.keySet();
        }

        public Object remove(Object obj)
        {
            if (fromMap.containsKey(obj))
            {
                return transformer.transformEntry(obj, fromMap.remove(obj));
            } else
            {
                return null;
            }
        }

        public int size()
        {
            return fromMap.size();
        }

        TransformedEntriesMap(Map map, EntryTransformer entrytransformer)
        {
            fromMap = (Map)Preconditions.checkNotNull(map);
            transformer = (EntryTransformer)Preconditions.checkNotNull(entrytransformer);
        }
    }

    private static class TransformedEntriesNavigableMap extends TransformedEntriesSortedMap
        implements NavigableMap
    {

        private java.util.Map.Entry transformEntry(java.util.Map.Entry entry)
        {
            if (entry == null)
            {
                return null;
            } else
            {
                return Maps.transformEntry(transformer, entry);
            }
        }

        public java.util.Map.Entry ceilingEntry(Object obj)
        {
            return transformEntry(fromMap().ceilingEntry(obj));
        }

        public Object ceilingKey(Object obj)
        {
            return fromMap().ceilingKey(obj);
        }

        public NavigableSet descendingKeySet()
        {
            return fromMap().descendingKeySet();
        }

        public NavigableMap descendingMap()
        {
            return Maps.transformEntries(fromMap().descendingMap(), transformer);
        }

        public java.util.Map.Entry firstEntry()
        {
            return transformEntry(fromMap().firstEntry());
        }

        public java.util.Map.Entry floorEntry(Object obj)
        {
            return transformEntry(fromMap().floorEntry(obj));
        }

        public Object floorKey(Object obj)
        {
            return fromMap().floorKey(obj);
        }

        protected NavigableMap fromMap()
        {
            return (NavigableMap)super.fromMap();
        }

        protected volatile SortedMap fromMap()
        {
            return fromMap();
        }

        public NavigableMap headMap(Object obj)
        {
            return headMap(obj, false);
        }

        public NavigableMap headMap(Object obj, boolean flag)
        {
            return Maps.transformEntries(fromMap().headMap(obj, flag), transformer);
        }

        public volatile SortedMap headMap(Object obj)
        {
            return headMap(obj);
        }

        public java.util.Map.Entry higherEntry(Object obj)
        {
            return transformEntry(fromMap().higherEntry(obj));
        }

        public Object higherKey(Object obj)
        {
            return fromMap().higherKey(obj);
        }

        public java.util.Map.Entry lastEntry()
        {
            return transformEntry(fromMap().lastEntry());
        }

        public java.util.Map.Entry lowerEntry(Object obj)
        {
            return transformEntry(fromMap().lowerEntry(obj));
        }

        public Object lowerKey(Object obj)
        {
            return fromMap().lowerKey(obj);
        }

        public NavigableSet navigableKeySet()
        {
            return fromMap().navigableKeySet();
        }

        public java.util.Map.Entry pollFirstEntry()
        {
            return transformEntry(fromMap().pollFirstEntry());
        }

        public java.util.Map.Entry pollLastEntry()
        {
            return transformEntry(fromMap().pollLastEntry());
        }

        public NavigableMap subMap(Object obj, Object obj1)
        {
            return subMap(obj, true, obj1, false);
        }

        public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return Maps.transformEntries(fromMap().subMap(obj, flag, obj1, flag1), transformer);
        }

        public volatile SortedMap subMap(Object obj, Object obj1)
        {
            return subMap(obj, obj1);
        }

        public NavigableMap tailMap(Object obj)
        {
            return tailMap(obj, true);
        }

        public NavigableMap tailMap(Object obj, boolean flag)
        {
            return Maps.transformEntries(fromMap().tailMap(obj, flag), transformer);
        }

        public volatile SortedMap tailMap(Object obj)
        {
            return tailMap(obj);
        }

        TransformedEntriesNavigableMap(NavigableMap navigablemap, EntryTransformer entrytransformer)
        {
            super(navigablemap, entrytransformer);
        }
    }

    static class TransformedEntriesSortedMap extends TransformedEntriesMap
        implements SortedMap
    {

        public Comparator comparator()
        {
            return fromMap().comparator();
        }

        public Object firstKey()
        {
            return fromMap().firstKey();
        }

        protected SortedMap fromMap()
        {
            return (SortedMap)fromMap;
        }

        public SortedMap headMap(Object obj)
        {
            return Maps.transformEntries(fromMap().headMap(obj), transformer);
        }

        public Object lastKey()
        {
            return fromMap().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return Maps.transformEntries(fromMap().subMap(obj, obj1), transformer);
        }

        public SortedMap tailMap(Object obj)
        {
            return Maps.transformEntries(fromMap().tailMap(obj), transformer);
        }

        TransformedEntriesSortedMap(SortedMap sortedmap, EntryTransformer entrytransformer)
        {
            super(sortedmap, entrytransformer);
        }
    }

    private static class UnmodifiableBiMap extends ForwardingMap
        implements BiMap, Serializable
    {

        private static final long serialVersionUID = 0L;
        final BiMap _flddelegate;
        BiMap inverse;
        final Map unmodifiableMap;
        transient Set values;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Map _mthdelegate()
        {
            return unmodifiableMap;
        }

        public Object forcePut(Object obj, Object obj1)
        {
            throw new UnsupportedOperationException();
        }

        public BiMap inverse()
        {
            BiMap bimap = inverse;
            Object obj = bimap;
            if (bimap == null)
            {
                obj = new UnmodifiableBiMap(_flddelegate.inverse(), this);
                inverse = ((BiMap) (obj));
            }
            return ((BiMap) (obj));
        }

        public volatile Collection values()
        {
            return values();
        }

        public Set values()
        {
            Set set1 = values;
            Set set = set1;
            if (set1 == null)
            {
                set = Collections.unmodifiableSet(_flddelegate.values());
                values = set;
            }
            return set;
        }

        UnmodifiableBiMap(BiMap bimap, BiMap bimap1)
        {
            unmodifiableMap = Collections.unmodifiableMap(bimap);
            _flddelegate = bimap;
            inverse = bimap1;
        }
    }

    static class UnmodifiableEntries extends ForwardingCollection
    {

        private final Collection entries;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Collection _mthdelegate()
        {
            return entries;
        }

        public Iterator iterator()
        {
            return super.iterator(). new UnmodifiableIterator() {

                final UnmodifiableEntries this$0;
                final Iterator val$delegate;

                public boolean hasNext()
                {
                    return delegate.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return Maps.unmodifiableEntry((java.util.Map.Entry)delegate.next());
                }

            
            {
                this$0 = final_unmodifiableentries;
                delegate = Iterator.this;
                super();
            }
            };
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        UnmodifiableEntries(Collection collection)
        {
            entries = collection;
        }
    }

    static class UnmodifiableEntrySet extends UnmodifiableEntries
        implements Set
    {

        public boolean equals(Object obj)
        {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode()
        {
            return Sets.hashCodeImpl(this);
        }

        UnmodifiableEntrySet(Set set)
        {
            super(set);
        }
    }

    static class UnmodifiableNavigableMap extends ForwardingSortedMap
        implements NavigableMap, Serializable
    {

        private final NavigableMap _flddelegate;
        private transient UnmodifiableNavigableMap descendingMap;

        public java.util.Map.Entry ceilingEntry(Object obj)
        {
            return Maps.unmodifiableOrNull(_flddelegate.ceilingEntry(obj));
        }

        public Object ceilingKey(Object obj)
        {
            return _flddelegate.ceilingKey(obj);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Map _mthdelegate()
        {
            return _mthdelegate();
        }

        protected SortedMap _mthdelegate()
        {
            return Collections.unmodifiableSortedMap(_flddelegate);
        }

        public NavigableSet descendingKeySet()
        {
            return Sets.unmodifiableNavigableSet(_flddelegate.descendingKeySet());
        }

        public NavigableMap descendingMap()
        {
            UnmodifiableNavigableMap unmodifiablenavigablemap1 = descendingMap;
            UnmodifiableNavigableMap unmodifiablenavigablemap = unmodifiablenavigablemap1;
            if (unmodifiablenavigablemap1 == null)
            {
                unmodifiablenavigablemap = new UnmodifiableNavigableMap(_flddelegate.descendingMap(), this);
                descendingMap = unmodifiablenavigablemap;
            }
            return unmodifiablenavigablemap;
        }

        public java.util.Map.Entry firstEntry()
        {
            return Maps.unmodifiableOrNull(_flddelegate.firstEntry());
        }

        public java.util.Map.Entry floorEntry(Object obj)
        {
            return Maps.unmodifiableOrNull(_flddelegate.floorEntry(obj));
        }

        public Object floorKey(Object obj)
        {
            return _flddelegate.floorKey(obj);
        }

        public NavigableMap headMap(Object obj, boolean flag)
        {
            return Maps.unmodifiableNavigableMap(_flddelegate.headMap(obj, flag));
        }

        public SortedMap headMap(Object obj)
        {
            return headMap(obj, false);
        }

        public java.util.Map.Entry higherEntry(Object obj)
        {
            return Maps.unmodifiableOrNull(_flddelegate.higherEntry(obj));
        }

        public Object higherKey(Object obj)
        {
            return _flddelegate.higherKey(obj);
        }

        public Set keySet()
        {
            return navigableKeySet();
        }

        public java.util.Map.Entry lastEntry()
        {
            return Maps.unmodifiableOrNull(_flddelegate.lastEntry());
        }

        public java.util.Map.Entry lowerEntry(Object obj)
        {
            return Maps.unmodifiableOrNull(_flddelegate.lowerEntry(obj));
        }

        public Object lowerKey(Object obj)
        {
            return _flddelegate.lowerKey(obj);
        }

        public NavigableSet navigableKeySet()
        {
            return Sets.unmodifiableNavigableSet(_flddelegate.navigableKeySet());
        }

        public final java.util.Map.Entry pollFirstEntry()
        {
            throw new UnsupportedOperationException();
        }

        public final java.util.Map.Entry pollLastEntry()
        {
            throw new UnsupportedOperationException();
        }

        public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return Maps.unmodifiableNavigableMap(_flddelegate.subMap(obj, flag, obj1, flag1));
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return subMap(obj, true, obj1, false);
        }

        public NavigableMap tailMap(Object obj, boolean flag)
        {
            return Maps.unmodifiableNavigableMap(_flddelegate.tailMap(obj, flag));
        }

        public SortedMap tailMap(Object obj)
        {
            return tailMap(obj, true);
        }

        UnmodifiableNavigableMap(NavigableMap navigablemap)
        {
            _flddelegate = navigablemap;
        }

        UnmodifiableNavigableMap(NavigableMap navigablemap, UnmodifiableNavigableMap unmodifiablenavigablemap)
        {
            _flddelegate = navigablemap;
            descendingMap = unmodifiablenavigablemap;
        }
    }

    static class ValueDifferenceImpl
        implements MapDifference.ValueDifference
    {

        private final Object left;
        private final Object right;

        static MapDifference.ValueDifference create(Object obj, Object obj1)
        {
            return new ValueDifferenceImpl(obj, obj1);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof MapDifference.ValueDifference)
            {
                obj = (MapDifference.ValueDifference)obj;
                flag = flag1;
                if (Objects.equal(left, ((MapDifference.ValueDifference) (obj)).leftValue()))
                {
                    flag = flag1;
                    if (Objects.equal(right, ((MapDifference.ValueDifference) (obj)).rightValue()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                left, right
            });
        }

        public Object leftValue()
        {
            return left;
        }

        public Object rightValue()
        {
            return right;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(left));
            String s1 = String.valueOf(String.valueOf(right));
            return (new StringBuilder(s.length() + 4 + s1.length())).append("(").append(s).append(", ").append(s1).append(")").toString();
        }

        private ValueDifferenceImpl(Object obj, Object obj1)
        {
            left = obj;
            right = obj1;
        }
    }

    static class Values extends AbstractCollection
    {

        final Map map;

        public void clear()
        {
            map().clear();
        }

        public boolean contains(Object obj)
        {
            return map().containsValue(obj);
        }

        public boolean isEmpty()
        {
            return map().isEmpty();
        }

        public Iterator iterator()
        {
            return Maps.valueIterator(map().entrySet().iterator());
        }

        final Map map()
        {
            return map;
        }

        public boolean remove(Object obj)
        {
            boolean flag;
            try
            {
                flag = super.remove(obj);
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                for (Iterator iterator1 = map().entrySet().iterator(); iterator1.hasNext();)
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (Objects.equal(obj, entry.getValue()))
                    {
                        map().remove(entry.getKey());
                        return true;
                    }
                }

                return false;
            }
            return flag;
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.removeAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                java.util.HashSet hashset = Sets.newHashSet();
                Iterator iterator1 = map().entrySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (collection.contains(entry.getValue()))
                    {
                        hashset.add(entry.getKey());
                    }
                } while (true);
                return map().keySet().removeAll(hashset);
            }
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.retainAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                java.util.HashSet hashset = Sets.newHashSet();
                Iterator iterator1 = map().entrySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (collection.contains(entry.getValue()))
                    {
                        hashset.add(entry.getKey());
                    }
                } while (true);
                return map().keySet().retainAll(hashset);
            }
            return flag;
        }

        public int size()
        {
            return map().size();
        }

        Values(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }


    static final com.google.common.base.Joiner.MapJoiner STANDARD_JOINER;

    private Maps()
    {
    }

    public static Converter asConverter(BiMap bimap)
    {
        return new BiMapConverter(bimap);
    }

    static Function asEntryToEntryFunction(EntryTransformer entrytransformer)
    {
        Preconditions.checkNotNull(entrytransformer);
        return new Function(entrytransformer) {

            final EntryTransformer val$transformer;

            public volatile Object apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public java.util.Map.Entry apply(java.util.Map.Entry entry)
            {
                return Maps.transformEntry(transformer, entry);
            }

            
            {
                transformer = entrytransformer;
                super();
            }
        };
    }

    static Function asEntryToValueFunction(EntryTransformer entrytransformer)
    {
        Preconditions.checkNotNull(entrytransformer);
        return new Function(entrytransformer) {

            final EntryTransformer val$transformer;

            public volatile Object apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public Object apply(java.util.Map.Entry entry)
            {
                return transformer.transformEntry(entry.getKey(), entry.getValue());
            }

            
            {
                transformer = entrytransformer;
                super();
            }
        };
    }

    static EntryTransformer asEntryTransformer(Function function)
    {
        Preconditions.checkNotNull(function);
        return new EntryTransformer(function) {

            final Function val$function;

            public Object transformEntry(Object obj, Object obj1)
            {
                return function.apply(obj1);
            }

            
            {
                function = function1;
                super();
            }
        };
    }

    public static Map asMap(Set set, Function function)
    {
        if (set instanceof SortedSet)
        {
            return asMap((SortedSet)set, function);
        } else
        {
            return new AsMapView(set, function);
        }
    }

    public static NavigableMap asMap(NavigableSet navigableset, Function function)
    {
        return new NavigableAsMapView(navigableset, function);
    }

    public static SortedMap asMap(SortedSet sortedset, Function function)
    {
        return Platform.mapsAsMapSortedSet(sortedset, function);
    }

    static Iterator asMapEntryIterator(Set set, Function function)
    {
        return new TransformedIterator(set.iterator(), function) {

            final Function val$function;

            volatile Object transform(Object obj)
            {
                return transform(obj);
            }

            java.util.Map.Entry transform(Object obj)
            {
                return Maps.immutableEntry(obj, function.apply(obj));
            }

            
            {
                function = function1;
                super(iterator);
            }
        };
    }

    static SortedMap asMapSortedIgnoreNavigable(SortedSet sortedset, Function function)
    {
        return new SortedAsMapView(sortedset, function);
    }

    static Function asValueToValueFunction(EntryTransformer entrytransformer, Object obj)
    {
        Preconditions.checkNotNull(entrytransformer);
        return new Function(entrytransformer, obj) {

            final Object val$key;
            final EntryTransformer val$transformer;

            public Object apply(Object obj1)
            {
                return transformer.transformEntry(key, obj1);
            }

            
            {
                transformer = entrytransformer;
                key = obj;
                super();
            }
        };
    }

    static int capacity(int i)
    {
        if (i < 3)
        {
            CollectPreconditions.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static boolean containsEntryImpl(Collection collection, Object obj)
    {
        if (!(obj instanceof java.util.Map.Entry))
        {
            return false;
        } else
        {
            return collection.contains(unmodifiableEntry((java.util.Map.Entry)obj));
        }
    }

    static boolean containsKeyImpl(Map map, Object obj)
    {
        return Iterators.contains(keyIterator(map.entrySet().iterator()), obj);
    }

    static boolean containsValueImpl(Map map, Object obj)
    {
        return Iterators.contains(valueIterator(map.entrySet().iterator()), obj);
    }

    public static MapDifference difference(Map map, Map map1)
    {
        if (map instanceof SortedMap)
        {
            return difference((SortedMap)map, map1);
        } else
        {
            return difference(map, map1, Equivalence.equals());
        }
    }

    public static MapDifference difference(Map map, Map map1, Equivalence equivalence)
    {
        Preconditions.checkNotNull(equivalence);
        HashMap hashmap = newHashMap();
        HashMap hashmap1 = new HashMap(map1);
        HashMap hashmap2 = newHashMap();
        HashMap hashmap3 = newHashMap();
        doDifference(map, map1, equivalence, hashmap, hashmap1, hashmap2, hashmap3);
        return new MapDifferenceImpl(hashmap, hashmap1, hashmap2, hashmap3);
    }

    public static SortedMapDifference difference(SortedMap sortedmap, Map map)
    {
        Preconditions.checkNotNull(sortedmap);
        Preconditions.checkNotNull(map);
        Object obj = orNaturalOrder(sortedmap.comparator());
        TreeMap treemap = newTreeMap(((Comparator) (obj)));
        TreeMap treemap1 = newTreeMap(((Comparator) (obj)));
        treemap1.putAll(map);
        TreeMap treemap2 = newTreeMap(((Comparator) (obj)));
        obj = newTreeMap(((Comparator) (obj)));
        doDifference(sortedmap, map, Equivalence.equals(), treemap, treemap1, treemap2, ((Map) (obj)));
        return new SortedMapDifferenceImpl(treemap, treemap1, treemap2, ((SortedMap) (obj)));
    }

    private static void doDifference(Map map, Map map1, Equivalence equivalence, Map map2, Map map3, Map map4, Map map5)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)map.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            if (map1.containsKey(obj))
            {
                Object obj2 = map3.remove(obj);
                if (equivalence.equivalent(obj1, obj2))
                {
                    map4.put(obj, obj1);
                } else
                {
                    map5.put(obj, ValueDifferenceImpl.create(obj1, obj2));
                }
            } else
            {
                map2.put(obj, obj1);
            }
        }

    }

    static boolean equalsImpl(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    public static BiMap filterEntries(BiMap bimap, Predicate predicate)
    {
        Preconditions.checkNotNull(bimap);
        Preconditions.checkNotNull(predicate);
        if (bimap instanceof FilteredEntryBiMap)
        {
            return filterFiltered((FilteredEntryBiMap)bimap, predicate);
        } else
        {
            return new FilteredEntryBiMap(bimap, predicate);
        }
    }

    public static Map filterEntries(Map map, Predicate predicate)
    {
        if (map instanceof SortedMap)
        {
            return filterEntries((SortedMap)map, predicate);
        }
        if (map instanceof BiMap)
        {
            return filterEntries((BiMap)map, predicate);
        }
        Preconditions.checkNotNull(predicate);
        if (map instanceof AbstractFilteredMap)
        {
            return filterFiltered((AbstractFilteredMap)map, predicate);
        } else
        {
            return new FilteredEntryMap((Map)Preconditions.checkNotNull(map), predicate);
        }
    }

    public static NavigableMap filterEntries(NavigableMap navigablemap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (navigablemap instanceof FilteredEntryNavigableMap)
        {
            return filterFiltered((FilteredEntryNavigableMap)navigablemap, predicate);
        } else
        {
            return new FilteredEntryNavigableMap((NavigableMap)Preconditions.checkNotNull(navigablemap), predicate);
        }
    }

    public static SortedMap filterEntries(SortedMap sortedmap, Predicate predicate)
    {
        return Platform.mapsFilterSortedMap(sortedmap, predicate);
    }

    private static BiMap filterFiltered(FilteredEntryBiMap filteredentrybimap, Predicate predicate)
    {
        predicate = Predicates.and(filteredentrybimap.predicate, predicate);
        return new FilteredEntryBiMap(filteredentrybimap.unfiltered(), predicate);
    }

    private static Map filterFiltered(AbstractFilteredMap abstractfilteredmap, Predicate predicate)
    {
        return new FilteredEntryMap(abstractfilteredmap.unfiltered, Predicates.and(abstractfilteredmap.predicate, predicate));
    }

    private static NavigableMap filterFiltered(FilteredEntryNavigableMap filteredentrynavigablemap, Predicate predicate)
    {
        predicate = Predicates.and(filteredentrynavigablemap.entryPredicate, predicate);
        return new FilteredEntryNavigableMap(filteredentrynavigablemap.unfiltered, predicate);
    }

    private static SortedMap filterFiltered(FilteredEntrySortedMap filteredentrysortedmap, Predicate predicate)
    {
        predicate = Predicates.and(filteredentrysortedmap.predicate, predicate);
        return new FilteredEntrySortedMap(filteredentrysortedmap.sortedMap(), predicate);
    }

    public static BiMap filterKeys(BiMap bimap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        return filterEntries(bimap, keyPredicateOnEntries(predicate));
    }

    public static Map filterKeys(Map map, Predicate predicate)
    {
        if (map instanceof SortedMap)
        {
            return filterKeys((SortedMap)map, predicate);
        }
        if (map instanceof BiMap)
        {
            return filterKeys((BiMap)map, predicate);
        }
        Preconditions.checkNotNull(predicate);
        Predicate predicate1 = keyPredicateOnEntries(predicate);
        if (map instanceof AbstractFilteredMap)
        {
            return filterFiltered((AbstractFilteredMap)map, predicate1);
        } else
        {
            return new FilteredKeyMap((Map)Preconditions.checkNotNull(map), predicate, predicate1);
        }
    }

    public static NavigableMap filterKeys(NavigableMap navigablemap, Predicate predicate)
    {
        return filterEntries(navigablemap, keyPredicateOnEntries(predicate));
    }

    public static SortedMap filterKeys(SortedMap sortedmap, Predicate predicate)
    {
        return filterEntries(sortedmap, keyPredicateOnEntries(predicate));
    }

    static SortedMap filterSortedIgnoreNavigable(SortedMap sortedmap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (sortedmap instanceof FilteredEntrySortedMap)
        {
            return filterFiltered((FilteredEntrySortedMap)sortedmap, predicate);
        } else
        {
            return new FilteredEntrySortedMap((SortedMap)Preconditions.checkNotNull(sortedmap), predicate);
        }
    }

    public static BiMap filterValues(BiMap bimap, Predicate predicate)
    {
        return filterEntries(bimap, valuePredicateOnEntries(predicate));
    }

    public static Map filterValues(Map map, Predicate predicate)
    {
        if (map instanceof SortedMap)
        {
            return filterValues((SortedMap)map, predicate);
        }
        if (map instanceof BiMap)
        {
            return filterValues((BiMap)map, predicate);
        } else
        {
            return filterEntries(map, valuePredicateOnEntries(predicate));
        }
    }

    public static NavigableMap filterValues(NavigableMap navigablemap, Predicate predicate)
    {
        return filterEntries(navigablemap, valuePredicateOnEntries(predicate));
    }

    public static SortedMap filterValues(SortedMap sortedmap, Predicate predicate)
    {
        return filterEntries(sortedmap, valuePredicateOnEntries(predicate));
    }

    public static ImmutableMap fromProperties(Properties properties)
    {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        String s;
        for (Enumeration enumeration = properties.propertyNames(); enumeration.hasMoreElements(); builder.put(s, properties.getProperty(s)))
        {
            s = (String)enumeration.nextElement();
        }

        return builder.build();
    }

    public static java.util.Map.Entry immutableEntry(Object obj, Object obj1)
    {
        return new ImmutableEntry(obj, obj1);
    }

    public static ImmutableMap immutableEnumMap(Map map)
    {
        if (map instanceof ImmutableEnumMap)
        {
            return (ImmutableEnumMap)map;
        }
        if (map.isEmpty())
        {
            return ImmutableMap.of();
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); Preconditions.checkNotNull(entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            Preconditions.checkNotNull(entry.getKey());
        }

        return ImmutableEnumMap.asImmutable(new EnumMap(map));
    }

    static Function keyFunction()
    {
        return EntryFunction.KEY;
    }

    static Iterator keyIterator(Iterator iterator)
    {
        return Iterators.transform(iterator, keyFunction());
    }

    static Object keyOrNull(java.util.Map.Entry entry)
    {
        if (entry == null)
        {
            return null;
        } else
        {
            return entry.getKey();
        }
    }

    static Predicate keyPredicateOnEntries(Predicate predicate)
    {
        return Predicates.compose(predicate, keyFunction());
    }

    public static ConcurrentMap newConcurrentMap()
    {
        return (new MapMaker()).makeMap();
    }

    public static EnumMap newEnumMap(Class class1)
    {
        return new EnumMap((Class)Preconditions.checkNotNull(class1));
    }

    public static EnumMap newEnumMap(Map map)
    {
        return new EnumMap(map);
    }

    public static HashMap newHashMap()
    {
        return new HashMap();
    }

    public static HashMap newHashMap(Map map)
    {
        return new HashMap(map);
    }

    public static HashMap newHashMapWithExpectedSize(int i)
    {
        return new HashMap(capacity(i));
    }

    public static IdentityHashMap newIdentityHashMap()
    {
        return new IdentityHashMap();
    }

    public static LinkedHashMap newLinkedHashMap()
    {
        return new LinkedHashMap();
    }

    public static LinkedHashMap newLinkedHashMap(Map map)
    {
        return new LinkedHashMap(map);
    }

    public static TreeMap newTreeMap()
    {
        return new TreeMap();
    }

    public static TreeMap newTreeMap(Comparator comparator)
    {
        return new TreeMap(comparator);
    }

    public static TreeMap newTreeMap(SortedMap sortedmap)
    {
        return new TreeMap(sortedmap);
    }

    static Comparator orNaturalOrder(Comparator comparator)
    {
        if (comparator != null)
        {
            return comparator;
        } else
        {
            return Ordering.natural();
        }
    }

    static void putAllImpl(Map map, Map map1)
    {
        java.util.Map.Entry entry;
        for (map1 = map1.entrySet().iterator(); map1.hasNext(); map.put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map1.next();
        }

    }

    static boolean removeEntryImpl(Collection collection, Object obj)
    {
        if (!(obj instanceof java.util.Map.Entry))
        {
            return false;
        } else
        {
            return collection.remove(unmodifiableEntry((java.util.Map.Entry)obj));
        }
    }

    private static NavigableSet removeOnlyNavigableSet(NavigableSet navigableset)
    {
        return new ForwardingNavigableSet(navigableset) {

            final NavigableSet val$set;

            public boolean add(Object obj)
            {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection collection)
            {
                throw new UnsupportedOperationException();
            }

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected volatile Collection _mthdelegate()
            {
                return _mthdelegate();
            }

            protected NavigableSet _mthdelegate()
            {
                return set;
            }

            protected volatile Set _mthdelegate()
            {
                return _mthdelegate();
            }

            protected volatile SortedSet _mthdelegate()
            {
                return _mthdelegate();
            }

            public NavigableSet descendingSet()
            {
                return Maps.removeOnlyNavigableSet(descendingSet());
            }

            public NavigableSet headSet(Object obj, boolean flag)
            {
                return Maps.removeOnlyNavigableSet(headSet(obj, flag));
            }

            public SortedSet headSet(Object obj)
            {
                return Maps.removeOnlySortedSet(headSet(obj));
            }

            public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
            {
                return Maps.removeOnlyNavigableSet(subSet(obj, flag, obj1, flag1));
            }

            public SortedSet subSet(Object obj, Object obj1)
            {
                return Maps.removeOnlySortedSet(subSet(obj, obj1));
            }

            public NavigableSet tailSet(Object obj, boolean flag)
            {
                return Maps.removeOnlyNavigableSet(tailSet(obj, flag));
            }

            public SortedSet tailSet(Object obj)
            {
                return Maps.removeOnlySortedSet(tailSet(obj));
            }

            
            {
                set = navigableset;
                super();
            }
        };
    }

    private static Set removeOnlySet(Set set)
    {
        return new ForwardingSet(set) {

            final Set val$set;

            public boolean add(Object obj)
            {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection collection)
            {
                throw new UnsupportedOperationException();
            }

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected volatile Collection _mthdelegate()
            {
                return _mthdelegate();
            }

            protected Set _mthdelegate()
            {
                return set;
            }

            
            {
                set = set1;
                super();
            }
        };
    }

    private static SortedSet removeOnlySortedSet(SortedSet sortedset)
    {
        return new ForwardingSortedSet(sortedset) {

            final SortedSet val$set;

            public boolean add(Object obj)
            {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection collection)
            {
                throw new UnsupportedOperationException();
            }

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected volatile Collection _mthdelegate()
            {
                return _mthdelegate();
            }

            protected volatile Set _mthdelegate()
            {
                return _mthdelegate();
            }

            protected SortedSet _mthdelegate()
            {
                return set;
            }

            public SortedSet headSet(Object obj)
            {
                return Maps.removeOnlySortedSet(headSet(obj));
            }

            public SortedSet subSet(Object obj, Object obj1)
            {
                return Maps.removeOnlySortedSet(subSet(obj, obj1));
            }

            public SortedSet tailSet(Object obj)
            {
                return Maps.removeOnlySortedSet(tailSet(obj));
            }

            
            {
                set = sortedset;
                super();
            }
        };
    }

    static boolean safeContainsKey(Map map, Object obj)
    {
        Preconditions.checkNotNull(map);
        boolean flag;
        try
        {
            flag = map.containsKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    static Object safeGet(Map map, Object obj)
    {
        Preconditions.checkNotNull(map);
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static Object safeRemove(Map map, Object obj)
    {
        Preconditions.checkNotNull(map);
        try
        {
            map = ((Map) (map.remove(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    public static BiMap synchronizedBiMap(BiMap bimap)
    {
        return Synchronized.biMap(bimap, null);
    }

    public static NavigableMap synchronizedNavigableMap(NavigableMap navigablemap)
    {
        return Synchronized.navigableMap(navigablemap);
    }

    public static ImmutableMap toMap(Iterable iterable, Function function)
    {
        return toMap(iterable.iterator(), function);
    }

    public static ImmutableMap toMap(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(function);
        LinkedHashMap linkedhashmap = newLinkedHashMap();
        Object obj;
        for (; iterator.hasNext(); linkedhashmap.put(obj, function.apply(obj)))
        {
            obj = iterator.next();
        }

        return ImmutableMap.copyOf(linkedhashmap);
    }

    static String toStringImpl(Map map)
    {
        StringBuilder stringbuilder = Collections2.newStringBuilderForCollection(map.size()).append('{');
        STANDARD_JOINER.appendTo(stringbuilder, map);
        return stringbuilder.append('}').toString();
    }

    public static Map transformEntries(Map map, EntryTransformer entrytransformer)
    {
        if (map instanceof SortedMap)
        {
            return transformEntries((SortedMap)map, entrytransformer);
        } else
        {
            return new TransformedEntriesMap(map, entrytransformer);
        }
    }

    public static NavigableMap transformEntries(NavigableMap navigablemap, EntryTransformer entrytransformer)
    {
        return new TransformedEntriesNavigableMap(navigablemap, entrytransformer);
    }

    public static SortedMap transformEntries(SortedMap sortedmap, EntryTransformer entrytransformer)
    {
        return Platform.mapsTransformEntriesSortedMap(sortedmap, entrytransformer);
    }

    static SortedMap transformEntriesIgnoreNavigable(SortedMap sortedmap, EntryTransformer entrytransformer)
    {
        return new TransformedEntriesSortedMap(sortedmap, entrytransformer);
    }

    static java.util.Map.Entry transformEntry(EntryTransformer entrytransformer, java.util.Map.Entry entry)
    {
        Preconditions.checkNotNull(entrytransformer);
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry(entry, entrytransformer) {

            final java.util.Map.Entry val$entry;
            final EntryTransformer val$transformer;

            public Object getKey()
            {
                return entry.getKey();
            }

            public Object getValue()
            {
                return transformer.transformEntry(entry.getKey(), entry.getValue());
            }

            
            {
                entry = entry1;
                transformer = entrytransformer;
                super();
            }
        };
    }

    public static Map transformValues(Map map, Function function)
    {
        return transformEntries(map, asEntryTransformer(function));
    }

    public static NavigableMap transformValues(NavigableMap navigablemap, Function function)
    {
        return transformEntries(navigablemap, asEntryTransformer(function));
    }

    public static SortedMap transformValues(SortedMap sortedmap, Function function)
    {
        return transformEntries(sortedmap, asEntryTransformer(function));
    }

    public static ImmutableMap uniqueIndex(Iterable iterable, Function function)
    {
        return uniqueIndex(iterable.iterator(), function);
    }

    public static ImmutableMap uniqueIndex(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Object obj;
        for (; iterator.hasNext(); builder.put(function.apply(obj), obj))
        {
            obj = iterator.next();
        }

        return builder.build();
    }

    public static BiMap unmodifiableBiMap(BiMap bimap)
    {
        return new UnmodifiableBiMap(bimap, null);
    }

    static java.util.Map.Entry unmodifiableEntry(java.util.Map.Entry entry)
    {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry(entry) {

            final java.util.Map.Entry val$entry;

            public Object getKey()
            {
                return entry.getKey();
            }

            public Object getValue()
            {
                return entry.getValue();
            }

            
            {
                entry = entry1;
                super();
            }
        };
    }

    static Set unmodifiableEntrySet(Set set)
    {
        return new UnmodifiableEntrySet(Collections.unmodifiableSet(set));
    }

    private static Map unmodifiableMap(Map map)
    {
        if (map instanceof SortedMap)
        {
            return Collections.unmodifiableSortedMap((SortedMap)map);
        } else
        {
            return Collections.unmodifiableMap(map);
        }
    }

    public static NavigableMap unmodifiableNavigableMap(NavigableMap navigablemap)
    {
        Preconditions.checkNotNull(navigablemap);
        if (navigablemap instanceof UnmodifiableNavigableMap)
        {
            return navigablemap;
        } else
        {
            return new UnmodifiableNavigableMap(navigablemap);
        }
    }

    private static java.util.Map.Entry unmodifiableOrNull(java.util.Map.Entry entry)
    {
        if (entry == null)
        {
            return null;
        } else
        {
            return unmodifiableEntry(entry);
        }
    }

    static Function valueFunction()
    {
        return EntryFunction.VALUE;
    }

    static UnmodifiableIterator valueIterator(UnmodifiableIterator unmodifiableiterator)
    {
        return new UnmodifiableIterator(unmodifiableiterator) {

            final UnmodifiableIterator val$entryIterator;

            public boolean hasNext()
            {
                return entryIterator.hasNext();
            }

            public Object next()
            {
                return ((java.util.Map.Entry)entryIterator.next()).getValue();
            }

            
            {
                entryIterator = unmodifiableiterator;
                super();
            }
        };
    }

    static Iterator valueIterator(Iterator iterator)
    {
        return Iterators.transform(iterator, valueFunction());
    }

    static Object valueOrNull(java.util.Map.Entry entry)
    {
        if (entry == null)
        {
            return null;
        } else
        {
            return entry.getValue();
        }
    }

    static Predicate valuePredicateOnEntries(Predicate predicate)
    {
        return Predicates.compose(predicate, valueFunction());
    }

    static 
    {
        STANDARD_JOINER = Collections2.STANDARD_JOINER.withKeyValueSeparator("=");
    }





}
