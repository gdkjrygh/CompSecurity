// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            GroupChatRecentLocationsActivity

class mz
    implements Comparator
{

    final GroupChatRecentLocationsActivity a;

    mz(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
        super();
    }

    public int a(ArrayList arraylist, ArrayList arraylist1)
    {
        return (int)(((c4)arraylist1.get(0)).o * 1000000D - ((c4)arraylist.get(0)).o * 1000000D);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ArrayList)obj, (ArrayList)obj1);
    }
}
