// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.event.p;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;

// Referenced classes of package com.google.android.apps.youtube.core.player.fetcher:
//            e

final class f
    implements l
{

    final e a;
    private final l b;

    private f(e e1, l l1)
    {
        a = e1;
        super();
        b = (l)c.a(l1);
    }

    f(e e1, l l1, byte byte0)
    {
        this(e1, l1);
    }

    public final void a(VolleyError volleyerror)
    {
        b.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (WatchNextResponse)obj;
        com.google.android.apps.youtube.core.player.fetcher.e.a(a).a(new p());
        b.a(obj);
    }
}
