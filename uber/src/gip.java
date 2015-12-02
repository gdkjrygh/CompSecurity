// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationWaitFragment;

public final class gip
    implements gji
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hzb h;
    private hzb i;
    private hzb j;
    private hzb k;
    private hzb l;
    private hsr m;

    private gip(giq giq1)
    {
        if (!a && giq1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(giq1);
            return;
        }
    }

    gip(giq giq1, byte byte0)
    {
        this(giq1);
    }

    public static giq a()
    {
        return new giq((byte)0);
    }

    private void a(giq giq1)
    {
        b = new hst(giq1) {

            final giq a;
            final gip b;

            private cev b()
            {
                cev cev = giq.a(a).D();
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
                b = gip.this;
                a = giq1;
                super();
            }
        };
        c = hsw.a(djd.a(giq.b(giq1), b));
        d = new hst(giq1) {

            final giq a;
            final gip b;

            private chp b()
            {
                chp chp = giq.a(a).e();
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
                b = gip.this;
                a = giq1;
                super();
            }
        };
        e = hsw.a(djc.a(giq.b(giq1), d));
        f = hsw.a(dje.a(giq.b(giq1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(giq1) {

            final giq a;
            final gip b;

            private hku b()
            {
                hku hku = giq.a(a).aS();
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
                b = gip.this;
                a = giq1;
                super();
            }
        };
        i = new hst(giq1) {

            final giq a;
            final gip b;

            private gmg b()
            {
                gmg gmg = giq.a(a).f();
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
                b = gip.this;
                a = giq1;
                super();
            }
        };
        j = new hst(giq1) {

            final giq a;
            final gip b;

            private giz b()
            {
                giz giz = giq.a(a).U();
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
                b = gip.this;
                a = giq1;
                super();
            }
        };
        k = new hst(giq1) {

            final giq a;
            final gip b;

            private dpg b()
            {
                dpg dpg = giq.a(a).ba();
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
                b = gip.this;
                a = giq1;
                super();
            }
        };
        l = new hst(giq1) {

            final giq a;
            final gip b;

            private dri b()
            {
                dri dri = giq.a(a).at();
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
                b = gip.this;
                a = giq1;
                super();
            }
        };
        m = gjl.a(g, d, b, h, i, j, k, l);
    }

    public final void a(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        m.injectMembers(mobileverificationwaitfragment);
    }

    static 
    {
        boolean flag;
        if (!gip.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
