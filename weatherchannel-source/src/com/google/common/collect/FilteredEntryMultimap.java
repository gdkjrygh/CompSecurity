// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, FilteredMultimap, Multimap, Sets, 
//            Collections2, Maps, FilteredMultimapValues, SetMultimap, 
//            Multiset, Lists, Iterators, AbstractIterator, 
//            CollectPreconditions, Multisets

class FilteredEntryMultimap extends AbstractMultimap
    implements FilteredMultimap
{
    class AsMap extends Maps.ImprovedAbstractMap
    {

        final FilteredEntryMultimap this$0;

        public void clear()
        {
            FilteredEntryMultimap.this.clear();
        }

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        Set createEntrySet()
        {
            return new Maps.EntrySet() {

                final AsMap this$1;

                public Iterator iterator()
                {
                    return new AbstractIterator() {

                        final Iterator backingIterator;
                        final AsMap._cls2 this$2;

                        protected volatile Object computeNext()
                        {
                            return computeNext();
                        }

                        protected java.util.Map.Entry computeNext()
                        {
                            while (backingIterator.hasNext()) 
                            {
                                Object obj1 = (java.util.Map.Entry)backingIterator.next();
                                Object obj = ((java.util.Map.Entry) (obj1)).getKey();
                                obj1 = FilteredEntryMultimap.filterCollection((Collection)((java.util.Map.Entry) (obj1)).getValue(), new ValuePredicate(obj));
                                if (!((Collection) (obj1)).isEmpty())
                                {
                                    return Maps.immutableEntry(obj, obj1);
                                }
                            }
                            return (java.util.Map.Entry)endOfData();
                        }

            
            {
                this$2 = AsMap._cls2.this;
                super();
                backingIterator = unfiltered.asMap().entrySet().iterator();
            }
                    };
                }

                Map map()
                {
                    return AsMap.this;
                }

                public boolean removeAll(Collection collection)
                {
                    return removeEntriesIf(Predicates.in(collection));
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntriesIf(Predicates.not(Predicates.in(collection)));
                }

                public int size()
                {
                    return Iterators.size(iterator());
                }

            
            {
                this$1 = AsMap.this;
                super();
            }
            };
        }

        Set createKeySet()
        {
            return new Maps.KeySet(this) {

                final AsMap this$1;

                public boolean remove(Object obj)
                {
                    return AsMap.this.remove(obj) != null;
                }

                public boolean removeAll(Collection collection)
                {
                    return removeEntriesIf(Maps.keyPredicateOnEntries(Predicates.in(collection)));
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntriesIf(Maps.keyPredicateOnEntries(Predicates.not(Predicates.in(collection))));
                }

            
            {
                this$1 = AsMap.this;
                super(map);
            }
            };
        }

        Collection createValues()
        {
            return new Maps.Values(this) {

                final AsMap this$1;

                public boolean remove(Object obj)
                {
label0:
                    {
                        if (!(obj instanceof Collection))
                        {
                            break label0;
                        }
                        obj = (Collection)obj;
                        Iterator iterator = unfiltered.asMap().entrySet().iterator();
                        java.util.Map.Entry entry;
                        Object obj1;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break label0;
                            }
                            entry = (java.util.Map.Entry)iterator.next();
                            obj1 = entry.getKey();
                            obj1 = FilteredEntryMultimap.filterCollection((Collection)entry.getValue(), new ValuePredicate(obj1));
                        } while (((Collection) (obj1)).isEmpty() || !((Collection) (obj)).equals(obj1));
                        if (((Collection) (obj1)).size() == ((Collection)entry.getValue()).size())
                        {
                            iterator.remove();
                        } else
                        {
                            ((Collection) (obj1)).clear();
                        }
                        return true;
                    }
                    return false;
                }

                public boolean removeAll(Collection collection)
                {
                    return removeEntriesIf(Maps.valuePredicateOnEntries(Predicates.in(collection)));
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntriesIf(Maps.valuePredicateOnEntries(Predicates.not(Predicates.in(collection))));
                }

            
            {
                this$1 = AsMap.this;
                super(map);
            }
            };
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Collection get(Object obj)
        {
            Collection collection = (Collection)unfiltered.asMap().get(obj);
            if (collection != null)
            {
                if (!((Collection) (obj = FilteredEntryMultimap.filterCollection(collection, new ValuePredicate(obj)))).isEmpty())
                {
                    return ((Collection) (obj));
                }
            }
            return null;
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Collection remove(Object obj)
        {
            Object obj1 = (Collection)unfiltered.asMap().get(obj);
            if (obj1 != null)
            {
                java.util.ArrayList arraylist = Lists.newArrayList();
                obj1 = ((Collection) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    Object obj2 = ((Iterator) (obj1)).next();
                    if (satisfies(obj, obj2))
                    {
                        ((Iterator) (obj1)).remove();
                        arraylist.add(obj2);
                    }
                } while (true);
                if (!arraylist.isEmpty())
                {
                    if (unfiltered instanceof SetMultimap)
                    {
                        return Collections.unmodifiableSet(Sets.newLinkedHashSet(arraylist));
                    } else
                    {
                        return Collections.unmodifiableList(arraylist);
                    }
                }
            }
            return null;
        }

        AsMap()
        {
            this$0 = FilteredEntryMultimap.this;
            super();
        }
    }

    class Keys extends Multimaps.Keys
    {

        final FilteredEntryMultimap this$0;

        public Set entrySet()
        {
            return new Multisets.EntrySet() {

                final Keys this$1;

                private boolean removeEntriesIf(Predicate predicate1)
                {
                    return FilteredEntryMultimap.this.removeEntriesIf(predicate1. new Predicate() {

                        final Keys._cls1 this$2;
                        final Predicate val$predicate;

                        public volatile boolean apply(Object obj)
                        {
                            return apply((java.util.Map.Entry)obj);
                        }

                        public boolean apply(java.util.Map.Entry entry)
                        {
                            return predicate.apply(Multisets.immutableEntry(entry.getKey(), ((Collection)entry.getValue()).size()));
                        }

            
            {
                this$2 = final__pcls1;
                predicate = Predicate.this;
                super();
            }
                    });
                }

                public Iterator iterator()
                {
                    return entryIterator();
                }

                Multiset multiset()
                {
                    return Keys.this;
                }

                public boolean removeAll(Collection collection)
                {
                    return removeEntriesIf(Predicates.in(collection));
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntriesIf(Predicates.not(Predicates.in(collection)));
                }

                public int size()
                {
                    return keySet().size();
                }

            
            {
                this$1 = Keys.this;
                super();
            }
            };
        }

        public int remove(Object obj, int i)
        {
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i != 0) goto _L2; else goto _L1
_L1:
            int k = count(obj);
_L4:
            return k;
_L2:
            Object obj1 = (Collection)unfiltered.asMap().get(obj);
            if (obj1 == null)
            {
                return 0;
            }
            int j = 0;
            obj1 = ((Collection) (obj1)).iterator();
            do
            {
                k = j;
                if (!((Iterator) (obj1)).hasNext())
                {
                    continue;
                }
                Object obj2 = ((Iterator) (obj1)).next();
                if (satisfies(obj, obj2))
                {
                    int l = j + 1;
                    j = l;
                    if (l <= i)
                    {
                        ((Iterator) (obj1)).remove();
                        j = l;
                    }
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        Keys()
        {
            this$0 = FilteredEntryMultimap.this;
            super(FilteredEntryMultimap.this);
        }
    }

    final class ValuePredicate
        implements Predicate
    {

        private final Object key;
        final FilteredEntryMultimap this$0;

        public boolean apply(Object obj)
        {
            return satisfies(key, obj);
        }

        ValuePredicate(Object obj)
        {
            this$0 = FilteredEntryMultimap.this;
            super();
            key = obj;
        }
    }


    final Predicate predicate;
    final Multimap unfiltered;

    FilteredEntryMultimap(Multimap multimap, Predicate predicate1)
    {
        unfiltered = (Multimap)Preconditions.checkNotNull(multimap);
        predicate = (Predicate)Preconditions.checkNotNull(predicate1);
    }

    static Collection filterCollection(Collection collection, Predicate predicate1)
    {
        if (collection instanceof Set)
        {
            return Sets.filter((Set)collection, predicate1);
        } else
        {
            return Collections2.filter(collection, predicate1);
        }
    }

    private boolean satisfies(Object obj, Object obj1)
    {
        return predicate.apply(Maps.immutableEntry(obj, obj1));
    }

    public void clear()
    {
        entries().clear();
    }

    public boolean containsKey(Object obj)
    {
        return asMap().get(obj) != null;
    }

    Map createAsMap()
    {
        return new AsMap();
    }

    Collection createEntries()
    {
        return filterCollection(unfiltered.entries(), predicate);
    }

    Multiset createKeys()
    {
        return new Keys();
    }

    Collection createValues()
    {
        return new FilteredMultimapValues(this);
    }

    Iterator entryIterator()
    {
        throw new AssertionError("should never be called");
    }

    public Predicate entryPredicate()
    {
        return predicate;
    }

    public Collection get(Object obj)
    {
        return filterCollection(unfiltered.get(obj), new ValuePredicate(obj));
    }

    public Set keySet()
    {
        return asMap().keySet();
    }

    public Collection removeAll(Object obj)
    {
        return (Collection)MoreObjects.firstNonNull(asMap().remove(obj), unmodifiableEmptyCollection());
    }

    boolean removeEntriesIf(Predicate predicate1)
    {
        Iterator iterator = unfiltered.asMap().entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj = entry.getKey();
            Collection collection = filterCollection((Collection)entry.getValue(), new ValuePredicate(obj));
            if (!collection.isEmpty() && predicate1.apply(Maps.immutableEntry(obj, collection)))
            {
                if (collection.size() == ((Collection)entry.getValue()).size())
                {
                    iterator.remove();
                } else
                {
                    collection.clear();
                }
                flag = true;
            }
        } while (true);
        return flag;
    }

    public int size()
    {
        return entries().size();
    }

    public Multimap unfiltered()
    {
        return unfiltered;
    }

    Collection unmodifiableEmptyCollection()
    {
        if (unfiltered instanceof SetMultimap)
        {
            return Collections.emptySet();
        } else
        {
            return Collections.emptyList();
        }
    }

}
