// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

class Utils
{

    Utils()
    {
    }

    static String addQueueTimeParameter(String s, long l)
    {
        String s2 = Uri.parse(s).getQueryParameter("utmht");
        String s1 = s;
        if (s2 != null)
        {
            try
            {
                long l1 = Long.parseLong(s2);
                s1 = (new StringBuilder()).append(s).append("&utmqt=").append(l - Long.valueOf(l1).longValue()).toString();
            }
            catch (NumberFormatException numberformatexception)
            {
                Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("Error parsing utmht parameter: ").append(numberformatexception.toString()).toString());
                return s;
            }
        }
        return s1;
    }

    static Map parseURLParameters(String s)
    {
        HashMap hashmap = new HashMap();
        s = s.split("&");
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            String as[] = s[i].split("=");
            if (as.length > 1)
            {
                hashmap.put(as[0], as[1]);
            } else
            if (as.length == 1)
            {
                hashmap.put(as[0], null);
            }
            i++;
        }
        return hashmap;
    }
}
