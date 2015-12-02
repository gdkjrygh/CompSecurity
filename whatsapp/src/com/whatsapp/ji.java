// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            GroupChatRecentLocationsActivity

class ji
    implements Comparator
{

    final GroupChatRecentLocationsActivity a;

    ji(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
        super();
    }

    public int a(c4 c4_1, c4 c4_2)
    {
        return (int)(c4_2.o * 1000000D - c4_1.o * 1000000D);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((c4)obj, (c4)obj1);
    }
}
