// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.vividsolutions.jts.b:
//            q, p, d, o, 
//            n, e, b, c

public class r
{

    protected List a;
    protected q b;
    private List c;

    public r()
    {
        a = new ArrayList();
        c = new ArrayList();
        b = new q(new p());
    }

    public r(p p1)
    {
        a = new ArrayList();
        c = new ArrayList();
        b = new q(p1);
    }

    private void a(e e1)
    {
        b.a(e1);
        c.add(e1);
    }

    private static boolean a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
    {
        while (!coordinate.equals(coordinate2) || com.vividsolutions.jts.a.a.a(coordinate, coordinate1, coordinate3) != 0 || com.vividsolutions.jts.a.a.b(coordinate, coordinate1) != com.vividsolutions.jts.a.a.b(coordinate2, coordinate3)) 
        {
            return false;
        }
        return true;
    }

    public final d a(Coordinate coordinate, Coordinate coordinate1)
    {
        for (int j = 0; j < a.size(); j++)
        {
            d d1 = (d)a.get(j);
            for (Coordinate acoordinate[] = d1.a; a(coordinate, coordinate1, acoordinate[0], acoordinate[1]) || a(coordinate, coordinate1, acoordinate[acoordinate.length - 1], acoordinate[acoordinate.length - 2]);)
            {
                return d1;
            }

        }

        return null;
    }

    public final o a(Coordinate coordinate)
    {
        return b.a(coordinate);
    }

    protected final void a(d d1)
    {
        a.add(d1);
    }

    public final boolean a(int j, Coordinate coordinate)
    {
        coordinate = (o)b.a.get(coordinate);
        if (coordinate == null)
        {
            return false;
        }
        coordinate = coordinate.m();
        return coordinate != null && coordinate.a(j) == 1;
    }

    public final e b(d d1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            e e1 = (e)iterator.next();
            if (e1.a() == d1)
            {
                return e1;
            }
        }

        return null;
    }

    public final void b(List list)
    {
        Object obj;
        for (list = list.iterator(); list.hasNext(); a(((e) (obj))))
        {
            obj = (d)list.next();
            a.add(obj);
            b b1 = new b(((d) (obj)), true);
            obj = new b(((d) (obj)), false);
            b1.a(((b) (obj)));
            ((b) (obj)).a(b1);
            a(b1);
        }

    }

    public final Iterator e()
    {
        return a.iterator();
    }

    public final Collection f()
    {
        return c;
    }

    public final Iterator g()
    {
        return b.a();
    }

    public final Collection h()
    {
        return b.a.values();
    }

    public final void i()
    {
        for (Iterator iterator = b.a(); iterator.hasNext(); ((c)((o)iterator.next()).b()).c()) { }
    }
}
