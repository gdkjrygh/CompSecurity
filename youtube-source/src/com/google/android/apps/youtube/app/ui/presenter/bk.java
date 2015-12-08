// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.offline.a.q;
import com.google.android.apps.youtube.app.offline.a.r;
import com.google.android.apps.youtube.app.offline.a.t;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.ui.LikeAction;
import com.google.android.apps.youtube.app.ui.cl;
import com.google.android.apps.youtube.app.ui.de;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.innertube.model.ab;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.v;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bw, bl, bm, bn, 
//            bo, bp, as, bq, 
//            bs

public final class bk
    implements g
{

    private final YouTubeActivity a;
    private final cl b;
    private final View c;
    private final gr d;
    private final ImageView e;
    private final View f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final View j;
    private final ImageView k;
    private final ImageView l;
    private final ImageView m;
    private final ImageView n;
    private final bw o = new bw(this, (byte)0);
    private final bc p;
    private final OfflineStoreInterface q;
    private final b r;
    private Playlist s;
    private final as t;
    private final f u;
    private ab v;
    private kz w;
    private boolean x;

    public bk(YouTubeActivity youtubeactivity, Analytics analytics, com.google.android.apps.youtube.core.identity.l l1, aa aa1, v v1, aw aw1, a a1, 
            bc bc1, bj bj, com.google.android.apps.youtube.datalib.d.a a2, OfflineStoreInterface offlinestoreinterface, f f1)
    {
        a = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        com.google.android.apps.youtube.common.fromguava.c.a(a2);
        p = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        q = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        u = f1;
        c = LayoutInflater.from(youtubeactivity).inflate(l.aJ, null);
        e = (ImageView)c.findViewById(j.dE);
        f = c.findViewById(j.fA);
        d = new gr(bj, (ImageView)f.findViewById(j.fy));
        g = (TextView)c.findViewById(j.dH);
        h = (TextView)c.findViewById(j.dD);
        i = (TextView)c.findViewById(j.dG);
        j = c.findViewById(j.dm);
        k = (ImageView)c.findViewById(j.bK);
        l = (ImageView)c.findViewById(j.ce);
        m = (ImageView)c.findViewById(j.eI);
        n = (ImageView)c.findViewById(j.dQ);
        b = new cl(youtubeactivity, (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics), (com.google.android.apps.youtube.core.identity.l)com.google.android.apps.youtube.common.fromguava.c.a(l1), (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1), (v)com.google.android.apps.youtube.common.fromguava.c.a(v1), (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1), (a)com.google.android.apps.youtube.common.fromguava.c.a(a1));
        j.setOnClickListener(new bl(this, a2));
        k.setOnClickListener(new bm(this, youtubeactivity));
        l.setOnClickListener(new bn(this));
        m.setOnClickListener(new bo(this));
        if (com.google.android.apps.youtube.core.utils.p.a(youtubeactivity))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(u);
            analytics = new bp(this, youtubeactivity);
            t = new as(c, new bq(this, offlinestoreinterface, analytics));
        } else
        {
            t = null;
        }
        r = com.google.android.apps.youtube.common.a.a.a(youtubeactivity, new bs(this, (byte)0));
        a1.a(this);
    }

    static kz a(bk bk1)
    {
        return bk1.w;
    }

    static Playlist a(bk bk1, Playlist playlist)
    {
        bk1.s = playlist;
        return playlist;
    }

    private void a(s s1)
    {
        if (t == null)
        {
            return;
        } else
        {
            t.a(s1);
            return;
        }
    }

    private void a(boolean flag)
    {
        ImageView imageview = l;
        int i1;
        if (flag)
        {
            i1 = h.ac;
        } else
        {
            i1 = h.ab;
        }
        imageview.setImageResource(i1);
    }

    static ab b(bk bk1)
    {
        return bk1.v;
    }

    static boolean c(bk bk1)
    {
        return bk1.x;
    }

    static cl d(bk bk1)
    {
        return bk1.b;
    }

    static as e(bk bk1)
    {
        return bk1.t;
    }

    static f f(bk bk1)
    {
        return bk1.u;
    }

    static Playlist g(bk bk1)
    {
        return bk1.s;
    }

    static YouTubeActivity h(bk bk1)
    {
        return bk1.a;
    }

    static ImageView i(bk bk1)
    {
        return bk1.e;
    }

    static View j(bk bk1)
    {
        return bk1.f;
    }

    public final View a(ab ab1)
    {
        Object obj = ab1.a();
        if (v == null || !v.a().equals(obj))
        {
            s = null;
            s s1 = q.b(((String) (obj)));
            if (s1 != null)
            {
                p.d(((String) (obj)), r);
            }
            a(s1);
        }
        v = ab1;
        g.setText(v.c());
        h.setText(v.h());
        i.setText(v.f());
        l.setEnabled(v.i());
        x = v.j();
        a(x);
        m.setEnabled(v.k());
        obj = n;
        byte byte0;
        if (ab1.m() == 1)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((ImageView) (obj)).setVisibility(byte0);
        obj = v.d();
        if (((ap) (obj)).a())
        {
            d.a(((ap) (obj)), o);
        }
        w = ab1.b();
        return c;
    }

    public final volatile View a(com.google.android.apps.youtube.uilib.a.f f1, Object obj)
    {
        return a((ab)obj);
    }

    public final void handleOfflinePlaylistAddEvent(q q1)
    {
        q1 = q1.a;
        String s1 = v.a();
        if (q1.a().equals(s1))
        {
            a(q1);
        }
    }

    public final void handleOfflinePlaylistAddFailedEvent(r r1)
    {
        String s1 = v.a();
        if (r1.a.equals(s1))
        {
            a(((s) (null)));
        }
    }

    public final void handleOfflinePlaylistDeleteEvent(com.google.android.apps.youtube.app.offline.a.s s1)
    {
        String s2 = v.a();
        if (s1.a.equals(s2))
        {
            a(((s) (null)));
        }
    }

    public final void handleOfflinePlaylistProgressEvent(t t1)
    {
        t1 = t1.a;
        String s1 = v.a();
        if (t1.a().equals(s1))
        {
            a(t1);
        }
    }

    public final void handlePlaylistLikeAction(de de1)
    {
        boolean flag;
        if (de1.b() == LikeAction.LIKE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x = flag;
        a(x);
    }
}
