// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            AnalyticsMessages

static class token
{

    private final String eventName;
    private final JSONObject properties;
    private final String token;

    public String getEventName()
    {
        return eventName;
    }

    public JSONObject getProperties()
    {
        return properties;
    }

    public String getToken()
    {
        return token;
    }

    public (String s, JSONObject jsonobject, String s1)
    {
        eventName = s;
        properties = jsonobject;
        token = s1;
    }
}
