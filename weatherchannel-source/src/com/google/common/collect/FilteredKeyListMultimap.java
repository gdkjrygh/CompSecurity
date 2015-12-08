// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            FilteredKeyMultimap, ListMultimap, Multimap

final class FilteredKeyListMultimap extends FilteredKeyMultimap
    implements ListMultimap
{

    FilteredKeyListMultimap(ListMultimap listmultimap, Predicate predicate)
    {
        super(listmultimap, predicate);
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        return (List)super.get(obj);
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

    public ListMultimap unfiltered()
    {
        return (ListMultimap)super.unfiltered();
    }

    public volatile Multimap unfiltered()
    {
        return unfiltered();
    }
}
