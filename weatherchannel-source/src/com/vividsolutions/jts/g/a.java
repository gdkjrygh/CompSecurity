// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g;

import com.vividsolutions.jts.a.b;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.vividsolutions.jts.g:
//            b

public final class a
{

    private i a;
    private GeometryFactory b;
    private b c;
    private Map d;

    public a(i j)
    {
        this(j, b.a);
    }

    private a(i j, b b1)
    {
        a = j;
        b = j.getFactory();
        c = b1;
    }

    private void a(Coordinate coordinate)
    {
        com.vividsolutions.jts.g.b b2 = (com.vividsolutions.jts.g.b)d.get(coordinate);
        com.vividsolutions.jts.g.b b1 = b2;
        if (b2 == null)
        {
            b1 = new com.vividsolutions.jts.g.b();
            d.put(coordinate, b1);
        }
        b1.a = b1.a + 1;
    }

    private r b()
    {
        return b.createMultiPoint(null);
    }

    public final i a()
    {
        if (a instanceof n)
        {
            n n1 = (n)a;
            if (a.isEmpty())
            {
                return b();
            }
            if (n1.d())
            {
                if (c.a(2))
                {
                    return n1.b();
                } else
                {
                    return b.createMultiPoint(null);
                }
            } else
            {
                return b.createMultiPoint(new Point[] {
                    n1.b(), n1.c()
                });
            }
        }
        if (a instanceof q)
        {
            Object obj = (q)a;
            if (a.isEmpty())
            {
                return b();
            }
            ArrayList arraylist = new ArrayList();
            d = new TreeMap();
            for (int j = 0; j < ((q) (obj)).getNumGeometries(); j++)
            {
                n n2 = (n)((q) (obj)).getGeometryN(j);
                if (n2.getNumPoints() != 0)
                {
                    a(n2.a(0));
                    a(n2.a(n2.getNumPoints() - 1));
                }
            }

            obj = d.entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                int k = ((com.vividsolutions.jts.g.b)entry.getValue()).a;
                if (c.a(k))
                {
                    arraylist.add(entry.getKey());
                }
            } while (true);
            Coordinate acoordinate[] = com.vividsolutions.jts.geom.a.a(arraylist);
            if (acoordinate.length == 1)
            {
                return b.createPoint(acoordinate[0]);
            } else
            {
                return b.createMultiPoint(acoordinate);
            }
        } else
        {
            return a.getBoundary();
        }
    }
}
