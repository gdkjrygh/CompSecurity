// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import java.util.Queue;

// Referenced classes of package io.wecloud.message.d:
//            k

class m extends Thread
{

    final k a;

    private m(k k1)
    {
        a = k1;
        super();
    }

    m(k k1, m m1)
    {
        this(k1);
    }

    public void run()
    {
        Object obj = k.a(a);
        obj;
        JVM INSTR monitorenter ;
        Runnable runnable;
        if (!a.a())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        runnable = (Runnable)k.b(a).poll();
        if (runnable == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        a.a(runnable);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
