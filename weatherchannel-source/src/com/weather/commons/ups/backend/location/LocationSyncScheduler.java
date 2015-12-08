// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.ups.backend.location:
//            LocationStartSyncService

public final class LocationSyncScheduler
{

    private static final String TAG = "LocationSyncScheduler";
    private static final AlarmManager alarmManager = (AlarmManager)AbstractTwcApplication.getRootContext().getSystemService("alarm");

    private LocationSyncScheduler()
    {
    }

    public static void cancelAlarm()
    {
        LogUtil.v("LocationSyncScheduler", LoggingMetaTags.TWC_UPS, "cancelAlarm", new Object[0]);
        Object obj = new Intent(AbstractTwcApplication.getRootContext(), com/weather/commons/ups/backend/location/LocationStartSyncService);
        obj = PendingIntent.getService(AbstractTwcApplication.getRootContext(), 0, ((Intent) (obj)), 0x8000000);
        alarmManager.cancel(((PendingIntent) (obj)));
    }

    public static void reScheduleSync(Context context, long l, boolean flag, boolean flag1)
    {
        LogUtil.v("LocationSyncScheduler", LoggingMetaTags.TWC_UPS, "reScheduleSync %s %s %s", new Object[] {
            Long.valueOf(l), Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        Intent intent = new Intent(context, com/weather/commons/ups/backend/location/LocationStartSyncService);
        intent.putExtra("retry_on_failure", flag);
        intent.putExtra("one_shot", flag1);
        context = PendingIntent.getService(context, 0, intent, 0x10000000);
        alarmManager.set(3, SystemClock.elapsedRealtime() + l, context);
    }

}
