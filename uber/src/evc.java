// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.promo.TripBalancesFragment;

public final class evc
    implements evi
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

    private evc(evd evd1)
    {
        if (!a && evd1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(evd1);
            return;
        }
    }

    evc(evd evd1, byte byte0)
    {
        this(evd1);
    }

    public static evd a()
    {
        return new evd((byte)0);
    }

    private void a(evd evd1)
    {
        b = new hst(evd1) {

            final evd a;
            final evc b;

            private cev b()
            {
                cev cev = evd.a(a).D();
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
                b = evc.this;
                a = evd1;
                super();
            }
        };
        c = hsw.a(djd.a(evd.b(evd1), b));
        d = new hst(evd1) {

            final evd a;
            final evc b;

            private chp b()
            {
                chp chp = evd.a(a).e();
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
                b = evc.this;
                a = evd1;
                super();
            }
        };
        e = hsw.a(djc.a(evd.b(evd1), d));
        f = hsw.a(dje.a(evd.b(evd1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(evd1) {

            final evd a;
            final evc b;

            private djw b()
            {
                djw djw = evd.a(a).z();
                if (djw == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return djw;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = evc.this;
                a = evd1;
                super();
            }
        };
        i = new hst(evd1) {

            final evd a;
            final evc b;

            private hku b()
            {
                hku hku = evd.a(a).aS();
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
                b = evc.this;
                a = evd1;
                super();
            }
        };
        j = new hst(evd1) {

            final evd a;
            final evc b;

            private gmg b()
            {
                gmg gmg = evd.a(a).f();
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
                b = evc.this;
                a = evd1;
                super();
            }
        };
        k = new hst(evd1) {

            final evd a;
            final evc b;

            private dpg b()
            {
                dpg dpg = evd.a(a).ba();
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
                b = evc.this;
                a = evd1;
                super();
            }
        };
        l = new hst(evd1) {

            final evd a;
            final evc b;

            private dal b()
            {
                dal dal = evd.a(a).ap();
                if (dal == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dal;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = evc.this;
                a = evd1;
                super();
            }
        };
        m = evj.a(g, h, b, i, j, k, l);
    }

    public final void a(TripBalancesFragment tripbalancesfragment)
    {
        m.injectMembers(tripbalancesfragment);
    }

    static 
    {
        boolean flag;
        if (!evc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
