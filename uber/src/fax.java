// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.v2.BasePromoFragment;

public final class fax
    implements fav
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

    private fax(fay fay1)
    {
        if (!a && fay1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fay1);
            return;
        }
    }

    fax(fay fay1, byte byte0)
    {
        this(fay1);
    }

    public static fay a()
    {
        return new fay((byte)0);
    }

    private void a(fay fay1)
    {
        b = new hst(fay1) {

            final fay a;
            final fax b;

            private cev b()
            {
                cev cev = fay.a(a).D();
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
                b = fax.this;
                a = fay1;
                super();
            }
        };
        c = hsw.a(djd.a(fay.b(fay1), b));
        d = new hst(fay1) {

            final fay a;
            final fax b;

            private chp b()
            {
                chp chp = fay.a(a).e();
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
                b = fax.this;
                a = fay1;
                super();
            }
        };
        e = hsw.a(djc.a(fay.b(fay1), d));
        f = hsw.a(dje.a(fay.b(fay1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fay1) {

            final fay a;
            final fax b;

            private dpg b()
            {
                dpg dpg = fay.a(a).ba();
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
                b = fax.this;
                a = fay1;
                super();
            }
        };
        i = new hst(fay1) {

            final fay a;
            final fax b;

            private dkn b()
            {
                dkn dkn = fay.a(a).ai();
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
                b = fax.this;
                a = fay1;
                super();
            }
        };
        j = new hst(fay1) {

            final fay a;
            final fax b;

            private hkp b()
            {
                hkp hkp = fay.a(a).bd();
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
                b = fax.this;
                a = fay1;
                super();
            }
        };
        k = faw.a(g, d, b, h, i, j);
    }

    public final void a(BasePromoFragment basepromofragment)
    {
        k.injectMembers(basepromofragment);
    }

    static 
    {
        boolean flag;
        if (!fax.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
