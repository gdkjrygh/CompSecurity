// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class Monitor
{
    public static abstract class Guard
    {

        final Condition condition;
        final Monitor monitor;
        Guard next;
        int waiterCount;

        public abstract boolean isSatisfied();

        protected Guard(Monitor monitor1)
        {
            waiterCount = 0;
            monitor = (Monitor)Preconditions.checkNotNull(monitor1, "monitor");
            condition = monitor1.lock.newCondition();
        }
    }


    private Guard activeGuards;
    private final boolean fair;
    private final ReentrantLock lock;

    public Monitor()
    {
        this(false);
    }

    public Monitor(boolean flag)
    {
        activeGuards = null;
        fair = flag;
        lock = new ReentrantLock(flag);
    }

    private void await(Guard guard, boolean flag)
        throws InterruptedException
    {
        if (flag)
        {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do
        {
            guard.condition.await();
            flag = guard.isSatisfied();
        } while (!flag);
        endWaitingFor(guard);
        return;
        Exception exception;
        exception;
        endWaitingFor(guard);
        throw exception;
    }

    private boolean awaitNanos(Guard guard, long l, boolean flag)
        throws InterruptedException
    {
        if (flag)
        {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
_L2:
        if (l < 0L)
        {
            endWaitingFor(guard);
            return false;
        }
        l = guard.condition.awaitNanos(l);
        flag = guard.isSatisfied();
        if (!flag) goto _L2; else goto _L1
_L1:
        endWaitingFor(guard);
        return true;
        Exception exception;
        exception;
        endWaitingFor(guard);
        throw exception;
    }

    private void awaitUninterruptibly(Guard guard, boolean flag)
    {
        if (flag)
        {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do
        {
            guard.condition.awaitUninterruptibly();
            flag = guard.isSatisfied();
        } while (!flag);
        endWaitingFor(guard);
        return;
        Exception exception;
        exception;
        endWaitingFor(guard);
        throw exception;
    }

    private void beginWaitingFor(Guard guard)
    {
        int i = guard.waiterCount;
        guard.waiterCount = i + 1;
        if (i == 0)
        {
            guard.next = activeGuards;
            activeGuards = guard;
        }
    }

    private void endWaitingFor(Guard guard)
    {
        int i;
        i = guard.waiterCount - 1;
        guard.waiterCount = i;
        if (i != 0) goto _L2; else goto _L1
_L1:
        Guard guard1;
        Guard guard2;
        guard1 = activeGuards;
        guard2 = null;
_L6:
        if (guard1 != guard) goto _L4; else goto _L3
_L3:
        if (guard2 == null)
        {
            activeGuards = guard1.next;
        } else
        {
            guard2.next = guard1.next;
        }
        guard1.next = null;
_L2:
        return;
_L4:
        guard2 = guard1;
        guard1 = guard1.next;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean isSatisfied(Guard guard)
    {
        boolean flag;
        try
        {
            flag = guard.isSatisfied();
        }
        // Misplaced declaration of an exception variable
        catch (Guard guard)
        {
            signalAllWaiters();
            throw Throwables.propagate(guard);
        }
        return flag;
    }

    private void signalAllWaiters()
    {
        for (Guard guard = activeGuards; guard != null; guard = guard.next)
        {
            guard.condition.signalAll();
        }

    }

    private void signalNextWaiter()
    {
        Guard guard = activeGuards;
        do
        {
label0:
            {
                if (guard != null)
                {
                    if (!isSatisfied(guard))
                    {
                        break label0;
                    }
                    guard.condition.signal();
                }
                return;
            }
            guard = guard.next;
        } while (true);
    }

    public void enter()
    {
        lock.lock();
    }

    public boolean enter(long l, TimeUnit timeunit)
    {
        long l1;
        l1 = timeunit.toNanos(l);
        timeunit = lock;
        if (fair || !timeunit.tryLock()) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L6:
        return flag1;
_L2:
        long l2;
        boolean flag;
        l2 = System.nanoTime();
        flag = Thread.interrupted();
        l = l1;
_L4:
        flag1 = flag;
        boolean flag2 = timeunit.tryLock(l, TimeUnit.NANOSECONDS);
        flag1 = flag2;
        if (flag)
        {
            Thread.currentThread().interrupt();
            return flag2;
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        flag1 = true;
        flag = true;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L4; else goto _L3
_L3:
        timeunit;
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        throw timeunit;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean enterIf(Guard guard)
    {
        ReentrantLock reentrantlock;
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        reentrantlock = lock;
        reentrantlock.lock();
        boolean flag = guard.isSatisfied();
        if (!flag)
        {
            reentrantlock.unlock();
        }
        return flag;
        guard;
        if (true)
        {
            reentrantlock.unlock();
        }
        throw guard;
    }

    public boolean enterIf(Guard guard, long l, TimeUnit timeunit)
    {
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        if (enter(l, timeunit)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        boolean flag1 = guard.isSatisfied();
        flag = flag1;
        if (flag1) goto _L4; else goto _L3
_L3:
        lock.unlock();
        return flag1;
        guard;
        if (true)
        {
            lock.unlock();
        }
        throw guard;
    }

    public boolean enterIfInterruptibly(Guard guard)
        throws InterruptedException
    {
        ReentrantLock reentrantlock;
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        reentrantlock = lock;
        reentrantlock.lockInterruptibly();
        boolean flag = guard.isSatisfied();
        if (!flag)
        {
            reentrantlock.unlock();
        }
        return flag;
        guard;
        if (true)
        {
            reentrantlock.unlock();
        }
        throw guard;
    }

    public boolean enterIfInterruptibly(Guard guard, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        ReentrantLock reentrantlock;
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        reentrantlock = lock;
        if (reentrantlock.tryLock(l, timeunit)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        boolean flag1 = guard.isSatisfied();
        flag = flag1;
        if (flag1) goto _L4; else goto _L3
_L3:
        reentrantlock.unlock();
        return flag1;
        guard;
        if (true)
        {
            reentrantlock.unlock();
        }
        throw guard;
    }

    public void enterInterruptibly()
        throws InterruptedException
    {
        lock.lockInterruptibly();
    }

    public boolean enterInterruptibly(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return lock.tryLock(l, timeunit);
    }

    public void enterWhen(Guard guard)
        throws InterruptedException
    {
        boolean flag;
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantlock = lock;
        flag = reentrantlock.isHeldByCurrentThread();
        reentrantlock.lockInterruptibly();
        if (!guard.isSatisfied())
        {
            await(guard, flag);
        }
        if (false)
        {
            leave();
        }
        return;
        guard;
        if (true)
        {
            leave();
        }
        throw guard;
    }

    public boolean enterWhen(Guard guard, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        ReentrantLock reentrantlock;
        long l2;
        boolean flag2;
        l2 = timeunit.toNanos(l);
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        reentrantlock = lock;
        flag2 = reentrantlock.isHeldByCurrentThread();
        if (fair) goto _L2; else goto _L1
_L1:
        long l1 = l2;
        if (reentrantlock.tryLock()) goto _L3; else goto _L2
_L2:
        l1 = System.nanoTime();
        if (reentrantlock.tryLock(l, timeunit)) goto _L5; else goto _L4
_L4:
        boolean flag1 = false;
_L7:
        return flag1;
_L5:
        l1 = (l1 + l2) - System.nanoTime();
_L3:
        boolean flag;
        if (guard.isSatisfied())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        flag = awaitNanos(guard, l1, flag2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        flag = true;
_L8:
        flag1 = flag;
        if (flag) goto _L7; else goto _L6
_L6:
        if (true || flag2)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        signalNextWaiter();
        reentrantlock.unlock();
        return flag;
        flag = false;
          goto _L8
        guard;
        reentrantlock.unlock();
        throw guard;
        guard;
        if (false)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        if (false || flag2)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        signalNextWaiter();
        reentrantlock.unlock();
        throw guard;
        guard;
        reentrantlock.unlock();
        throw guard;
    }

    public void enterWhenUninterruptibly(Guard guard)
    {
        boolean flag;
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantlock = lock;
        flag = reentrantlock.isHeldByCurrentThread();
        reentrantlock.lock();
        if (!guard.isSatisfied())
        {
            awaitUninterruptibly(guard, flag);
        }
        if (false)
        {
            leave();
        }
        return;
        guard;
        if (true)
        {
            leave();
        }
        throw guard;
    }

    public boolean enterWhenUninterruptibly(Guard guard, long l, TimeUnit timeunit)
    {
        long l1;
        long l2;
        boolean flag;
        boolean flag2;
        boolean flag5;
        l1 = timeunit.toNanos(l);
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        timeunit = lock;
        l2 = System.nanoTime() + l1;
        flag5 = timeunit.isHeldByCurrentThread();
        flag2 = Thread.interrupted();
        flag = flag2;
        if (fair) goto _L2; else goto _L1
_L1:
        flag = flag2;
        boolean flag3 = timeunit.tryLock();
        boolean flag1;
        flag1 = flag2;
        l = l1;
        if (flag3) goto _L3; else goto _L2
_L2:
        flag3 = false;
_L6:
        flag = flag2;
        flag1 = timeunit.tryLock(l1, TimeUnit.NANOSECONDS);
        boolean flag4;
        flag = flag1;
        flag1 = flag2;
        flag4 = flag;
        if (flag) goto _L5; else goto _L4
_L4:
        flag1 = false;
        flag = flag1;
        if (flag2)
        {
            Thread.currentThread().interrupt();
            flag = flag1;
        }
_L7:
        return flag;
        InterruptedException interruptedexception;
        interruptedexception;
        flag1 = true;
        flag4 = flag3;
_L5:
        flag = flag1;
        l = System.nanoTime();
        l = l2 - l;
        flag2 = flag1;
        flag3 = flag4;
        l1 = l;
        if (!flag4) goto _L6; else goto _L3
_L3:
        flag = flag5;
_L8:
        flag2 = flag1;
        if (guard.isSatisfied())
        {
            break MISSING_BLOCK_LABEL_217;
        }
        flag2 = flag1;
        flag = awaitNanos(guard, l, flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        for (flag2 = true; flag2; flag2 = false)
        {
            break MISSING_BLOCK_LABEL_234;
        }

        flag = flag1;
        timeunit.unlock();
        flag = flag2;
        if (flag1)
        {
            Thread.currentThread().interrupt();
            return flag2;
        }
          goto _L7
        interruptedexception;
        flag2 = true;
        flag1 = true;
        flag = false;
        l = System.nanoTime();
        l = l2 - l;
          goto _L8
        guard;
        if (false)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        flag = flag2;
        timeunit.unlock();
        flag = flag2;
        throw guard;
        guard;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw guard;
          goto _L7
    }

    public int getOccupiedDepth()
    {
        return lock.getHoldCount();
    }

    public int getQueueLength()
    {
        return lock.getQueueLength();
    }

    public int getWaitQueueLength(Guard guard)
    {
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        lock.lock();
        int i = guard.waiterCount;
        lock.unlock();
        return i;
        guard;
        lock.unlock();
        throw guard;
    }

    public boolean hasQueuedThread(Thread thread)
    {
        return lock.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads()
    {
        return lock.hasQueuedThreads();
    }

    public boolean hasWaiters(Guard guard)
    {
        return getWaitQueueLength(guard) > 0;
    }

    public boolean isFair()
    {
        return fair;
    }

    public boolean isOccupied()
    {
        return lock.isLocked();
    }

    public boolean isOccupiedByCurrentThread()
    {
        return lock.isHeldByCurrentThread();
    }

    public void leave()
    {
        ReentrantLock reentrantlock = lock;
        if (reentrantlock.getHoldCount() == 1)
        {
            signalNextWaiter();
        }
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public boolean tryEnter()
    {
        return lock.tryLock();
    }

    public boolean tryEnterIf(Guard guard)
    {
        ReentrantLock reentrantlock;
        if (guard.monitor != this)
        {
            throw new IllegalMonitorStateException();
        }
        reentrantlock = lock;
        if (reentrantlock.tryLock()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        boolean flag1 = guard.isSatisfied();
        flag = flag1;
        if (flag1) goto _L4; else goto _L3
_L3:
        reentrantlock.unlock();
        return flag1;
        guard;
        if (true)
        {
            reentrantlock.unlock();
        }
        throw guard;
    }

    public void waitFor(Guard guard)
        throws InterruptedException
    {
        boolean flag;
        if (guard.monitor == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(flag & lock.isHeldByCurrentThread()))
        {
            throw new IllegalMonitorStateException();
        }
        if (!guard.isSatisfied())
        {
            await(guard, true);
        }
    }

    public boolean waitFor(Guard guard, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        boolean flag1 = false;
        l = timeunit.toNanos(l);
        boolean flag;
        if (guard.monitor == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(flag & lock.isHeldByCurrentThread()))
        {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied() || awaitNanos(guard, l, true))
        {
            flag1 = true;
        }
        return flag1;
    }

    public void waitForUninterruptibly(Guard guard)
    {
        boolean flag;
        if (guard.monitor == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(flag & lock.isHeldByCurrentThread()))
        {
            throw new IllegalMonitorStateException();
        }
        if (!guard.isSatisfied())
        {
            awaitUninterruptibly(guard, true);
        }
    }

    public boolean waitForUninterruptibly(Guard guard, long l, TimeUnit timeunit)
    {
        long l1;
        l1 = timeunit.toNanos(l);
        boolean flag;
        if (guard.monitor == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(flag & lock.isHeldByCurrentThread()))
        {
            throw new IllegalMonitorStateException();
        }
        if (!guard.isSatisfied()) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L6:
        return flag2;
_L2:
        long l2;
        boolean flag1;
        boolean flag3;
        flag3 = true;
        l2 = System.nanoTime();
        flag1 = Thread.interrupted();
        l = l1;
_L4:
        flag2 = flag1;
        flag3 = awaitNanos(guard, l, flag3);
        flag2 = flag3;
        if (flag1)
        {
            Thread.currentThread().interrupt();
            return flag3;
        }
        continue; /* Loop/switch isn't completed */
        timeunit;
        boolean flag4;
        flag4 = true;
        flag1 = true;
        flag2 = flag4;
        flag3 = guard.isSatisfied();
        if (flag3)
        {
            flag2 = true;
            if (true)
            {
                Thread.currentThread().interrupt();
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        flag3 = false;
        flag2 = flag4;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L4; else goto _L3
_L3:
        guard;
        if (flag2)
        {
            Thread.currentThread().interrupt();
        }
        throw guard;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
