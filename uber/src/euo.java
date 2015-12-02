// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.v2.PaytmAddFundsCustomDialogFragment;

public final class euo
    implements euu
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private euo(eup eup1)
    {
        if (!a && eup1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eup1);
            return;
        }
    }

    euo(eup eup1, byte byte0)
    {
        this(eup1);
    }

    public static eup a()
    {
        return new eup((byte)0);
    }

    private void a(eup eup1)
    {
        b = new hst(eup1) {

            final eup a;
            final euo b;

            private cev b()
            {
                cev cev = eup.a(a).D();
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
                b = euo.this;
                a = eup1;
                super();
            }
        };
        c = hsw.a(diy.a(eup.b(eup1), b));
        d = new hst(eup1) {

            final eup a;
            final euo b;

            private chp b()
            {
                chp chp = eup.a(a).e();
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
                b = euo.this;
                a = eup1;
                super();
            }
        };
        e = hsw.a(dix.a(eup.b(eup1), d));
        f = hsw.a(diz.a(eup.b(eup1), c, e));
        g = cza.a(hsu.a(), f);
        h = euv.a(g, d);
    }

    public final void a(PaytmAddFundsCustomDialogFragment paytmaddfundscustomdialogfragment)
    {
        h.injectMembers(paytmaddfundscustomdialogfragment);
    }

    static 
    {
        boolean flag;
        if (!euo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
