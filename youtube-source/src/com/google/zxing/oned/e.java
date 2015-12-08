// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned:
//            p

public final class e extends p
{

    static final int a[] = {
        0, 11, 13, 14, 19, 25, 28, 21, 22, 26
    };
    private final int f[] = new int[4];

    public e()
    {
    }

    protected final int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[];
        int i;
        int j;
        int k;
        int l1;
        ai1 = f;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        l1 = a1.a();
        k = ai[1];
        j = 0;
        int j1;
        for (i = 0; j < 6 && k < l1; i = j1)
        {
            int i2 = a(a1, ai1, k, e);
            stringbuilder.append((char)(i2 % 10 + 48));
            int k2 = ai1.length;
            for (int i1 = 0; i1 < k2; i1++)
            {
                k += ai1[i1];
            }

            j1 = i;
            if (i2 >= 10)
            {
                j1 = i | 1 << 5 - j;
            }
            j++;
        }

        j = 0;
_L8:
        if (j >= 10) goto _L2; else goto _L1
_L1:
        if (i != a[j]) goto _L4; else goto _L3
_L3:
        stringbuilder.insert(0, (char)(j + 48));
        j = a(a1, k, true, c)[1];
        i = 0;
_L6:
        if (i >= 6 || j >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append((char)(a(a1, ai1, j, d) + 48));
        int k1 = ai1.length;
        for (int l = 0; l < k1;)
        {
            int j2 = ai1[l];
            l++;
            j = j2 + j;
        }

        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        throw NotFoundException.getNotFoundInstance();
        if (true) goto _L6; else goto _L5
_L5:
        return j;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final BarcodeFormat b()
    {
        return BarcodeFormat.EAN_13;
    }

}
