// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            PriorityThreadPoolExecutor

protected static final class threadPriority
    implements ThreadFactory
{

    private final int threadPriority;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setPriority(threadPriority);
        runnable.setName("Queue");
        return runnable;
    }

    public a(int i)
    {
        threadPriority = i;
    }
}
