// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;

public final class bu
{

    private final l a;
    private final q b;
    private final b c;
    private final String d;
    private boolean e;

    bu(l l1, q q1, b b1, String s)
    {
        a = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        b = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        d = com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    public final void a()
    {
        if (!e)
        {
            OfflineStoreInterface offlinestoreinterface;
            if (a.b())
            {
                offlinestoreinterface = b.a(a.c());
            } else
            {
                offlinestoreinterface = b.a();
            }
            if (offlinestoreinterface.a(d) != null)
            {
                long l1 = c.a();
                L.e((new StringBuilder("Tracking last offlined playback for video ")).append(d).append(": ").append(l1).toString());
                offlinestoreinterface.a(d, l1);
            }
            e = true;
        }
    }
}
