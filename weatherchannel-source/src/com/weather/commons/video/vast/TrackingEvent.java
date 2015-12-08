// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;


// Referenced classes of package com.weather.commons.video.vast:
//            TrackingEventType

public class TrackingEvent
{

    private final int offset;
    private final TrackingEventType type;
    private final String url;

    public TrackingEvent(String s, TrackingEventType trackingeventtype, String s1)
    {
        url = s;
        type = trackingeventtype;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int i = 0;
        int j = Integer.parseInt(s1);
        i = j;
_L4:
        offset = i;
        return;
_L2:
        offset = 0;
        return;
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getOffset()
    {
        return offset;
    }

    public TrackingEventType getType()
    {
        return type;
    }

    public String getUrl()
    {
        return url;
    }
}
