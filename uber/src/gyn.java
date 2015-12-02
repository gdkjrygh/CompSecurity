// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.creditcard.CreditCardAddPaymentActivity;

public final class gyn
    implements gyg
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hsr h;

    private gyn(gyo gyo1)
    {
        if (!a && gyo1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gyo1);
            return;
        }
    }

    gyn(gyo gyo1, byte byte0)
    {
        this(gyo1);
    }

    public static gyo a()
    {
        return new gyo((byte)0);
    }

    private void a(gyo gyo1)
    {
        b = gsu.a(gyo.a(gyo1));
        c = gta.a(gyo.a(gyo1));
        d = gyk.a(gyo.b(gyo1), c);
        e = gyj.a(gyo.b(gyo1));
        f = gsv.a(gyo.a(gyo1));
        g = gyl.a(gyo.b(gyo1));
        h = gyh.a(hsu.a(), b, d, e, f, g);
    }

    public final void a(CreditCardAddPaymentActivity creditcardaddpaymentactivity)
    {
        h.injectMembers(creditcardaddpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gyn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
