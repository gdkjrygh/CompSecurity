// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            Synchronized

private static final class <init> extends <init>
    implements Deque
{

    private static final long serialVersionUID = 0L;

    public void addFirst(Object obj)
    {
        synchronized (mutex)
        {
            _mthdelegate().addFirst(obj);
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void addLast(Object obj)
    {
        synchronized (mutex)
        {
            _mthdelegate().addLast(obj);
        }
        return;
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

    Deque _mthdelegate()
    {
        return (Deque)super._mthdelegate();
    }

    volatile Queue _mthdelegate()
    {
        return _mthdelegate();
    }

    public Iterator descendingIterator()
    {
        Iterator iterator;
        synchronized (mutex)
        {
            iterator = _mthdelegate().descendingIterator();
        }
        return iterator;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object getFirst()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().getFirst();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object getLast()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().getLast();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean offerFirst(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().offerFirst(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean offerLast(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().offerLast(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object peekFirst()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().peekFirst();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object peekLast()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().peekLast();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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

    public Object pop()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().pop();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void push(Object obj)
    {
        synchronized (mutex)
        {
            _mthdelegate().push(obj);
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object removeFirst()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().removeFirst();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean removeFirstOccurrence(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().removeFirstOccurrence(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object removeLast()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().removeLast();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean removeLastOccurrence(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().removeLastOccurrence(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    (Deque deque, Object obj)
    {
        super(deque, obj);
    }
}
