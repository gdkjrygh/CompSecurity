// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.a;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class d extends Number
{

    private static final NumberFormat c = DecimalFormat.getInstance();
    public final int a;
    public final int b;

    public d(int i, int j)
    {
        a = i;
        b = j;
    }

    public static final d a(long l, long l1)
    {
        long l4;
        long l5;
label0:
        {
            long l2 = l;
            long l3 = l1;
            if (l <= 0x7fffffffL)
            {
                l2 = l;
                l3 = l1;
                if (l >= 0xffffffff80000000L)
                {
                    l2 = l;
                    l3 = l1;
                    if (l1 <= 0x7fffffffL)
                    {
                        l4 = l;
                        l5 = l1;
                        if (l1 >= 0xffffffff80000000L)
                        {
                            break label0;
                        }
                        l3 = l1;
                        l2 = l;
                    }
                }
            }
            do
            {
                if (l2 <= 0x7fffffffL && l2 >= 0xffffffff80000000L && l3 <= 0x7fffffffL && l3 >= 0xffffffff80000000L || Math.abs(l2) <= 1L || Math.abs(l3) <= 1L)
                {
                    l4 = l2;
                    l5 = l3;
                    if (l3 == 0L)
                    {
                        throw new NumberFormatException((new StringBuilder("Invalid value, numerator: ")).append(l2).append(", divisor: ").append(l3).toString());
                    }
                    break;
                }
                l2 >>= 1;
                l3 >>= 1;
            } while (true);
        }
        l = b(l4, l5);
        l1 = l5 / l;
        return new d((int)(l4 / l), (int)l1);
    }

    private static long b(long l, long l1)
    {
        do
        {
            long l2 = l;
            if (l1 == 0L)
            {
                return l2;
            }
            l = l1;
            l1 = l2 % l1;
        } while (true);
    }

    public final d a()
    {
        return new d(-a, b);
    }

    public double doubleValue()
    {
        return (double)a / (double)b;
    }

    public float floatValue()
    {
        return (float)a / (float)b;
    }

    public int intValue()
    {
        return a / b;
    }

    public long longValue()
    {
        return (long)a / (long)b;
    }

    public String toString()
    {
        if (b == 0)
        {
            return (new StringBuilder("Invalid rational (")).append(a).append("/").append(b).append(")").toString();
        }
        if (a % b == 0)
        {
            return c.format(a / b);
        } else
        {
            return (new StringBuilder(String.valueOf(a))).append("/").append(b).append(" (").append(c.format((double)a / (double)b)).append(")").toString();
        }
    }

}
