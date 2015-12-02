// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.MotionEvent;

// Referenced classes of package com.whatsapp:
//            GoogleMapView, GroupChatLiveLocationsActivity

class f extends GoogleMapView
{

    final GroupChatLiveLocationsActivity f;

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        GroupChatLiveLocationsActivity.a(f, null);
        return super.dispatchTouchEvent(motionevent);
    }

    (GroupChatLiveLocationsActivity groupchatlivelocationsactivity, Context context)
    {
        f = groupchatlivelocationsactivity;
        super(context);
    }
}
