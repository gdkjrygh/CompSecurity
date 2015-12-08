// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class AndroidExecutors
{
    private static class UIThreadExecutor
        implements Executor
    {

        public void execute(Runnable runnable)
        {
            (new Handler(Looper.getMainLooper())).post(runnable);
        }

        private UIThreadExecutor()
        {
        }

    }


    static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final AndroidExecutors INSTANCE = new AndroidExecutors();
    static final long KEEP_ALIVE_TIME = 1L;
    static final int MAX_POOL_SIZE;
    private final Executor uiThread = new UIThreadExecutor();

    private AndroidExecutors()
    {
    }

    public static void allowCoreThreadTimeout(ThreadPoolExecutor threadpoolexecutor, boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            threadpoolexecutor.allowCoreThreadTimeOut(flag);
        }
    }

    public static ExecutorService newCachedThreadPool()
    {
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        allowCoreThreadTimeout(threadpoolexecutor, true);
        return threadpoolexecutor;
    }

    public static ExecutorService newCachedThreadPool(ThreadFactory threadfactory)
    {
        threadfactory = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadfactory);
        allowCoreThreadTimeout(threadfactory, true);
        return threadfactory;
    }

    public static Executor uiThread()
    {
        return INSTANCE.uiThread;
    }

    static 
    {
        CPU_COUNT = Runtime.getRuntime().availableProcessors();
        CORE_POOL_SIZE = CPU_COUNT + 1;
        MAX_POOL_SIZE = CPU_COUNT * 2 + 1;
    }
}
