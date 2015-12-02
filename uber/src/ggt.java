// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggt
    implements ghj
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

    private ggt(ggu ggu1)
    {
        if (!a && ggu1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ggu1);
            return;
        }
    }

    ggt(ggu ggu1, byte byte0)
    {
        this(ggu1);
    }

    public static ggu a()
    {
        return new ggu((byte)0);
    }

    private void a(ggu ggu1)
    {
        b = new hst(ggu1) {

            final ggu a;
            final ggt b;

            private cev b()
            {
                cev cev = ggu.a(a).g();
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
                b = ggt.this;
                a = ggu1;
                super();
            }
        };
        c = hsw.a(djd.a(ggu.b(ggu1), b));
        d = new hst(ggu1) {

            final ggu a;
            final ggt b;

            private chp b()
            {
                chp chp = ggu.a(a).c();
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
                b = ggt.this;
                a = ggu1;
                super();
            }
        };
        e = hsw.a(djc.a(ggu.b(ggu1), d));
        f = hsw.a(dje.a(ggu.b(ggu1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(ggu1) {

            final ggu a;
            final ggt b;

            private hku b()
            {
                hku hku = ggu.a(a).k();
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
                b = ggt.this;
                a = ggu1;
                super();
            }
        };
        j = new hst(ggu1) {

            final ggu a;
            final ggt b;

            private dpg b()
            {
                dpg dpg = ggu.a(a).F();
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
                b = ggt.this;
                a = ggu1;
                super();
            }
        };
        k = ghk.a(h, b, i, j);
    }

    public final void a(ghh ghh)
    {
        k.injectMembers(ghh);
    }

    static 
    {
        boolean flag;
        if (!ggt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
