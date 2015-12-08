// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.mapbar.android.location:
//            l, i

final class k
    implements android.location.GpsStatus.Listener, LocationListener
{

    private static k f = null;
    private LocationManager a;
    private boolean b;
    private boolean c;
    private volatile Location d;
    private Context e;

    private k(Context context)
    {
        b = false;
        c = false;
        d = null;
        try
        {
            a = (LocationManager)context.getSystemService("location");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static k a(Context context)
    {
        com/mapbar/android/location/k;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new k(context);
        }
        f.e = context;
        context = f;
        com/mapbar/android/location/k;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public final void a()
    {
        a.addGpsStatusListener(this);
    }

    final boolean b()
    {
        return b;
    }

    final boolean c()
    {
        if (!c && b)
        {
            try
            {
                if (a.isProviderEnabled("gps"))
                {
                    c = true;
                    a.requestLocationUpdates("gps", 0L, 0.0F, this);
                }
            }
            catch (Exception exception) { }
        }
        return c;
    }

    public final void d()
    {
        a.removeGpsStatusListener(this);
        c = false;
        b = false;
        a.removeUpdates(this);
    }

    public final void onGpsStatusChanged(int j)
    {
        switch (j)
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            b = false;
            return;

        case 3: // '\003'
            b = true;
            break;
        }
    }

    public final void onLocationChanged(Location location)
    {
        this;
        JVM INSTR monitorenter ;
        if (location == null) goto _L2; else goto _L1
_L1:
        if (d != null) goto _L4; else goto _L3
_L3:
        d = new Location(location);
_L7:
        l.c = (int)(d.getLongitude() * 100000D);
        l.d = (int)(d.getLatitude() * 100000D);
        l.e = (int)d.getAccuracy();
        l.g = SystemClock.elapsedRealtime();
        l.h = (int)d.getBearing();
        l.i = (int)d.getSpeed();
        l.j = (int)d.getAltitude();
        if (!"gps".equalsIgnoreCase(d.getProvider())) goto _L6; else goto _L5
_L5:
        l.f = "wd";
        if (c)
        {
            c = false;
            a.removeUpdates(this);
        }
_L2:
        this;
        JVM INSTR monitorenter ;
        notifyAll();
_L8:
        this;
        JVM INSTR monitorexit ;
        l.a(e, l.a());
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        d.set(location);
          goto _L7
        location;
        throw location;
_L6:
        l.f = "cn";
          goto _L2
        location;
        i.a("MapTagLocation", (new StringBuilder()).append("Exception: ").append(location.getMessage()).toString());
          goto _L8
        location;
        this;
        JVM INSTR monitorexit ;
        throw location;
          goto _L7
    }

    public final void onProviderDisabled(String s)
    {
    }

    public final void onProviderEnabled(String s)
    {
    }

    public final void onStatusChanged(String s, int j, Bundle bundle)
    {
    }

}
