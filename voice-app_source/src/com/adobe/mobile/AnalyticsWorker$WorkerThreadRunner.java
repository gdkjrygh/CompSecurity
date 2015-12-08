// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.os.Process;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            AnalyticsWorker, StaticMethods, MobileConfig, MobilePrivacyStatus, 
//            RequestHandler

private static class <init>
    implements Runnable
{

    public void run()
    {
        AnalyticsWorker analyticsworker;
        HashMap hashmap;
        analyticsworker = AnalyticsWorker.sharedInstance();
        Process.setThreadPriority(10);
        hashmap = new HashMap();
        hashmap.put("Accept-Language", StaticMethods.getDefaultAcceptLanguage());
        hashmap.put("User-Agent", StaticMethods.getDefaultUserAgent());
_L9:
        if (MobileConfig.getInstance().getPrivacyStatus() != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN || !AnalyticsWorker.access$000()) goto _L2; else goto _L1
_L1:
        <init> <init>1 = AnalyticsWorker.access$100(analyticsworker);
        if (<init>1 != null) goto _L3; else goto _L2
_L2:
        AnalyticsWorker.access$602(false);
        return;
_L3:
        String s1;
        String s3;
        if (MobileConfig.getInstance().getOfflineTrackingEnabled())
        {
            if (<init>1.led - AnalyticsWorker.access$200(analyticsworker) < 0L)
            {
                long l = AnalyticsWorker.access$200(analyticsworker) + 1L;
                String s = (new StringBuilder()).append("&ts=").append(Long.toString(<init>1.led)).toString();
                String s2 = (new StringBuilder()).append("&ts=").append(Long.toString(l)).toString();
                <init>1.led = <init>1.led.replaceFirst(s, s2);
                StaticMethods.logDebugFormat("Analytics - Adjusting out of order hit timestamp(%d->%d)", new Object[] {
                    Long.valueOf(<init>1.led), Long.valueOf(l)
                });
                <init>1.led = l;
            }
        } else
        if (<init>1.led < StaticMethods.getTimeSince1970() - 60L)
        {
            try
            {
                AnalyticsWorker.access$300(analyticsworker, <init>1.led);
            }
            catch (tabaseException tabaseexception)
            {
                AnalyticsWorker.sharedInstance().resetDatabase(tabaseexception);
                continue; /* Loop/switch isn't completed */
            }
            continue; /* Loop/switch isn't completed */
        }
        s3 = <init>1.led;
        s1 = s3;
        if (!s3.startsWith("ndh"))
        {
            s1 = s3.substring(s3.indexOf('?') + 1);
        }
        if (RequestHandler.sendAnalyticsRequest((new StringBuilder()).append(AnalyticsWorker.access$400()).append(AnalyticsWorker.access$500().nextInt(0x5f5e100)).toString(), s1, hashmap, 5000))
        {
            try
            {
                AnalyticsWorker.access$300(analyticsworker, <init>1.);
            }
            catch (tabaseException tabaseexception1)
            {
                AnalyticsWorker.sharedInstance().resetDatabase(tabaseexception1);
                continue; /* Loop/switch isn't completed */
            }
            AnalyticsWorker.access$202(analyticsworker, <init>1.);
            continue; /* Loop/switch isn't completed */
        }
        StaticMethods.logWarningFormat("Analytics - Unable to send hit", new Object[0]);
        if (!MobileConfig.getInstance().getOfflineTrackingEnabled()) goto _L5; else goto _L4
_L4:
        int i;
        StaticMethods.logDebugFormat("Analytics - Network error, imposing internal cooldown(%d seconds)", new Object[] {
            Long.valueOf(30L)
        });
        i = 0;
_L6:
        if ((long)i >= 30L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!AnalyticsWorker.access$000())
        {
            continue; /* Loop/switch isn't completed */
        }
        Thread.sleep(1000L);
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        try
        {
            AnalyticsWorker.access$300(analyticsworker, <init>1.led);
            continue; /* Loop/switch isn't completed */
        }
        catch (tabaseException tabaseexception2)
        {
            AnalyticsWorker.sharedInstance().resetDatabase(tabaseexception2);
        }
        if (true) goto _L2; else goto _L7
_L7:
        Exception exception;
        exception;
        StaticMethods.logWarningFormat("Analytics - Background Thread Interrupted(%s)", new Object[] {
            exception.getMessage()
        });
        if (true) goto _L9; else goto _L8
_L8:
    }

    private tabaseException()
    {
    }

    tabaseException(tabaseException tabaseexception)
    {
        this();
    }
}
