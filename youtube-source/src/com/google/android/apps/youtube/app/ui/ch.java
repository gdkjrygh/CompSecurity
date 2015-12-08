// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.offline.a.aa;
import com.google.android.apps.youtube.app.offline.a.ad;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.presenter.ba;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hh, ci, LoadingFrameLayout, cj

public final class ch
{

    private final Activity a;
    private final OfflineStoreInterface b;
    private final r c;
    private final a d;
    private final am e;
    private final bj f;
    private final h g;
    private final p h;
    private final w i;
    private final ci j;
    private LoadingFrameLayout k;
    private ListView l;
    private com.google.android.apps.youtube.uilib.a.h m;
    private final hh n;
    private d o;

    public ch(Activity activity, am am1, OfflineStoreInterface offlinestoreinterface, r r1, hh hh1, a a1, bj bj1, 
            h h1, p p1, w w1, ci ci1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        e = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        b = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        c = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
        n = (hh)com.google.android.apps.youtube.common.fromguava.c.a(hh1);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        f = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        g = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        h = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        i = (w)com.google.android.apps.youtube.common.fromguava.c.a(w1);
        j = (ci)com.google.android.apps.youtube.common.fromguava.c.a(ci1);
    }

    static com.google.android.apps.youtube.uilib.a.h a(ch ch1)
    {
        return ch1.m;
    }

    static LoadingFrameLayout b(ch ch1)
    {
        return ch1.k;
    }

    private void b()
    {
        if (o != null && !o.b())
        {
            o.a();
        }
        k.a();
        o = com.google.android.apps.youtube.common.a.d.a(new cj(this, (byte)0));
        b.a(com.google.android.apps.youtube.common.a.a.a(a, o));
    }

    static ci c(ch ch1)
    {
        return ch1.j;
    }

    private void handleOfflineVideoAddEvent(aa aa)
    {
        b();
    }

    private void handleOfflineVideoDeleteEvent(ad ad)
    {
        b();
    }

    public final void a()
    {
        b();
    }

    public final void a(View view)
    {
        k = (LoadingFrameLayout)view.findViewById(j.cm);
        l = (ListView)view.findViewById(j.gf);
        view = new ba(a, d, g, e, i, n, c, b, f, h, null);
        m = new com.google.android.apps.youtube.uilib.a.h();
        m.a(com/google/android/apps/youtube/datalib/model/gdata/Video, view);
        l.setAdapter(m);
    }
}
