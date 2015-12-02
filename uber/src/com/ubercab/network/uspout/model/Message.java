// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout.model;

import java.util.Map;

// Referenced classes of package com.ubercab.network.uspout.model:
//            Shape_Message, Location

public abstract class Message
{

    public Message()
    {
    }

    public static Message create(Map map)
    {
        return create(map, System.currentTimeMillis());
    }

    public static Message create(Map map, long l)
    {
        return create(map, l, null, null);
    }

    public static Message create(Map map, long l, Double double1, Double double2)
    {
        map = (new Shape_Message()).setContent(map).setCreatedAtLocalTimestampMilliseconds(l);
        if (double1 != null && double2 != null)
        {
            map.setLocation(Location.create(double1, double2));
        }
        return map;
    }

    public abstract Map getContent();

    public abstract long getCreatedAtLocalTimestampMilliseconds();

    public abstract Location getLocation();

    public abstract String getUserUUID();

    public abstract Message setContent(Map map);

    public abstract Message setCreatedAtLocalTimestampMilliseconds(long l);

    public abstract Message setLocation(Location location);

    public abstract Message setUserUUID(String s);
}
