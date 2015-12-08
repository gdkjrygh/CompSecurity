// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.f;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.c.e;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.f:
//            a, b

public final class c
{

    private List a;
    private List b;
    private List c;
    private GeometryFactory d;

    public c(i j)
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = null;
        a(j);
    }

    public c(Collection collection)
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = null;
        a(collection);
    }

    private void a(i j)
    {
        if (d == null)
        {
            d = j.getFactory();
        }
        e.a(j, com/vividsolutions/jts/geom/Polygon, a);
        e.a(j, com/vividsolutions/jts/geom/n, b);
        e.a(j, com/vividsolutions/jts/geom/Point, c);
    }

    private void a(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext(); a((i)collection.next())) { }
    }

    private i b(i j)
    {
        return com.vividsolutions.jts.g.c.a.c.a(j, d.createPoint(null), 2);
    }

    public final i a()
    {
        if (d == null)
        {
            return null;
        }
        i j;
        i k;
        i l;
        i i1;
        if (c.size() > 0)
        {
            k = b(d.buildGeometry(c));
        } else
        {
            k = null;
        }
        if (b.size() > 0)
        {
            l = b(d.buildGeometry(b));
        } else
        {
            l = null;
        }
        if (a.size() > 0)
        {
            i1 = com.vividsolutions.jts.g.f.a.a(a);
        } else
        {
            i1 = null;
        }
        if (l == null && i1 == null)
        {
            j = null;
        } else
        {
            j = l;
            if (i1 != null)
            {
                if (l == null)
                {
                    j = i1;
                } else
                {
                    j = l.union(i1);
                }
            }
        }
        if (k == null)
        {
            l = j;
        } else
        {
            l = k;
            if (j != null)
            {
                l = com.vividsolutions.jts.g.f.b.a((v)k, j);
            }
        }
        if (l == null)
        {
            return d.createGeometryCollection(null);
        } else
        {
            return l;
        }
    }
}
