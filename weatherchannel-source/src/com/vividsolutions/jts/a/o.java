// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.k;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.s;
import java.util.Iterator;

// Referenced classes of package com.vividsolutions.jts.a:
//            b, r, k, a

public final class o
{

    private b a;
    private boolean b;
    private int c;

    public o()
    {
        a = b.b;
    }

    private int a(Coordinate coordinate, Polygon polygon)
    {
        boolean flag = false;
        if (!polygon.isEmpty()) goto _L2; else goto _L1
_L1:
        int i1 = 2;
_L4:
        return i1;
_L2:
        int l = a(coordinate, (p)polygon.getExteriorRing());
        if (l == 2)
        {
            return 2;
        }
        if (l == 1)
        {
            return 1;
        }
        l = 0;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (l >= polygon.getNumInteriorRing())
            {
                continue;
            }
            i1 = a(coordinate, (p)polygon.getInteriorRingN(l));
            if (i1 == 0)
            {
                return 2;
            }
            if (i1 == 1)
            {
                return 1;
            }
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static int a(Coordinate coordinate, n n1)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        if (n1.getEnvelopeInternal().b(coordinate)) goto _L2; else goto _L1
_L1:
        int l = 2;
_L4:
        return l;
_L2:
        Coordinate acoordinate[];
        acoordinate = n1.getCoordinates();
        if (n1.d())
        {
            break; /* Loop/switch isn't completed */
        }
        l = ((flag1) ? 1 : 0);
        if (coordinate.equals(acoordinate[0])) goto _L4; else goto _L3
_L3:
        l = ((flag1) ? 1 : 0);
        if (coordinate.equals(acoordinate[acoordinate.length - 1])) goto _L4; else goto _L5
_L5:
        n1 = new r();
        l = 1;
_L8:
        if (l >= acoordinate.length)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        n1.a(coordinate, acoordinate[l - 1], acoordinate[l]);
        if (!n1.a()) goto _L7; else goto _L6
_L6:
        l = ((flag) ? 1 : 0);
_L9:
        return l == 0 ? 2 : 0;
_L7:
        l++;
          goto _L8
        l = 0;
          goto _L9
    }

    private static int a(Coordinate coordinate, p p1)
    {
        if (!p1.getEnvelopeInternal().b(coordinate))
        {
            return 2;
        } else
        {
            return com.vividsolutions.jts.a.a.b(coordinate, p1.getCoordinates());
        }
    }

    private void a(int l)
    {
        if (l == 0)
        {
            b = true;
        }
        if (l == 1)
        {
            c = c + 1;
        }
    }

    private void c(Coordinate coordinate, i l)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (l instanceof Point)
        {
            int j1;
            if (((Point)l).getCoordinate().equals2D(coordinate))
            {
                j1 = 0;
            } else
            {
                j1 = 2;
            }
            a(j1);
        }
        if (!(l instanceof n)) goto _L2; else goto _L1
_L1:
        a(a(coordinate, (n)l));
_L4:
        return;
_L2:
        if (l instanceof Polygon)
        {
            a(a(coordinate, (Polygon)l));
            return;
        }
        if (!(l instanceof q))
        {
            break; /* Loop/switch isn't completed */
        }
        l = (q)l;
        int l1 = ((flag) ? 1 : 0);
        while (l1 < l.getNumGeometries()) 
        {
            a(a(coordinate, (n)l.getGeometryN(l1)));
            l1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(l instanceof s))
        {
            break; /* Loop/switch isn't completed */
        }
        l = (s)l;
        int i2 = ((flag1) ? 1 : 0);
        while (i2 < l.getNumGeometries()) 
        {
            a(a(coordinate, (Polygon)l.getGeometryN(i2)));
            i2++;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (l instanceof j)
        {
            k k1 = new k((j)l);
            while (k1.hasNext()) 
            {
                i i1 = (i)k1.next();
                if (i1 != l)
                {
                    c(coordinate, i1);
                }
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final boolean a(Coordinate coordinate, i l)
    {
        return b(coordinate, l) != 2;
    }

    public final int b(Coordinate coordinate, i l)
    {
        if (!l.isEmpty())
        {
            if (l instanceof n)
            {
                return a(coordinate, (n)l);
            }
            if (l instanceof Polygon)
            {
                return a(coordinate, (Polygon)l);
            }
            b = false;
            c = 0;
            c(coordinate, l);
            if (a.a(c))
            {
                return 1;
            }
            if (c > 0 || b)
            {
                return 0;
            }
        }
        return 2;
    }
}
