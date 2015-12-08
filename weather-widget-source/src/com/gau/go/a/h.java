// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.a.a;
import com.gau.go.a.a.b;
import com.gau.go.a.f.e;
import java.util.Map;

// Referenced classes of package com.gau.go.a:
//            e, c

class h
    implements Runnable
{

    final int a;
    final int b;
    final b c[];
    final String d;
    final c e;
    final com.gau.go.a.e f;

    h(com.gau.go.a.e e1, int i, int j, b ab[], String s, c c1)
    {
        f = e1;
        a = i;
        b = j;
        c = ab;
        d = s;
        e = c1;
        super();
    }

    public void run()
    {
        if (com.gau.go.a.e.a(f, a, b) || com.gau.go.a.e.a(f, c))
        {
            a a1 = new a(System.currentTimeMillis() + 0xf4240L, 0L, "2014103", "", b, System.currentTimeMillis(), 0, 0);
            com.gau.go.a.e.a(f, a1, a, b, d, e, c);
            return;
        }
        if (com.gau.go.a.e.i(f).get(String.valueOf(b)) != null)
        {
            a a2 = (a)com.gau.go.a.e.i(f).get(String.valueOf(b));
            com.gau.go.a.e.a(f, a2, a, b, d, e, c);
            return;
        } else
        {
            com.gau.go.a.f.e.a((new StringBuilder()).append("this funid's switch is closed, funid=").append(b).append(", please make sure the switch has been opened.").toString());
            return;
        }
    }
}
