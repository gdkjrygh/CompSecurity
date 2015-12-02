// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, PlaceInfo, App

class rh
    implements android.view.View.OnClickListener
{

    final ImageView a;
    final LocationPicker2 b;

    rh(LocationPicker2 locationpicker2, ImageView imageview)
    {
        b = locationpicker2;
        a = imageview;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (LocationPicker2.x(b).getVisibility() == 0)
            {
                view = (ViewGroup)b.findViewById(0x7f0b017c);
                if (view != null)
                {
                    android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0);
                    layoutparams.weight = 0.4F;
                    view.setLayoutParams(layoutparams);
                }
                LocationPicker2.x(b).setVisibility(8);
                a.setImageResource(0x7f0200d5);
                if (LocationPicker2.y(b) != null)
                {
                    LocationPicker2.y(b).animateCamera(CameraUpdateFactory.zoomBy(0.5F));
                    if (LocationPicker2.i(b) != null && LocationPicker2.i(b).tag != null)
                    {
                        ((Marker)LocationPicker2.i(b).tag).showInfoWindow();
                    }
                }
                LocationPicker2.n(b).setVisibility(8);
                LocationPicker2.r(b).setVisibility(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            LocationPicker2.x(b).setVisibility(0);
            a.setImageResource(0x7f0200d8);
            if (LocationPicker2.y(b) != null)
            {
                view = LocationPicker2.y(b).getCameraPosition();
                view = CameraPosition.builder().target(((CameraPosition) (view)).target).zoom(((CameraPosition) (view)).zoom - 0.5F).tilt(0.0F).bearing(0.0F).build();
                LocationPicker2.y(b).animateCamera(CameraUpdateFactory.newCameraPosition(view));
                if (LocationPicker2.i(b) != null && LocationPicker2.i(b).tag != null)
                {
                    ((Marker)LocationPicker2.i(b).tag).hideInfoWindow();
                }
            }
            LocationPicker2.r(b).setVisibility(8);
        }
    }
}
