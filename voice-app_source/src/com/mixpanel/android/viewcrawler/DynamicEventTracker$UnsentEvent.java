// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            DynamicEventTracker

private static class timeSentMillis
{

    public final String eventName;
    public final JSONObject properties;
    public final long timeSentMillis;

    public (String s, JSONObject jsonobject, long l)
    {
        eventName = s;
        properties = jsonobject;
        timeSentMillis = l;
    }
}
