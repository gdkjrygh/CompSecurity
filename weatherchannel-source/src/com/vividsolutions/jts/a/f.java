// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;

public final class f
{

    private int a;
    private Coordinate b;

    public f()
    {
        a = 0;
        b = new Coordinate();
    }

    public final Coordinate a()
    {
        Coordinate coordinate = new Coordinate();
        coordinate.x = b.x / (double)a;
        coordinate.y = b.y / (double)a;
        return coordinate;
    }

    public final void a(i k)
    {
        if (!(k instanceof Point)) goto _L2; else goto _L1
_L1:
        k = k.getCoordinate();
        a = a + 1;
        Coordinate coordinate = b;
        coordinate.x = coordinate.x + ((Coordinate) (k)).x;
        coordinate = b;
        coordinate.y = coordinate.y + ((Coordinate) (k)).y;
_L4:
        return;
_L2:
        if (k instanceof j)
        {
            k = (j)k;
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
}
