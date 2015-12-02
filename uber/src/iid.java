// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class iid
{

    private static iid d;
    private final long a;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private final ScheduledExecutorService c = Executors.newScheduledThreadPool(1, iic.c());

    private iid(TimeUnit timeunit)
    {
        a = timeunit.toNanos(60L);
        c.scheduleWithFixedDelay(new Runnable() {

            final iid a;

            public final void run()
            {
                a.b();
            }

            
            {
                a = iid.this;
                super();
            }
        }, a, a, TimeUnit.NANOSECONDS);
    }

    static iid c()
    {
        return d;
    }

    private static long d()
    {
        return System.nanoTime();
    }

    final iif a()
    {
        while (!b.isEmpty()) 
        {
            iif iif1 = (iif)b.poll();
            if (iif1 != null)
            {
                return iif1;
            }
        }
        return new iif(iic.d());
    }

    final void a(iif iif1)
    {
        iif1.a(d() + a);
        b.offer(iif1);
    }

    final void b()
    {
        if (!b.isEmpty())
        {
            long l = d();
            Iterator iterator = b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                iif iif1 = (iif)iterator.next();
                if (iif1.e() > l)
                {
                    break;
                }
                if (b.remove(iif1))
                {
                    iif1.b();
                }
            } while (true);
        }
    }

    static 
    {
        d = new iid(TimeUnit.SECONDS);
    }
}
