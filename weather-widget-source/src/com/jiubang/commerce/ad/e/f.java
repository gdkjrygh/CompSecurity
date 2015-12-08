// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.h.a;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            m, af, a

class f
    implements m
{

    final com.jiubang.commerce.ad.b.a.f a;
    final af b;
    final a c;
    final List d;
    final int e;
    final int f;
    final boolean g;
    final com.jiubang.commerce.ad.e.a h;

    f(com.jiubang.commerce.ad.e.a a1, com.jiubang.commerce.ad.b.a.f f1, af af1, a a2, List list, int i, int j, 
            boolean flag)
    {
        h = a1;
        a = f1;
        b = af1;
        c = a2;
        d = list;
        e = i;
        f = j;
        g = flag;
        super();
    }

    public void a(com.jiubang.commerce.ad.i.a.a a1)
    {
        a1 = new b();
        a1.a(a);
        b.a(false, a1);
    }

    public void a(Object obj)
    {
        b.a(obj);
    }

    public void b(Object obj)
    {
        b.c(obj);
    }

    public void c(Object obj)
    {
        b.b(obj);
    }
}
