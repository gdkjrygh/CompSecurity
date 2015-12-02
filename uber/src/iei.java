// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class iei
    implements icc
{

    final long a = 4L;
    final long b = 4L;
    final TimeUnit c;
    final ici d;

    public iei(TimeUnit timeunit, ici ici1)
    {
        c = timeunit;
        d = ici1;
    }

    private void a(ick ick1)
    {
        icj icj1 = d.a();
        ick1.a(icj1);
        icj1.a(new idd(ick1, icj1) {

            long a;
            final ick b;
            final icj c;
            final iei d;

            public final void a()
            {
                ick ick2 = b;
                long l = a;
                a = 1L + l;
                ick2.a(Long.valueOf(l));
                return;
                Object obj;
                obj;
                b.a(((Throwable) (obj)));
                c.b();
                return;
                obj;
                c.b();
                throw obj;
            }

            
            {
                d = iei.this;
                b = ick1;
                c = icj1;
                super();
            }
        }, a, b, c);
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
