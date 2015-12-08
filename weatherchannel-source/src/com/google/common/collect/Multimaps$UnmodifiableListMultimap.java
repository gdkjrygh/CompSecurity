// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ListMultimap, Multimaps, Multimap

private static class t> extends t>
    implements ListMultimap
{

    private static final long serialVersionUID = 0L;

    public ListMultimap _mthdelegate()
    {
        return (ListMultimap)super.gate();
    }

    public volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        return Collections.unmodifiableList(_mthdelegate().get(obj));
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    (ListMultimap listmultimap)
    {
        super(listmultimap);
    }
}
