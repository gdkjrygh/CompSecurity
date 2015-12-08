// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.a;


public final class b
{

    public double a;
    public double b;

    public b()
    {
        a = 0.0D;
        b = 0.0D;
    }

    public b(double d, double d1)
    {
        a(d, d1);
    }

    public b(b b1)
    {
        a(b1.a, b1.b);
    }

    public final double a()
    {
        return b - a;
    }

    public final void a(double d, double d1)
    {
        a = d;
        b = d1;
        if (d > d1)
        {
            a = d1;
            b = d;
        }
    }

    public final boolean a(b b1)
    {
        double d = b1.a;
        double d1 = b1.b;
        return d >= a && d1 <= b;
    }

    public final String toString()
    {
        return (new StringBuilder("[")).append(a).append(", ").append(b).append("]").toString();
    }
}
