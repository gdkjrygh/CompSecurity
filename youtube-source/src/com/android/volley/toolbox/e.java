// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.b;
import com.android.volley.j;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public final class e
{

    private static long a(String s)
    {
        long l;
        try
        {
            l = DateUtils.parseDate(s).getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }

    public static b a(j j1)
    {
        Map map;
        String s;
        boolean flag;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        l5 = System.currentTimeMillis();
        map = j1.c;
        l2 = 0L;
        l4 = 0L;
        l = 0L;
        flag = false;
        s = (String)map.get("Date");
        if (s != null)
        {
            l2 = a(s);
        }
        s = (String)map.get("Cache-Control");
        l3 = l;
        if (s == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        boolean flag1;
        flag1 = true;
        as = s.split(",");
        i = 0;
_L6:
        l3 = l;
        flag = flag1;
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        String s2;
        s2 = as[i].trim();
        if (s2.equals("no-cache") || s2.equals("no-store"))
        {
            return null;
        }
        if (!s2.startsWith("max-age=")) goto _L5; else goto _L4
_L4:
        l3 = Long.parseLong(s2.substring(8));
        l = l3;
_L7:
        i++;
          goto _L6
_L5:
        if (s2.equals("must-revalidate") || s2.equals("proxy-revalidate"))
        {
            l = 0L;
        }
          goto _L7
_L2:
        String s1 = (String)map.get("Expires");
        long l1 = l4;
        if (s1 != null)
        {
            l1 = a(s1);
        }
        s1 = (String)map.get("ETag");
        b b1;
        Exception exception;
        if (flag)
        {
            l1 = l3 * 1000L + l5;
        } else
        if (l2 > 0L && l1 >= l2)
        {
            l1 = (l1 - l2) + l5;
        } else
        {
            l1 = 0L;
        }
        b1 = new b();
        b1.a = j1.b;
        b1.b = s1;
        b1.e = l1;
        b1.d = b1.e;
        b1.c = l2;
        b1.f = map;
        return b1;
        exception;
          goto _L7
    }

    public static String a(Map map)
    {
        map = (String)map.get("Content-Type");
        if (map != null)
        {
            map = map.split(";");
            for (int i = 1; i < map.length; i++)
            {
                String as[] = map[i].trim().split("=");
                if (as.length == 2 && as[0].equals("charset"))
                {
                    return as[1];
                }
            }

        }
        return "ISO-8859-1";
    }
}
