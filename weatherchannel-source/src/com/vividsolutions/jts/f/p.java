// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.vividsolutions.jts.f:
//            o, i, r

public final class p
{

    private Map a;
    private i b;

    public p(i j)
    {
        a = new TreeMap();
        b = j;
    }

    private r a(o o1, o o2)
    {
        int k = (o2.b - o1.b) + 2;
        Coordinate coordinate = b.a(o2.b);
        Coordinate acoordinate[];
        boolean flag;
        int j;
        if (o2.a() || !o2.a.equals2D(coordinate))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = k;
        if (!flag)
        {
            j = k - 1;
        }
        acoordinate = new Coordinate[j];
        acoordinate[0] = new Coordinate(o1.a);
        k = o1.b + 1;
        for (j = 1; k <= o2.b; j++)
        {
            acoordinate[j] = b.a(k);
            k++;
        }

        if (flag)
        {
            acoordinate[j] = o2.a;
        }
        return new i(acoordinate, b.a());
    }

    private Iterator a()
    {
        return a.values().iterator();
    }

    private void a(List list)
    {
        for (int j = 0; j < b.b() - 2; j++)
        {
            Coordinate coordinate = b.a(j);
            b.a(j + 1);
            if (coordinate.equals2D(b.a(j + 2)))
            {
                list.add(new Integer(j + 1));
            }
        }

    }

    private void b(List list)
    {
        o o1;
        int ai[];
        Iterator iterator;
        ai = new int[1];
        iterator = a();
        o1 = (o)iterator.next();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        o o2 = (o)iterator.next();
        if (!o1.a.equals2D(o2.a)) goto _L4; else goto _L3
_L3:
        int j;
        int k = o2.b - o1.b;
        j = k;
        if (!o2.a())
        {
            j = k - 1;
        }
        if (j != 1) goto _L4; else goto _L5
_L5:
        boolean flag;
        ai[0] = o1.b + 1;
        flag = true;
_L6:
        if (flag)
        {
            list.add(new Integer(ai[0]));
        }
        o1 = o2;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final o a(Coordinate coordinate, int j)
    {
        o o1 = new o(b, coordinate, j, b.b(j));
        o o2 = (o)a.get(o1);
        if (o2 != null)
        {
            com.vividsolutions.jts.a.a.a(o2.a.equals2D(coordinate), "Found equal nodes with different coordinates");
            return o2;
        } else
        {
            a.put(o1, o1);
            return o1;
        }
    }

    public final void a(Collection collection)
    {
        int j = b.b() - 1;
        a(b.a(0), 0);
        a(b.a(j), j);
        Object obj = new ArrayList();
        b(((List) (obj)));
        a(((List) (obj)));
        int k;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a(b.a(k), k))
        {
            k = ((Integer)((Iterator) (obj)).next()).intValue();
        }

        Iterator iterator = a();
        o o2;
        for (o o1 = (o)iterator.next(); iterator.hasNext(); o1 = o2)
        {
            o2 = (o)iterator.next();
            collection.add(a(o1, o2));
        }

    }
}
