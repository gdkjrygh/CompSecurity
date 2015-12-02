// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class enu
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private enu(hsr hsr1, hzb hzb1)
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
        return new enu(hsr1, hzb1);
    }

    private void a(com.ubercab.client.feature.payment.BaseAddPaymentV2Fragment.PromoViewFooter promoviewfooter)
    {
        if (promoviewfooter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(promoviewfooter);
            promoviewfooter.a = (cgh)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((com.ubercab.client.feature.payment.BaseAddPaymentV2Fragment.PromoViewFooter)obj);
    }

    static 
    {
        boolean flag;
        if (!enu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
