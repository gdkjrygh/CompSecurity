// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class dra
{

    private final ScheduledExecutorService a;

    private dra(ScheduledExecutorService scheduledexecutorservice)
    {
        a = scheduledexecutorservice;
    }

    public static dra a(ScheduledExecutorService scheduledexecutorservice)
    {
        return new dra(scheduledexecutorservice);
    }

    public static drb a(drb drb1)
    {
        return drb1.a();
    }

    static ScheduledExecutorService a(dra dra1)
    {
        return dra1.a;
    }

    public final drb a(hjn hjn, long l, TimeUnit timeunit)
    {
        return a(new drb(this, hjn, l, timeunit, (byte)0));
    }
}
