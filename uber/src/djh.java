// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class djh
{

    public djh()
    {
    }

    protected static drt a()
    {
        return new drq(new day());
    }

    protected static ExecutorService a(drt drt1)
    {
        return drt1.c();
    }

    static Executor b(drt drt1)
    {
        return drt1.b();
    }

    protected static ici c(drt drt1)
    {
        return drt1.d();
    }

    protected static ScheduledExecutorService d(drt drt1)
    {
        return drt1.e();
    }
}
