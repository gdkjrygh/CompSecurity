// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.d.i;
import com.vividsolutions.jts.geom.w;
import java.util.Collection;

// Referenced classes of package com.vividsolutions.jts.f:
//            d, g

public final class b
{

    private k a;
    private Collection b;
    private boolean c;
    private d d;
    private boolean e;

    public b(Collection collection)
    {
        a = new r();
        c = false;
        d = null;
        e = true;
        b = collection;
    }

    public final void a()
    {
        if (d == null)
        {
            e = true;
            d = new d(a);
            d.a(false);
            g g1 = new g();
            g1.a(d);
            g1.a(b);
            if (d.a())
            {
                e = false;
            }
        }
        if (!e)
        {
            Object obj;
            if (e)
            {
                obj = "no intersections found";
            } else
            {
                obj = d.c();
                obj = (new StringBuilder("found non-noded intersection between ")).append(i.a(obj[0], obj[1])).append(" and ").append(i.a(obj[2], obj[3])).toString();
            }
            throw new w(((String) (obj)), d.b());
        } else
        {
            return;
        }
    }
}
