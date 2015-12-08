// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;


final class d
{

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;

    d(int i, int j, int k, int l)
    {
        e = -1;
        a = i;
        b = j;
        c = k;
        d = l;
    }

    final boolean a()
    {
        return a(e);
    }

    final boolean a(int i)
    {
        return i != -1 && c == (i % 3) * 3;
    }

    final void b()
    {
        e = (d / 30) * 3 + c / 3;
    }

    final void b(int i)
    {
        e = i;
    }

    final int c()
    {
        return b - a;
    }

    final int d()
    {
        return a;
    }

    final int e()
    {
        return b;
    }

    final int f()
    {
        return c;
    }

    final int g()
    {
        return d;
    }

    final int h()
    {
        return e;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(e).append("|").append(d).toString();
    }
}
