// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.player.PlaybackServiceState;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.ScriptedPlaybackEvent;
import com.google.android.apps.youtube.core.player.event.SequencerNavigationRequestEvent;
import com.google.android.apps.youtube.core.player.event.aa;
import com.google.android.apps.youtube.core.player.event.ab;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.t;
import com.google.android.apps.youtube.core.player.event.v;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;
import com.google.android.apps.youtube.core.player.overlay.ak;
import com.google.android.apps.youtube.core.player.overlay.am;
import com.google.android.apps.youtube.core.player.overlay.az;
import com.google.android.apps.youtube.core.player.overlay.be;
import com.google.android.apps.youtube.core.player.overlay.bf;
import com.google.android.apps.youtube.core.player.overlay.bm;
import com.google.android.apps.youtube.core.player.overlay.bo;
import com.google.android.apps.youtube.core.player.overlay.br;
import com.google.android.apps.youtube.core.player.overlay.bs;
import com.google.android.apps.youtube.core.player.overlay.g;
import com.google.android.apps.youtube.core.player.overlay.i;
import com.google.android.apps.youtube.core.player.overlay.q;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.medialib.a;
import com.google.android.apps.youtube.medialib.player.x;
import com.google.android.apps.youtube.medialib.player.y;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api:
//            p, j, q, o

public final class ApiPlayer
{

    private final p a;
    private final j b;
    private final ae c;
    private final com.google.android.apps.youtube.common.c.a d;
    private final x e;
    private final ControlsOverlay f;
    private final com.google.android.apps.youtube.core.player.overlay.c g;
    private final bo h;
    private final i i;
    private final q j;
    private final am k;
    private final az l;
    private final bs m;
    private final com.google.android.apps.youtube.api.q n = new com.google.android.apps.youtube.api.q(this, (byte)0);
    private final PlayerFetcher o;
    private final bf p;
    private final Handler q;
    private State r;
    private boolean s;
    private boolean t;

    public ApiPlayer(Context context, p p1, j j1, com.google.android.apps.youtube.core.player.am am1, y y, com.google.android.apps.youtube.core.player.overlay.a a1, bm bm, 
            g g1, ControlsOverlay controlsoverlay, ak ak, be be, br br)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(y);
        a = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        b = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        com.google.android.apps.youtube.common.fromguava.c.a(am1);
        com.google.android.apps.youtube.common.fromguava.c.a(a1);
        f = (ControlsOverlay)com.google.android.apps.youtube.common.fromguava.c.a(controlsoverlay);
        com.google.android.apps.youtube.common.fromguava.c.a(ak);
        com.google.android.apps.youtube.common.fromguava.c.a(be);
        com.google.android.apps.youtube.common.fromguava.c.a(br);
        d = j1.e();
        e = j1.j().a(context);
        e.a(y);
        q = new Handler(context.getMainLooper());
        r = State.UNINITIALIZED;
        o = j1.t();
        p1 = j1.f();
        y = j1.h();
        com.google.android.apps.youtube.core.player.PlaybackClientManager playbackclientmanager = j1.a();
        com.google.android.apps.youtube.core.Analytics analytics = j1.k();
        com.google.android.apps.youtube.core.navigation.a a2 = new com.google.android.apps.youtube.core.navigation.a(context);
        android.content.SharedPreferences sharedpreferences = j1.n();
        c = new ae(context, d, e, o, null, p1, j1.g(), j1.m(), j1.l(), analytics, j1.c(), com.google.android.apps.youtube.core.identity.l.a(), j1.o(), j1.p(), j1.q(), j1.r(), sharedpreferences, playbackclientmanager, j1.s(), j1.d());
        g = new com.google.android.apps.youtube.core.player.overlay.c(a1, context, c, p1, y, analytics, a2);
        h = new bo(playbackclientmanager, bm, j1.b(), c.b(), am1);
        i = new i(context, g1, y, a2, am1, c, null, null);
        j = new q(c, d, controlsoverlay);
        k = new am(ak, c);
        p = new bf(be, j1.i(), j, analytics, sharedpreferences, context, j1.e());
        l = new az(am1, controlsoverlay);
        m = new bs(br, y, true);
        e.a(n);
        s();
    }

    static State a(ApiPlayer apiplayer)
    {
        return apiplayer.r;
    }

    private void a(State state)
    {
        boolean flag;
        if (r != State.DESTROYED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "Can not leave the DESTROYED state");
        r = state;
    }

    static void b(ApiPlayer apiplayer)
    {
        apiplayer.s = true;
    }

    static ae c(ApiPlayer apiplayer)
    {
        return apiplayer.c;
    }

    static p d(ApiPlayer apiplayer)
    {
        return apiplayer.a;
    }

    static void e(ApiPlayer apiplayer)
    {
        apiplayer.s = false;
    }

    private void handlePlaybackServiceException(PlaybackServiceException playbackserviceexception)
    {
        a(State.UNINITIALIZED);
        switch (com.google.android.apps.youtube.api.o.a[playbackserviceexception.reason.ordinal()])
        {
        default:
            L.b("Unhandled ErrorReason in onError");
            a.a(com.google.android.youtube.player.YouTubePlayer.ErrorReason.UNKNOWN);
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a.a(com.google.android.youtube.player.YouTubePlayer.ErrorReason.NOT_PLAYABLE);
            return;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            if (b.o().a())
            {
                a.a(com.google.android.youtube.player.YouTubePlayer.ErrorReason.INTERNAL_ERROR);
                return;
            } else
            {
                a.a(com.google.android.youtube.player.YouTubePlayer.ErrorReason.NETWORK_ERROR);
                return;
            }

        case 8: // '\b'
            a.a(com.google.android.youtube.player.YouTubePlayer.ErrorReason.USER_DECLINED_RESTRICTED_CONTENT);
            return;
        }
    }

    private void handleSequencerEndedEvent(t t1)
    {
        a.c();
        s = false;
    }

    private void handleSequencerNavigationRequestEvent(SequencerNavigationRequestEvent sequencernavigationrequestevent)
    {
        switch (o.b[sequencernavigationrequestevent.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            a.b();
            return;

        case 3: // '\003'
            a.a();
            break;
        }
    }

    private void handleSequencerStageEvent(v v1)
    {
        if (v1.a() == com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage.SEQUENCE_EMPTY)
        {
            a.a(com.google.android.youtube.player.YouTubePlayer.ErrorReason.EMPTY_PLAYLIST);
            s = false;
        }
    }

    private void handleVideoControlsVisibilityEvent(aa aa1)
    {
        if (aa1.a)
        {
            a.j();
            return;
        } else
        {
            a.k();
            return;
        }
    }

    private void handleVideoFullscreenEvent(ab ab1)
    {
        a.a(ab1.a());
    }

    private void handleVideoStageEvent(ac ac1)
    {
        if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.NEW)
        {
            a(State.LOADING);
            a.d();
        } else
        {
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.READY)
            {
                a(State.LOADED);
                a.a(ac1.d().getPlayerResponse().getVideoId(), ac1.d().getPlayerResponse().getTitle(), c.e(), c.f(), c.p(), c.q());
                return;
            }
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.AD_LOADED)
            {
                a(State.LOADED);
                return;
            }
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.MEDIA_AD_PLAY_REQUESTED)
            {
                a.e();
                return;
            }
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.MEDIA_PLAYING_AD)
            {
                a.i();
                return;
            }
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.MEDIA_VIDEO_PLAY_REQUESTED)
            {
                a.f();
                return;
            }
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.ENDED)
            {
                a.g();
                return;
            }
        }
    }

    private void handleVideoTimeEvent(com.google.android.apps.youtube.core.player.event.ae ae1)
    {
        if (!c.h())
        {
            a.b(ae1.a(), ae1.b());
        }
    }

    private boolean r()
    {
        boolean flag = false;
        if (r.equals(State.DESTROYED))
        {
            com.google.android.youtube.player.internal.b.a.a("This YouTubePlayer has been released - ignoring command.", new Object[0]);
            flag = true;
        }
        return flag;
    }

    private void s()
    {
        if (!t)
        {
            com.google.android.apps.youtube.common.c.a a1 = b.e();
            a1.a(this);
            a1.a(b.s());
            a1.a(g);
            a1.a(i);
            a1.a(j);
            a1.a(k);
            a1.a(l);
            a1.a(p);
            a1.a(h);
            a1.a(m);
            t = true;
        }
    }

    private void t()
    {
        com.google.android.apps.youtube.common.c.a a1 = b.e();
        a1.b(this);
        a1.b(b.s());
        a1.b(g);
        a1.b(i);
        a1.b(j);
        a1.b(k);
        a1.b(l);
        a1.b(p);
        a1.b(h);
        a1.b(m);
        t = false;
    }

    public final void a()
    {
        while (r() || r != State.LOADED) 
        {
            return;
        }
        c.i();
    }

    public final void a(int i1)
    {
        while (r() || r != State.LOADED) 
        {
            return;
        }
        c.c(i1);
    }

    public final void a(PlaybackServiceState playbackservicestate)
    {
        c.a(playbackservicestate);
    }

    public final void a(String s1, int i1)
    {
        if (r())
        {
            return;
        } else
        {
            s1 = new PlaybackStartDescriptor(Collections.singletonList(s1), -1, i1, WatchFeature.PLAYER_EMBEDDED);
            s1.setWatchNextDisabled(true);
            s1.setStartPaused(true);
            c.a(s1);
            return;
        }
    }

    public final void a(String s1, int i1, int j1)
    {
        if (r())
        {
            return;
        } else
        {
            s1 = new PlaybackStartDescriptor("", s1, i1, j1, WatchFeature.PLAYER_EMBEDDED);
            s1.setWatchNextDisabled(true);
            s1.setStartPaused(true);
            c.a(s1);
            return;
        }
    }

    public final void a(List list, int i1, int j1)
    {
        if (r())
        {
            return;
        } else
        {
            list = new PlaybackStartDescriptor(list, i1, j1, WatchFeature.PLAYER_EMBEDDED);
            list.setWatchNextDisabled(true);
            list.setStartPaused(true);
            c.a(list);
            return;
        }
    }

    public final void a(boolean flag)
    {
        c.c(flag);
    }

    public final boolean a(int i1, KeyEvent keyevent)
    {
        return f.onKeyDown(i1, keyevent);
    }

    public final void b()
    {
        while (r() || r != State.LOADED) 
        {
            return;
        }
        d.c(ScriptedPlaybackEvent.PLAYER_CONTROL);
        c.i();
    }

    public final void b(int i1)
    {
        while (r() || r != State.LOADED) 
        {
            return;
        }
        c.d(i1);
    }

    public final void b(String s1, int i1)
    {
        if (r())
        {
            return;
        } else
        {
            s1 = new PlaybackStartDescriptor(Collections.singletonList(s1), -1, i1, WatchFeature.PLAYER_EMBEDDED);
            s1.setWatchNextDisabled(true);
            d.c(ScriptedPlaybackEvent.NAVIGATION);
            s1.setScriptedPlay(true);
            c.a(s1);
            return;
        }
    }

    public final void b(String s1, int i1, int j1)
    {
        if (r())
        {
            return;
        } else
        {
            s1 = new PlaybackStartDescriptor("", s1, i1, j1, WatchFeature.PLAYER_EMBEDDED);
            s1.setWatchNextDisabled(true);
            d.c(ScriptedPlaybackEvent.NAVIGATION);
            s1.setScriptedPlay(true);
            c.a(s1);
            return;
        }
    }

    public final void b(List list, int i1, int j1)
    {
        if (r())
        {
            return;
        } else
        {
            list = new PlaybackStartDescriptor(list, i1, j1, WatchFeature.PLAYER_EMBEDDED);
            list.setWatchNextDisabled(true);
            d.c(ScriptedPlaybackEvent.NAVIGATION);
            list.setScriptedPlay(true);
            c.a(list);
            return;
        }
    }

    public final void b(boolean flag)
    {
        c.d(flag);
    }

    public final boolean b(int i1, KeyEvent keyevent)
    {
        return f.onKeyUp(i1, keyevent);
    }

    public final void c()
    {
        while (r() || r != State.LOADED) 
        {
            return;
        }
        c.l();
    }

    public final void c(boolean flag)
    {
        c.f(flag);
    }

    public final boolean d()
    {
        return s;
    }

    public final boolean e()
    {
        if (r == State.LOADED || r == State.LOADING)
        {
            return c.q();
        } else
        {
            return false;
        }
    }

    public final boolean f()
    {
        if (r == State.LOADED || r == State.LOADING)
        {
            return c.p();
        } else
        {
            return false;
        }
    }

    public final void g()
    {
        if (r() || !e())
        {
            if (!r.equals(State.DESTROYED))
            {
                com.google.android.youtube.player.internal.b.a.a("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            }
            return;
        } else
        {
            a(State.LOADING);
            d.c(ScriptedPlaybackEvent.NAVIGATION);
            c.s();
            return;
        }
    }

    public final void h()
    {
        if (r() || !f())
        {
            if (!r.equals(State.DESTROYED))
            {
                com.google.android.youtube.player.internal.b.a.a("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            }
            return;
        } else
        {
            a(State.LOADING);
            d.c(ScriptedPlaybackEvent.NAVIGATION);
            c.r();
            return;
        }
    }

    public final int i()
    {
        if (r == State.LOADED)
        {
            return c.e();
        } else
        {
            return 0;
        }
    }

    public final int j()
    {
        if (r == State.LOADED)
        {
            return c.f();
        } else
        {
            return 0;
        }
    }

    public final void k()
    {
        while (r() || r != State.LOADED) 
        {
            return;
        }
        c.k();
    }

    public final boolean l()
    {
        return c.g();
    }

    public final void m()
    {
        f.e();
    }

    public final void n()
    {
        if (r != State.DESTROYED)
        {
            s = false;
            c.C();
            t();
            e.b(n);
            n.removeCallbacksAndMessages(null);
            q.removeCallbacksAndMessages(null);
            p.a();
            a(State.DESTROYED);
        }
    }

    public final void o()
    {
        if (r != State.DESTROYED)
        {
            s();
            c.v();
        }
    }

    public final void p()
    {
        if (r != State.DESTROYED)
        {
            a.a(c.e());
            t();
            c.A();
        }
    }

    public final PlaybackServiceState q()
    {
        return c.g(false);
    }

    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State DESTROYED;
        public static final State LOADED;
        public static final State LOADING;
        public static final State UNINITIALIZED;

        public static State valueOf(String s1)
        {
            return (State)Enum.valueOf(com/google/android/apps/youtube/api/ApiPlayer$State, s1);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            UNINITIALIZED = new State("UNINITIALIZED", 0);
            LOADING = new State("LOADING", 1);
            LOADED = new State("LOADED", 2);
            DESTROYED = new State("DESTROYED", 3);
            $VALUES = (new State[] {
                UNINITIALIZED, LOADING, LOADED, DESTROYED
            });
        }

        private State(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
