// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity2, td, GoogleMapView2

class ad1
    implements android.view.View.OnClickListener
{

    final GroupChatLiveLocationsActivity2 a;

    ad1(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        a = groupchatlivelocationsactivity2;
        super();
    }

    public void onClick(View view)
    {
        GroupChatLiveLocationsActivity2.a(a, null);
        GroupChatLiveLocationsActivity2.d(a).a();
        GroupChatLiveLocationsActivity2.j(a);
        GroupChatLiveLocationsActivity2.g(a).a();
    }
}
