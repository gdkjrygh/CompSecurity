// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


public class b
{

    private float a;
    private float b;
    private String c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;

    public b()
    {
    }

    public String a()
    {
        return c;
    }

    public void a(float f1)
    {
        a = f1;
    }

    public void a(int k)
    {
        d = k;
    }

    public void a(String s)
    {
        c = s;
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public int b()
    {
        return d;
    }

    public void b(float f1)
    {
        b = f1;
    }

    public void b(int k)
    {
        e = k;
    }

    public void b(boolean flag)
    {
        i = flag;
    }

    public int c()
    {
        return e;
    }

    public void c(int k)
    {
        f = k;
    }

    public void c(boolean flag)
    {
        j = flag;
    }

    public int d()
    {
        return f;
    }

    public void d(int k)
    {
        g = k;
    }

    public int e()
    {
        return g;
    }

    public boolean f()
    {
        return h;
    }

    public boolean g()
    {
        return i;
    }

    public boolean h()
    {
        return j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("background x = ").append(a).append(", y = ").append(b).append(", src = ").append(c).append(", color = ").append(d).append(", width = ").append(e).append(", height = ").append(f).append("\n").toString();
    }
}
