// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            dz, GroupChatLiveLocationsActivity, GoogleMapView

class yb
    implements Runnable
{

    final dz a;

    yb(dz dz1)
    {
        a = dz1;
        super();
    }

    public void run()
    {
        GroupChatLiveLocationsActivity.b(a.a).getController().animateTo(GroupChatLiveLocationsActivity.g(a.a).getMyLocation());
        if (GroupChatLiveLocationsActivity.b(a.a).getZoomLevel() < 17)
        {
            GroupChatLiveLocationsActivity.b(a.a).getController().setZoom(17);
        }
    }
}
