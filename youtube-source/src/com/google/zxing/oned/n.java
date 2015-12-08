// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.a;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            p

final class n
{

    private static final int a[] = {
        24, 20, 18, 17, 12, 6, 3, 10, 9, 5
    };
    private final int b[] = new int[4];
    private final StringBuilder c = new StringBuilder();

    n()
    {
    }

    final f a(int i, a a1, int ai[])
    {
        String s1;
        int j;
        StringBuilder stringbuilder;
        int i2;
        int l2;
        int i3;
label0:
        {
            stringbuilder = c;
            stringbuilder.setLength(0);
            int ai1[] = b;
            ai1[0] = 0;
            ai1[1] = 0;
            ai1[2] = 0;
            ai1[3] = 0;
            i3 = a1.a();
            j = ai[1];
            int k = 0;
            int l1;
            for (int k2 = 0; k2 < 5 && j < i3; j = l1)
            {
                int j3 = com.google.zxing.oned.p.a(a1, ai1, j, p.e);
                stringbuilder.append((char)(j3 % 10 + 48));
                int k3 = ai1.length;
                for (int k1 = 0; k1 < k3;)
                {
                    int l3 = ai1[k1];
                    k1++;
                    j = l3 + j;
                }

                if (j3 >= 10)
                {
                    k = 1 << 4 - k2 | k;
                }
                l1 = j;
                if (k2 != 4)
                {
                    l1 = a1.d(a1.c(j));
                }
                k2++;
            }

            if (stringbuilder.length() != 5)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            i2 = 0;
            do
            {
                if (i2 >= 10)
                {
                    break;
                }
                if (k == a[i2])
                {
                    a1 = stringbuilder.toString();
                    i3 = a1.length();
                    l2 = 0;
                    for (int l = i3 - 2; l >= 0; l -= 2)
                    {
                        l2 += a1.charAt(l) - 48;
                    }

                    break label0;
                }
                i2++;
            } while (true);
            throw NotFoundException.getNotFoundInstance();
        }
        l2 *= 3;
        for (int i1 = i3 - 1; i1 >= 0; i1 -= 2)
        {
            l2 += a1.charAt(i1) - 48;
        }

        if ((l2 * 3) % 10 != i2)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        s1 = stringbuilder.toString();
        if (s1.length() == 5) goto _L2; else goto _L1
_L1:
        a1 = null;
_L7:
        ai = new g((float)(ai[0] + ai[1]) / 2.0F, i);
        g g1 = new g(j, i);
        BarcodeFormat barcodeformat = BarcodeFormat.UPC_EAN_EXTENSION;
        ai = new f(s1, null, new g[] {
            ai, g1
        }, barcodeformat);
        if (a1 != null)
        {
            ai.a(a1);
        }
        return ai;
_L2:
        s1.charAt(0);
        JVM INSTR lookupswitch 3: default 480
    //                   48: 576
    //                   53: 582
    //                   57: 588;
           goto _L3 _L4 _L5 _L6
_L3:
        a1 = "";
_L8:
        int j2 = Integer.parseInt(s1.substring(1));
        int j1 = j2 / 100;
        j2 %= 100;
        String s;
        if (j2 < 10)
        {
            s = (new StringBuilder("0")).append(j2).toString();
        } else
        {
            s = String.valueOf(j2);
        }
        a1 = (new StringBuilder()).append(a1).append(String.valueOf(j1)).append('.').append(s).toString();
_L9:
        if (a1 == null)
        {
            a1 = null;
        } else
        {
            EnumMap enummap = new EnumMap(com/google/zxing/ResultMetadataType);
            enummap.put(ResultMetadataType.SUGGESTED_PRICE, a1);
            a1 = enummap;
        }
          goto _L7
_L4:
        a1 = "\243";
          goto _L8
_L5:
        a1 = "$";
          goto _L8
_L6:
        if ("90000".equals(s1))
        {
            a1 = null;
        } else
        if ("99991".equals(s1))
        {
            a1 = "0.00";
        } else
        {
label1:
            {
                if (!"99990".equals(s1))
                {
                    break label1;
                }
                a1 = "Used";
            }
        }
          goto _L9
        a1 = "";
          goto _L8
    }

}
