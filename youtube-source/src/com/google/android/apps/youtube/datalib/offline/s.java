// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.d.h;
import com.google.android.apps.youtube.common.d.i;
import com.google.android.apps.youtube.common.d.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.e.b;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            m, q

public final class s
    implements i
{

    private final b a;
    private final m b;
    private final j c;
    private final com.google.android.apps.youtube.common.e.b d;
    private final com.google.android.apps.youtube.datalib.config.c e;

    public s(b b1, m m1, j j1, com.google.android.apps.youtube.common.e.b b2, com.google.android.apps.youtube.datalib.config.c c1)
    {
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
        c = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        d = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b2);
        e = (com.google.android.apps.youtube.datalib.config.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
    }

    public static g a(long l, com.google.android.apps.youtube.datalib.config.c c1)
    {
        return (new g()).a(q.a).a(TimeUnit.SECONDS.toMillis(30L) + l).b(TimeUnit.HOURS.toMillis(c1.d()));
    }

    public final h a(g g1)
    {
        return new q(g1, a, b, c, d, e);
    }

    public final String a()
    {
        return q.a;
    }
}
