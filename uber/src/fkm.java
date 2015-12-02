// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.PromoBarFragment;

public final class fkm
    implements flo
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

    private fkm(fkn fkn1)
    {
        if (!a && fkn1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fkn1);
            return;
        }
    }

    fkm(fkn fkn1, byte byte0)
    {
        this(fkn1);
    }

    public static fkn a()
    {
        return new fkn((byte)0);
    }

    private void a(fkn fkn1)
    {
        b = new hst(fkn1) {

            final fkn a;
            final fkm b;

            private cev b()
            {
                cev cev = fkn.a(a).D();
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
                b = fkm.this;
                a = fkn1;
                super();
            }
        };
        c = hsw.a(djd.a(fkn.b(fkn1), b));
        d = new hst(fkn1) {

            final fkn a;
            final fkm b;

            private chp b()
            {
                chp chp = fkn.a(a).e();
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
                b = fkm.this;
                a = fkn1;
                super();
            }
        };
        e = hsw.a(djc.a(fkn.b(fkn1), d));
        f = hsw.a(dje.a(fkn.b(fkn1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fkn1) {

            final fkn a;
            final fkm b;

            private gmg b()
            {
                gmg gmg = fkn.a(a).f();
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
                b = fkm.this;
                a = fkn1;
                super();
            }
        };
        i = new hst(fkn1) {

            final fkn a;
            final fkm b;

            private dpg b()
            {
                dpg dpg = fkn.a(a).ba();
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
                b = fkm.this;
                a = fkn1;
                super();
            }
        };
        j = new hst(fkn1) {

            final fkn a;
            final fkm b;

            private dkn b()
            {
                dkn dkn = fkn.a(a).ai();
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
                b = fkm.this;
                a = fkn1;
                super();
            }
        };
        k = new hst(fkn1) {

            final fkn a;
            final fkm b;

            private hkp b()
            {
                hkp hkp = fkn.a(a).bd();
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
                b = fkm.this;
                a = fkn1;
                super();
            }
        };
        l = flq.a(g, d, b, h, i, j, k);
    }

    public final void a(PromoBarFragment promobarfragment)
    {
        l.injectMembers(promobarfragment);
    }

    static 
    {
        boolean flag;
        if (!fkm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
