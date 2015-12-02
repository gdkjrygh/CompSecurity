// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class ief
    implements icc
{

    static final idi a = new idi() {

        private ica a(ica ica1)
        {
            return ica1.d(new idi(this) {

                final _cls1 a;

                private static iby a()
                {
                    return iby.a();
                }

                public final volatile Object a(Object obj)
                {
                    return a();
                }

            
            {
                a = _pcls1;
                super();
            }
            });
        }

        public final volatile Object a(Object obj)
        {
            return a((ica)obj);
        }

    };
    private final ica b;
    private final idi c;
    private final boolean d;
    private final boolean e;
    private final ici f;

    private ief(ica ica1, idi idi1, boolean flag, boolean flag1, ici ici1)
    {
        b = ica1;
        c = idi1;
        d = flag;
        e = flag1;
        f = ici1;
    }

    public static ica a(ica ica1, idi idi1)
    {
        return ica.a(new ief(ica1, idi1, true, false, iim.a()));
    }

    static ica a(ief ief1)
    {
        return ief1.b;
    }

    private void a(ick ick1)
    {
        AtomicBoolean atomicboolean = new AtomicBoolean(true);
        AtomicLong atomiclong = new AtomicLong(0L);
        icj icj1 = f.a();
        ick1.a(icj1);
        Object obj = new ijb();
        ick1.a(((icl) (obj)));
        iir iir1 = iir.m();
        iir1.b(ihw.a());
        ifs ifs1 = new ifs();
        obj = new idd(ick1, iir1, ifs1, atomiclong, ((ijb) (obj))) {

            final ick a;
            final iir b;
            final ifs c;
            final AtomicLong d;
            final ijb e;
            final ief f;

            public final void a()
            {
                if (a.c())
                {
                    return;
                } else
                {
                    ick ick2 = new ick(this) {

                        boolean a;
                        final _cls2 b;

                        private void e()
                        {
                            long l;
                            do
                            {
                                l = b.d.get();
                            } while (l != 0x7fffffffffffffffL && !b.d.compareAndSet(l, l - 1L));
                        }

                        public final void a()
                        {
                            if (!a)
                            {
                                a = true;
                                b();
                                b.b.a(iby.b());
                            }
                        }

                        public final void a(ich ich)
                        {
                            b.c.a(ich);
                        }

                        public final void a(Object obj)
                        {
                            if (!a)
                            {
                                b.a.a(obj);
                                e();
                                b.c.a();
                            }
                        }

                        public final void a(Throwable throwable)
                        {
                            if (!a)
                            {
                                a = true;
                                b();
                                b.b.a(iby.a(throwable));
                            }
                        }

            
            {
                b = _pcls2;
                super();
            }
                    };
                    e.a(ick2);
                    ief.a(f).a(ick2);
                    return;
                }
            }

            
            {
                f = ief.this;
                a = ick1;
                b = iir1;
                c = ifs1;
                d = atomiclong;
                e = ijb1;
                super();
            }
        };
        icj1.a(new idd((ica)c.a(iir1.a(new icd() {

            final ief a;

            private ick a(ick ick2)
            {
                return new ick(this, ick2, ick2) {

                    final ick a;
                    final _cls3 b;

                    private void a(iby iby1)
                    {
                        if (iby1.e() && ief.b(b.a))
                        {
                            a.a();
                            return;
                        }
                        if (iby1.d() && ief.c(b.a))
                        {
                            a.a(iby1.c());
                            return;
                        } else
                        {
                            a.a(iby1);
                            return;
                        }
                    }

                    public final void a()
                    {
                        a.a();
                    }

                    public final void a(ich ich1)
                    {
                        ich1.a(0x7fffffffffffffffL);
                    }

                    public final volatile void a(Object obj)
                    {
                        a((iby)obj);
                    }

                    public final void a(Throwable throwable)
                    {
                        a.a(throwable);
                    }

            
            {
                b = _pcls3;
                a = ick2;
                super(ick1);
            }
                };
            }

            public final volatile Object a(Object obj1)
            {
                return a((ick)obj1);
            }

            
            {
                a = ief.this;
                super();
            }
        })), ick1, atomiclong, icj1, ((idd) (obj)), atomicboolean) {

            final ica a;
            final ick b;
            final AtomicLong c;
            final icj d;
            final idd e;
            final AtomicBoolean f;
            final ief g;

            public final void a()
            {
                a.a(new ick(this, b) {

                    final _cls4 a;

                    public final void a()
                    {
                        a.b.a();
                    }

                    public final void a(ich ich1)
                    {
                        ich1.a(0x7fffffffffffffffL);
                    }

                    public final void a(Object obj)
                    {
label0:
                        {
                            if (!a.b.c())
                            {
                                if (a.c.get() <= 0L)
                                {
                                    break label0;
                                }
                                a.d.a(a.e);
                            }
                            return;
                        }
                        a.f.compareAndSet(false, true);
                    }

                    public final void a(Throwable throwable)
                    {
                        a.b.a(throwable);
                    }

            
            {
                a = _pcls4;
                super(ick1);
            }
                });
            }

            
            {
                g = ief.this;
                a = ica1;
                b = ick1;
                c = atomiclong;
                d = icj1;
                e = idd1;
                f = atomicboolean;
                super();
            }
        });
        ick1.a(new ich(atomiclong, ifs1, atomicboolean, icj1, ((idd) (obj))) {

            final AtomicLong a;
            final ifs b;
            final AtomicBoolean c;
            final icj d;
            final idd e;
            final ief f;

            public final void a(long l)
            {
                if (l > 0L)
                {
                    idq.a(a, l);
                    b.a(l);
                    if (c.compareAndSet(true, false))
                    {
                        d.a(e);
                    }
                }
            }

            
            {
                f = ief.this;
                a = atomiclong;
                b = ifs1;
                c = atomicboolean;
                d = icj1;
                e = idd;
                super();
            }
        });
    }

    public static ica b(ica ica1, idi idi1)
    {
        return ica.a(new ief(ica1, idi1, false, true, iim.a()));
    }

    static boolean b(ief ief1)
    {
        return ief1.d;
    }

    static boolean c(ief ief1)
    {
        return ief1.e;
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }

}
