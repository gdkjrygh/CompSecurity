// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class fxr
    implements hst
{

    static final boolean a;
    private final hzb b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private fxr(hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        b = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        c = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        d = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            e = hzb4;
            return;
        }
    }

    public static hst a(hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new fxr(hzb1, hzb2, hzb3, hzb4);
    }

    private fxp b()
    {
        return new fxp((RiderActivity)b.a(), (gmg)c.a(), (fte)d.a(), (evt)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fxr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
