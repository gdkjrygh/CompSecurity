// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.maps.MyLocationOverlay;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, GroupChatLiveLocationsActivity, td, yb

class dz
    implements android.view.View.OnClickListener
{

    final GroupChatLiveLocationsActivity a;

    dz(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        a = groupchatlivelocationsactivity;
        super();
    }

    public void onClick(View view)
    {
        int i = App.am;
        GroupChatLiveLocationsActivity.a(a, null);
        GroupChatLiveLocationsActivity.f(a).a();
        view = GroupChatLiveLocationsActivity.a(a).iterator();
        do
        {
            if (!view.hasNext())
            {
                break;
            }
            ((ViewGroup)(View)view.next()).getChildAt(0).setSelected(false);
        } while (i == 0);
        GroupChatLiveLocationsActivity.g(a).runOnFirstFix(new yb(this));
    }
}
