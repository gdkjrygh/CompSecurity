// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.database.b.c;

final class b
    implements Runnable
{

    final String a;
    final a b;
    final Context c;
    final String d;
    final c e;

    b(String s, a a1, Context context, String s1, c c1)
    {
        a = s;
        b = a1;
        c = context;
        d = s1;
        e = c1;
        super();
    }

    public void run()
    {
        Object obj;
        String s;
        String s1;
        String s2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (TextUtils.isEmpty(a))
        {
            obj = String.valueOf(b.b());
        } else
        {
            obj = a;
        }
        i = b.b();
        j = b.c();
        k = b.e();
        l = b.d();
        s = b.f();
        s1 = b.m();
        s2 = com.jiubang.commerce.b.b.a(b.t(), b.d());
        i1 = b.u();
        com.jiubang.commerce.b.b.a(c, String.valueOf(k), String.valueOf(i1), ((String) (obj)), String.valueOf(j), s2, String.valueOf(l), d, s1);
        t.a(b);
        obj = e.a(s, String.valueOf(i));
        if (obj != null)
        {
            ((com.jiubang.commerce.database.a.c) (obj)).a(((com.jiubang.commerce.database.a.c) (obj)).d() + 1);
            e.b(((com.jiubang.commerce.database.a.c) (obj)));
            return;
        } else
        {
            com.jiubang.commerce.database.a.c c1 = new com.jiubang.commerce.database.a.c();
            c1.a(s);
            c1.b(String.valueOf(i));
            c1.c(String.valueOf(l));
            c1.a(1);
            c1.a(System.currentTimeMillis());
            e.a(c1);
            return;
        }
    }
}
