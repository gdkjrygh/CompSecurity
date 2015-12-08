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

final class m
{

    private final int a[] = new int[4];
    private final StringBuilder b = new StringBuilder();

    m()
    {
    }

    final f a(int i, a a1, int ai[])
    {
        Object obj = b;
        ((StringBuilder) (obj)).setLength(0);
        int ai1[] = a;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int k1 = a1.a();
        int j = ai[1];
        int k = 0;
        for (int l = 0; l < 2 && j < k1;)
        {
            int l1 = com.google.zxing.oned.p.a(a1, ai1, j, p.e);
            ((StringBuilder) (obj)).append((char)(l1 % 10 + 48));
            int i2 = ai1.length;
            for (int i1 = 0; i1 < i2;)
            {
                int j2 = ai1[i1];
                i1++;
                j = j2 + j;
            }

            int j1 = k;
            if (l1 >= 10)
            {
                j1 = k | 1 << 1 - l;
            }
            k = j;
            if (l != 1)
            {
                k = a1.d(a1.c(j));
            }
            l++;
            j = k;
            k = j1;
        }

        if (((StringBuilder) (obj)).length() != 2)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(((StringBuilder) (obj)).toString()) % 4 != k)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        obj = ((StringBuilder) (obj)).toString();
        g g1;
        BarcodeFormat barcodeformat;
        if (((String) (obj)).length() != 2)
        {
            a1 = null;
        } else
        {
            a1 = new EnumMap(com/google/zxing/ResultMetadataType);
            a1.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(((String) (obj))));
        }
        ai = new g((float)(ai[0] + ai[1]) / 2.0F, i);
        g1 = new g(j, i);
        barcodeformat = BarcodeFormat.UPC_EAN_EXTENSION;
        ai = new f(((String) (obj)), null, new g[] {
            ai, g1
        }, barcodeformat);
        if (a1 != null)
        {
            ai.a(a1);
        }
        return ai;
    }
}
