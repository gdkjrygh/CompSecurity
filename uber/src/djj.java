// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;

public final class djj
    implements hst
{

    static final boolean a;
    private final djh b;
    private final hzb c;

    private djj(djh djh1, hzb hzb1)
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
        return new djj(djh1, hzb1);
    }

    private ScheduledExecutorService b()
    {
        ScheduledExecutorService scheduledexecutorservice = djh.d((drt)c.a());
        if (scheduledexecutorservice == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return scheduledexecutorservice;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!djj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
