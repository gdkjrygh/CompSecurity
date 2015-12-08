// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            Dependency

public class DependencyPriorityBlockingQueue extends PriorityBlockingQueue
{

    static final int PEEK = 1;
    static final int POLL = 2;
    static final int POLL_WITH_TIMEOUT = 3;
    static final int TAKE = 0;
    final Queue blockedQueue = new LinkedList();
    private final ReentrantLock lock = new ReentrantLock();

    public DependencyPriorityBlockingQueue()
    {
    }

    boolean canProcess(Dependency dependency)
    {
        return dependency.areDependenciesMet();
    }

    public void clear()
    {
        lock.lock();
        blockedQueue.clear();
        super.clear();
        lock.unlock();
        return;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    Object[] concatenate(Object aobj[], Object aobj1[])
    {
        int i = aobj.length;
        int j = aobj1.length;
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i + j);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 0, i);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), i, j);
        return aobj2;
    }

    public boolean contains(Object obj)
    {
        lock.lock();
        if (super.contains(obj)) goto _L2; else goto _L1
_L1:
        boolean flag = blockedQueue.contains(obj);
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        lock.unlock();
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        lock.unlock();
        throw obj;
    }

    public int drainTo(Collection collection)
    {
        int i;
        int j;
        lock.lock();
        i = super.drainTo(collection);
        j = blockedQueue.size();
        for (; !blockedQueue.isEmpty(); collection.add(blockedQueue.poll())) { }
        break MISSING_BLOCK_LABEL_64;
        collection;
        lock.unlock();
        throw collection;
        lock.unlock();
        return i + j;
    }

    public int drainTo(Collection collection, int i)
    {
        int j;
        lock.lock();
        j = super.drainTo(collection, i);
_L2:
        if (blockedQueue.isEmpty() || j > i)
        {
            break; /* Loop/switch isn't completed */
        }
        collection.add(blockedQueue.poll());
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        lock.unlock();
        return j;
        collection;
        lock.unlock();
        throw collection;
    }

    Dependency get(int i, Long long1, TimeUnit timeunit)
        throws InterruptedException
    {
        do
        {
            Dependency dependency = performOperation(i, long1, timeunit);
            if (dependency == null || canProcess(dependency))
            {
                return dependency;
            }
            offerBlockedResult(i, dependency);
        } while (true);
    }

    boolean offerBlockedResult(int i, Dependency dependency)
    {
        lock.lock();
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        super.remove(dependency);
        boolean flag = blockedQueue.offer(dependency);
        lock.unlock();
        return flag;
        dependency;
        lock.unlock();
        throw dependency;
    }

    public Dependency peek()
    {
        Dependency dependency;
        try
        {
            dependency = get(1, null, null);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return dependency;
    }

    public volatile Object peek()
    {
        return peek();
    }

    Dependency performOperation(int i, Long long1, TimeUnit timeunit)
        throws InterruptedException
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (Dependency)super.take();

        case 1: // '\001'
            return (Dependency)super.peek();

        case 2: // '\002'
            return (Dependency)super.poll();

        case 3: // '\003'
            return (Dependency)super.poll(long1.longValue(), timeunit);
        }
    }

    public Dependency poll()
    {
        Dependency dependency;
        try
        {
            dependency = get(2, null, null);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return dependency;
    }

    public Dependency poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return get(3, Long.valueOf(l), timeunit);
    }

    public volatile Object poll()
    {
        return poll();
    }

    public volatile Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return poll(l, timeunit);
    }

    public void recycleBlockedQueue()
    {
        lock.lock();
        Iterator iterator = blockedQueue.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Dependency dependency = (Dependency)iterator.next();
            if (canProcess(dependency))
            {
                super.offer(dependency);
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
        lock.unlock();
        return;
    }

    public boolean remove(Object obj)
    {
        lock.lock();
        if (super.remove(obj)) goto _L2; else goto _L1
_L1:
        boolean flag = blockedQueue.remove(obj);
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        lock.unlock();
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        lock.unlock();
        throw obj;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        boolean flag1;
        lock.lock();
        flag = super.removeAll(collection);
        flag1 = blockedQueue.removeAll(collection);
        lock.unlock();
        return flag | flag1;
        collection;
        lock.unlock();
        throw collection;
    }

    public int size()
    {
        int i;
        int j;
        lock.lock();
        i = blockedQueue.size();
        j = super.size();
        lock.unlock();
        return i + j;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Dependency take()
        throws InterruptedException
    {
        return get(0, null, null);
    }

    public volatile Object take()
        throws InterruptedException
    {
        return take();
    }

    public Object[] toArray()
    {
        Object aobj[];
        lock.lock();
        aobj = concatenate(super.toArray(), blockedQueue.toArray());
        lock.unlock();
        return aobj;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        lock.lock();
        aobj = concatenate(super.toArray(aobj), blockedQueue.toArray(aobj));
        lock.unlock();
        return aobj;
        aobj;
        lock.unlock();
        throw aobj;
    }
}
