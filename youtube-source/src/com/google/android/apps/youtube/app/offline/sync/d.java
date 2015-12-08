// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.sync;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.d.h;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.offline.sync:
//            b

public class d extends h
{

    private static final String a = com/google/android/apps/youtube/app/offline/sync/d.getCanonicalName();
    private final b b;
    private final com.google.android.apps.youtube.common.network.h c;

    public d(g g1, b b1, com.google.android.apps.youtube.common.network.h h1)
    {
        super(g1);
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = (com.google.android.apps.youtube.common.network.h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
    }

    public static g a(long l)
    {
        return (new g()).a(a).a(l).b(0L);
    }

    static String b()
    {
        return a;
    }

    public final void a()
    {
        if (c.a())
        {
            L.e("Syncing offline continuations.");
            b.b();
            return;
        } else
        {
            L.e("Not Syncing offline continuations because we have no network.");
            return;
        }
    }

}
