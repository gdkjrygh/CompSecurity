// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.ScriptedPlaybackEvent;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.af;
import com.google.android.apps.youtube.core.player.event.j;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.fetcher.e;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer;
import com.google.android.apps.youtube.core.player.sequencer.h;
import com.google.android.apps.youtube.core.player.sequencer.s;
import com.google.android.apps.youtube.core.player.sequencer.u;
import com.google.android.apps.youtube.core.player.state.GDataPlaylistSequencerState;
import com.google.android.apps.youtube.core.player.state.OfflineSequencerState;
import com.google.android.apps.youtube.core.player.state.VideoIdsSequencerState;
import com.google.android.apps.youtube.core.player.state.WatchNextSequencerState;
import com.google.android.apps.youtube.core.player.state.WatchNextVideoIdsSequencerState;
import com.google.android.apps.youtube.datalib.offline.n;
import com.google.android.apps.youtube.medialib.player.ab;
import com.google.android.apps.youtube.medialib.player.x;
import com.google.android.apps.youtube.medialib.player.y;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            af, ag, ah, ad, 
//            Director, ai, BackgroundPlayerService, PlaybackServiceState, 
//            w, PlaybackClientManager, au

public final class ae
{

    private boolean A;
    private boolean B;
    private final Runnable C;
    private final Runnable D;
    private final Context a;
    private final a b;
    private final Director c;
    private final x d;
    private final PlayerFetcher e;
    private final e f;
    private final bc g;
    private final l h;
    private final n i;
    private final q j;
    private final Analytics k;
    private final aw l;
    private final au m;
    private final Executor n;
    private final SparseArray o;
    private final ai p;
    private final AudioManager q;
    private final android.media.AudioManager.OnAudioFocusChangeListener r;
    private final Handler s;
    private final ad t;
    private int u;
    private PlaybackStartDescriptor v;
    private PlaybackSequencer w;
    private int x;
    private int y;
    private boolean z;

    protected ae()
    {
        C = new com.google.android.apps.youtube.core.player.af(this);
        D = new ag(this);
        a = null;
        b = null;
        d = null;
        e = null;
        g = null;
        l = null;
        k = null;
        n = null;
        m = null;
        q = null;
        r = null;
        B = true;
        t = null;
        h = null;
        j = null;
        s = null;
        c = null;
        i = null;
        p = null;
        o = null;
        f = null;
    }

    public ae(Context context, a a1, x x1, PlayerFetcher playerfetcher, e e1, bc bc1, com.google.android.apps.youtube.core.client.e e2, 
            aw aw1, au au1, Analytics analytics, Executor executor, l l1, com.google.android.apps.youtube.common.network.h h1, n n1, 
            q q1, w w1, SharedPreferences sharedpreferences, PlaybackClientManager playbackclientmanager, ad ad1, com.google.android.apps.youtube.datalib.innertube.model.media.j j1)
    {
        C = new com.google.android.apps.youtube.core.player.af(this);
        D = new ag(this);
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (x)com.google.android.apps.youtube.common.fromguava.c.a(x1);
        e = (PlayerFetcher)com.google.android.apps.youtube.common.fromguava.c.a(playerfetcher);
        g = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        com.google.android.apps.youtube.common.fromguava.c.a(e2);
        l = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        k = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        n = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        m = (au)com.google.android.apps.youtube.common.fromguava.c.a(au1);
        com.google.android.apps.youtube.common.fromguava.c.a(h1);
        com.google.android.apps.youtube.common.fromguava.c.a(w1);
        q = (AudioManager)a.getSystemService("audio");
        r = new ah(this, (byte)0);
        B = true;
        com.google.android.apps.youtube.common.fromguava.c.a(playbackclientmanager);
        t = (ad)com.google.android.apps.youtube.common.fromguava.c.a(ad1);
        h = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        j = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        i = n1;
        f = e1;
        c = new Director(x1, a, a1, sharedpreferences, e2, playbackclientmanager, ad1, w1, analytics, aw1, h1, j1);
        o = new SparseArray();
        p = new ai(this, (byte)0);
        s = new Handler(context.getMainLooper());
        u = -1;
    }

    private void H()
    {
        k();
        d.k();
        v = null;
        if (w != null)
        {
            w.k();
            w = null;
        }
        x = 0;
        y = 0;
    }

    private void I()
    {
        c.a(v.getWatchFeature(), v.shouldStartPaused(), x);
        w.l();
    }

    private void J()
    {
        if (c.u() || z)
        {
            Intent intent = new Intent(a, com/google/android/apps/youtube/core/player/BackgroundPlayerService);
            intent.putExtra("background_mode", c.u());
            a.startService(intent);
            z = true;
        }
    }

    private void K()
    {
        if (B)
        {
            q.requestAudioFocus(r, 0x80000000, 1);
        }
    }

    private OfflineStoreInterface L()
    {
        if (!h.b())
        {
            return j.a();
        } else
        {
            return j.a(h.c());
        }
    }

    static Director a(ae ae1)
    {
        return ae1.c;
    }

    static boolean a(ae ae1, boolean flag)
    {
        ae1.A = flag;
        return flag;
    }

    static PlaybackSequencer b(ae ae1)
    {
        return ae1.w;
    }

    static a c(ae ae1)
    {
        return ae1.b;
    }

    static x d(ae ae1)
    {
        return ae1.d;
    }

    static Context e(ae ae1)
    {
        return ae1.a;
    }

    private void handleVideoStageEvent(ac ac1)
    {
        if (ac1.c() == Director.VideoStage.MEDIA_PLAYING_VIDEO)
        {
            y = 0;
        }
    }

    private void handleVideoStageEvent(af af1)
    {
        if (af1.a() == 2 && !A)
        {
            K();
        }
    }

    public final void A()
    {
        if (!c.u())
        {
            k();
            c.s();
        }
    }

    public final void B()
    {
        if (!c.u())
        {
            o.remove(u);
        }
    }

    public final void C()
    {
        if (w != null)
        {
            w.k();
            w = null;
        }
        c.a(true);
        o.clear();
    }

    public final void D()
    {
        c.o();
    }

    public final void E()
    {
        H();
        c.n();
    }

    public final void F()
    {
        if (d instanceof ab)
        {
            ((ab)d).m();
            return;
        } else
        {
            com.google.android.apps.youtube.common.L.a("The player is not a RemoteControlAwarePlayer. Will not switch to local route mode", new RuntimeException());
            return;
        }
    }

    public final void G()
    {
        if (d instanceof ab)
        {
            ((ab)d).n();
            return;
        } else
        {
            com.google.android.apps.youtube.common.L.a("The player is not a RemoteControlAwarePlayer. Will not switch to remote route mode", new RuntimeException());
            return;
        }
    }

    public final PlaybackClientManager a()
    {
        return c.d();
    }

    public final void a(float f1)
    {
        d.a(f1);
    }

    public final void a(int i1)
    {
        if (u == i1)
        {
            return;
        }
        k();
        if (u != -1)
        {
            PlaybackServiceState playbackservicestate = g(true);
            if (playbackservicestate != null && c.u())
            {
                o.put(u, playbackservicestate);
            } else
            {
                o.remove(u);
            }
        }
        c.n();
        c.f();
        u = i1;
        playbackservicestate = (PlaybackServiceState)o.get(u);
        o.remove(u);
        if (playbackservicestate != null)
        {
            a(playbackservicestate);
            return;
        } else
        {
            v = null;
            w = null;
            return;
        }
    }

    public final void a(PlaybackServiceState playbackservicestate)
    {
        b.a(new j());
        H();
        f(playbackservicestate.manageAudioFocus);
        K();
        v = playbackservicestate.playbackStartDescriptor;
        Object obj = playbackservicestate.sequencerState;
        Class class1 = obj.getClass();
        if (class1 == com/google/android/apps/youtube/core/player/state/WatchNextSequencerState)
        {
            obj = new u(c, b, t, k, n, e, f, l, (WatchNextSequencerState)obj);
        } else
        if (class1 == com/google/android/apps/youtube/core/player/state/OfflineSequencerState)
        {
            obj = new com.google.android.apps.youtube.core.player.sequencer.j(a, c, b, t, k, l, n, f, i, L(), (OfflineSequencerState)obj);
        } else
        if (class1 == com/google/android/apps/youtube/core/player/state/GDataPlaylistSequencerState)
        {
            obj = new h(c, b, t, k, e, l, g, (GDataPlaylistSequencerState)obj);
        } else
        if (class1 == com/google/android/apps/youtube/core/player/state/WatchNextVideoIdsSequencerState)
        {
            obj = new com.google.android.apps.youtube.core.player.sequencer.ae(c, b, t, k, n, e, f, l, (WatchNextVideoIdsSequencerState)obj);
        } else
        if (class1 == com/google/android/apps/youtube/core/player/state/VideoIdsSequencerState)
        {
            obj = new s(c, b, t, k, e, l, (VideoIdsSequencerState)obj);
        } else
        {
            obj = null;
        }
        w = ((PlaybackSequencer) (obj));
        if (w != null)
        {
            playbackservicestate = playbackservicestate.directorState;
            if (playbackservicestate == null)
            {
                I();
            } else
            {
                c.a(playbackservicestate);
                w.l();
            }
            p.a();
        }
        v();
    }

    public final void a(PlaybackStartDescriptor playbackstartdescriptor)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(playbackstartdescriptor);
        b.a(new j());
        K();
        if ((w instanceof u) && w.a(playbackstartdescriptor.getPlaylistId()) || c(playbackstartdescriptor))
        {
            v = playbackstartdescriptor;
            ((u)w).a(playbackstartdescriptor);
        } else
        {
            H();
            v = playbackstartdescriptor;
            com.google.android.apps.youtube.common.fromguava.c.a();
            x = playbackstartdescriptor.getVideoStartTime();
            Object obj;
            if (playbackstartdescriptor.isOffline())
            {
                com.google.android.apps.youtube.common.fromguava.c.a(f);
                obj = new com.google.android.apps.youtube.core.player.sequencer.j(a, c, b, t, k, l, n, f, i, L(), playbackstartdescriptor);
            } else
            if (playbackstartdescriptor.getVideoIds() != null)
            {
                if (playbackstartdescriptor.getVideoIds().size() > 1)
                {
                    k.b("WatchIntentWithMultipleVideoIds");
                }
                x = playbackstartdescriptor.getVideoStartTime();
                if (playbackstartdescriptor.isWatchNextDisabled())
                {
                    obj = new s(c, b, t, k, e, l, playbackstartdescriptor.getVideoIds(), playbackstartdescriptor.getPlaylistIndex(), playbackstartdescriptor.getClickTrackingParams(), playbackstartdescriptor.getPlayerParams());
                } else
                {
                    com.google.android.apps.youtube.common.fromguava.c.a(f);
                    obj = new com.google.android.apps.youtube.core.player.sequencer.ae(c, b, t, k, n, e, f, l, playbackstartdescriptor.getVideoIds(), playbackstartdescriptor.getPlaylistIndex(), playbackstartdescriptor.getClickTrackingParams(), playbackstartdescriptor.getPlayerParams());
                }
            } else
            if (playbackstartdescriptor.isWatchNextDisabled())
            {
                obj = new h(c, b, t, k, e, l, g, playbackstartdescriptor.getPlaylistId(), playbackstartdescriptor.getPlaylistIndex());
            } else
            {
                com.google.android.apps.youtube.common.fromguava.c.a(f);
                obj = new u(c, b, t, k, n, e, f, l, playbackstartdescriptor);
            }
            w = ((PlaybackSequencer) (obj));
            if (playbackstartdescriptor.isScriptedPlay())
            {
                b.c(ScriptedPlaybackEvent.NAVIGATION);
            }
            if (w != null)
            {
                I();
                p.a();
                return;
            }
        }
    }

    public final void a(y y1)
    {
        c.a(y1);
        if (w != null)
        {
            w.q();
        }
        J();
    }

    public final void a(boolean flag)
    {
        w.b(flag);
    }

    public final PlaybackServiceState b(int i1)
    {
        if (u == i1)
        {
            return g(false);
        } else
        {
            return (PlaybackServiceState)o.get(i1);
        }
    }

    public final com.google.android.apps.youtube.core.player.au b()
    {
        return c.c();
    }

    public final void b(boolean flag)
    {
        w.a(flag);
    }

    public final boolean b(PlaybackStartDescriptor playbackstartdescriptor)
    {
        while (playbackstartdescriptor == null || v == null || !TextUtils.isEmpty(playbackstartdescriptor.getVideoId()) && !playbackstartdescriptor.getVideoId().equals(d()) || !TextUtils.isEmpty(playbackstartdescriptor.getPlaylistId()) && playbackstartdescriptor.getPlaylistId().equals(c()) || w != null && w.f() != playbackstartdescriptor.getPlaylistIndex() || playbackstartdescriptor.getVideoIds() != null || v.isInnerTube() != playbackstartdescriptor.isInnerTube() || v.getWatchFeature() != playbackstartdescriptor.getWatchFeature() || v.isOffline() != v.isOffline() || v.shouldContinuePlayback() != playbackstartdescriptor.shouldContinuePlayback()) 
        {
            return false;
        }
        return true;
    }

    public final String c()
    {
        if (w != null)
        {
            return w.s();
        } else
        {
            return null;
        }
    }

    public final void c(int i1)
    {
        c.a(i1);
    }

    public final void c(boolean flag)
    {
        c.d(flag);
    }

    public final boolean c(PlaybackStartDescriptor playbackstartdescriptor)
    {
        return playbackstartdescriptor != null && playbackstartdescriptor.shouldContinuePlayback() && c.a(Director.VideoStage.PLAYBACK_LOADED) && !c.b(Director.VideoStage.ENDED) && (w instanceof u) && TextUtils.equals(playbackstartdescriptor.getVideoId(), c.v());
    }

    public final String d()
    {
        if (v != null)
        {
            return c.v();
        } else
        {
            return null;
        }
    }

    public final void d(int i1)
    {
        c.b(i1);
    }

    public final void d(boolean flag)
    {
        c.c(flag);
    }

    public final int e()
    {
        return c.w();
    }

    public final void e(boolean flag)
    {
        c.b(flag);
    }

    public final int f()
    {
        return c.x();
    }

    public final void f(boolean flag)
    {
        B = flag;
        c.e(flag);
    }

    public final PlaybackServiceState g(boolean flag)
    {
        com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerState sequencerstate = null;
        if (v == null)
        {
            return null;
        }
        if (w != null)
        {
            sequencerstate = w.r();
        }
        return new PlaybackServiceState(v, sequencerstate, c.f(flag), B);
    }

    public final boolean g()
    {
        return c.y();
    }

    public final boolean h()
    {
        return c.i();
    }

    public final void handlePlaybackServiceException(PlaybackServiceException playbackserviceexception)
    {
        playbackserviceexception.recordExceptionInAnalytics(k);
        if (q() && playbackserviceexception.shouldSkipVideo() && y < m.S())
        {
            s.post(D);
            y = y + 1;
        }
    }

    public final void i()
    {
        c.g();
    }

    public final void j()
    {
        c.h();
    }

    public final void k()
    {
        c.k();
        p.b();
        Intent intent = new Intent(a, com/google/android/apps/youtube/core/player/BackgroundPlayerService);
        a.stopService(intent);
        z = false;
    }

    public final void l()
    {
        c.j();
    }

    public final boolean m()
    {
        if (c.a(Director.VideoStage.AD_LOADED))
        {
            c.g();
            return true;
        } else
        {
            return n();
        }
    }

    public final boolean n()
    {
        boolean flag = false;
        if (w != null)
        {
            c.a(false, c.w());
            w.p();
            flag = true;
        }
        return flag;
    }

    public final boolean o()
    {
        if (w == null)
        {
            return false;
        } else
        {
            return w.p_();
        }
    }

    public final boolean p()
    {
        return w != null && w.r_();
    }

    public final boolean q()
    {
        return w != null && w.q_();
    }

    public final void r()
    {
        if (w != null)
        {
            w.n();
        }
    }

    public final void s()
    {
        if (w != null)
        {
            w.m();
        }
    }

    public final void t()
    {
        c.r();
    }

    public final void u()
    {
        if (w != null)
        {
            w.o();
        }
    }

    public final void v()
    {
        s.post(C);
    }

    public final boolean w()
    {
        return c.u();
    }

    public final void x()
    {
        if (c.y())
        {
            K();
        }
        c.t();
        if (w != null)
        {
            w.q();
        }
        J();
    }

    public final void y()
    {
        c.q();
    }

    public final void z()
    {
        c.p();
    }
}
