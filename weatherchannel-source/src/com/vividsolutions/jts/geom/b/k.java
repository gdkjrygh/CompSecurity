// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.a.a.b;
import com.vividsolutions.jts.a.a.c;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.c.a;
import com.vividsolutions.jts.geom.i;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            h

abstract class k
{

    private b a;
    protected h b;

    public k(h h1)
    {
        b = h1;
        a = h1.d();
    }

    protected static boolean a(i i, List list)
    {
        i = new c(i);
        for (list = list.iterator(); list.hasNext();)
        {
            if (i.a((Coordinate)list.next()) != 2)
            {
                return true;
            }
        }

        return false;
    }

    protected final boolean d(i i)
    {
        for (i = com.vividsolutions.jts.geom.c.a.b(i).iterator(); i.hasNext();)
        {
            Coordinate coordinate = (Coordinate)i.next();
            if (a.a(coordinate) == 2)
            {
                return false;
            }
        }

        return true;
    }

    protected final boolean e(i i)
    {
        for (i = com.vividsolutions.jts.geom.c.a.b(i).iterator(); i.hasNext();)
        {
            Coordinate coordinate = (Coordinate)i.next();
            if (a.a(coordinate) != 2)
            {
                return true;
            }
        }

        return false;
    }

    protected final boolean f(i i)
    {
        for (i = com.vividsolutions.jts.geom.c.a.b(i).iterator(); i.hasNext();)
        {
            Coordinate coordinate = (Coordinate)i.next();
            if (a.a(coordinate) == 0)
            {
                return true;
            }
        }

        return false;
    }
}
