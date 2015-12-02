// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

final class t> extends ick
{

    final g.Throwable a;

    public final void a()
    {
        a.a.a();
    }

    public final void a(ich ich1)
    {
        ich1.a(0x7fffffffffffffffL);
    }

    public final void a(Object obj)
    {
label0:
        {
            if (!a.a.c())
            {
                if (a.a.get() <= 0L)
                {
                    break label0;
                }
                a.a.a(a.a);
            }
            return;
        }
        a.a.compareAndSet(false, true);
    }

    public final void a(Throwable throwable)
    {
        a.a.a(throwable);
    }

    ( , ick ick1)
    {
        a = ;
        super(ick1);
    }

    // Unreferenced inner class ief$4

/* anonymous class */
    final class ief._cls4
        implements idd
    {

        final ica a;
        final ick b;
        final AtomicLong c;
        final icj d;
        final idd e;
        final AtomicBoolean f;
        final ief g;

        public final void a()
        {
            a.a(new ief._cls4._cls1(this, b));
        }

            
            {
                g = ief1;
                a = ica1;
                b = ick1;
                c = atomiclong;
                d = icj1;
                e = idd1;
                f = atomicboolean;
                super();
            }
    }

}
