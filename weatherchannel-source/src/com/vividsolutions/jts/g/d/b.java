// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.d;

import com.vividsolutions.jts.a.a.c;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.c.k;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.n;

final class b extends k
{

    private d a;
    private h b;
    private boolean c;

    public b(Polygon polygon)
    {
        c = false;
        a = polygon.getExteriorRing().a();
        b = polygon.getEnvelopeInternal();
    }

    protected final boolean a()
    {
        return c;
    }

    protected final void b(i j)
    {
        if (j instanceof Polygon) goto _L2; else goto _L1
_L1:
        h h1;
        return;
_L2:
        if (b.c(h1 = j.getEnvelopeInternal()))
        {
            Coordinate coordinate = new Coordinate();
            int l = 0;
            while (l < 4) 
            {
                a.a(l, coordinate);
                if (h1.c(coordinate) && com.vividsolutions.jts.a.a.c.a(coordinate, (Polygon)j))
                {
                    c = true;
                    return;
                }
                l++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return c;
    }
}
