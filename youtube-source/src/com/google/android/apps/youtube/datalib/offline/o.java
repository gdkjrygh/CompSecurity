// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.d.h;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            j

public class o extends h
{

    private static final String a = com/google/android/apps/youtube/datalib/offline/o.getCanonicalName();
    private final j b;
    private final com.google.android.apps.youtube.common.network.h c;

    public o(g g1, j j1, com.google.android.apps.youtube.common.network.h h1)
    {
        super(g1);
        b = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        c = (com.google.android.apps.youtube.common.network.h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
    }

    public static g a(long l)
    {
        return (new g()).a(a).a(TimeUnit.SECONDS.toMillis(30L) + l).b(TimeUnit.SECONDS.toMillis(600L));
    }

    static String b()
    {
        return a;
    }

    public final void a()
    {
        if (c.a())
        {
            L.e("Flushing offline queue.");
            b.a();
            return;
        } else
        {
            L.e("Not flushing offline queue because we have no network.");
            return;
        }
    }

}
