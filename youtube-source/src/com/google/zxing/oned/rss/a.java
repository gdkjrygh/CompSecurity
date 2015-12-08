// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.oned.k;

public abstract class a extends k
{

    private final int a[] = new int[4];
    private final int b[] = new int[8];
    private final float c[] = new float[4];
    private final float d[] = new float[4];
    private final int e[];
    private final int f[];

    protected a()
    {
        e = new int[b.length / 2];
        f = new int[b.length / 2];
    }

    protected static int a(int ai[])
    {
        int i = 0;
        int l = ai.length;
        int j = 0;
        for (; i < l; i++)
        {
            j += ai[i];
        }

        return j;
    }

    protected static int a(int ai[], int ai1[][])
    {
        for (int i = 0; i < ai1.length; i++)
        {
            if (a(ai, ai1[i], 115) < 51)
            {
                return i;
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    protected static void a(int ai[], float af[])
    {
        int j = 0;
        float f1 = af[0];
        for (int i = 1; i < ai.length;)
        {
            float f2 = f1;
            if (af[i] > f1)
            {
                f2 = af[i];
                j = i;
            }
            i++;
            f1 = f2;
        }

        ai[j] = ai[j] + 1;
    }

    protected static void b(int ai[], float af[])
    {
        int j = 0;
        float f1 = af[0];
        for (int i = 1; i < ai.length;)
        {
            float f2 = f1;
            if (af[i] < f1)
            {
                f2 = af[i];
                j = i;
            }
            i++;
            f1 = f2;
        }

        ai[j] = ai[j] - 1;
    }

    protected static boolean b(int ai[])
    {
        int i = ai[0] + ai[1];
        int l = ai[2];
        int j1 = ai[3];
        float f1 = (float)i / (float)(l + i + j1);
        if (f1 >= 0.7916667F && f1 <= 0.8928571F)
        {
            int j = 0x7fffffff;
            int l1 = 0x80000000;
            int j2 = ai.length;
            for (int i1 = 0; i1 < j2;)
            {
                int i2 = ai[i1];
                int k1 = l1;
                if (i2 > l1)
                {
                    k1 = i2;
                }
                if (i2 < j)
                {
                    j = i2;
                }
                i1++;
                l1 = k1;
            }

            return l1 < j * 10;
        } else
        {
            return false;
        }
    }

    protected final int[] b()
    {
        return a;
    }

    protected final int[] c()
    {
        return b;
    }

    protected final float[] d()
    {
        return c;
    }

    protected final float[] e()
    {
        return d;
    }

    protected final int[] f()
    {
        return e;
    }

    protected final int[] g()
    {
        return f;
    }
}
