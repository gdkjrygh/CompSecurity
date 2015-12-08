// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Synchronized

static class <init> extends <init>
    implements Collection
{

    private static final long serialVersionUID = 0L;

    public boolean add(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().add(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().addAll(collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    public void clear()
    {
        synchronized (mutex)
        {
            _mthdelegate().clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean contains(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().contains(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean containsAll(Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().containsAll(collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    Collection _mthdelegate()
    {
        return (Collection)super.gate();
    }

    public boolean isEmpty()
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().isEmpty();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Iterator iterator()
    {
        return _mthdelegate().iterator();
    }

    public boolean remove(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().remove(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().removeAll(collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().retainAll(collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    public int size()
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object[] toArray()
    {
        Object aobj[];
        synchronized (mutex)
        {
            aobj = _mthdelegate().toArray();
        }
        return aobj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        synchronized (mutex)
        {
            aobj = _mthdelegate().toArray(aobj);
        }
        return aobj;
        aobj;
        obj;
        JVM INSTR monitorexit ;
        throw aobj;
    }

    private (Collection collection, Object obj)
    {
        super(collection, obj);
    }

    t>(Collection collection, Object obj, t> t>)
    {
        this(collection, obj);
    }
}
