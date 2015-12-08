// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.ui.presenter.bz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.r;
import com.google.android.apps.youtube.core.player.event.u;
import com.google.android.apps.youtube.core.player.event.v;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.innertube.model.ac;
import com.google.android.apps.youtube.datalib.innertube.model.ad;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.o;
import com.google.android.youtube.p;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fk, bv, cl, dm, 
//            v, dg, dh, di, 
//            dj, dk, RemoteControlContextualMenuController, dl, 
//            LikeAction, fh, de, dn

public final class df
    implements fk
{

    private final ae a;
    private final PagedListView b;
    private final FrameLayout c;
    private final TextView d;
    private final ImageView e;
    private final ImageView f;
    private final h g = new h();
    private fh h;
    private final Resources i;
    private final Analytics j;
    private final dn k;
    private final com.google.android.apps.youtube.app.ui.v l;
    private final dm m;
    private final dm n;
    private final dm o;
    private final cl p;
    private final f q;

    public df(WatchWhileActivity watchwhileactivity, dn dn, RemoteControlContextualMenuController remotecontrolcontextualmenucontroller, AtomicReference atomicreference)
    {
        ax ax1 = ((YouTubeApplication)watchwhileactivity.getApplication()).d();
        a = (ae)com.google.android.apps.youtube.common.fromguava.c.a(ax1.ac());
        i = watchwhileactivity.getResources();
        j = watchwhileactivity.P();
        k = dn;
        dn = ax1.Z();
        q = new f(watchwhileactivity, ax1.aT(), ax1.q(), ax1.bk(), ax1.aO(), ax1.aX(), dn, new bv(watchwhileactivity, dn));
        p = new cl(watchwhileactivity, j, ax1.aT(), ax1.bk(), ax1.x(), ax1.aO(), ax1.bf());
        m = new dm(this, p.cC);
        n = new dm(this, p.cG);
        o = new dm(this, p.cz);
        l = new com.google.android.apps.youtube.app.ui.v(watchwhileactivity);
        l.a(p.cD, new dg(this));
        l.a(m, new dh(this));
        l.a(n, new di(this));
        if (com.google.android.apps.youtube.core.utils.p.a(watchwhileactivity))
        {
            l.a(o, new dj(this));
        }
        dn = watchwhileactivity.getLayoutInflater();
        b = (PagedListView)dn.inflate(l.be, null);
        c = (FrameLayout)dn.inflate(l.bd, b, false);
        b.a(c);
        b.b(dn.inflate(l.bc, null));
        d = (TextView)c.findViewById(j.eC);
        dn = new dk(this);
        e = (ImageView)c.findViewById(j.eE);
        e.setOnClickListener(dn);
        f = (ImageView)c.findViewById(j.eF);
        f.setOnClickListener(dn);
        watchwhileactivity = new bz(watchwhileactivity, ax1.aw(), watchwhileactivity.q(), atomicreference, watchwhileactivity, g, (RemoteControlContextualMenuController)com.google.android.apps.youtube.common.fromguava.c.a(remotecontrolcontextualmenucontroller));
        g.a(com/google/android/apps/youtube/datalib/innertube/model/ad, watchwhileactivity);
        b.setAdapter(g);
    }

    static Analytics a(df df1)
    {
        return df1.j;
    }

    private void a(LikeAction likeaction)
    {
        switch (com.google.android.apps.youtube.app.ui.dl.c[likeaction.ordinal()])
        {
        default:
            m.a(true);
            n.a(false);
            return;

        case 2: // '\002'
            m.a(false);
            break;
        }
        n.a(true);
    }

    static cl b(df df1)
    {
        return df1.p;
    }

    static f c(df df1)
    {
        return df1.q;
    }

    private void c()
    {
        if (h != null)
        {
            h.a(false);
            e.setSelected(false);
            e.setVisibility(8);
            f.setSelected(false);
            f.setVisibility(8);
            h.c();
            g.b();
            b.setVisibility(0);
            b.e();
            c.setVisibility(8);
            d.setText(null);
        }
    }

    static ImageView d(df df1)
    {
        return df1.e;
    }

    static dn e(df df1)
    {
        return df1.k;
    }

    static ImageView f(df df1)
    {
        return df1.f;
    }

    static Resources g(df df1)
    {
        return df1.i;
    }

    private void handlePlaybackServiceException(PlaybackServiceException playbackserviceexception)
    {
        switch (dl.b[playbackserviceexception.reason.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c();
            break;
        }
    }

    private void handlePlaylistLikeActionEvent(de de1)
    {
        if (de1.a().equals(a.c()))
        {
            de1 = de1.b();
            if (de1 == LikeAction.LIKE)
            {
                a(LikeAction.REMOVE_LIKE);
            } else
            if (de1 == LikeAction.REMOVE_LIKE)
            {
                a(LikeAction.LIKE);
                return;
            }
        }
    }

    private void handleRequestingWatchDataEvent(r r)
    {
        c();
    }

    private void handleSequencerHasPreviousNextEvent(u u1)
    {
        e.setSelected(u1.c());
        f.setSelected(u1.d());
    }

    private void handleSequencerStageEvent(v v1)
    {
        boolean flag = false;
        dl.a[v1.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 42;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        c();
        return;
_L3:
        v1 = v1.c();
        if (h == null) goto _L1; else goto _L4
_L4:
        ac ac1 = v1.getPlaylistPanel();
        if (ac1 == null)
        {
            h.a(false);
            return;
        }
        h.a(true);
        h.a(l, ac1);
        h.a(ac1.d());
        h.b(ac1.e());
        ImageView imageview;
        if (ac1.g())
        {
            o.a(false);
            c.setVisibility(8);
            if (h != null)
            {
                h.c(null);
                h.a();
            }
        } else
        {
            i1 = ac1.c();
            int j1 = ac1.f();
            o.a(true);
            c.setVisibility(0);
            d.setText(i.getQuantityString(o.l, j1, new Object[] {
                Integer.valueOf(j1)
            }));
            if (h != null)
            {
                h.b();
                if (i1 >= 0)
                {
                    h.c(i.getString(p.fz, new Object[] {
                        Integer.valueOf(i1 + 1), Integer.valueOf(j1)
                    }));
                }
            }
        }
        if (!ac1.h()) goto _L6; else goto _L5
_L5:
        ac1.i();
        JVM INSTR tableswitch 0 0: default 188
    //                   0 388;
           goto _L7 _L8
_L7:
        a(LikeAction.LIKE);
_L9:
        imageview = e;
        int i1;
        if (v1.isLoopSupported())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        imageview = f;
        if (v1.isShuffleSupported())
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        g.b();
        g.a(ac1.a());
        b.a(ac1.c());
        return;
_L8:
        a(LikeAction.REMOVE_LIKE);
          goto _L9
_L6:
        m.a(false);
        n.a(false);
          goto _L9
    }

    public final void a()
    {
        if (h != null)
        {
            h.b(false);
        }
    }

    public final void a(fh fh1)
    {
        h = (fh)com.google.android.apps.youtube.common.fromguava.c.a(fh1);
        h.a(b);
        h.a(this);
        c();
    }

    public final void b()
    {
        if (h != null)
        {
            h.b(true);
        }
    }
}
