// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f.a;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.f.f;
import com.vividsolutions.jts.f.g;
import com.vividsolutions.jts.f.i;
import com.vividsolutions.jts.f.j;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.u;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.vividsolutions.jts.f.a:
//            b, a

public final class c
    implements j
{

    private k a;
    private final double b;
    private g c;
    private b d;
    private Collection e;

    public c(u u1)
    {
        a = new r();
        a.a(u1);
        b = u1.b();
    }

    public final void a(Collection collection)
    {
        e = collection;
        c = new g();
        d = new b(c.a());
        Object obj = new f(a);
        c.a(((com.vividsolutions.jts.f.n) (obj)));
        c.a(collection);
        a a1;
        for (obj = ((f) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); d.a(a1))
        {
            a1 = new a((Coordinate)((Iterator) (obj)).next(), b, a);
        }

        for (collection = collection.iterator(); collection.hasNext();)
        {
            i l = (i)collection.next();
            Coordinate acoordinate[] = l.c();
            int i1 = 0;
            while (i1 < acoordinate.length) 
            {
                a a2 = new a(acoordinate[i1], b, a);
                if (d.a(a2, l, i1))
                {
                    l.a(acoordinate[i1], i1);
                }
                i1++;
            }
        }

    }

    public final Collection b()
    {
        return i.a(e);
    }
}
