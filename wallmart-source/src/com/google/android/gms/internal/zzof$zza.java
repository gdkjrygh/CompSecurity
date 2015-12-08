// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzof

private class <init> extends ThreadPoolExecutor
{

    final zzof zzaIj;

    protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new FutureTask(runnable, obj) {

            final zzof.zza zzaIk;

            protected void setException(Throwable throwable)
            {
                Thread.UncaughtExceptionHandler uncaughtexceptionhandler = zzof.zzb(zzaIk.zzaIj);
                if (uncaughtexceptionhandler == null) goto _L2; else goto _L1
_L1:
                uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), throwable);
_L4:
                super.setException(throwable);
                return;
_L2:
                if (Log.isLoggable("GAv4", 6))
                {
                    Log.e("GAv4", (new StringBuilder()).append("MeasurementExecutor: job failed with ").append(throwable).toString());
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                zzaIk = zzof.zza.this;
                super(runnable, obj);
            }
        };
    }

    public _cls1.zzaIk(zzof zzof1)
    {
        zzaIj = zzof1;
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        setThreadFactory(new <init>(null));
    }
}
