// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.payment.SignupChoosePaymentFragment;

public final class fni
    implements fnk
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
    private hsr k;

    private fni(fnj fnj1)
    {
        if (!a && fnj1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fnj1);
            return;
        }
    }

    fni(fnj fnj1, byte byte0)
    {
        this(fnj1);
    }

    public static fnj a()
    {
        return new fnj((byte)0);
    }

    private void a(fnj fnj1)
    {
        b = new hst(fnj1) {

            final fnj a;
            final fni b;

            private cev b()
            {
                cev cev = fnj.a(a).D();
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
                b = fni.this;
                a = fnj1;
                super();
            }
        };
        c = hsw.a(djd.a(fnj.b(fnj1), b));
        d = new hst(fnj1) {

            final fnj a;
            final fni b;

            private chp b()
            {
                chp chp = fnj.a(a).e();
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
                b = fni.this;
                a = fnj1;
                super();
            }
        };
        e = hsw.a(djc.a(fnj.b(fnj1), d));
        f = hsw.a(dje.a(fnj.b(fnj1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fnj1) {

            final fnj a;
            final fni b;

            private gmg b()
            {
                gmg gmg = fnj.a(a).f();
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
                b = fni.this;
                a = fnj1;
                super();
            }
        };
        i = new hst(fnj1) {

            final fnj a;
            final fni b;

            private dce b()
            {
                dce dce = fnj.a(a).af();
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
                b = fni.this;
                a = fnj1;
                super();
            }
        };
        j = hsw.a(fnm.a(fnj.c(fnj1), h));
        k = fnn.a(g, d, b, h, i, j);
    }

    public final void a(SignupChoosePaymentFragment signupchoosepaymentfragment)
    {
        k.injectMembers(signupchoosepaymentfragment);
    }

    static 
    {
        boolean flag;
        if (!fni.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
