// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.util.Log;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.go.weatherex.home.b:
//            a

class b
    implements RejectedExecutionHandler
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
    {
        synchronized (a.g)
        {
            Log.i("ImageManager", (new StringBuilder()).append("downloadImage, rejectedExecution, add to mWaitTasksQueue: ").append(runnable.toString()).toString());
            a.f.offer(runnable);
        }
        return;
        runnable;
        threadpoolexecutor;
        JVM INSTR monitorexit ;
        throw runnable;
    }
}
