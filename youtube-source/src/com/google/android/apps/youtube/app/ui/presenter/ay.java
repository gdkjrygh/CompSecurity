// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.d.a;
import com.google.android.apps.youtube.app.offline.a.ac;
import com.google.android.apps.youtube.app.offline.a.ae;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.OfflineArrowView;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.hh;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.utils.ag;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.f;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.o;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            az, bg

public final class ay
    implements android.view.View.OnClickListener, g
{

    private ImageView A;
    protected final View a;
    protected final TextView b;
    protected final TextView c;
    protected final TextView d;
    protected final TextView e;
    protected final View f;
    protected final View g;
    protected final ImageView h;
    protected final az i = new az(this, (byte)0);
    protected final OfflineArrowView j;
    protected final View k;
    private final Context l;
    private final Resources m;
    private final h n;
    private final am o;
    private final w p;
    private final hh q;
    private final r r;
    private final OfflineStoreInterface s;
    private final bj t;
    private final p u;
    private final i v;
    private final String w;
    private Video x;
    private int y;
    private v z;

    public ay(Context context, i i1, h h1, am am1, w w1, hh hh1, r r1, 
            OfflineStoreInterface offlinestoreinterface, bj bj1, p p1, String s1, v v1)
    {
        l = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        v = (i)com.google.android.apps.youtube.common.fromguava.c.a(i1);
        m = context.getResources();
        n = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        o = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        p = (w)com.google.android.apps.youtube.common.fromguava.c.a(w1);
        q = (hh)com.google.android.apps.youtube.common.fromguava.c.a(hh1);
        r = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
        s = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        t = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        u = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        w = s1;
        z = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        a = LayoutInflater.from(context).inflate(l.ax, null);
        b = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)a.findViewById(j.fF));
        b.setMaxLines(2);
        c = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)a.findViewById(j.aP));
        d = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)a.findViewById(j.y));
        e = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)a.findViewById(j.aK));
        e.setMaxLines(1);
        f = (View)com.google.android.apps.youtube.common.fromguava.c.a(a.findViewById(j.fB));
        g = (View)com.google.android.apps.youtube.common.fromguava.c.a(f.findViewById(j.fA));
        h = (ImageView)com.google.android.apps.youtube.common.fromguava.c.a((ImageView)g.findViewById(j.fy));
        j = (OfflineArrowView)com.google.android.apps.youtube.common.fromguava.c.a((OfflineArrowView)a.findViewById(j.cQ));
        k = a.findViewById(j.aE);
        i1.a(a);
        i1.a(this);
    }

    static String a(ay ay1)
    {
        return ay1.w;
    }

    private void a(x x1)
    {
        if (A != null)
        {
            A.setVisibility(8);
        }
        if (x.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE)
        {
            return;
        }
        if (x1 == null || x1.t())
        {
            Video video = x;
            h.setAlpha(0.2F);
            b.setTextColor(m.getColor(f.s));
            c.setVisibility(8);
            e.setTypeface(e.getTypeface(), 0);
            e.setTextColor(m.getColor(f.r));
            j.setVisibility(0);
            j.setProgressVisible(false);
            boolean flag;
            if (x1 == null)
            {
                e.setText(com.google.android.youtube.p.dr);
                flag = true;
            } else
            {
                e.setText(x1.a(l));
                flag = x1.u();
            }
            if (flag)
            {
                j.setIcon(com.google.android.youtube.h.aa);
                return;
            } else
            {
                j.setIcon(com.google.android.youtube.h.W);
                return;
            }
        }
        if (x1.v())
        {
            Video video1 = x;
            h.setAlpha(1.0F);
            b.setTextColor(m.getColor(f.r));
            c.setVisibility(0);
            j.setVisibility(8);
            e.setTypeface(e.getTypeface(), 0);
            e.setTextColor(m.getColor(f.s));
            x1 = ag.a(video1.uploadedDate, m);
            TextView textview = e;
            Resources resources = m;
            int i1 = o.a;
            int k1 = (int)video1.viewCount;
            if (x1 == null)
            {
                x1 = "";
            }
            textview.setText(resources.getQuantityString(i1, k1, new Object[] {
                x1, Long.valueOf(video1.viewCount)
            }));
            return;
        }
        Video video2 = x;
        h.setAlpha(0.2F);
        b.setTextColor(m.getColor(f.s));
        c.setVisibility(8);
        j.setVisibility(0);
        int j1 = m.getColor(f.r);
        int l1 = x1.o();
        j.setProgress(l1);
        if (x1.m())
        {
            e.setText(l.getString(com.google.android.youtube.p.dp, new Object[] {
                Integer.valueOf(l1)
            }));
            j.setIcon(com.google.android.youtube.h.X);
            j.setProgressVisible(false);
        } else
        if (!n.a())
        {
            e.setText(com.google.android.youtube.p.dy);
            j.c();
        } else
        if (u.d() && !n.c())
        {
            e.setText(com.google.android.youtube.p.dz);
            j.c();
        } else
        if (x1.l())
        {
            e.setText(l.getString(com.google.android.youtube.p.dx, new Object[] {
                Integer.valueOf(l1)
            }));
            j.c();
        } else
        {
            e.setText(l.getString(com.google.android.youtube.p.df, new Object[] {
                Integer.valueOf(l1)
            }));
            j1 = m.getColor(f.i);
            j.a();
        }
        e.setTypeface(e.getTypeface(), 0);
        e.setTextColor(j1);
    }

    static r b(ay ay1)
    {
        return ay1.r;
    }

    private void handleConnectivityChangedEvent(com.google.android.apps.youtube.common.network.a a1)
    {
        a1 = s.a(x.id);
        if (a1 != null && a1.l())
        {
            a(a1);
        }
    }

    private void handleOfflineVideoCompleteEvent(ac ac1)
    {
        if (x.id.equals(ac1.a.a()))
        {
            a(ac1.a);
        }
    }

    private void handleOfflineVideoStatusUpdateEvent(ae ae1)
    {
        if (x.id.equals(ae1.a.a()))
        {
            a(ae1.a);
        }
    }

    public final View a(com.google.android.apps.youtube.uilib.a.f f1, Object obj)
    {
        obj = (Video)obj;
        Object obj1 = l.getResources();
        ((android.widget.LinearLayout.LayoutParams)f.getLayoutParams()).weight = ((Resources) (obj1)).getInteger(k.g);
        x = ((Video) (obj));
        y = f1.c();
        b.setText(((Video) (obj)).title);
        c.setText(com.google.android.apps.youtube.common.e.m.a(((Video) (obj)).duration, 3));
        d.setText(((Video) (obj)).ownerDisplayName);
        com.google.android.apps.youtube.app.d.a.a(l, t, ((Video) (obj)).hqThumbnailUri, h, i);
        obj1 = ((Video) (obj)).id;
        boolean flag;
        if (((Video) (obj)).state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(s.a(((String) (obj1))));
        } else
        {
            h.setAlpha(1.0F);
            j.setVisibility(8);
            if (A == null)
            {
                A = (ImageView)((ViewStub)g.findViewById(j.fN)).inflate();
            }
            A.setVisibility(0);
            c.setVisibility(8);
            e.setTypeface(e.getTypeface(), 2);
            e.setText(m.getString(((Video) (obj)).state.explanationId));
            e.setMaxLines(2);
            b.setTextColor(m.getColor(f.s));
            e.setTextColor(m.getColor(f.r));
        }
        ad.a(z, k, obj);
        return v.a(f1);
    }

    public final void onClick(View view)
    {
        if (x != null && x.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        s1 = x.id;
        view = s.a(s1);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        if (!view.t())
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = view.a();
        if (view.q())
        {
            view = view.g();
            p.a(view, new bg(this, s1, (byte)0), false);
            return;
        }
        if (view.u())
        {
            r.a(w, s1, null);
            return;
        }
        if (!view.r()) goto _L1; else goto _L3
_L3:
        view = view.f();
        if (view.f())
        {
            q.a();
            return;
        }
        view = view.b().j();
        if (view == null) goto _L1; else goto _L4
_L4:
        q.a(view);
        return;
        if (!view.v()) goto _L1; else goto _L5
_L5:
        if (w == null)
        {
            o.d(s1);
            return;
        } else
        {
            o.a(w, y);
            return;
        }
        r.a(w, s1, null);
        return;
    }
}
