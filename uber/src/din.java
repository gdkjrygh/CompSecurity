// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class din
    implements hst
{

    static final boolean a;
    private final dfq b;
    private final hzb c;
    private final hzb d;

    private din(dfq dfq1, hzb hzb1, hzb hzb2)
    {
        if (!a && dfq1 == null)
        {
            throw new AssertionError();
        }
        b = dfq1;
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

    public static hst a(dfq dfq1, hzb hzb1, hzb hzb2)
    {
        return new din(dfq1, hzb1, hzb2);
    }

    private gpt b()
    {
        return dfq.a((Application)c.a(), (djv)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!din.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
