// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableCollection, ImmutableSet

public static final class comparator extends comparator
{

    private final Comparator comparator;

    public volatile sedBuilder add(Object obj)
    {
        return add(obj);
    }

    public volatile  add(Object obj)
    {
        return add(obj);
    }

    public volatile  add(Object aobj[])
    {
        return add(aobj);
    }

    public volatile add add(Object obj)
    {
        return add(obj);
    }

    public volatile add add(Object aobj[])
    {
        return add(aobj);
    }

    public add add(Object obj)
    {
        super.add(obj);
        return this;
    }

    public transient add add(Object aobj[])
    {
        super.add(aobj);
        return this;
    }

    public volatile  addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile  addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public volatile addAll addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile addAll addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public addAll addAll(Iterable iterable)
    {
        super.(iterable);
        return this;
    }

    public  addAll(Iterator iterator)
    {
        super.(iterator);
        return this;
    }

    public volatile ImmutableCollection build()
    {
        return build();
    }

    public volatile ImmutableSet build()
    {
        return build();
    }

    public ImmutableSortedSet build()
    {
        Object aobj[] = (Object[])contents;
        ImmutableSortedSet immutablesortedset = ImmutableSortedSet.construct(comparator, size, aobj);
        size = immutablesortedset.size();
        return immutablesortedset;
    }

    public (Comparator comparator1)
    {
        comparator = (Comparator)Preconditions.checkNotNull(comparator1);
    }
}
