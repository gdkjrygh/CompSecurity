// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.a;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.a.a.c;
import com.google.zxing.b;
import com.google.zxing.common.d;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.Map;

public final class a
    implements e
{

    private static final g a[] = new g[0];
    private final c b = new c();

    public a()
    {
    }

    public final f a(b b1, Map map)
    {
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE))
        {
            b1 = b1.c();
            map = b1.a();
            if (map == null)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int k = map[0];
            int l = map[1];
            int i1 = map[2];
            int j1 = map[3];
            map = new com.google.zxing.common.b(30, 33);
            for (int i = 0; i < 33; i++)
            {
                int k1 = (i * j1 + j1 / 2) / 33;
                for (int j = 0; j < 30; j++)
                {
                    if (b1.a((j * i1 + i1 / 2 + ((i & 1) * i1) / 2) / 30 + k, l + k1))
                    {
                        map.b(j, i);
                    }
                }

            }

            b1 = b.a(map);
            map = a;
            map = new f(b1.b(), b1.a(), map, BarcodeFormat.MAXICODE);
            b1 = b1.d();
            if (b1 != null)
            {
                map.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, b1);
            }
            return map;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public final void a()
    {
    }

}
