// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.crash.model.Crash;

public final class ddo
    implements hst
{

    static final boolean a;
    private final ddn b;
    private final hzb c;

    private ddo(ddn ddn1, hzb hzb1)
    {
        if (!a && ddn1 == null)
        {
            throw new AssertionError();
        }
        b = ddn1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ddn ddn1, hzb hzb1)
    {
        return new ddo(ddn1, hzb1);
    }

    private Crash b()
    {
        Crash crash = ddn.a((gmg)c.a());
        if (crash == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return crash;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
