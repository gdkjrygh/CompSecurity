// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            FilteredEntryMultimap, Multimap, Lists, SetMultimap, 
//            Sets, Maps, Iterators, AbstractIterator

class it> extends it>
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

            final FilteredEntryMultimap.AsMap this$1;

            public Iterator iterator()
            {
                return new AbstractIterator() {

                    final Iterator backingIterator;
                    final _cls2 this$2;

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
                            obj1 = FilteredEntryMultimap.filterCollection((Collection)((java.util.Map.Entry) (obj1)).getValue(), new FilteredEntryMultimap.ValuePredicate(this$0, obj));
                            if (!((Collection) (obj1)).isEmpty())
                            {
                                return Maps.immutableEntry(obj, obj1);
                            }
                        }
                        return (java.util.Map.Entry)endOfData();
                    }

            
            {
                this$2 = _cls2.this;
                super();
                backingIterator = unfiltered.asMap().entrySet().iterator();
            }
                };
            }

            Map map()
            {
                return FilteredEntryMultimap.AsMap.this;
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
                this$1 = FilteredEntryMultimap.AsMap.this;
                super();
            }
        };
    }

    Set createKeySet()
    {
        return new Maps.KeySet(this) {

            final FilteredEntryMultimap.AsMap this$1;

            public boolean remove(Object obj)
            {
                return FilteredEntryMultimap.AsMap.this.remove(obj) != null;
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
                this$1 = FilteredEntryMultimap.AsMap.this;
                super(map);
            }
        };
    }

    Collection createValues()
    {
        return new Maps.Values(this) {

            final FilteredEntryMultimap.AsMap this$1;

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
                        obj1 = FilteredEntryMultimap.filterCollection((Collection)entry.getValue(), new FilteredEntryMultimap.ValuePredicate(this$0, obj1));
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
                this$1 = FilteredEntryMultimap.AsMap.this;
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
            if (!((Collection) (obj = FilteredEntryMultimap.filterCollection(collection, new redicate(FilteredEntryMultimap.this, obj)))).isEmpty())
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
                if (FilteredEntryMultimap.access$000(FilteredEntryMultimap.this, obj, obj2))
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

    _cls3.this._cls1()
    {
        this$0 = FilteredEntryMultimap.this;
        super();
    }
}
