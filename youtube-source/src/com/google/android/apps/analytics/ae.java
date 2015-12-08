// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.net.Uri;
import android.util.Log;

final class ae
{

    static String a(String s, long l)
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
                Log.e("GoogleAnalyticsTracker", (new StringBuilder("Error parsing utmht parameter: ")).append(numberformatexception.toString()).toString());
                return s;
            }
        }
        return s1;
    }
}
