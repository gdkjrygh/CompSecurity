// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ProductGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class fxk
{

    private LinkedHashSet a;
    private List b;
    private fxm c;

    public fxk()
    {
        b = new ArrayList();
    }

    private static ProductGroup a(LinkedHashSet linkedhashset, ProductGroup productgroup)
    {
        for (linkedhashset = linkedhashset.iterator(); linkedhashset.hasNext();)
        {
            ProductGroup productgroup1 = (ProductGroup)linkedhashset.next();
            String s = productgroup.getGroupType();
            if (s != null && s.equals(productgroup1.getGroupType()) && !productgroup.equals(productgroup1))
            {
                return productgroup1;
            }
        }

        return null;
    }

    private boolean a(LinkedHashSet linkedhashset, LinkedHashSet linkedhashset1)
    {
        boolean flag;
        if (a == null)
        {
            a = new LinkedHashSet();
        } else
        {
            a.clear();
        }
        a.addAll(linkedhashset);
        linkedhashset1 = linkedhashset1.iterator();
        flag = false;
        while (linkedhashset1.hasNext()) 
        {
            ProductGroup productgroup = (ProductGroup)linkedhashset1.next();
            if (a(linkedhashset, productgroup) != null)
            {
                flag = true;
            } else
            {
                a.add(productgroup);
            }
        }
        return flag;
    }

    private static boolean a(List list)
    {
        return list == null || list.isEmpty();
    }

    private void b(List list)
    {
        if (a == null)
        {
            a = new LinkedHashSet(list);
        }
        c = fxm.a;
    }

    private void b(List list, List list1)
    {
        list1 = d(list1);
        list = new LinkedHashSet(list);
        boolean flag = a(list1, list);
        if (a.size() > list.size())
        {
            if (list.size() > 1)
            {
                c = fxm.d;
                return;
            } else
            {
                c = fxm.b;
                return;
            }
        }
        if (flag)
        {
            c = fxm.c;
            return;
        } else
        {
            c = fxm.a;
            return;
        }
    }

    private void c()
    {
        a = new LinkedHashSet();
        c = fxm.a;
    }

    private void c(List list)
    {
        a = d(list);
        if (a.size() > 1)
        {
            c = fxm.b;
            return;
        } else
        {
            c = fxm.a;
            return;
        }
    }

    private static LinkedHashSet d(List list)
    {
        Object obj = new LinkedHashSet();
        for (list = list.iterator(); list.hasNext(); ((LinkedHashSet) (obj)).add(new fxl((ProductGroup)list.next()))) { }
        list = new LinkedHashSet();
        obj = ((LinkedHashSet) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            list.add(((fxl)((Iterator) (obj)).next()).a());
        } while (list.size() < 4);
        return list;
    }

    public final fxm a()
    {
        return c;
    }

    public final void a(List list, List list1)
    {
        if (a(list) && a(list1))
        {
            c();
            return;
        }
        if (a(list))
        {
            c(list1);
            return;
        }
        if (a(list1))
        {
            b(list);
            return;
        } else
        {
            b(list, list1);
            return;
        }
    }

    public final List b()
    {
        b.clear();
        b.addAll(a);
        return b;
    }
}
