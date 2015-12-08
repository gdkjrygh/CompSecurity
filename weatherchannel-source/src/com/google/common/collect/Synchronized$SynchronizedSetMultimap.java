// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            SetMultimap, Synchronized, Multimap

private static class it> extends it>
    implements SetMultimap
{

    private static final long serialVersionUID = 0L;
    transient Set entrySet;

    volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    SetMultimap _mthdelegate()
    {
        return (SetMultimap)super.egate();
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        Set set;
        synchronized (mutex)
        {
            if (entrySet == null)
            {
                entrySet = Synchronized.set(_mthdelegate().entries(), mutex);
            }
            set = entrySet;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(Object obj)
    {
        synchronized (mutex)
        {
            obj = Synchronized.set(_mthdelegate().get(obj), mutex);
        }
        return ((Set) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public Set removeAll(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().removeAll(obj);
        }
        return ((Set) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().replaceValues(obj, iterable);
        }
        return ((Set) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    (SetMultimap setmultimap, Object obj)
    {
        super(setmultimap, obj);
    }
}
