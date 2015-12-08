// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.e;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.c.b;
import com.vividsolutions.jts.geom.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.c.e:
//            b, c, a

public final class e extends com.vividsolutions.jts.c.e.b
    implements b, Serializable
{
    static final class a extends com.vividsolutions.jts.c.e.a
    {

        protected final Object b()
        {
            Iterator iterator = a().iterator();
            h h1 = null;
            while (iterator.hasNext()) 
            {
                c c1 = (c)iterator.next();
                if (h1 == null)
                {
                    h1 = new h((h)c1.c());
                } else
                {
                    h1.a((h)c1.c());
                }
            }
            return h1;
        }

        private a(int i)
        {
            super(i);
        }

        a(int i, byte byte0)
        {
            this(i);
        }
    }


    private static Comparator a = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            return com.vividsolutions.jts.c.e.b.a(com.vividsolutions.jts.c.e.e.b((h)((c)obj).c()), com.vividsolutions.jts.c.e.e.b((h)((c)obj1).c()));
        }

    };
    private static Comparator b = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            return com.vividsolutions.jts.c.e.b.a(e.c((h)((c)obj).c()), e.c((h)((c)obj1).c()));
        }

    };
    private static b.a c = new b.a();
    private static final long serialVersionUID = 0x39920f7d5f261e4L;

    public e()
    {
        this(10);
    }

    public e(int i)
    {
        super(i);
    }

    private List a(List alist[], int i)
    {
        int j = 0;
        ArrayList arraylist;
        boolean flag;
        if (alist.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, null);
        arraylist = new ArrayList();
        for (; j < alist.length; j++)
        {
            arraylist.addAll(super.a(alist[j], i));
        }

        return arraylist;
    }

    static double b(h h1)
    {
        return (h1.d() + h1.e()) / 2D;
    }

    private static List[] b(List list, int i)
    {
        int l = (int)Math.ceil((double)list.size() / (double)i);
        List alist[] = new List[i];
        list = list.iterator();
        for (int j = 0; j < i; j++)
        {
            alist[j] = new ArrayList();
            for (int k = 0; list.hasNext() && k < l; k++)
            {
                c c1 = (c)list.next();
                alist[j].add(c1);
            }

        }

        return alist;
    }

    static double c(h h1)
    {
        return (h1.f() + h1.g()) / 2D;
    }

    protected final com.vividsolutions.jts.c.e.a a(int i)
    {
        return new a(i, (byte)0);
    }

    public final List a(h h1)
    {
        return super.a(h1);
    }

    protected final List a(List list, int i)
    {
        int j;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, null);
        j = (int)Math.ceil((double)list.size() / (double)a());
        list = new ArrayList(list);
        Collections.sort(list, a);
        return a(b(list, (int)Math.ceil(Math.sqrt(j))), i);
    }

    public final void a(h h1, com.vividsolutions.jts.c.a a1)
    {
        super.a(h1, a1);
    }

    public final void a(h h1, Object obj)
    {
        if (h1.a())
        {
            return;
        } else
        {
            super.a(h1, obj);
            return;
        }
    }

    protected final b.a b()
    {
        return c;
    }

    protected final Comparator d()
    {
        return b;
    }

}
