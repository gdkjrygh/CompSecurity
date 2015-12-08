// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Synchronized

static class  extends 
    implements SortedSet
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

    volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Set _mthdelegate()
    {
        return _mthdelegate();
    }

    SortedSet _mthdelegate()
    {
        return (SortedSet)super.te();
    }

    public Object first()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().first();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public SortedSet headSet(Object obj)
    {
        synchronized (mutex)
        {
            obj = Synchronized.access$100(_mthdelegate().headSet(obj), mutex);
        }
        return ((SortedSet) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object last()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().last();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        synchronized (mutex)
        {
            obj = Synchronized.access$100(_mthdelegate().subSet(obj, obj1), mutex);
        }
        return ((SortedSet) (obj));
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public SortedSet tailSet(Object obj)
    {
        synchronized (mutex)
        {
            obj = Synchronized.access$100(_mthdelegate().tailSet(obj), mutex);
        }
        return ((SortedSet) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    (SortedSet sortedset, Object obj)
    {
        super(sortedset, obj);
    }
}
