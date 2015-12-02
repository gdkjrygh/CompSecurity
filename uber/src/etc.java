// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmAddFundsWebViewFragment;

public final class etc
    implements etv
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private etc(etd etd1)
    {
        if (!a && etd1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(etd1);
            return;
        }
    }

    etc(etd etd1, byte byte0)
    {
        this(etd1);
    }

    public static etd a()
    {
        return new etd((byte)0);
    }

    private void a(etd etd1)
    {
        b = new hst(etd1) {

            final etd a;
            final etc b;

            private cev b()
            {
                cev cev = etd.a(a).D();
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
                b = etc.this;
                a = etd1;
                super();
            }
        };
        c = hsw.a(djd.a(etd.b(etd1), b));
        d = new hst(etd1) {

            final etd a;
            final etc b;

            private chp b()
            {
                chp chp = etd.a(a).e();
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
                b = etc.this;
                a = etd1;
                super();
            }
        };
        e = hsw.a(djc.a(etd.b(etd1), d));
        f = hsw.a(dje.a(etd.b(etd1), c, e));
        g = czc.a(hsu.a(), f);
        h = etw.a(g, d, b);
    }

    public final void a(PaytmAddFundsWebViewFragment paytmaddfundswebviewfragment)
    {
        h.injectMembers(paytmaddfundswebviewfragment);
    }

    static 
    {
        boolean flag;
        if (!etc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
