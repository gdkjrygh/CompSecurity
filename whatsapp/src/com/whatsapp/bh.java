// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            GroupChatRecentLocationsActivity, App, k

class bh
    implements android.view.View.OnLongClickListener
{

    final GroupChatRecentLocationsActivity a;

    bh(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
        super();
    }

    public boolean onLongClick(View view)
    {
        GroupChatRecentLocationsActivity.a(a, null);
        view = ((View) (view.getTag()));
        if (view != null)
        {
            view = GroupChatRecentLocationsActivity.a(a, view.toString());
            if (view != null)
            {
                GroupChatRecentLocationsActivity.a(a, App.az.e(((c4) (view)).G));
                a.removeDialog(0);
                a.showDialog(0);
            }
        }
        return true;
    }
}
