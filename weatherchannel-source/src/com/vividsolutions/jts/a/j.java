// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.i;

public final class j
{

    private Coordinate a;
    private double b;
    private Coordinate c;

    public j(i k)
    {
        b = 1.7976931348623157E+308D;
        c = null;
        a = k.getCentroid().getCoordinate();
        a(k);
    }

    private void a(i k)
    {
        if (!(k instanceof Point)) goto _L2; else goto _L1
_L1:
        k = k.getCoordinate();
        double d = k.distance(a);
        if (d < b)
        {
            c = new Coordinate(k);
            b = d;
        }
_L4:
        return;
_L2:
        if (k instanceof com.vividsolutions.jts.geom.j)
        {
            k = (com.vividsolutions.jts.geom.j)k;
            int l = 0;
            while (l < k.getNumGeometries()) 
            {
                a(k.getGeometryN(l));
                l++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Coordinate a()
    {
        return c;
    }
}
