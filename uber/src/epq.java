// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.PayNowActivity;

public final class epq
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;
    private final hzb h;

    private epq(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6)
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
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        }
        g = hzb5;
        if (!a && hzb6 == null)
        {
            throw new AssertionError();
        } else
        {
            h = hzb6;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6)
    {
        return new epq(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6);
    }

    private void a(PayNowActivity paynowactivity)
    {
        if (paynowactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(paynowactivity);
            paynowactivity.i = (chp)c.a();
            paynowactivity.j = (hkr)d.a();
            paynowactivity.k = (gmg)e.a();
            paynowactivity.l = (czq)f.a();
            paynowactivity.m = (dki)g.a();
            paynowactivity.n = (dkn)h.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((PayNowActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!epq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
