// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a.a;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.k;
import com.vividsolutions.jts.geom.p;
import java.util.Iterator;

// Referenced classes of package com.vividsolutions.jts.a.a:
//            b

public final class c
    implements b
{

    private i a;

    public c(i l)
    {
        a = l;
    }

    public static int a(Coordinate coordinate, i l)
    {
        while (l.isEmpty() || !b(coordinate, l)) 
        {
            return 2;
        }
        return 0;
    }

    public static boolean a(Coordinate coordinate, Polygon polygon)
    {
_L2:
        return false;
        if (polygon.isEmpty() || !a(coordinate, (p)polygon.getExteriorRing())) goto _L2; else goto _L1
_L1:
        int l = 0;
label0:
        do
        {
label1:
            {
                if (l >= polygon.getNumInteriorRing())
                {
                    break label1;
                }
                if (a(coordinate, (p)polygon.getInteriorRingN(l)))
                {
                    break label0;
                }
                l++;
            }
        } while (true);
        if (true) goto _L2; else goto _L3
_L3:
        return true;
    }

    private static boolean a(Coordinate coordinate, p p1)
    {
        if (!p1.getEnvelopeInternal().b(coordinate))
        {
            return false;
        } else
        {
            return com.vividsolutions.jts.a.a.a(coordinate, p1.getCoordinates());
        }
    }

    private static boolean b(Coordinate coordinate, i l)
    {
label0:
        {
            if (l instanceof Polygon)
            {
                return a(coordinate, (Polygon)l);
            }
            if (!(l instanceof j))
            {
                break label0;
            }
            k k1 = new k((j)l);
            i i1;
            do
            {
                if (!k1.hasNext())
                {
                    break label0;
                }
                i1 = (i)k1.next();
            } while (i1 == l || !b(coordinate, i1));
            return true;
        }
        return false;
    }

    public final int a(Coordinate coordinate)
    {
        return a(coordinate, a);
    }
}
