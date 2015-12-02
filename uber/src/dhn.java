// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;

public final class dhn
    implements hst
{

    static final boolean a;
    private final dfq b;
    private final hzb c;

    private dhn(dfq dfq1, hzb hzb1)
    {
        if (!a && dfq1 == null)
        {
            throw new AssertionError();
        }
        b = dfq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dfq dfq1, hzb hzb1)
    {
        return new dhn(dfq1, hzb1);
    }

    private don b()
    {
        return b.a((ExecutorService)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dhn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
