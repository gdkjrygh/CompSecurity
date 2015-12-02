// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.SignupWithAlipayFragment;

public final class fle
    implements fmw
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

    private fle(flf flf1)
    {
        if (!a && flf1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(flf1);
            return;
        }
    }

    fle(flf flf1, byte byte0)
    {
        this(flf1);
    }

    public static flf a()
    {
        return new flf((byte)0);
    }

    private void a(flf flf1)
    {
        b = new hst(flf1) {

            final flf a;
            final fle b;

            private cev b()
            {
                cev cev = flf.a(a).D();
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
                b = fle.this;
                a = flf1;
                super();
            }
        };
        c = hsw.a(djd.a(flf.b(flf1), b));
        d = new hst(flf1) {

            final flf a;
            final fle b;

            private chp b()
            {
                chp chp = flf.a(a).e();
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
                b = fle.this;
                a = flf1;
                super();
            }
        };
        e = hsw.a(djc.a(flf.b(flf1), d));
        f = hsw.a(dje.a(flf.b(flf1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(flf1) {

            final flf a;
            final fle b;

            private gmg b()
            {
                gmg gmg = flf.a(a).f();
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
                b = fle.this;
                a = flf1;
                super();
            }
        };
        i = new hst(flf1) {

            final flf a;
            final fle b;

            private dce b()
            {
                dce dce = flf.a(a).af();
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
                b = fle.this;
                a = flf1;
                super();
            }
        };
        j = new hst(flf1) {

            final flf a;
            final fle b;

            private dkr b()
            {
                dkr dkr = flf.a(a).as();
                if (dkr == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkr;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fle.this;
                a = flf1;
                super();
            }
        };
        k = new hst(flf1) {

            final flf a;
            final fle b;

            private hoc b()
            {
                hoc hoc = flf.a(a).au();
                if (hoc == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hoc;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fle.this;
                a = flf1;
                super();
            }
        };
        l = fmx.a(g, d, b, h, i, j, k);
    }

    public final void a(SignupWithAlipayFragment signupwithalipayfragment)
    {
        l.injectMembers(signupwithalipayfragment);
    }

    static 
    {
        boolean flag;
        if (!fle.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
