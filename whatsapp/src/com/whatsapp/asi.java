// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.location.Location;
import com.google.android.maps.MapView;

// Referenced classes of package com.whatsapp:
//            asq, GroupChatLiveLocationsActivity

class asi extends asq
{

    final GroupChatLiveLocationsActivity h;

    asi(GroupChatLiveLocationsActivity groupchatlivelocationsactivity, Context context, MapView mapview)
    {
        h = groupchatlivelocationsactivity;
        super(context, mapview);
    }

    public void onLocationChanged(Location location)
    {
        super.onLocationChanged(location);
    }
}
