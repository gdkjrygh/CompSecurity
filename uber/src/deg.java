// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class deg
    implements djg
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;

    private deg(deh deh1)
    {
        if (!a && deh1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(deh1);
            return;
        }
    }

    deg(deh deh1, byte byte0)
    {
        this(deh1);
    }

    public static deh a()
    {
        return new deh((byte)0);
    }

    private void a(deh deh1)
    {
        b = hsw.a(djl.a(deh.a(deh1)));
        c = djm.a(deh.a(deh1), b);
        d = dji.a(deh.a(deh1), b);
        e = djk.a(deh.a(deh1), b);
        f = djj.a(deh.a(deh1), b);
    }

    public final Executor b()
    {
        return (Executor)c.a();
    }

    public final ExecutorService c()
    {
        return (ExecutorService)d.a();
    }

    public final ici d()
    {
        return (ici)e.a();
    }

    public final ScheduledExecutorService e()
    {
        return (ScheduledExecutorService)f.a();
    }

    public final drt f()
    {
        return (drt)b.a();
    }

    static 
    {
        boolean flag;
        if (!deg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
