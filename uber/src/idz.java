// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

final class idz extends ick
{

    final idy a;
    final int b;
    final AtomicLong c = new AtomicLong();
    boolean d;

    public idz(int i, int j, ick ick1, idy idy1)
    {
        super(ick1);
        d = false;
        b = i;
        a = idy1;
        a(j);
    }

    public final void a()
    {
        a.a(b, d);
    }

    public final void a(Object obj)
    {
        d = true;
        c.incrementAndGet();
        if (!a.a(b, obj))
        {
            a(1L);
        }
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }

    public final void b(long l)
    {
        long l1;
        long l2;
        do
        {
            l1 = c.get();
            l2 = Math.min(l1, l);
        } while (!c.compareAndSet(l1, l1 - l2));
        a(l2);
    }
}
