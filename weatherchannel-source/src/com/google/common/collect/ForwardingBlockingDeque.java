// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            ForwardingDeque

public abstract class ForwardingBlockingDeque extends ForwardingDeque
    implements BlockingDeque
{

    protected ForwardingBlockingDeque()
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

    protected volatile Deque _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Queue _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract BlockingDeque _mthdelegate();

    public int drainTo(Collection collection)
    {
        return _mthdelegate().drainTo(collection);
    }

    public int drainTo(Collection collection, int i)
    {
        return _mthdelegate().drainTo(collection, i);
    }

    public boolean offer(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().offer(obj, l, timeunit);
    }

    public boolean offerFirst(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().offerFirst(obj, l, timeunit);
    }

    public boolean offerLast(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().offerLast(obj, l, timeunit);
    }

    public Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().poll(l, timeunit);
    }

    public Object pollFirst(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().pollFirst(l, timeunit);
    }

    public Object pollLast(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().pollLast(l, timeunit);
    }

    public void put(Object obj)
        throws InterruptedException
    {
        _mthdelegate().put(obj);
    }

    public void putFirst(Object obj)
        throws InterruptedException
    {
        _mthdelegate().putFirst(obj);
    }

    public void putLast(Object obj)
        throws InterruptedException
    {
        _mthdelegate().putLast(obj);
    }

    public int remainingCapacity()
    {
        return _mthdelegate().remainingCapacity();
    }

    public Object take()
        throws InterruptedException
    {
        return _mthdelegate().take();
    }

    public Object takeFirst()
        throws InterruptedException
    {
        return _mthdelegate().takeFirst();
    }

    public Object takeLast()
        throws InterruptedException
    {
        return _mthdelegate().takeLast();
    }
}
