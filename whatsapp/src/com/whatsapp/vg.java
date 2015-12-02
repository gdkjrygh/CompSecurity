// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            asx, LocationPicker, GoogleMapView

class vg
    implements Runnable
{

    final boolean a;
    final Location b;
    final asx c;

    vg(asx asx1, boolean flag, Location location)
    {
        c = asx1;
        a = flag;
        b = location;
        super();
    }

    public void run()
    {
        if (LocationPicker.n(c.h) == null || a)
        {
            LocationPicker.b(c.h).a(LocationPicker.h(c.h).getMyLocation());
            int i = Math.max((int)b.getAccuracy(), 100);
            LocationPicker.a(c.h, b, i, null, true);
        }
    }
}
