// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;


public final class d
{

    private int a;
    private int b;
    private int c;
    private double d;
    private boolean e;

    public d()
    {
        a = 8;
        b = 1;
        c = 1;
        d = 5D;
        e = false;
    }

    public final int a()
    {
        return a;
    }

    public final void a(int i)
    {
        a = i;
        if (a == 0)
        {
            c = 3;
        }
        if (a < 0)
        {
            c = 2;
            d = Math.abs(a);
        }
        if (i <= 0)
        {
            a = 1;
        }
        if (c != 1)
        {
            a = 8;
        }
    }

    public final int b()
    {
        return b;
    }

    public final void b(int i)
    {
        b = i;
    }

    public final int c()
    {
        return c;
    }

    public final double d()
    {
        return d;
    }
}
