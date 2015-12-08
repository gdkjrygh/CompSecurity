// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.e.a;

// Referenced classes of package com.gau.go.a:
//            e, k

class l
    implements Runnable
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void run()
    {
        if (e.c == null || e.c.equals(e.b))
        {
            e.o(a.a);
            if (e.p(a.a) && !e.q(a.a))
            {
                a a1 = new a(e.b(a.a), 0L, 0x1bc07e0L);
                a(a.a, a1);
            }
        }
    }
}
