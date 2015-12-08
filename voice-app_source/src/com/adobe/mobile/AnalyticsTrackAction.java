// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, RequestBuilder

final class AnalyticsTrackAction
{

    AnalyticsTrackAction()
    {
    }

    protected static void trackAction(String s, Map map)
    {
        HashMap hashmap;
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = new HashMap();
        }
        if (s == null)
        {
            s = "";
        }
        map.put("a.action", s);
        hashmap = new HashMap();
        hashmap.put("pe", "lnk_o");
        hashmap.put("pev2", (new StringBuilder()).append("AMACTION:").append(s).toString());
        hashmap.put("pageName", StaticMethods.getApplicationID());
        RequestBuilder.buildAndSendRequest(map, hashmap, StaticMethods.getTimeSince1970());
    }
}
