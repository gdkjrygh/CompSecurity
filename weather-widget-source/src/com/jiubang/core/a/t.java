// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.graphics.Rect;

public class t
{

    private Rect a;
    private Rect b;
    private Rect c;
    private Rect d;

    public t()
    {
        a = new Rect();
        b = new Rect();
        c = new Rect();
        d = new Rect();
    }

    public Rect a()
    {
        return a;
    }

    public void a(int j, int k, int l, int i1)
    {
        a.set(j, k, l, i1);
    }

    public void b(int j, int k, int l, int i1)
    {
        b.set(j, k, l, i1);
    }

    public boolean b()
    {
        return a.isEmpty();
    }

    public Rect c()
    {
        return c;
    }

    public void c(int j, int k, int l, int i1)
    {
        c.set(j, k, l, i1);
    }

    public void d(int j, int k, int l, int i1)
    {
        d.set(j, k, l, i1);
    }

    public boolean d()
    {
        return c.isEmpty();
    }

    public Rect e()
    {
        return d;
    }

    public boolean f()
    {
        return d.isEmpty();
    }

    public Rect g()
    {
        return b;
    }

    public boolean h()
    {
        return b.isEmpty();
    }

    public void i()
    {
        a.setEmpty();
        b.setEmpty();
        c.setEmpty();
        d.setEmpty();
    }
}
