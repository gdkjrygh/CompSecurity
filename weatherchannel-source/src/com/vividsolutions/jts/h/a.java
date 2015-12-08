// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.h;


public final class a
{

    private boolean a;
    private int b;
    private long c;
    private long d;

    public a()
    {
        a = true;
        b = 53;
        c = 0L;
    }

    private static int a(long l, int i)
    {
        return (1L << i & l) == 0L ? 0 : 1;
    }

    public final double a()
    {
        return Double.longBitsToDouble(c);
    }

    public final void a(double d1)
    {
        int i;
        int j;
        long l;
        long l1;
        i = 0;
        l = Double.doubleToLongBits(d1);
        if (a)
        {
            c = l;
            d = c >> 52;
            a = false;
            return;
        }
        if (l >> 52 != d)
        {
            c = 0L;
            return;
        }
        l1 = c;
        j = 52;
_L3:
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (a(l1, j) == a(l, j)) goto _L2; else goto _L1
_L1:
        b = i;
        c = c & ~((1L << 64 - (b + 12)) - 1L);
        return;
_L2:
        j--;
        i++;
          goto _L3
        i = 52;
          goto _L1
    }
}
