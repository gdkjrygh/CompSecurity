// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paveldudka.util;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

public class FastBlur
{

    public FastBlur()
    {
    }

    public static Bitmap doBlur(Bitmap bitmap, int i, boolean flag)
    {
        if (i < 1)
        {
            return bitmap;
        }
        int ai[];
        int ai1[];
        int ai2[];
        int ai3[];
        int ai4[];
        int ai5[];
        int j;
        int j1;
        int j9;
        int k9;
        int l9;
        int i10;
        int k10;
        if (!flag)
        {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        j9 = bitmap.getWidth();
        k9 = bitmap.getHeight();
        ai = new int[j9 * k9];
        bitmap.getPixels(ai, 0, j9, 0, 0, j9, k9);
        k10 = j9 - 1;
        l9 = k9 - 1;
        j = j9 * k9;
        i10 = i + i + 1;
        ai1 = new int[j];
        ai2 = new int[j];
        ai3 = new int[j];
        ai4 = new int[Math.max(j9, k9)];
        j = i10 + 1 >> 1;
        j1 = j * j;
        ai5 = new int[j1 * 256];
        for (int k = 0; k < j1 * 256; k++)
        {
            ai5[k] = k / j1;
        }

        int l6 = 0;
        int k5 = 0;
        int ai6[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i10, 3
        });
        int j10 = i + 1;
        for (int i6 = 0; i6 < k9; i6++)
        {
            int k3 = 0;
            int k4 = 0;
            int i5 = 0;
            int k1 = 0;
            int i3 = 0;
            int i4 = 0;
            int l = 0;
            int i2 = 0;
            int k2 = 0;
            int j7 = -i;
            while (j7 <= i) 
            {
                int j8 = ai[Math.min(k10, Math.max(j7, 0)) + l6];
                int ai7[] = ai6[j7 + i];
                ai7[0] = (0xff0000 & j8) >> 16;
                ai7[1] = (0xff00 & j8) >> 8;
                ai7[2] = j8 & 0xff;
                j8 = j10 - Math.abs(j7);
                i5 += ai7[0] * j8;
                k4 += ai7[1] * j8;
                k3 += ai7[2] * j8;
                if (j7 > 0)
                {
                    k2 += ai7[0];
                    i2 += ai7[1];
                    l += ai7[2];
                } else
                {
                    i4 += ai7[0];
                    i3 += ai7[1];
                    k1 += ai7[2];
                }
                j7++;
            }
            int k8 = i;
            for (int k7 = 0; k7 < j9; k7++)
            {
                ai1[l6] = ai5[i5];
                ai2[l6] = ai5[k4];
                ai3[l6] = ai5[k3];
                int ai8[] = ai6[((k8 - i) + i10) % i10];
                int i12 = ai8[0];
                int k11 = ai8[1];
                int i11 = ai8[2];
                if (i6 == 0)
                {
                    ai4[k7] = Math.min(k7 + i + 1, k10);
                }
                int j12 = ai[ai4[k7] + k5];
                ai8[0] = (0xff0000 & j12) >> 16;
                ai8[1] = (0xff00 & j12) >> 8;
                ai8[2] = j12 & 0xff;
                k2 += ai8[0];
                i2 += ai8[1];
                l += ai8[2];
                i5 = (i5 - i4) + k2;
                k4 = (k4 - i3) + i2;
                k3 = (k3 - k1) + l;
                k8 = (k8 + 1) % i10;
                ai8 = ai6[k8 % i10];
                i4 = (i4 - i12) + ai8[0];
                i3 = (i3 - k11) + ai8[1];
                k1 = (k1 - i11) + ai8[2];
                k2 -= ai8[0];
                i2 -= ai8[1];
                l -= ai8[2];
                l6++;
            }

            k5 += j9;
        }

        for (int i1 = 0; i1 < j9; i1++)
        {
            int j4 = 0;
            int j5 = 0;
            int l5 = 0;
            int j2 = 0;
            int l3 = 0;
            int l4 = 0;
            int l1 = 0;
            int l2 = 0;
            int j3 = 0;
            int j6 = -i * j9;
            int i7 = -i;
            while (i7 <= i) 
            {
                int l7 = Math.max(0, j6) + i1;
                int ai9[] = ai6[i7 + i];
                ai9[0] = ai1[l7];
                ai9[1] = ai2[l7];
                ai9[2] = ai3[l7];
                int l8 = j10 - Math.abs(i7);
                l5 += ai1[l7] * l8;
                j5 += ai2[l7] * l8;
                j4 += ai3[l7] * l8;
                if (i7 > 0)
                {
                    j3 += ai9[0];
                    l2 += ai9[1];
                    l1 += ai9[2];
                } else
                {
                    l4 += ai9[0];
                    l3 += ai9[1];
                    j2 += ai9[2];
                }
                l7 = j6;
                if (i7 < l9)
                {
                    l7 = j6 + j9;
                }
                i7++;
                j6 = l7;
            }
            i7 = i1;
            int i8 = i;
            for (int k6 = 0; k6 < k9; k6++)
            {
                ai[i7] = 0xff000000 & ai[i7] | ai5[l5] << 16 | ai5[j5] << 8 | ai5[j4];
                int ai10[] = ai6[((i8 - i) + i10) % i10];
                int j11 = ai10[0];
                int l10 = ai10[1];
                int i9 = ai10[2];
                if (i1 == 0)
                {
                    ai4[k6] = Math.min(k6 + j10, l9) * j9;
                }
                int l11 = i1 + ai4[k6];
                ai10[0] = ai1[l11];
                ai10[1] = ai2[l11];
                ai10[2] = ai3[l11];
                j3 += ai10[0];
                l2 += ai10[1];
                l1 += ai10[2];
                l5 = (l5 - l4) + j3;
                j5 = (j5 - l3) + l2;
                j4 = (j4 - j2) + l1;
                i8 = (i8 + 1) % i10;
                ai10 = ai6[i8];
                l4 = (l4 - j11) + ai10[0];
                l3 = (l3 - l10) + ai10[1];
                j2 = (j2 - i9) + ai10[2];
                j3 -= ai10[0];
                l2 -= ai10[1];
                l1 -= ai10[2];
                i7 += j9;
            }

        }

        bitmap.setPixels(ai, 0, j9, 0, 0, j9, k9);
        return bitmap;
    }
}
