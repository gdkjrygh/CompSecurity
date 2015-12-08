// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListView;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.z;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.d.f;
import com.google.android.apps.youtube.app.navigation.AppNavigator;
import com.google.android.apps.youtube.app.offline.a.aa;
import com.google.android.apps.youtube.app.offline.a.ab;
import com.google.android.apps.youtube.app.offline.a.ac;
import com.google.android.apps.youtube.app.offline.a.ad;
import com.google.android.apps.youtube.app.offline.a.ae;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.LikeAction;
import com.google.android.apps.youtube.app.ui.LoadingFrameLayout;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.bv;
import com.google.android.apps.youtube.app.ui.df;
import com.google.android.apps.youtube.app.ui.fh;
import com.google.android.apps.youtube.app.ui.hh;
import com.google.android.apps.youtube.app.ui.hj;
import com.google.android.apps.youtube.app.ui.hp;
import com.google.android.apps.youtube.app.ui.hy;
import com.google.android.apps.youtube.app.ui.ij;
import com.google.android.apps.youtube.app.ui.ir;
import com.google.android.apps.youtube.app.ui.presenter.am;
import com.google.android.apps.youtube.app.ui.presenter.cc;
import com.google.android.apps.youtube.app.ui.presenter.cv;
import com.google.android.apps.youtube.app.ui.s;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.distiller.a;
import com.google.android.apps.youtube.datalib.distiller.c;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.innertube.model.w;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.uilib.innertube.t;
import com.google.android.youtube.j;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PlayerFragment, bv, bx, bz, 
//            bu, bw, by, WatchInfoPanelFragment

public class VideoInfoFragment extends Fragment
    implements hp, hy, ir
{

    private View Y;
    private ViewStub Z;
    private ax a;
    private View aa;
    private ij ab;
    private hj ac;
    private s ad;
    private r ae;
    private q af;
    private l ag;
    private bj ah;
    private a ai;
    private RemoteControlContextualMenuController aj;
    private RemoteControlContextualMenuController ak;
    private f al;
    private t am;
    private fh an;
    private df ao;
    private aw b;
    private WatchWhileActivity c;
    private Resources d;
    private PlayerFragment e;
    private WatchInfoPanelFragment f;
    private com.google.android.apps.youtube.common.c.a g;
    private LoadingFrameLayout h;
    private ListView i;

    public VideoInfoFragment()
    {
    }

    private OfflineStoreInterface F()
    {
        if (!ag.b())
        {
            return af.a();
        } else
        {
            return af.a(ag.c());
        }
    }

    static f a(VideoInfoFragment videoinfofragment)
    {
        return videoinfofragment.al;
    }

    private void a(String s1, boolean flag)
    {
        h.a(s1, flag);
    }

    private void b(Configuration configuration)
    {
        boolean flag = false;
        if (f != null)
        {
            int k;
            byte byte0;
            if (configuration.orientation == 2)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            configuration = Y;
            if (k != 0)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            configuration.setVisibility(byte0);
            if (aa != null)
            {
                configuration = aa;
                if (k != 0)
                {
                    k = ((flag) ? 1 : 0);
                } else
                {
                    k = 8;
                }
                configuration.setVisibility(k);
            }
        }
    }

    static void b(VideoInfoFragment videoinfofragment)
    {
        videoinfofragment.h.b();
    }

    static s c(VideoInfoFragment videoinfofragment)
    {
        return videoinfofragment.ad;
    }

    static PlayerFragment d(VideoInfoFragment videoinfofragment)
    {
        return videoinfofragment.e;
    }

    static WatchInfoPanelFragment e(VideoInfoFragment videoinfofragment)
    {
        return videoinfofragment.f;
    }

    private void handleOfflineVideoAddEvent(aa aa1)
    {
        aa1 = aa1.a;
        if (aa1.a().equals(e.M()))
        {
            ab.a(aa1);
        }
    }

    private void handleOfflineVideoAddFailedEvent(ab ab1)
    {
        if (ab1.a.equals(e.M()))
        {
            ab.a(null);
        }
    }

    private void handleOfflineVideoCompleteEvent(ac ac1)
    {
        ac1 = ac1.a;
        if (ac1.a().equals(e.M()))
        {
            ab.a(ac1);
            com.google.android.apps.youtube.core.utils.ah.a(c, p.o, 1);
        }
    }

    private void handleOfflineVideoDeleteEvent(ad ad1)
    {
        if (ad1.a.equals(e.M()))
        {
            ab.a(null);
        }
    }

    private void handleOfflineVideoStatusUpdateEvent(ae ae1)
    {
        ae1 = ae1.a;
        if (ae1.a().equals(e.M()))
        {
            ab.a(ae1);
            if (ae1.t())
            {
                if (ae1.q())
                {
                    com.google.android.apps.youtube.core.utils.ah.a(c, p.N, 1);
                } else
                if (ae1.r())
                {
                    if (!ae1.f().f())
                    {
                        com.google.android.apps.youtube.core.utils.ah.a(c, p.N, 1);
                        return;
                    }
                } else
                if (ae1.s())
                {
                    com.google.android.apps.youtube.core.utils.ah.a(c, p.p, 1);
                    return;
                } else
                {
                    com.google.android.apps.youtube.core.utils.ah.a(c, p.t, 1);
                    return;
                }
            }
        }
    }

    private void handlePlaybackServiceException(PlaybackServiceException playbackserviceexception)
    {
        String s2 = playbackserviceexception.getMessage();
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = d.getString(p.gm);
        }
        switch (bv.b[playbackserviceexception.reason.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            h.setOnRetryClickListener(new bx(this, (byte)0));
            a(s1, playbackserviceexception.isRetriable);
            return;

        case 4: // '\004'
            h.setOnRetryClickListener(new bz(this, (byte)0));
            break;
        }
        a(s1, playbackserviceexception.isRetriable);
    }

    private void handleRequestingWatchDataEvent(com.google.android.apps.youtube.core.player.event.r r1)
    {
        a();
    }

    private void handleSequencerStageEvent(com.google.android.apps.youtube.core.player.event.v v1)
    {
        boolean flag1 = true;
        com.google.android.apps.youtube.app.fragments.bv.a[v1.a().ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 45
    //                   2 45
    //                   3 58
    //                   4 89;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        return;
_L2:
        a();
        al.a(null);
        return;
_L3:
        v1.b().getPlayerResponse();
        ad.b();
        ac.a();
        al.a(null);
        return;
_L4:
        WatchNextResponse watchnextresponse = v1.c();
        v1 = v1.b().getPlayerResponse();
        String s1 = watchnextresponse.getVideoId();
        x x1 = F().a(s1);
        boolean flag;
        if (v1.getPlayabilityStatus().c())
        {
            Object obj = ai;
            obj = com.google.android.apps.youtube.datalib.distiller.a.a();
            ((c) (obj)).a(s1);
            ((c) (obj)).a(2);
            ai.a(((c) (obj)), new bu(this, s1));
            flag = false;
        } else
        {
            flag = true;
        }
        am.b(watchnextresponse.getSectionList());
        ac.a(s1, v1.getTitle());
        if (watchnextresponse.getVideoMetadataRenderer() != null)
        {
            ij ij1 = ab;
            com.google.a.a.a.a.uv uv = watchnextresponse.getVideoMetadataRenderer();
            if (v1.isLive())
            {
                flag1 = false;
            }
            ij1.a(uv, x1, s1, flag1);
        }
        if (watchnextresponse.getSectionList() == null)
        {
            h.c();
            return;
        }
        if (flag)
        {
            h.b();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void E()
    {
        View view = q();
        if (view != null)
        {
            view.requestLayout();
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(com.google.android.youtube.l.by, viewgroup, false);
        an = new fh(viewgroup, d);
        an.a(false);
        h = (LoadingFrameLayout)viewgroup.findViewById(j.fY);
        h.setOnStateChangeListener(new bw(this, (byte)0));
        a = ((YouTubeApplication)c.getApplication()).d();
        b = a.b();
        Object obj = a.ba();
        com.google.android.apps.youtube.core.identity.ak ak1 = a.aV();
        ag = a.aT();
        ah = a.aw();
        ai = a.w();
        bundle = a.aO();
        com.google.android.apps.youtube.core.client.bc bc = a.f();
        com.google.android.apps.youtube.datalib.innertube.v v1 = a.x();
        com.google.android.apps.youtube.datalib.innertube.al al1 = a.y();
        g = a.bf();
        af = a.q();
        com.google.android.apps.youtube.app.offline.p p1 = a.Z();
        ae = new r(c, ag, af, a.bk(), bundle, a.aX(), p1, new bv(c, p1), c.J());
        ac = new hj(c, bc, v1, al1, ak1, a.k(), ag, a.bk(), ((com.google.android.apps.youtube.core.Analytics) (obj)), bundle, g, this, a.ai(), a.aI());
        ac.a(this);
        i = (ListView)h.findViewById(j.go);
        layoutinflater = layoutinflater.inflate(com.google.android.youtube.l.bL, i, false);
        Y = layoutinflater.findViewById(j.gl);
        ab = new ij(c, ac, this);
        ab.a(Y);
        Z = (ViewStub)layoutinflater.findViewById(j.gj);
        aj = RemoteControlContextualMenuController.a(c, a.W(), bundle, WatchFeature.RELATED, ((com.google.android.apps.youtube.core.Analytics) (obj)), bc);
        ak = RemoteControlContextualMenuController.a(a.W(), bundle, WatchFeature.REMOTE_QUEUE, ((com.google.android.apps.youtube.core.Analytics) (obj)), bc);
        ad = new s(i(), bc, ah, c.N(), b, layoutinflater, i, 0, a.ac());
        i.addHeaderView(layoutinflater);
        al = new f(i(), i, ai, ah, bc, ak1, ag, a.bk(), c.N(), bundle);
        layoutinflater = new cc(c, AppNavigator.b(c, g), a.bf(), ah, ag, a.aQ(), a.bk(), new com.google.android.apps.youtube.app.ui.a(a.C()), a.F(), a.G(), a.ai(), bundle, aj);
        obj = new z(new am(c, new cv(), a.bf()));
        am = new t(c.N(), i, ((com.google.android.apps.youtube.uilib.innertube.p) (obj)), a.t(), a.bf(), layoutinflater, bundle);
        am.a(new by(this, (byte)0));
        am.a(al.b());
        h.a();
        return viewgroup;
    }

    public final void a()
    {
        ac.a();
        h.c();
        h.a();
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        c = (WatchWhileActivity)activity;
        d = j();
    }

    public final void a(LikeAction likeaction)
    {
        ab.a(likeaction);
    }

    public final void a(String s1)
    {
        Object obj = e.M();
        if (obj != null && ((String) (obj)).equals(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((obj = e.N()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((PlayerResponse) (obj)).getPlayabilityStatus().j())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ((PlayerResponse) (obj)).getPlayabilityStatus().k();
        if (s1 != null)
        {
            c.J().a(s1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (TextUtils.isEmpty(s1))
        {
            com.google.android.apps.youtube.core.utils.ah.a(c, p.t, 1);
            return;
        }
        x x1 = F().a(s1);
        if (x1 != null)
        {
            if (x1.v() || x1.k())
            {
                ae.a(s1);
                return;
            }
            if (x1.t())
            {
                if (x1.u())
                {
                    ae.a(null, s1, ab);
                    return;
                }
                if (x1.q())
                {
                    com.google.android.apps.youtube.core.utils.ah.a(c, p.t, 1);
                    return;
                }
                if (x1.r())
                {
                    s1 = x1.f();
                    if (s1.f())
                    {
                        c.J().a();
                        return;
                    }
                    s1 = s1.b().j();
                    if (s1 != null)
                    {
                        c.J().a(s1);
                        return;
                    }
                }
            }
        } else
        {
            ae.a(s1, null, ab);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final hj b()
    {
        return ac;
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        bundle = k();
        e = (PlayerFragment)bundle.a(j.dx);
        f = (WatchInfoPanelFragment)bundle.a(j.gm);
        ao = new df(c, e, ak, a.ai());
        ao.a(an);
        if (f != null)
        {
            ab.a(f.q());
            aa = Z.inflate();
            ab.b(aa);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        b(configuration);
    }

    public final void r()
    {
        super.r();
        b(d.getConfiguration());
        aj.b();
        ak.b();
        al.a();
        ad.a();
        g.a(this);
        g.a(al);
        g.a(ao);
        g.a(ad);
    }

    public final void s()
    {
        super.s();
        g.b(this);
        g.b(al);
        g.b(ao);
        g.b(ad);
    }

    public final void t()
    {
        super.t();
        aj.a();
        ak.a();
    }
}
