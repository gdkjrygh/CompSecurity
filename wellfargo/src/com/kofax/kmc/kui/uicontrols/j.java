// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

class j
    implements LocationListener
{

    private static long g = 5000L;
    private static float h = 10F;
    LocationManager a;
    double b;
    double c;
    boolean d;
    private Context e;
    private boolean f;

    j(Context context, LocationManager locationmanager)
    {
        e = null;
        f = false;
        e = context;
        a = locationmanager;
        if (f())
        {
            d = android.provider.Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "gps");
        } else
        {
            d = false;
        }
        if (d)
        {
            a.requestLocationUpdates("gps", g, h, this);
            if (a != null)
            {
                context = a.getLastKnownLocation("gps");
                if (context != null)
                {
                    b = context.getLatitude();
                    c = context.getLongitude();
                }
            }
            f = true;
        }
    }

    private boolean f()
    {
        return e.getPackageManager().checkPermission("android.permission.ACCESS_FINE_LOCATION", e.getPackageName()) == 0;
    }

    public double a()
    {
        return b;
    }

    public void a(boolean flag)
    {
        if (flag && f())
        {
            if (android.provider.Settings.Secure.isLocationProviderEnabled(e.getContentResolver(), "gps"))
            {
                d = true;
                e();
                return;
            } else
            {
                d = false;
                return;
            }
        } else
        {
            d = false;
            d();
            return;
        }
    }

    public double b()
    {
        return c;
    }

    public boolean c()
    {
        return d;
    }

    public void d()
    {
        if (f)
        {
            a.removeUpdates(this);
            f = false;
        }
    }

    public void e()
    {
        if (!f)
        {
            a.requestLocationUpdates("gps", g, h, this);
            f = true;
        }
    }

    public void onLocationChanged(Location location)
    {
        b = location.getLatitude();
        c = location.getLongitude();
    }

    public void onProviderDisabled(String s)
    {
        d = false;
        d();
    }

    public void onProviderEnabled(String s)
    {
        d = true;
        e();
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

}
