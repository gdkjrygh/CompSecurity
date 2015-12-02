// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            GroupChatRecentLocationsActivity

class _3
    implements android.view.View.OnClickListener
{

    final GroupChatRecentLocationsActivity a;

    _3(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
        super();
    }

    public void onClick(View view)
    {
        GroupChatRecentLocationsActivity.l(a);
        if (GroupChatRecentLocationsActivity.h(a) < -1)
        {
            GroupChatRecentLocationsActivity.a(a, GroupChatRecentLocationsActivity.g(a).size() - 1);
        }
        GroupChatRecentLocationsActivity.j(a);
    }
}
