// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggv
    implements gho
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

    private ggv(ggw ggw1)
    {
        if (!a && ggw1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggw1);
            return;
        }
    }

    ggv(ggw ggw1, byte byte0)
    {
        this(ggw1);
    }

    public static ggw a()
    {
        return new ggw((byte)0);
    }

    private void a(ggw ggw1)
    {
        b = new hst(ggw1) {

            final ggw a;
            final ggv b;

            private cev b()
            {
                cev cev = ggw.a(a).g();
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
                b = ggv.this;
                a = ggw1;
                super();
            }
        };
        c = hsw.a(djd.a(ggw.b(ggw1), b));
        d = new hst(ggw1) {

            final ggw a;
            final ggv b;

            private chp b()
            {
                chp chp = ggw.a(a).c();
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
                b = ggv.this;
                a = ggw1;
                super();
            }
        };
        e = hsw.a(djc.a(ggw.b(ggw1), d));
        f = hsw.a(dje.a(ggw.b(ggw1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggw1) {

            final ggw a;
            final ggv b;

            private hku b()
            {
                hku hku = ggw.a(a).k();
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
                b = ggv.this;
                a = ggw1;
                super();
            }
        };
        j = new hst(ggw1) {

            final ggw a;
            final ggv b;

            private hjo b()
            {
                hjo hjo = ggw.a(a).E();
                if (hjo == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hjo;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggv.this;
                a = ggw1;
                super();
            }
        };
        k = hsw.a(ghq.a(ggw.c(ggw1), j));
        l = new hst(ggw1) {

            final ggw a;
            final ggv b;

            private dpg b()
            {
                dpg dpg = ggw.a(a).F();
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
                b = ggv.this;
                a = ggw1;
                super();
            }
        };
        m = new hst(ggw1) {

            final ggw a;
            final ggv b;

            private cyy b()
            {
                cyy cyy = ggw.a(a).I();
                if (cyy == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cyy;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ggv.this;
                a = ggw1;
                super();
            }
        };
        n = ghr.a(h, i, k, l, m);
    }

    public final void a(ghl ghl)
    {
        n.injectMembers(ghl);
    }

    static 
    {
        boolean flag;
        if (!ggv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
