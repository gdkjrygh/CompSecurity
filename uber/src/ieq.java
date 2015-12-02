// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class ieq
    implements icd
{

    final ica a;
    final long b = 5L;
    final TimeUnit c;
    final ici d;

    public ieq(ica ica, TimeUnit timeunit, ici ici1)
    {
        a = ica;
        c = timeunit;
        d = ici1;
    }

    private ick a(ick ick1)
    {
        icj icj = d.a();
        ick1.a(icj);
        return new ick(ick1, icj, ick1) {

            boolean a;
            final icj b;
            final ick c;
            final ieq d;

            public final void a()
            {
                b.a(new idd(this) {

                    final _cls1 a;

                    public final void a()
                    {
                        if (!a.a)
                        {
                            a.a = true;
                            a.c.a();
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                }, d.b, d.c);
            }

            public final void a(Object obj)
            {
                b.a(new idd(this, obj) {

                    final Object a;
                    final _cls1 b;

                    public final void a()
                    {
                        if (!b.a)
                        {
                            b.c.a(a);
                        }
                    }

            
            {
                b = _pcls1;
                a = obj;
                super();
            }
                }, d.b, d.c);
            }

            public final void a(Throwable throwable)
            {
                b.a(new idd(this, throwable) {

                    final Throwable a;
                    final _cls1 b;

                    public final void a()
                    {
                        if (!b.a)
                        {
                            b.a = true;
                            b.c.a(a);
                            b.b.b();
                        }
                    }

            
            {
                b = _pcls1;
                a = throwable;
                super();
            }
                });
            }

            
            {
                d = ieq.this;
                b = icj1;
                c = ick2;
                super(ick1);
            }
        };
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
