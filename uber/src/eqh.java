// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class eqh
    implements hst
{

    static final boolean a;
    private final eqg b;
    private final hzb c;
    private final hzb d;

    private eqh(eqg eqg1, hzb hzb1, hzb hzb2)
    {
        if (!a && eqg1 == null)
        {
            throw new AssertionError();
        }
        b = eqg1;
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

    public static hst a(eqg eqg1, hzb hzb1, hzb hzb2)
    {
        return new eqh(eqg1, hzb1, hzb2);
    }

    private eqm b()
    {
        return eqg.a((czf)c.a(), (Application)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!eqh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
