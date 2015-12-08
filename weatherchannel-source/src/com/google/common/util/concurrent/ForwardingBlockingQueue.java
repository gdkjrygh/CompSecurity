// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingQueue;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class ForwardingBlockingQueue extends ForwardingQueue
    implements BlockingQueue
{

    protected ForwardingBlockingQueue()
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

    protected volatile Queue _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract BlockingQueue _mthdelegate();

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

    public Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return _mthdelegate().poll(l, timeunit);
    }

    public void put(Object obj)
        throws InterruptedException
    {
        _mthdelegate().put(obj);
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
}
