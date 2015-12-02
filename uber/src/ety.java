// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmArrearsFragment;

public final class ety
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;

    private ety(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = hzb4;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new ety(hsr1, hzb1, hzb2, hzb3, hzb4);
    }

    private void a(PaytmArrearsFragment paytmarrearsfragment)
    {
        if (paytmarrearsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(paytmarrearsfragment);
            paytmarrearsfragment.c = (chp)c.a();
            paytmarrearsfragment.d = (cev)d.a();
            paytmarrearsfragment.e = (hkr)e.a();
            paytmarrearsfragment.f = (dki)f.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((PaytmArrearsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!ety.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
