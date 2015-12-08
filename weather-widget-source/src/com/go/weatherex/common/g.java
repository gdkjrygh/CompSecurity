// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.go.weatherex.common:
//            h, n, m, p, 
//            i, j, l, k, 
//            q

public abstract class g
{

    public static final Executor a;
    public static final Executor b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final ThreadFactory f;
    private static final BlockingQueue g;
    private static final m h = new m(null);
    private static volatile Executor i;
    private final q j = new i(this);
    private final FutureTask k;
    private volatile p l;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    public g()
    {
        l = p.a;
        k = new j(this, j);
    }

    static Object a(g g1, Object obj)
    {
        return g1.d(obj);
    }

    static AtomicBoolean a(g g1)
    {
        return g1.n;
    }

    static void b(g g1, Object obj)
    {
        g1.c(obj);
    }

    static void c(g g1, Object obj)
    {
        g1.e(obj);
    }

    private void c(Object obj)
    {
        if (!n.get())
        {
            d(obj);
        }
    }

    private Object d(Object obj)
    {
        h.obtainMessage(1, new l(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    private void e(Object obj)
    {
        if (c())
        {
            b(obj);
        } else
        {
            a(obj);
        }
        l = p.c;
    }

    public final transient g a(Executor executor, Object aobj[])
    {
        if (l == p.a) goto _L2; else goto _L1
_L1:
        k.a[l.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 85;
           goto _L2 _L3 _L4
_L2:
        l = p.b;
        a();
        j.b = aobj;
        executor.execute(k);
        return this;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
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

    protected void b(Object obj)
    {
        b();
    }

    protected transient void b(Object aobj[])
    {
    }

    public final transient g c(Object aobj[])
    {
        return a(i, aobj);
    }

    public final boolean c()
    {
        return m.get();
    }

    static 
    {
        c = Runtime.getRuntime().availableProcessors();
        d = c + 1;
        e = c * 2 + 1;
        f = new h();
        g = new LinkedBlockingQueue(128);
        a = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, g, f, new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
        b = new n(null);
        i = b;
    }
}
