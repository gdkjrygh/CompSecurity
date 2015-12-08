// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.e;


public final class b
{

    public static double a(double d, double d1, double d2, double d3)
    {
        if (d1 > d)
        {
            d = d1;
        }
        d1 = d;
        if (d2 > d)
        {
            d1 = d2;
        }
        if (d3 > d1)
        {
            return d3;
        } else
        {
            return d1;
        }
    }

    public static double b(double d, double d1, double d2, double d3)
    {
        if (d1 < d)
        {
            d = d1;
        }
        d1 = d;
        if (d2 < d)
        {
            d1 = d2;
        }
        if (d3 < d1)
        {
            return d3;
        } else
        {
            return d1;
        }
    }

    static 
    {
        Math.log(10D);
    }
}
