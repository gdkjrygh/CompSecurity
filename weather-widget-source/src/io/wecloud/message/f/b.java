// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.f;

import io.wecloud.message.e.c;
import java.util.HashMap;

// Referenced classes of package io.wecloud.message.f:
//            a, c

class b
    implements Runnable
{

    final a a;

    private b(a a1)
    {
        a = a1;
        super();
    }

    b(a a1, b b1)
    {
        this(a1);
    }

    public void run()
    {
_L1:
        do
        {
            if (io.wecloud.message.f.a.a(a))
            {
                return;
            }
            c.b("MonitorTask", " is running...");
            Object obj = io.wecloud.message.f.a.b(a);
            long l = System.currentTimeMillis();
            long l1 = l - io.wecloud.message.f.a.c(a);
            if (l1 > 0L && l1 < io.wecloud.message.f.a.d(a) + 5000L)
            {
                a a1 = a;
                io.wecloud.message.f.a.a(a1, l1 + io.wecloud.message.f.a.e(a1));
            }
            Exception exception;
            if (((String) (obj)).equals(io.wecloud.message.f.a.f(a)))
            {
                if (io.wecloud.message.f.a.e(a) >= io.wecloud.message.f.a.g(a))
                {
                    io.wecloud.message.f.a.a(a, io.wecloud.message.f.a.f(a), io.wecloud.message.f.a.e(a), false);
                    io.wecloud.message.f.a.a(a, 0L);
                    io.wecloud.message.f.a.b(a, Math.min(io.wecloud.message.f.a.g(a) * 2L, io.wecloud.message.f.a.f()));
                }
            } else
            {
                io.wecloud.message.f.a.a(a, io.wecloud.message.f.a.f(a), io.wecloud.message.f.a.e(a), true);
                io.wecloud.message.f.a.a(a, 0L);
                io.wecloud.message.f.a.b(a, io.wecloud.message.f.a.g());
                io.wecloud.message.f.a.a(a, ((String) (obj)));
                if (!io.wecloud.message.f.a.h(a).containsKey(obj))
                {
                    io.wecloud.message.f.a.h(a).put(obj, new io.wecloud.message.f.c(a, ((String) (obj)), l));
                }
            }
            io.wecloud.message.f.a.c(a, l);
        } while (io.wecloud.message.f.a.a(a));
        obj = io.wecloud.message.f.a.i(a);
        obj;
        JVM INSTR monitorenter ;
        io.wecloud.message.f.a.i(a).wait(io.wecloud.message.f.a.d(a));
          goto _L1
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        InterruptedException interruptedexception;
        interruptedexception;
        interruptedexception.printStackTrace();
          goto _L1
    }
}
