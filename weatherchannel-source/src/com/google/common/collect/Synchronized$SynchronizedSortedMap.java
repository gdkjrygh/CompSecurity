// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            Synchronized

static class  extends 
    implements SortedMap
{

    private static final long serialVersionUID = 0L;

    public Comparator comparator()
    {
        Comparator comparator1;
        synchronized (mutex)
        {
            comparator1 = _mthdelegate().comparator();
        }
        return comparator1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Map _mthdelegate()
    {
        return _mthdelegate();
    }

    SortedMap _mthdelegate()
    {
        return (SortedMap)super.te();
    }

    public Object firstKey()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().firstKey();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public SortedMap headMap(Object obj)
    {
        synchronized (mutex)
        {
            obj = Synchronized.sortedMap(_mthdelegate().headMap(obj), mutex);
        }
        return ((SortedMap) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object lastKey()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().lastKey();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        synchronized (mutex)
        {
            obj = Synchronized.sortedMap(_mthdelegate().subMap(obj, obj1), mutex);
        }
        return ((SortedMap) (obj));
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public SortedMap tailMap(Object obj)
    {
        synchronized (mutex)
        {
            obj = Synchronized.sortedMap(_mthdelegate().tailMap(obj), mutex);
        }
        return ((SortedMap) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    (SortedMap sortedmap, Object obj)
    {
        super(sortedmap, obj);
    }
}
