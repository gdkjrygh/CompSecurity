// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, PlaceInfo, a_2

class th
    implements com.google.android.gms.maps.GoogleMap.OnMapClickListener
{

    final LocationPicker2 a;

    th(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onMapClick(LatLng latlng)
    {
        if (LocationPicker2.i(a) != null)
        {
            if (LocationPicker2.i(a).tag != null)
            {
                ((Marker)LocationPicker2.i(a).tag).setIcon(LocationPicker2.f(a));
            }
            LocationPicker2.a(a, null);
            LocationPicker2.g(a).notifyDataSetChanged();
        }
        LocationPicker2.n(a).setVisibility(8);
    }
}
