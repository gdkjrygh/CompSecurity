// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class ieh
    implements icc
{

    final long a;
    final TimeUnit b;
    final ici c;

    public ieh(long l, TimeUnit timeunit, ici ici1)
    {
        a = l;
        b = timeunit;
        c = ici1;
    }

    private void a(ick ick1)
    {
        icj icj1 = c.a();
        ick1.a(icj1);
        icj1.a(new idd(ick1) {

            final ick a;
            final ieh b;

            public final void a()
            {
                try
                {
                    a.a(Long.valueOf(0L));
                }
                catch (Throwable throwable)
                {
                    a.a(throwable);
                    return;
                }
                a.a();
            }

            
            {
                b = ieh.this;
                a = ick1;
                super();
            }
        }, a, b);
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
