// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, ListMultimap, ImmutableList

abstract class AbstractListMultimap extends AbstractMapBasedMultimap
    implements ListMultimap
{

    private static final long serialVersionUID = 0x5b6e85fc5d362ea5L;

    protected AbstractListMultimap(Map map)
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

    abstract List createCollection();

    volatile Collection createUnmodifiableEmptyCollection()
    {
        return createUnmodifiableEmptyCollection();
    }

    List createUnmodifiableEmptyCollection()
    {
        return ImmutableList.of();
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        return (List)super.get(obj);
    }

    public boolean put(Object obj, Object obj1)
    {
        return super.put(obj, obj1);
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        return (List)super.removeAll(obj);
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        return (List)super.replaceValues(obj, iterable);
    }
}
