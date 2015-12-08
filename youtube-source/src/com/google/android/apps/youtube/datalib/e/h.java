// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.e;

import com.android.volley.VolleyError;
import com.android.volley.d;
import com.android.volley.j;
import com.google.android.apps.youtube.a.a.c;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.a.r;
import com.google.android.apps.youtube.datalib.offline.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

final class h extends r
{

    private final c a;
    private final b b;
    private final m c;
    private final l d;

    public h(c c1, l l1, b b1, com.google.android.apps.youtube.datalib.config.c c2, m m1)
    {
        super(c1.c(), ((c)com.google.android.apps.youtube.common.fromguava.c.a(c1)).d(), l1);
        a(new d((int)TimeUnit.SECONDS.toMillis(c2.e()), 0, 0.0F));
        a(false);
        a = (c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        d = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
    }

    protected final com.android.volley.m a(j j)
    {
        return com.android.volley.m.a(null, null);
    }

    protected final void a(Object obj)
    {
        c.c();
        d.a(null);
    }

    public final void b(VolleyError volleyerror)
    {
        if (com.google.android.apps.youtube.datalib.a.b.a(volleyerror) > 0)
        {
            c.d();
        } else
        {
            c.e();
        }
        super.b(volleyerror);
    }

    public final Map h()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = a.h().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.apps.youtube.a.a.b b1 = (com.google.android.apps.youtube.a.a.b)iterator.next();
            if (b1.b() && b1.d())
            {
                hashmap.put(b1.a(), b1.c());
            }
        } while (true);
        hashmap.put("X-Goog-Request-Time", String.valueOf(b.a()));
        hashmap.put("X-Goog-Event-Time", String.valueOf(a.i()));
        return hashmap;
    }
}
