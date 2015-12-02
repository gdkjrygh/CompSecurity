// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelEditPaymentActivity;

public final class gwo
    implements gvg
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hsr e;

    private gwo(gwp gwp1)
    {
        if (!a && gwp1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwp1);
            return;
        }
    }

    gwo(gwp gwp1, byte byte0)
    {
        this(gwp1);
    }

    public static gwp a()
    {
        return new gwp((byte)0);
    }

    private void a(gwp gwp1)
    {
        b = gsu.a(gwp.a(gwp1));
        c = gta.a(gwp.a(gwp1));
        d = gsy.a(gwp.a(gwp1), c);
        e = gvi.a(hsu.a(), b, d);
    }

    public final void a(AirtelEditPaymentActivity airteleditpaymentactivity)
    {
        e.injectMembers(airteleditpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gwo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
