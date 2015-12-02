// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

class iip extends icj
    implements icl
{

    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(iip, "a");
    volatile int a;
    private final PriorityBlockingQueue c;
    private final iix d;
    private final AtomicInteger e;

    private iip()
    {
        c = new PriorityBlockingQueue();
        d = new iix();
        e = new AtomicInteger();
    }

    iip(byte byte0)
    {
        this();
    }

    private icl a(idd idd1, long l)
    {
        if (d.c())
        {
            return ijd.b();
        }
        idd1 = new iiq(idd1, Long.valueOf(l), b.incrementAndGet(this), (byte)0);
        c.add(idd1);
        if (e.getAndIncrement() == 0)
        {
            do
            {
                idd1 = (iiq)c.poll();
                if (idd1 != null)
                {
                    ((iiq) (idd1)).a.a();
                }
            } while (e.decrementAndGet() > 0);
            return ijd.b();
        } else
        {
            return ijd.a(new idd(idd1) {

                final iiq a;
                final iip b;

                public final void a()
                {
                    iip.a(b).remove(a);
                }

            
            {
                b = iip.this;
                a = iiq1;
                super();
            }
            });
        }
    }

    static PriorityBlockingQueue a(iip iip1)
    {
        return iip1.c;
    }

    public final icl a(idd idd1)
    {
        return a(idd1, a());
    }

    public final icl a(idd idd1, long l, TimeUnit timeunit)
    {
        l = a() + timeunit.toMillis(l);
        return a(((idd) (new iin(idd1, this, l))), l);
    }

    public final void b()
    {
        d.b();
    }

    public final boolean c()
    {
        return d.c();
    }

}
