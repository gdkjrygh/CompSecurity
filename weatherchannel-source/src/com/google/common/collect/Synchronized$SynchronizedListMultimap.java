// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ListMultimap, Synchronized, Multimap

private static class t> extends t>
    implements ListMultimap
{

    private static final long serialVersionUID = 0L;

    ListMultimap _mthdelegate()
    {
        return (ListMultimap)super.gate();
    }

    volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        synchronized (mutex)
        {
            obj = Synchronized.access$200(_mthdelegate().get(obj), mutex);
        }
        return ((List) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().removeAll(obj);
        }
        return ((List) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().replaceValues(obj, iterable);
        }
        return ((List) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    (ListMultimap listmultimap, Object obj)
    {
        super(listmultimap, obj);
    }
}
