// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class HttpHeaderParser
{

    public HttpHeaderParser()
    {
    }

    public static com.android.volley.Cache.Entry parseCacheHeaders(NetworkResponse networkresponse)
    {
        Map map;
        String s;
        boolean flag;
        long l;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        l5 = System.currentTimeMillis();
        map = networkresponse.headers;
        l1 = 0L;
        l3 = 0L;
        l4 = 0L;
        l = 0L;
        flag = false;
        s = (String)map.get("Date");
        if (s != null)
        {
            l1 = parseDateAsEpoch(s);
        }
        s = (String)map.get("Cache-Control");
        l2 = l;
        if (s == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        boolean flag1;
        flag1 = true;
        as = s.split(",");
        i = 0;
_L6:
        flag = flag1;
        l2 = l;
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        String s1;
        s1 = as[i].trim();
        if (s1.equals("no-cache") || s1.equals("no-store"))
        {
            return null;
        }
        if (!s1.startsWith("max-age=")) goto _L5; else goto _L4
_L4:
        l2 = Long.parseLong(s1.substring(8));
        l = l2;
_L7:
        i++;
          goto _L6
_L5:
        if (s1.equals("must-revalidate") || s1.equals("proxy-revalidate"))
        {
            l = 0L;
        }
          goto _L7
_L2:
        as = (String)map.get("Expires");
        if (as != null)
        {
            l3 = parseDateAsEpoch(as);
        }
        as = (String)map.get("ETag");
        if (!flag) goto _L9; else goto _L8
_L8:
        l = l5 + 1000L * l2;
_L11:
        com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
        entry.data = networkresponse.data;
        entry.etag = as;
        entry.softTtl = l;
        entry.ttl = entry.softTtl;
        entry.serverDate = l1;
        entry.responseHeaders = map;
        return entry;
_L9:
        l = l4;
        if (l1 > 0L)
        {
            l = l4;
            if (l3 >= l1)
            {
                l = l5 + (l3 - l1);
            }
        }
        if (true) goto _L11; else goto _L10
_L10:
        Exception exception;
        exception;
          goto _L7
    }

    public static String parseCharset(Map map)
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

    public static long parseDateAsEpoch(String s)
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
}
