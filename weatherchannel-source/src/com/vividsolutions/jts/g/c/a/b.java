// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c.a;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.c;
import com.vividsolutions.jts.geom.m;

public final class b
{

    private double a;
    private Coordinate b[];
    private m c;
    private boolean d;
    private boolean e;

    public b(Coordinate acoordinate[], double d1)
    {
        boolean flag = false;
        super();
        a = 0.0D;
        c = new m();
        d = false;
        e = false;
        b = acoordinate;
        if (acoordinate.length > 1)
        {
            flag = acoordinate[0].equals2D(acoordinate[acoordinate.length - 1]);
        }
        e = flag;
        a = d1;
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public final Coordinate[] a(Coordinate acoordinate[])
    {
        Coordinate coordinate;
        c c1;
        int i1;
        c1 = new c(b);
        int i;
        int k;
        if (e)
        {
            i = c1.size() - 1;
        } else
        {
            i = c1.size();
        }
        k = 0;
_L9:
        if (k >= i)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        coordinate = (Coordinate)c1.get(k);
        i1 = 0;
_L3:
        if (i1 >= acoordinate.length || coordinate.equals2D(acoordinate[i1]))
        {
            break MISSING_BLOCK_LABEL_180;
        }
        if (coordinate.distance(acoordinate[i1]) >= a) goto _L2; else goto _L1
_L1:
        coordinate = acoordinate[i1];
_L4:
        if (coordinate != null)
        {
            c1.set(k, new Coordinate(coordinate));
            if (k == 0 && e)
            {
                c1.set(c1.size() - 1, new Coordinate(coordinate));
            }
        }
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        i1++;
          goto _L3
        coordinate = null;
          goto _L4
        int j1;
        if (acoordinate.length == 0)
        {
            break MISSING_BLOCK_LABEL_452;
        }
        i1 = acoordinate.length;
        if (acoordinate[0].equals2D(acoordinate[acoordinate.length - 1]))
        {
            i1 = acoordinate.length - 1;
        }
        j1 = 0;
_L6:
        double d1;
        int j;
        int l;
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_452;
        }
        coordinate = acoordinate[j1];
        d1 = 1.7976931348623157E+308D;
        l = -1;
        j = 0;
_L7:
        double d2;
        int k1;
label0:
        {
            k1 = l;
            if (j < c1.size() - 1)
            {
                c.a = (Coordinate)c1.get(j);
                c.b = (Coordinate)c1.get(j + 1);
                if (!c.a.equals2D(coordinate) && !c.b.equals2D(coordinate))
                {
                    break label0;
                }
                d2 = d1;
                k1 = l;
                if (d)
                {
                    break MISSING_BLOCK_LABEL_436;
                }
                k1 = -1;
            }
            if (k1 >= 0)
            {
                c1.a(k1 + 1, new Coordinate(coordinate), false);
            }
            j1++;
        }
        if (true) goto _L6; else goto _L5
_L5:
        m m1 = c;
        double d3 = com.vividsolutions.jts.a.a.b(coordinate, m1.a, m1.b);
        d2 = d1;
        k1 = l;
        if (d3 < a)
        {
            d2 = d1;
            k1 = l;
            if (d3 < d1)
            {
                d2 = d3;
                k1 = j;
            }
        }
        j++;
        d1 = d2;
        l = k1;
          goto _L7
        return c1.a();
        if (true) goto _L9; else goto _L8
_L8:
    }
}
