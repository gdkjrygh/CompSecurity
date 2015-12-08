// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.utils.j;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            m, a, af

class g
    implements m
{

    final int a;
    final f b;
    final com.jiubang.commerce.ad.h.a c;
    final List d;
    final int e;
    final int f;
    final boolean g;
    final af h;
    final com.jiubang.commerce.ad.e.a i;

    g(com.jiubang.commerce.ad.e.a a1, int k, f f1, com.jiubang.commerce.ad.h.a a2, List list, int l, int i1, 
            boolean flag, af af1)
    {
        i = a1;
        a = k;
        b = f1;
        c = a2;
        d = list;
        e = l;
        f = i1;
        g = flag;
        h = af1;
        super();
    }

    public void a(a a1)
    {
        Object obj;
        if (a1 != null)
        {
            obj = a1.a();
        } else
        {
            obj = null;
        }
        if (j.a)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("[vmId:").append(a).append("]loadSingleAdSourceInfo(LoopMe--onFinish, virtualModuleId:").append(a).append(", adCount:");
            int k;
            if (obj != null)
            {
                k = ((List) (obj)).size();
            } else
            {
                k = -1;
            }
            j.b("Ad_SDK", stringbuilder.append(k).append(")").toString());
        }
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = new b();
            ((b) (obj)).a(a1);
            ((b) (obj)).a(b);
            a1 = ((a) (obj));
        } else
        {
            a1 = null;
        }
        com.jiubang.commerce.ad.e.a.a(i, c, d, e, f, g, a1, h);
    }

    public void a(Object obj)
    {
        h.a(obj);
    }

    public void b(Object obj)
    {
        h.c(obj);
    }

    public void c(Object obj)
    {
        h.b(obj);
    }
}
