// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

// Referenced classes of package com.go.weatherex.common:
//            g, o, h

class n
    implements Executor
{

    final ArrayDeque a;
    Runnable b;

    private n()
    {
        a = new ArrayDeque();
    }

    n(h h)
    {
        this();
    }

    protected void a()
    {
        this;
        JVM INSTR monitorenter ;
        Runnable runnable;
        runnable = (Runnable)a.poll();
        b = runnable;
        if (runnable == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        g.a.execute(b);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void execute(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        a.offer(new o(this, runnable));
        if (b == null)
        {
            a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }
}
