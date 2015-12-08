// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.e;

import com.android.volley.l;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.offline.SendingStrategy;
import com.google.android.apps.youtube.datalib.offline.m;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.e:
//            h

public class g
    implements SendingStrategy
{

    protected final b a;
    private final l b;
    private final com.google.android.apps.youtube.datalib.config.c c;
    private final m d;

    public g(l l1, b b1, com.google.android.apps.youtube.datalib.config.c c1, m m1)
    {
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = (com.google.android.apps.youtube.datalib.config.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        d = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
    }

    public int a()
    {
        return 0x323467f;
    }

    public final void a(com.google.android.apps.youtube.a.a.c c1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        if (!c1.g())
        {
            l1.a(new com.google.android.apps.youtube.datalib.offline.SendingStrategy.PermanentVolleyError("malformed request proto"));
        }
        c1 = new h(c1, l1, a, c, d);
        b.a(c1);
    }

    public boolean a(com.google.android.apps.youtube.a.a.c c1)
    {
        long l1 = a.a();
        long l2 = TimeUnit.HOURS.toMillis(c.b());
        return c1.i() > l1 - l2;
    }
}
