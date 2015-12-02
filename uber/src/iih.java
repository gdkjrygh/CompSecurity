// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class iih extends icj
    implements Runnable
{

    final Executor a;
    final iiy b = new iiy();
    final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    final AtomicInteger d = new AtomicInteger();

    public iih(Executor executor)
    {
        a = executor;
    }

    public final icl a(idd idd)
    {
        if (c())
        {
            idd = ijd.b();
        } else
        {
            ifz ifz1 = new ifz(idd, b);
            b.a(ifz1);
            c.offer(ifz1);
            idd = ifz1;
            if (d.getAndIncrement() == 0)
            {
                try
                {
                    a.execute(this);
                }
                // Misplaced declaration of an exception variable
                catch (idd idd)
                {
                    b.b(ifz1);
                    d.decrementAndGet();
                    iia.a().b();
                    throw idd;
                }
                return ifz1;
            }
        }
        return idd;
    }

    public final icl a(idd idd, long l, TimeUnit timeunit)
    {
        if (l <= 0L)
        {
            return a(idd);
        }
        if (c())
        {
            return ijd.b();
        }
        ScheduledExecutorService scheduledexecutorservice;
        iiz iiz1;
        icl icl;
        iiz iiz2;
        if (a instanceof ScheduledExecutorService)
        {
            scheduledexecutorservice = (ScheduledExecutorService)a;
        } else
        {
            scheduledexecutorservice = iii.a();
        }
        iiz1 = new iiz();
        iiz2 = new iiz();
        iiz2.a(iiz1);
        b.a(iiz2);
        icl = ijd.a(new idd(iiz2) {

            final iiz a;
            final iih b;

            public final void a()
            {
                b.b.b(a);
            }

            
            {
                b = iih.this;
                a = iiz1;
                super();
            }
        });
        idd = new ifz(new idd(iiz2, idd, icl) {

            final iiz a;
            final idd b;
            final icl c;
            final iih d;

            public final void a()
            {
                if (!a.c())
                {
                    icl icl1 = d.a(b);
                    a.a(icl1);
                    if (icl1.getClass() == ifz)
                    {
                        ((ifz)icl1).a(c);
                        return;
                    }
                }
            }

            
            {
                d = iih.this;
                a = iiz1;
                b = idd1;
                c = icl;
                super();
            }
        });
        iiz1.a(idd);
        try
        {
            idd.a(scheduledexecutorservice.schedule(idd, l, timeunit));
        }
        // Misplaced declaration of an exception variable
        catch (idd idd)
        {
            iia.a().b();
            throw idd;
        }
        return icl;
    }

    public final void b()
    {
        b.b();
    }

    public final boolean c()
    {
        return b.c();
    }

    public final void run()
    {
        do
        {
            ifz ifz1 = (ifz)c.poll();
            if (!ifz1.c())
            {
                ifz1.run();
            }
        } while (d.decrementAndGet() > 0);
    }
}
