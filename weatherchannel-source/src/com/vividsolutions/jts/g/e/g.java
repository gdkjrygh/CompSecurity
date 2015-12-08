// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.e;

import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.e;
import com.vividsolutions.jts.b.h;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.b.q;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.e:
//            f, e, a

public final class g
{

    private q a;

    public g()
    {
        a = new q(new f());
    }

    public final Iterator a()
    {
        return a.a();
    }

    public final void a(l l1)
    {
        for (Iterator iterator = l1.e(); iterator.hasNext();)
        {
            Object obj = (d)iterator.next();
            int i = ((d) (obj)).m().a(0);
            obj = ((d) (obj)).g().a();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = (com.vividsolutions.jts.b.g)((Iterator) (obj)).next();
                obj1 = (com.vividsolutions.jts.g.e.e)a.a(((com.vividsolutions.jts.b.g) (obj1)).a);
                if (i == 1)
                {
                    ((com.vividsolutions.jts.g.e.e) (obj1)).a(0);
                } else
                if (((com.vividsolutions.jts.g.e.e) (obj1)).m().b(0))
                {
                    ((com.vividsolutions.jts.g.e.e) (obj1)).a(0, 0);
                }
            }
        }

        o o1;
        for (Iterator iterator1 = l1.g(); iterator1.hasNext(); a.a(o1.a()).a(0, o1.m().a(0)))
        {
            o1 = (o)iterator1.next();
        }

        e e1;
        for (l1 = (new a()).a(l1.e()).iterator(); l1.hasNext(); a.a(e1))
        {
            e1 = (e)l1.next();
        }

    }
}
