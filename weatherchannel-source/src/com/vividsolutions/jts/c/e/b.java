// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.e;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.c.e:
//            a, c, d

public abstract class b
    implements Serializable
{
    public static class a
    {

        public boolean a(Object obj, Object obj1)
        {
            return ((h)obj).c((h)obj1);
        }

        a()
        {
        }
    }


    private static final long serialVersionUID = 0xca109b37d2b3ab47L;
    private com.vividsolutions.jts.c.e.a a;
    private boolean b;
    private ArrayList c;
    private int d;

    public b(int i)
    {
        boolean flag = true;
        super();
        b = false;
        c = new ArrayList();
        if (i <= 1)
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, "Node capacity must be greater than 1");
        d = i;
    }

    protected static int a(double d1, double d2)
    {
        if (d1 > d2)
        {
            return 1;
        }
        return d1 >= d2 ? 0 : -1;
    }

    private static com.vividsolutions.jts.c.e.a a(List list)
    {
        return (com.vividsolutions.jts.c.e.a)list.get(list.size() - 1);
    }

    private List a(com.vividsolutions.jts.c.e.a a1)
    {
        ArrayList arraylist = new ArrayList();
        a1 = a1.a().iterator();
        do
        {
            if (!a1.hasNext())
            {
                break;
            }
            Object obj = (c)a1.next();
            if (obj instanceof com.vividsolutions.jts.c.e.a)
            {
                obj = a((com.vividsolutions.jts.c.e.a)obj);
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            } else
            if (obj instanceof d)
            {
                arraylist.add(((d)obj).a());
            } else
            {
                com.vividsolutions.jts.a.a.a(null);
            }
        } while (true);
        if (arraylist.size() <= 0)
        {
            return null;
        } else
        {
            return arraylist;
        }
    }

    private void a(Object obj, com.vividsolutions.jts.c.e.a a1, com.vividsolutions.jts.c.a a2)
    {
        a1 = a1.a();
        int i = 0;
        while (i < a1.size()) 
        {
            c c1 = (c)a1.get(i);
            if (b().a(c1.c(), obj))
            {
                if (c1 instanceof com.vividsolutions.jts.c.e.a)
                {
                    a(obj, (com.vividsolutions.jts.c.e.a)c1, a2);
                } else
                if (c1 instanceof d)
                {
                    a2.a(((d)c1).a());
                } else
                {
                    com.vividsolutions.jts.a.a.a(null);
                }
            }
            i++;
        }
    }

    private void a(Object obj, com.vividsolutions.jts.c.e.a a1, List list)
    {
        a1 = a1.a();
        int i = 0;
        while (i < a1.size()) 
        {
            c c1 = (c)a1.get(i);
            if (b().a(c1.c(), obj))
            {
                if (c1 instanceof com.vividsolutions.jts.c.e.a)
                {
                    a(obj, (com.vividsolutions.jts.c.e.a)c1, list);
                } else
                if (c1 instanceof d)
                {
                    list.add(((d)c1).a());
                } else
                {
                    com.vividsolutions.jts.a.a.a(null);
                }
            }
            i++;
        }
    }

    private com.vividsolutions.jts.c.e.a b(List list, int i)
    {
        do
        {
            boolean flag;
            if (!list.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.vividsolutions.jts.a.a.a(flag, null);
            list = a(list, i + 1);
            if (list.size() == 1)
            {
                return (com.vividsolutions.jts.c.e.a)list.get(0);
            }
            i++;
        } while (true);
    }

    private void e()
    {
        if (b)
        {
            return;
        }
        com.vividsolutions.jts.c.e.a a1;
        if (c.isEmpty())
        {
            a1 = a(0);
        } else
        {
            a1 = b(c, -1);
        }
        a = a1;
        c = null;
        b = true;
    }

    private boolean f()
    {
        if (!b)
        {
            return c.isEmpty();
        } else
        {
            return a.d();
        }
    }

    public final int a()
    {
        return d;
    }

    protected abstract com.vividsolutions.jts.c.e.a a(int i);

    protected final List a(Object obj)
    {
        e();
        ArrayList arraylist;
        for (arraylist = new ArrayList(); f() || !b().a(a.c(), obj);)
        {
            return arraylist;
        }

        a(obj, a, ((List) (arraylist)));
        return arraylist;
    }

    protected List a(List list, int i)
    {
        ArrayList arraylist;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, null);
        arraylist = new ArrayList();
        arraylist.add(a(i));
        list = new ArrayList(list);
        Collections.sort(list, d());
        c c1;
        for (list = list.iterator(); list.hasNext(); a(((List) (arraylist))).a(c1))
        {
            c1 = (c)list.next();
            if (a(((List) (arraylist))).a().size() == d)
            {
                arraylist.add(a(i));
            }
        }

        return arraylist;
    }

    protected final void a(Object obj, com.vividsolutions.jts.c.a a1)
    {
        e();
        while (f() || !b().a(a.c(), obj)) 
        {
            return;
        }
        a(obj, a, a1);
    }

    protected final void a(Object obj, Object obj1)
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, "Cannot insert items into an STR packed R-tree after it has been built.");
        c.add(new d(obj, obj1));
    }

    protected abstract a b();

    public final List c()
    {
        e();
        List list = a(a);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        return ((List) (obj));
    }

    protected abstract Comparator d();
}
