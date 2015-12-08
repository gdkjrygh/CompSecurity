// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.lbs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.lbs:
//            LbsService, FusedLbsSystem, LegacyLbsSystem, LbsConnectionSuccess

abstract class LbsSystem
{

    static final long FASTEST_INTERVAL_IN_MINUTES = 10L;
    static final long INTERVAL_IN_MINUTES = 20L;
    static final float SMALLEST_DISPLACEMENT_METERS = 50F;
    static final long TEST_FASTEST_INTERVAL_IN_MINUTES = 1L;
    static final long TEST_INTERVAL_IN_MINUTES = 3L;
    static long fastestInterval;
    static long interval;
    protected final PendingIntent pendingIntent;

    LbsSystem()
    {
        Context context = AbstractTwcApplication.getRootContext();
        pendingIntent = PendingIntent.getService(context, 0, new Intent(context, com/weather/dal2/lbs/LbsService), 0x10000000);
    }

    static LbsSystem create(long l, long l1)
    {
        interval = l1;
        fastestInterval = l;
        Context context = AbstractTwcApplication.getRootContext();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0)
        {
            return new FusedLbsSystem();
        } else
        {
            return new LegacyLbsSystem();
        }
    }

    static LbsSystem create(boolean flag)
    {
        if (flag)
        {
            return create(TimeUnit.MINUTES.toMillis(1L), TimeUnit.MINUTES.toMillis(3L));
        } else
        {
            return create(TimeUnit.MINUTES.toMillis(10L), TimeUnit.MINUTES.toMillis(20L));
        }
    }

    protected static LocationManager getLocationManager()
    {
        return (LocationManager)AbstractTwcApplication.getRootContext().getSystemService("location");
    }

    protected static boolean onlyGpsEnabled()
    {
        LocationManager locationmanager = getLocationManager();
        boolean flag = locationmanager.isProviderEnabled("gps");
        boolean flag1 = locationmanager.isProviderEnabled("network");
        return flag && !flag1;
    }

    protected abstract void connect();

    protected abstract void disable();

    protected abstract void doSingleShotUpdate();

    protected abstract Location getLastLocation();

    protected abstract boolean isConnected();

    protected abstract boolean isScheduled();

    protected void onConnectionSuccess()
    {
        DataAccessLayer.BUS.post(new LbsConnectionSuccess());
    }
}
