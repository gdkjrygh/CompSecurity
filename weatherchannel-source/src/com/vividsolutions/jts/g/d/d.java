// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.d;

import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;

// Referenced classes of package com.vividsolutions.jts.g.d:
//            a, b, e

public final class d
{

    private Polygon a;
    private h b;

    private d(Polygon polygon)
    {
        a = polygon;
        b = polygon.getEnvelopeInternal();
    }

    public static boolean a(Polygon polygon, i j)
    {
        polygon = new d(polygon);
        if (!((d) (polygon)).b.c(j.getEnvelopeInternal())) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new a(((d) (polygon)).b);
        ((a) (obj)).a(j);
        if (!((a) (obj)).b()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        obj = new b(((d) (polygon)).a);
        ((b) (obj)).a(j);
        if (((b) (obj)).b()) goto _L3; else goto _L5
_L5:
        polygon = new e(((d) (polygon)).a);
        polygon.a(j);
        if (polygon.b()) goto _L3; else goto _L2
_L2:
        return false;
    }
}
