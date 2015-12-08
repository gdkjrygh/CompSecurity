// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, TargetLocationRequest, TargetWorker

public final class Target
{
    public static interface TargetCallback
    {

        public abstract void call(Object obj);
    }


    private static final String NO_TARGET_MESSAGE = "Target - ADBMobile is not configured correctly to use Target.";

    public Target()
    {
    }

    public static void clearCookies()
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

            public void run()
            {
                TargetWorker.clearCookies();
            }

        });
    }

    public static TargetLocationRequest createOrderConfirmRequest(String s, String s1, String s2, String s3, Map map)
    {
        return TargetLocationRequest.createRequestWithOrderConfirm(s, s1, s2, s3, map);
    }

    public static TargetLocationRequest createRequest(String s, String s1, Map map)
    {
        return new TargetLocationRequest(s, s1, map);
    }

    public static String getPcID()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return TargetWorker.getPcID();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Target - Unable to get PcID (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    public static String getSessionID()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return TargetWorker.getSessionID();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Target - Unable to get SessionID (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    public static void loadRequest(TargetLocationRequest targetlocationrequest, TargetCallback targetcallback)
    {
        if (StaticMethods.isWearableApp())
        {
            StaticMethods.logWarningFormat("Target - Method loadRequest is not available for Wearable", new Object[0]);
            return;
        } else
        {
            TargetWorker.loadRequest(targetlocationrequest, targetcallback);
            return;
        }
    }
}
