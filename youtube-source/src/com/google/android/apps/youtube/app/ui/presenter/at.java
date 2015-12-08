// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.d.a;
import com.google.android.apps.youtube.app.offline.a.t;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.ui.OfflineArrowView;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.f;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.o;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            av, au

public final class at
    implements g
{

    private final Context a;
    private final Resources b;
    private final bj c;
    private final OfflineStoreInterface d;
    private final h e;
    private final am f;
    private final p g;
    private final v h;
    private final i i;
    private final View j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final View o;
    private final ImageView p;
    private final OfflineArrowView q;
    private final av r = new av(this, (byte)0);
    private final View s;
    private Playlist t;

    public at(Context context, i i1, bj bj1, OfflineStoreInterface offlinestoreinterface, h h1, am am1, p p1, 
            v v1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        i = (i)com.google.android.apps.youtube.common.fromguava.c.a(i1);
        b = context.getResources();
        c = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        d = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        e = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        f = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        g = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        h = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        j = LayoutInflater.from(context).inflate(l.au, null);
        k = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)j.findViewById(j.fF));
        k.setMaxLines(2);
        l = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)j.findViewById(j.da));
        m = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)j.findViewById(j.aK));
        n = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)j.findViewById(j.fW));
        o = (View)com.google.android.apps.youtube.common.fromguava.c.a(j.findViewById(j.fA));
        p = (ImageView)com.google.android.apps.youtube.common.fromguava.c.a((ImageView)o.findViewById(j.fy));
        q = (OfflineArrowView)j.findViewById(j.cQ);
        s = j.findViewById(j.aE);
        i1.a(j);
        i1.a(new au(this));
    }

    static Playlist a(at at1)
    {
        return at1.t;
    }

    private void a(s s1)
    {
        if (s1 != null)
        {
            L.e((new StringBuilder("Updating progress on playlist=")).append(t.id).append(", numFinished=").append(s1.c()).append(", size=").append(s1.d()).append(", isFinished= ").append(s1.e()).toString());
            float f1 = (float)s1.c() / (float)s1.d();
            if (!s1.e())
            {
                int i1;
                boolean flag;
                if (!e.a())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (!e.c() && g.d())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i1 != 0 || flag)
                {
                    s1 = m;
                    if (i1 != 0)
                    {
                        i1 = com.google.android.youtube.p.dy;
                    } else
                    {
                        i1 = com.google.android.youtube.p.dz;
                    }
                    s1.setText(i1);
                    m.setTextColor(b.getColor(f.r));
                    n.setVisibility(8);
                    q.setVisibility(0);
                    q.a();
                    q.setProgress(f1);
                    return;
                }
            }
        }
        m.setText(b.getQuantityString(o.j, t.size, new Object[] {
            Integer.valueOf(t.size)
        }));
        m.setTextColor(b.getColor(f.s));
        n.setVisibility(0);
        q.setVisibility(8);
        q.b();
        q.setProgress(0);
    }

    static am b(at at1)
    {
        return at1.f;
    }

    static View c(at at1)
    {
        return at1.o;
    }

    private void handlePlaylistProgress(t t1)
    {
        t1 = t1.a;
        if (t.id.equals(t1.b().id))
        {
            a(t1);
        }
    }

    public final View a(com.google.android.apps.youtube.uilib.a.f f1, Object obj)
    {
        obj = (Playlist)obj;
        t = ((Playlist) (obj));
        k.setText(((Playlist) (obj)).title);
        l.setText(((Playlist) (obj)).author);
        m.setText(b.getQuantityString(o.j, ((Playlist) (obj)).size, new Object[] {
            Integer.valueOf(((Playlist) (obj)).size)
        }));
        n.setText(Integer.toString(((Playlist) (obj)).size));
        com.google.android.apps.youtube.app.d.a.a(a, c, ((Playlist) (obj)).hqThumbnailUri, p, r);
        ad.a(h, s, obj);
        a(d.b(((Playlist) (obj)).id));
        return i.a(f1);
    }
}
