// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.Airtel2faActivity;

public final class gvy
    implements gul
{

    static final boolean a;
    private hzb b;
    private hsr c;

    private gvy(gvz gvz1)
    {
        if (!a && gvz1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gvz1);
            return;
        }
    }

    gvy(gvz gvz1, byte byte0)
    {
        this(gvz1);
    }

    public static gvz a()
    {
        return new gvz((byte)0);
    }

    private void a(gvz gvz1)
    {
        b = gsu.a(gvz.a(gvz1));
        c = gun.a(hsu.a(), b);
    }

    public final void a(Airtel2faActivity airtel2faactivity)
    {
        c.injectMembers(airtel2faactivity);
    }

    static 
    {
        boolean flag;
        if (!gvy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
