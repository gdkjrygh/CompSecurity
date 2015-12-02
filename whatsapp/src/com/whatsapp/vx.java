// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, PlaceInfo

class vx
    implements android.view.View.OnClickListener
{

    final LocationPicker2 a;

    vx(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onClick(View view)
    {
        LocationPicker2.n(a).setVisibility(0);
        if (LocationPicker2.i(a) != null && LocationPicker2.i(a).tag != null)
        {
            ((Marker)LocationPicker2.i(a).tag).hideInfoWindow();
        }
    }
}
