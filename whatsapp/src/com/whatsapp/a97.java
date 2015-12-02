// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.ViewTreeObserver;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity, GoogleMapView

class a97
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final GroupChatLiveLocationsActivity a;

    a97(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        a = groupchatlivelocationsactivity;
        super();
    }

    public boolean onPreDraw()
    {
        GroupChatLiveLocationsActivity.b(a).getViewTreeObserver().removeOnPreDrawListener(this);
        GroupChatLiveLocationsActivity.c(a);
        return true;
    }
}
