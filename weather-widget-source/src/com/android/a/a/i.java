// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import com.android.a.c;
import com.android.a.m;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class i
{

    public static long a(String s)
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

    public static c a(m m1)
    {
        Map map;
        Object obj;
        int j;
        long l;
        long l1;
        long l2;
        long l3;
        long l4;
        l4 = System.currentTimeMillis();
        map = m1.c;
        map.put("Cache-Control", "max-age=345600000");
        l1 = 0L;
        l3 = 0L;
        l = 0L;
        j = 0;
        obj = (String)map.get("Date");
        if (obj != null)
        {
            l1 = a(((String) (obj)));
        }
        obj = (String)map.get("Cache-Control");
        l2 = l;
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = true;
        obj = ((String) (obj)).split(",");
        j = 0;
_L6:
        if (j < obj.length) goto _L4; else goto _L3
_L3:
        j = ((flag) ? 1 : 0);
        l2 = l;
_L2:
        obj = (String)map.get("Expires");
        l = l3;
        if (obj != null)
        {
            l = a(((String) (obj)));
        }
        obj = (String)map.get("ETag");
        Object obj1;
        Exception exception;
        if (j != 0)
        {
            l = l2 * 1000L + l4;
        } else
        if (l1 > 0L && l >= l1)
        {
            l = (l - l1) + l4;
        } else
        {
            l = 0L;
        }
        obj1 = new c();
        obj1.a = m1.b;
        obj1.b = ((String) (obj));
        obj1.e = l;
        obj1.d = ((c) (obj1)).e;
        obj1.c = l1;
        obj1.f = map;
        return ((c) (obj1));
_L4:
        obj1 = obj[j].trim();
        if (((String) (obj1)).equals("no-cache") || ((String) (obj1)).equals("no-store"))
        {
            return null;
        }
        if (!((String) (obj1)).startsWith("max-age="))
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = Long.parseLong(((String) (obj1)).substring(8));
        l = l2;
_L8:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        if (!((String) (obj1)).equals("must-revalidate") && !((String) (obj1)).equals("proxy-revalidate")) goto _L8; else goto _L7
_L7:
        l = 0L;
          goto _L8
        exception;
          goto _L8
    }
}
