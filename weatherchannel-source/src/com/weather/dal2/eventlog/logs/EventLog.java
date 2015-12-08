// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import android.util.Log;
import com.weather.dal2.config.DalConfig;
import com.weather.dal2.config.DalConfigManager;
import com.weather.dal2.eventlog.batch.BatchedEventReport;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.weather.dal2.eventlog.logs:
//            WarningLogsBatchedEventReport, ErrorLogsBatchedEventReport, LogBatchedItem

public final class EventLog
{
    private static class LogThreadFactory
        implements ThreadFactory
    {

        public Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, "EventLog");
        }

        private LogThreadFactory()
        {
        }

    }


    private static BatchedEventReport errorReport = ErrorLogsBatchedEventReport.getInstance();
    private static final ExecutorService executorService = Executors.newSingleThreadExecutor(new LogThreadFactory());
    private static boolean suppressAllLogging;
    private static TimeProvider timeProvider = SystemTimeProvider.getInstance();
    private static BatchedEventReport warningReport = WarningLogsBatchedEventReport.getInstance();

    private EventLog()
    {
    }

    static void awaitCompletion()
        throws InterruptedException, TimeoutException
    {
        CountDownLatch countdownlatch = new CountDownLatch(1);
        executorService.submit(new Runnable(countdownlatch) {

            final CountDownLatch val$latch;

            public void run()
            {
                latch.countDown();
            }

            
            {
                latch = countdownlatch;
                super();
            }
        });
        if (!countdownlatch.await(1L, TimeUnit.MINUTES))
        {
            throw new TimeoutException("Timed out waiting for logging to complete");
        } else
        {
            return;
        }
    }

    private static void batch(String s, String s1, Throwable throwable, BatchedEventReport batchedeventreport, boolean flag)
    {
        if (flag)
        {
            executorService.submit(new Runnable(batchedeventreport, s, s1, throwable) {

                final String val$msg;
                final BatchedEventReport val$report;
                final String val$tag;
                final Throwable val$tr;

                public void run()
                {
                    report.process(new LogBatchedItem(tag, msg, tr, EventLog.timeProvider.currentTimeMillis()));
                }

            
            {
                report = batchedeventreport;
                tag = s;
                msg = s1;
                tr = throwable;
                super();
            }
            });
        }
    }

    public static void e(String s, String s1)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.e(s, s1);
            batch(s, s1, null, errorReport, isErrorsEnabled());
            return;
        }
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.e(s, s1, throwable);
            batch(s, s1, throwable, errorReport, isErrorsEnabled());
            return;
        }
    }

    private static boolean isErrorsEnabled()
    {
        return !suppressAllLogging && DalConfigManager.INSTANCE.getDalConfig().getErrorLogs().isEnabled();
    }

    private static boolean isWarningsEnabled()
    {
        return !suppressAllLogging && DalConfigManager.INSTANCE.getDalConfig().getWarningLogs().isEnabled();
    }

    static void resetToNonTest()
    {
        warningReport = WarningLogsBatchedEventReport.getInstance();
        errorReport = ErrorLogsBatchedEventReport.getInstance();
        timeProvider = SystemTimeProvider.getInstance();
        suppressAllLogging = false;
    }

    static void setErrorReport(BatchedEventReport batchedeventreport)
    {
        errorReport = batchedeventreport;
    }

    public static boolean setSuppressAllLogging(boolean flag)
    {
        boolean flag1 = suppressAllLogging;
        suppressAllLogging = flag;
        return flag1;
    }

    static void setTimeProvider(TimeProvider timeprovider)
    {
        timeProvider = timeprovider;
    }

    static void setWarningReport(BatchedEventReport batchedeventreport)
    {
        warningReport = batchedeventreport;
    }

    public static void w(String s, String s1)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.w(s, s1);
            batch(s, s1, null, warningReport, isWarningsEnabled());
            return;
        }
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.w(s, s1, throwable);
            batch(s, s1, throwable, warningReport, isWarningsEnabled());
            return;
        }
    }

    public static void w(String s, Throwable throwable)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.w(s, throwable);
            batch(s, null, throwable, warningReport, isWarningsEnabled());
            return;
        }
    }

    public static void wtf(String s, String s1)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.wtf(s, s1);
            batch(s, s1, null, errorReport, isErrorsEnabled());
            return;
        }
    }

    public static void wtf(String s, String s1, Throwable throwable)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.wtf(s, s1, throwable);
            batch(s, s1, throwable, errorReport, isErrorsEnabled());
            return;
        }
    }

    public static void wtf(String s, Throwable throwable)
    {
        if (suppressAllLogging)
        {
            return;
        } else
        {
            Log.wtf(s, throwable);
            batch(s, null, throwable, errorReport, isErrorsEnabled());
            return;
        }
    }


}
