// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggr
    implements ghf
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
    private hzb n;
    private hsr o;

    private ggr(ggs ggs1)
    {
        if (!a && ggs1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggs1);
            return;
        }
    }

    ggr(ggs ggs1, byte byte0)
    {
        this(ggs1);
    }

    public static ggs a()
    {
        return new ggs((byte)0);
    }

    private void a(ggs ggs1)
    {
        b = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private cev b()
            {
                cev cev = ggs.a(a).D();
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
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        c = hsw.a(djd.a(ggs.b(ggs1), b));
        d = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private chp b()
            {
                chp chp = ggs.a(a).e();
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
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        e = hsw.a(djc.a(ggs.b(ggs1), d));
        f = hsw.a(dje.a(ggs.b(ggs1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private dqt b()
            {
                dqt dqt = ggs.a(a).aM();
                if (dqt == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dqt;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        j = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private hkr b()
            {
                hkr hkr = ggs.a(a).aP();
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
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        k = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private hku b()
            {
                hku hku = ggs.a(a).aS();
                if (hku == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hku;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        l = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private gmg b()
            {
                gmg gmg = ggs.a(a).f();
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
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        m = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private dpg b()
            {
                dpg dpg = ggs.a(a).ba();
                if (dpg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dpg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        n = new hst(ggs1) {

            final ggs a;
            final ggr b;

            private dkv b()
            {
                dkv dkv = ggs.a(a).az();
                if (dkv == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkv;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggr.this;
                a = ggs1;
                super();
            }
        };
        o = ghg.a(h, d, i, b, j, k, l, m, n);
    }

    public final void a(ghc ghc)
    {
        o.injectMembers(ghc);
    }

    static 
    {
        boolean flag;
        if (!ggr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
