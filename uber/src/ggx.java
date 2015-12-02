// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggx
    implements ghu
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
    private hsr l;

    private ggx(ggy ggy1)
    {
        if (!a && ggy1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggy1);
            return;
        }
    }

    ggx(ggy ggy1, byte byte0)
    {
        this(ggy1);
    }

    public static ggy a()
    {
        return new ggy((byte)0);
    }

    private void a(ggy ggy1)
    {
        b = new hst(ggy1) {

            final ggy a;
            final ggx b;

            private cev b()
            {
                cev cev = ggy.a(a).g();
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
                b = ggx.this;
                a = ggy1;
                super();
            }
        };
        c = hsw.a(djd.a(ggy.b(ggy1), b));
        d = new hst(ggy1) {

            final ggy a;
            final ggx b;

            private chp b()
            {
                chp chp = ggy.a(a).c();
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
                b = ggx.this;
                a = ggy1;
                super();
            }
        };
        e = hsw.a(djc.a(ggy.b(ggy1), d));
        f = hsw.a(dje.a(ggy.b(ggy1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggy1) {

            final ggy a;
            final ggx b;

            private hku b()
            {
                hku hku = ggy.a(a).k();
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
                b = ggx.this;
                a = ggy1;
                super();
            }
        };
        j = new hst(ggy1) {

            final ggy a;
            final ggx b;

            private gmg b()
            {
                gmg gmg = ggy.a(a).m();
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
                b = ggx.this;
                a = ggy1;
                super();
            }
        };
        k = new hst(ggy1) {

            final ggy a;
            final ggx b;

            private dpg b()
            {
                dpg dpg = ggy.a(a).F();
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
                b = ggx.this;
                a = ggy1;
                super();
            }
        };
        l = ghv.a(h, i, j, k);
    }

    public final void a(ghs ghs)
    {
        l.injectMembers(ghs);
    }

    static 
    {
        boolean flag;
        if (!ggx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
