// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller:
//            i

public final class d extends i
{

    private int a;
    private String b;
    private String c;

    public d()
    {
        a = -1;
    }

    public final d a(int j)
    {
        a = 5;
        return this;
    }

    public final d a(String s)
    {
        b = s;
        return this;
    }

    public final String a()
    {
        return (new StringBuilder("activities/")).append(b).append("/comments").toString();
    }

    public final d b(String s)
    {
        c = s;
        return this;
    }

    public final Map b()
    {
        HashMap hashmap = new HashMap();
        if (a != -1)
        {
            hashmap.put("maxResults", (new StringBuilder()).append(a).toString());
        }
        if (c != null)
        {
            hashmap.put("pageToken", c);
        }
        hashmap.put("sortOrder", "descending");
        return hashmap;
    }

    protected final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(b);
        if (a != -1)
        {
            boolean flag;
            if (a > 0 && a <= 500)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.a(flag);
        }
    }
}
