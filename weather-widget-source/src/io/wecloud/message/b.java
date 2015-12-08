// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import io.wecloud.message.c.a;

// Referenced classes of package io.wecloud.message:
//            ClientService

class b
    implements LocationListener
{

    final ClientService a;

    b(ClientService clientservice)
    {
        a = clientservice;
        super();
    }

    public void onLocationChanged(Location location)
    {
        io.wecloud.message.c.a.d(a.getApplicationContext(), (new StringBuilder(String.valueOf(location.getLatitude()))).append(",").append(location.getLongitude()).toString());
        ClientService.e(a).removeUpdates(ClientService.f(a));
        io.wecloud.message.ClientService.a(a, true);
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
