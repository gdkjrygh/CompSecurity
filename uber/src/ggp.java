// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggp
    implements gha
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;
    private hzb i;
    private hzb j;
    private hzb k;
    private hzb l;
    private hzb m;
    private hsr n;

    private ggp(ggq ggq1)
    {
        if (!a && ggq1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggq1);
            return;
        }
    }

    ggp(ggq ggq1, byte byte0)
    {
        this(ggq1);
    }

    public static ggq a()
    {
        return new ggq((byte)0);
    }

    private void a(ggq ggq1)
    {
        b = new hst(ggq1) {

            final ggq a;
            final ggp b;

            private cev b()
            {
                cev cev = ggq.a(a).D();
                if (cev == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cev;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggp.this;
                a = ggq1;
                super();
            }
        };
        c = hsw.a(djd.a(ggq.b(ggq1), b));
        d = new hst(ggq1) {

            final ggq a;
            final ggp b;

            private chp b()
            {
                chp chp = ggq.a(a).e();
                if (chp == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chp;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggp.this;
                a = ggq1;
                super();
            }
        };
        e = hsw.a(djc.a(ggq.b(ggq1), d));
        f = hsw.a(dje.a(ggq.b(ggq1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggq1) {

            final ggq a;
            final ggp b;

            private gju b()
            {
                gju gju = ggq.a(a).H();
                if (gju == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gju;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggp.this;
                a = ggq1;
                super();
            }
        };
        j = new hst(ggq1) {

            final ggq a;
            final ggp b;

            private hkr b()
            {
                hkr hkr = ggq.a(a).aP();
                if (hkr == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkr;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggp.this;
                a = ggq1;
                super();
            }
        };
        k = new hst(ggq1) {

            final ggq a;
            final ggp b;

            private gmg b()
            {
                gmg gmg = ggq.a(a).f();
                if (gmg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gmg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggp.this;
                a = ggq1;
                super();
            }
        };
        l = new hst(ggq1) {

            final ggq a;
            final ggp b;

            private giz b()
            {
                giz giz = ggq.a(a).U();
                if (giz == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return giz;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggp.this;
                a = ggq1;
                super();
            }
        };
        m = new hst(ggq1) {

            final ggq a;
            final ggp b;

            private dri b()
            {
                dri dri = ggq.a(a).at();
                if (dri == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dri;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggp.this;
                a = ggq1;
                super();
            }
        };
        n = ghb.a(h, i, j, k, l, m);
    }

    public final void a(ggz ggz)
    {
        n.injectMembers(ggz);
    }

    static 
    {
        boolean flag;
        if (!ggp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
