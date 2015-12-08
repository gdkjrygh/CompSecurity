// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            ForwardingQueue

public abstract class ForwardingDeque extends ForwardingQueue
    implements Deque
{

    protected ForwardingDeque()
    {
    }

    public void addFirst(Object obj)
    {
        _mthdelegate().addFirst(obj);
    }

    public void addLast(Object obj)
    {
        _mthdelegate().addLast(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract Deque _mthdelegate();

    protected volatile Queue _mthdelegate()
    {
        return _mthdelegate();
    }

    public Iterator descendingIterator()
    {
        return _mthdelegate().descendingIterator();
    }

    public Object getFirst()
    {
        return _mthdelegate().getFirst();
    }

    public Object getLast()
    {
        return _mthdelegate().getLast();
    }

    public boolean offerFirst(Object obj)
    {
        return _mthdelegate().offerFirst(obj);
    }

    public boolean offerLast(Object obj)
    {
        return _mthdelegate().offerLast(obj);
    }

    public Object peekFirst()
    {
        return _mthdelegate().peekFirst();
    }

    public Object peekLast()
    {
        return _mthdelegate().peekLast();
    }

    public Object pollFirst()
    {
        return _mthdelegate().pollFirst();
    }

    public Object pollLast()
    {
        return _mthdelegate().pollLast();
    }

    public Object pop()
    {
        return _mthdelegate().pop();
    }

    public void push(Object obj)
    {
        _mthdelegate().push(obj);
    }

    public Object removeFirst()
    {
        return _mthdelegate().removeFirst();
    }

    public boolean removeFirstOccurrence(Object obj)
    {
        return _mthdelegate().removeFirstOccurrence(obj);
    }

    public Object removeLast()
    {
        return _mthdelegate().removeLast();
    }

    public boolean removeLastOccurrence(Object obj)
    {
        return _mthdelegate().removeLastOccurrence(obj);
    }
}
