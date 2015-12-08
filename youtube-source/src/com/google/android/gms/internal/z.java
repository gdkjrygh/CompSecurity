// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, dj, do, db, 
//            ds, bo

public final class z
    implements y
{

    public z()
    {
    }

    private static boolean a(Map map)
    {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map map)
    {
        map = (String)map.get("o");
        if (map != null)
        {
            if ("p".equalsIgnoreCase(map))
            {
                return dj.b();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return dj.a();
            }
        }
        return -1;
    }

    public final void a(db db1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            com.google.android.gms.internal.do.d("Action missing from an open GMSG.");
            return;
        }
        ds ds1 = db1.e();
        if ("expand".equalsIgnoreCase(s))
        {
            if (db1.h())
            {
                com.google.android.gms.internal.do.d("Cannot expand WebView that is already expanded.");
                return;
            } else
            {
                ds1.a(a(map), b(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(s))
        {
            db1 = (String)map.get("u");
            if (db1 != null)
            {
                ds1.a(a(map), b(map), db1);
                return;
            } else
            {
                ds1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                return;
            }
        } else
        {
            ds1.a(new bo((String)map.get("i"), (String)map.get("u"), (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
            return;
        }
    }
}
