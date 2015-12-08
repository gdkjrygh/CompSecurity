// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ForwardingMultimap, ListMultimap, Multimap

public abstract class ForwardingListMultimap extends ForwardingMultimap
    implements ListMultimap
{

    protected ForwardingListMultimap()
    {
    }

    protected abstract ListMultimap _mthdelegate();

    protected volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        return _mthdelegate().get(obj);
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        return _mthdelegate().removeAll(obj);
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        return _mthdelegate().replaceValues(obj, iterable);
    }
}
