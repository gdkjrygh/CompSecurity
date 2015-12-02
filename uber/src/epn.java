// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditThirdPartyPaymentProviderFragment;

public final class epn
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
    private final hzb i;
    private final hzb j;
    private final hzb k;

    private epn(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7, hzb hzb8, hzb hzb9)
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
        }
        h = hzb6;
        if (!a && hzb7 == null)
        {
            throw new AssertionError();
        }
        i = hzb7;
        if (!a && hzb8 == null)
        {
            throw new AssertionError();
        }
        j = hzb8;
        if (!a && hzb9 == null)
        {
            throw new AssertionError();
        } else
        {
            k = hzb9;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8, hzb hzb9)
    {
        return new epn(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8, hzb9);
    }

    private void a(EditThirdPartyPaymentProviderFragment editthirdpartypaymentproviderfragment)
    {
        if (editthirdpartypaymentproviderfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(editthirdpartypaymentproviderfragment);
            editthirdpartypaymentproviderfragment.c = (chp)c.a();
            editthirdpartypaymentproviderfragment.d = (cev)d.a();
            editthirdpartypaymentproviderfragment.e = (hkr)e.a();
            editthirdpartypaymentproviderfragment.f = (hku)f.a();
            editthirdpartypaymentproviderfragment.g = (eoy)g.a();
            editthirdpartypaymentproviderfragment.h = (hkj)h.a();
            editthirdpartypaymentproviderfragment.i = (dpg)i.a();
            editthirdpartypaymentproviderfragment.j = (dkn)j.a();
            editthirdpartypaymentproviderfragment.k = (eyy)k.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((EditThirdPartyPaymentProviderFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!epn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
