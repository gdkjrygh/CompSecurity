// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FilteredMultimap, Maps, Multimap, Iterables

final class FilteredMultimapValues extends AbstractCollection
{

    private final FilteredMultimap multimap;

    FilteredMultimapValues(FilteredMultimap filteredmultimap)
    {
        multimap = (FilteredMultimap)Preconditions.checkNotNull(filteredmultimap);
    }

    public void clear()
    {
        multimap.clear();
    }

    public boolean contains(Object obj)
    {
        return multimap.containsValue(obj);
    }

    public Iterator iterator()
    {
        return Maps.valueIterator(multimap.entries().iterator());
    }

    public boolean remove(Object obj)
    {
        Predicate predicate = multimap.entryPredicate();
        for (Iterator iterator1 = multimap.unfiltered().entries().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            if (predicate.apply(entry) && Objects.equal(entry.getValue(), obj))
            {
                iterator1.remove();
                return true;
            }
        }

        return false;
    }

    public boolean removeAll(Collection collection)
    {
        return Iterables.removeIf(multimap.unfiltered().entries(), Predicates.and(multimap.entryPredicate(), Maps.valuePredicateOnEntries(Predicates.in(collection))));
    }

    public boolean retainAll(Collection collection)
    {
        return Iterables.removeIf(multimap.unfiltered().entries(), Predicates.and(multimap.entryPredicate(), Maps.valuePredicateOnEntries(Predicates.not(Predicates.in(collection)))));
    }

    public int size()
    {
        return multimap.size();
    }
}
