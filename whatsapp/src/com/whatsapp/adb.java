// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            adk, GroupChatRecentLocationsActivity, a__

class adb extends adk
{

    final GroupChatRecentLocationsActivity a;

    adb(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
        super();
    }

    public void b(c4 c4_1, int i)
    {
        if (c4_1 != null && c4_1.y.a.equals(GroupChatRecentLocationsActivity.d(a)) && !c4_1.y.b && c4_1.w == 5)
        {
            c4 c4_2 = com.whatsapp.GroupChatRecentLocationsActivity.a(a, c4_1.G);
            if (c4_2 != null)
            {
                GroupChatRecentLocationsActivity.g(a).remove(c4_2);
            }
            GroupChatRecentLocationsActivity.g(a).add(c4_1);
            GroupChatRecentLocationsActivity.k(a);
            GroupChatRecentLocationsActivity.f(a).a();
        }
    }
}
