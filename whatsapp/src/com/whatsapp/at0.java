// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.whatsapp.protocol.cr;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity, td, GoogleMapView

class at0
    implements android.view.View.OnClickListener
{

    final ArrayList a;
    final GroupChatLiveLocationsActivity b;
    final GeoPoint c;

    at0(GroupChatLiveLocationsActivity groupchatlivelocationsactivity, ArrayList arraylist, GeoPoint geopoint)
    {
        b = groupchatlivelocationsactivity;
        a = arraylist;
        c = geopoint;
        super();
    }

    public void onClick(View view)
    {
        GroupChatLiveLocationsActivity.f(b).a(a);
        if (a.size() == 1)
        {
            GroupChatLiveLocationsActivity.a(b, (cr)a.get(0));
        }
        GroupChatLiveLocationsActivity.b(b).getController().animateTo(c);
        GroupChatLiveLocationsActivity.c(b);
    }
}
