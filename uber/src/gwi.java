// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelCreateAccountActivity;

public final class gwi
    implements guw
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;

    private gwi(gwj gwj1)
    {
        if (!a && gwj1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwj1);
            return;
        }
    }

    gwi(gwj gwj1, byte byte0)
    {
        this(gwj1);
    }

    public static gwj a()
    {
        return new gwj((byte)0);
    }

    private void a(gwj gwj1)
    {
        b = gta.a(gwj.a(gwj1));
        c = gvq.a(gwj.b(gwj1), b);
        d = gsu.a(gwj.a(gwj1));
        e = gsz.a(gwj.a(gwj1));
        f = gvr.a(gwj.b(gwj1), e);
        g = gux.a(hsu.a(), c, d, f);
    }

    public final void a(AirtelCreateAccountActivity airtelcreateaccountactivity)
    {
        g.injectMembers(airtelcreateaccountactivity);
    }

    static 
    {
        boolean flag;
        if (!gwi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
