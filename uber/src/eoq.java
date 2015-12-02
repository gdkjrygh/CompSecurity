// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditThirdPartyPaymentProviderFragment;

public final class eoq
    implements epm
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
    private hzb n;
    private hsr o;

    private eoq(eor eor1)
    {
        if (!a && eor1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eor1);
            return;
        }
    }

    eoq(eor eor1, byte byte0)
    {
        this(eor1);
    }

    public static eor a()
    {
        return new eor((byte)0);
    }

    private void a(eor eor1)
    {
        b = new hst(eor1) {

            final eor a;
            final eoq b;

            private cev b()
            {
                cev cev = eor.a(a).d();
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
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        c = hsw.a(djd.a(eor.b(eor1), b));
        d = new hst(eor1) {

            final eor a;
            final eoq b;

            private chp b()
            {
                chp chp = eor.a(a).c();
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
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        e = hsw.a(djc.a(eor.b(eor1), d));
        f = hsw.a(dje.a(eor.b(eor1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(eor1) {

            final eor a;
            final eoq b;

            private hkr b()
            {
                hkr hkr = eor.a(a).e();
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
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        i = new hst(eor1) {

            final eor a;
            final eoq b;

            private hku b()
            {
                hku hku = eor.a(a).f();
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
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        j = new hst(eor1) {

            final eor a;
            final eoq b;

            private eoy b()
            {
                eoy eoy = eor.a(a).g();
                if (eoy == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eoy;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        k = new hst(eor1) {

            final eor a;
            final eoq b;

            private hkj b()
            {
                hkj hkj = eor.a(a).j();
                if (hkj == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkj;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        l = new hst(eor1) {

            final eor a;
            final eoq b;

            private dpg b()
            {
                dpg dpg = eor.a(a).k();
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
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        m = new hst(eor1) {

            final eor a;
            final eoq b;

            private dkn b()
            {
                dkn dkn = eor.a(a).l();
                if (dkn == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkn;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        n = new hst(eor1) {

            final eor a;
            final eoq b;

            private eyy b()
            {
                eyy eyy = eor.a(a).m();
                if (eyy == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eyy;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eoq.this;
                a = eor1;
                super();
            }
        };
        o = epn.a(g, d, b, h, i, j, k, l, m, n);
    }

    public final void a(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment)
    {
        o.injectMembers(editthirdpartypaymentproviderfragment);
    }

    static 
    {
        boolean flag;
        if (!eoq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
