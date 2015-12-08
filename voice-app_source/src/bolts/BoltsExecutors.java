// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package bolts:
//            AndroidExecutors

final class BoltsExecutors
{
    private static class ImmediateExecutor
        implements Executor
    {

        private static final int MAX_DEPTH = 15;
        private ThreadLocal executionDepth;

        private int decrementDepth()
        {
            Integer integer1 = (Integer)executionDepth.get();
            Integer integer = integer1;
            if (integer1 == null)
            {
                integer = Integer.valueOf(0);
            }
            int i = integer.intValue() - 1;
            if (i == 0)
            {
                executionDepth.remove();
                return i;
            } else
            {
                executionDepth.set(Integer.valueOf(i));
                return i;
            }
        }

        private int incrementDepth()
        {
            Integer integer1 = (Integer)executionDepth.get();
            Integer integer = integer1;
            if (integer1 == null)
            {
                integer = Integer.valueOf(0);
            }
            int i = integer.intValue() + 1;
            executionDepth.set(Integer.valueOf(i));
            return i;
        }

        public void execute(Runnable runnable)
        {
            if (incrementDepth() > 15) goto _L2; else goto _L1
_L1:
            runnable.run();
_L4:
            decrementDepth();
            return;
_L2:
            BoltsExecutors.background().execute(runnable);
            if (true) goto _L4; else goto _L3
_L3:
            runnable;
            decrementDepth();
            throw runnable;
        }

        private ImmediateExecutor()
        {
            executionDepth = new ThreadLocal();
        }

    }


    private static final BoltsExecutors INSTANCE = new BoltsExecutors();
    private final ExecutorService background;
    private final Executor immediate = new ImmediateExecutor();
    private final ScheduledExecutorService scheduled = Executors.newSingleThreadScheduledExecutor();

    private BoltsExecutors()
    {
        ExecutorService executorservice;
        if (!isAndroidRuntime())
        {
            executorservice = Executors.newCachedThreadPool();
        } else
        {
            executorservice = AndroidExecutors.newCachedThreadPool();
        }
        background = executorservice;
    }

    public static ExecutorService background()
    {
        return INSTANCE.background;
    }

    static Executor immediate()
    {
        return INSTANCE.immediate;
    }

    private static boolean isAndroidRuntime()
    {
        String s = System.getProperty("java.runtime.name");
        if (s == null)
        {
            return false;
        } else
        {
            return s.toLowerCase(Locale.US).contains("android");
        }
    }

    static ScheduledExecutorService scheduled()
    {
        return INSTANCE.scheduled;
    }

}
