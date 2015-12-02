// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggn
    implements gge
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

    private ggn(ggo ggo1)
    {
        if (!a && ggo1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggo1);
            return;
        }
    }

    ggn(ggo ggo1, byte byte0)
    {
        this(ggo1);
    }

    public static ggo a()
    {
        return new ggo((byte)0);
    }

    private void a(ggo ggo1)
    {
        b = new hst(ggo1) {

            final ggo a;
            final ggn b;

            private cev b()
            {
                cev cev = ggo.a(a).D();
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
                b = ggn.this;
                a = ggo1;
                super();
            }
        };
        c = hsw.a(djd.a(ggo.b(ggo1), b));
        d = new hst(ggo1) {

            final ggo a;
            final ggn b;

            private chp b()
            {
                chp chp = ggo.a(a).e();
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
                b = ggn.this;
                a = ggo1;
                super();
            }
        };
        e = hsw.a(djc.a(ggo.b(ggo1), d));
        f = hsw.a(dje.a(ggo.b(ggo1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggo1) {

            final ggo a;
            final ggn b;

            private grs b()
            {
                grs grs = ggo.a(a).aK();
                if (grs == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return grs;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggn.this;
                a = ggo1;
                super();
            }
        };
        j = hsw.a(ggg.a(ggo.c(ggo1), i));
        k = new hst(ggo1) {

            final ggo a;
            final ggn b;

            private hku b()
            {
                hku hku = ggo.a(a).aS();
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
                b = ggn.this;
                a = ggo1;
                super();
            }
        };
        l = new hst(ggo1) {

            final ggo a;
            final ggn b;

            private gmg b()
            {
                gmg gmg = ggo.a(a).f();
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
                b = ggn.this;
                a = ggo1;
                super();
            }
        };
        m = new hst(ggo1) {

            final ggo a;
            final ggn b;

            private dpg b()
            {
                dpg dpg = ggo.a(a).ba();
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
                b = ggn.this;
                a = ggo1;
                super();
            }
        };
        n = ggi.a(h, d, j, k, l, m);
    }

    public final void a(ggc ggc)
    {
        n.injectMembers(ggc);
    }

    static 
    {
        boolean flag;
        if (!ggn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
