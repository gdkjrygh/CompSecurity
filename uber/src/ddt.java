// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.crash.CrashlineClient;
import java.util.concurrent.ExecutorService;

public final class ddt
    implements hst
{

    static final boolean a;
    private final ddn b;
    private final hzb c;
    private final hzb d;

    private ddt(ddn ddn1, hzb hzb1, hzb hzb2)
    {
        if (!a && ddn1 == null)
        {
            throw new AssertionError();
        }
        b = ddn1;
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

    public static hst a(ddn ddn1, hzb hzb1, hzb hzb2)
    {
        return new ddt(ddn1, hzb1, hzb2);
    }

    private CrashlineClient b()
    {
        return ddn.a((gqn)c.a(), (ExecutorService)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
