// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.d;


public final class a
{

    private double a;
    private long b;

    private a(double d)
    {
        a = d;
        b = Double.doubleToLongBits(d);
    }

    private int a()
    {
        return ((int)(b >> 52) & 0x7ff) - 1023;
    }

    public static int a(double d)
    {
        return (new a(d)).a();
    }

    public final String toString()
    {
        String s = Long.toBinaryString(b);
        s = (new StringBuilder()).append("0000000000000000000000000000000000000000000000000000000000000000").append(s).toString();
        s = s.substring(s.length() - 64);
        return (new StringBuilder()).append(s.substring(0, 1)).append("  ").append(s.substring(1, 12)).append("(").append(a()).append(") ").append(s.substring(12)).append(" [ ").append(a).append(" ]").toString();
    }
}
