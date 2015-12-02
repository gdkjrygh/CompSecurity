// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity2, td

class a86
    implements com.google.android.gms.maps.GoogleMap.OnMapClickListener
{

    final GroupChatLiveLocationsActivity2 a;

    a86(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        a = groupchatlivelocationsactivity2;
        super();
    }

    public void onMapClick(LatLng latlng)
    {
        GroupChatLiveLocationsActivity2.a(a, null);
        GroupChatLiveLocationsActivity2.d(a).a();
        GroupChatLiveLocationsActivity2.j(a);
    }
}
