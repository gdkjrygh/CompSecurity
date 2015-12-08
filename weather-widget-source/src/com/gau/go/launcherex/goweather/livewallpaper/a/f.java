// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper.a;


public class f
{

    private float a;
    private String b;
    private float c;
    private float d;
    private boolean e;
    private int f;
    private int g;

    public f()
    {
        f = 0xff000000;
        g = -1;
    }

    public f a(float f1, float f2, float f3, String s, boolean flag)
    {
        b = s;
        e = flag;
        c = f1;
        d = f2;
        a = f3;
        return this;
    }

    public String a()
    {
        return b;
    }

    public void a(float f1)
    {
        c = f1;
    }

    public void a(int i)
    {
        f = i;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public float b()
    {
        return c;
    }

    public void b(float f1)
    {
        d = f1;
    }

    public void b(int i)
    {
        g = i;
    }

    public float c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public float e()
    {
        return a;
    }

    public int f()
    {
        return f;
    }

    public int g()
    {
        return g;
    }
}
