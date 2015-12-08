// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Uninterruptibles
{

    private Uninterruptibles()
    {
    }

    public static void awaitUninterruptibly(CountDownLatch countdownlatch)
    {
        boolean flag = false;
_L2:
        countdownlatch.await();
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        countdownlatch;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw countdownlatch;
    }

    public static boolean awaitUninterruptibly(CountDownLatch countdownlatch, long l, TimeUnit timeunit)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        long l1 = timeunit.toNanos(l);
        flag = flag2;
        long l2 = System.nanoTime();
        l = l1;
_L2:
        flag = flag1;
        boolean flag3 = countdownlatch.await(l, TimeUnit.NANOSECONDS);
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        return flag3;
        timeunit;
        flag = true;
        flag1 = true;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L2; else goto _L1
_L1:
        countdownlatch;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw countdownlatch;
    }

    public static Object getUninterruptibly(Future future)
        throws ExecutionException
    {
        boolean flag = false;
_L2:
        Object obj = future.get();
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return obj;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        future;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw future;
    }

    public static Object getUninterruptibly(Future future, long l, TimeUnit timeunit)
        throws ExecutionException, TimeoutException
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        long l1 = timeunit.toNanos(l);
        flag = flag2;
        long l2 = System.nanoTime();
        l = l1;
_L2:
        flag = flag1;
        timeunit = ((TimeUnit) (future.get(l, TimeUnit.NANOSECONDS)));
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        return timeunit;
        timeunit;
        flag = true;
        flag1 = true;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L2; else goto _L1
_L1:
        future;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw future;
    }

    public static void joinUninterruptibly(Thread thread)
    {
        boolean flag = false;
_L2:
        thread.join();
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw thread;
    }

    public static void joinUninterruptibly(Thread thread, long l, TimeUnit timeunit)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        Preconditions.checkNotNull(thread);
        flag2 = false;
        flag1 = false;
        flag = flag2;
        long l1 = timeunit.toNanos(l);
        flag = flag2;
        long l2 = System.nanoTime();
        l = l1;
_L2:
        flag = flag1;
        TimeUnit.NANOSECONDS.timedJoin(thread, l);
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        return;
        timeunit;
        flag = true;
        flag1 = true;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw thread;
    }

    public static void putUninterruptibly(BlockingQueue blockingqueue, Object obj)
    {
        boolean flag = false;
_L2:
        blockingqueue.put(obj);
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        blockingqueue;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw blockingqueue;
    }

    public static void sleepUninterruptibly(long l, TimeUnit timeunit)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        long l1 = timeunit.toNanos(l);
        flag = flag2;
        long l2 = System.nanoTime();
        l = l1;
_L2:
        flag = flag1;
        TimeUnit.NANOSECONDS.sleep(l);
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        return;
        timeunit;
        flag = true;
        flag1 = true;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L2; else goto _L1
_L1:
        timeunit;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw timeunit;
    }

    public static Object takeUninterruptibly(BlockingQueue blockingqueue)
    {
        boolean flag = false;
_L2:
        Object obj = blockingqueue.take();
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return obj;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        blockingqueue;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw blockingqueue;
    }

    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, int i, long l, TimeUnit timeunit)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        long l1 = timeunit.toNanos(l);
        flag = flag2;
        long l2 = System.nanoTime();
        l = l1;
_L2:
        flag = flag1;
        boolean flag3 = semaphore.tryAcquire(i, l, TimeUnit.NANOSECONDS);
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        return flag3;
        timeunit;
        flag = true;
        flag1 = true;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L2; else goto _L1
_L1:
        semaphore;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw semaphore;
    }

    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, long l, TimeUnit timeunit)
    {
        return tryAcquireUninterruptibly(semaphore, 1, l, timeunit);
    }
}
