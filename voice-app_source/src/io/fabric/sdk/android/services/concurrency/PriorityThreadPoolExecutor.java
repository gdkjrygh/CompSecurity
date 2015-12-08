// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            DependencyPriorityBlockingQueue, Task, PriorityTask, PriorityFutureTask

public class PriorityThreadPoolExecutor extends ThreadPoolExecutor
{
    protected static final class PriorityThreadFactory
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

        public PriorityThreadFactory(int i)
        {
            threadPriority = i;
        }
    }


    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final long KEEP_ALIVE = 1L;
    private static final int MAXIMUM_POOL_SIZE;

    PriorityThreadPoolExecutor(int i, int j, long l, TimeUnit timeunit, DependencyPriorityBlockingQueue dependencypriorityblockingqueue, ThreadFactory threadfactory)
    {
        super(i, j, l, timeunit, dependencypriorityblockingqueue, threadfactory);
        prestartAllCoreThreads();
    }

    public static PriorityThreadPoolExecutor create()
    {
        return create(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE);
    }

    public static PriorityThreadPoolExecutor create(int i)
    {
        return create(i, i);
    }

    public static PriorityThreadPoolExecutor create(int i, int j)
    {
        return new PriorityThreadPoolExecutor(i, j, 1L, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new PriorityThreadFactory(10));
    }

    protected void afterExecute(Runnable runnable, Throwable throwable)
    {
        Task task = (Task)runnable;
        task.setFinished(true);
        task.setError(throwable);
        getQueue().recycleBlockedQueue();
        super.afterExecute(runnable, throwable);
    }

    public void execute(Runnable runnable)
    {
        if (PriorityTask.isProperDelegate(runnable))
        {
            super.execute(runnable);
            return;
        } else
        {
            super.execute(newTaskFor(runnable, null));
            return;
        }
    }

    public DependencyPriorityBlockingQueue getQueue()
    {
        return (DependencyPriorityBlockingQueue)super.getQueue();
    }

    public volatile BlockingQueue getQueue()
    {
        return getQueue();
    }

    protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new PriorityFutureTask(runnable, obj);
    }

    protected RunnableFuture newTaskFor(Callable callable)
    {
        return new PriorityFutureTask(callable);
    }

    static 
    {
        CPU_COUNT = Runtime.getRuntime().availableProcessors();
        CORE_POOL_SIZE = CPU_COUNT + 1;
        MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
    }
}
