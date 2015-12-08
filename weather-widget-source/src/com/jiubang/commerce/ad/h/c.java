// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.h;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.e.ac;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.i.a;
import com.jiubang.commerce.ad.i.b;

// Referenced classes of package com.jiubang.commerce.ad.h:
//            a

public class c
{

    private Context a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j[];
    private Integer k[];
    private String l;
    private Integer m;
    private String n;
    private int o;
    private boolean p;
    private af q;
    private ac r;
    private b s;
    private a t;

    public c(Context context, int i1, String s1, af af)
    {
        c = 0;
        i = true;
        o = -1;
        p = true;
        a = context;
        b = i1;
        context = s1;
        if (TextUtils.isEmpty(s1))
        {
            context = String.valueOf(i1);
        }
        n = context;
        q = af;
    }

    static Context a(c c1)
    {
        return c1.a;
    }

    static int b(c c1)
    {
        return c1.b;
    }

    static int c(c c1)
    {
        return c1.c;
    }

    static boolean d(c c1)
    {
        return c1.d;
    }

    static boolean e(c c1)
    {
        return c1.e;
    }

    static boolean f(c c1)
    {
        return c1.f;
    }

    static boolean g(c c1)
    {
        return c1.g;
    }

    static boolean h(c c1)
    {
        return c1.h;
    }

    static boolean i(c c1)
    {
        return c1.i;
    }

    static int[] j(c c1)
    {
        return c1.j;
    }

    static Integer[] k(c c1)
    {
        return c1.k;
    }

    static String l(c c1)
    {
        return c1.l;
    }

    static Integer m(c c1)
    {
        return c1.m;
    }

    static String n(c c1)
    {
        return c1.n;
    }

    static int o(c c1)
    {
        return c1.o;
    }

    static boolean p(c c1)
    {
        return c1.p;
    }

    static af q(c c1)
    {
        return c1.q;
    }

    static ac r(c c1)
    {
        return c1.r;
    }

    static b s(c c1)
    {
        return c1.s;
    }

    static a t(c c1)
    {
        return c1.t;
    }

    public com.jiubang.commerce.ad.h.a a()
    {
        return new com.jiubang.commerce.ad.h.a(this, null);
    }

    public c a(int i1)
    {
        c = i1;
        return this;
    }

    public c a(boolean flag)
    {
        d = flag;
        return this;
    }

    public c b(boolean flag)
    {
        e = flag;
        return this;
    }

    public c c(boolean flag)
    {
        f = flag;
        return this;
    }

    public c d(boolean flag)
    {
        g = flag;
        return this;
    }

    public c e(boolean flag)
    {
        h = flag;
        return this;
    }
}
