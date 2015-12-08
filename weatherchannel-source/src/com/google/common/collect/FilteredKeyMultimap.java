// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, FilteredMultimap, Multimap, Maps, 
//            Sets, Multisets, FilteredMultimapValues, SetMultimap, 
//            ImmutableSet, ImmutableList, Multiset, ForwardingList, 
//            ForwardingSet, ForwardingCollection, Collections2

class FilteredKeyMultimap extends AbstractMultimap
    implements FilteredMultimap
{
    static class AddRejectingList extends ForwardingList
    {

        final Object key;

        public void add(int i, Object obj)
        {
            Preconditions.checkPositionIndex(i, 0);
            obj = String.valueOf(String.valueOf(key));
            throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 32)).append("Key does not satisfy predicate: ").append(((String) (obj))).toString());
        }

        public boolean add(Object obj)
        {
            add(0, obj);
            return true;
        }

        public boolean addAll(int i, Collection collection)
        {
            Preconditions.checkNotNull(collection);
            Preconditions.checkPositionIndex(i, 0);
            collection = String.valueOf(String.valueOf(key));
            throw new IllegalArgumentException((new StringBuilder(collection.length() + 32)).append("Key does not satisfy predicate: ").append(collection).toString());
        }

        public boolean addAll(Collection collection)
        {
            addAll(0, collection);
            return true;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected List _mthdelegate()
        {
            return Collections.emptyList();
        }

        AddRejectingList(Object obj)
        {
            key = obj;
        }
    }

    static class AddRejectingSet extends ForwardingSet
    {

        final Object key;

        public boolean add(Object obj)
        {
            obj = String.valueOf(String.valueOf(key));
            throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 32)).append("Key does not satisfy predicate: ").append(((String) (obj))).toString());
        }

        public boolean addAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            collection = String.valueOf(String.valueOf(key));
            throw new IllegalArgumentException((new StringBuilder(collection.length() + 32)).append("Key does not satisfy predicate: ").append(collection).toString());
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
            return Collections.emptySet();
        }

        AddRejectingSet(Object obj)
        {
            key = obj;
        }
    }

    class Entries extends ForwardingCollection
    {

        final FilteredKeyMultimap this$0;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Collection _mthdelegate()
        {
            return Collections2.filter(unfiltered.entries(), entryPredicate());
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                if (unfiltered.containsKey(((java.util.Map.Entry) (obj)).getKey()) && keyPredicate.apply(((java.util.Map.Entry) (obj)).getKey()))
                {
                    return unfiltered.remove(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        Entries()
        {
            this$0 = FilteredKeyMultimap.this;
            super();
        }
    }


    final Predicate keyPredicate;
    final Multimap unfiltered;

    FilteredKeyMultimap(Multimap multimap, Predicate predicate)
    {
        unfiltered = (Multimap)Preconditions.checkNotNull(multimap);
        keyPredicate = (Predicate)Preconditions.checkNotNull(predicate);
    }

    public void clear()
    {
        keySet().clear();
    }

    public boolean containsKey(Object obj)
    {
        if (unfiltered.containsKey(obj))
        {
            return keyPredicate.apply(obj);
        } else
        {
            return false;
        }
    }

    Map createAsMap()
    {
        return Maps.filterKeys(unfiltered.asMap(), keyPredicate);
    }

    Collection createEntries()
    {
        return new Entries();
    }

    Set createKeySet()
    {
        return Sets.filter(unfiltered.keySet(), keyPredicate);
    }

    Multiset createKeys()
    {
        return Multisets.filter(unfiltered.keys(), keyPredicate);
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
        return Maps.keyPredicateOnEntries(keyPredicate);
    }

    public Collection get(Object obj)
    {
        if (keyPredicate.apply(obj))
        {
            return unfiltered.get(obj);
        }
        if (unfiltered instanceof SetMultimap)
        {
            return new AddRejectingSet(obj);
        } else
        {
            return new AddRejectingList(obj);
        }
    }

    public Collection removeAll(Object obj)
    {
        if (containsKey(obj))
        {
            return unfiltered.removeAll(obj);
        } else
        {
            return unmodifiableEmptyCollection();
        }
    }

    public int size()
    {
        int i = 0;
        for (Iterator iterator = asMap().values().iterator(); iterator.hasNext();)
        {
            i += ((Collection)iterator.next()).size();
        }

        return i;
    }

    public Multimap unfiltered()
    {
        return unfiltered;
    }

    Collection unmodifiableEmptyCollection()
    {
        if (unfiltered instanceof SetMultimap)
        {
            return ImmutableSet.of();
        } else
        {
            return ImmutableList.of();
        }
    }
}
