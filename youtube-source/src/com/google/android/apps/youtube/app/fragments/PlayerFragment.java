// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.fragments.navigation.WatchBackStack;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.a;
import com.google.android.apps.youtube.app.fragments.navigation.f;
import com.google.android.apps.youtube.app.honeycomb.d;
import com.google.android.apps.youtube.app.honeycomb.phone.i;
import com.google.android.apps.youtube.app.m2ts.BackgroundPlaybackDialogs;
import com.google.android.apps.youtube.app.m2ts.TextOverlay;
import com.google.android.apps.youtube.app.navigation.AppNavigator;
import com.google.android.apps.youtube.app.player.RobotoAnnotationOverlay;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.aj;
import com.google.android.apps.youtube.app.remote.am;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.ap;
import com.google.android.apps.youtube.app.remote.bk;
import com.google.android.apps.youtube.app.ui.dn;
import com.google.android.apps.youtube.app.ui.ei;
import com.google.android.apps.youtube.app.ui.ep;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.player.PlaybackServiceState;
import com.google.android.apps.youtube.core.player.PlayerView;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.event.ab;
import com.google.android.apps.youtube.core.player.event.ad;
import com.google.android.apps.youtube.core.player.event.t;
import com.google.android.apps.youtube.core.player.event.v;
import com.google.android.apps.youtube.core.player.event.y;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.player.overlay.DefaultAdOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultControlsOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultLiveOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultSubtitlesOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultSurveyOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultThumbnailOverlay;
import com.google.android.apps.youtube.core.player.overlay.ac;
import com.google.android.apps.youtube.core.player.overlay.az;
import com.google.android.apps.youtube.core.player.overlay.bf;
import com.google.android.apps.youtube.core.player.overlay.bo;
import com.google.android.apps.youtube.core.player.overlay.bs;
import com.google.android.apps.youtube.core.player.overlay.c;
import com.google.android.apps.youtube.core.player.overlay.q;
import com.google.android.apps.youtube.core.player.z;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.w;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            bd, bc, az, VideoInfoFragment

public class PlayerFragment extends Fragment
    implements android.view.KeyEvent.Callback, d, am, ap, dn, ep, ac
{

    private c Y;
    private bo Z;
    private WatchWhileActivity a;
    private aj aA;
    private BackgroundPlaybackDialogs aB;
    private TextOverlay aC;
    private PlaybackServiceState aD;
    private String aE;
    private com.google.android.apps.youtube.core.player.overlay.am aa;
    private com.google.android.apps.youtube.core.player.overlay.i ab;
    private bf ac;
    private bs ad;
    private SharedPreferences ae;
    private com.google.android.apps.youtube.core.player.w af;
    private z ag;
    private Analytics ah;
    private DefaultControlsOverlay ai;
    private boolean aj;
    private boolean ak;
    private PlayerResponse al;
    private Toast am;
    private bc an;
    private an ao;
    private bk ap;
    private ei aq;
    private YouTubeApplication ar;
    private ax as;
    private ae at;
    private YouTubeTvScreensMonitor au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private DefaultControlsOverlay az;
    private VideoInfoFragment b;
    private WatchDescriptor c;
    private WatchBackStack d;
    private WatchFeature e;
    private com.google.android.apps.youtube.core.aw f;
    private PlayerView g;
    private q h;
    private az i;

    public PlayerFragment()
    {
    }

    private void P()
    {
        c = null;
        aD = null;
    }

    private void Q()
    {
        al = null;
        aq.a(null);
    }

    private void R()
    {
        DefaultControlsOverlay defaultcontrolsoverlay = ai;
        boolean flag;
        if (U() && ao.e() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        defaultcontrolsoverlay.setHasAudioOnly(flag);
    }

    private void S()
    {
        if (!ak)
        {
            at.d(false);
        }
        a.D();
    }

    private boolean T()
    {
        return ar.w() && ae.getBoolean("background_audio_enabled", true);
    }

    private boolean U()
    {
        return T() && al != null && al.getPlayabilityStatus() != null && al.getPlayabilityStatus().h();
    }

    static WatchWhileActivity a(PlayerFragment playerfragment)
    {
        return playerfragment.a;
    }

    private void a(PlaybackStartDescriptor playbackstartdescriptor, boolean flag)
    {
        if (flag)
        {
            ar.e();
        }
        aq.c(playbackstartdescriptor.getVideoId());
        e = playbackstartdescriptor.getWatchFeature();
        aq.a(e);
        if (flag)
        {
            if (aD != null)
            {
                at.a(aD);
            } else
            {
                at.a(playbackstartdescriptor);
            }
        } else
        {
            at.v();
        }
        aD = null;
        c(aj);
    }

    static bk b(PlayerFragment playerfragment)
    {
        return playerfragment.ap;
    }

    static ei c(PlayerFragment playerfragment)
    {
        return playerfragment.aq;
    }

    static com.google.android.apps.youtube.core.aw d(PlayerFragment playerfragment)
    {
        return playerfragment.f;
    }

    static an e(PlayerFragment playerfragment)
    {
        return playerfragment.ao;
    }

    private void handlePlaybackServiceException(PlaybackServiceException playbackserviceexception)
    {
        String s1;
        switch (com.google.android.apps.youtube.app.fragments.bd.a[playbackserviceexception.reason.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            s1 = playbackserviceexception.getMessage();
            break;
        }
        playbackserviceexception = s1;
        if (TextUtils.isEmpty(s1))
        {
            playbackserviceexception = a.getString(p.gm);
        }
        aq.b(playbackserviceexception);
    }

    private void handleSequencerEndedEvent(t t)
    {
        S();
    }

    private void handleSequencerStageEvent(v v1)
    {
        if (v1.b() != null)
        {
            PlayerResponse playerresponse = v1.b().getPlayerResponse();
            if (al == null || !al.getVideoId().equals(playerresponse.getVideoId()))
            {
                v1 = v1.b().getPlayerResponse();
                al = v1;
                if (ao.e() == null)
                {
                    v1 = v1.getVideoId();
                    an.l(v1, new com.google.android.apps.youtube.app.fragments.bc(this));
                } else
                {
                    aq.a(v1);
                }
                if (!TextUtils.isEmpty(aE))
                {
                    v1 = new SsdpId(aE);
                    au.a(v1, new com.google.android.apps.youtube.app.fragments.az(this));
                    aE = null;
                }
                R();
            }
        } else
        if (v1.a() == com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage.SEQUENCE_EMPTY)
        {
            S();
            return;
        }
    }

    private void handleUnplayableVideoSkipped(y y)
    {
        am.setText(p.dP);
        am.show();
    }

    private void handleVideoFullscreenEvent(ab ab1)
    {
        if (!ak)
        {
            c(ab1.a());
            a.e(ab1.a());
        }
    }

    private void handleVideoSyncToAudioEvent(ad ad1)
    {
        TextOverlay textoverlay = aC;
        int k;
        if (ad1.a())
        {
            k = 0;
        } else
        {
            k = 8;
        }
        textoverlay.setVisibility(k);
    }

    public final boolean E()
    {
        if (!d.isEmpty())
        {
            a a1 = d.pop();
            at.E();
            P();
            at.a((PlaybackServiceState)a1.b);
            return true;
        } else
        {
            return false;
        }
    }

    public final void F()
    {
        ak = false;
        c(false);
        at.E();
        Q();
        b.a();
        d.popAll();
    }

    public final void G()
    {
        ai.a();
    }

    public final void H()
    {
        a.C();
    }

    public final boolean I()
    {
        return !aq.r() && !at.h();
    }

    public final ae J()
    {
        return at;
    }

    public final int K()
    {
        if (aq.r())
        {
            return aq.t();
        } else
        {
            return at.e();
        }
    }

    public final SubtitleTrack L()
    {
        return ac.b();
    }

    public final String M()
    {
        return at.d();
    }

    public final PlayerResponse N()
    {
        return al;
    }

    public final PlayerView O()
    {
        return g;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.aF, viewgroup, false);
        g = (PlayerView)layoutinflater.findViewById(j.gq);
        aC = new TextOverlay(a);
        aC.setText(p.fY);
        viewgroup = as.aw();
        as.E();
        bundle = as.M();
        Object obj = AppNavigator.b(a, as.bf());
        af = as.aa();
        ag = new z(a);
        ai = new DefaultControlsOverlay(a);
        boolean flag = ar.d().b().t();
        ai.setShowAudioOnly(flag);
        ai.setUiListener(this);
        DefaultAdOverlay defaultadoverlay = new DefaultAdOverlay(a, ah, ai.h());
        DefaultSurveyOverlay defaultsurveyoverlay = new DefaultSurveyOverlay(a);
        ai.a(a.Q().e());
        RobotoAnnotationOverlay robotoannotationoverlay = new RobotoAnnotationOverlay(a);
        DefaultLiveOverlay defaultliveoverlay = new DefaultLiveOverlay(a);
        DefaultSubtitlesOverlay defaultsubtitlesoverlay = new DefaultSubtitlesOverlay(a);
        DefaultThumbnailOverlay defaultthumbnailoverlay = new DefaultThumbnailOverlay(ar.getApplicationContext());
        g.a(new com.google.android.apps.youtube.core.player.overlay.ax[] {
            defaultthumbnailoverlay, aC, defaultsubtitlesoverlay, ai, robotoannotationoverlay, defaultadoverlay, defaultsurveyoverlay, defaultliveoverlay
        });
        h = new q(at, as.bf(), ai);
        i = new az(g, ai);
        Y = new c(defaultadoverlay, a, at, an, viewgroup, ah, ((com.google.android.apps.youtube.datalib.d.a) (obj)));
        Z = new bo(at.a(), defaultsurveyoverlay, as.aG(), at.b(), g);
        aa = new com.google.android.apps.youtube.core.player.overlay.am(defaultliveoverlay, at);
        ab = new com.google.android.apps.youtube.core.player.overlay.i(a, robotoannotationoverlay, viewgroup, ((com.google.android.apps.youtube.datalib.d.a) (obj)), g, at, as.as(), k());
        ac = new bf(defaultsubtitlesoverlay, bundle, h, ah, ae, a, as.bf());
        ad = new bs(defaultthumbnailoverlay, viewgroup, false);
        ai.setAdActionsListener(Y);
        ao = as.W();
        obj = new DefaultControlsOverlay(a);
        ((DefaultControlsOverlay) (obj)).setAlwaysShowControls(true);
        ((DefaultControlsOverlay) (obj)).a(a.Q().a(a));
        az = ((DefaultControlsOverlay) (obj));
        az.setUiListener(this);
        aq = new ei(at, as.ap(), a, viewgroup, bundle, ah, az, g, this, a, a.N(), layoutinflater.findViewById(j.ee));
        au = ar.l();
        am = com.google.android.apps.youtube.core.utils.ah.a(a, "", 1);
        return layoutinflater;
    }

    public final void a()
    {
        if (!at.n())
        {
            PlaybackServiceState playbackservicestate = at.g(false);
            if (playbackservicestate != null)
            {
                a(playbackservicestate.playbackStartDescriptor, true);
            }
        }
    }

    public final void a(float f1)
    {
        at.a(f1);
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        a = (WatchWhileActivity)activity;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ar = (YouTubeApplication)a.getApplication();
        as = ar.d();
        ah = as.ba();
        ae = as.aP();
        f = as.aO();
        an = as.f();
        ap = as.P();
        aA = as.X();
        aB = new BackgroundPlaybackDialogs(a, ae, a.J());
        at = as.ac();
        if (bundle != null)
        {
            d = (WatchBackStack)bundle.getParcelable("watch_back_stack");
            aD = (PlaybackServiceState)bundle.getParcelable("playback_service_state");
            aB.b(bundle);
        }
        if (d == null)
        {
            d = new WatchBackStack();
        }
        bundle = at.b(a.getTaskId());
        if (bundle != null)
        {
            aD = bundle;
        }
    }

    public final void a(WatchDescriptor watchdescriptor)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(watchdescriptor);
        if (at.b(watchdescriptor.getPlaybackStartDescriptor()))
        {
            return;
        }
        if (!m())
        {
            c = watchdescriptor;
            return;
        }
        String s1;
        if (at.c(watchdescriptor.getPlaybackStartDescriptor()))
        {
            P();
        } else
        {
            at.k();
            P();
        }
        aE = watchdescriptor.getTvId();
        s1 = watchdescriptor.getPlaybackStartDescriptor().getPlaylistId();
        if (TextUtils.isEmpty(s1) || !TextUtils.equals(s1, at.c()))
        {
            if (watchdescriptor.shouldKeepHistory())
            {
                PlaybackServiceState playbackservicestate = at.g(true);
                if (playbackservicestate != null)
                {
                    d.push(new f(null, playbackservicestate));
                }
            } else
            {
                d.popAll();
                at.E();
            }
        }
        a(watchdescriptor.getPlaybackStartDescriptor(), true);
    }

    public final void a(WatchDescriptor watchdescriptor, boolean flag)
    {
        aj = true;
        ak = flag;
        ae ae1 = at;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ae1.c(flag);
        at.d(true);
        a(watchdescriptor);
    }

    public final void a(RemoteControl remotecontrol, boolean flag)
    {
        if (remotecontrol != null) goto _L2; else goto _L1
_L1:
        if (aq.s())
        {
            remotecontrol = aq;
            com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState remoteplayerstate = remotecontrol.u();
            if (remoteplayerstate != null)
            {
                int k = 0;
                if (remoteplayerstate != com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ENDED)
                {
                    k = remotecontrol.t();
                }
                at.c(k);
                if (remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ENDED || remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PAUSED)
                {
                    at.l();
                }
            }
            remotecontrol = aq.v();
            if (remotecontrol != null)
            {
                ac.a(remotecontrol);
            }
            aq.o();
        }
        af.a(ag);
_L4:
        R();
        return;
_L2:
        aq.a(remotecontrol);
        af.a();
        if (al != null)
        {
            aq.a(al);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag)
    {
        g.setMinimized(flag);
        at.e(flag);
        aq.a(flag);
    }

    public final void b()
    {
        at.o();
    }

    public final void b(boolean flag)
    {
        g.setSliding(flag);
        aq.c(flag);
    }

    public final void c(boolean flag)
    {
        aj = flag;
        at.d(aj);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)g.getLayoutParams();
        if (aj)
        {
            marginlayoutparams.width = -1;
            marginlayoutparams.height = -1;
            marginlayoutparams.leftMargin = 0;
            marginlayoutparams.topMargin = 0;
            marginlayoutparams.rightMargin = 0;
            marginlayoutparams.bottomMargin = 0;
            av = 0;
            aw = 0;
            ax = 0;
            ay = 0;
            q().findViewById(j.gi).setPadding(av, aw, ax, ay);
        }
    }

    public final void d()
    {
        super.d();
        aA.a(this);
        com.google.android.apps.youtube.app.ui.hj hj = b.b();
        ai.setMenuActionsListener(hj);
        az.setMenuActionsListener(hj);
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        b = (VideoInfoFragment)k().a(j.fX);
    }

    public final void d(boolean flag)
    {
        if (!ak)
        {
            c(flag);
            a.e(flag);
        }
    }

    public final void e()
    {
        Q();
        aA.b(this);
        super.e();
    }

    public final void e(Bundle bundle)
    {
        PlaybackServiceState playbackservicestate = at.g(false);
        bundle.putParcelable("watch_back_stack", d);
        bundle.putParcelable("playback_service_state", playbackservicestate);
        aB.a(bundle);
        super.e(bundle);
    }

    public final void e(boolean flag)
    {
        at.a(flag);
        ai.setHasNext(at.q());
    }

    public final void f()
    {
        super.f();
        at.B();
        ac.a();
    }

    public final void f(boolean flag)
    {
        at.b(flag);
        ai.setHasNext(at.q());
    }

    public final void g(boolean flag)
    {
        at.c(true);
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        return ai.onKeyDown(k, keyevent);
    }

    public final boolean onKeyLongPress(int k, KeyEvent keyevent)
    {
        return false;
    }

    public final boolean onKeyMultiple(int k, int i1, KeyEvent keyevent)
    {
        return false;
    }

    public boolean onKeyUp(int k, KeyEvent keyevent)
    {
        return ai.onKeyUp(k, keyevent);
    }

    public final void r()
    {
        boolean flag;
        super.r();
        at.a(a.getTaskId());
        Object obj = as.bf();
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(new com.google.android.apps.youtube.app.b.w());
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(this);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(Y);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(ab);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(h);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(aa);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(ac);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(Z);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(i);
        ((com.google.android.apps.youtube.common.c.a) (obj)).a(ad);
        at.v();
        obj = ao.e();
        if (obj != null)
        {
            aq.a(((RemoteControl) (obj)));
            af.a();
        } else
        {
            aq.o();
            af.a(ag);
        }
        aq.p();
        flag = at.w();
        at.a(g.b());
        if (c == null) goto _L2; else goto _L1
_L1:
        a(c);
_L4:
        aB.c();
        return;
_L2:
        if (aD != null)
        {
            PlaybackStartDescriptor playbackstartdescriptor = aD.playbackStartDescriptor;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(playbackstartdescriptor, flag);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void s()
    {
        af.a();
        com.google.android.apps.youtube.common.c.a a1 = as.bf();
        a1.b(this);
        a1.b(Y);
        a1.b(ab);
        a1.b(h);
        a1.b(aa);
        a1.b(ac);
        a1.b(Z);
        a1.b(i);
        a1.b(ad);
        if (T() && at.g() && al != null)
        {
            if (U())
            {
                at.x();
                aB.a();
            } else
            {
                aB.a(al.getPlayabilityStatus().i());
            }
        } else
        {
            aB.b();
        }
        at.A();
        aq.q();
        Z.b();
        super.s();
    }
}
