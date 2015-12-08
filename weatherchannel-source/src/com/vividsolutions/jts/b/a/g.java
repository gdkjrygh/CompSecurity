// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b.a;


public final class g
    implements Comparable
{

    Object a;
    private double b;
    private int c;
    private g d;
    private int e;
    private Object f;

    public g(Object obj, double d1, g g1, Object obj1)
    {
        a = obj;
        b = d1;
        d = g1;
        c = 1;
        if (g1 != null)
        {
            c = 2;
        }
        f = obj1;
    }

    public final void a(int i)
    {
        e = i;
    }

    public final boolean a()
    {
        return d == null;
    }

    public final boolean b()
    {
        return d != null;
    }

    public final g c()
    {
        return d;
    }

    public final int compareTo(Object obj)
    {
        obj = (g)obj;
        if (b >= ((g) (obj)).b)
        {
            if (b > ((g) (obj)).b)
            {
                return 1;
            }
            if (c >= ((g) (obj)).c)
            {
                return c <= ((g) (obj)).c ? 0 : 1;
            }
        }
        return -1;
    }

    public final int d()
    {
        return e;
    }

    public final Object e()
    {
        return f;
    }
}
