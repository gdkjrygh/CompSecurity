// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.offline.a.q;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.ui.presenter.aw;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.youtube.j;
import java.util.HashSet;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cf, LoadingFrameLayout, cg, ce, 
//            v, cd

public final class cc
{

    private final Activity a;
    private final OfflineStoreInterface b;
    private final f c;
    private final bj d;
    private final a e;
    private final am f;
    private final h g;
    private final p h;
    private final cf i;
    private LoadingFrameLayout j;
    private ListView k;
    private com.google.android.apps.youtube.uilib.a.h l;
    private d m;
    private final HashSet n = new HashSet();

    public cc(Activity activity, OfflineStoreInterface offlinestoreinterface, f f1, bj bj1, a a1, am am1, h h1, 
            p p1, cf cf1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        c = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        d = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        e = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        f = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        g = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        h = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        i = (cf)com.google.android.apps.youtube.common.fromguava.c.a(cf1);
    }

    static OfflineStoreInterface a(cc cc1)
    {
        return cc1.b;
    }

    static f b(cc cc1)
    {
        return cc1.c;
    }

    private void b()
    {
        if (m != null && !m.b())
        {
            m.a();
        }
        j.a();
        m = com.google.android.apps.youtube.common.a.d.a(new cg(this, (byte)0));
        b.b(com.google.android.apps.youtube.common.a.a.a(a, m));
    }

    static com.google.android.apps.youtube.uilib.a.h c(cc cc1)
    {
        return cc1.l;
    }

    static HashSet d(cc cc1)
    {
        return cc1.n;
    }

    static LoadingFrameLayout e(cc cc1)
    {
        return cc1.j;
    }

    static cf f(cc cc1)
    {
        return cc1.i;
    }

    private void handleOfflinePlaylistAddEvent(q q1)
    {
        q1 = q1.a.a();
        if (!n.contains(q1))
        {
            b();
        }
    }

    private void handleOfflinePlaylistDeleteEvent(com.google.android.apps.youtube.app.offline.a.s s1)
    {
        l.a(new ce(this, s1));
        b();
    }

    public final void a()
    {
        b();
    }

    public final void a(View view)
    {
        v v1 = new v(a);
        v1.a(com.google.android.youtube.p.fa, new cd(this));
        j = (LoadingFrameLayout)view.findViewById(j.cm);
        k = (ListView)view.findViewById(j.dI);
        view = new aw(a, d, e, b, g, f, h, v1);
        l = new com.google.android.apps.youtube.uilib.a.h();
        l.a(com/google/android/apps/youtube/datalib/legacy/model/Playlist, view);
        k.setAdapter(l);
    }
}
