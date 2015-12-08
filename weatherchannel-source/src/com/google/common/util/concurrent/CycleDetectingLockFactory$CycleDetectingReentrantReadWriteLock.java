// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

final class <init> extends ReentrantReadWriteLock
    implements <init>
{

    private final writeLock lockGraphNode;
    private final writeLock readLock;
    final CycleDetectingLockFactory this$0;
    private final writeLock writeLock;

    public <init> getLockGraphNode()
    {
        return lockGraphNode;
    }

    public boolean isAcquiredByCurrentThread()
    {
        return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
    }

    public volatile Lock readLock()
    {
        return readLock();
    }

    public java.util.concurrent.locks.teLock readLock()
    {
        return readLock;
    }

    public volatile Lock writeLock()
    {
        return writeLock();
    }

    public java.util.concurrent.locks.teLock writeLock()
    {
        return writeLock;
    }

    private ( , boolean flag)
    {
        this$0 = CycleDetectingLockFactory.this;
        super(flag);
        readLock = new >(CycleDetectingLockFactory.this, this);
        writeLock = new t>(CycleDetectingLockFactory.this, this);
        lockGraphNode = (lockGraphNode)Preconditions.checkNotNull();
    }

    lockGraphNode(lockGraphNode lockgraphnode, boolean flag, lockGraphNode lockgraphnode1)
    {
        this(lockgraphnode, flag);
    }
}
