// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.b;

import com.gau.go.launcherex.gowidget.statistics.w;

public class f
{

    private volatile int a;
    private volatile int b;
    private volatile int c;
    private volatile boolean d;
    private long e;
    private long f;
    private volatile int g;
    private volatile int h;
    private long i;
    private long j;
    private long k;
    private long l;
    private String m;
    private int n;
    private String o;
    private StringBuffer p;
    private int q;

    public f()
    {
        a = 11;
        b = -10000;
        e = 0L;
        f = 0L;
        g = 1;
        h = 0;
        i = 0L;
        j = 0L;
        k = 0L;
        l = 0L;
        n = 0;
        d = false;
        p = new StringBuffer();
    }

    public void a(int i1)
    {
        c = i1;
    }

    public void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        e = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s)
    {
        m = s;
    }

    public void a(Throwable throwable)
    {
        p.append(w.a(throwable));
        p.append("\n");
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a()
    {
        return d;
    }

    public int b()
    {
        return c;
    }

    public void b(int i1)
    {
        a = i1;
    }

    public void b(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        f = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(String s)
    {
        o = s;
    }

    public int c()
    {
        return a;
    }

    public void c(int i1)
    {
        b = i1;
    }

    public void c(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        i = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long d()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        l1 = f;
        l2 = e;
        this;
        JVM INSTR monitorexit ;
        return l1 - l2;
        Exception exception;
        exception;
        throw exception;
    }

    public void d(int i1)
    {
        g = i1;
    }

    public void d(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        j = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int e()
    {
        return b;
    }

    public void e(int i1)
    {
        h = i1;
    }

    public void e(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        k = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int f()
    {
        return g;
    }

    public void f(int i1)
    {
        n = i1;
    }

    public void f(long l1)
    {
        l = l1;
    }

    public int g()
    {
        return h;
    }

    public void g(int i1)
    {
        q = i1;
    }

    public long h()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = j;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long i()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        l1 = j;
        l2 = i;
        this;
        JVM INSTR monitorexit ;
        return l1 - l2;
        Exception exception;
        exception;
        throw exception;
    }

    public String j()
    {
        return m;
    }

    public int k()
    {
        return n;
    }

    public String l()
    {
        return o;
    }

    public String m()
    {
        return p.toString();
    }

    public int n()
    {
        return q;
    }

    public long o()
    {
        return l;
    }
}
