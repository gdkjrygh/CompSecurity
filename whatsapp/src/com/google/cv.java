// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google:
//            cB, cX, fw, bE, 
//            dO, fU, g1, c6, 
//            fG, S, bC, dH, 
//            gV, gh, by

public final class cv
    implements cB, cX
{

    public cv()
    {
    }

    private static int a(fw fw1, fw fw2)
    {
        if (fw1 == null || fw2 == null)
        {
            return 0;
        } else
        {
            return (int)Math.abs(fw1.a() - fw2.a());
        }
    }

    private static int a(fw afw[])
    {
        return Math.max(Math.max(a(afw[0], afw[4]), (a(afw[6], afw[2]) * 17) / 18), Math.max(a(afw[1], afw[5]), (a(afw[7], afw[3]) * 17) / 18));
    }

    private static c6[] a(by by, Map map, boolean flag)
    {
        int i = bE.a;
        ArrayList arraylist = new ArrayList();
        by = dO.a(by, map, flag);
        map = by.a().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            fw afw[] = (fw[])map.next();
            Object obj = g1.a(by.b(), afw[4], afw[5], afw[6], afw[7], b(afw), a(afw));
            c6 c6_1 = new c6(((fG) (obj)).g(), ((fG) (obj)).b(), afw, S.PDF_417);
            c6_1.a(bC.ERROR_CORRECTION_LEVEL, ((fG) (obj)).a());
            obj = (dH)((fG) (obj)).e();
            if (obj != null)
            {
                c6_1.a(bC.PDF417_EXTRA_METADATA, obj);
            }
            arraylist.add(c6_1);
        } while (i == 0);
        return (c6[])arraylist.toArray(new c6[arraylist.size()]);
    }

    private static int b(fw fw1, fw fw2)
    {
        if (fw1 == null || fw2 == null)
        {
            return 0x7fffffff;
        } else
        {
            return (int)Math.abs(fw1.a() - fw2.a());
        }
    }

    private static int b(fw afw[])
    {
        return Math.min(Math.min(b(afw[0], afw[4]), (b(afw[6], afw[2]) * 17) / 18), Math.min(b(afw[1], afw[5]), (b(afw[7], afw[3]) * 17) / 18));
    }

    public c6 a(by by, Map map)
    {
        int i = bE.a;
        by = a(by, map, false);
        if (by == null || by.length == 0 || by[0] == null)
        {
            throw gV.a();
        }
        by = by[0];
        if (i != 0)
        {
            gh.a++;
        }
        return by;
    }

    public void a()
    {
    }
}
