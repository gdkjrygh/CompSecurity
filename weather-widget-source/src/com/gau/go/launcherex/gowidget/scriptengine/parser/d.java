// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


public class d
{

    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected float e;
    protected int f;
    protected int g;

    public d(int i)
    {
        a = i;
    }

    protected void a(d d1, d d2)
    {
        d1.c = d2.c;
        d1.b = d2.b;
        d1.d = d2.d;
        d1.e = d2.e;
        d1.f = d2.f;
        d1.g = d2.g;
    }

    public int c()
    {
        return f;
    }

    public void c(float f1)
    {
        e = f1;
    }

    public void c(int i)
    {
        f = i;
    }

    public int d()
    {
        return g;
    }

    public void d(int i)
    {
        g = i;
    }

    public int e()
    {
        return a;
    }

    public void e(int i)
    {
        b = i;
    }

    public int f()
    {
        return b;
    }

    public void f(int i)
    {
        c = i;
    }

    public int g()
    {
        return c;
    }

    public void g(int i)
    {
        d = i;
    }

    public int h()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append("type = ").append(a).append(", repeatMode = ").append(b).append(", repeatCount = ").append(c).append(", duration = ").append(d).append(", speed = ").append(e).append(", startDelayTime = ").append(f).append(", repeatStartDelayTime = ").append(g).toString();
    }
}
