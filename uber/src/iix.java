// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class iix
    implements icl
{

    static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(iix, "a");
    volatile int a;
    private final idd c;

    public iix()
    {
        c = null;
    }

    private iix(idd idd1)
    {
        c = idd1;
    }

    public static iix a()
    {
        return new iix();
    }

    public static iix a(idd idd1)
    {
        return new iix(idd1);
    }

    public final void b()
    {
        if (b.compareAndSet(this, 0, 1) && c != null)
        {
            c.a();
        }
    }

    public final boolean c()
    {
        return a != 0;
    }

}
