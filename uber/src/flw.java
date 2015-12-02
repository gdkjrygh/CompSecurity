// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mobileapptracker.MobileAppTracker;

public final class flw
    implements hst
{

    static final boolean a;
    private final flt b;
    private final hzb c;
    private final hzb d;

    private flw(flt flt1, hzb hzb1, hzb hzb2)
    {
        if (!a && flt1 == null)
        {
            throw new AssertionError();
        }
        b = flt1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(flt flt1, hzb hzb1, hzb hzb2)
    {
        return new flw(flt1, hzb1, hzb2);
    }

    private fmv b()
    {
        return flt.a((MobileAppTracker)c.a(), (czf)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!flw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
