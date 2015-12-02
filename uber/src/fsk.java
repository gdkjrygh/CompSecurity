// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class fsk
    implements hst
{

    static final boolean a;
    private final frt b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private fsk(frt frt1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && frt1 == null)
        {
            throw new AssertionError();
        }
        b = frt1;
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

    public static hst a(frt frt1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new fsk(frt1, hzb1, hzb2, hzb3);
    }

    private fwf b()
    {
        return frt.a((chp)c.a(), (RiderActivity)d.a(), (fte)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fsk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
