// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.app.offline.b;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.offline.store.j;
import com.google.android.apps.youtube.core.offline.store.l;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.v;
import java.util.HashMap;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f, af

final class p
    implements j
{

    final f a;

    private p(f f1)
    {
        a = f1;
        super();
    }

    p(f f1, byte byte0)
    {
        this(f1);
    }

    public final void a()
    {
        a.a(0L);
    }

    public final void a(PlayerResponse playerresponse)
    {
        playerresponse = playerresponse.getOfflineState();
        if (playerresponse != null)
        {
            long l1 = playerresponse.g();
            long l2 = a.i();
            if (l1 > 0L && (l2 == 0L || l1 < l2))
            {
                a.a(l1);
                return;
            }
        }
    }

    public final void a(String s)
    {
        f.g(a).f(s);
    }

    public final void b()
    {
        f.g(a).a();
        a.a(0L);
        com.google.android.apps.youtube.app.ax ax = f.k(a);
        ax.bp();
        ax.bd().a(ax.bn(), ax.bo());
        ax.bj().a(ax.bn(), ax.bo());
    }

    public final void b(String s)
    {
        synchronized (f.h(a))
        {
            f.h(a).remove(s);
        }
        com.google.android.apps.youtube.app.offline.a.af.b(f.d(a), s);
        f.g(a).h(s);
    }

    public final void c(String s)
    {
        f.g(a).c(s);
    }

    public final void d(String s)
    {
        a.r(com.google.android.apps.youtube.app.offline.a.f.a(a, s));
        a.r(com.google.android.apps.youtube.app.offline.a.f.b(a, s));
        (new b(new com.google.android.exoplayer.upstream.cache.a[] {
            f.i(a), com.google.android.apps.youtube.app.offline.a.f.j(a)
        })).a(s);
    }
}
