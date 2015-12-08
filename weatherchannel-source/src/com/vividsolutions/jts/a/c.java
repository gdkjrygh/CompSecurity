// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.e.a;
import com.vividsolutions.jts.geom.Coordinate;

public class c
{

    private Coordinate a[];
    private Coordinate b;

    public c(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
    {
        b = null;
        a = (new Coordinate[] {
            coordinate, coordinate1, coordinate2, coordinate3
        });
        b = new Coordinate(a(a(a), a));
    }

    private static int a(double d)
    {
        if (d > 0.0D)
        {
            return 1;
        }
        return d >= 0.0D ? 0 : -1;
    }

    public static int a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2)
    {
        double d;
        double d1;
        double d2;
        d = (coordinate.x - coordinate2.x) * (coordinate1.y - coordinate2.y);
        d2 = (coordinate.y - coordinate2.y) * (coordinate1.x - coordinate2.x);
        d1 = d - d2;
        if (d <= 0.0D) goto _L2; else goto _L1
_L1:
        if (d2 > 0.0D) goto _L4; else goto _L3
_L3:
        int i = a(d1);
_L5:
        if (i <= 1)
        {
            return i;
        } else
        {
            a a1 = com.vividsolutions.jts.e.a.a(coordinate1.x).b(-coordinate.x);
            coordinate = com.vividsolutions.jts.e.a.a(coordinate1.y).b(-coordinate.y);
            a a2 = com.vividsolutions.jts.e.a.a(coordinate2.x).b(-coordinate1.x);
            return a1.b(com.vividsolutions.jts.e.a.a(coordinate2.y).b(-coordinate1.y)).a(coordinate.b(a2)).a();
        }
_L4:
        d += d2;
_L6:
        d *= 1.0000000000000001E-15D;
        if (d1 >= d || -d1 >= d)
        {
            i = a(d1);
        } else
        {
            i = 2;
        }
          goto _L5
_L2:
label0:
        {
            if (d >= 0.0D)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            if (d2 < 0.0D)
            {
                break label0;
            }
            i = a(d1);
        }
          goto _L5
        d = -d - d2;
          goto _L6
        i = a(d1);
          goto _L5
    }

    public static Coordinate a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
    {
        return (new c(coordinate, coordinate1, coordinate2, coordinate3)).a();
    }

    private static Coordinate a(Coordinate coordinate, Coordinate acoordinate[])
    {
        double d = 1.7976931348623157E+308D;
        Coordinate coordinate1 = null;
        for (int i = 0; i < acoordinate.length;)
        {
            double d1;
label0:
            {
                double d2 = coordinate.distance(acoordinate[i]);
                if (i != 0)
                {
                    d1 = d;
                    if (d2 >= d)
                    {
                        break label0;
                    }
                }
                coordinate1 = acoordinate[i];
                d1 = d2;
            }
            i++;
            d = d1;
        }

        return coordinate1;
    }

    private static Coordinate a(Coordinate acoordinate[])
    {
        Coordinate coordinate = new Coordinate();
        int j = acoordinate.length;
        for (int i = 0; i < acoordinate.length; i++)
        {
            coordinate.x = coordinate.x + acoordinate[i].x;
            coordinate.y = coordinate.y + acoordinate[i].y;
        }

        if (j > 0)
        {
            coordinate.x = coordinate.x / (double)j;
            coordinate.y = coordinate.y / (double)j;
        }
        return coordinate;
    }

    public Coordinate a()
    {
        return b;
    }
}
