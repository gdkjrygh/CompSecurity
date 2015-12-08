// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;

public final class i
{

    private Coordinate a;
    private double b;
    private Coordinate c;

    public i(com.vividsolutions.jts.geom.i k)
    {
        b = 1.7976931348623157E+308D;
        c = null;
        a = k.getCentroid().getCoordinate();
        a(k);
        if (c == null)
        {
            b(k);
        }
    }

    private void a(Coordinate coordinate)
    {
        double d = coordinate.distance(a);
        if (d < b)
        {
            c = new Coordinate(coordinate);
            b = d;
        }
    }

    private void a(com.vividsolutions.jts.geom.i k)
    {
        if (k instanceof n)
        {
            k = k.getCoordinates();
            for (int l = 1; l < k.length - 1; l++)
            {
                a(k[l]);
            }

        } else
        if (k instanceof j)
        {
            k = (j)k;
            for (int i1 = 0; i1 < k.getNumGeometries(); i1++)
            {
                a(k.getGeometryN(i1));
            }

        }
    }

    private void b(com.vividsolutions.jts.geom.i k)
    {
        int l = 0;
        if (!(k instanceof n)) goto _L2; else goto _L1
_L1:
        k = k.getCoordinates();
        a(k[0]);
        a(k[k.length - 1]);
_L4:
        return;
_L2:
        if (k instanceof j)
        {
            k = (j)k;
            while (l < k.getNumGeometries()) 
            {
                b(k.getGeometryN(l));
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
