// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.zaakpay.ZaakpayWebViewActivity;

public final class gzd
    implements gzj
{

    static final boolean a;
    private hzb b;
    private hsr c;

    private gzd(gze gze1)
    {
        if (!a && gze1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gze1);
            return;
        }
    }

    gzd(gze gze1, byte byte0)
    {
        this(gze1);
    }

    public static gze a()
    {
        return new gze((byte)0);
    }

    private void a(gze gze1)
    {
        b = gsu.a(gze.a(gze1));
        c = gzk.a(hsu.a(), b);
    }

    public final void a(ZaakpayWebViewActivity zaakpaywebviewactivity)
    {
        c.injectMembers(zaakpaywebviewactivity);
    }

    static 
    {
        boolean flag;
        if (!gzd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
