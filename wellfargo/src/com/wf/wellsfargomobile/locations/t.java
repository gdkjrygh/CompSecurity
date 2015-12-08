// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            j

class t
    implements LocationListener
{

    private static final String a = com/wf/wellsfargomobile/locations/t.getSimpleName();
    private boolean b;
    private j c;

    public t(j j1)
    {
        b = false;
        c = j1;
    }

    public void a(LocationManager locationmanager)
    {
        Location location1 = null;
        b = true;
        Location location;
        if (locationmanager.isProviderEnabled("gps"))
        {
            locationmanager.requestLocationUpdates("gps", 0L, 0.0F, this);
            location = locationmanager.getLastKnownLocation("gps");
        } else
        {
            location = null;
        }
        if (locationmanager.isProviderEnabled("network"))
        {
            locationmanager.requestLocationUpdates("network", 0L, 0.0F, this);
            location1 = locationmanager.getLastKnownLocation("network");
        }
        c.a(location, location1);
    }

    public boolean a()
    {
        return b;
    }

    public void b(LocationManager locationmanager)
    {
        b = false;
        locationmanager.removeUpdates(this);
    }

    public void onLocationChanged(Location location)
    {
        c.a(location);
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

}
