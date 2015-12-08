// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.o;
import com.vividsolutions.jts.f.c;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.i;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            e

final class f
{

    private e a;

    public f(e e1)
    {
        a = e1;
    }

    public final boolean a(i j)
    {
        List list = com.vividsolutions.jts.a.a.a(j);
        if (list.size() > 0 && a.c().a(list))
        {
            return true;
        }
        if (j.getDimension() == 1)
        {
            return false;
        }
        if (j.getDimension() == 2 && a.a(j))
        {
            return true;
        }
        if (j.getDimension() == 0)
        {
            o o1 = new o();
            for (j = com.vividsolutions.jts.geom.c.a.b(j).iterator(); j.hasNext();)
            {
                if (o1.a((Coordinate)j.next(), a.a()))
                {
                    return true;
                }
            }

            return false;
        } else
        {
            return false;
        }
    }
}
