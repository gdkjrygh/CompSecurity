// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, LocationPicker2, PlaceInfo, t3, 
//            a_2

class _8
    implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
{

    final LocationPicker2 a;

    _8(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public boolean onMarkerClick(Marker marker)
    {
label0:
        {
            int i = App.am;
            if (marker.getId() == null)
            {
                return false;
            }
            if (LocationPicker2.i(a) != null && LocationPicker2.i(a).tag != null)
            {
                ((Marker)LocationPicker2.i(a).tag).setIcon(LocationPicker2.f(a));
            }
            marker.setIcon(LocationPicker2.t(a));
            Iterator iterator = LocationPicker2.a(a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PlaceInfo placeinfo = (PlaceInfo)iterator.next();
                if (!marker.equals(placeinfo.tag))
                {
                    continue;
                }
                LocationPicker2.a(a, placeinfo);
                if (i == 0)
                {
                    break;
                }
            } while (i == 0);
            int j = LocationPicker2.a(a).indexOf(LocationPicker2.i(a));
            if (j < 0)
            {
                break label0;
            }
            LocationPicker2.g(a).notifyDataSetChanged();
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                LocationPicker2.z(a).smoothScrollToPosition(j);
                if (i == 0)
                {
                    break label0;
                }
            }
            LocationPicker2.z(a).setSelection(j);
        }
        LocationPicker2.n(a).setVisibility(8);
        LocationPicker2.r(a).setVisibility(8);
        boolean flag;
        if (LocationPicker2.x(a).getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }
}
