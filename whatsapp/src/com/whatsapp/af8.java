// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            LocationPicker, GoogleMapView

class af8
    implements Runnable
{

    final LocationPicker a;

    af8(LocationPicker locationpicker)
    {
        a = locationpicker;
        super();
    }

    public void run()
    {
        LocationPicker.b(a).a(LocationPicker.h(a).getMyLocation());
    }
}
