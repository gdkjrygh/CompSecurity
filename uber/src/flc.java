// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.SignupPromoFragment;

public final class flc
    implements fmr
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

    private flc(fld fld1)
    {
        if (!a && fld1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fld1);
            return;
        }
    }

    flc(fld fld1, byte byte0)
    {
        this(fld1);
    }

    public static fld a()
    {
        return new fld((byte)0);
    }

    private void a(fld fld1)
    {
        b = new hst(fld1) {

            final fld a;
            final flc b;

            private cev b()
            {
                cev cev = fld.a(a).D();
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
                b = flc.this;
                a = fld1;
                super();
            }
        };
        c = hsw.a(diy.a(fld.b(fld1), b));
        d = new hst(fld1) {

            final fld a;
            final flc b;

            private chp b()
            {
                chp chp = fld.a(a).e();
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
                b = flc.this;
                a = fld1;
                super();
            }
        };
        e = hsw.a(dix.a(fld.b(fld1), d));
        f = hsw.a(diz.a(fld.b(fld1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(fld1) {

            final fld a;
            final flc b;

            private dpg b()
            {
                dpg dpg = fld.a(a).ba();
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
                b = flc.this;
                a = fld1;
                super();
            }
        };
        i = new hst(fld1) {

            final fld a;
            final flc b;

            private dkn b()
            {
                dkn dkn = fld.a(a).ai();
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
                b = flc.this;
                a = fld1;
                super();
            }
        };
        j = new hst(fld1) {

            final fld a;
            final flc b;

            private hkp b()
            {
                hkp hkp = fld.a(a).bd();
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
                b = flc.this;
                a = fld1;
                super();
            }
        };
        k = fmt.a(g, d, h, i, j);
    }

    public final void a(SignupPromoFragment signuppromofragment)
    {
        k.injectMembers(signuppromofragment);
    }

    static 
    {
        boolean flag;
        if (!flc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
