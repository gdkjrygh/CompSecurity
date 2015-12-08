// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.offline.a.q;
import com.google.android.apps.youtube.app.offline.a.r;
import com.google.android.apps.youtube.app.offline.a.t;
import com.google.android.apps.youtube.app.offline.a.u;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.ui.presenter.as;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.innertube.v;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.o;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cl, db, cs, ct, 
//            cu, cv, cx, cw, 
//            cz, da, de, LikeAction

public final class cr
{

    private final YouTubeActivity a;
    private final OfflineStoreInterface b;
    private final bc c;
    private final bj d;
    private final db e;
    private final ImageView f;
    private final ImageView g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final View l;
    private final ImageView m;
    private final ImageView n;
    private final ImageView o;
    private final as p;
    private final cl q;
    private final f r;
    private String s;
    private Uri t;
    private Playlist u;
    private Playlist v;
    private boolean w;
    private boolean x;

    public cr(YouTubeActivity youtubeactivity, OfflineStoreInterface offlinestoreinterface, v v1, bc bc1, bj bj1, cl cl1, f f1, 
            int i1, ViewGroup viewgroup, db db1)
    {
        a = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        b = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        com.google.android.apps.youtube.common.fromguava.c.a(v1);
        c = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        d = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        q = (cl)com.google.android.apps.youtube.common.fromguava.c.a(cl1);
        r = f1;
        com.google.android.apps.youtube.common.fromguava.c.a(viewgroup);
        e = (db)com.google.android.apps.youtube.common.fromguava.c.a(db1);
        f = (ImageView)viewgroup.findViewById(j.dE);
        h = viewgroup.findViewById(j.fA);
        g = (ImageView)h.findViewById(j.fy);
        i = (TextView)viewgroup.findViewById(j.dH);
        j = (TextView)viewgroup.findViewById(j.dD);
        k = (TextView)viewgroup.findViewById(j.dG);
        l = viewgroup.findViewById(j.dm);
        m = (ImageView)viewgroup.findViewById(j.bK);
        n = (ImageView)viewgroup.findViewById(j.ce);
        o = (ImageView)viewgroup.findViewById(j.eI);
        l.setOnClickListener(new cs(this));
        m.setOnClickListener(new ct(this));
        n.setOnClickListener(new cu(this));
        o.setOnClickListener(new cv(this));
        a(false);
        n.setEnabled(false);
        o.setEnabled(false);
        if (com.google.android.apps.youtube.core.utils.p.a(a))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(r);
            p = new as(viewgroup, new cx(this, new cw(this)));
            return;
        } else
        {
            p = null;
            return;
        }
    }

    static Uri a(cr cr1, Uri uri)
    {
        cr1.t = uri;
        return uri;
    }

    static db a(cr cr1)
    {
        return cr1.e;
    }

    static Playlist a(cr cr1, Playlist playlist)
    {
        cr1.v = playlist;
        return playlist;
    }

    private void a(Playlist playlist)
    {
        u = playlist;
        i.setText(playlist.title);
        j.setText(playlist.author);
        k.setText(a.getResources().getQuantityString(o.j, playlist.size, new Object[] {
            Integer.valueOf(playlist.size)
        }));
        if (playlist.hqThumbnailUri != null)
        {
            playlist = playlist.hqThumbnailUri;
        } else
        {
            playlist = playlist.thumbnailUri;
        }
        if (playlist != null)
        {
            d.a(playlist, com.google.android.apps.youtube.common.a.a.a(a, new cz(this, a, g)));
        }
        n.setEnabled(true);
        o.setEnabled(true);
    }

    private void a(s s1)
    {
        if (p == null)
        {
            return;
        } else
        {
            p.a(s1);
            return;
        }
    }

    private void a(boolean flag)
    {
        x = flag;
        ImageView imageview = n;
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

    static Playlist b(cr cr1)
    {
        return cr1.u;
    }

    static void b(cr cr1, Playlist playlist)
    {
        cr1.a(playlist);
    }

    static YouTubeActivity c(cr cr1)
    {
        return cr1.a;
    }

    static Playlist d(cr cr1)
    {
        return cr1.v;
    }

    static boolean e(cr cr1)
    {
        return cr1.x;
    }

    static String f(cr cr1)
    {
        return cr1.s;
    }

    static cl g(cr cr1)
    {
        return cr1.q;
    }

    static as h(cr cr1)
    {
        return cr1.p;
    }

    static OfflineStoreInterface i(cr cr1)
    {
        return cr1.b;
    }

    static f j(cr cr1)
    {
        return cr1.r;
    }

    static Uri k(cr cr1)
    {
        return cr1.t;
    }

    static ImageView l(cr cr1)
    {
        return cr1.n;
    }

    static boolean m(cr cr1)
    {
        return cr1.w;
    }

    static ImageView n(cr cr1)
    {
        return cr1.f;
    }

    static View o(cr cr1)
    {
        return cr1.h;
    }

    public final void a(String s1)
    {
        s = s1;
        w = true;
        Object obj = b.b(s1);
        a(((s) (obj)).b());
        a(((s) (obj)));
        obj = com.google.android.apps.youtube.common.a.a.a(a, new da(this, (byte)0));
        c.d(s1, ((com.google.android.apps.youtube.common.a.b) (obj)));
    }

    public final void handleOfflinePlaylistAddEvent(q q1)
    {
        q1 = q1.a;
        if (q1.a().equals(s))
        {
            a(q1);
        }
    }

    public final void handleOfflinePlaylistAddFailedEvent(r r1)
    {
        if (r1.a.equals(s))
        {
            a(((s) (null)));
        }
    }

    public final void handleOfflinePlaylistDeleteEvent(com.google.android.apps.youtube.app.offline.a.s s1)
    {
        if (s1.a.equals(s))
        {
            a(((s) (null)));
        }
    }

    public final void handleOfflinePlaylistProgressEvent(t t1)
    {
        t1 = t1.a;
        if (t1.a().equals(s))
        {
            a(t1);
        }
    }

    public final void handleOfflinePlaylistSyncEvent(u u1)
    {
        u1 = u1.a;
        if (w && u1.a().equals(s))
        {
            a(u1.b());
        }
    }

    public final void handlePlaylistLikeActionEvent(de de1)
    {
        if (u != null && u.id.equals(de1.a()))
        {
            boolean flag;
            if (de1.b() == LikeAction.LIKE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
        }
    }
}
