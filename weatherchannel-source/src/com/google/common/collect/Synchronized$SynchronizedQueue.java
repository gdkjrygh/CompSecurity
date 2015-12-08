// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            Synchronized

private static class tion extends tion
    implements Queue
{

    private static final long serialVersionUID = 0L;

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    Queue _mthdelegate()
    {
        return (Queue)super._mthdelegate();
    }

    public Object element()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().element();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean offer(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().offer(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object peek()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().peek();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object poll()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().poll();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object remove()
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().remove();
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    tion(Queue queue, Object obj)
    {
        super(queue, obj, null);
    }
}
