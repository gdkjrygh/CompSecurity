// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Bitmap;

// Referenced classes of package com.whatsapp.util:
//            Log

public class af
{

    private static float a(float f, float f1, float f2)
    {
        if (f < f1)
        {
            return f1;
        }
        if (f > f2)
        {
            return f2;
        } else
        {
            return f;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int j)
    {
        int ai[] = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(ai, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        a(ai, new int[bitmap.getWidth() * bitmap.getHeight()], bitmap.getWidth(), bitmap.getHeight(), i, j);
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        bitmap1.setPixels(ai, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return bitmap1;
    }

    private static void a(int ai[], int ai1[], int i, int j, int k)
    {
        int ai2[];
        int l;
        int l3;
        int k4;
        boolean flag;
        flag = Log.f;
        k4 = i - 1;
        int i1 = k * 2 + 1;
        ai2 = new int[i1 * 256];
        l = 0;
        do
        {
            if (l >= i1 * 256)
            {
                break;
            }
            ai2[l] = l / i1;
            l++;
        } while (!flag);
        l = 0;
        l3 = 0;
_L4:
        if (l >= j) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int i4 = -k;
        i2 = 0;
        l1 = 0;
        k1 = 0;
        j1 = 0;
        int l2;
        int j3;
        do
        {
            k2 = i2;
            j2 = l1;
            j3 = k1;
            l2 = j1;
            if (i4 > k)
            {
                break;
            }
            k2 = ai[(int)a(i4, 0.0F, i - 1) + l3];
            l2 = j1 + (k2 >> 24 & 0xff);
            j3 = k1 + (k2 >> 16 & 0xff);
            j2 = l1 + (k2 >> 8 & 0xff);
            k2 = i2 + (k2 & 0xff);
            i4++;
            i2 = k2;
            l1 = j2;
            k1 = j3;
            j1 = l2;
        } while (!flag);
        j1 = l;
        l1 = 0;
        k1 = k2;
        i2 = j2;
        k2 = l2;
        j2 = j3;
_L5:
        int i3;
        int k3;
        if (l1 < i)
        {
            ai1[j1] = ai2[k2] << 24 | ai2[j2] << 16 | ai2[i2] << 8 | ai2[k1];
            i3 = l1 + k + 1;
            if (i3 > k4)
            {
                i3 = k4;
            }
            int j4 = l1 - k;
            k3 = j4;
            if (j4 < 0)
            {
                k3 = 0;
            }
            i3 = ai[i3 + l3];
            k3 = ai[k3 + l3];
            k2 += (i3 >> 24 & 0xff) - (k3 >> 24 & 0xff);
            j2 += (0xff0000 & i3) - (0xff0000 & k3) >> 16;
            i2 += (0xff00 & i3) - (0xff00 & k3) >> 8;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_424;
            }
        }
        l++;
        if (!flag) goto _L3; else goto _L2
_L2:
        return;
_L3:
        l3 += i;
          goto _L4
        l1++;
        j1 += j;
        k1 += (i3 & 0xff) - (k3 & 0xff);
          goto _L5
    }

    public static void a(int ai[], int ai1[], int i, int j, int k, int l)
    {
        boolean flag = Log.f;
        int i1 = 0;
        do
        {
            if (i1 >= l)
            {
                break;
            }
            a(ai, ai1, i, j, k);
            a(ai1, ai, j, i, k);
            i1++;
        } while (!flag);
    }
}
