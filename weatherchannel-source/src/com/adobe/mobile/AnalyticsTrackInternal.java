// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, RequestBuilder

final class AnalyticsTrackInternal
{

    AnalyticsTrackInternal()
    {
    }

    protected static void trackInternal(String s, Map map)
    {
        trackInternal(s, map, StaticMethods.getTimeSince1970());
    }

    protected static void trackInternal(String s, Map map, long l)
    {
        Object obj;
        StringBuilder stringbuilder;
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = new HashMap();
        }
        if (s != null)
        {
            obj = s;
        } else
        {
            obj = "None";
        }
        map.put("a.internalaction", obj);
        obj = new HashMap();
        ((HashMap) (obj)).put("pe", "lnk_o");
        stringbuilder = (new StringBuilder()).append("ADBINTERNAL:");
        if (s == null)
        {
            s = "None";
        }
        ((HashMap) (obj)).put("pev2", stringbuilder.append(s).toString());
        ((HashMap) (obj)).put("pageName", StaticMethods.getApplicationID());
        RequestBuilder.buildAndSendRequest(map, ((Map) (obj)), l);
    }
}
