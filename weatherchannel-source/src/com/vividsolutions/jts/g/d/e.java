// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.d;

import com.vividsolutions.jts.a.q;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.c.k;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.n;
import java.util.Iterator;
import java.util.List;

final class e extends k
{

    private h a;
    private q b;
    private boolean c;
    private Coordinate d;
    private Coordinate e;

    public e(Polygon polygon)
    {
        c = false;
        d = new Coordinate();
        e = new Coordinate();
        a = polygon.getEnvelopeInternal();
        b = new q(a);
    }

    protected final boolean a()
    {
        return c;
    }

    protected final void b(i j)
    {
        Object obj = j.getEnvelopeInternal();
        if (a.c(((h) (obj)))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        j = com.vividsolutions.jts.geom.c.h.b(j).iterator();
_L5:
        int l;
        if (!j.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((n)j.next()).a();
        l = 1;
_L6:
        if (l >= ((d) (obj)).b())
        {
            continue; /* Loop/switch isn't completed */
        }
        ((d) (obj)).a(l - 1, d);
        ((d) (obj)).a(l, e);
        if (!b.a(d, e)) goto _L4; else goto _L3
_L3:
        c = true;
        if (c) goto _L1; else goto _L5
_L4:
        l++;
          goto _L6
    }

    public final boolean b()
    {
        return c;
    }
}
