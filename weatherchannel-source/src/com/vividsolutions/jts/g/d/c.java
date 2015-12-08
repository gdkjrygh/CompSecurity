// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.d;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.n;

public final class c
{

    private h a;

    public c(Polygon polygon)
    {
        a = polygon.getEnvelopeInternal();
    }

    private boolean a(Coordinate coordinate)
    {
        return coordinate.x == a.d() || coordinate.x == a.e() || coordinate.y == a.f() || coordinate.y == a.g();
    }

    private boolean b(i j)
    {
        if (!(j instanceof Polygon)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Coordinate coordinate;
        Coordinate coordinate1;
        int k;
        if (j instanceof Point)
        {
            return a(((Point)j).getCoordinate());
        }
        if (!(j instanceof n))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        j = ((n)j).a();
        coordinate = new Coordinate();
        coordinate1 = new Coordinate();
        k = 0;
_L4:
        boolean flag;
        if (k >= j.b() - 1)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        j.a(k, coordinate);
        j.a(k + 1, coordinate1);
        if (!coordinate.equals(coordinate1))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = a(coordinate);
_L5:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        if (coordinate.x == coordinate1.x)
        {
            if (coordinate.x != a.d() && coordinate.x != a.e())
            {
                break MISSING_BLOCK_LABEL_220;
            }
            flag = true;
        } else
        {
            if (coordinate.y != coordinate1.y || coordinate.y != a.f() && coordinate.y != a.g())
            {
                break MISSING_BLOCK_LABEL_220;
            }
            flag = true;
        }
          goto _L5
        flag = false;
          goto _L5
        return true;
        int l = 0;
label0:
        do
        {
label1:
            {
                if (l >= j.getNumGeometries())
                {
                    break label1;
                }
                if (!b(j.getGeometryN(l)))
                {
                    break label0;
                }
                l++;
            }
        } while (true);
        if (true) goto _L1; else goto _L6
_L6:
        return true;
    }

    public final boolean a(i j)
    {
        while (!a.d(j.getEnvelopeInternal()) || b(j)) 
        {
            return false;
        }
        return true;
    }
}
