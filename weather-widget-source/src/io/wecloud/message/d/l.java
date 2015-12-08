// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import java.util.Queue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package io.wecloud.message.d:
//            k

class l
    implements RejectedExecutionHandler
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
    {
        synchronized (k.a(a))
        {
            k.b(a).offer(runnable);
        }
        return;
        runnable;
        threadpoolexecutor;
        JVM INSTR monitorexit ;
        throw runnable;
    }
}
