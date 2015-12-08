// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ListMultimap, Multimaps, Multimap, Maps, 
//            Lists

private static final class t> extends t>
    implements ListMultimap
{

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        return transform(obj, fromMultimap.get(obj));
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        return transform(obj, fromMultimap.removeAll(obj));
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    volatile Collection transform(Object obj, Collection collection)
    {
        return transform(obj, collection);
    }

    List transform(Object obj, Collection collection)
    {
        return Lists.transform((List)collection, Maps.asValueToValueFunction(transformer, obj));
    }

    (ListMultimap listmultimap,  )
    {
        super(listmultimap, );
    }
}
