// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.lbs;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.dal2.lbs:
//            LbsSystem, LbsService

class FusedLbsSystem extends LbsSystem
{
    private class MyConnectionCallbacks
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        final FusedLbsSystem this$0;

        public void onConnected(Bundle bundle)
        {
            LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "onConnected", new Object[0]);
            startScheduledUpdates();
            onConnectionSuccess();
        }

        public void onConnectionSuspended(int i)
        {
            LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "onDisconnected", new Object[0]);
        }

        private MyConnectionCallbacks()
        {
            this$0 = FusedLbsSystem.this;
            super();
        }

    }

    private static class MyConnectionFailedListener
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "onConnectionFailed", new Object[] {
                connectionresult
            });
        }

        private MyConnectionFailedListener()
        {
        }

    }


    private static final String TAG = "FusedLbsSystem";
    private volatile boolean isScheduled;
    private final GoogleApiClient locationClient;

    FusedLbsSystem()
    {
        locationClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(AbstractTwcApplication.getRootContext())).addApi(LocationServices.API).addConnectionCallbacks(new MyConnectionCallbacks()).addOnConnectionFailedListener(new MyConnectionFailedListener()).build();
    }

    private void requestUpdates(PendingIntent pendingintent, long l, long l1, float f, int i, 
            long l2)
    {
        if (!locationClient.isConnected() || pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "FusedLbsSystem.requestUpdates", new Object[0]);
        LocationRequest locationrequest = LocationRequest.create();
        byte byte0;
        if (onlyGpsEnabled())
        {
            byte0 = 100;
        } else
        {
            byte0 = 102;
        }
        locationrequest.setPriority(byte0);
        locationrequest.setInterval(l);
        locationrequest.setFastestInterval(l1);
        locationrequest.setSmallestDisplacement(f);
        locationrequest.setNumUpdates(i);
        locationrequest.setExpirationDuration(l2);
        LocationServices.FusedLocationApi.requestLocationUpdates(locationClient, locationrequest, pendingintent);
        if (pendingintent.equals(pendingIntent))
        {
            isScheduled = true;
        }
        return;
        pendingintent;
        EventLog.w("FusedLbsSystem", (new StringBuilder()).append("LocationClient.requestLocationUpdates() failure: ").append(pendingintent).toString());
        return;
    }

    private void startScheduledUpdates()
    {
        LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "startScheduledUpdates", new Object[0]);
        requestUpdates(pendingIntent, interval, fastestInterval, 50F, 0x7fffffff, 0x7fffffffffffffffL);
    }

    protected void connect()
    {
        LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "connect", new Object[0]);
        if (!locationClient.isConnecting())
        {
            if (!locationClient.isConnected())
            {
                locationClient.connect();
            } else
            if (!isScheduled)
            {
                startScheduledUpdates();
                return;
            }
        }
    }

    protected void disable()
    {
        if (!isScheduled() || !locationClient.isConnected())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "disable", new Object[0]);
        if (pendingIntent != null)
        {
            LocationServices.FusedLocationApi.removeLocationUpdates(locationClient, pendingIntent);
        }
        locationClient.disconnect();
        isScheduled = false;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        EventLog.w("FusedLbsSystem", (new StringBuilder()).append("LocationClient.disable() failure: ").append(runtimeexception).toString());
        return;
    }

    protected void doSingleShotUpdate()
    {
        LogUtil.method("FusedLbsSystem", LoggingMetaTags.TWC_DAL_LBS, "doSingleShotUpdate", new Object[0]);
        android.content.Context context = AbstractTwcApplication.getRootContext();
        requestUpdates(PendingIntent.getService(context, 1, new Intent(context, com/weather/dal2/lbs/LbsService), 0x10000000), 0L, 0L, 50F, 1, interval);
    }

    protected Location getLastLocation()
    {
        Location location;
        try
        {
            location = LocationServices.FusedLocationApi.getLastLocation(locationClient);
        }
        catch (RuntimeException runtimeexception)
        {
            EventLog.w("FusedLbsSystem", (new StringBuilder()).append("LocationClient.getLastLocation() failure: ").append(runtimeexception).toString());
            return null;
        }
        return location;
    }

    protected boolean isConnected()
    {
        return locationClient.isConnected();
    }

    protected boolean isScheduled()
    {
        return isScheduled;
    }

}
