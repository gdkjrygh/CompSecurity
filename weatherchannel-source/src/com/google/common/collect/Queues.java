// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            Collections2, Iterables, Synchronized

public final class Queues
{

    private Queues()
    {
    }

    public static int drain(BlockingQueue blockingqueue, Collection collection, int i, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        Preconditions.checkNotNull(collection);
        long l1 = System.nanoTime();
        l = timeunit.toNanos(l);
        int j = 0;
        do
        {
            int k;
label0:
            {
                k = j;
                if (j < i)
                {
                    k = j + blockingqueue.drainTo(collection, i - j);
                    j = k;
                    if (k >= i)
                    {
                        continue;
                    }
                    timeunit = ((TimeUnit) (blockingqueue.poll((l1 + l) - System.nanoTime(), TimeUnit.NANOSECONDS)));
                    if (timeunit != null)
                    {
                        break label0;
                    }
                }
                return k;
            }
            collection.add(timeunit);
            j = k + 1;
        } while (true);
    }

    public static int drainUninterruptibly(BlockingQueue blockingqueue, Collection collection, int i, long l, TimeUnit timeunit)
    {
        int j;
        boolean flag;
        long l1;
        Preconditions.checkNotNull(collection);
        l1 = System.nanoTime();
        l = timeunit.toNanos(l);
        j = 0;
        flag = false;
_L4:
        int k;
        boolean flag1;
        k = j;
        flag1 = flag;
        if (j >= i) goto _L2; else goto _L1
_L1:
        flag1 = flag;
        k = blockingqueue.drainTo(collection, i - j);
        k = j + k;
        j = k;
        if (k >= i) goto _L4; else goto _L3
_L3:
        flag1 = flag;
        timeunit = ((TimeUnit) (blockingqueue.poll((l1 + l) - System.nanoTime(), TimeUnit.NANOSECONDS)));
        if (timeunit != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
_L2:
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        return k;
        timeunit;
        flag = true;
        if (true) goto _L3; else goto _L5
_L5:
        flag1 = flag;
        collection.add(timeunit);
        j = k + 1;
          goto _L4
        blockingqueue;
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        throw blockingqueue;
    }

    public static ArrayBlockingQueue newArrayBlockingQueue(int i)
    {
        return new ArrayBlockingQueue(i);
    }

    public static ArrayDeque newArrayDeque()
    {
        return new ArrayDeque();
    }

    public static ArrayDeque newArrayDeque(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new ArrayDeque(Collections2.cast(iterable));
        } else
        {
            ArrayDeque arraydeque = new ArrayDeque();
            Iterables.addAll(arraydeque, iterable);
            return arraydeque;
        }
    }

    public static ConcurrentLinkedQueue newConcurrentLinkedQueue()
    {
        return new ConcurrentLinkedQueue();
    }

    public static ConcurrentLinkedQueue newConcurrentLinkedQueue(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new ConcurrentLinkedQueue(Collections2.cast(iterable));
        } else
        {
            ConcurrentLinkedQueue concurrentlinkedqueue = new ConcurrentLinkedQueue();
            Iterables.addAll(concurrentlinkedqueue, iterable);
            return concurrentlinkedqueue;
        }
    }

    public static LinkedBlockingDeque newLinkedBlockingDeque()
    {
        return new LinkedBlockingDeque();
    }

    public static LinkedBlockingDeque newLinkedBlockingDeque(int i)
    {
        return new LinkedBlockingDeque(i);
    }

    public static LinkedBlockingDeque newLinkedBlockingDeque(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new LinkedBlockingDeque(Collections2.cast(iterable));
        } else
        {
            LinkedBlockingDeque linkedblockingdeque = new LinkedBlockingDeque();
            Iterables.addAll(linkedblockingdeque, iterable);
            return linkedblockingdeque;
        }
    }

    public static LinkedBlockingQueue newLinkedBlockingQueue()
    {
        return new LinkedBlockingQueue();
    }

    public static LinkedBlockingQueue newLinkedBlockingQueue(int i)
    {
        return new LinkedBlockingQueue(i);
    }

    public static LinkedBlockingQueue newLinkedBlockingQueue(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new LinkedBlockingQueue(Collections2.cast(iterable));
        } else
        {
            LinkedBlockingQueue linkedblockingqueue = new LinkedBlockingQueue();
            Iterables.addAll(linkedblockingqueue, iterable);
            return linkedblockingqueue;
        }
    }

    public static PriorityBlockingQueue newPriorityBlockingQueue()
    {
        return new PriorityBlockingQueue();
    }

    public static PriorityBlockingQueue newPriorityBlockingQueue(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new PriorityBlockingQueue(Collections2.cast(iterable));
        } else
        {
            PriorityBlockingQueue priorityblockingqueue = new PriorityBlockingQueue();
            Iterables.addAll(priorityblockingqueue, iterable);
            return priorityblockingqueue;
        }
    }

    public static PriorityQueue newPriorityQueue()
    {
        return new PriorityQueue();
    }

    public static PriorityQueue newPriorityQueue(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new PriorityQueue(Collections2.cast(iterable));
        } else
        {
            PriorityQueue priorityqueue = new PriorityQueue();
            Iterables.addAll(priorityqueue, iterable);
            return priorityqueue;
        }
    }

    public static SynchronousQueue newSynchronousQueue()
    {
        return new SynchronousQueue();
    }

    public static Deque synchronizedDeque(Deque deque)
    {
        return Synchronized.deque(deque, null);
    }

    public static Queue synchronizedQueue(Queue queue)
    {
        return Synchronized.queue(queue, null);
    }
}
