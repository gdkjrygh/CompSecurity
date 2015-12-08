// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.core:
//            ReportUploader, CrashlyticsCore, CrashlyticsUncaughtExceptionHandler, Report

private class delay extends BackgroundPriorityRunnable
{

    private final float delay;
    final ReportUploader this$0;

    private void attemptUploadWithRetry()
    {
        Object obj;
        CrashlyticsCore crashlyticscore;
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Starting report processing in ").append(delay).append(" second(s)...").toString());
        CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler;
        if (delay > 0.0F)
        {
            try
            {
                Thread.sleep((long)(delay * 1000F));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Thread.currentThread().interrupt();
                return;
            }
        }
        crashlyticscore = CrashlyticsCore.getInstance();
        crashlyticsuncaughtexceptionhandler = crashlyticscore.getHandler();
        obj = findReports();
        if (!crashlyticsuncaughtexceptionhandler.isHandlingException()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((List) (obj)).isEmpty() || crashlyticscore.canSendWithUserApproval())
        {
            break; /* Loop/switch isn't completed */
        }
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("User declined to send. Removing ").append(((List) (obj)).size()).append(" Report(s).").toString());
        obj = ((List) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((Report)((Iterator) (obj)).next()).remove();
        }
        if (true) goto _L1; else goto _L3
_L3:
        int i = 0;
        while (!((List) (obj)).isEmpty() && !CrashlyticsCore.getInstance().getHandler().isHandlingException()) 
        {
            Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Attempting to send ").append(((List) (obj)).size()).append(" report(s)").toString());
            Report report;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); forceUpload(report))
            {
                report = (Report)((Iterator) (obj)).next();
            }

            List list = findReports();
            obj = list;
            if (!list.isEmpty())
            {
                long l = ReportUploader.access$100()[Math.min(i, ReportUploader.access$100().length - 1)];
                Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Report submisson: scheduling delayed retry in ").append(l).append(" seconds").toString());
                try
                {
                    Thread.sleep(1000L * l);
                }
                catch (InterruptedException interruptedexception)
                {
                    Thread.currentThread().interrupt();
                    return;
                }
                i++;
                obj = list;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onRun()
    {
        try
        {
            attemptUploadWithRetry();
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", exception);
        }
        ReportUploader.access$002(ReportUploader.this, null);
    }

    eptionHandler(float f)
    {
        this$0 = ReportUploader.this;
        super();
        delay = f;
    }
}
