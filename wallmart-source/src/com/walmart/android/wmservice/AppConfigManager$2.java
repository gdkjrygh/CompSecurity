// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.os.Handler;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            AppConfigManager

class  extends AsyncCallbackOnThread
{

    final AppConfigManager this$0;
    final Context val$applicationContext;
    final String val$installationId;

    public void onFailureSameThread(Integer integer, AppConfig appconfig)
    {
        if (AppConfigManager.access$100(AppConfigManager.this))
        {
            return;
        } else
        {
            WLog.d(AppConfigManager.access$200(), "Downloading config failed. Will retry in 60000 ms");
            AppConfigManager.access$300(AppConfigManager.this, val$applicationContext, val$installationId, null);
            AppConfigManager.access$500(AppConfigManager.this).removeCallbacks(AppConfigManager.access$400(AppConfigManager.this));
            AppConfigManager.access$500(AppConfigManager.this).postDelayed(AppConfigManager.access$400(AppConfigManager.this), 60000L);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (AppConfig)obj1);
    }

    public void onSuccessSameThread(AppConfig appconfig)
    {
        if (AppConfigManager.access$100(AppConfigManager.this))
        {
            return;
        } else
        {
            WLog.d(AppConfigManager.access$200(), "Config downloaded successfully.");
            AppConfigManager.access$300(AppConfigManager.this, val$applicationContext, val$installationId, appconfig);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((AppConfig)obj);
    }

    (String s)
    {
        this$0 = final_appconfigmanager;
        val$applicationContext = Context.this;
        val$installationId = s;
        super(final_handler);
    }
}
