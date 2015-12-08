// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned:
//            p

public final class q extends p
{

    private static final int a[] = {
        1, 1, 1, 1, 1, 1
    };
    private static final int f[][] = {
        {
            56, 52, 50, 49, 44, 38, 35, 42, 41, 37
        }, {
            7, 11, 13, 14, 19, 25, 28, 21, 22, 26
        }
    };
    private final int g[] = new int[4];

    public q()
    {
    }

    protected final int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[] = g;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int l1 = a1.a();
        int i = ai[1];
        int k = 0;
        int j;
        int j1;
        for (j = 0; k < 6 && i < l1; j = j1)
        {
            int i2 = a(a1, ai1, i, e);
            stringbuilder.append((char)(i2 % 10 + 48));
            int j2 = ai1.length;
            for (int i1 = 0; i1 < j2; i1++)
            {
                i += ai1[i1];
            }

            j1 = j;
            if (i2 >= 10)
            {
                j1 = j | 1 << 5 - k;
            }
            k++;
        }

        for (int l = 0; l <= 1; l++)
        {
            for (int k1 = 0; k1 < 10; k1++)
            {
                if (j == f[l][k1])
                {
                    stringbuilder.insert(0, (char)(l + 48));
                    stringbuilder.append((char)(k1 + 48));
                    return i;
                }
            }

        }

        throw NotFoundException.getNotFoundInstance();
    }

    protected final boolean a(String s)
    {
        char c;
        char ac[];
        StringBuilder stringbuilder;
        ac = new char[6];
        s.getChars(1, 7, ac, 0);
        stringbuilder = new StringBuilder(12);
        stringbuilder.append(s.charAt(0));
        c = ac[5];
        c;
        JVM INSTR tableswitch 48 52: default 76
    //                   48 122
    //                   49 122
    //                   50 122
    //                   51 158
    //                   52 187;
           goto _L1 _L2 _L2 _L2 _L3 _L4
_L1:
        stringbuilder.append(ac, 0, 5);
        stringbuilder.append("0000");
        stringbuilder.append(c);
_L6:
        stringbuilder.append(s.charAt(7));
        return super.a(stringbuilder.toString());
_L2:
        stringbuilder.append(ac, 0, 2);
        stringbuilder.append(c);
        stringbuilder.append("0000");
        stringbuilder.append(ac, 2, 3);
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append(ac, 0, 3);
        stringbuilder.append("00000");
        stringbuilder.append(ac, 3, 2);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(ac, 0, 4);
        stringbuilder.append("00000");
        stringbuilder.append(ac[4]);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final int[] a(a a1, int i)
    {
        return a(a1, i, true, a);
    }

    final BarcodeFormat b()
    {
        return BarcodeFormat.UPC_E;
    }

}
