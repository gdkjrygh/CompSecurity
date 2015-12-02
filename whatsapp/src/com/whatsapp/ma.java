// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.whatsapp:
//            LocationPicker2

class ma
    implements Runnable
{

    final boolean a;
    final LocationPicker2 b;

    ma(LocationPicker2 locationpicker2, boolean flag)
    {
        b = locationpicker2;
        a = flag;
        super();
    }

    public void run()
    {
        if (LocationPicker2.a(b) == null || a)
        {
            LocationPicker2.y(b).animateCamera(CameraUpdateFactory.newLatLng(new LatLng(LocationPicker2.k(b).getLatitude(), LocationPicker2.k(b).getLongitude())));
            int i = Math.max((int)LocationPicker2.k(b).getAccuracy(), 100);
            LocationPicker2.a(b, LocationPicker2.k(b), i, null, true);
        }
    }
}
