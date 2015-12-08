// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.LinkedList;
import java.util.concurrent.Executor;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

private static class <init>
    implements Executor
{

    Runnable active;
    final LinkedList tasks;

    public void execute(final Runnable r)
    {
        this;
        JVM INSTR monitorenter ;
        tasks.offer(new Runnable() {

            final AsyncTask.SerialExecutor this$0;
            final Runnable val$r;

            public void run()
            {
                r.run();
                scheduleNext();
                return;
                Exception exception;
                exception;
                scheduleNext();
                throw exception;
            }

            
            {
                this$0 = AsyncTask.SerialExecutor.this;
                r = runnable;
                super();
            }
        });
        if (active == null)
        {
            scheduleNext();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        r;
        throw r;
    }

    protected void scheduleNext()
    {
        this;
        JVM INSTR monitorenter ;
        Runnable runnable;
        runnable = (Runnable)tasks.poll();
        active = runnable;
        if (runnable == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(active);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private _cls1.val.r()
    {
        tasks = new LinkedList();
    }

    tasks(tasks tasks1)
    {
        this();
    }
}
