// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;

// Referenced classes of package com.vividsolutions.jts.a:
//            a

public final class d
{

    private Coordinate a;
    private Coordinate b;
    private double c;
    private Coordinate d;
    private Coordinate e;
    private double f;

    public d()
    {
        a = null;
        b = new Coordinate();
        c = 0.0D;
        d = new Coordinate();
        e = new Coordinate();
        f = 0.0D;
        a = null;
    }

    private void a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, boolean flag)
    {
        double d1;
        double d2;
        Coordinate coordinate3;
        if (flag)
        {
            d1 = 1.0D;
        } else
        {
            d1 = -1D;
        }
        coordinate3 = b;
        coordinate3.x = coordinate.x + coordinate1.x + coordinate2.x;
        coordinate3.y = coordinate.y + coordinate1.y + coordinate2.y;
        d2 = (coordinate1.x - coordinate.x) * (coordinate2.y - coordinate.y) - (coordinate2.x - coordinate.x) * (coordinate1.y - coordinate.y);
        coordinate = d;
        coordinate.x = coordinate.x + d1 * d2 * b.x;
        coordinate = d;
        coordinate.y = coordinate.y + d1 * d2 * b.y;
        c = d1 * d2 + c;
    }

    private void a(Coordinate acoordinate[])
    {
        for (int i = 0; i < acoordinate.length - 1; i++)
        {
            double d1 = acoordinate[i].distance(acoordinate[i + 1]);
            f = f + d1;
            double d2 = (acoordinate[i].x + acoordinate[i + 1].x) / 2D;
            Coordinate coordinate = e;
            coordinate.x = d2 * d1 + coordinate.x;
            d2 = (acoordinate[i].y + acoordinate[i + 1].y) / 2D;
            coordinate = e;
            coordinate.y = d1 * d2 + coordinate.y;
        }

    }

    public final Coordinate a()
    {
        Coordinate coordinate = new Coordinate();
        if (Math.abs(c) > 0.0D)
        {
            coordinate.x = d.x / 3D / c;
            coordinate.y = d.y / 3D / c;
            return coordinate;
        } else
        {
            coordinate.x = e.x / f;
            coordinate.y = e.y / f;
            return coordinate;
        }
    }

    public final void a(i i)
    {
        int k = 0;
        if (i instanceof Polygon)
        {
            i = (Polygon)i;
            Coordinate coordinate = i.getExteriorRing().a(0);
            if (a == null)
            {
                a = coordinate;
            }
            Coordinate acoordinate[] = i.getExteriorRing().getCoordinates();
            boolean flag;
            if (!com.vividsolutions.jts.a.a.a(acoordinate))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for (k = 0; k < acoordinate.length - 1; k++)
            {
                a(a, acoordinate[k], acoordinate[k + 1], flag);
            }

            a(acoordinate);
            for (k = 0; k < i.getNumInteriorRing(); k++)
            {
                Coordinate acoordinate1[] = i.getInteriorRingN(k).getCoordinates();
                boolean flag1 = com.vividsolutions.jts.a.a.a(acoordinate1);
                for (int l = 0; l < acoordinate1.length - 1; l++)
                {
                    a(a, acoordinate1[l], acoordinate1[l + 1], flag1);
                }

                a(acoordinate1);
            }

        } else
        if (i instanceof j)
        {
            for (i = (j)i; k < i.getNumGeometries(); k++)
            {
                a(i.getGeometryN(k));
            }

        }
    }
}
