// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, PlaceInfo, a1w

class cg
    implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
{

    final LocationPicker2 a;

    cg(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        LocationPicker2.w(a).lat = cameraposition.target.latitude;
        LocationPicker2.w(a).lat = cameraposition.target.longitude;
        LocationPicker2.w(a).name = null;
        LocationPicker2.w(a).address = null;
        if (LocationPicker2.x(a).getVisibility() == 8)
        {
            LocationPicker2.m(a).removeCallbacks(LocationPicker2.l(a));
            LocationPicker2.a(a, new a1w(a, cameraposition.target.latitude, cameraposition.target.longitude));
            LocationPicker2.m(a).post(LocationPicker2.l(a));
        }
    }
}
