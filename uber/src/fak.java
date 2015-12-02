// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.PromoFragment;

public final class fak
    implements fap
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

    private fak(fal fal1)
    {
        if (!a && fal1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fal1);
            return;
        }
    }

    fak(fal fal1, byte byte0)
    {
        this(fal1);
    }

    public static fal a()
    {
        return new fal((byte)0);
    }

    private void a(fal fal1)
    {
        b = new hst(fal1) {

            final fal a;
            final fak b;

            private cev b()
            {
                cev cev = fal.a(a).D();
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
                b = fak.this;
                a = fal1;
                super();
            }
        };
        c = hsw.a(diy.a(fal.b(fal1), b));
        d = new hst(fal1) {

            final fal a;
            final fak b;

            private chp b()
            {
                chp chp = fal.a(a).e();
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
                b = fak.this;
                a = fal1;
                super();
            }
        };
        e = hsw.a(dix.a(fal.b(fal1), d));
        f = hsw.a(diz.a(fal.b(fal1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(fal1) {

            final fal a;
            final fak b;

            private dpg b()
            {
                dpg dpg = fal.a(a).ba();
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
                b = fak.this;
                a = fal1;
                super();
            }
        };
        i = new hst(fal1) {

            final fal a;
            final fak b;

            private dkn b()
            {
                dkn dkn = fal.a(a).ai();
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
                b = fak.this;
                a = fal1;
                super();
            }
        };
        j = new hst(fal1) {

            final fal a;
            final fak b;

            private hkp b()
            {
                hkp hkp = fal.a(a).bd();
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
                b = fak.this;
                a = fal1;
                super();
            }
        };
        k = faq.a(g, b, d, h, i, j);
    }

    public final void a(PromoFragment promofragment)
    {
        k.injectMembers(promofragment);
    }

    static 
    {
        boolean flag;
        if (!fak.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
