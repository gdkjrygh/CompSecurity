// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.v2.PaytmAddFundsActivity;

public final class eut
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private eut(hsr hsr1, hzb hzb1)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1)
    {
        return new eut(hsr1, hzb1);
    }

    private void a(PaytmAddFundsActivity paytmaddfundsactivity)
    {
        if (paytmaddfundsactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(paytmaddfundsactivity);
            paytmaddfundsactivity.h = (czq)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((PaytmAddFundsActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!eut.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
