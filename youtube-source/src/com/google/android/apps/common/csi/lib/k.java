// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class k
{

    static boolean a = false;

    public static String a()
    {
        return System.getProperty("http.agent");
    }

    public static String a(String s, Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s).append("?");
        String s1;
        String s2;
        for (s = map.keySet().iterator(); s.hasNext(); stringbuilder.append(s1).append("=").append(s2).append("&"))
        {
            s1 = (String)s.next();
            s2 = (String)map.get(s1);
        }

        if (stringbuilder.charAt(stringbuilder.length() - 1) == '&')
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        return stringbuilder.toString();
    }

    static void a(String s, String s1)
    {
        if (!a && Log.isLoggable(s, 3))
        {
            Log.d(s, s1);
        }
    }

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    static void b(String s, String s1)
    {
        if (!a && Log.isLoggable(s, 6))
        {
            Log.e(s, s1);
        }
    }

}
