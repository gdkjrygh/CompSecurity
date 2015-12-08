// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.d.h;
import com.google.android.apps.youtube.common.d.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.e.f;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            m, r, s

public class q extends h
{

    public static final String a = com/google/android/apps/youtube/datalib/offline/q.getCanonicalName();
    private final b b;
    private final m c;
    private final j d;
    private final com.google.android.apps.youtube.common.e.b e;
    private final com.google.android.apps.youtube.datalib.config.c f;

    protected q(g g, b b1, m m1, j j1, com.google.android.apps.youtube.common.e.b b2, com.google.android.apps.youtube.datalib.config.c c1)
    {
        super(g);
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
        d = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        e = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b2);
        f = (com.google.android.apps.youtube.datalib.config.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
    }

    static m a(q q1)
    {
        return q1.c;
    }

    protected final void a()
    {
        Object obj = b;
        obj = com.google.android.apps.youtube.datalib.e.b.a("delayed_request", 0x323467f);
        ((f) (obj)).a(true);
        ((f) (obj)).a(c.f());
        ((f) (obj)).a(new r(this));
        b.a(((f) (obj)), com.google.android.apps.youtube.datalib.a.b.b);
        long l = e.a();
        long l1 = TimeUnit.HOURS.toMillis(f.d());
        d.d(s.a((l - 30L) + l1, f));
    }

}
