// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            GroupChatRecentLocationsActivity, a1t

class mh
    implements android.view.View.OnClickListener
{

    final GroupChatRecentLocationsActivity a;

    mh(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
        super();
    }

    public void onClick(View view)
    {
        GroupChatRecentLocationsActivity.a(a, -1);
        GroupChatRecentLocationsActivity.b(a).runOnFirstFix(new a1t(this));
    }
}
