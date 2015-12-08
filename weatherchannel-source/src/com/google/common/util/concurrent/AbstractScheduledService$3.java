// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractScheduledService

class val.executor extends val.executor
{

    final AbstractScheduledService this$0;
    final ScheduledExecutorService val$executor;

    public void failed(val.executor executor1, Throwable throwable)
    {
        val$executor.shutdown();
    }

    public void terminated(val.executor executor1)
    {
        val$executor.shutdown();
    }

    ()
    {
        this$0 = final_abstractscheduledservice;
        val$executor = ScheduledExecutorService.this;
        super();
    }
}
