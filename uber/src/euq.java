// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.v2.PaytmAddFundsFragment;

public final class euq
    implements euw
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
    private hsr j;

    private euq(eur eur1)
    {
        if (!a && eur1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eur1);
            return;
        }
    }

    euq(eur eur1, byte byte0)
    {
        this(eur1);
    }

    public static eur a()
    {
        return new eur((byte)0);
    }

    private void a(eur eur1)
    {
        b = new hst(eur1) {

            final eur a;
            final euq b;

            private cev b()
            {
                cev cev = eur.a(a).D();
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
                b = euq.this;
                a = eur1;
                super();
            }
        };
        c = hsw.a(djd.a(eur.b(eur1), b));
        d = new hst(eur1) {

            final eur a;
            final euq b;

            private chp b()
            {
                chp chp = eur.a(a).e();
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
                b = euq.this;
                a = eur1;
                super();
            }
        };
        e = hsw.a(djc.a(eur.b(eur1), d));
        f = hsw.a(dje.a(eur.b(eur1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(eur1) {

            final eur a;
            final euq b;

            private dki b()
            {
                dki dki = eur.a(a).W();
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
                b = euq.this;
                a = eur1;
                super();
            }
        };
        i = eux.a(g, b, h);
        j = euy.a(i, d);
    }

    public final void a(PaytmAddFundsFragment paytmaddfundsfragment)
    {
        j.injectMembers(paytmaddfundsfragment);
    }

    static 
    {
        boolean flag;
        if (!euq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
