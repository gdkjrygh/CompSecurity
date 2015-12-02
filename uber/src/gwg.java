// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelChargePaymentActivity;

public final class gwg
    implements guu
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hsr d;

    private gwg(gwh gwh1)
    {
        if (!a && gwh1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwh1);
            return;
        }
    }

    gwg(gwh gwh1, byte byte0)
    {
        this(gwh1);
    }

    public static gwh a()
    {
        return new gwh((byte)0);
    }

    private void a(gwh gwh1)
    {
        b = gta.a(gwh.a(gwh1));
        c = gvq.a(gwh.b(gwh1), b);
        d = guv.a(hsu.a(), c);
    }

    public final void a(AirtelChargePaymentActivity airtelchargepaymentactivity)
    {
        d.injectMembers(airtelchargepaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gwg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
