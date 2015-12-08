// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.jiubang.core.c:
//            b, g, h, c, 
//            d, e, i

public abstract class a
{

    private static final BlockingQueue a;
    public static final ThreadPoolExecutor b;
    private static final ThreadFactory c;
    private static final g d = new g(null);
    private final i e = new c(this);
    private final FutureTask f;
    private volatile h g;

    public a()
    {
        g = h.a;
        f = new d(this, e);
    }

    static void a(a a1, Object obj)
    {
        a1.b(obj);
    }

    private void b(Object obj)
    {
        if (c())
        {
            obj = null;
        }
        a(obj);
        g = h.c;
    }

    static g d()
    {
        return d;
    }

    protected transient abstract Object a(Object aobj[]);

    protected void a()
    {
    }

    protected void a(Object obj)
    {
    }

    protected void b()
    {
    }

    protected transient void b(Object aobj[])
    {
    }

    public final transient a c(Object aobj[])
    {
        if (g == h.a) goto _L2; else goto _L1
_L1:
        e.a[g.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        g = h.b;
        a();
        e.b = aobj;
        b.execute(f);
        return this;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public final boolean c()
    {
        return f.isCancelled();
    }

    static 
    {
        a = new LinkedBlockingQueue(128);
        c = new b();
        b = new ThreadPoolExecutor(2, 16, 15L, TimeUnit.SECONDS, a, c);
    }
}
