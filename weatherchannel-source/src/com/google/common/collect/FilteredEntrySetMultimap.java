// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            FilteredEntryMultimap, FilteredSetMultimap, SetMultimap, Sets, 
//            Multimap

final class FilteredEntrySetMultimap extends FilteredEntryMultimap
    implements FilteredSetMultimap
{

    FilteredEntrySetMultimap(SetMultimap setmultimap, Predicate predicate)
    {
        super(setmultimap, predicate);
    }

    volatile Collection createEntries()
    {
        return createEntries();
    }

    Set createEntries()
    {
        return Sets.filter(unfiltered().entries(), entryPredicate());
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return (Set)super.entries();
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(Object obj)
    {
        return (Set)super.get(obj);
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public Set removeAll(Object obj)
    {
        return (Set)super.removeAll(obj);
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
    {
        return (Set)super.replaceValues(obj, iterable);
    }

    public volatile Multimap unfiltered()
    {
        return unfiltered();
    }

    public SetMultimap unfiltered()
    {
        return (SetMultimap)unfiltered;
    }
}
