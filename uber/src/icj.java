// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public abstract class icj
    implements icl
{

    public icj()
    {
    }

    public static long a()
    {
        return System.currentTimeMillis();
    }

    public abstract icl a(idd idd);

    public final icl a(idd idd, long l, long l1, TimeUnit timeunit)
    {
        l1 = timeunit.toNanos(l1);
        long l2 = TimeUnit.MILLISECONDS.toNanos(a());
        long l3 = timeunit.toNanos(l);
        iiz iiz1 = new iiz();
        idd = new idd(iiz1, idd, l2 + l3, l1) {

            long a;
            final iiz b;
            final idd c;
            final long d;
            final long e;
            final icj f;

            public final void a()
            {
                if (!b.c())
                {
                    c.a();
                    long l4 = d;
                    long l5 = a + 1L;
                    a = l5;
                    long l6 = e;
                    b.a(f.a(this, (l4 + l5 * l6) - TimeUnit.MILLISECONDS.toNanos(icj.a()), TimeUnit.NANOSECONDS));
                }
            }

            
            {
                f = icj.this;
                b = iiz1;
                c = idd1;
                d = l;
                e = l1;
                super();
                a = 0L;
            }
        };
        iiz iiz2 = new iiz();
        iiz1.a(iiz2);
        iiz2.a(a(idd, l, timeunit));
        return iiz1;
    }

    public abstract icl a(idd idd, long l, TimeUnit timeunit);
}
