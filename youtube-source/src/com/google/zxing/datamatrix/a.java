// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.b;
import com.google.zxing.datamatrix.decoder.d;
import com.google.zxing.datamatrix.detector.Detector;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.Map;

public final class a
    implements e
{

    private static final g a[] = new g[0];
    private final d b = new d();

    public a()
    {
    }

    public final f a(b b1, Map map)
    {
        java.util.List list;
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE))
        {
            b1 = b1.c();
            map = b1.b();
            int ai[] = b1.c();
            if (map == null || ai == null)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int k = b1.d();
            int i = map[0];
            for (int i1 = map[1]; i < k && b1.a(i, i1); i++) { }
            if (i == k)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int j1 = i - map[0];
            if (j1 == 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int k1 = map[1];
            i = ai[1];
            int l1 = map[0];
            int i2 = ((ai[0] - l1) + 1) / j1;
            int j2 = ((i - k1) + 1) / j1;
            if (i2 <= 0 || j2 <= 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int k2 = j1 >> 1;
            map = new com.google.zxing.common.b(i2, j2);
            for (int j = 0; j < j2; j++)
            {
                for (int l = 0; l < i2; l++)
                {
                    if (b1.a(l * j1 + (k2 + l1), k1 + k2 + j * j1))
                    {
                        map.b(l, j);
                    }
                }

            }

            b1 = b.a(map);
            map = a;
        } else
        {
            map = (new Detector(b1.c())).a();
            b1 = b.a(map.d());
            map = map.e();
        }
        map = new f(b1.b(), b1.a(), map, BarcodeFormat.DATA_MATRIX);
        list = b1.c();
        if (list != null)
        {
            map.a(ResultMetadataType.BYTE_SEGMENTS, list);
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
