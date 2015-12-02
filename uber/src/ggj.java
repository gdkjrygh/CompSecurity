// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggj
    implements gfv
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

    private ggj(ggk ggk1)
    {
        if (!a && ggk1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggk1);
            return;
        }
    }

    ggj(ggk ggk1, byte byte0)
    {
        this(ggk1);
    }

    public static ggk a()
    {
        return new ggk((byte)0);
    }

    private void a(ggk ggk1)
    {
        b = new hst(ggk1) {

            final ggk a;
            final ggj b;

            private cev b()
            {
                cev cev = ggk.a(a).g();
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
                b = ggj.this;
                a = ggk1;
                super();
            }
        };
        c = hsw.a(djd.a(ggk.b(ggk1), b));
        d = new hst(ggk1) {

            final ggk a;
            final ggj b;

            private chp b()
            {
                chp chp = ggk.a(a).c();
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
                b = ggj.this;
                a = ggk1;
                super();
            }
        };
        e = hsw.a(djc.a(ggk.b(ggk1), d));
        f = hsw.a(dje.a(ggk.b(ggk1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggk1) {

            final ggk a;
            final ggj b;

            private hku b()
            {
                hku hku = ggk.a(a).k();
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
                b = ggj.this;
                a = ggk1;
                super();
            }
        };
        j = new hst(ggk1) {

            final ggk a;
            final ggj b;

            private gmg b()
            {
                gmg gmg = ggk.a(a).m();
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
                b = ggj.this;
                a = ggk1;
                super();
            }
        };
        k = new hst(ggk1) {

            final ggk a;
            final ggj b;

            private dpg b()
            {
                dpg dpg = ggk.a(a).F();
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
                b = ggj.this;
                a = ggk1;
                super();
            }
        };
        l = new hst(ggk1) {

            final ggk a;
            final ggj b;

            private euz b()
            {
                euz euz = ggk.a(a).M();
                if (euz == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return euz;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggj.this;
                a = ggk1;
                super();
            }
        };
        m = new hst(ggk1) {

            final ggk a;
            final ggj b;

            private hoc b()
            {
                hoc hoc = ggk.a(a).S();
                if (hoc == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hoc;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggj.this;
                a = ggk1;
                super();
            }
        };
        n = gfx.a(h, i, j, k, l, m);
    }

    public final void a(gfu gfu)
    {
        n.injectMembers(gfu);
    }

    static 
    {
        boolean flag;
        if (!ggj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
