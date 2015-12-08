// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

final class <init> extends ReentrantLock
    implements <init>
{

    private final this._cls0 lockGraphNode;
    final CycleDetectingLockFactory this$0;

    public <init> getLockGraphNode()
    {
        return lockGraphNode;
    }

    public boolean isAcquiredByCurrentThread()
    {
        return isHeldByCurrentThread();
    }

    public void lock()
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, this);
        super.lock();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        return;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        throw exception;
    }

    public void lockInterruptibly()
        throws InterruptedException
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, this);
        super.lockInterruptibly();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        return;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        throw exception;
    }

    public boolean tryLock()
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, this);
        boolean flag = super.tryLock();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        return flag;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        throw exception;
    }

    public boolean tryLock(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        CycleDetectingLockFactory.access$600(CycleDetectingLockFactory.this, this);
        boolean flag = super.tryLock(l, timeunit);
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        return flag;
        timeunit;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        throw timeunit;
    }

    public void unlock()
    {
        super.unlock();
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        return;
        Exception exception;
        exception;
        CycleDetectingLockFactory.access$700(CycleDetectingLockFactory.this, this);
        throw exception;
    }

    private ( , boolean flag)
    {
        this$0 = CycleDetectingLockFactory.this;
        super(flag);
        lockGraphNode = (lockGraphNode)Preconditions.checkNotNull();
    }

    lockGraphNode(lockGraphNode lockgraphnode, boolean flag, lockGraphNode lockgraphnode1)
    {
        this(lockgraphnode, flag);
    }
}
