// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmArrearsFragment;

public final class ete
    implements etx
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
    private hsr k;

    private ete(etf etf1)
    {
        if (!a && etf1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(etf1);
            return;
        }
    }

    ete(etf etf1, byte byte0)
    {
        this(etf1);
    }

    public static etf a()
    {
        return new etf((byte)0);
    }

    private void a(etf etf1)
    {
        b = new hst(etf1) {

            final etf a;
            final ete b;

            private cev b()
            {
                cev cev = etf.a(a).D();
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
                b = ete.this;
                a = etf1;
                super();
            }
        };
        c = hsw.a(djd.a(etf.b(etf1), b));
        d = new hst(etf1) {

            final etf a;
            final ete b;

            private chp b()
            {
                chp chp = etf.a(a).e();
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
                b = ete.this;
                a = etf1;
                super();
            }
        };
        e = hsw.a(djc.a(etf.b(etf1), d));
        f = hsw.a(dje.a(etf.b(etf1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(etf1) {

            final etf a;
            final ete b;

            private dki b()
            {
                dki dki = etf.a(a).W();
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
                b = ete.this;
                a = etf1;
                super();
            }
        };
        i = eux.a(g, b, h);
        j = new hst(etf1) {

            final etf a;
            final ete b;

            private hkr b()
            {
                hkr hkr = etf.a(a).aP();
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
                b = ete.this;
                a = etf1;
                super();
            }
        };
        k = ety.a(i, d, b, j, h);
    }

    public final void a(PaytmArrearsFragment paytmarrearsfragment)
    {
        k.injectMembers(paytmarrearsfragment);
    }

    static 
    {
        boolean flag;
        if (!ete.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
