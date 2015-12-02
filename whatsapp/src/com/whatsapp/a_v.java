// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.ViewTreeObserver;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity2, GoogleMapView2

class a_v
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final GroupChatLiveLocationsActivity2 a;

    a_v(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        a = groupchatlivelocationsactivity2;
        super();
    }

    public void onGlobalLayout()
    {
        GroupChatLiveLocationsActivity2.g(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (GroupChatLiveLocationsActivity2.g(a).getWidth() > 0 && GroupChatLiveLocationsActivity2.g(a).getHeight() > 0)
        {
            GroupChatLiveLocationsActivity2.b(a, false);
        }
    }
}
