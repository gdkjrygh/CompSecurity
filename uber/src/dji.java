// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;

public final class dji
    implements hst
{

    static final boolean a;
    private final djh b;
    private final hzb c;

    private dji(djh djh1, hzb hzb1)
    {
        if (!a && djh1 == null)
        {
            throw new AssertionError();
        }
        b = djh1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(djh djh1, hzb hzb1)
    {
        return new dji(djh1, hzb1);
    }

    private ExecutorService b()
    {
        ExecutorService executorservice = djh.a((drt)c.a());
        if (executorservice == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return executorservice;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dji.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
