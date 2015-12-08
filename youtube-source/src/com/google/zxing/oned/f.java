// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned:
//            p

public final class f extends p
{

    private final int a[] = new int[4];

    public f()
    {
    }

    protected final int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[] = a;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int k1 = a1.a();
        int i = ai[1];
        for (int k = 0; k < 4 && i < k1; k++)
        {
            stringbuilder.append((char)(a(a1, ai1, i, d) + 48));
            int l1 = ai1.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                i += ai1[i1];
            }

        }

        int l = a(a1, i, true, c)[1];
        for (int j = 0; j < 4 && l < k1; j++)
        {
            stringbuilder.append((char)(a(a1, ai1, l, d) + 48));
            int i2 = ai1.length;
            for (int j1 = 0; j1 < i2;)
            {
                int j2 = ai1[j1];
                j1++;
                l = j2 + l;
            }

        }

        return l;
    }

    final BarcodeFormat b()
    {
        return BarcodeFormat.EAN_8;
    }
}
