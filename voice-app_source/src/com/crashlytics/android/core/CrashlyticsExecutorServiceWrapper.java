// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.os.Looper;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class CrashlyticsExecutorServiceWrapper
{

    private final ExecutorService executorService;

    public CrashlyticsExecutorServiceWrapper(ExecutorService executorservice)
    {
        executorService = executorservice;
    }

    Future executeAsync(final Runnable runnable)
    {
        try
        {
            runnable = executorService.submit(new Runnable() {

                final CrashlyticsExecutorServiceWrapper this$0;
                final Runnable val$runnable;

                public void run()
                {
                    try
                    {
                        runnable.run();
                        return;
                    }
                    catch (Exception exception)
                    {
                        Fabric.getLogger().e("CrashlyticsCore", "Failed to execute task.", exception);
                    }
                }

            
            {
                this$0 = CrashlyticsExecutorServiceWrapper.this;
                runnable = runnable1;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final Runnable runnable)
        {
            Fabric.getLogger().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    Future executeAsync(final Callable callable)
    {
        try
        {
            callable = executorService.submit(new Callable() {

                final CrashlyticsExecutorServiceWrapper this$0;
                final Callable val$callable;

                public Object call()
                    throws Exception
                {
                    Object obj;
                    try
                    {
                        obj = callable.call();
                    }
                    catch (Exception exception)
                    {
                        Fabric.getLogger().e("CrashlyticsCore", "Failed to execute task.", exception);
                        return null;
                    }
                    return obj;
                }

            
            {
                this$0 = CrashlyticsExecutorServiceWrapper.this;
                callable = callable1;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final Callable callable)
        {
            Fabric.getLogger().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }

    Object executeSyncLoggingException(Callable callable)
    {
        try
        {
            if (Looper.getMainLooper() == Looper.myLooper())
            {
                return executorService.submit(callable).get(4L, TimeUnit.SECONDS);
            }
            callable = ((Callable) (executorService.submit(callable).get()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            Fabric.getLogger().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            Fabric.getLogger().e("CrashlyticsCore", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }
}
