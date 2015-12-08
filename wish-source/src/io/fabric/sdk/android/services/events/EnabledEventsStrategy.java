// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStrategy, EventsFilesManager, TimeBasedFileRollOverRunnable, FilesSender

public abstract class EnabledEventsStrategy
    implements EventsStrategy
{

    static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    protected final Context context;
    final ScheduledExecutorService executorService;
    protected final EventsFilesManager filesManager;
    volatile int rolloverIntervalSeconds;
    final AtomicReference scheduledRolloverFutureRef = new AtomicReference();

    public EnabledEventsStrategy(Context context1, ScheduledExecutorService scheduledexecutorservice, EventsFilesManager eventsfilesmanager)
    {
        rolloverIntervalSeconds = -1;
        context = context1;
        executorService = scheduledexecutorservice;
        filesManager = eventsfilesmanager;
    }

    public void cancelTimeBasedFileRollOver()
    {
        if (scheduledRolloverFutureRef.get() != null)
        {
            CommonUtils.logControlled(context, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture)scheduledRolloverFutureRef.get()).cancel(false);
            scheduledRolloverFutureRef.set(null);
        }
    }

    protected void configureRollover(int i)
    {
        rolloverIntervalSeconds = i;
        scheduleTimeBasedFileRollOver(0L, rolloverIntervalSeconds);
    }

    public void deleteAllEvents()
    {
        filesManager.deleteAllEventsFiles();
    }

    public int getRollover()
    {
        return rolloverIntervalSeconds;
    }

    public void recordEvent(Object obj)
    {
        CommonUtils.logControlled(context, obj.toString());
        try
        {
            filesManager.writeEvent(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CommonUtils.logControlledError(context, "Failed to write event.", ((Throwable) (obj)));
        }
        scheduleTimeBasedRollOverIfNeeded();
    }

    public boolean rollFileOver()
    {
        boolean flag;
        try
        {
            flag = filesManager.rollFileOver();
        }
        catch (IOException ioexception)
        {
            CommonUtils.logControlledError(context, "Failed to roll file over.", ioexception);
            return false;
        }
        return flag;
    }

    void scheduleTimeBasedFileRollOver(long l, long l1)
    {
        TimeBasedFileRollOverRunnable timebasedfilerolloverrunnable;
        boolean flag;
        if (scheduledRolloverFutureRef.get() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        timebasedfilerolloverrunnable = new TimeBasedFileRollOverRunnable(context, this);
        CommonUtils.logControlled(context, (new StringBuilder()).append("Scheduling time based file roll over every ").append(l1).append(" seconds").toString());
        scheduledRolloverFutureRef.set(executorService.scheduleAtFixedRate(timebasedfilerolloverrunnable, l, l1, TimeUnit.SECONDS));
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        CommonUtils.logControlledError(context, "Failed to schedule time based file roll over", rejectedexecutionexception);
        return;
    }

    public void scheduleTimeBasedRollOverIfNeeded()
    {
        boolean flag;
        if (rolloverIntervalSeconds != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            scheduleTimeBasedFileRollOver(rolloverIntervalSeconds, rolloverIntervalSeconds);
        }
    }

    void sendAndCleanUpIfSuccess()
    {
        FilesSender filessender = getFilesSender();
        if (filessender != null) goto _L2; else goto _L1
_L1:
        CommonUtils.logControlled(context, "skipping files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        List list;
        int j;
        CommonUtils.logControlled(context, "Sending all files");
        j = 0;
        list = filesManager.getBatchOfFilesToSend();
_L7:
        int i;
        int k;
        k = j;
        i = j;
        if (list.size() <= 0) goto _L4; else goto _L3
_L3:
        i = j;
        CommonUtils.logControlled(context, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        }));
        i = j;
        boolean flag = filessender.send(list);
        k = j;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        i = j;
        k = j + list.size();
        i = k;
        filesManager.deleteSentFiles(list);
        if (flag) goto _L5; else goto _L4
_L4:
        if (k == 0)
        {
            filesManager.deleteOldestInRollOverIfOverMax();
            return;
        }
          goto _L6
_L5:
        i = k;
        list = filesManager.getBatchOfFilesToSend();
        j = k;
          goto _L7
        Exception exception;
        exception;
        CommonUtils.logControlledError(context, (new StringBuilder()).append("Failed to send batch of analytics files to server: ").append(exception.getMessage()).toString(), exception);
        k = i;
          goto _L4
    }

    public void sendEvents()
    {
        sendAndCleanUpIfSuccess();
    }
}
