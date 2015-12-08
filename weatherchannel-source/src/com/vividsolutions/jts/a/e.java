// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;

public final class e
{

    private Coordinate a;
    private double b;

    public e()
    {
        a = new Coordinate();
        b = 0.0D;
    }

    private void a(Coordinate acoordinate[])
    {
        for (int k = 0; k < acoordinate.length - 1; k++)
        {
            double d = acoordinate[k].distance(acoordinate[k + 1]);
            b = b + d;
            double d1 = (acoordinate[k].x + acoordinate[k + 1].x) / 2D;
            Coordinate coordinate = a;
            coordinate.x = d1 * d + coordinate.x;
            d1 = (acoordinate[k].y + acoordinate[k + 1].y) / 2D;
            coordinate = a;
            coordinate.y = d * d1 + coordinate.y;
        }

    }

    public final Coordinate a()
    {
        Coordinate coordinate = new Coordinate();
        coordinate.x = a.x / b;
        coordinate.y = a.y / b;
        return coordinate;
    }

    public final void a(i k)
    {
        int l;
        boolean flag;
        flag = false;
        l = 0;
        if (!(k instanceof n)) goto _L2; else goto _L1
_L1:
        a(k.getCoordinates());
_L4:
        return;
_L2:
        if (!(k instanceof Polygon))
        {
            break; /* Loop/switch isn't completed */
        }
        k = (Polygon)k;
        a(k.getExteriorRing().getCoordinates());
        while (l < k.getNumInteriorRing()) 
        {
            a(k.getInteriorRingN(l).getCoordinates());
            l++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (k instanceof j)
        {
            k = (j)k;
            int i1 = ((flag) ? 1 : 0);
            while (i1 < k.getNumGeometries()) 
            {
                a(k.getGeometryN(i1));
                i1++;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
