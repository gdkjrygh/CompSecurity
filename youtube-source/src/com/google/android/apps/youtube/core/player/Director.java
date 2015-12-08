// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.b.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bi;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.ScriptedPlaybackEvent;
import com.google.android.apps.youtube.core.player.event.aa;
import com.google.android.apps.youtube.core.player.event.ab;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.ae;
import com.google.android.apps.youtube.core.player.event.af;
import com.google.android.apps.youtube.core.player.event.i;
import com.google.android.apps.youtube.core.player.event.w;
import com.google.android.apps.youtube.core.player.event.z;
import com.google.android.apps.youtube.core.player.overlay.ControlsState;
import com.google.android.apps.youtube.core.player.sequencer.r;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.innertube.InnerTubeServiceException;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.android.apps.youtube.datalib.innertube.model.media.j;
import com.google.android.apps.youtube.datalib.legacy.model.AdPair;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.medialib.player.x;
import com.google.android.apps.youtube.medialib.player.y;
import com.google.android.gsf.f;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            az, y, PlaybackClientManager, ad, 
//            w, m, VideoInterruptManager, k, 
//            n, l, al, r, 
//            DirectorSavedState, au

public final class Director
    implements bi, az, r, com.google.android.apps.youtube.core.player.y
{

    private d A;
    private boolean B;
    private boolean C;
    private boolean D;
    private PlaybackServiceException E;
    private com.google.android.apps.youtube.core.player.r F;
    private boolean G;
    private PlayerState H;
    private VideoStage I;
    private final com.google.android.apps.youtube.core.player.n J;
    private boolean K;
    private boolean L;
    private final l M;
    private int N;
    private boolean O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private y T;
    private com.google.android.apps.youtube.common.a.b U;
    private final Handler a;
    private final VideoInterruptManager b;
    private final a c;
    private final SharedPreferences d;
    private final x e;
    private final Context f;
    private final Analytics g;
    private final com.google.android.apps.youtube.common.e.b h;
    private final h i;
    private final com.google.android.apps.youtube.core.player.w j;
    private final com.google.android.apps.youtube.core.client.e k;
    private final PlaybackClientManager l;
    private final aw m;
    private WatchFeature n;
    private int o;
    private int p;
    private PlaybackPair q;
    private VastAd r;
    private VmapAdBreak s;
    private int t;
    private boolean u;
    private boolean v;
    private al w;
    private j x;
    private boolean y;
    private final ad z;

    public Director(x x1, Context context, a a1, SharedPreferences sharedpreferences, com.google.android.apps.youtube.core.client.e e1, PlaybackClientManager playbackclientmanager, ad ad1, 
            com.google.android.apps.youtube.core.player.w w1, Analytics analytics, aw aw1, h h1, j j1)
    {
        y = true;
        N = 4;
        e = (x)com.google.android.apps.youtube.common.fromguava.c.a(x1);
        f = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        k = e1;
        l = (PlaybackClientManager)com.google.android.apps.youtube.common.fromguava.c.a(playbackclientmanager);
        z = (ad)com.google.android.apps.youtube.common.fromguava.c.a(ad1);
        j = (com.google.android.apps.youtube.core.player.w)com.google.android.apps.youtube.common.fromguava.c.a(w1);
        g = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        m = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        i = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        x = j1;
        H = PlayerState.NOT_PREPARED;
        c(VideoStage.NEW);
        n = WatchFeature.NO_FEATURE;
        a = new Handler(context.getMainLooper(), new m(this, (byte)0));
        h = new n();
        b = new VideoInterruptManager(new b(), this, analytics, h);
        playbackclientmanager.a(this);
        if (sharedpreferences.getBoolean("default_hq", false)) goto _L2; else goto _L1
_L1:
        if (!h1.h()) goto _L4; else goto _L3
_L3:
        com.google.android.gsf.f.a(context.getContentResolver(), "youtube:device_lowend", 2);
        JVM INSTR tableswitch 0 1: default 284
    //                   0 382
    //                   1 388;
           goto _L5 _L6 _L7
_L5:
        boolean flag = Util.c(context);
_L8:
        if (flag || h1.b()) goto _L4; else goto _L2
_L2:
        int i1 = 1;
_L9:
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        t = i1;
        U = new k(this);
        x1.a(a);
        J = new com.google.android.apps.youtube.core.player.n(this);
        L = true;
        M = new l(this, (byte)0);
        M.a();
        return;
_L6:
        flag = false;
          goto _L8
_L7:
        flag = true;
          goto _L8
_L4:
        i1 = 0;
          goto _L9
    }

    private void A()
    {
        c.c(new af(N));
    }

    private void B()
    {
        c.c(new ab(v, y));
    }

    private void C()
    {
        if (I.isPlayingAd())
        {
            c.c(new ae(p, r.getDuration() * 1000, 0));
            return;
        } else
        {
            c.c(new ae(o, x(), 0));
            return;
        }
    }

    private void D()
    {
        if (a(new VideoStage[] {
    VideoStage.MEDIA_AD_PLAY_REQUESTED, VideoStage.MEDIA_PLAYING_AD, VideoStage.MEDIA_VIDEO_PLAY_REQUESTED, VideoStage.MEDIA_PLAYING_VIDEO, VideoStage.ENDED
}))
        {
            c.c(new ae(P, Q, R));
            return;
        } else
        {
            com.google.android.apps.youtube.common.L.b((new StringBuilder("Media progress reported outside media playback: ")).append(I.name()).toString());
            return;
        }
    }

    private void E()
    {
        ControlsState controlsstate = ControlsState.LOADING;
        boolean flag;
        if (E != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return;
        }
        if (!a(VideoStage.PLAYBACK_LOADED) || H == PlayerState.PREPARING || e.j() && e.i())
        {
            controlsstate = ControlsState.LOADING;
        } else
        if (b(VideoStage.ENDED) && !H())
        {
            controlsstate = ControlsState.ENDED;
        } else
        if ((b(VideoStage.MEDIA_PLAYING_AD) || b(VideoStage.MEDIA_PLAYING_VIDEO)) && e.j())
        {
            controlsstate = ControlsState.PLAYING;
        } else
        if (a(new VideoStage[] {
    VideoStage.READY, VideoStage.AD_LOADED
}) || b(VideoStage.ENDED) && H() || a(new VideoStage[] {
    VideoStage.MEDIA_PLAYING_AD, VideoStage.MEDIA_PLAYING_VIDEO
}) && !e.j())
        {
            controlsstate = ControlsState.PAUSED;
        } else
        if (b(VideoStage.NEW))
        {
            controlsstate = ControlsState.NEW;
        } else
        {
            com.google.android.apps.youtube.common.L.b("Unhandled state in setControlsState.");
        }
        c.c(new z(controlsstate));
    }

    private void F()
    {
        if (w != null)
        {
            c.c(w);
        }
    }

    private void G()
    {
        c.c(new com.google.android.apps.youtube.core.player.event.a(S));
    }

    private boolean H()
    {
        VideoStreamingData videostreamingdata;
        if (q == null)
        {
            videostreamingdata = null;
        } else
        {
            videostreamingdata = q.getPlayerResponse().getVideoStreamingData();
        }
        return videostreamingdata != null && videostreamingdata.isLive();
    }

    private void I()
    {
        c.a(new com.google.android.apps.youtube.core.player.event.f());
        if (r != null)
        {
            c(VideoStage.AD_LOADED);
        }
        J();
    }

    private void J()
    {
        if (!M())
        {
            VideoStage videostage;
            if (D)
            {
                videostage = VideoStage.ENDED;
            } else
            {
                videostage = VideoStage.READY;
            }
            c(videostage);
        }
        if (C)
        {
            C();
            E();
            return;
        } else
        {
            g();
            return;
        }
    }

    private void K()
    {
        C = false;
        if (b(VideoStage.ENDED))
        {
            o = 0;
            c(VideoStage.MEDIA_VIDEO_PLAY_REQUESTED);
        }
        r = null;
        s = null;
        PlayerResponse playerresponse = q.getPlayerResponse();
        l.a(playerresponse, n, z.e(), z.f(), w, z.h());
        if (!a(VideoStage.MEDIA_VIDEO_PLAY_REQUESTED))
        {
            c(VideoStage.MEDIA_VIDEO_PLAY_REQUESTED);
        }
        C();
        if (playerresponse.getVideoStreamingData().isAudioOnly())
        {
            p();
        }
        PlayerConfig playerconfig = playerresponse.getPlayerConfig(L());
        c.a(new com.google.android.apps.youtube.core.player.event.n(playerconfig.isExoPlayerEnabled(), playerconfig.isAdaptiveBitrateEnabled()));
        e.a(t, playerresponse.getVideoStreamingData(), o, l.d(), playerconfig);
    }

    private com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType L()
    {
        com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType exoplayeractivationtype = com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.getDefaultValue(PackageUtil.a(f));
        Object obj = d.getString("ExoPlayer", exoplayeractivationtype.name());
        try
        {
            obj = com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.valueOf(((String) (obj)));
        }
        catch (Exception exception)
        {
            return exoplayeractivationtype;
        }
        return ((com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType) (obj));
    }

    private boolean M()
    {
        return r != null && r.shouldPlayAd(h);
    }

    private void N()
    {
        if (A != null)
        {
            A.a();
            A = null;
        }
    }

    private al O()
    {
        al al1;
        if (S || K)
        {
            al1 = new al(3);
        } else
        if (v)
        {
            al1 = new al(2);
        } else
        if (u)
        {
            al1 = new al(1);
        } else
        {
            al1 = new al(0);
        }
        if (!al1.equals(w))
        {
            w = al1;
            F();
        }
        return w;
    }

    private int P()
    {
        if (I.isPlayingAd())
        {
            return e.f();
        }
        if (M())
        {
            return p;
        } else
        {
            return 0;
        }
    }

    private com.google.android.apps.youtube.core.player.r Q()
    {
        boolean flag1 = true;
        boolean flag2 = y();
        boolean flag;
        if (I == VideoStage.ENDED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag2)
        {
            flag1 = false;
        }
        return new com.google.android.apps.youtube.core.player.r(flag1, flag, w());
    }

    static int a(Director director, int i1)
    {
        director.N = i1;
        return i1;
    }

    private com.google.android.apps.youtube.common.a.b a(com.google.android.apps.youtube.common.a.b b1)
    {
        b1 = com.google.android.apps.youtube.common.a.d.a(b1);
        A = b1;
        return com.google.android.apps.youtube.common.a.e.a(a, b1);
    }

    static PlayerState a(Director director, PlayerState playerstate)
    {
        director.H = playerstate;
        return playerstate;
    }

    static void a(Director director)
    {
        director.I();
    }

    static void a(Director director, int i1, int j1, int k1)
    {
        director.P = i1;
        director.Q = j1;
        director.R = k1;
        director.l.a(i1);
        director.D();
    }

    static void a(Director director, VideoStage videostage)
    {
        director.c(videostage);
    }

    static void a(Director director, PlaybackServiceException playbackserviceexception)
    {
        director.b(playbackserviceexception);
    }

    static void a(Director director, AdPair adpair)
    {
        if (adpair == null || adpair.getAdBreak() == null)
        {
            director.I();
            return;
        }
        director.s = adpair.getAdBreak();
        director.r = adpair.getAd();
        if (director.r == null || director.r.isForecastingAd())
        {
            director.l.a(director.s, director.w);
        }
        if (director.r != null)
        {
            director.l.a(director.s, director.r, director.w);
            director.a(director.r);
            return;
        } else
        {
            director.I();
            return;
        }
    }

    static void a(Director director, Object obj, int i1, int j1)
    {
        if (director.I.isPlayingAd())
        {
            director.g.a("AdPlayError", null, director.P());
            return;
        }
        if (obj != null)
        {
            director.a((new StringBuilder("PlaybackMediaError - ")).append(obj.getClass().getSimpleName()).toString(), director.w());
            return;
        } else
        {
            director.a(String.format("PlaybackMediaError - MediaPlayerWrapper: what %d extra %d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            }), director.w());
            return;
        }
    }

    static void a(Director director, String s1, int i1)
    {
        director.a(s1, i1);
    }

    static void a(Director director, boolean flag)
    {
        director.h(true);
    }

    private void a(com.google.android.apps.youtube.core.player.r r1, VmapAdBreak vmapadbreak, VastAd vastad, int i1)
    {
        C = r1.a;
        D = r1.b;
        o = r1.c;
        s = vmapadbreak;
        r = vastad;
        p = i1;
    }

    private void a(VastAd vastad)
    {
        if (vastad.getSurvey() == null)
        {
            if (vastad.isForecastingAd())
            {
                k.a(vastad);
                r = null;
                s = null;
            } else
            if (vastad.getVideoStreamingData() == null)
            {
                l.j();
                r = null;
                s = null;
                I();
                return;
            }
        }
        I();
    }

    private void a(String s1, int i1)
    {
        int j1 = 0;
        FormatStream formatstream = e.a();
        if (formatstream != null)
        {
            j1 = formatstream.getHeight();
        }
        if (i1 != -1)
        {
            g.a(s1, j1, i1);
            return;
        } else
        {
            g.a(s1, j1);
            return;
        }
    }

    private transient boolean a(VideoStage avideostage[])
    {
        return I.isIn(avideostage);
    }

    static int b(Director director, int i1)
    {
        director.o = i1;
        return i1;
    }

    static VideoStage b(Director director)
    {
        return director.I;
    }

    static void b(Director director, boolean flag)
    {
        director.g(flag);
    }

    private void b(PlaybackServiceException playbackserviceexception)
    {
        E = playbackserviceexception;
        if (a(VideoStage.AD_LOADING))
        {
            c(VideoStage.PLAYBACK_LOADED);
        }
        E();
        if (E != null)
        {
            c.c(E);
        }
    }

    static PlayerState c(Director director)
    {
        return director.H;
    }

    private void c(VideoStage videostage)
    {
        I = videostage;
        com.google.android.apps.youtube.common.L.e((new StringBuilder("VideoStage: ")).append(videostage.toString()).toString());
        z();
    }

    static PlaybackClientManager d(Director director)
    {
        return director.l;
    }

    static a e(Director director)
    {
        return director.c;
    }

    static int f(Director director)
    {
        return director.p;
    }

    static int g(Director director)
    {
        return director.o;
    }

    private void g(boolean flag)
    {
        if (!flag)
        {
            k.a(r);
        }
        l.i();
        c(VideoStage.READY);
        if (F != null)
        {
            b.b();
            return;
        } else
        {
            K();
            return;
        }
    }

    static com.google.android.apps.youtube.core.player.n h(Director director)
    {
        return director.J;
    }

    private void h(boolean flag)
    {
        boolean flag1 = true;
        int i1;
        if (t == 1)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        t = i1;
        g.a("streamSelectionHint", String.valueOf(t));
        if (e.a() == null || !I.isOrPast(VideoStage.READY))
        {
            return;
        }
        x x1 = e;
        int j1 = t;
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 2;
        }
        x1.a(j1, i1);
    }

    static void i(Director director)
    {
        director.E();
    }

    private void i(boolean flag)
    {
        K = flag;
        O();
        l.b(w);
    }

    static int j(Director director)
    {
        return director.t;
    }

    static x k(Director director)
    {
        return director.e;
    }

    static void l(Director director)
    {
        director.c(VideoStage.ENDED);
        director.E();
    }

    static boolean m(Director director)
    {
        return director.K;
    }

    static int n(Director director)
    {
        return director.P();
    }

    static Analytics o(Director director)
    {
        return director.g;
    }

    static void p(Director director)
    {
        director.A();
    }

    static h q(Director director)
    {
        return director.i;
    }

    static Context r(Director director)
    {
        return director.f;
    }

    static boolean s(Director director)
    {
        return director.C;
    }

    static boolean t(Director director)
    {
        return director.L;
    }

    private void z()
    {
        String s1;
        PlaybackPair playbackpair;
        VastAd vastad;
        boolean flag;
        if (a(VideoStage.PLAYBACK_LOADED))
        {
            playbackpair = q;
        } else
        {
            playbackpair = null;
        }
        if (I.onAd())
        {
            s1 = l.c();
        } else
        if (a(VideoStage.PLAYBACK_LOADED))
        {
            s1 = l.d();
        } else
        {
            s1 = null;
        }
        if (I.onAd())
        {
            vastad = r;
        } else
        {
            vastad = null;
        }
        flag = H();
        c.a(new ac(I, playbackpair, s1, vastad, flag));
    }

    public final void a()
    {
        boolean flag2 = true;
        c.a(new i());
        boolean flag;
        boolean flag1;
        if (!B && k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && q.getPlayerResponse().getVmapXml() != null && q.getVideo().isMonetized(Util.a(f)))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && !flag1 && q.getVideo().isMonetized(Util.a(f)))
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        if (flag1)
        {
            k.a(t);
            c(VideoStage.AD_LOADING);
            k.b(q.getPlayerResponse(), l.d(), a(U));
            return;
        }
        if (flag)
        {
            k.a(t);
            c(VideoStage.AD_LOADING);
            k.a(q.getPlayerResponse(), l.d(), a(U));
            return;
        }
        if (r != null)
        {
            a(r);
            return;
        } else
        {
            J();
            return;
        }
    }

    public final void a(int i1)
    {
        if (b(VideoStage.ENDED))
        {
            c(VideoStage.MEDIA_VIDEO_PLAY_REQUESTED);
        }
        o = i1;
        if (I.isPlayingVideo() && H != PlayerState.NOT_PREPARED)
        {
            e.a(i1);
            return;
        } else
        {
            C();
            return;
        }
    }

    public final void a(WatchFeature watchfeature, boolean flag, int i1)
    {
        boolean flag1;
        if (i1 >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag1, "startPosition has to be >= 0");
        B = false;
        n = watchfeature;
        com.google.android.apps.youtube.common.L.e("PlaybackState reset by init");
        a(flag, i1);
    }

    public final void a(DirectorSavedState directorsavedstate)
    {
        B = true;
        n = directorsavedstate.feature;
        VmapAdBreak vmapadbreak = directorsavedstate.adBreak;
        VastAd vastad;
        if (directorsavedstate.ad != null && !directorsavedstate.ad.hasExpired(h))
        {
            vastad = directorsavedstate.ad;
        } else
        {
            vastad = null;
        }
        if (directorsavedstate.playbackClientManagerState != null)
        {
            l.a(directorsavedstate.playbackClientManagerState, vmapadbreak, vastad);
        }
        com.google.android.apps.youtube.common.L.e("PlaybackState set by initFromState");
        a(directorsavedstate.contentVideoState, vmapadbreak, vastad, directorsavedstate.adStartPositionMillis);
        if (android.os.Build.VERSION.SDK_INT <= 13)
        {
            C = true;
        }
        t = directorsavedstate.streamSelectionHint;
        if (directorsavedstate.playbackPair != null) goto _L2; else goto _L1
_L1:
        if (!directorsavedstate.userInitiatedPlayback)
        {
            c.c(ScriptedPlaybackEvent.NAVIGATION);
        }
_L4:
        e.e();
        f();
        return;
_L2:
        if (!directorsavedstate.userInitiatedPlayback)
        {
            c.c(ScriptedPlaybackEvent.PLAYER_CONTROL);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(PlaybackServiceException playbackserviceexception)
    {
        b(playbackserviceexception);
    }

    public final void a(PlaybackPair playbackpair)
    {
        q = playbackpair;
        x.a(q.getPlayerResponse().getPlayerConfig(L()));
        C();
        c(VideoStage.PLAYBACK_LOADED);
        j.a(q.getPlayerResponse().getPlayabilityStatus(), this, K);
    }

    public final void a(y y1)
    {
        T = y1;
        i(false);
        if (!S)
        {
            e.a(y1);
        }
    }

    public final void a(Exception exception)
    {
        if (!(exception instanceof PlaybackServiceException)) goto _L2; else goto _L1
_L1:
        exception = (PlaybackServiceException)exception;
_L6:
        k();
        b(exception);
_L4:
        return;
_L2:
        if (!(exception instanceof InnerTubeServiceException))
        {
            break; /* Loop/switch isn't completed */
        }
        FormatStream formatstream = e.a();
        if (formatstream == null || !formatstream.isLocal())
        {
            exception = new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.LICENSE_SERVER_ERROR, false, f.getString(p.br), exception);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        PlaybackServiceException playbackserviceexception = new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNKNOWN, false, exception);
        com.google.android.apps.youtube.common.L.a("Unexpected exception received", exception);
        exception = playbackserviceexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(boolean flag)
    {
        k();
        N();
        l.i();
        l.b();
        e.b(a);
        a.removeCallbacksAndMessages(null);
        J.d();
        e.a(true);
        M.b();
    }

    public final void a(boolean flag, int i1)
    {
        C = flag;
        D = false;
        o = i1;
        s = null;
        r = null;
        p = 0;
        e.e();
        n();
        f();
    }

    final boolean a(VideoStage videostage)
    {
        return I.isOrPast(videostage);
    }

    public final void b()
    {
        f();
        c.c(new com.google.android.apps.youtube.core.player.event.c());
    }

    public final void b(int i1)
    {
        a(w() + i1);
    }

    public final void b(boolean flag)
    {
        if (u != flag)
        {
            u = flag;
            O();
            l.b(w);
        }
    }

    final boolean b(VideoStage videostage)
    {
        return I == videostage;
    }

    final au c()
    {
        return b;
    }

    public final void c(boolean flag)
    {
        if (flag != v)
        {
            v = flag;
            O();
            l.b(w);
            B();
        }
    }

    public final PlaybackClientManager d()
    {
        return l;
    }

    public final void d(boolean flag)
    {
        if (flag != y)
        {
            y = flag;
            B();
        }
    }

    public final void e()
    {
        z();
        A();
        B();
        c.c(new aa(O));
        if (C)
        {
            C();
        } else
        {
            D();
        }
        E();
        F();
        G();
    }

    public final void e(boolean flag)
    {
        L = flag;
    }

    public final DirectorSavedState f(boolean flag)
    {
        VastAd vastad = null;
        if (flag && I.isPlayingAd())
        {
            return null;
        }
        PlaybackClientManager.PlaybackClientManagerState playbackclientmanagerstate;
        VmapAdBreak vmapadbreak;
        boolean flag1;
        boolean flag2;
        if (flag)
        {
            flag1 = false;
            flag = false;
            vmapadbreak = null;
            playbackclientmanagerstate = null;
        } else
        {
            playbackclientmanagerstate = l.a();
            vmapadbreak = s;
            vastad = r;
            flag = K;
            flag1 = S;
        }
        if (z != null && z.c())
        {
            flag2 = z.f();
        } else
        {
            flag2 = false;
        }
        return new DirectorSavedState(Q(), playbackclientmanagerstate, q, n, t, y, flag2, flag, flag1, vmapadbreak, vastad, P());
    }

    final void f()
    {
        N();
        b.a(false);
        b.a();
        F = null;
        H = PlayerState.NOT_PREPARED;
        if (!b(VideoStage.NEW))
        {
            c(VideoStage.NEW);
        }
        q = null;
        E = null;
        O = false;
        P = 0;
        Q = 0;
        R = 0;
        e.k();
        e.d();
        O();
        l.a(w);
        C();
        A();
        E();
    }

    public final void g()
    {
        if (!a(VideoStage.AD_LOADED))
        {
            com.google.android.apps.youtube.common.L.c("play() called when the player wasn't loaded.");
        } else
        {
            C = false;
            G = false;
            long l1 = h.b();
            VideoStreamingData videostreamingdata = q.getPlayerResponse().getVideoStreamingData();
            if (videostreamingdata != null && videostreamingdata.isExpired(l1))
            {
                f();
                c.c(new w(videostreamingdata.getExpiredForSeconds(l1)));
                return;
            }
            if (H == PlayerState.PREPARED)
            {
                if (b(VideoStage.ENDED))
                {
                    c(VideoStage.MEDIA_PLAYING_VIDEO);
                }
                e.b();
                return;
            }
            if (M() && r.getSurvey() == null)
            {
                l.a(r, n, w);
                c(VideoStage.MEDIA_AD_PLAY_REQUESTED);
                C();
                PlayerConfig playerconfig = r.getPlayerConfig();
                c.a(new com.google.android.apps.youtube.core.player.event.n(playerconfig.isExoPlayerEnabled(), playerconfig.isAdaptiveBitrateEnabled()));
                e.a(t, r.getVideoStreamingData(), p, l.c(), playerconfig);
                return;
            }
            b.a(true);
            if (F == null)
            {
                K();
                return;
            }
        }
    }

    public final void h()
    {
        g.b("Replay");
        if (!C)
        {
            a("PlayStarted", -1);
        }
        g();
    }

    public final boolean i()
    {
        return a(new VideoStage[] {
            VideoStage.MEDIA_AD_PLAY_REQUESTED, VideoStage.MEDIA_PLAYING_AD
        });
    }

    public final void j()
    {
        if (e.j())
        {
            e.c();
            p = P();
            o = w();
        }
    }

    public final void k()
    {
        p = P();
        o = w();
        C = true;
        e.e();
        if (I == VideoStage.MEDIA_AD_PLAY_REQUESTED)
        {
            c(VideoStage.AD_LOADED);
        } else
        if (I == VideoStage.MEDIA_VIDEO_PLAY_REQUESTED)
        {
            c(VideoStage.READY);
            return;
        }
    }

    public final void l()
    {
        F = Q();
        G = true;
        j();
    }

    public final void m()
    {
        a(F, ((VmapAdBreak) (null)), ((VastAd) (null)), 0);
        F = null;
        VideoStage videostage;
        if (D)
        {
            videostage = VideoStage.ENDED;
        } else
        {
            videostage = VideoStage.READY;
        }
        c(videostage);
        if (!C)
        {
            if (!G)
            {
                H = PlayerState.NOT_PREPARED;
            }
            K();
        }
    }

    public final void n()
    {
        c(VideoStage.NEW);
        l.i();
    }

    public final void o()
    {
        h(false);
    }

    public final void p()
    {
        if (!S)
        {
            e.l();
            S = true;
            O();
            G();
        }
    }

    public final void q()
    {
        if (!S)
        {
            return;
        }
        if (T != null)
        {
            e.a(T);
            S = false;
            O();
            G();
            return;
        } else
        {
            com.google.android.apps.youtube.common.L.b("Error: no UI elements available to display video");
            g.a("NoUiToDisplayVideo", null, w());
            return;
        }
    }

    public final void r()
    {
        k();
        g(false);
    }

    final void s()
    {
        l.h();
    }

    public final void t()
    {
        T = null;
        i(true);
        e.l();
    }

    public final boolean u()
    {
        return K;
    }

    public final String v()
    {
        if (q == null)
        {
            return null;
        } else
        {
            return q.getPlayerResponse().getVideoId();
        }
    }

    public final int w()
    {
        if (I.isPlayingVideo() && !C)
        {
            return e.f();
        }
        if (b(VideoStage.ENDED))
        {
            return x();
        } else
        {
            return o;
        }
    }

    public final int x()
    {
        if (a(VideoStage.MEDIA_PLAYING_VIDEO) && H == PlayerState.PREPARED)
        {
            return e.g();
        }
        if (a(VideoStage.PLAYBACK_LOADED))
        {
            return q.getPlayerResponse().getLengthSeconds() * 1000;
        } else
        {
            return 0;
        }
    }

    public final boolean y()
    {
        boolean flag1 = false;
        if (!I.isPlaying()) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (!e.j())
            {
                flag = flag1;
                if (H != PlayerState.PREPARING)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!C)
        {
            flag = flag1;
            if (!b(VideoStage.ENDED))
            {
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private class PlayerState extends Enum
    {

        private static final PlayerState $VALUES[];
        public static final PlayerState NOT_PREPARED;
        public static final PlayerState PREPARED;
        public static final PlayerState PREPARING;

        public static PlayerState valueOf(String s1)
        {
            return (PlayerState)Enum.valueOf(com/google/android/apps/youtube/core/player/Director$PlayerState, s1);
        }

        public static PlayerState[] values()
        {
            return (PlayerState[])$VALUES.clone();
        }

        static 
        {
            NOT_PREPARED = new PlayerState("NOT_PREPARED", 0);
            PREPARING = new PlayerState("PREPARING", 1);
            PREPARED = new PlayerState("PREPARED", 2);
            $VALUES = (new PlayerState[] {
                NOT_PREPARED, PREPARING, PREPARED
            });
        }

        private PlayerState(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class VideoStage extends Enum
    {

        private static final VideoStage $VALUES[];
        public static final VideoStage AD_LOADED;
        public static final VideoStage AD_LOADING;
        public static final VideoStage ENDED;
        public static final VideoStage MEDIA_AD_PLAY_REQUESTED;
        public static final VideoStage MEDIA_PLAYING_AD;
        public static final VideoStage MEDIA_PLAYING_VIDEO;
        public static final VideoStage MEDIA_VIDEO_PLAY_REQUESTED;
        public static final VideoStage NEW;
        public static final VideoStage PLAYBACK_LOADED;
        public static final VideoStage READY;

        public static VideoStage valueOf(String s1)
        {
            return (VideoStage)Enum.valueOf(com/google/android/apps/youtube/core/player/Director$VideoStage, s1);
        }

        public static VideoStage[] values()
        {
            return (VideoStage[])$VALUES.clone();
        }

        public final transient boolean isIn(VideoStage avideostage[])
        {
            boolean flag1 = false;
            int j1 = avideostage.length;
            int i1 = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i1 < j1)
                    {
                        if (this != avideostage[i1])
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i1++;
            } while (true);
        }

        public final boolean isOrPast(VideoStage videostage)
        {
            return ordinal() >= videostage.ordinal();
        }

        public final boolean isPlaying()
        {
            return isIn(new VideoStage[] {
                MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD, MEDIA_VIDEO_PLAY_REQUESTED, MEDIA_PLAYING_VIDEO
            });
        }

        public final boolean isPlayingAd()
        {
            return isIn(new VideoStage[] {
                MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD
            });
        }

        public final boolean isPlayingVideo()
        {
            return isIn(new VideoStage[] {
                MEDIA_VIDEO_PLAY_REQUESTED, MEDIA_PLAYING_VIDEO
            });
        }

        public final boolean onAd()
        {
            return isIn(new VideoStage[] {
                AD_LOADED, MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD
            });
        }

        static 
        {
            NEW = new VideoStage("NEW", 0);
            PLAYBACK_LOADED = new VideoStage("PLAYBACK_LOADED", 1);
            AD_LOADING = new VideoStage("AD_LOADING", 2);
            AD_LOADED = new VideoStage("AD_LOADED", 3);
            MEDIA_AD_PLAY_REQUESTED = new VideoStage("MEDIA_AD_PLAY_REQUESTED", 4);
            MEDIA_PLAYING_AD = new VideoStage("MEDIA_PLAYING_AD", 5);
            READY = new VideoStage("READY", 6);
            MEDIA_VIDEO_PLAY_REQUESTED = new VideoStage("MEDIA_VIDEO_PLAY_REQUESTED", 7);
            MEDIA_PLAYING_VIDEO = new VideoStage("MEDIA_PLAYING_VIDEO", 8);
            ENDED = new VideoStage("ENDED", 9);
            $VALUES = (new VideoStage[] {
                NEW, PLAYBACK_LOADED, AD_LOADING, AD_LOADED, MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD, READY, MEDIA_VIDEO_PLAY_REQUESTED, MEDIA_PLAYING_VIDEO, ENDED
            });
        }

        private VideoStage(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
