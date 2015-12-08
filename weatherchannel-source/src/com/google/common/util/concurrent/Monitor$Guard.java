// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.util.concurrent:
//            Monitor

public static abstract class ition
{

    final Condition condition;
    final Monitor monitor;
    ition next;
    int waiterCount;

    public abstract boolean isSatisfied();

    protected (Monitor monitor1)
    {
        waiterCount = 0;
        monitor = (Monitor)Preconditions.checkNotNull(monitor1, "monitor");
        condition = Monitor.access$000(monitor1).newCondition();
    }
}
