// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            MoreExecutors

class val.timeUnit
    implements Runnable
{

    final val.timeUnit this$0;
    final ExecutorService val$service;
    final long val$terminationTimeout;
    final TimeUnit val$timeUnit;

    public void run()
    {
        try
        {
            val$service.shutdown();
            val$service.awaitTermination(val$terminationTimeout, val$timeUnit);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_;
        val$service = executorservice;
        val$terminationTimeout = l;
        val$timeUnit = TimeUnit.this;
        super();
    }
}
