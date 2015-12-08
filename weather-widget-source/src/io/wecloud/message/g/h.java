// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import io.wecloud.message.e.a;
import io.wecloud.message.e.b;
import io.wecloud.message.e.c;

// Referenced classes of package io.wecloud.message.g:
//            m, e, k, c, 
//            b, d

class h extends Thread
{

    final e a;
    private final String b;
    private final int c;

    h(e e1, String s, int i)
    {
        a = e1;
        b = s;
        c = i;
        super();
    }

    public void run()
    {
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("connect ")).append(b).append(":").append(c).toString());
        io.wecloud.message.g.e.a(a, new m(b, c, a));
        io.wecloud.message.g.e.c(a).a();
        io.wecloud.message.g.e.b(a).a(io.wecloud.message.e.a.b());
        e.d(a).b();
        e.e(a).a(io.wecloud.message.g.b.a(io.wecloud.message.g.e.a(a)));
_L1:
        return;
        Exception exception;
        exception;
        io.wecloud.message.e.c.d("CSH", "\u521B\u5EFAsocket\u8FDE\u63A5\u5931\u8D25");
        io.wecloud.message.e.c.d("CSH", exception.getMessage());
        boolean flag = io.wecloud.message.c.a.z(io.wecloud.message.g.e.a(a));
        int i = io.wecloud.message.c.a.A(io.wecloud.message.g.e.a(a));
        io.wecloud.message.c.a.g(io.wecloud.message.g.e.a(a), true);
        io.wecloud.message.c.a.g(io.wecloud.message.g.e.a(a), i + 1);
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("isFailed = ")).append(flag).append(", count = ").append(i).toString());
        if (flag && i >= 5)
        {
            io.wecloud.message.c.a.b(io.wecloud.message.g.e.a(a), "");
            io.wecloud.message.a.b.a();
            io.wecloud.message.c.a.g(io.wecloud.message.g.e.a(a), false);
            io.wecloud.message.c.a.g(io.wecloud.message.g.e.a(a), 0);
        }
        a.d();
        if (!flag)
        {
            io.wecloud.message.g.e.b(a).a(io.wecloud.message.e.a.a(2, exception.getMessage()));
            return;
        }
          goto _L1
    }
}
