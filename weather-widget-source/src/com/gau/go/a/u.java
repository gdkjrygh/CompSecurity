// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.a.c;
import com.gau.go.a.f.e;

// Referenced classes of package com.gau.go.a:
//            e

class u
    implements Runnable
{

    final String a;
    final int b;
    final String c;
    final com.gau.go.a.e d;

    u(com.gau.go.a.e e1, String s, int i, String s1)
    {
        d = e1;
        a = s;
        b = i;
        c = s1;
        super();
    }

    public void run()
    {
        if (a != null)
        {
            c c1 = new c();
            c1.j = b;
            c1.i = c;
            c1.b = e.k(d);
            c1.h = a;
            c1.q = true;
            c1.k = e.a(System.currentTimeMillis());
            c1.r = 0;
            e.a(d, c1, true, null);
        }
    }
}
