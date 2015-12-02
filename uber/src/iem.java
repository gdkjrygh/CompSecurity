// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

class iem extends ick
{

    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(iem, "c");
    private final ick a;
    private final ieo b;
    private volatile int c;
    private final ifs e;

    public iem(ieo ieo1, ick ick1, ifs ifs1)
    {
        c = 0;
        b = ieo1;
        a = ick1;
        e = ifs1;
    }

    public final void a()
    {
        if (d.compareAndSet(this, 0, 1))
        {
            b.e();
        }
    }

    public final void a(ich ich)
    {
        e.a(ich);
    }

    public final void a(Object obj)
    {
        a.a(obj);
        ieo.a(b);
        e.a();
    }

    public final void a(Throwable throwable)
    {
        if (d.compareAndSet(this, 0, 1))
        {
            b.a(throwable);
        }
    }

}
