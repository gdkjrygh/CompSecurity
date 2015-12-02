// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.paytm.SignupPaytmAddFundsFragment;

public final class fnq
    implements fny
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hzb h;
    private hsr i;
    private hzb j;
    private hzb k;
    private hzb l;
    private hzb m;
    private hsr n;

    private fnq(fnr fnr1)
    {
        if (!a && fnr1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fnr1);
            return;
        }
    }

    fnq(fnr fnr1, byte byte0)
    {
        this(fnr1);
    }

    public static fnr a()
    {
        return new fnr((byte)0);
    }

    private void a(fnr fnr1)
    {
        b = new hst(fnr1) {

            final fnr a;
            final fnq b;

            private cev b()
            {
                cev cev = fnr.a(a).D();
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
                b = fnq.this;
                a = fnr1;
                super();
            }
        };
        c = hsw.a(djd.a(fnr.b(fnr1), b));
        d = new hst(fnr1) {

            final fnr a;
            final fnq b;

            private chp b()
            {
                chp chp = fnr.a(a).e();
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
                b = fnq.this;
                a = fnr1;
                super();
            }
        };
        e = hsw.a(djc.a(fnr.b(fnr1), d));
        f = hsw.a(dje.a(fnr.b(fnr1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fnr1) {

            final fnr a;
            final fnq b;

            private dki b()
            {
                dki dki = fnr.a(a).W();
                if (dki == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dki;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fnq.this;
                a = fnr1;
                super();
            }
        };
        i = eux.a(g, b, h);
        j = new hst(fnr1) {

            final fnr a;
            final fnq b;

            private gmg b()
            {
                gmg gmg = fnr.a(a).f();
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
                b = fnq.this;
                a = fnr1;
                super();
            }
        };
        k = new hst(fnr1) {

            final fnr a;
            final fnq b;

            private dpg b()
            {
                dpg dpg = fnr.a(a).ba();
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
                b = fnq.this;
                a = fnr1;
                super();
            }
        };
        l = new hst(fnr1) {

            final fnr a;
            final fnq b;

            private dkn b()
            {
                dkn dkn = fnr.a(a).ai();
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
                b = fnq.this;
                a = fnr1;
                super();
            }
        };
        m = new hst(fnr1) {

            final fnr a;
            final fnq b;

            private hkp b()
            {
                hkp hkp = fnr.a(a).bd();
                if (hkp == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkp;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fnq.this;
                a = fnr1;
                super();
            }
        };
        n = fnz.a(i, d, j, h, k, l, m);
    }

    public final void a(SignupPaytmAddFundsFragment signuppaytmaddfundsfragment)
    {
        n.injectMembers(signuppaytmaddfundsfragment);
    }

    static 
    {
        boolean flag;
        if (!fnq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
