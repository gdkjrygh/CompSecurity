// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection

public abstract class ForwardingQueue extends ForwardingCollection
    implements Queue
{

    protected ForwardingQueue()
    {
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract Queue _mthdelegate();

    public Object element()
    {
        return _mthdelegate().element();
    }

    public boolean offer(Object obj)
    {
        return _mthdelegate().offer(obj);
    }

    public Object peek()
    {
        return _mthdelegate().peek();
    }

    public Object poll()
    {
        return _mthdelegate().poll();
    }

    public Object remove()
    {
        return _mthdelegate().remove();
    }

    protected boolean standardOffer(Object obj)
    {
        boolean flag;
        try
        {
            flag = add(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    protected Object standardPeek()
    {
        Object obj;
        try
        {
            obj = element();
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            return null;
        }
        return obj;
    }

    protected Object standardPoll()
    {
        Object obj;
        try
        {
            obj = remove();
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            return null;
        }
        return obj;
    }
}
