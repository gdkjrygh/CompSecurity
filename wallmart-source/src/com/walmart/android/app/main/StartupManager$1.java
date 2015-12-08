// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import com.squareup.otto.Bus;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.StartupAppConfigEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.main:
//            StartupManager

class val.context
    implements com.walmart.android.wmservice.AppConfigCallback
{

    final StartupManager this$0;
    final Context val$context;

    public void onAppConfig(AppConfig appconfig)
    {
        if (appconfig != null)
        {
            StartupManager.access$102(StartupManager.this, appconfig.mitigateStartupRequests);
        }
        MessageBus.getBus().post(new StartupAppConfigEvent(appconfig));
        StartupManager.access$200(StartupManager.this, val$context, appconfig);
    }

    nt()
    {
        this$0 = final_startupmanager;
        val$context = Context.this;
        super();
    }
}
