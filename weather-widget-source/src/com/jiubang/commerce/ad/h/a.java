// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.h;

import android.content.Context;
import com.jiubang.commerce.ad.d;
import com.jiubang.commerce.ad.e.ac;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.i.b;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.h:
//            c, b

public class a
{

    public final Context a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j[];
    public final Integer k[];
    public final String l;
    public final Integer m;
    public final String n;
    public final boolean o;
    public final af p;
    public final ac q;
    public final b r;
    public final com.jiubang.commerce.ad.i.a s;
    private int t;

    private a(c c1)
    {
        t = -1;
        a = com.jiubang.commerce.ad.h.c.a(c1);
        b = com.jiubang.commerce.ad.h.c.b(c1);
        c = com.jiubang.commerce.ad.h.c.c(c1);
        d = com.jiubang.commerce.ad.h.c.d(c1);
        e = com.jiubang.commerce.ad.h.c.e(c1);
        f = com.jiubang.commerce.ad.h.c.f(c1);
        g = com.jiubang.commerce.ad.h.c.g(c1);
        h = com.jiubang.commerce.ad.h.c.h(c1);
        i = com.jiubang.commerce.ad.h.c.i(c1);
        int ai[] = null;
        if (j.a)
        {
            ai = com.jiubang.commerce.ad.d.a().a(com.jiubang.commerce.ad.h.c.b(c1));
        }
        if (ai != null)
        {
            j = ai;
        } else
        {
            j = com.jiubang.commerce.ad.h.c.j(c1);
        }
        k = com.jiubang.commerce.ad.h.c.k(c1);
        l = com.jiubang.commerce.ad.h.c.l(c1);
        m = com.jiubang.commerce.ad.h.c.m(c1);
        n = com.jiubang.commerce.ad.h.c.n(c1);
        t = com.jiubang.commerce.ad.h.c.o(c1);
        o = com.jiubang.commerce.ad.h.c.p(c1);
        p = com.jiubang.commerce.ad.h.c.q(c1);
        q = com.jiubang.commerce.ad.h.c.r(c1);
        r = com.jiubang.commerce.ad.h.c.s(c1);
        s = com.jiubang.commerce.ad.h.c.t(c1);
    }

    a(c c1, com.jiubang.commerce.ad.h.b b1)
    {
        this(c1);
    }

    public int a()
    {
        return t;
    }
}
