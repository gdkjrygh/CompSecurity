// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

// Referenced classes of package com.whatsapp:
//            sz

class a8x
    implements LocationListener
{

    final sz a;

    a8x(sz sz1)
    {
        a = sz1;
        super();
    }

    public void onLocationChanged(Location location)
    {
        sz sz1 = a;
        sz1.d = sz1.d + 1;
        a.j = location;
        if (a.d >= 2 || location.getAccuracy() < 200F)
        {
            a.g = true;
            a.d = 0;
        }
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
