// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

public class StackBlurManager
{

    public StackBlurManager()
    {
    }

    public static void process(Bitmap bitmap, int i)
    {
        int ai[];
        int ai1[];
        int ai2[];
        int ai3[];
        int ai4[];
        int ai5[];
        int j;
        int k;
        int k4;
        int l4;
        int i5;
        int j5;
        int l5;
        if (i < 1)
        {
            return;
        }
        k4 = bitmap.getWidth();
        l4 = bitmap.getHeight();
        ai = new int[k4 * l4];
        bitmap.getPixels(ai, 0, k4, 0, 0, k4, l4);
        l5 = k4 - 1;
        i5 = l4 - 1;
        j = k4 * l4;
        j5 = i + i + 1;
        ai1 = new int[j];
        ai2 = new int[j];
        ai3 = new int[j];
        ai4 = new int[Math.max(k4, l4)];
        j = j5 + 1 >> 1;
        k = j * j;
        ai5 = new int[k * 256];
        j = 0;
_L6:
        if (j < k * 256) goto _L2; else goto _L1
_L1:
        int ai6[][];
        int k2;
        int l2;
        int i3;
        int k5;
        k2 = 0;
        i3 = 0;
        ai6 = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j5, 3
        });
        k5 = i + 1;
        l2 = 0;
_L9:
        if (l2 < l4) goto _L4; else goto _L3
_L3:
        j = 0;
_L14:
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int ai7[];
        int j3;
        int l3;
        int j6;
        int l6;
        int j7;
        int k7;
        if (j >= k4)
        {
            bitmap.setPixels(ai, 0, k4, 0, 0, k4, l4);
            return;
        }
        l1 = 0;
        j2 = 0;
        k2 = 0;
        l = 0;
        k1 = 0;
        i2 = 0;
        k = 0;
        i1 = 0;
        j1 = 0;
        l2 = -i * k4;
        i3 = -i;
          goto _L5
_L2:
        ai5[j] = j / k;
        j++;
          goto _L6
_L4:
        k1 = 0;
        i2 = 0;
        j2 = 0;
        k = 0;
        j1 = 0;
        l1 = 0;
        j = 0;
        l = 0;
        i1 = 0;
        j3 = -i;
_L10:
        if (j3 <= i) goto _L8; else goto _L7
_L7:
        l3 = i;
        j3 = 0;
_L11:
        if (j3 < k4)
        {
            break MISSING_BLOCK_LABEL_465;
        }
        k2 += k4;
        l2++;
          goto _L9
_L8:
        l3 = ai[Math.min(l5, Math.max(j3, 0)) + i3];
        ai7 = ai6[j3 + i];
        ai7[0] = (0xff0000 & l3) >> 16;
        ai7[1] = (0xff00 & l3) >> 8;
        ai7[2] = l3 & 0xff;
        l3 = k5 - Math.abs(j3);
        j2 += ai7[0] * l3;
        i2 += ai7[1] * l3;
        k1 += ai7[2] * l3;
        if (j3 > 0)
        {
            i1 += ai7[0];
            l += ai7[1];
            j += ai7[2];
        } else
        {
            l1 += ai7[0];
            j1 += ai7[1];
            k += ai7[2];
        }
        j3++;
          goto _L10
        ai1[i3] = ai5[j2];
        ai2[i3] = ai5[i2];
        ai3[i3] = ai5[k1];
        ai7 = ai6[((l3 - i) + j5) % j5];
        j7 = ai7[0];
        l6 = ai7[1];
        j6 = ai7[2];
        if (l2 == 0)
        {
            ai4[j3] = Math.min(j3 + i + 1, l5);
        }
        k7 = ai[ai4[j3] + k2];
        ai7[0] = (0xff0000 & k7) >> 16;
        ai7[1] = (0xff00 & k7) >> 8;
        ai7[2] = k7 & 0xff;
        i1 += ai7[0];
        l += ai7[1];
        j += ai7[2];
        j2 = (j2 - l1) + i1;
        i2 = (i2 - j1) + l;
        k1 = (k1 - k) + j;
        l3 = (l3 + 1) % j5;
        ai7 = ai6[l3 % j5];
        l1 = (l1 - j7) + ai7[0];
        j1 = (j1 - l6) + ai7[1];
        k = (k - j6) + ai7[2];
        i1 -= ai7[0];
        l -= ai7[1];
        j -= ai7[2];
        i3++;
        j3++;
          goto _L11
_L5:
        if (i3 <= i) goto _L13; else goto _L12
_L12:
        int k3;
        i3 = j;
        k3 = i;
        l2 = 0;
_L15:
        if (l2 < l4)
        {
            break MISSING_BLOCK_LABEL_1005;
        }
        j++;
          goto _L14
_L13:
        k3 = Math.max(0, l2) + j;
        int ai8[] = ai6[i3 + i];
        ai8[0] = ai1[k3];
        ai8[1] = ai2[k3];
        ai8[2] = ai3[k3];
        int i4 = k5 - Math.abs(i3);
        k2 += ai1[k3] * i4;
        j2 += ai2[k3] * i4;
        l1 += ai3[k3] * i4;
        if (i3 > 0)
        {
            j1 += ai8[0];
            i1 += ai8[1];
            k += ai8[2];
        } else
        {
            i2 += ai8[0];
            k1 += ai8[1];
            l += ai8[2];
        }
        k3 = l2;
        if (i3 < i5)
        {
            k3 = l2 + k4;
        }
        i3++;
        l2 = k3;
          goto _L5
        ai[i3] = 0xff000000 | ai5[k2] << 16 | ai5[j2] << 8 | ai5[l1];
        int ai9[] = ai6[((k3 - i) + j5) % j5];
        int k6 = ai9[0];
        int i6 = ai9[1];
        int j4 = ai9[2];
        if (j == 0)
        {
            ai4[l2] = Math.min(l2 + k5, i5) * k4;
        }
        int i7 = j + ai4[l2];
        ai9[0] = ai1[i7];
        ai9[1] = ai2[i7];
        ai9[2] = ai3[i7];
        j1 += ai9[0];
        i1 += ai9[1];
        k += ai9[2];
        k2 = (k2 - i2) + j1;
        j2 = (j2 - k1) + i1;
        l1 = (l1 - l) + k;
        k3 = (k3 + 1) % j5;
        ai9 = ai6[k3];
        i2 = (i2 - k6) + ai9[0];
        k1 = (k1 - i6) + ai9[1];
        l = (l - j4) + ai9[2];
        j1 -= ai9[0];
        i1 -= ai9[1];
        k -= ai9[2];
        i3 += k4;
        l2++;
          goto _L15
    }
}
