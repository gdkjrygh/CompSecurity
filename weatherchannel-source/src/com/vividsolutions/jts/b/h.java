// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.geom.Coordinate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.vividsolutions.jts.b:
//            g, d, n

public final class h
{

    private Map a;
    private d b;

    public h(d d1)
    {
        a = new TreeMap();
        b = d1;
    }

    public final g a(Coordinate coordinate, int i, double d1)
    {
        coordinate = new g(coordinate, i, d1);
        g g1 = (g)a.get(coordinate);
        if (g1 != null)
        {
            return g1;
        } else
        {
            a.put(coordinate, coordinate);
            return coordinate;
        }
    }

    public final Iterator a()
    {
        return a.values().iterator();
    }

    public final void a(List list)
    {
        b();
        Iterator iterator = a();
        g g2;
        for (g g1 = (g)iterator.next(); iterator.hasNext(); g1 = g2)
        {
            g2 = (g)iterator.next();
            int j = (g2.b - g1.b) + 2;
            Coordinate coordinate = b.a[g2.b];
            Coordinate acoordinate[];
            boolean flag;
            int i;
            if (g2.c > 0.0D || !g2.a.equals2D(coordinate))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = j;
            if (!flag)
            {
                i = j - 1;
            }
            acoordinate = new Coordinate[i];
            acoordinate[0] = new Coordinate(g1.a);
            j = g1.b + 1;
            for (i = 1; j <= g2.b; i++)
            {
                acoordinate[i] = b.a[j];
                j++;
            }

            if (flag)
            {
                acoordinate[i] = g2.a;
            }
            list.add(new d(acoordinate, new n(b.c)));
        }

    }

    public final boolean a(Coordinate coordinate)
    {
        for (Iterator iterator = a(); iterator.hasNext();)
        {
            if (((g)iterator.next()).a.equals(coordinate))
            {
                return true;
            }
        }

        return false;
    }

    public final void b()
    {
        int i = b.a.length - 1;
        a(b.a[0], 0, 0.0D);
        a(b.a[i], i, 0.0D);
    }
}
