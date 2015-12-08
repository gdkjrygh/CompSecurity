// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

public static final class lockGraphNodes extends CycleDetectingLockFactory
{

    private final Map lockGraphNodes;

    public ReentrantLock newReentrantLock(Enum enum)
    {
        return newReentrantLock(enum, false);
    }

    public ReentrantLock newReentrantLock(Enum enum, boolean flag)
    {
        if (policy == policy)
        {
            return new ReentrantLock(flag);
        } else
        {
            return new ntLock(this, (ntLock)lockGraphNodes.get(enum), flag, null);
        }
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(Enum enum)
    {
        return newReentrantReadWriteLock(enum, false);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(Enum enum, boolean flag)
    {
        if (policy == policy)
        {
            return new ReentrantReadWriteLock(flag);
        } else
        {
            return new ntReadWriteLock(this, (ntReadWriteLock)lockGraphNodes.get(enum), flag, null);
        }
    }

    ntReadWriteLock(ntReadWriteLock ntreadwritelock, Map map)
    {
        super(ntreadwritelock, null);
        lockGraphNodes = map;
    }
}
