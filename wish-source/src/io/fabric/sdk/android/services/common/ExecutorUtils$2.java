// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            BackgroundPriorityRunnable, ExecutorUtils

static final class tyRunnable extends BackgroundPriorityRunnable
{

    final ExecutorService val$service;
    final String val$serviceName;
    final long val$terminationTimeout;
    final TimeUnit val$timeUnit;

    public void onRun()
    {
        try
        {
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Executing shutdown hook for ").append(val$serviceName).toString());
            val$service.shutdown();
            if (!val$service.awaitTermination(val$terminationTimeout, val$timeUnit))
            {
                Fabric.getLogger().d("Fabric", (new StringBuilder()).append(val$serviceName).append(" did not shut down in the").append(" allocated time. Requesting immediate shutdown.").toString());
                val$service.shutdownNow();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Fabric.getLogger().d("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
                val$serviceName
            }));
        }
        val$service.shutdownNow();
    }

    tyRunnable(String s, ExecutorService executorservice, long l, TimeUnit timeunit)
    {
        val$serviceName = s;
        val$service = executorservice;
        val$terminationTimeout = l;
        val$timeUnit = timeunit;
        super();
    }
}
