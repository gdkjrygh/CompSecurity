// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.graphics.Bitmap;
import com.google.zxing.c;

public final class g extends c
{

    private final byte a[];
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public g(byte abyte0[], int i, int j, int k, int l, int i1, int j1, 
            boolean flag)
    {
        super(i1, j1);
        if (k + i1 > i || l + j1 > j)
        {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        a = abyte0;
        b = i;
        c = j;
        d = k;
        e = l;
        if (flag)
        {
            a(i1, j1);
        }
    }

    private void a(int i, int j)
    {
        byte abyte0[] = a;
        int k = e;
        int l = b;
        k = d + k * l;
        for (int i1 = 0; i1 < j; i1++)
        {
            int l1 = i / 2;
            int j1 = (k + i) - 1;
            for (int k1 = k; k1 < k + l1;)
            {
                byte byte0 = abyte0[k1];
                abyte0[k1] = abyte0[j1];
                abyte0[j1] = byte0;
                k1++;
                j1--;
            }

            k += b;
        }

    }

    public final byte[] a()
    {
        int i;
        int k;
        int l;
        i = 0;
        k = b();
        l = c();
        if (k != b || l != c) goto _L2; else goto _L1
_L1:
        byte abyte0[] = a;
_L4:
        return abyte0;
_L2:
        int i1 = k * l;
        byte abyte1[] = new byte[i1];
        int j = e * b + d;
        if (k == b)
        {
            System.arraycopy(a, j, abyte1, 0, i1);
            return abyte1;
        }
        byte abyte2[] = a;
        do
        {
            abyte0 = abyte1;
            if (i >= l)
            {
                continue;
            }
            System.arraycopy(abyte2, j, abyte1, i * k, k);
            j += b;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final byte[] a(int i, byte abyte0[])
    {
        byte abyte1[];
        int j;
label0:
        {
            if (i < 0 || i >= c())
            {
                throw new IllegalArgumentException((new StringBuilder("Requested row is outside the image: ")).append(i).toString());
            }
            j = b();
            if (abyte0 != null)
            {
                abyte1 = abyte0;
                if (abyte0.length >= j)
                {
                    break label0;
                }
            }
            abyte1 = new byte[j];
        }
        int k = e;
        int l = b;
        int i1 = d;
        System.arraycopy(a, (k + i) * l + i1, abyte1, 0, j);
        return abyte1;
    }

    public final Bitmap d()
    {
        int i1 = b();
        int j1 = c();
        int ai[] = new int[i1 * j1];
        byte abyte0[] = a;
        int j = e;
        int k = b;
        int k1 = d;
        int i = 0;
        j = j * k + k1;
        for (; i < j1; i++)
        {
            for (int l = 0; l < i1; l++)
            {
                ai[i * i1 + l] = (abyte0[j + l] & 0xff) * 0x10101 | 0xff000000;
            }

            j += b;
        }

        Bitmap bitmap = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.setPixels(ai, 0, i1, 0, 0, i1, j1);
        return bitmap;
    }
}
