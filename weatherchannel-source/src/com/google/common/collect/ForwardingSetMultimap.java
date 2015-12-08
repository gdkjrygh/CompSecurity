// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMultimap, SetMultimap, Multimap

public abstract class ForwardingSetMultimap extends ForwardingMultimap
    implements SetMultimap
{

    public ForwardingSetMultimap()
    {
    }

    protected volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract SetMultimap _mthdelegate();

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return _mthdelegate().entries();
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(Object obj)
    {
        return _mthdelegate().get(obj);
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public Set removeAll(Object obj)
    {
        return _mthdelegate().removeAll(obj);
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
    {
        return _mthdelegate().replaceValues(obj, iterable);
    }
}
