// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.SignupMissingInfoFragment;

public final class fkw
    implements fml
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

    private fkw(fkx fkx1)
    {
        if (!a && fkx1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fkx1);
            return;
        }
    }

    fkw(fkx fkx1, byte byte0)
    {
        this(fkx1);
    }

    public static fkx a()
    {
        return new fkx((byte)0);
    }

    private void a(fkx fkx1)
    {
        b = new hst(fkx1) {

            final fkx a;
            final fkw b;

            private cev b()
            {
                cev cev = fkx.a(a).D();
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
                b = fkw.this;
                a = fkx1;
                super();
            }
        };
        c = hsw.a(djd.a(fkx.b(fkx1), b));
        d = new hst(fkx1) {

            final fkx a;
            final fkw b;

            private chp b()
            {
                chp chp = fkx.a(a).e();
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
                b = fkw.this;
                a = fkx1;
                super();
            }
        };
        e = hsw.a(djc.a(fkx.b(fkx1), d));
        f = hsw.a(dje.a(fkx.b(fkx1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fkx1) {

            final fkx a;
            final fkw b;

            private gmg b()
            {
                gmg gmg = fkx.a(a).f();
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
                b = fkw.this;
                a = fkx1;
                super();
            }
        };
        i = new hst(fkx1) {

            final fkx a;
            final fkw b;

            private dkr b()
            {
                dkr dkr = fkx.a(a).as();
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
                b = fkw.this;
                a = fkx1;
                super();
            }
        };
        j = new hst(fkx1) {

            final fkx a;
            final fkw b;

            private cyi b()
            {
                cyi cyi = fkx.a(a).aE();
                if (cyi == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cyi;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fkw.this;
                a = fkx1;
                super();
            }
        };
        k = fmm.a(g, d, b, h, i, j);
    }

    public final void a(SignupMissingInfoFragment signupmissinginfofragment)
    {
        k.injectMembers(signupmissinginfofragment);
    }

    static 
    {
        boolean flag;
        if (!fkw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
