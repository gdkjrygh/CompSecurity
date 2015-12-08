// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android;


class MathUtil
{

    static final double EARTH_RADIUS = 6371009D;

    MathUtil()
    {
    }

    static double arcHav(double d)
    {
        return 2D * Math.asin(Math.sqrt(d));
    }

    static double clamp(double d, double d1, double d2)
    {
        if (d < d1)
        {
            return d1;
        }
        if (d > d2)
        {
            return d2;
        } else
        {
            return d;
        }
    }

    static double hav(double d)
    {
        d = Math.sin(0.5D * d);
        return d * d;
    }

    static double havDistance(double d, double d1, double d2)
    {
        return hav(d - d1) + hav(d2) * Math.cos(d) * Math.cos(d1);
    }

    static double havFromSin(double d)
    {
        d *= d;
        return (d / (Math.sqrt(1.0D - d) + 1.0D)) * 0.5D;
    }

    static double inverseMercator(double d)
    {
        return 2D * Math.atan(Math.exp(d)) - 1.5707963267948966D;
    }

    static double mercator(double d)
    {
        return Math.log(Math.tan(0.5D * d + 0.78539816339744828D));
    }

    static double mod(double d, double d1)
    {
        return (d % d1 + d1) % d1;
    }

    static double sinFromHav(double d)
    {
        return 2D * Math.sqrt((1.0D - d) * d);
    }

    static double sinSumFromHav(double d, double d1)
    {
        double d2 = Math.sqrt((1.0D - d) * d);
        double d3 = Math.sqrt((1.0D - d1) * d1);
        return ((d2 + d3) - (d2 * d1 + d3 * d) * 2D) * 2D;
    }

    static double wrap(double d, double d1, double d2)
    {
        if (d >= d1 && d < d2)
        {
            return d;
        } else
        {
            return mod(d - d1, d2 - d1) + d1;
        }
    }
}
