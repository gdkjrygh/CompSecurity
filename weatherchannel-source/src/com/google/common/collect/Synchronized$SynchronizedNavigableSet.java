// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Synchronized

static class it> extends it>
    implements NavigableSet
{

    private static final long serialVersionUID = 0L;
    transient NavigableSet descendingSet;

    public Object ceiling(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().ceiling(obj);
        }
        return obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    NavigableSet _mthdelegate()
    {
        return (NavigableSet)super.egate();
    }

    volatile Set _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile SortedSet _mthdelegate()
    {
        return _mthdelegate();
    }

    public Iterator descendingIterator()
    {
        return _mthdelegate().descendingIterator();
    }

    public NavigableSet descendingSet()
    {
label0:
        {
            NavigableSet navigableset;
            synchronized (mutex)
            {
                if (descendingSet != null)
                {
                    break label0;
                }
                navigableset = Synchronized.navigableSet(_mthdelegate().descendingSet(), mutex);
                descendingSet = navigableset;
            }
            return navigableset;
        }
        NavigableSet navigableset1 = descendingSet;
        obj;
        JVM INSTR monitorexit ;
        return navigableset1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object floor(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().floor(obj);
        }
        return obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        synchronized (mutex)
        {
            obj = Synchronized.navigableSet(_mthdelegate().headSet(obj, flag), mutex);
        }
        return ((NavigableSet) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public SortedSet headSet(Object obj)
    {
        return headSet(obj, false);
    }

    public Object higher(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().higher(obj);
        }
        return obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object lower(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().lower(obj);
        }
        return obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object pollFirst()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().pollFirst();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object pollLast()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().pollLast();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        synchronized (mutex)
        {
            obj = Synchronized.navigableSet(_mthdelegate().subSet(obj, flag, obj1, flag1), mutex);
        }
        return ((NavigableSet) (obj));
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return subSet(obj, true, obj1, false);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        synchronized (mutex)
        {
            obj = Synchronized.navigableSet(_mthdelegate().tailSet(obj, flag), mutex);
        }
        return ((NavigableSet) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public SortedSet tailSet(Object obj)
    {
        return tailSet(obj, true);
    }

    (NavigableSet navigableset, Object obj)
    {
        super(navigableset, obj);
    }
}
