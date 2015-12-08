// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.state.VideoIdsSequencerState;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            a, t, r

public class s extends com.google.android.apps.youtube.core.player.sequencer.a
{

    protected String l[];
    protected final byte m[];
    protected String n;
    protected d o;
    protected int p;
    protected int q;

    public s(r r1, a a1, ad ad, Analytics analytics, PlayerFetcher playerfetcher, aw aw, VideoIdsSequencerState videoidssequencerstate)
    {
        super(r1, a1, ad, analytics, aw, playerfetcher);
        com.google.android.apps.youtube.common.fromguava.c.a(videoidssequencerstate);
        l = videoidssequencerstate.videoIds;
        m = videoidssequencerstate.clickTrackingParams;
        n = videoidssequencerstate.playerParams;
        p = videoidssequencerstate.index;
        q = videoidssequencerstate.pendingIndex;
        h = videoidssequencerstate.currentPlayerResponse;
        j = videoidssequencerstate.loop;
        if (h != null)
        {
            a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED);
        } else
        {
            a(PlaybackSequencer.SequencerStage.NEW);
        }
        i();
    }

    public s(r r1, a a1, ad ad, Analytics analytics, PlayerFetcher playerfetcher, aw aw, List list, 
            int i, byte abyte0[], String s1)
    {
        super(r1, a1, ad, analytics, aw, playerfetcher);
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        m = (byte[])com.google.android.apps.youtube.common.fromguava.c.a(abyte0);
        n = s1;
        l = (String[])list.toArray(new String[list.size()]);
        i = b(i);
        p = i - 1;
        q = i;
        a(PlaybackSequencer.SequencerStage.NEW);
        i();
    }

    private void u()
    {
        if (j && t())
        {
            c(0);
            return;
        } else
        {
            c(p + 1);
            return;
        }
    }

    public void a()
    {
        super.a();
        if (o != null)
        {
            o.a();
            o = null;
        }
        if (!g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED) || p < 0 || p >= l.length)
        {
            a(PlaybackSequencer.SequencerStage.NEW);
            return;
        } else
        {
            a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED);
            return;
        }
    }

    protected final void a(PlaybackSequencer.SequencerStage sequencerstage)
    {
        super.a(sequencerstage);
        h();
    }

    public final void a(boolean flag)
    {
    }

    protected int b(int i)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(l);
        return Math.max(0, Math.min(l.length - 1, i));
    }

    public final void b(boolean flag)
    {
        j = flag;
        h();
    }

    protected boolean b()
    {
        return false;
    }

    protected final String c()
    {
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED))
        {
            boolean flag;
            if (p >= 0 && p < l.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.b(flag);
            return l[p];
        }
        if (q >= 0 && q < l.length)
        {
            return l[q];
        } else
        {
            return null;
        }
    }

    protected void c(int i)
    {
        q = b(i);
        if (i < l.length && i >= 0)
        {
            o = com.google.android.apps.youtube.common.a.d.a(new t(this));
            a.a(l[i], m, n, "", -1, -1, o);
            a(PlaybackSequencer.SequencerStage.VIDEO_LOADING);
        } else
        if (l.length == 0)
        {
            p = q;
            a(PlaybackSequencer.SequencerStage.SEQUENCE_EMPTY);
            return;
        }
    }

    protected int d()
    {
        return -1;
    }

    protected byte[] e()
    {
        return m;
    }

    public final int f()
    {
        return p;
    }

    public final void l()
    {
        a();
        super.l();
        boolean flag;
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED) || g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED) && !b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b.a(h);
            return;
        } else
        {
            c(q);
            return;
        }
    }

    public final void m()
    {
        a();
        super.m();
        u();
    }

    public final void n()
    {
        a();
        super.n();
        c(p - 1);
    }

    public final void o()
    {
        a();
        super.o();
        u();
    }

    protected final String o_()
    {
        return n;
    }

    public final void p()
    {
        a();
        super.p();
        c(q);
    }

    public boolean p_()
    {
        return false;
    }

    public final boolean q_()
    {
        while (j || !t()) 
        {
            return true;
        }
        return false;
    }

    public PlaybackSequencer.SequencerState r()
    {
        return new VideoIdsSequencerState(l, m, n, p, q, h, j);
    }

    public final boolean r_()
    {
        return p > 0;
    }

    public String s()
    {
        return "";
    }

    public final boolean s_()
    {
        return q_();
    }

    protected boolean t()
    {
        return p >= l.length - 1;
    }
}
