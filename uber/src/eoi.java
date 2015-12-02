// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.ChoosePaymentFragment;

public final class eoi
    implements enx
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
    private hzb m;
    private hsr n;

    private eoi(eoj eoj1)
    {
        if (!a && eoj1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eoj1);
            return;
        }
    }

    eoi(eoj eoj1, byte byte0)
    {
        this(eoj1);
    }

    public static eoj a()
    {
        return new eoj((byte)0);
    }

    private void a(eoj eoj1)
    {
        b = new hst(eoj1) {

            final eoj a;
            final eoi b;

            private cev b()
            {
                cev cev = eoj.a(a).D();
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
                b = eoi.this;
                a = eoj1;
                super();
            }
        };
        c = hsw.a(djd.a(eoj.b(eoj1), b));
        d = new hst(eoj1) {

            final eoj a;
            final eoi b;

            private chp b()
            {
                chp chp = eoj.a(a).e();
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
                b = eoi.this;
                a = eoj1;
                super();
            }
        };
        e = hsw.a(djc.a(eoj.b(eoj1), d));
        f = hsw.a(dje.a(eoj.b(eoj1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(eoj1) {

            final eoj a;
            final eoi b;

            private hkr b()
            {
                hkr hkr = eoj.a(a).aP();
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
                b = eoi.this;
                a = eoj1;
                super();
            }
        };
        i = new hst(eoj1) {

            final eoj a;
            final eoi b;

            private gmg b()
            {
                gmg gmg = eoj.a(a).f();
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
                b = eoi.this;
                a = eoj1;
                super();
            }
        };
        j = new hst(eoj1) {

            final eoj a;
            final eoi b;

            private dpg b()
            {
                dpg dpg = eoj.a(a).ba();
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
                b = eoi.this;
                a = eoj1;
                super();
            }
        };
        k = new hst(eoj1) {

            final eoj a;
            final eoi b;

            private dce b()
            {
                dce dce = eoj.a(a).af();
                if (dce == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dce;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eoi.this;
                a = eoj1;
                super();
            }
        };
        l = hsw.a(enz.a(eoj.c(eoj1), i));
        m = new hst(eoj1) {

            final eoj a;
            final eoi b;

            private hkm b()
            {
                hkm hkm = eoj.a(a).bb();
                if (hkm == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkm;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eoi.this;
                a = eoj1;
                super();
            }
        };
        n = eoa.a(g, d, h, i, j, k, l, m);
    }

    public final void a(ChoosePaymentFragment choosepaymentfragment)
    {
        n.injectMembers(choosepaymentfragment);
    }

    static 
    {
        boolean flag;
        if (!eoi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
