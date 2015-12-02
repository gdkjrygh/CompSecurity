// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.whatsapp.protocol.cr;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity2, td

class pu
    implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
{

    final GroupChatLiveLocationsActivity2 a;

    pu(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        a = groupchatlivelocationsactivity2;
        super();
    }

    public boolean onMarkerClick(Marker marker)
    {
        ArrayList arraylist = (ArrayList)GroupChatLiveLocationsActivity2.a(a).get(marker);
        GroupChatLiveLocationsActivity2.d(a).a(arraylist);
        if (arraylist.size() == 1)
        {
            GroupChatLiveLocationsActivity2.a(a, (cr)arraylist.get(0));
        }
        GroupChatLiveLocationsActivity2.j(a);
        GroupChatLiveLocationsActivity2.a(a, true);
        GroupChatLiveLocationsActivity2.f(a).animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()));
        return true;
    }
}
