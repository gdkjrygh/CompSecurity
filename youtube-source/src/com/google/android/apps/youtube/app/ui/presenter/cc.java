// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.av;
import com.google.android.apps.youtube.datalib.innertube.bc;
import com.google.android.apps.youtube.datalib.innertube.model.af;
import com.google.android.apps.youtube.datalib.innertube.model.ah;
import com.google.android.apps.youtube.datalib.innertube.model.ar;
import com.google.android.apps.youtube.datalib.innertube.model.at;
import com.google.android.apps.youtube.datalib.innertube.model.e;
import com.google.android.apps.youtube.datalib.innertube.model.f;
import com.google.android.apps.youtube.datalib.innertube.model.g;
import com.google.android.apps.youtube.datalib.innertube.model.k;
import com.google.android.apps.youtube.datalib.innertube.model.r;
import com.google.android.apps.youtube.datalib.innertube.model.s;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.apps.youtube.uilib.a.m;
import com.google.android.apps.youtube.uilib.innertube.j;
import com.google.android.apps.youtube.uilib.innertube.o;
import com.google.android.apps.youtube.uilib.innertube.u;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ah, ab, ad, al, 
//            an, ar, da, ap, 
//            cy, bj, cg, aj, 
//            n, af, ci, cp, 
//            cb

public final class cc
    implements j
{

    private com.google.android.apps.youtube.uilib.a.j A;
    private com.google.android.apps.youtube.uilib.a.j B;
    private com.google.android.apps.youtube.uilib.a.j C;
    private com.google.android.apps.youtube.uilib.a.j D;
    private com.google.android.apps.youtube.uilib.a.j E;
    private v F;
    private final YouTubeActivity a;
    private final a b;
    private final com.google.android.apps.youtube.common.c.a c;
    private final bj d;
    private final l e;
    private final as f;
    private final aa g;
    private final com.google.android.apps.youtube.app.ui.a h;
    private final bc i;
    private final av j;
    private final AtomicReference k;
    private final aw l;
    private final RemoteControlContextualMenuController m;
    private com.google.android.apps.youtube.uilib.a.j n;
    private com.google.android.apps.youtube.uilib.a.j o;
    private com.google.android.apps.youtube.uilib.a.j p;
    private com.google.android.apps.youtube.uilib.a.j q;
    private com.google.android.apps.youtube.uilib.a.j r;
    private com.google.android.apps.youtube.uilib.a.j s;
    private com.google.android.apps.youtube.uilib.a.j t;
    private com.google.android.apps.youtube.uilib.a.j u;
    private com.google.android.apps.youtube.uilib.a.j v;
    private com.google.android.apps.youtube.uilib.a.j w;
    private com.google.android.apps.youtube.uilib.a.j x;
    private com.google.android.apps.youtube.uilib.a.j y;
    private com.google.android.apps.youtube.uilib.a.j z;

    public cc(YouTubeActivity youtubeactivity, a a1, com.google.android.apps.youtube.common.c.a a2, bj bj1, l l1, as as1, aa aa1, 
            com.google.android.apps.youtube.app.ui.a a3, bc bc1, av av1, AtomicReference atomicreference, aw aw1, RemoteControlContextualMenuController remotecontrolcontextualmenucontroller)
    {
        a = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (com.google.android.apps.youtube.common.c.a)com.google.android.apps.youtube.common.fromguava.c.a(a2);
        d = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        e = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        f = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1);
        g = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        h = (com.google.android.apps.youtube.app.ui.a)com.google.android.apps.youtube.common.fromguava.c.a(a3);
        i = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        j = (av)com.google.android.apps.youtube.common.fromguava.c.a(av1);
        k = (AtomicReference)com.google.android.apps.youtube.common.fromguava.c.a(atomicreference);
        l = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        m = (RemoteControlContextualMenuController)com.google.android.apps.youtube.common.fromguava.c.a(remotecontrolcontextualmenucontroller);
    }

    private com.google.android.apps.youtube.uilib.a.j a()
    {
        if (w == null)
        {
            w = new com.google.android.apps.youtube.app.ui.presenter.ah(a, d, b, f());
        }
        return w;
    }

    private com.google.android.apps.youtube.uilib.a.j b()
    {
        if (x == null)
        {
            x = new ab(a, d, b);
        }
        return x;
    }

    private com.google.android.apps.youtube.uilib.a.j c()
    {
        if (y == null)
        {
            y = new com.google.android.apps.youtube.app.ui.presenter.ad(a, d, b, ad.c(a));
        }
        return y;
    }

    private com.google.android.apps.youtube.uilib.a.j d()
    {
        if (A == null)
        {
            A = new al(a);
        }
        return A;
    }

    private com.google.android.apps.youtube.uilib.a.j e()
    {
        if (C == null)
        {
            C = new an(a, c);
        }
        return C;
    }

    private v f()
    {
        if (F == null)
        {
            F = ad.c(a, k);
        }
        return F;
    }

    public final void a(h h1)
    {
        if (o == null)
        {
            o = new com.google.android.apps.youtube.app.ui.presenter.ar(a, b);
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/s, o);
        if (p == null)
        {
            p = new da(a, j, e, f, g, i, d, c, l, b);
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/at, p);
        if (u == null)
        {
            u = new ap(a);
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/r, u);
        if (s == null)
        {
            s = new cy(a, d, b, ad.e(a, k));
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/as, s);
        if (t == null)
        {
            t = new com.google.android.apps.youtube.app.ui.presenter.bj(a, d, b, ad.d(a));
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/aa, t);
        if (q == null)
        {
            q = new cg(a, d, b, ad.f(a, k), h);
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/ah, q);
        if (r == null)
        {
            r = new aj(a, h);
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/k, r);
        if (n == null)
        {
            n = new n(a, d, b);
        }
        h1.b(com/google/android/apps/youtube/datalib/innertube/model/a, n);
        b(h1);
    }

    public final void b(h h1)
    {
        m.a(f(), h1);
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/h, a());
        if (B == null)
        {
            B = new com.google.android.apps.youtube.app.ui.presenter.af(a, d, b);
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/g, B);
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/e, b());
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/f, c());
        h1.a(com/google/android/apps/youtube/uilib/innertube/l, d());
        h1.a(com/google/android/apps/youtube/uilib/innertube/o, e());
    }

    public final void c(h h1)
    {
        m.a(f(), h1);
        if (D == null)
        {
            D = new ci(a, d, b);
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/ar, D);
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/h, a());
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/e, b());
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/f, c());
        if (E == null)
        {
            E = new cp(a, b);
        }
        h1.a(com/google/android/apps/youtube/uilib/innertube/u, E);
    }

    public final void d(h h1)
    {
        if (z == null)
        {
            z = new cb(a, d, b, ad.g(a, k));
        }
        h1.a(com/google/android/apps/youtube/datalib/innertube/model/af, z);
        h1.a(com/google/android/apps/youtube/uilib/innertube/l, d());
        h1.a(com/google/android/apps/youtube/uilib/innertube/o, e());
    }

    public final void e(h h1)
    {
        if (v == null)
        {
            v = new com.google.android.apps.youtube.uilib.a.l();
        }
        h1.a(com/google/android/apps/youtube/uilib/a/m, v);
    }
}
