// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.c.a.a;
import com.vividsolutions.jts.c.a.b;
import com.vividsolutions.jts.c.b.c;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.m;
import com.vividsolutions.jts.geom.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.a:
//            n, a

public final class l
    implements n
{
    final class a extends c
    {

        private Coordinate b;
        private l c;

        public final void a(m m1)
        {
            com.vividsolutions.jts.a.l.a(c, b, m1);
        }

        public a(Coordinate coordinate)
        {
            c = l.this;
            super();
            b = coordinate;
        }
    }


    private p a;
    private com.vividsolutions.jts.c.a.a b;
    private int c;
    private b d;

    public l(p p1)
    {
        c = 0;
        d = new b();
        a = p1;
        a();
    }

    private void a()
    {
        b = new com.vividsolutions.jts.c.a.a();
        List list = com.vividsolutions.jts.a.a.a(com.vividsolutions.jts.geom.a.b(a.getCoordinates()), null);
        for (int i = 0; i < list.size(); i++)
        {
            com.vividsolutions.jts.c.b.a a1 = (com.vividsolutions.jts.c.b.a)list.get(i);
            h h1 = a1.c();
            d.a = h1.f();
            d.b = h1.g();
            b.a(d, a1);
        }

    }

    static void a(l l1, Coordinate coordinate, m m1)
    {
        Coordinate coordinate1 = m1.a;
        m1 = m1.b;
        double d1 = coordinate1.x;
        double d2 = coordinate.x;
        double d3 = coordinate1.y - coordinate.y;
        double d4 = ((Coordinate) (m1)).x;
        double d5 = coordinate.x;
        double d6 = ((Coordinate) (m1)).y - coordinate.y;
        if ((d3 > 0.0D && d6 <= 0.0D || d6 > 0.0D && d3 <= 0.0D) && 0.0D < (double)com.vividsolutions.jts.a.a.a(d1 - d2, d3, d4 - d5, d6) / (d6 - d3))
        {
            l1.c = l1.c + 1;
        }
    }

    public final boolean a(Coordinate coordinate)
    {
        c = 0;
        h h1 = new h((-1.0D / 0.0D), (1.0D / 0.0D), coordinate.y, coordinate.y);
        d.a = coordinate.y;
        d.b = coordinate.y;
        com.vividsolutions.jts.c.a.a a1 = b;
        b b1 = d;
        Object obj = new ArrayList();
        a1.a(b1, ((java.util.Collection) (obj)));
        coordinate = new a(coordinate);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((com.vividsolutions.jts.c.b.a)((Iterator) (obj)).next()).a(h1, coordinate)) { }
        return c % 2 == 1;
    }
}
