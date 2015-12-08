// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c;

import com.vividsolutions.jts.b.c;
import com.vividsolutions.jts.b.k;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.geom.GeometryFactory;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.c:
//            c

public final class b extends k
{

    public b(com.vividsolutions.jts.b.b b1, GeometryFactory geometryfactory)
    {
        super(b1, geometryfactory);
    }

    public final com.vividsolutions.jts.b.b a(com.vividsolutions.jts.b.b b1)
    {
        return b1.h();
    }

    public final void a(com.vividsolutions.jts.b.b b1, k k1)
    {
        b1.a(k1);
    }

    public final void g()
    {
        com.vividsolutions.jts.b.b b1 = a;
        do
        {
            ((c)b1.q().b()).a(this);
            b1 = b1.h();
        } while (b1 != a);
    }

    public final List h()
    {
        ArrayList arraylist = new ArrayList();
        com.vividsolutions.jts.b.b b1 = a;
        com.vividsolutions.jts.b.b b2;
        do
        {
            if (b1.e() == null)
            {
                arraylist.add(new com.vividsolutions.jts.g.c.c(b1, b));
            }
            b2 = b1.h();
            b1 = b2;
        } while (b2 != a);
        return arraylist;
    }
}
