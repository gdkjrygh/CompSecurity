// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.protocol.cr;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            td, GroupChatLiveLocationsActivity, GoogleMapView, aoq

class tu extends td
{

    final GroupChatLiveLocationsActivity p;
    boolean q;

    tu(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        p = groupchatlivelocationsactivity;
        super();
    }

    public void a(cr cr1, boolean flag)
    {
        GroupChatLiveLocationsActivity.a(p, cr1);
        cr1 = new GeoPoint((int)(cr1.e * 1000000D), (int)(cr1.d * 1000000D));
        GroupChatLiveLocationsActivity.b(p).getController().animateTo(cr1);
        if (flag && GroupChatLiveLocationsActivity.b(p).getZoomLevel() < 17)
        {
            GroupChatLiveLocationsActivity.b(p).getController().setZoom(17);
        }
        GroupChatLiveLocationsActivity.c(p);
    }

    public Location c()
    {
        Location location = new Location("");
        GeoPoint geopoint = GroupChatLiveLocationsActivity.g(p).getMyLocation();
        if (geopoint != null)
        {
            location.setLatitude((double)geopoint.getLatitudeE6() / 1000000D);
            location.setLongitude((double)geopoint.getLongitudeE6() / 1000000D);
        }
        return location;
    }

    public void e()
    {
        GroupChatLiveLocationsActivity.c(p);
        GroupChatLiveLocationsActivity.h(p).a();
        if (!q && !GroupChatLiveLocationsActivity.f(p).e.isEmpty())
        {
            q = true;
            GroupChatLiveLocationsActivity.e(p);
        }
        if (GroupChatLiveLocationsActivity.d(p) != null)
        {
            GeoPoint geopoint = new GeoPoint((int)(GroupChatLiveLocationsActivity.d(p).e * 1000000D), (int)(GroupChatLiveLocationsActivity.d(p).d * 1000000D));
            GroupChatLiveLocationsActivity.b(p).getController().animateTo(geopoint);
        }
    }
}
