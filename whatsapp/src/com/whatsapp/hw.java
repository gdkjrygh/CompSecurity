// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, n9, s9

class hw
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    final n9 a;

    hw(n9 n9_1)
    {
        a = n9_1;
        super();
    }

    public void onConnected(Bundle bundle)
    {
        int i = App.am;
        bundle = n9.b(a).values().iterator();
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            s9 s9_1 = (s9)bundle.next();
            LocationRequest locationrequest = LocationRequest.create();
            byte byte0;
            if (s9.c(s9_1))
            {
                byte0 = 100;
            } else
            {
                byte0 = 102;
            }
            locationrequest.setPriority(byte0);
            locationrequest.setInterval(s9.a(s9_1));
            locationrequest.setFastestInterval(1000L);
            locationrequest.setSmallestDisplacement(s9.b(s9_1));
            LocationServices.FusedLocationApi.requestLocationUpdates(n9.a(a), locationrequest, s9_1);
        } while (i == 0);
        if (n9.b(a).isEmpty())
        {
            n9.a(a).disconnect();
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onConnectionSuspended(int i)
    {
    }
}
