// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggl
    implements gfz
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
    private hsr k;

    private ggl(ggm ggm1)
    {
        if (!a && ggm1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggm1);
            return;
        }
    }

    ggl(ggm ggm1, byte byte0)
    {
        this(ggm1);
    }

    public static ggm a()
    {
        return new ggm((byte)0);
    }

    private void a(ggm ggm1)
    {
        b = new hst(ggm1) {

            final ggm a;
            final ggl b;

            private cev b()
            {
                cev cev = ggm.a(a).D();
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
                b = ggl.this;
                a = ggm1;
                super();
            }
        };
        c = hsw.a(djd.a(ggm.b(ggm1), b));
        d = new hst(ggm1) {

            final ggm a;
            final ggl b;

            private chp b()
            {
                chp chp = ggm.a(a).e();
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
                b = ggl.this;
                a = ggm1;
                super();
            }
        };
        e = hsw.a(djc.a(ggm.b(ggm1), d));
        f = hsw.a(dje.a(ggm.b(ggm1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggm1) {

            final ggm a;
            final ggl b;

            private hku b()
            {
                hku hku = ggm.a(a).aS();
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
                b = ggl.this;
                a = ggm1;
                super();
            }
        };
        j = new hst(ggm1) {

            final ggm a;
            final ggl b;

            private dpg b()
            {
                dpg dpg = ggm.a(a).ba();
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
                b = ggl.this;
                a = ggm1;
                super();
            }
        };
        k = ggb.a(h, i, j);
    }

    public final void a(gfy gfy)
    {
        k.injectMembers(gfy);
    }

    static 
    {
        boolean flag;
        if (!ggl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
