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

class val.appConfig extends Thread
{

    final StartupManager this$0;
    final AppConfig val$appConfig;
    final Context val$context;

    public void run()
    {
        if (StartupManager.access$300(StartupManager.this) == null || StartupManager.access$300(StartupManager.this).run(val$context))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        WLog.d(StartupManager.access$400(), "no network available. retrying in 5000ms");
        Thread.sleep(5000L);
_L2:
        StartupManager.access$800(StartupManager.this).post(new Runnable() {

            final StartupManager._cls2 this$1;

            public void run()
            {
                WLog.d(StartupManager.access$400(), "Startup finished");
                StartupManager.access$602(this$0, new StartupFinishedEvent(appConfig, Boolean.valueOf(StartupManager.access$700(this$0))));
                MessageBus.getBus().post(StartupManager.access$600(this$0));
                Services.get().getWalmartService().printCookies();
            }

            
            {
                this$1 = StartupManager._cls2.this;
                super();
            }
        });
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

    _cls1.this._cls1()
    {
        this$0 = final_startupmanager;
        val$context = context1;
        val$appConfig = AppConfig.this;
        super();
    }
}
