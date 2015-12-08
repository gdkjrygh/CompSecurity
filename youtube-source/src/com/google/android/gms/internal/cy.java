// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            do, cg, dj

public final class cy
{

    private String a;
    private String b;
    private String c;
    private List d;
    private List e;
    private long f;
    private boolean g;
    private final long h = -1L;
    private List i;
    private long j;
    private int k;

    public cy()
    {
        f = -1L;
        g = false;
        j = -1L;
        k = -1;
    }

    private static long a(Map map, String s)
    {
        map = (List)map.get(s);
        if (map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        map = (String)map.get(0);
        float f1 = Float.parseFloat(map);
        return (long)(f1 * 1000F);
        NumberFormatException numberformatexception;
        numberformatexception;
        com.google.android.gms.internal.do.d((new StringBuilder("Could not parse float from ")).append(s).append(" header: ").append(map).toString());
        return -1L;
    }

    private static List b(Map map, String s)
    {
        map = (List)map.get(s);
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if (map != null)
            {
                return Arrays.asList(map.trim().split("\\s+"));
            }
        }
        return null;
    }

    public final cg a()
    {
        return new cg(b, c, d, e, f, g, -1L, i, j, k, a);
    }

    public final void a(String s, Map map, String s1)
    {
        b = s;
        c = s1;
        a(map);
    }

    public final void a(Map map)
    {
        List list = (List)map.get("X-Afma-Ad-Size");
        if (list != null && !list.isEmpty())
        {
            a = (String)list.get(0);
        }
        list = b(map, "X-Afma-Click-Tracking-Urls");
        if (list != null)
        {
            d = list;
        }
        list = b(map, "X-Afma-Tracking-Urls");
        if (list != null)
        {
            e = list;
        }
        long l = a(map, "X-Afma-Interstitial-Timeout");
        if (l != -1L)
        {
            f = l;
        }
        list = (List)map.get("X-Afma-Mediation");
        if (list != null && !list.isEmpty())
        {
            g = Boolean.valueOf((String)list.get(0)).booleanValue();
        }
        list = b(map, "X-Afma-Manual-Tracking-Urls");
        if (list != null)
        {
            i = list;
        }
        l = a(map, "X-Afma-Refresh-Rate");
        if (l != -1L)
        {
            j = l;
        }
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                k = dj.b();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                k = dj.a();
                return;
            }
        }
    }
}
