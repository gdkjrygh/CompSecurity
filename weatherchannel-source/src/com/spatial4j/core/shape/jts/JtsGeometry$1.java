// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.jts;

import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.l;
import com.vividsolutions.jts.geom.n;

// Referenced classes of package com.spatial4j.core.shape.jts:
//            JtsGeometry

static final class a
    implements l
{

    private int a[];

    public final void a(i j)
    {
        if (!(j instanceof n)) goto _L2; else goto _L1
_L1:
        if (j.getEnvelopeInternal().b() >= 180D) goto _L4; else goto _L3
_L3:
        return;
_L4:
        int k = JtsGeometry.a((n)j);
_L6:
        a[0] = Math.max(a[0], k);
        return;
_L2:
        if (!(j instanceof Polygon) || j.getEnvelopeInternal().b() < 180D)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = JtsGeometry.a((Polygon)j);
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L3; else goto _L7
_L7:
    }

    (int ai[])
    {
        a = ai;
        super();
    }
}
