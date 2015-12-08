// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.weatherconnections;

import android.app.IntentService;
import android.content.Intent;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.dal2.weatherconnections:
//            RequestManager

public class RefreshService extends IntentService
{

    private static final String TAG = "RefreshService";

    public RefreshService()
    {
        super("RefreshService");
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        } else
        {
            LogUtil.method("RefreshService", LoggingMetaTags.TWC_DAL_WXD, "onHandleIntent", new Object[0]);
            RequestManager.getInstance().doRefresh();
            return;
        }
    }
}
