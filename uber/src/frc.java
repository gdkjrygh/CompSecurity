// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class frc
    implements hst
{

    static final boolean a;
    private final fqq b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private frc(fqq fqq1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && fqq1 == null)
        {
            throw new AssertionError();
        }
        b = fqq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hst a(fqq fqq1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new frc(fqq1, hzb1, hzb2, hzb3);
    }

    private fxi b()
    {
        RiderActivity rideractivity = (RiderActivity)c.a();
        dal dal1 = (dal)d.a();
        e.a();
        return fqq.a(rideractivity, dal1);
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!frc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
