// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.StartupFinishedEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            StartupManager

class this._cls1
    implements Runnable
{

    final printCookies this$1;

    public void run()
    {
        WLog.d(StartupManager.access$400(), "Startup finished");
        StartupManager.access$602(_fld0, new StartupFinishedEvent(appConfig, Boolean.valueOf(StartupManager.access$700(_fld0))));
        MessageBus.getBus().post(StartupManager.access$600(_fld0));
        Services.get().getWalmartService().printCookies();
    }

    l.appConfig()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/main/StartupManager$2

/* anonymous class */
    class StartupManager._cls2 extends Thread
    {

        final StartupManager this$0;
        final AppConfig val$appConfig;
        final Context val$context;

        public void run()
        {
            if (StartupManager.access$300(StartupManager.this) == null || StartupManager.access$300(StartupManager.this).run(context))
            {
                break MISSING_BLOCK_LABEL_41;
            }
            WLog.d(StartupManager.access$400(), "no network available. retrying in 5000ms");
            Thread.sleep(5000L);
_L2:
            StartupManager.access$800(StartupManager.this).post(new StartupManager._cls2._cls1());
            return;
            InterruptedException interruptedexception;
            interruptedexception;
            try
            {
                if (StartupManager.access$500(StartupManager.this))
                {
                    WLog.d(StartupManager.access$400(), "Interrupted after shutdown. Exiting");
                    return;
                }
            }
            catch (InterruptedException interruptedexception1)
            {
                if (StartupManager.access$500(StartupManager.this))
                {
                    WLog.d(StartupManager.access$400(), "Interrupted after shutdown. Exiting");
                    return;
                }
            }
            catch (Exception exception)
            {
                WLog.w(StartupManager.access$400(), exception.toString());
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                this$0 = final_startupmanager;
                context = context1;
                appConfig = AppConfig.this;
                super();
            }
    }

}
