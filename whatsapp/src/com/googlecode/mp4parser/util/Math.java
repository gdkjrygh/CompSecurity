// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;


public class Math
{

    public Math()
    {
    }

    public static int gcd(int i, int j)
    {
        do
        {
            if (j <= 0)
            {
                return i;
            }
            int k = i % j;
            i = j;
            j = k;
        } while (true);
    }

    public static long gcd(long l, long l1)
    {
        do
        {
            if (l1 <= 0L)
            {
                return l;
            }
            long l2 = l % l1;
            l = l1;
            l1 = l2;
        } while (true);
    }

    public static int lcm(int i, int j)
    {
        return (j / gcd(i, j)) * i;
    }

    public static long lcm(long l, long l1)
    {
        return (l1 / gcd(l, l1)) * l;
    }
}
