// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.os.Handler;
import android.text.TextUtils;
import com.google.a.a.a.a.ag;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.player.Director;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.event.SequencerNavigationRequestEvent;
import com.google.android.apps.youtube.core.player.event.s;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.fetcher.e;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.player.state.WatchNextSequencerState;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            a, y, r, w, 
//            x, v

public final class u extends com.google.android.apps.youtube.core.player.sequencer.a
{

    private final e l;
    private final Handler m;
    private final Executor n;
    private ag o;
    private PlaybackStartDescriptor p;
    private PlaybackStartDescriptor q;
    private volatile y r;

    public u(Director director, a a1, ad ad, Analytics analytics, Executor executor, PlayerFetcher playerfetcher, e e1, 
            aw aw, WatchNextSequencerState watchnextsequencerstate)
    {
        super(director, a1, ad, analytics, aw, playerfetcher);
        com.google.android.apps.youtube.common.fromguava.c.a(watchnextsequencerstate);
        n = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        h = watchnextsequencerstate.currentPlaybackPair;
        i = watchnextsequencerstate.currentWatchNextResponse;
        p = watchnextsequencerstate.currentPlaybackStartDescriptor;
        q = watchnextsequencerstate.pendingPlaybackStartDescriptor;
        k = watchnextsequencerstate.shuffle;
        j = watchnextsequencerstate.loop;
        l = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        m = new Handler();
        a(PlaybackSequencer.SequencerStage.NEW);
        if (h != null)
        {
            a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED);
            if (i != null)
            {
                a(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED);
            }
        }
        q();
        i();
    }

    public u(r r1, a a1, ad ad, Analytics analytics, Executor executor, PlayerFetcher playerfetcher, e e1, 
            aw aw, PlaybackStartDescriptor playbackstartdescriptor)
    {
        super(r1, a1, ad, analytics, aw, playerfetcher);
        n = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        l = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        m = new Handler();
        q = (PlaybackStartDescriptor)com.google.android.apps.youtube.common.fromguava.c.a(playbackstartdescriptor);
        a(PlaybackSequencer.SequencerStage.NEW);
        i();
    }

    static e a(u u1)
    {
        return u1.l;
    }

    static PlaybackStartDescriptor a(u u1, PlaybackStartDescriptor playbackstartdescriptor)
    {
        u1.p = playbackstartdescriptor;
        return playbackstartdescriptor;
    }

    private void a(PlaybackStartDescriptor playbackstartdescriptor, boolean flag)
    {
        if (flag)
        {
            a();
            a(PlaybackSequencer.SequencerStage.VIDEO_LOADING);
        }
        q = (PlaybackStartDescriptor)com.google.android.apps.youtube.common.fromguava.c.a(playbackstartdescriptor);
        if (TextUtils.isEmpty(q.getVideoId()) && TextUtils.isEmpty(q.getPlaylistId()))
        {
            L.c((new StringBuilder("Malformed WatchEndpoint [videoId=")).append(q.getVideoId()).append(",playlistId=").append(q.getPlaylistId()).append(",playlistIndex=").append(q.getPlaylistIndex()).append("]").toString());
            return;
        } else
        {
            r = new y(this, q, flag);
            n.execute(r);
            return;
        }
    }

    static Handler b(u u1)
    {
        return u1.m;
    }

    public final void a()
    {
        super.a();
        if (r == null) goto _L2; else goto _L1
_L1:
        if (!r.a()) goto _L4; else goto _L3
_L3:
        r = null;
_L2:
        if (h == null) goto _L6; else goto _L5
_L5:
        if (i == null) goto _L8; else goto _L7
_L7:
        g = PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED;
_L4:
        return;
_L8:
        g = PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED;
        return;
_L6:
        if (g == PlaybackSequencer.SequencerStage.VIDEO_LOADING)
        {
            a(PlaybackSequencer.SequencerStage.NEW);
            return;
        }
        if (true) goto _L4; else goto _L9
_L9:
    }

    public final void a(PlaybackStartDescriptor playbackstartdescriptor)
    {
        boolean flag = false;
        com.google.android.apps.youtube.common.fromguava.c.a(playbackstartdescriptor);
        if (a(playbackstartdescriptor.getPlaylistId()))
        {
            a(SequencerNavigationRequestEvent.JUMP);
            b.a(false, 0);
            flag = true;
        }
        c.c(new s(playbackstartdescriptor.getPlaylistId()));
        a(playbackstartdescriptor, flag);
    }

    public final void a(boolean flag)
    {
        k = flag;
        q();
    }

    public final void b(boolean flag)
    {
        j = flag;
        q();
    }

    protected final boolean b()
    {
        return true;
    }

    protected final String c()
    {
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(p);
            return p.getVideoId();
        }
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(h);
            return h.getPlayerResponse().getVideoId();
        } else
        {
            return q.getVideoId();
        }
    }

    protected final int d()
    {
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(p);
            return p.getPlaylistIndex();
        } else
        {
            return q.getPlaylistIndex();
        }
    }

    protected final byte[] e()
    {
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(p);
            return p.getClickTrackingParams();
        } else
        {
            return q.getClickTrackingParams();
        }
    }

    public final int f()
    {
        if (p != null)
        {
            return p.getPlaylistIndex();
        } else
        {
            return -1;
        }
    }

    public final void l()
    {
label0:
        {
            if (q != null)
            {
                super.l();
                if (!g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
                {
                    break label0;
                }
                b.a(h);
            }
            return;
        }
        a(q, true);
    }

    public final void m()
    {
        if ((r == null || !r.a(new w(this, (byte)0))) && o != null && o.d != null && o.d.i != null)
        {
            super.m();
            a(new PlaybackStartDescriptor(o.d, WatchFeature.PLAYLISTS), true);
        }
    }

    public final void n()
    {
        if ((r == null || !r.a(new x(this, (byte)0))) && o != null && o.e != null && o.e.i != null)
        {
            super.n();
            a(new PlaybackStartDescriptor(o.e, WatchFeature.PLAYLISTS), true);
        }
    }

    public final void o()
    {
        if ((r == null || !r.a(new v(this, (byte)0))) && o != null && o.c != null && o.c.i != null)
        {
            super.o();
            a(new PlaybackStartDescriptor(o.c, WatchFeature.PLAYLISTS), true);
        }
    }

    protected final String o_()
    {
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(p);
            return p.getPlayerParams();
        } else
        {
            return q.getPlayerParams();
        }
    }

    public final void p()
    {
        if (q != null)
        {
            super.p();
            a(q, true);
        }
    }

    public final boolean p_()
    {
        if (q == null || g != PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED)
        {
            return false;
        } else
        {
            a(q, false);
            return true;
        }
    }

    public final void q()
    {
        boolean flag2 = true;
        if (i == null) goto _L2; else goto _L1
_L1:
        if (!j) goto _L4; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        if (i != null && i.isLoopSupported())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        flag1 = true;
_L6:
        j = flag1;
        if (!k)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (i != null && i.isShuffleSupported())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        flag1 = flag2;
_L7:
        k = flag1;
        o = i.getAutoplaySet(j, k, b.u());
        h();
_L2:
        return;
_L4:
        flag1 = false;
          goto _L6
        flag1 = false;
          goto _L7
    }

    public final boolean q_()
    {
        return o != null && o.d != null;
    }

    public final PlaybackSequencer.SequencerState r()
    {
        return new WatchNextSequencerState(h, i, p, q, k, j);
    }

    public final boolean r_()
    {
        return o != null && o.e != null;
    }

    public final String s()
    {
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
        {
            com.google.android.apps.youtube.common.fromguava.c.a(p);
            return p.getPlaylistId();
        } else
        {
            return q.getPlaylistId();
        }
    }

    public final boolean s_()
    {
        return o != null && o.c != null;
    }
}
