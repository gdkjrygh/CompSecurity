// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.os.Handler;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.event.t;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.state.GDataPlaylistSequencerState;
import java.util.Collections;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            s, i, t, r

public final class h extends s
{

    private final af r;
    private final Handler s;
    private final i t;
    private final String u;
    private GDataRequest v;
    private d w;

    public h(r r1, a a1, ad ad, Analytics analytics, PlayerFetcher playerfetcher, aw aw, bc bc1, 
            GDataPlaylistSequencerState gdataplaylistsequencerstate)
    {
        super(r1, a1, ad, analytics, playerfetcher, aw, gdataplaylistsequencerstate);
        com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        r = bc1.c();
        v = gdataplaylistsequencerstate.nextPageRequest;
        u = gdataplaylistsequencerstate.playlistId;
        s = new Handler();
        t = new i(this, (byte)0);
        i();
    }

    public h(r r1, a a1, ad ad, Analytics analytics, PlayerFetcher playerfetcher, aw aw, bc bc1, 
            String s1, int j)
    {
        super(r1, a1, ad, analytics, playerfetcher, aw, Collections.emptyList(), j, PlayerFetcher.a, "");
        com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        u = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        r = bc1.c();
        v = bc1.a().g(s1);
        s = new Handler();
        t = new i(this, (byte)0);
        a(PlaybackSequencer.SequencerStage.NEW);
        i();
    }

    static d a(h h1, d d1)
    {
        h1.w = null;
        return null;
    }

    static GDataRequest a(h h1)
    {
        return h1.v;
    }

    static GDataRequest a(h h1, GDataRequest gdatarequest)
    {
        h1.v = gdatarequest;
        return gdatarequest;
    }

    static void b(h h1)
    {
        h1.u();
    }

    static void c(h h1)
    {
        h1.v();
    }

    private void u()
    {
        w = com.google.android.apps.youtube.common.a.d.a(t);
        r.a(v, com.google.android.apps.youtube.common.a.e.a(s, w));
    }

    private void v()
    {
        boolean flag;
        if (q >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        if (q < l.length)
        {
            o = com.google.android.apps.youtube.common.a.d.a(new com.google.android.apps.youtube.core.player.sequencer.t(this));
            a.a(l[q], PlayerFetcher.a, "", u, q, -1, o);
            return;
        } else
        {
            a(PlaybackSequencer.SequencerStage.SEQUENCE_EMPTY);
            return;
        }
    }

    public final void a()
    {
        super.a();
        if (w != null)
        {
            w.a();
            w = null;
        }
    }

    protected final int b(int j)
    {
        if (r != null)
        {
            int k;
            if (v == null)
            {
                k = l.length - 1;
            } else
            {
                k = 0x7fffffff;
            }
            return Math.max(0, Math.min(j, k));
        } else
        {
            return Math.max(0, j);
        }
    }

    protected final void c(int j)
    {
        q = b(j);
        if (j < 0)
        {
            return;
        }
        a(PlaybackSequencer.SequencerStage.VIDEO_LOADING);
        if (j < l.length)
        {
            v();
            return;
        }
        if (v != null)
        {
            u();
            return;
        }
        if (l.length == 0)
        {
            p = q;
            a(PlaybackSequencer.SequencerStage.SEQUENCE_EMPTY);
            return;
        } else
        {
            c.c(new t());
            return;
        }
    }

    protected final int d()
    {
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED))
        {
            return p;
        } else
        {
            return q;
        }
    }

    protected final byte[] e()
    {
        return PlayerFetcher.a;
    }

    public final PlaybackSequencer.SequencerState r()
    {
        return new GDataPlaylistSequencerState(l, m, n, p, q, h, v, u, j);
    }

    public final String s()
    {
        return u;
    }

    protected final boolean t()
    {
        return p >= l.length - 1 && v == null;
    }
}
