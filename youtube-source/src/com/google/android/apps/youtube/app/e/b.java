// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.e;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bj;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.apps.youtube.app.e:
//            c

public final class b
    implements af
{

    private final int a = 8;
    private final int b = 24;
    private final af c;
    private final ConcurrentMap d;
    private final bj e;
    private final boolean f = true;

    public b(af af1, bj bj1, ConcurrentMap concurrentmap, int i, int j, boolean flag)
    {
        c = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        e = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        d = (ConcurrentMap)com.google.android.apps.youtube.common.fromguava.c.a(concurrentmap);
        com.google.android.apps.youtube.common.fromguava.c.a(true, "minDesiredTeasers must be > 0");
        com.google.android.apps.youtube.common.fromguava.c.a(true, "maxTeasers must be > minDesiredTeasers");
    }

    static boolean a(b b1)
    {
        return b1.f;
    }

    static ConcurrentMap b(b b1)
    {
        return b1.d;
    }

    static int c(b b1)
    {
        return b1.b;
    }

    static int d(b b1)
    {
        return b1.a;
    }

    static af e(b b1)
    {
        return b1.c;
    }

    static bj f(b b1)
    {
        return b1.e;
    }

    public final void a(GDataRequest gdatarequest, com.google.android.apps.youtube.common.a.b b1)
    {
        L.a();
        c.a(gdatarequest, new com.google.android.apps.youtube.app.e.c(this, b1));
    }

    public final volatile void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        a((GDataRequest)obj, b1);
    }
}
