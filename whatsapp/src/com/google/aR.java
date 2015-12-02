// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


final class aR
{

    private final int a;
    private final int b;
    private final int c;
    private int d;
    private final int e;

    aR(int i, int j, int k, int l)
    {
        d = -1;
        b = i;
        a = j;
        e = k;
        c = l;
    }

    int a()
    {
        return a;
    }

    void a(int i)
    {
        d = i;
    }

    int b()
    {
        return e;
    }

    boolean b(int i)
    {
        return i != -1 && e == (i % 3) * 3;
    }

    boolean c()
    {
        return b(d);
    }

    int d()
    {
        return b;
    }

    int e()
    {
        return c;
    }

    int f()
    {
        return d;
    }

    int g()
    {
        return a - b;
    }

    void h()
    {
        d = (c / 30) * 3 + e / 3;
    }

    public String toString()
    {
        return (new StringBuilder()).append(d).append("|").append(c).toString();
    }
}
