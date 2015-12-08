// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.d;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.g;
import com.google.zxing.pdf417.a.a;
import com.google.zxing.pdf417.decoder.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.pdf417:
//            c

public final class b
    implements e
{

    public b()
    {
    }

    private static int a(g g1, g g2)
    {
        if (g1 == null || g2 == null)
        {
            return 0;
        } else
        {
            return (int)Math.abs(g1.a() - g2.a());
        }
    }

    private static int b(g g1, g g2)
    {
        if (g1 == null || g2 == null)
        {
            return 0x7fffffff;
        } else
        {
            return (int)Math.abs(g1.a() - g2.a());
        }
    }

    public final f a(com.google.zxing.b b1, Map map)
    {
        map = new ArrayList();
        b1 = com.google.zxing.pdf417.a.a.a(b1, false);
        f f1;
        for (Iterator iterator = b1.b().iterator(); iterator.hasNext(); map.add(f1))
        {
            g ag[] = (g[])iterator.next();
            Object obj = j.a(b1.a(), ag[4], ag[5], ag[6], ag[7], Math.min(Math.min(b(ag[0], ag[4]), (b(ag[6], ag[2]) * 17) / 18), Math.min(b(ag[1], ag[5]), (b(ag[7], ag[3]) * 17) / 18)), Math.max(Math.max(a(ag[0], ag[4]), (a(ag[6], ag[2]) * 17) / 18), Math.max(a(ag[1], ag[5]), (a(ag[7], ag[3]) * 17) / 18)));
            if (obj == null)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            f1 = new f(((d) (obj)).b(), ((d) (obj)).a(), ag, BarcodeFormat.PDF_417);
            f1.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, ((d) (obj)).d());
            obj = (c)((d) (obj)).e();
            if (obj != null)
            {
                f1.a(ResultMetadataType.PDF417_EXTRA_METADATA, obj);
            }
        }

        b1 = (f[])map.toArray(new f[map.size()]);
        if (b1 == null || b1.length == 0 || b1[0] == null)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return b1[0];
        }
    }

    public final void a()
    {
    }
}
