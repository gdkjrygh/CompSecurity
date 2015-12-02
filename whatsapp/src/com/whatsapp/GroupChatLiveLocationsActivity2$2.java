// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;

// Referenced classes of package com.whatsapp:
//            GoogleMapView2, App, GroupChatLiveLocationsActivity2

class n extends GoogleMapView2
{

    final GroupChatLiveLocationsActivity2 n;

    public void a(int i)
    {
        int j;
        j = App.am;
        GroupChatLiveLocationsActivity2.a(n, true);
        i;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 41
    //                   1 57
    //                   2 73;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        GroupChatLiveLocationsActivity2.c(n).setImageResource(0x7f0200c0);
        if (j == 0) goto _L1; else goto _L3
_L3:
        GroupChatLiveLocationsActivity2.c(n).setImageResource(0x7f0200bd);
        if (j == 0) goto _L1; else goto _L4
_L4:
        GroupChatLiveLocationsActivity2.c(n).setImageResource(0x7f0200e1);
        return;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        GroupChatLiveLocationsActivity2.a(n, true);
        GroupChatLiveLocationsActivity2.a(n, null);
        return super.dispatchTouchEvent(motionevent);
    }

    (GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2, Context context, GoogleMapOptions googlemapoptions)
    {
        n = groupchatlivelocationsactivity2;
        super(context, googlemapoptions);
    }
}
