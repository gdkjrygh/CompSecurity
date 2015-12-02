// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.maps.MyLocationOverlay;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity, td, GoogleMapView

class ol
    implements Runnable
{

    final GroupChatLiveLocationsActivity a;

    ol(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        a = groupchatlivelocationsactivity;
        super();
    }

    public void run()
    {
        if (GroupChatLiveLocationsActivity.f(a).e.size() == 0)
        {
            GroupChatLiveLocationsActivity.b(a).a(GroupChatLiveLocationsActivity.g(a).getMyLocation());
        }
    }
}
