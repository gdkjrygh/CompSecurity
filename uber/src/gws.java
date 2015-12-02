// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelLinkAccountActivity;

public final class gws
    implements gvl
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;

    private gws(gwt gwt1)
    {
        if (!a && gwt1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwt1);
            return;
        }
    }

    gws(gwt gwt1, byte byte0)
    {
        this(gwt1);
    }

    public static gwt a()
    {
        return new gwt((byte)0);
    }

    private void a(gwt gwt1)
    {
        b = gta.a(gwt.a(gwt1));
        c = gvq.a(gwt.b(gwt1), b);
        d = gsu.a(gwt.a(gwt1));
        e = gsz.a(gwt.a(gwt1));
        f = gvr.a(gwt.b(gwt1), e);
        g = gvm.a(hsu.a(), c, d, f);
    }

    public final void a(AirtelLinkAccountActivity airtellinkaccountactivity)
    {
        g.injectMembers(airtellinkaccountactivity);
    }

    static 
    {
        boolean flag;
        if (!gws.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
