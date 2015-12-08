// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.SystemEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.cache:
//            FileCaches

public class CleanupService extends IntentService
{
    private static class CleanUpRepeatingServiceEventHandler
    {

        private static final long DELAY_AFTER_APP_CREATE;
        private static final long DELAY_AFTER_BOOT;
        private static final long INTERVAL = 0x1b7740L;
        private static final String TAG = "RepeatingServiceEventHandler";

        private void scheduleRepeatingService(long l)
        {
            LogUtil.method("RepeatingServiceEventHandler", LoggingMetaTags.TWC_DAL, "scheduleRepeatingService", new Object[] {
                "CleanupService"
            });
            Context context = AbstractTwcApplication.getRootContext();
            ((AlarmManager)context.getSystemService("alarm")).setInexactRepeating(3, l, 0x1b7740L, PendingIntent.getService(context, 0, new Intent(context, com/weather/dal2/cache/CleanupService), 0x10000000));
        }

        public void onAppCreate(AppEvent appevent)
        {
            if (appevent.getCause() == com.weather.dal2.system.AppEvent.Cause.APP_CREATE)
            {
                scheduleRepeatingService(SystemClock.elapsedRealtime() + DELAY_AFTER_APP_CREATE);
            }
        }

        public void onBoot(SystemEvent systemevent)
        {
            if (systemevent.getCause() == com.weather.dal2.system.SystemEvent.Cause.BOOT)
            {
                scheduleRepeatingService(SystemClock.elapsedRealtime() + DELAY_AFTER_BOOT);
            }
        }

        static 
        {
            DELAY_AFTER_APP_CREATE = TimeUnit.MINUTES.toMillis(5L);
            DELAY_AFTER_BOOT = TimeUnit.SECONDS.toMillis(1L);
        }

        private CleanUpRepeatingServiceEventHandler()
        {
        }

    }


    private static final CleanUpRepeatingServiceEventHandler HANDLER = new CleanUpRepeatingServiceEventHandler();
    private static final String TAG = "CleanupService";

    public CleanupService()
    {
        super("CleanupService");
    }

    public static void register()
    {
        DataAccessLayer.BUS.register(HANDLER);
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        } else
        {
            LogUtil.method("CleanupService", LoggingMetaTags.TWC_DAL_CACHE, "onHandleIntent", new Object[0]);
            FileCaches.INSTANCE.cleanup();
            FileCaches.INSTANCE.clearOldCacheDirectories();
            LogUtil.d("CleanupService", LoggingMetaTags.TWC_DAL_CACHE, "Cleanup finished", new Object[0]);
            return;
        }
    }

}
