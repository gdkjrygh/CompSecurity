// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            d4, LocationPicker, GoogleMapView

class as7
    implements Runnable
{

    final d4 a;

    as7(d4 d4_1)
    {
        a = d4_1;
        super();
    }

    public void run()
    {
        LocationPicker.b(a.a).a(LocationPicker.h(a.a).getMyLocation());
        LocationPicker.b(a.a).getController().setZoom(18);
    }
}
