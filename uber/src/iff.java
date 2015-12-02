// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iff
    implements icd
{

    private final idi a;

    public iff(idi idi)
    {
        a = idi;
    }

    private ick a(ick ick1)
    {
        ifs ifs1 = new ifs();
        ijb ijb1 = new ijb();
        ick ick2 = new ick(ick1, ifs1, ijb1) {

            final ick a;
            final ifs b;
            final ijb c;
            final iff d;
            private boolean e;

            public final void a()
            {
                if (e)
                {
                    return;
                } else
                {
                    e = true;
                    a.a();
                    return;
                }
            }

            public final void a(ich ich)
            {
                b.a(ich);
            }

            public final void a(Object obj)
            {
                if (e)
                {
                    return;
                } else
                {
                    a.a(obj);
                    return;
                }
            }

            public final void a(Throwable throwable)
            {
                if (e)
                {
                    icw.a(throwable);
                    return;
                }
                e = true;
                try
                {
                    iia.a().b();
                    b();
                    ick ick3 = new ick(this) {

                        final _cls1 a;

                        public final void a()
                        {
                            a.a.a();
                        }

                        public final void a(ich ich)
                        {
                            a.b.a(ich);
                        }

                        public final void a(Object obj)
                        {
                            a.a.a(obj);
                        }

                        public final void a(Throwable throwable)
                        {
                            a.a.a(throwable);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    };
                    c.a(ick3);
                    ((ica)iff.a(d).a(throwable)).a(ick3);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable)
                {
                    a.a(throwable);
                }
            }

            
            {
                d = iff.this;
                a = ick1;
                b = ifs1;
                c = ijb1;
                super();
                e = false;
            }
        };
        ick1.a(ijb1);
        ijb1.a(ick2);
        ick1.a(ifs1);
        return ick2;
    }

    static idi a(iff iff1)
    {
        return iff1.a;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
