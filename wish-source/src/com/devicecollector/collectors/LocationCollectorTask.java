// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.devicecollector.DataCollection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.devicecollector.collectors:
//            AbstractAsyncCollectorTask, CollectorEnum, SoftErrorCode, CollectorStatusListener

public class LocationCollectorTask extends AbstractAsyncCollectorTask
    implements LocationListener
{

    private static final int LOCATION_MAX_AGE = 0x36ee80;
    private static final int MAX_DISTANCE_DELTA = 200;
    private static final int ONE_SECOND = 1000;
    private Location currentLocation;
    boolean foundLocation;
    private LocationManager locationManager;
    private Date started;

    public LocationCollectorTask(Activity activity, CollectorStatusListener collectorstatuslistener, DataCollection datacollection, long l)
    {
        super(activity, collectorstatuslistener, datacollection, CollectorEnum.GEO_LOCATION, l);
        started = new Date();
        locationManager = (LocationManager)activity.getApplicationContext().getSystemService("location");
    }

    private void getOlderUpdate(String s)
    {
        locationManager.requestLocationUpdates(s, 1000L, 1.0F, this);
    }

    private void getSingleUpdate(String s)
    {
        locationManager.requestSingleUpdate(s, this, null);
    }

    private boolean isBetterLocation(Location location, Location location1)
    {
        if (location1 == null)
        {
            return true;
        }
        long l = location.getTime() - location1.getTime();
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (l > 0x36ee80L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l < 0x36ee80L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1)
        {
            return true;
        }
        if (flag2)
        {
            return false;
        }
        int i = (int)(location.getAccuracy() - location1.getAccuracy());
        boolean flag3;
        boolean flag4;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i < 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i > 200)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        flag4 = isSameProvider(location.getProvider(), location1.getProvider());
        if (flag2)
        {
            return true;
        }
        if (flag && !flag1)
        {
            return true;
        }
        return flag && !flag3 && flag4;
    }

    private boolean isSameProvider(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    private void stopListening()
    {
        if (locationManager != null)
        {
            locationManager.removeUpdates(this);
        }
    }

    private void submitLocation()
    {
        if (currentLocation == null) goto _L2; else goto _L1
_L1:
        long l = (currentLocation.getTime() - started.getTime()) / 1000L;
        debug((new StringBuilder()).append("Time it took:").append(l).toString(), new Object[0]);
        dc.addMobileData(com.devicecollector.DataCollection.PostElement.LATITUDE, (new StringBuilder()).append("").append(currentLocation.getLatitude()).toString());
        dc.addMobileData(com.devicecollector.DataCollection.PostElement.LONGITUDE, (new StringBuilder()).append("").append(currentLocation.getLongitude()).toString());
        dc.addMobileData(com.devicecollector.DataCollection.PostElement.GEO_DATE, (new StringBuilder()).append("").append(currentLocation.getTime() / 1000L).toString());
        dc.addMobileData(com.devicecollector.DataCollection.PostElement.GEO_PROVIDER, (new StringBuilder()).append("").append(currentLocation.getProvider()).toString());
        foundLocation = true;
_L4:
        finished = true;
        stopListening();
        endProcess(errorCode, errorCause);
        return;
_L2:
        debug("No Location found.", new Object[0]);
        if (errorCode == null)
        {
            errorCode = SoftErrorCode.SERVICE_UNAVAILABLE;
            errorCause = new RuntimeException("No location found");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void finalize()
        throws Throwable
    {
        super.finalize();
        stopListening();
    }

    public void onLocationChanged(Location location)
    {
        if (isBetterLocation(location, currentLocation))
        {
            currentLocation = location;
        }
        submitLocation();
    }

    public void onProviderDisabled(String s)
    {
        submitLocation();
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        if (i == 0 || i == 1)
        {
            submitLocation();
        }
    }

    protected void run()
    {
        Object obj;
        foundLocation = false;
        String s = null;
        Exception exception;
        String s1;
        Iterator iterator;
        Location location;
        try
        {
            debug("Getting providers", new Object[0]);
            obj = locationManager.getProviders(true);
            if (((List) (obj)).size() == 0)
            {
                endProcess(SoftErrorCode.SERVICE_UNAVAILABLE, new RuntimeException(SoftErrorCode.SERVICE_UNAVAILABLE.name()));
                return;
            }
        }
        catch (SecurityException securityexception)
        {
            debug(securityexception.getMessage(), new Object[0]);
            errorCode = SoftErrorCode.PERMISSION_DENIED;
            errorCause = securityexception;
            return;
        }
        iterator = ((List) (obj)).iterator();
_L2:
        obj = s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_267;
        }
        s1 = (String)iterator.next();
        if (isCancelled()) goto _L2; else goto _L1
_L1:
        debug((new StringBuilder()).append("Trying provider [").append(s1).append("]").toString(), new Object[0]);
        obj = s;
        if (s == null)
        {
            obj = s1;
        }
        location = locationManager.getLastKnownLocation("network");
        s = ((String) (obj));
        if (location == null) goto _L2; else goto _L3
_L3:
        s = ((String) (obj));
        if (started.getTime() - location.getTime() >= 0x36ee80L) goto _L2; else goto _L4
_L4:
        debug((new StringBuilder()).append("New enough, using this location: ").append(location.getProvider()).toString(), new Object[0]);
        if (!isBetterLocation(location, currentLocation))
        {
            break MISSING_BLOCK_LABEL_267;
        }
        debug((new StringBuilder()).append(location.getProvider()).append(" is better location").toString(), new Object[0]);
        currentLocation = location;
        obj = s1;
        foundLocation = true;
        if (isCancelled() || errorCode != null) goto _L6; else goto _L5
_L5:
        if (foundLocation && obj != null) goto _L8; else goto _L7
_L7:
        debug("making a single request", new Object[0]);
        this;
        JVM INSTR monitorenter ;
        Looper.prepare();
        if (android.os.Build.VERSION.SDK_INT <= 8) goto _L10; else goto _L9
_L9:
        getSingleUpdate(((String) (obj)));
_L13:
        if (!finished && !isCancelled())
        {
            debug("Waiting on location... for [%s] milliseconds", new Object[] {
                (new StringBuilder()).append("").append(getTimeoutMs()).toString()
            });
            wait(getTimeoutMs());
            debug("Done Waiting on location.", new Object[0]);
            if (!foundLocation)
            {
                stopListening();
                timeout();
            }
        }
_L11:
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L10:
        getOlderUpdate(((String) (obj)));
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        debug((new StringBuilder()).append("Got exception(hiding it):").append(exception1.getMessage()).toString(), new Object[0]);
          goto _L11
_L8:
        submitLocation();
_L6:
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
