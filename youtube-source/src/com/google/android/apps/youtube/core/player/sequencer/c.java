// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.SequencerNavigationRequestEvent;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.o;
import com.google.android.apps.youtube.core.player.event.s;
import com.google.android.apps.youtube.core.player.event.u;
import com.google.android.apps.youtube.core.player.event.v;
import com.google.android.apps.youtube.core.player.event.w;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            PlaybackSequencer, r, g, e, 
//            f, d

public abstract class c
    implements PlaybackSequencer
{

    protected final r b;
    protected final a c;
    protected final Analytics d;
    protected final aw e;
    protected final ad f;
    protected volatile PlaybackSequencer.SequencerStage g;
    protected volatile PlaybackPair h;
    protected volatile WatchNextResponse i;
    protected volatile boolean j;
    protected volatile boolean k;

    public c(r r1, a a1, ad ad1, Analytics analytics, aw aw1)
    {
        b = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        e = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        f = ad1;
        c.a(this, com/google/android/apps/youtube/core/player/event/ac, new g(this, (byte)0));
        c.a(this, com/google/android/apps/youtube/core/player/event/PlaybackServiceException, new e(this, (byte)0));
        c.a(this, com/google/android/apps/youtube/core/player/event/w, new f(this, (byte)0));
        c.a(this, com/google/android/apps/youtube/core/player/event/c, new d(this, (byte)0));
        f.a();
        L.e((new StringBuilder("SequencerStage: New ")).append(getClass().getSimpleName()).toString());
    }

    abstract void a(int i1);

    protected final void a(PlaybackServiceException playbackserviceexception)
    {
        a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_ERROR);
        c.c(playbackserviceexception);
    }

    protected final void a(SequencerNavigationRequestEvent sequencernavigationrequestevent)
    {
        if (sequencernavigationrequestevent.isIn(new SequencerNavigationRequestEvent[] {
    SequencerNavigationRequestEvent.NEXT, SequencerNavigationRequestEvent.PREVIOUS, SequencerNavigationRequestEvent.AUTOPLAY
}))
        {
            c.a(new o());
        }
        c.c(sequencernavigationrequestevent);
        d.b(sequencernavigationrequestevent.toString());
    }

    protected void a(PlaybackSequencer.SequencerStage sequencerstage)
    {
        g = sequencerstage;
        L.e((new StringBuilder("SequencerStage: ")).append(sequencerstage.toString()).toString());
        g();
    }

    public final boolean a(String s1)
    {
        return TextUtils.equals(s1, s());
    }

    protected void g()
    {
        PlaybackPair playbackpair;
        WatchNextResponse watchnextresponse;
        if (g.isIn(new PlaybackSequencer.SequencerStage[] {
    PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED, PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED
}))
        {
            playbackpair = (PlaybackPair)com.google.android.apps.youtube.common.fromguava.c.a(h);
        } else
        {
            playbackpair = null;
        }
        if (g == PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED)
        {
            watchnextresponse = (WatchNextResponse)com.google.android.apps.youtube.common.fromguava.c.a(i);
        } else
        {
            watchnextresponse = null;
        }
        c.c(new v(g, playbackpair, watchnextresponse));
    }

    protected final void h()
    {
        c.c(new u(r_(), q_(), j, k));
    }

    protected final void i()
    {
        c.c(new s(s()));
    }

    public final void j()
    {
        g();
        h();
    }

    public final void k()
    {
        a();
        f.b();
        c.b(this);
    }

    public void l()
    {
        a(SequencerNavigationRequestEvent.START);
    }

    public void m()
    {
        a(SequencerNavigationRequestEvent.NEXT);
        b.a(false, 0);
    }

    public void n()
    {
        a(SequencerNavigationRequestEvent.PREVIOUS);
        b.a(false, 0);
    }

    public void o()
    {
        a(SequencerNavigationRequestEvent.AUTOPLAY);
        b.a(false, 0);
    }

    public void p()
    {
        a(SequencerNavigationRequestEvent.RETRY);
    }

    public void q()
    {
    }
}
