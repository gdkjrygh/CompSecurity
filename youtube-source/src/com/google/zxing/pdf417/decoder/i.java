// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.a;
import java.lang.reflect.Array;

final class i
{

    private static final float a[][];

    static int a(int ai[])
    {
        int l;
        float f = com.google.zxing.pdf417.a.a(ai);
        int ai1[] = new int[8];
        int i3 = 0;
        int k1 = 0;
        for (int j = 0; j < 17;)
        {
            float f2 = f / 34F;
            float f4 = ((float)j * f) / 17F;
            int j3 = i3;
            int i2 = k1;
            if ((float)(ai[k1] + i3) <= f2 + f4)
            {
                j3 = i3 + ai[k1];
                i2 = k1 + 1;
            }
            ai1[i2] = ai1[i2] + 1;
            j++;
            i3 = j3;
            k1 = i2;
        }

        long l3 = 0L;
        for (int k = 0; k < ai1.length; k++)
        {
            k1 = 0;
            while (k1 < ai1[k]) 
            {
                int j2;
                long l4;
                if (k % 2 == 0)
                {
                    j2 = 1;
                } else
                {
                    j2 = 0;
                }
                l4 = j2;
                k1++;
                l3 = l3 << 1 | l4;
            }
        }

        k1 = (int)l3;
        l = k1;
        if (com.google.zxing.pdf417.a.a(k1) == -1)
        {
            l = -1;
        }
        if (l == -1) goto _L2; else goto _L1
_L1:
        int k2 = l;
_L4:
        return k2;
_L2:
        int l1 = com.google.zxing.pdf417.a.a(ai);
        float af[] = new float[8];
        for (int i1 = 0; i1 < af.length; i1++)
        {
            af[i1] = (float)ai[i1] / (float)l1;
        }

        float f1 = 3.402823E+38F;
        int j1 = -1;
        l1 = 0;
        do
        {
            k2 = j1;
            if (l1 >= a.length)
            {
                continue;
            }
            float f3 = 0.0F;
            for (int l2 = 0; l2 < 8; l2++)
            {
                float f5 = a[l1][l2] - af[l2];
                f3 += f5 * f5;
            }

            if (f3 < f1)
            {
                j1 = a.a[l1];
            } else
            {
                f3 = f1;
            }
            l1++;
            f1 = f3;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        int j = a.a.length;
        a = (float[][])Array.newInstance(Float.TYPE, new int[] {
            j, 8
        });
        for (int k = 0; k < a.a.length; k++)
        {
            int j1 = a.a[k];
            int l = 0;
            int i1 = j1 & 1;
            for (; l < 8; l++)
            {
                float f = 0.0F;
                for (; (j1 & 1) == i1; j1 >>= 1)
                {
                    f++;
                }

                i1 = j1 & 1;
                a[k][8 - l - 1] = f / 17F;
            }

        }

    }
}
