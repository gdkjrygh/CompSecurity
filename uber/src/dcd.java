// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class dcd
    implements hst
{

    static final boolean a;
    private final dcb b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;

    private dcd(dcb dcb1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && dcb1 == null)
        {
            throw new AssertionError();
        }
        b = dcb1;
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
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = hzb4;
            return;
        }
    }

    public static hst a(dcb dcb1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new dcd(dcb1, hzb1, hzb2, hzb3, hzb4);
    }

    private hjn b()
    {
        return b.a((Application)c.a(), (dak)d.a(), (dao)e.a(), hss.a(f));
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dcd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
