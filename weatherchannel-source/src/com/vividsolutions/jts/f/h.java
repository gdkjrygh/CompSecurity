// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.c.b;
import com.vividsolutions.jts.c.e.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.f:
//            q, r, n

public final class h extends q
{
    public final class a extends com.vividsolutions.jts.c.b.b
    {

        private n c;

        public final void a(com.vividsolutions.jts.c.b.a a1, int i, com.vividsolutions.jts.c.b.a a2, int j)
        {
            a1 = (r)a1.b();
            a2 = (r)a2.b();
            c.a(a1, i, a2, j);
        }

        public a(n n1)
        {
            c = null;
            c = n1;
        }
    }


    private b b;
    private int c;
    private int d;
    private int e;

    public h()
    {
        b = new e();
        c = 0;
        d = 0;
        e = 0;
    }

    private void a(r r1, List list)
    {
        com.vividsolutions.jts.c.b.a a1;
        for (r1 = com.vividsolutions.jts.a.a.a(r1.c(), r1).iterator(); r1.hasNext(); list.add(a1))
        {
            a1 = (com.vividsolutions.jts.c.b.a)r1.next();
            int i = d;
            d = i + 1;
            a1.a(i);
        }

    }

    private void a(List list)
    {
        a a1 = new a(a);
        list = list.iterator();
label0:
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            com.vividsolutions.jts.c.b.a a2 = (com.vividsolutions.jts.c.b.a)list.next();
            Iterator iterator = b.a(a2.c()).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                a2.a((com.vividsolutions.jts.c.b.a)iterator.next(), a1);
                e = e + 1;
            } while (!a.d());
            break;
        } while (true);
    }

    public final void a(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            Object obj = (r)collection.next();
            obj = com.vividsolutions.jts.a.a.a(((r) (obj)).c(), obj).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                com.vividsolutions.jts.c.b.a a1 = (com.vividsolutions.jts.c.b.a)((Iterator) (obj)).next();
                int i = c;
                c = i + 1;
                a1.a(i);
                b.a(a1.c(), a1);
            }
        }

    }

    public final void b(Collection collection)
    {
        d = c + 1;
        e = 0;
        ArrayList arraylist = new ArrayList();
        for (collection = collection.iterator(); collection.hasNext(); a((r)collection.next(), arraylist)) { }
        a(arraylist);
    }
}
