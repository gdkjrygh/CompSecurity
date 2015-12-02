// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelAddFundsActivity;

public final class gwa
    implements guo
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hzb h;
    private hzb i;
    private hzb j;
    private hsr k;

    private gwa(gwb gwb1)
    {
        if (!a && gwb1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwb1);
            return;
        }
    }

    gwa(gwb gwb1, byte byte0)
    {
        this(gwb1);
    }

    public static gwb a()
    {
        return new gwb((byte)0);
    }

    private void a(gwb gwb1)
    {
        b = gta.a(gwb.a(gwb1));
        c = gvq.a(gwb.b(gwb1), b);
        d = gsu.a(gwb.a(gwb1));
        e = gsz.a(gwb.a(gwb1));
        f = gvs.a(gwb.b(gwb1), e);
        g = gxe.a(gxg.b(), f);
        h = gsv.a(gwb.a(gwb1));
        i = gsw.a(gwb.a(gwb1));
        j = gsy.a(gwb.a(gwb1), b);
        k = gup.a(hsu.a(), c, d, g, h, i, j);
    }

    public final void a(AirtelAddFundsActivity airteladdfundsactivity)
    {
        k.injectMembers(airteladdfundsactivity);
    }

    static 
    {
        boolean flag;
        if (!gwa.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
