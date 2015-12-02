// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.BaseAddPaymentV2Fragment;

public final class eog
    implements enr
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
    private hsr l;

    private eog(eoh eoh1)
    {
        if (!a && eoh1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eoh1);
            return;
        }
    }

    eog(eoh eoh1, byte byte0)
    {
        this(eoh1);
    }

    public static eoh a()
    {
        return new eoh((byte)0);
    }

    private void a(eoh eoh1)
    {
        b = new hst(eoh1) {

            final eoh a;
            final eog b;

            private cev b()
            {
                cev cev = eoh.a(a).D();
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
                b = eog.this;
                a = eoh1;
                super();
            }
        };
        c = hsw.a(djd.a(eoh.b(eoh1), b));
        d = new hst(eoh1) {

            final eoh a;
            final eog b;

            private chp b()
            {
                chp chp = eoh.a(a).e();
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
                b = eog.this;
                a = eoh1;
                super();
            }
        };
        e = hsw.a(djc.a(eoh.b(eoh1), d));
        f = hsw.a(dje.a(eoh.b(eoh1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(eoh1) {

            final eoh a;
            final eog b;

            private hkr b()
            {
                hkr hkr = eoh.a(a).aP();
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
                b = eog.this;
                a = eoh1;
                super();
            }
        };
        i = new hst(eoh1) {

            final eoh a;
            final eog b;

            private gmg b()
            {
                gmg gmg = eoh.a(a).f();
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
                b = eog.this;
                a = eoh1;
                super();
            }
        };
        j = hsw.a(ent.a(eoh.c(eoh1), i));
        k = new hst(eoh1) {

            final eoh a;
            final eog b;

            private dce b()
            {
                dce dce = eoh.a(a).af();
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
                b = eog.this;
                a = eoh1;
                super();
            }
        };
        l = env.a(g, d, b, h, i, j, k);
    }

    public final void a(BaseAddPaymentV2Fragment baseaddpaymentv2fragment)
    {
        l.injectMembers(baseaddpaymentv2fragment);
    }

    static 
    {
        boolean flag;
        if (!eog.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
