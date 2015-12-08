// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            SortedSetMultimap, Multimaps, Multimap, SetMultimap

private static class  extends 
    implements SortedSetMultimap
{

    private static final long serialVersionUID = 0L;

    public volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile SetMultimap _mthdelegate()
    {
        return _mthdelegate();
    }

    public SortedSetMultimap _mthdelegate()
    {
        return (SortedSetMultimap)super.te();
    }

    public volatile Object _mthdelegate()
    {
        return _mthdelegate();
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
        return Collections.unmodifiableSortedSet(_mthdelegate().get(obj));
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
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    public Comparator valueComparator()
    {
        return _mthdelegate().valueComparator();
    }

    (SortedSetMultimap sortedsetmultimap)
    {
        super(sortedsetmultimap);
    }
}
