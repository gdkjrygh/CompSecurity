// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity2

class lv
    implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
{

    final GroupChatLiveLocationsActivity2 a;

    lv(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        a = groupchatlivelocationsactivity2;
        super();
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        if ((int)(GroupChatLiveLocationsActivity2.b(a) * 5F) != (int)(cameraposition.zoom * 5F))
        {
            GroupChatLiveLocationsActivity2.b(a, cameraposition.zoom);
            GroupChatLiveLocationsActivity2.j(a);
        }
    }
}
