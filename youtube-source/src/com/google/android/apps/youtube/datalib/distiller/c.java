// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller:
//            i, a

public final class c extends i
{

    private String a;
    private int b;
    private String c;

    public c()
    {
    }

    static String a(c c1)
    {
        return c1.a;
    }

    public final c a(int j)
    {
        b = 2;
        return this;
    }

    public final c a(String s)
    {
        a = s;
        return this;
    }

    public final String a()
    {
        return (new StringBuilder("streams/")).append(com.google.android.apps.youtube.datalib.distiller.a.e()).append(a).append("/activities/filtered").toString();
    }

    public final c b(String s)
    {
        c = s;
        return this;
    }

    public final Map b()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("maxComments", String.valueOf(b));
        if (c != null)
        {
            hashmap.put("pageToken", c);
        }
        return hashmap;
    }

    protected final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(a);
        boolean flag;
        if (b >= 0 && b <= 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
    }
}
