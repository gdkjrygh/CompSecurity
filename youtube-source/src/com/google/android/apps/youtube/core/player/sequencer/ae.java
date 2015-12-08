// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.os.Handler;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.event.r;
import com.google.android.apps.youtube.core.player.event.v;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.fetcher.e;
import com.google.android.apps.youtube.core.player.state.WatchNextVideoIdsSequencerState;
import com.google.android.apps.youtube.datalib.a.k;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            s, ag, aj, ah, 
//            af, r

public final class ae extends s
{

    private final e r;
    private final Executor s;
    private k t;

    public ae(com.google.android.apps.youtube.core.player.sequencer.r r1, a a1, ad ad, Analytics analytics, Executor executor, PlayerFetcher playerfetcher, e e1, 
            aw aw, WatchNextVideoIdsSequencerState watchnextvideoidssequencerstate)
    {
        super(r1, a1, ad, analytics, playerfetcher, aw, watchnextvideoidssequencerstate);
        i = watchnextvideoidssequencerstate.currentWatchNextResponse;
        r = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        s = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        if (i != null)
        {
            a(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED);
        }
        i();
    }

    public ae(com.google.android.apps.youtube.core.player.sequencer.r r1, a a1, ad ad, Analytics analytics, Executor executor, PlayerFetcher playerfetcher, e e1, 
            aw aw, List list, int i, byte abyte0[], String s1)
    {
        super(r1, a1, ad, analytics, playerfetcher, aw, list, i, abyte0, s1);
        r = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        s = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        i();
    }

    static k a(ae ae1)
    {
        return ae1.t;
    }

    static void a(ae ae1, Handler handler, k k1)
    {
        try
        {
            handler.post(new ag(ae1, (WatchNextResponse)k1.get()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            handler.post(new aj(ae1, k1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            handler.post(new aj(ae1, k1));
        }
    }

    static Executor b(ae ae1)
    {
        return ae1.s;
    }

    public final void a()
    {
        if (o != null)
        {
            o.a();
            o = null;
        }
        if (t != null)
        {
            t.cancel(false);
        }
        if (i != null)
        {
            g = PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED;
        } else
        {
            if (h != null)
            {
                g = PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED;
                return;
            }
            if (g != PlaybackSequencer.SequencerStage.NEW)
            {
                a(PlaybackSequencer.SequencerStage.NEW);
                return;
            }
        }
    }

    protected final boolean b()
    {
        return true;
    }

    protected final void c(int i)
    {
        q = Math.min(l.length - 1, i);
        q = Math.max(0, i);
        if (i < l.length && i >= 0)
        {
            c.c(new r());
            o = d.a(new ah(this, (byte)0));
            a.a(l[i], m, n, "", -1, -1, o);
            t = k.a();
            r.a(l[i], "", -1, "", m, t);
            a(PlaybackSequencer.SequencerStage.VIDEO_LOADING);
        } else
        if (l.length == 0)
        {
            p = q;
            a(PlaybackSequencer.SequencerStage.SEQUENCE_EMPTY);
            return;
        }
    }

    protected final void g()
    {
        WatchNextResponse watchnextresponse = null;
        com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair playbackpair;
        if (g.isIn(new PlaybackSequencer.SequencerStage[] {
    PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED, PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED
}))
        {
            playbackpair = h;
        } else
        {
            playbackpair = null;
        }
        if (g == PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED)
        {
            watchnextresponse = i;
        }
        c.c(new v(g, playbackpair, watchnextresponse));
    }

    public final boolean p_()
    {
        boolean flag = false;
        if (g == PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED)
        {
            c.c(new r());
            if (t != null)
            {
                t.cancel(false);
            }
            t = k.a();
            r.a(l[p], "", -1, "", m, t);
            Handler handler = new Handler();
            s.execute(new af(this, handler));
            flag = true;
        }
        return flag;
    }

    public final PlaybackSequencer.SequencerState r()
    {
        return new WatchNextVideoIdsSequencerState(l, m, n, p, q, h, i, j);
    }
}
