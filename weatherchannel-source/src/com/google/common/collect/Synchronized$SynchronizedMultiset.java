// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, Synchronized

private static class n extends n
    implements Multiset
{

    private static final long serialVersionUID = 0L;
    transient Set elementSet;
    transient Set entrySet;

    public int add(Object obj, int i)
    {
        synchronized (mutex)
        {
            i = _mthdelegate().add(obj, i);
        }
        return i;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int count(Object obj)
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().count(obj);
        }
        return i;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    Multiset _mthdelegate()
    {
        return (Multiset)super._mthdelegate();
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    public Set elementSet()
    {
        Set set;
        synchronized (mutex)
        {
            if (elementSet == null)
            {
                elementSet = Synchronized.access$300(_mthdelegate().elementSet(), mutex);
            }
            set = elementSet;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Set entrySet()
    {
        Set set;
        synchronized (mutex)
        {
            if (entrySet == null)
            {
                entrySet = Synchronized.access$300(_mthdelegate().entrySet(), mutex);
            }
            set = entrySet;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().equals(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int hashCode()
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().hashCode();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int remove(Object obj, int i)
    {
        synchronized (mutex)
        {
            i = _mthdelegate().remove(obj, i);
        }
        return i;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int setCount(Object obj, int i)
    {
        synchronized (mutex)
        {
            i = _mthdelegate().setCount(obj, i);
        }
        return i;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean setCount(Object obj, int i, int j)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().setCount(obj, i, j);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    n(Multiset multiset, Object obj)
    {
        super(multiset, obj, null);
    }
}
