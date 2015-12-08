// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.offline.a.ad;
import com.google.android.apps.youtube.app.offline.a.u;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.presenter.ba;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.datalib.innertube.v;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cl, hh, LoadingFrameLayout, cb, 
//            cr, ca

public final class bz
{

    private final Activity a;
    private final bc b;
    private final v c;
    private final OfflineStoreInterface d;
    private final a e;
    private final am f;
    private final bj g;
    private final h h;
    private final p i;
    private final w j;
    private final String k;
    private final cl l;
    private final r m;
    private final f n;
    private final hh o;
    private LoadingFrameLayout p;
    private ListView q;
    private com.google.android.apps.youtube.uilib.a.h r;
    private d s;
    private final Set t = new HashSet();
    private cr u;

    public bz(Activity activity, am am1, bc bc1, v v1, OfflineStoreInterface offlinestoreinterface, a a1, bj bj1, 
            h h1, p p1, w w1, cl cl1, r r1, f f1, hh hh1, 
            String s1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        c = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        f = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        d = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        e = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        g = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        h = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        i = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        j = (w)com.google.android.apps.youtube.common.fromguava.c.a(w1);
        l = (cl)com.google.android.apps.youtube.common.fromguava.c.a(cl1);
        m = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
        n = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        o = (hh)com.google.android.apps.youtube.common.fromguava.c.a(hh1);
        k = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
    }

    static String a(bz bz1)
    {
        return bz1.k;
    }

    static am b(bz bz1)
    {
        return bz1.f;
    }

    static com.google.android.apps.youtube.uilib.a.h c(bz bz1)
    {
        return bz1.r;
    }

    private void c()
    {
        if (s != null && !s.b())
        {
            s.a();
        }
        p.a();
        s = com.google.android.apps.youtube.common.a.d.a(new cb(this, (byte)0));
        d.a(k, com.google.android.apps.youtube.common.a.a.a(a, s));
    }

    static Activity d(bz bz1)
    {
        return bz1.a;
    }

    static LoadingFrameLayout e(bz bz1)
    {
        return bz1.p;
    }

    static Set f(bz bz1)
    {
        return bz1.t;
    }

    private void handleOfflinePlaylistSyncEvent(u u1)
    {
        if (k.equals(u1.a.a()))
        {
            c();
        }
    }

    private void handleOfflineVideoDeleteEvent(ad ad1)
    {
        if (t.contains(ad1.a))
        {
            c();
        }
    }

    public final void a()
    {
        c();
        u.a(k);
        e.a(this);
        e.a(u);
    }

    public final void a(LayoutInflater layoutinflater, View view)
    {
        p = (LoadingFrameLayout)view.findViewById(j.cm);
        q = (ListView)view.findViewById(j.gf);
        layoutinflater = (ViewGroup)layoutinflater.inflate(l.aJ, q, false);
        q.addHeaderView(layoutinflater);
        u = new cr((YouTubeActivity)a, d, c, b, g, l, n, 2, layoutinflater, new ca(this));
        r = new com.google.android.apps.youtube.uilib.a.h();
        r.a(com/google/android/apps/youtube/datalib/model/gdata/Video, new ba(a, e, h, f, j, o, m, d, g, i, k));
        q.setAdapter(r);
    }

    public final void b()
    {
        if (s != null && !s.b())
        {
            s.a();
        }
        s = null;
        e.b(this);
        e.b(u);
    }
}
