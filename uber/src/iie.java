// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class iie extends icj
{

    static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(iie, "a");
    volatile int a;
    private final iiy c = new iiy();
    private final iif d;

    iie(iif iif1)
    {
        d = iif1;
    }

    public final icl a(idd idd)
    {
        return a(idd, 0L, null);
    }

    public final icl a(idd idd, long l, TimeUnit timeunit)
    {
        if (c.c())
        {
            return ijd.b();
        } else
        {
            idd = d.b(idd, l, timeunit);
            c.a(idd);
            idd.a(c);
            return idd;
        }
    }

    public final void b()
    {
        if (b.compareAndSet(this, 0, 1))
        {
            iid.c().a(d);
        }
        c.b();
    }

    public final boolean c()
    {
        return c.c();
    }

}
