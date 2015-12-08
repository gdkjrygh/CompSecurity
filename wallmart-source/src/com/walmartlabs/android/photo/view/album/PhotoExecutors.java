// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class PhotoExecutors
{

    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE;
    public static final Executor THREAD_POOL_EXECUTOR;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;

    public PhotoExecutors()
    {
    }

    static 
    {
        CPU_COUNT = Runtime.getRuntime().availableProcessors();
        CORE_POOL_SIZE = CPU_COUNT + 1;
        MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
        sThreadFactory = new ThreadFactory() {

            private final AtomicInteger mCount = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("PhotoAsyncTask #").append(mCount.getAndIncrement()).toString());
            }

        };
        sPoolWorkQueue = new LinkedBlockingDeque(64) {

            public volatile boolean offer(Object obj)
            {
                return offer((Runnable)obj);
            }

            public volatile boolean offer(Object obj, long l, TimeUnit timeunit)
                throws InterruptedException
            {
                return offer((Runnable)obj, l, timeunit);
            }

            public boolean offer(Runnable runnable)
            {
                return super.offerFirst(runnable);
            }

            public boolean offer(Runnable runnable, long l, TimeUnit timeunit)
                throws InterruptedException
            {
                return super.offerFirst(runnable, l, timeunit);
            }

        };
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory, new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
    }
}
