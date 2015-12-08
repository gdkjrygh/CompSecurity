// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.g;

import com.vividsolutions.jts.b.b;
import com.vividsolutions.jts.b.k;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.b.r;
import com.vividsolutions.jts.g.c.d;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
{

    private GeometryFactory a;
    private l b;
    private Coordinate c;

    public a(l l1)
    {
        a = new GeometryFactory();
        b = l1;
    }

    private List a(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj = (b)collection.next();
            if (((b) (obj)).b() && ((b) (obj)).d() == null)
            {
                obj = new com.vividsolutions.jts.g.c.b(((b) (obj)), a);
                ((com.vividsolutions.jts.g.c.b) (obj)).g();
                arraylist.addAll(((com.vividsolutions.jts.g.c.b) (obj)).h());
            }
        } while (true);
        return arraylist;
    }

    private static void a(r r1)
    {
        r1 = r1.f().iterator();
        do
        {
            if (!r1.hasNext())
            {
                break;
            }
            b b1 = (b)r1.next();
            if (b1.l().a(0, 2) == 0)
            {
                b1.a(true);
            }
        } while (true);
    }

    private void a(i i, r r1)
    {
        if (i instanceof Polygon)
        {
            a(((Polygon)i).getExteriorRing(), r1);
        }
        if (i instanceof s)
        {
            i = (s)i;
            for (int j = 0; j < i.getNumGeometries(); j++)
            {
                a(((Polygon)i.getGeometryN(j)).getExteriorRing(), r1);
            }

        }
    }

    private void a(com.vividsolutions.jts.geom.n n1, r r1)
    {
        Coordinate coordinate;
        int i;
        n1 = n1.getCoordinates();
        coordinate = n1[0];
        i = 0;
_L3:
        if (i >= n1.length)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (n1[i].equals(coordinate)) goto _L2; else goto _L1
_L1:
        n1 = n1[i];
_L4:
        n1 = (b)r1.b(r1.a(coordinate, n1));
        boolean flag;
        if (n1.l().a(0, 2) != 0)
        {
            if (n1.f().l().a(0, 2) == 0)
            {
                n1 = n1.f();
            } else
            {
                n1 = null;
            }
        }
        if (n1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, "unable to find dirEdge with Interior on RHS");
        r1 = n1;
        do
        {
            if (r1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.vividsolutions.jts.a.a.a(flag, "found null Directed Edge");
            r1.b(true);
            r1 = r1.h();
        } while (r1 != n1);
        return;
_L2:
        i++;
          goto _L3
        n1 = null;
          goto _L4
    }

    private boolean a(List list)
    {
        int i;
        boolean flag1;
        flag1 = false;
        i = 0;
_L10:
        boolean flag = flag1;
        if (i >= list.size()) goto _L2; else goto _L1
_L1:
        Object obj = (k)list.get(i);
        if (((k) (obj)).a()) goto _L4; else goto _L3
_L3:
        obj = ((k) (obj)).d();
        if (((b)((List) (obj)).get(0)).l().a(0, 2) != 0) goto _L4; else goto _L5
_L5:
        int j = 0;
_L8:
        b b1;
        if (j >= ((List) (obj)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = (b)((List) (obj)).get(j);
        if (b1.c()) goto _L7; else goto _L6
_L6:
        c = b1.m();
        flag = true;
_L2:
        return flag;
_L7:
        j++;
        if (true) goto _L8; else goto _L4
_L4:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final Coordinate a()
    {
        return c;
    }

    public final boolean b()
    {
        Object obj = new ArrayList();
        b.a(((List) (obj)));
        r r1 = new r(new d());
        r1.b(((List) (obj)));
        a(r1);
        r1.i();
        obj = a(r1.f());
        a(b.c(), r1);
        return !a(((List) (obj)));
    }
}
