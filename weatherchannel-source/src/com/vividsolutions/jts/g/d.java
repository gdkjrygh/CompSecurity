// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g;

import com.vividsolutions.jts.b.a.e;
import com.vividsolutions.jts.b.g;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.c.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class d
{
    static final class a
    {

        Coordinate a;
        boolean b;
        int c;

        public a(Coordinate coordinate)
        {
            a = coordinate;
            b = false;
            c = 0;
        }
    }


    private i a;
    private boolean b;

    public d()
    {
        b = true;
    }

    public d(i k)
    {
        b = true;
        a = k;
    }

    private static void a(Map map, Coordinate coordinate, boolean flag)
    {
        a a2 = (a)map.get(coordinate);
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a(coordinate);
            map.put(coordinate, a1);
        }
        a1.c = a1.c + 1;
        a1.b = a1.b | flag;
    }

    private boolean a(i k)
    {
        boolean flag1 = false;
        if (!k.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        if (k instanceof n)
        {
            return d(k);
        }
        if (k instanceof q)
        {
            return d(k);
        }
        if (!(k instanceof r))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        k = (r)k;
        if (k.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        TreeSet treeset = new TreeSet();
        int i1 = 0;
        do
        {
            if (i1 >= k.getNumGeometries())
            {
                break; /* Loop/switch isn't completed */
            }
            Coordinate coordinate = ((Point)k.getGeometryN(i1)).getCoordinate();
            flag = flag1;
            if (treeset.contains(coordinate))
            {
                continue; /* Loop/switch isn't completed */
            }
            treeset.add(coordinate);
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return true;
        if (k instanceof t)
        {
            return b(k);
        }
        if (k instanceof j)
        {
            return c(k);
        } else
        {
            return true;
        }
    }

    private boolean b(i k)
    {
        for (k = h.b(k).iterator(); k.hasNext();)
        {
            if (!d((p)k.next()))
            {
                return false;
            }
        }

        return true;
    }

    private boolean c(i k)
    {
        for (int i1 = 0; i1 < k.getNumGeometries(); i1++)
        {
            if (!a(k.getGeometryN(i1)))
            {
                return false;
            }
        }

        return true;
    }

    private boolean d(i k)
    {
        Object obj;
        if (k.isEmpty())
        {
            return true;
        }
        k = new l(0, k);
        obj = k.a(new com.vividsolutions.jts.a.r(), true);
        if (!((e) (obj)).b())
        {
            return true;
        }
        if (((e) (obj)).c())
        {
            ((e) (obj)).a();
            return false;
        }
        obj = k.e();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i1;
        obj1 = (com.vividsolutions.jts.b.d)((Iterator) (obj)).next();
        i1 = ((com.vividsolutions.jts.b.d) (obj1)).f();
        obj1 = ((com.vividsolutions.jts.b.d) (obj1)).g().a();
_L6:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        boolean flag;
        g g1 = (g)((Iterator) (obj1)).next();
        if (g1.b == 0 && g1.c == 0.0D)
        {
            flag = true;
        } else
        if (g1.b == i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        obj = g1.a;
        flag = true;
_L8:
        if (flag)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        if (!b) goto _L10; else goto _L9
_L9:
        obj = new TreeMap();
        com.vividsolutions.jts.b.d d1;
        boolean flag1;
        for (k = k.e(); k.hasNext(); a(((Map) (obj)), d1.a(d1.a() - 1), flag1))
        {
            d1 = (com.vividsolutions.jts.b.d)k.next();
            d1.f();
            flag1 = d1.i();
            a(((Map) (obj)), d1.a(0), flag1);
        }

        k = ((Map) (obj)).values().iterator();
_L14:
        if (!k.hasNext()) goto _L12; else goto _L11
_L11:
        obj = (a)k.next();
        if (!((a) (obj)).b || ((a) (obj)).c == 2) goto _L14; else goto _L13
_L13:
        k = ((a) (obj)).a;
        flag = true;
_L15:
        if (flag)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L12:
        flag = false;
        if (true) goto _L15; else goto _L10
_L10:
        return true;
    }

    public final boolean a()
    {
        return a(a);
    }
}
