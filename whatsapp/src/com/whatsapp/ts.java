// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Point;
import android.util.Pair;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            GroupChatLiveLocationsActivity2

class ts
    implements Comparator
{

    final GroupChatLiveLocationsActivity2 a;

    ts(GroupChatLiveLocationsActivity2 groupchatlivelocationsactivity2)
    {
        a = groupchatlivelocationsactivity2;
        super();
    }

    public int a(Pair pair, Pair pair1)
    {
        return ((Point)pair.second).x - ((Point)pair1.second).x;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Pair)obj, (Pair)obj1);
    }
}
