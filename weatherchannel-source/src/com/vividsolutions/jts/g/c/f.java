// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c;

import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.b.r;
import com.vividsolutions.jts.geom.GeometryFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.c:
//            e

public final class f
{

    private e a;
    private GeometryFactory b;
    private List c;

    public f(e e1, GeometryFactory geometryfactory)
    {
        c = new ArrayList();
        a = e1;
        b = geometryfactory;
    }

    public final List a(int i)
    {
        Iterator iterator = a.a().h().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (o)iterator.next();
            if (!((o) (obj)).n() && !((o) (obj)).c() && (((o) (obj)).b().e() == 0 || i == 1) && e.a(((o) (obj)).m(), i))
            {
                obj = ((o) (obj)).a();
                if (!a.a(((com.vividsolutions.jts.geom.Coordinate) (obj))))
                {
                    obj = b.createPoint(((com.vividsolutions.jts.geom.Coordinate) (obj)));
                    c.add(obj);
                }
            }
        } while (true);
        return c;
    }
}
