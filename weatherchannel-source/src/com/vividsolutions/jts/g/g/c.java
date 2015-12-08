// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.g;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.c.b;
import com.vividsolutions.jts.c.e.e;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.p;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.g:
//            d

public final class c
{

    private l a;
    private List b;
    private h c;
    private b d;
    private Coordinate e;

    public c(l l)
    {
        b = new ArrayList();
        c = new h();
        a = l;
    }

    public final Coordinate a()
    {
        return e;
    }

    public final void a(p p1)
    {
        b.add(p1);
        c.a(p1.getEnvelopeInternal());
    }

    public final boolean b()
    {
        d = new e();
        for (int i = 0; i < b.size(); i++)
        {
            p p1 = (p)b.get(i);
            h h1 = p1.getEnvelopeInternal();
            d.a(h1, p1);
        }

        for (int j = 0; j < b.size(); j++)
        {
            p p2 = (p)b.get(j);
            Coordinate acoordinate[] = p2.getCoordinates();
            List list = d.a(p2.getEnvelopeInternal());
            for (int k = 0; k < list.size(); k++)
            {
                Object obj = (p)list.get(k);
                Coordinate acoordinate1[] = ((p) (obj)).getCoordinates();
                if (p2 == obj || !p2.getEnvelopeInternal().c(((p) (obj)).getEnvelopeInternal()))
                {
                    continue;
                }
                obj = com.vividsolutions.jts.g.g.d.a(acoordinate, ((p) (obj)), a);
                if (obj != null && com.vividsolutions.jts.a.a.a(((Coordinate) (obj)), acoordinate1))
                {
                    e = ((Coordinate) (obj));
                    return false;
                }
            }

        }

        return true;
    }
}
