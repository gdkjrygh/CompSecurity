// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.b.b;
import com.vividsolutions.jts.b.c;
import com.vividsolutions.jts.b.k;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.c:
//            c, b

public final class g
{

    private GeometryFactory a;
    private List b;

    public g(GeometryFactory geometryfactory)
    {
        b = new ArrayList();
        a = geometryfactory;
    }

    private static k a(List list)
    {
        boolean flag = false;
        Object obj = null;
        Iterator iterator = list.iterator();
        int i = 0;
        list = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.vividsolutions.jts.g.c.c c1 = (com.vividsolutions.jts.g.c.c)iterator.next();
            if (!c1.a())
            {
                i++;
                list = c1;
            }
        } while (true);
        if (i <= 1)
        {
            flag = true;
        }
        com.vividsolutions.jts.a.a.a(flag, "found two shells in MinimalEdgeRing list");
        return list;
    }

    private List a(List list, List list1, List list2)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            Object obj = (com.vividsolutions.jts.g.c.b)list.next();
            if (((com.vividsolutions.jts.g.c.b) (obj)).e() > 2)
            {
                ((com.vividsolutions.jts.g.c.b) (obj)).g();
                obj = ((com.vividsolutions.jts.g.c.b) (obj)).h();
                k k1 = a(((List) (obj)));
                if (k1 != null)
                {
                    a(k1, ((List) (obj)));
                    list1.add(k1);
                } else
                {
                    list2.addAll(((Collection) (obj)));
                }
            } else
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    private static void a(k k1, List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            com.vividsolutions.jts.g.c.c c1 = (com.vividsolutions.jts.g.c.c)list.next();
            if (c1.a())
            {
                c1.a(k1);
            }
        } while (true);
    }

    private void a(List list, List list1)
    {
        Iterator iterator = list1.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        k k2 = (k)iterator.next();
        if (k2.c() != null) goto _L4; else goto _L3
_L3:
        h h1;
        h h2;
        com.vividsolutions.jts.geom.Coordinate coordinate;
        Iterator iterator1;
        list1 = k2.b();
        h2 = list1.getEnvelopeInternal();
        coordinate = list1.a(0);
        iterator1 = list.iterator();
        h1 = null;
        list1 = null;
_L6:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        k k1 = (k)iterator1.next();
        Object obj = k1.b();
        h h3 = ((p) (obj)).getEnvelopeInternal();
        if (list1 != null)
        {
            h1 = list1.b().getEnvelopeInternal();
        }
        boolean flag;
        if (h3.d(h2) && com.vividsolutions.jts.a.a.a(coordinate, ((p) (obj)).getCoordinates()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj = k1;
        if (list1 != null)
        {
            if (!h1.d(h3))
            {
                break MISSING_BLOCK_LABEL_202;
            }
            obj = k1;
        }
_L7:
        list1 = ((List) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        if (list1 == null)
        {
            throw new w("unable to assign hole to a shell", k2.a(0));
        }
        k2.a(list1);
          goto _L4
_L2:
        return;
        obj = list1;
          goto _L7
    }

    private static void b(List list, List list1, List list2)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            k k1 = (k)list.next();
            if (k1.a())
            {
                list2.add(k1);
            } else
            {
                list1.add(k1);
            }
        }

    }

    public final List a()
    {
        Object obj = b;
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((k)((Iterator) (obj)).next()).a(a))) { }
        return arraylist;
    }

    public final void a(Collection collection, Collection collection1)
    {
        for (collection1 = collection1.iterator(); collection1.hasNext(); ((c)((o)collection1.next()).b()).c()) { }
        collection1 = new ArrayList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj = (b)collection.next();
            if (((b) (obj)).b() && ((b) (obj)).l().c() && ((b) (obj)).d() == null)
            {
                obj = new com.vividsolutions.jts.g.c.b(((b) (obj)), a);
                collection1.add(obj);
                ((com.vividsolutions.jts.g.c.b) (obj)).f();
            }
        } while (true);
        collection = new ArrayList();
        b(a(((List) (collection1)), b, ((List) (collection))), b, collection);
        a(b, ((List) (collection)));
    }
}
