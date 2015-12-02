// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelValidateCodeActivity;

public final class gwy
    implements gvw
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hsr e;

    private gwy(gwz gwz1)
    {
        if (!a && gwz1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwz1);
            return;
        }
    }

    gwy(gwz gwz1, byte byte0)
    {
        this(gwz1);
    }

    public static gwz a()
    {
        return new gwz((byte)0);
    }

    private void a(gwz gwz1)
    {
        b = gsu.a(gwz.a(gwz1));
        c = gta.a(gwz.a(gwz1));
        d = gvq.a(gwz.b(gwz1), c);
        e = gvx.a(hsu.a(), b, d);
    }

    public final void a(AirtelValidateCodeActivity airtelvalidatecodeactivity)
    {
        e.injectMembers(airtelvalidatecodeactivity);
    }

    static 
    {
        boolean flag;
        if (!gwy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
