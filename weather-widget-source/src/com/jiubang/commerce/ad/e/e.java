// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.i.a.a;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            m, a, af

class e
    implements m
{

    final f a;
    final com.jiubang.commerce.ad.h.a b;
    final List c;
    final int d;
    final int e;
    final boolean f;
    final af g;
    final com.jiubang.commerce.ad.e.a h;

    e(com.jiubang.commerce.ad.e.a a1, f f1, com.jiubang.commerce.ad.h.a a2, List list, int i, int j, boolean flag, 
            af af1)
    {
        h = a1;
        a = f1;
        b = a2;
        c = list;
        d = i;
        e = j;
        f = flag;
        g = af1;
        super();
    }

    public void a(a a1)
    {
        Object obj = null;
        List list;
        b b1;
        if (a1 != null)
        {
            list = a1.a();
        } else
        {
            list = null;
        }
        b1 = obj;
        if (list != null)
        {
            b1 = obj;
            if (!list.isEmpty())
            {
                b1 = new b();
                b1.a(a1);
                b1.a(a);
            }
        }
        com.jiubang.commerce.ad.e.a.a(h, b, c, d, e, f, b1, g);
    }

    public void a(Object obj)
    {
        g.a(obj);
    }

    public void b(Object obj)
    {
        g.c(obj);
    }

    public void c(Object obj)
    {
        g.b(obj);
    }
}
