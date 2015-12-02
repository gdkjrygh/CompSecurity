// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelAddPaymentActivity;

public final class gwe
    implements gus
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hsr e;

    private gwe(gwf gwf1)
    {
        if (!a && gwf1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwf1);
            return;
        }
    }

    gwe(gwf gwf1, byte byte0)
    {
        this(gwf1);
    }

    public static gwf a()
    {
        return new gwf((byte)0);
    }

    private void a(gwf gwf1)
    {
        b = gsu.a(gwf.a(gwf1));
        c = gta.a(gwf.a(gwf1));
        d = gsx.a(gwf.a(gwf1), c);
        e = gut.a(hsu.a(), b, d);
    }

    public final void a(AirtelAddPaymentActivity airteladdpaymentactivity)
    {
        e.injectMembers(airteladdpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gwe.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
