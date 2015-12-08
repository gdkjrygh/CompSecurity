// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

private class readWriteLock extends java.util.concurrent.locks.adLock
{

    final Lock readWriteLock;
    final CycleDetectingLockFactory this$0;

    public void lock()
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, readWriteLock);
        super.readWriteLock();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        return;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        throw exception;
    }

    public void lockInterruptibly()
        throws InterruptedException
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, readWriteLock);
        super.readWriteLock();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        return;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        throw exception;
    }

    public boolean tryLock()
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, readWriteLock);
        boolean flag = super.readWriteLock();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        return flag;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        throw exception;
    }

    public boolean tryLock(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, readWriteLock);
        boolean flag = super.readWriteLock(l, timeunit);
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        return flag;
        timeunit;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        throw timeunit;
    }

    public void unlock()
    {
        super.adLock();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        return;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, readWriteLock);
        throw exception;
    }

    Lock(Lock lock1)
    {
        this$0 = CycleDetectingLockFactory.this;
        super(lock1);
        readWriteLock = lock1;
    }
}
