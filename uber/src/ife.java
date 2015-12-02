// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class ife
    implements icl
{

    static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ife, "b");
    final icj a;
    volatile int b;
    volatile boolean d;

    public ife(icj icj1)
    {
        d = false;
        a = icj1;
    }

    public final void b()
    {
        if (c.getAndSet(this, 1) == 0)
        {
            a.a(new idd() {

                final ife a;

                public final void a()
                {
                    a.a.b();
                    a.d = true;
                }

            
            {
                a = ife.this;
                super();
            }
            });
        }
    }

    public final boolean c()
    {
        return d;
    }

}
