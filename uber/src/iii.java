// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

final class iii
{

    private static final igh a = new igh("RxScheduledExecutorPool-");
    private static final iii b = new iii();
    private final ScheduledExecutorService c;

    private iii()
    {
        byte byte0 = 8;
        super();
        int j = Runtime.getRuntime().availableProcessors();
        int i = j;
        if (j > 4)
        {
            i = j / 2;
        }
        if (i > 8)
        {
            i = byte0;
        }
        ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(i, a);
        if (!ify.a(scheduledexecutorservice) && (scheduledexecutorservice instanceof ScheduledThreadPoolExecutor))
        {
            ify.a((ScheduledThreadPoolExecutor)scheduledexecutorservice);
        }
        c = scheduledexecutorservice;
    }

    public static ScheduledExecutorService a()
    {
        return b.c;
    }

}
