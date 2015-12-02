// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            mh, GroupChatRecentLocationsActivity, GoogleMapView, a18

class a1t
    implements Runnable
{

    final mh a;

    a1t(mh mh1)
    {
        a = mh1;
        super();
    }

    public void run()
    {
        GroupChatRecentLocationsActivity.c(a.a).getController().animateTo(GroupChatRecentLocationsActivity.b(a.a).getMyLocation());
        GroupChatRecentLocationsActivity.c(a.a).getController().setZoom(17);
        a.a.runOnUiThread(new a18(this));
    }
}
