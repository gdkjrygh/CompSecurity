// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.weather.commons.config:
//            ConfigurationManagers

public class ConfigRefreshService extends IntentService
{

    private static final String TAG = "ConfigRefreshService";
    private static Semaphore semaphore;

    public ConfigRefreshService()
    {
        super("ConfigRefreshService");
    }

    public static Intent getIntent(Context context, ConfigPrefs.Keys keys)
    {
        context = new Intent(context, com/weather/commons/config/ConfigRefreshService);
        context.putExtra("CONFIG_TO_UPDATE", keys);
        return context;
    }

    protected static Semaphore getSemaphore()
    {
        return semaphore;
    }

    protected static void initSemaphore()
        throws InterruptedException
    {
        semaphore = new Semaphore(1);
        semaphore.acquire();
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            intent = (ConfigPrefs.Keys)intent.getSerializableExtra("CONFIG_TO_UPDATE");
            if (intent != null)
            {
                LogUtil.i("ConfigRefreshService", LoggingMetaTags.TWC_GENERAL, (new StringBuilder()).append("Updating config: ").append(intent).toString(), new Object[0]);
                ConfigurationManagers.getInstance().updateConfig(intent);
            } else
            {
                LogUtil.i("ConfigRefreshService", LoggingMetaTags.TWC_GENERAL, "Got an config refresh request without a configuration key", new Object[0]);
            }
            if (semaphore != null)
            {
                semaphore.release();
                return;
            }
        }
    }
}
