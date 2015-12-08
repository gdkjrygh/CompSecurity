// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.util.TwcPreconditions;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.concurrent.TimeUnit;

public final class SQSLocationUpdateUtil extends BroadcastReceiver
{

    public static final long INTERVAL;
    private static final int REQUEST_CODE = 10001;

    public SQSLocationUpdateUtil()
    {
    }

    public static void cancelAlarm()
    {
        cancelAlarm(AbstractTwcApplication.getRootContext(), TwcPrefs.getInstance(), PendingIntent.getService(AbstractTwcApplication.getRootContext(), 10001, new Intent(AbstractTwcApplication.getRootContext(), com/weather/dal2/eventlog/batch/LocationUpdateBatchedEventReport$LocationUpdateReportService), 0x8000000));
    }

    static void cancelAlarm(Context context, Prefs prefs, PendingIntent pendingintent)
    {
        context = (AlarmManager)context.getSystemService("alarm");
        if (context != null)
        {
            prefs.putBoolean(com.weather.util.prefs.TwcPrefs.Keys.LOCATION_UPDATE_ALARM_SCHEDULED, false);
            context.cancel(pendingintent);
        }
    }

    public static void initialize()
    {
        TwcPreconditions.checkNotOnMainThread();
        initialize(AbstractTwcApplication.getRootContext(), TwcPrefs.getInstance(), AccountManager.getInstance(), PendingIntent.getService(AbstractTwcApplication.getRootContext(), 10001, new Intent(AbstractTwcApplication.getRootContext(), com/weather/dal2/eventlog/batch/LocationUpdateBatchedEventReport$LocationUpdateReportService), 0x8000000), INTERVAL, false);
    }

    public static void initialize(long l, boolean flag)
    {
        TwcPreconditions.checkNotOnMainThread();
        initialize(AbstractTwcApplication.getRootContext(), TwcPrefs.getInstance(), AccountManager.getInstance(), PendingIntent.getService(AbstractTwcApplication.getRootContext(), 10001, new Intent(AbstractTwcApplication.getRootContext(), com/weather/dal2/eventlog/batch/LocationUpdateBatchedEventReport$LocationUpdateReportService), 0x8000000), l, flag);
    }

    static void initialize(Context context, Prefs prefs, AccountManager accountmanager, PendingIntent pendingintent, long l, boolean flag)
    {
        if (!prefs.contains(com.weather.util.prefs.TwcPrefs.Keys.UPS_USER_ID))
        {
            accountmanager.saveUserId();
        }
        if (!prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.TEST_MODE, false) && !prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.LOCATION_UPDATE_ALARM_SCHEDULED, false) || flag)
        {
            context = (AlarmManager)context.getSystemService("alarm");
            if (context != null)
            {
                context.setInexactRepeating(3, l, l, pendingintent);
                prefs.putBoolean(com.weather.util.prefs.TwcPrefs.Keys.LOCATION_UPDATE_ALARM_SCHEDULED, true);
            }
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED"))
        {
            (new Thread(new Runnable() {

                final SQSLocationUpdateUtil this$0;

                public void run()
                {
                    SQSLocationUpdateUtil.cancelAlarm();
                    SQSLocationUpdateUtil.initialize();
                }

            
            {
                this$0 = SQSLocationUpdateUtil.this;
                super();
            }
            })).start();
        }
    }

    static 
    {
        INTERVAL = TimeUnit.DAYS.toMillis(1L);
    }
}
