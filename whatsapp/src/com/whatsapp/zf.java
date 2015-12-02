// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.cr;
import java.util.ArrayList;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity

class zf
    implements Comparator
{

    final GroupChatLiveLocationsActivity a;

    zf(GroupChatLiveLocationsActivity groupchatlivelocationsactivity)
    {
        a = groupchatlivelocationsactivity;
        super();
    }

    public int a(ArrayList arraylist, ArrayList arraylist1)
    {
        return (int)(((cr)arraylist1.get(0)).e * 1000000D - ((cr)arraylist.get(0)).e * 1000000D);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ArrayList)obj, (ArrayList)obj1);
    }
}
