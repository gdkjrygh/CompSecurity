// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.b;
import com.google.zxing.common.d;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.g;
import com.google.zxing.qrcode.decoder.m;
import com.google.zxing.qrcode.decoder.o;
import com.google.zxing.qrcode.detector.c;
import java.util.Map;

public final class a
    implements e
{

    private static final g a[] = new g[0];
    private final m b = new m();

    public a()
    {
    }

    public final f a(b b1, Map map)
    {
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE))
        {
            b1 = b1.c();
            int ai[] = b1.b();
            int ai1[] = b1.c();
            if (ai == null || ai1 == null)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int l = b1.e();
            int j1 = b1.d();
            int j = ai[0];
            int i = ai[1];
            boolean flag = true;
            int k = 0;
            while (j < j1 && i < l) 
            {
                if (flag != b1.a(j, i))
                {
                    k++;
                    if (k == 5)
                    {
                        break;
                    }
                    if (!flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                j++;
                i++;
            }
            if (j == j1 || i == l)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            float f1 = (float)(j - ai[0]) / 7F;
            int j2 = ai[1];
            l = ai1[1];
            k = ai[0];
            j = ai1[0];
            if (k >= j || j2 >= l)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            i = j;
            if (l - j2 != j - k)
            {
                i = (l - j2) + k;
            }
            j1 = Math.round((float)((i - k) + 1) / f1);
            int k1 = Math.round((float)((l - j2) + 1) / f1);
            if (j1 <= 0 || k1 <= 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            if (k1 != j1)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int l1 = (int)(f1 / 2.0F);
            j = j2 + l1;
            k += l1;
            i = ((int)((float)(j1 - 1) * f1) + k) - (i - 1);
            Object obj;
            if (i > 0)
            {
                if (i > l1)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                i = k - i;
            } else
            {
                i = k;
            }
            k = ((int)((float)(k1 - 1) * f1) + j) - (l - 1);
            if (k > 0)
            {
                if (k > l1)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                j -= k;
            }
            obj = new com.google.zxing.common.b(j1, k1);
            for (k = 0; k < k1; k++)
            {
                int i2 = (int)((float)k * f1);
                for (int i1 = 0; i1 < j1; i1++)
                {
                    if (b1.a((int)((float)i1 * f1) + i, j + i2))
                    {
                        ((com.google.zxing.common.b) (obj)).b(i1, k);
                    }
                }

            }

            b1 = b.a(((com.google.zxing.common.b) (obj)), map);
            map = a;
        } else
        {
            obj = (new c(b1.c())).a(map);
            b1 = b.a(((com.google.zxing.common.f) (obj)).d(), map);
            map = ((com.google.zxing.common.f) (obj)).e();
        }
        if (b1.e() instanceof o)
        {
            ((o)b1.e()).a(map);
        }
        map = new f(b1.b(), b1.a(), map, BarcodeFormat.QR_CODE);
        obj = b1.c();
        if (obj != null)
        {
            map.a(ResultMetadataType.BYTE_SEGMENTS, obj);
        }
        b1 = b1.d();
        if (b1 != null)
        {
            map.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, b1);
        }
        return map;
    }

    public final void a()
    {
    }

}
