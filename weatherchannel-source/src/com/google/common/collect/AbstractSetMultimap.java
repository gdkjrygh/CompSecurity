// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, SetMultimap, ImmutableSet

abstract class AbstractSetMultimap extends AbstractMapBasedMultimap
    implements SetMultimap
{

    private static final long serialVersionUID = 0x67226fd4cd0928d8L;

    protected AbstractSetMultimap(Map map)
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

    abstract Set createCollection();

    volatile Collection createUnmodifiableEmptyCollection()
    {
        return createUnmodifiableEmptyCollection();
    }

    Set createUnmodifiableEmptyCollection()
    {
        return ImmutableSet.of();
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return (Set)super.entries();
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(Object obj)
    {
        return (Set)super.get(obj);
    }

    public boolean put(Object obj, Object obj1)
    {
        return super.put(obj, obj1);
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
}
