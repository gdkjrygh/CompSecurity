// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.c;

import com.vividsolutions.jts.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.c.c:
//            c, a, b

public final class d
{

    private List a;
    private c b;
    private int c;

    public d()
    {
        a = new ArrayList();
        b = null;
        c = 0;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = b;
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj1;
        Collections.sort(a, new c.a());
        obj1 = a;
        obj = new ArrayList();
_L3:
        List list = ((List) (obj1));
        a(list, ((List) (obj)));
        if (((List) (obj)).size() != 1)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        b = (c)((List) (obj)).get(0);
          goto _L1
        obj;
        throw obj;
        obj1 = obj;
        obj = list;
          goto _L3
    }

    private void a(List list, List list1)
    {
        c = c + 1;
        list1.clear();
        int i = 0;
        while (i < list.size()) 
        {
            c c2 = (c)list.get(i);
            c c1;
            if (i + 1 < list.size())
            {
                c1 = (c)list.get(i);
            } else
            {
                c1 = null;
            }
            if (c1 == null)
            {
                list1.add(c2);
            } else
            {
                list1.add(new com.vividsolutions.jts.c.c.a((c)list.get(i), (c)list.get(i + 1)));
            }
            i += 2;
        }
    }

    public final void a(double d1, double d2, a a1)
    {
        if (b == null)
        {
            a();
        }
        b.a(d1, d2, a1);
    }

    public final void a(double d1, double d2, Object obj)
    {
        if (b != null)
        {
            throw new IllegalStateException("Index cannot be added to once it has been queried");
        } else
        {
            a.add(new b(d1, d2, obj));
            return;
        }
    }
}
