// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractSetMultimap, SortedSetMultimap, ImmutableSortedSet

abstract class AbstractSortedSetMultimap extends AbstractSetMultimap
    implements SortedSetMultimap
{

    private static final long serialVersionUID = 0x5faae81de71c4a4L;

    protected AbstractSortedSetMultimap(Map map)
    {
        super(map);
    }

    public Map asMap()
    {
        return super.asMap();
    }

    volatile Collection createCollection()
    {
        return createCollection();
    }

    volatile Set createCollection()
    {
        return createCollection();
    }

    abstract SortedSet createCollection();

    volatile Collection createUnmodifiableEmptyCollection()
    {
        return createUnmodifiableEmptyCollection();
    }

    volatile Set createUnmodifiableEmptyCollection()
    {
        return createUnmodifiableEmptyCollection();
    }

    SortedSet createUnmodifiableEmptyCollection()
    {
        if (valueComparator() == null)
        {
            return Collections.unmodifiableSortedSet(createCollection());
        } else
        {
            return ImmutableSortedSet.emptySet(valueComparator());
        }
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
        return (SortedSet)super.get(obj);
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
        return (SortedSet)super.removeAll(obj);
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
        return (SortedSet)super.replaceValues(obj, iterable);
    }

    public Collection values()
    {
        return super.values();
    }
}
