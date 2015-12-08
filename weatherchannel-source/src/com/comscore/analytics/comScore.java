// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import android.content.Context;
import com.comscore.applications.EventType;
import com.comscore.utils.TransmissionMode;
import com.comscore.utils.task.TaskExecutor;
import java.util.HashMap;

// Referenced classes of package com.comscore.analytics:
//            Core

public class comScore
{

    private static Core a = new Core();

    public comScore()
    {
    }

    public static void aggregate(HashMap hashmap)
    {
        a.notify(EventType.AGGREGATE, hashmap, true);
    }

    public static void allowLiveTransmission(TransmissionMode transmissionmode)
    {
        a.allowLiveTransmission(transmissionmode, true);
    }

    public static void allowOfflineTransmission(TransmissionMode transmissionmode)
    {
        a.allowOfflineTransmission(transmissionmode, true);
    }

    public static void disableAutoUpdate()
    {
        a.disableAutoUpdate();
    }

    public static void enableAutoUpdate()
    {
        enableAutoUpdate(60, true);
    }

    public static void enableAutoUpdate(int i)
    {
        enableAutoUpdate(i, true);
    }

    public static void enableAutoUpdate(int i, boolean flag)
    {
        a.enableAutoUpdate(i, flag, true);
    }

    public static void flushCache()
    {
        a.flush(true);
    }

    public static String getAppName()
    {
        return a.getAppName();
    }

    public static String getAutoStartLabel(String s)
    {
        return a.getAutoStartLabel(s);
    }

    public static HashMap getAutoStartLabels()
    {
        return a.getAutoStartLabels();
    }

    public static long getCacheFlushingInterval()
    {
        return a.getCacheFlushingInterval();
    }

    public static int getCacheMaxBatchFiles()
    {
        return a.getCacheMaxBatchFiles();
    }

    public static int getCacheMaxFlushesInARow()
    {
        return a.getCacheMaxFlushesInARow();
    }

    public static int getCacheMaxMeasurements()
    {
        return a.getCacheMaxMeasurements();
    }

    public static long getCacheMeasurementExpiry()
    {
        return a.getCacheMeasurementExpiry();
    }

    public static long getCacheMinutesToRetry()
    {
        return a.getCacheMinutesToRetry();
    }

    public static Core getCore()
    {
        return a;
    }

    public static String getCustomerC2()
    {
        return a.getCustomerC2();
    }

    public static boolean getErrorHandlingEnabled()
    {
        return a.getErrorHandlingEnabled();
    }

    public static long getGenesis()
    {
        return a.getGenesis();
    }

    public static String getLabel(String s)
    {
        return a.getLabel(s);
    }

    public static HashMap getLabels()
    {
        return a.getLabels();
    }

    public static TransmissionMode getLiveTransmissionMode()
    {
        return a.getLiveTransmissionMode();
    }

    public static String[] getMeasurementLabelOrder()
    {
        return a.getMeasurementLabelOrder();
    }

    public static TransmissionMode getOfflineTransmissionMode()
    {
        return a.getOfflineTransmissionMode();
    }

    public static String getPixelURL()
    {
        return a.getPixelURL();
    }

    public static String getPublisherSecret()
    {
        return a.getPublisherSecret();
    }

    public static String getVersion()
    {
        return a.getVersion();
    }

    public static String getVisitorID()
    {
        return a.getVisitorId();
    }

    public static void hidden()
    {
        a.notify(EventType.HIDDEN, new HashMap(), true);
    }

    public static void hidden(HashMap hashmap)
    {
        a.notify(EventType.HIDDEN, hashmap, true);
    }

    public static boolean isAutoStartEnabled()
    {
        return a.isAutoStartEnabled();
    }

    public static boolean isEnabled()
    {
        return a.isEnabled();
    }

    public static boolean isKeepAliveEnabled()
    {
        return a.isKeepAliveEnabled();
    }

    public static boolean isSecure()
    {
        return a.isSecure();
    }

    public static void onEnterForeground()
    {
        a.onEnterForeground();
    }

    public static void onExitForeground()
    {
        a.onExitForeground();
    }

    public static void onUserInteraction()
    {
        a.onUserInteraction();
    }

    public static void onUxActive()
    {
        a.onUxActive();
    }

    public static void onUxInactive()
    {
        a.onUxInactive();
    }

    public static void setAppContext(Context context)
    {
        a.setAppContext(context);
    }

    public static void setAppName(String s)
    {
        a.setAppName(s, true);
    }

    public static void setAutoStartEnabled(boolean flag)
    {
        a.setAutoStartEnabled(flag, true);
    }

    public static void setAutoStartLabel(String s, String s1)
    {
        a.setAutoStartLabel(s, s1);
    }

    public static void setAutoStartLabels(HashMap hashmap)
    {
        a.setAutoStartLabels(hashmap);
    }

    public static void setCacheFlushingInterval(long l)
    {
        a.setCacheFlushingInterval(l, true);
    }

    public static void setCacheMaxBatchFiles(int i)
    {
        a.setCacheMaxBatchFiles(i, true);
    }

    public static void setCacheMaxFlushesInARow(int i)
    {
        a.setCacheMaxFlushesInARow(i, true);
    }

    public static void setCacheMaxMeasurements(int i)
    {
        a.setCacheMaxMeasurements(i, true);
    }

    public static void setCacheMeasurementExpiry(int i)
    {
        a.setCacheMeasurementExpiry(i, true);
    }

    public static void setCacheMinutesToRetry(int i)
    {
        a.setCacheMinutesToRetry(i, true);
    }

    public static void setCustomerC2(String s)
    {
        a.setCustomerC2(s, true);
    }

    public static void setDebug(boolean flag)
    {
        a.setDebug(flag);
    }

    public static void setEnabled(boolean flag)
    {
        a.setEnabled(flag);
    }

    public static void setErrorHandlingEnabled(boolean flag)
    {
        a.setErrorHandlingEnabled(flag);
    }

    public static void setKeepAliveEnabled(boolean flag)
    {
        a.setKeepAliveEnabled(flag, true);
    }

    public static void setLabel(String s, String s1)
    {
        a.setLabel(s, s1, true);
    }

    public static void setLabels(HashMap hashmap)
    {
        a.setLabels(hashmap, true);
    }

    public static void setMeasurementLabelOrder(String as[])
    {
        a.setMeasurementLabelOrder(as, true);
    }

    public static void setOfflineURL(String s)
    {
        a.setOfflineURL(s);
    }

    public static void setPixelURL(String s)
    {
        a.setPixelURL(s, true);
    }

    public static void setPublisherSecret(String s)
    {
        a.setPublisherSecret(s, true);
    }

    public static void setSecure(boolean flag)
    {
        a.setSecure(flag, true);
    }

    public static void start()
    {
        a.notify(EventType.START, new HashMap(), true);
    }

    public static void start(HashMap hashmap)
    {
        a.notify(EventType.START, hashmap, true);
    }

    public static void update()
    {
        a.update();
    }

    public static void view()
    {
        a.notify(EventType.VIEW, new HashMap(), true);
    }

    public static void view(HashMap hashmap)
    {
        a.notify(EventType.VIEW, hashmap, true);
    }

    public static void waitForTasks()
    {
        a.getTaskExecutor().waitForTasks();
    }

    public boolean isAutoUpdateEnabled()
    {
        return a.isAutoUpdateEnabled();
    }

}
