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
//            s, r, n, i

public final class g extends s
{
    public final class a extends com.vividsolutions.jts.c.b.b
    {

        private n c;

        public final void a(com.vividsolutions.jts.c.b.a a1, int j, com.vividsolutions.jts.c.b.a a2, int k)
        {
            a1 = (r)a1.b();
            a2 = (r)a2.b();
            c.a(a1, j, a2, k);
        }

        public a(n n1)
        {
            c = null;
            c = n1;
        }
    }


    private List b;
    private b c;
    private int d;
    private Collection e;
    private int f;

    public g()
    {
        b = new ArrayList();
        c = new e();
        d = 0;
        f = 0;
    }

    public final b a()
    {
        return c;
    }

    public final void a(Collection collection)
    {
        e = collection;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            Object obj = (r)collection.next();
            obj = com.vividsolutions.jts.a.a.a(((r) (obj)).c(), obj).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                com.vividsolutions.jts.c.b.a a1 = (com.vividsolutions.jts.c.b.a)((Iterator) (obj)).next();
                int j = d;
                d = j + 1;
                a1.a(j);
                c.a(a1.c(), a1);
                b.add(a1);
            }
        }

        collection = new a(a);
        Iterator iterator = b.iterator();
label0:
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.vividsolutions.jts.c.b.a a2 = (com.vividsolutions.jts.c.b.a)iterator.next();
            Iterator iterator1 = c.a(a2.c()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label0;
                }
                com.vividsolutions.jts.c.b.a a3 = (com.vividsolutions.jts.c.b.a)iterator1.next();
                if (a3.a() > a2.a())
                {
                    a2.a(a3, collection);
                    f = f + 1;
                }
            } while (!a.d());
            break;
        } while (true);
    }

    public final Collection b()
    {
        return com.vividsolutions.jts.f.i.a(e);
    }
}
