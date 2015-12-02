// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifn
    implements icd
{

    private final ici a;

    public ifn(ici ici1)
    {
        a = ici1;
    }

    private ick a(ick ick1)
    {
        icj icj = a.a();
        ick1.a(icj);
        return new ick(ick1, ick1, icj) {

            final ick a;
            final icj b;
            final ifn c;

            private void a(ica ica1)
            {
                b.a(new idd(this, ica1) {

                    final ica a;
                    final _cls1 b;

                    public final void a()
                    {
                        Thread thread = Thread.currentThread();
                        a.a(new ick(this, b.a, thread) {

                            final Thread a;
                            final _cls1 b;

                            public final void a()
                            {
                                b.b.a.a();
                            }

                            public final void a(ich ich)
                            {
                                b.b.a.a(new ich(this, ich) {

                                    final ich a;
                                    final _cls1 b;

                                    public final void a(long l)
                                    {
                                        if (Thread.currentThread() == b.a)
                                        {
                                            a.a(l);
                                            return;
                                        } else
                                        {
                                            b.b.b.b.a(new idd(this, l) {

                                                final long a;
                                                final _cls1 b;

                                                public final void a()
                                                {
                                                    b.a.a(a);
                                                }

            
            {
                b = _pcls1;
                a = l;
                super();
            }
                                            });
                                            return;
                                        }
                                    }

            
            {
                b = _pcls1;
                a = ich1;
                super();
            }
                                });
                            }

                            public final void a(Object obj)
                            {
                                b.b.a.a(obj);
                            }

                            public final void a(Throwable throwable)
                            {
                                b.b.a.a(throwable);
                            }

            
            {
                b = _pcls1;
                a = thread;
                super(ick1);
            }
                        });
                    }

            
            {
                b = _pcls1;
                a = ica1;
                super();
            }
                });
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                a((ica)obj);
            }

            public final void a(Throwable throwable)
            {
                a.a(throwable);
            }

            
            {
                c = ifn.this;
                a = ick2;
                b = icj1;
                super(ick1);
            }
        };
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
