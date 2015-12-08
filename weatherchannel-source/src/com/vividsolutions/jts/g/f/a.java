// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.f;

import com.vividsolutions.jts.c.e.e;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.c.c;
import com.vividsolutions.jts.geom.c.j;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
{

    private Collection a;
    private GeometryFactory b;

    private a(Collection collection)
    {
        b = null;
        a = collection;
    }

    private i a(h h1, i k, List list)
    {
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        while (i1 < k.getNumGeometries()) 
        {
            i l = k.getGeometryN(i1);
            if (l.getEnvelopeInternal().c(h1))
            {
                arraylist.add(l);
            } else
            {
                list.add(l);
            }
            i1++;
        }
        return b.buildGeometry(arraylist);
    }

    private i a(i k, i l)
    {
        if (k == null && l == null)
        {
            return null;
        }
        if (k == null)
        {
            return (i)l.clone();
        }
        if (l == null)
        {
            return (i)k.clone();
        }
        h h1 = k.getEnvelopeInternal();
        Object obj = l.getEnvelopeInternal();
        if (!h1.c(((h) (obj))))
        {
            return c.a(k, l);
        }
        if (k.getNumGeometries() <= 1 && l.getNumGeometries() <= 1)
        {
            return b(k, l);
        } else
        {
            h1 = h1.b(((h) (obj)));
            obj = new ArrayList();
            ((List) (obj)).add(b(a(h1, k, ((List) (obj))), a(h1, l, ((List) (obj)))));
            return c.a(((Collection) (obj)));
        }
    }

    public static i a(Collection collection)
    {
        collection = new a(collection);
        if (((a) (collection)).a.isEmpty())
        {
            return null;
        }
        collection.b = ((i)((a) (collection)).a.iterator().next()).getFactory();
        e e1 = new e(4);
        i k;
        for (Iterator iterator = ((a) (collection)).a.iterator(); iterator.hasNext(); e1.a(k.getEnvelopeInternal(), k))
        {
            k = (i)iterator.next();
        }

        return collection.a(e1.c());
    }

    private i a(List list)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            list = ((List) (iterator.next()));
            if (list instanceof List)
            {
                list = a((List)list);
            } else
            if (list instanceof i)
            {
                list = (i)list;
            } else
            {
                list = null;
            }
            arraylist.add(list);
        }
        return a(((List) (arraylist)), 0, arraylist.size());
    }

    private static i a(List list, int k)
    {
        if (k >= list.size())
        {
            return null;
        } else
        {
            return (i)list.get(k);
        }
    }

    private i a(List list, int k, int l)
    {
        if (l - k <= 1)
        {
            return a(a(list, k), ((i) (null)));
        }
        if (l - k == 2)
        {
            return a(a(list, k), a(list, k + 1));
        } else
        {
            int i1 = (l + k) / 2;
            return a(a(list, k, i1), a(list, i1, l));
        }
    }

    private static i b(i k, i l)
    {
        k = k.union(l);
        if (k instanceof t)
        {
            return k;
        }
        l = j.b(k);
        if (l.size() == 1)
        {
            return (Polygon)l.get(0);
        } else
        {
            return k.getFactory().createMultiPolygon(GeometryFactory.toPolygonArray(l));
        }
    }
}
