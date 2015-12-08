// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            SortedSetMultimap, Synchronized, Multimap, SetMultimap

private static class  extends 
    implements SortedSetMultimap
{

    private static final long serialVersionUID = 0L;

    volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile SetMultimap _mthdelegate()
    {
        return _mthdelegate();
    }

    SortedSetMultimap _mthdelegate()
    {
        return (SortedSetMultimap)super.te();
    }

    volatile Object _mthdelegate()
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
        synchronized (mutex)
        {
            obj = Synchronized.access$100(_mthdelegate().get(obj), mutex);
        }
        return ((SortedSet) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
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
        synchronized (mutex)
        {
            obj = _mthdelegate().removeAll(obj);
        }
        return ((SortedSet) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
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
        synchronized (mutex)
        {
            obj = _mthdelegate().replaceValues(obj, iterable);
        }
        return ((SortedSet) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Comparator valueComparator()
    {
        Comparator comparator;
        synchronized (mutex)
        {
            comparator = _mthdelegate().valueComparator();
        }
        return comparator;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (SortedSetMultimap sortedsetmultimap, Object obj)
    {
        super(sortedsetmultimap, obj);
    }
}
