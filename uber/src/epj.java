// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditPaymentProfileActivity;

public final class epj
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private epj(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
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
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new epj(hsr1, hzb1, hzb2, hzb3);
    }

    private void a(EditPaymentProfileActivity editpaymentprofileactivity)
    {
        if (editpaymentprofileactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(editpaymentprofileactivity);
            editpaymentprofileactivity.h = (chp)c.a();
            editpaymentprofileactivity.i = (hkr)d.a();
            editpaymentprofileactivity.j = (czq)e.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((EditPaymentProfileActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!epj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
