// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.aq;
import com.google.android.apps.youtube.app.remote.as;
import com.google.android.apps.youtube.app.remote.bg;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.overlay.DefaultControlsOverlay;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.w;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ep, eq, en, em, 
//            RemoteControlView, ej, gr, eo, 
//            ek, el

public final class ei
    implements aq, p
{

    private static final Set a;
    private final am A;
    private boolean B;
    private String C;
    private final Activity b;
    private final ce c;
    private final Analytics d;
    private final gr e;
    private RemoteControl f;
    private final ae g;
    private final PlayerFetcher h;
    private final Handler i;
    private final eq j;
    private final ep k;
    private d l;
    private PlayerResponse m;
    private WatchFeature n;
    private boolean o;
    private String p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState v;
    private RemoteControlView w;
    private final FrameLayout x;
    private final View y;
    private SubtitleTrack z;

    public ei(ae ae1, PlayerFetcher playerfetcher, Activity activity, bj bj1, ce ce1, Analytics analytics, DefaultControlsOverlay defaultcontrolsoverlay, 
            View view, ep ep1, eq eq1, am am1, View view1)
    {
        t = false;
        y = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        g = (ae)com.google.android.apps.youtube.common.fromguava.c.a(ae1);
        h = (PlayerFetcher)com.google.android.apps.youtube.common.fromguava.c.a(playerfetcher);
        b = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        c = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1);
        d = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        k = (ep)com.google.android.apps.youtube.common.fromguava.c.a(ep1);
        j = (eq)com.google.android.apps.youtube.common.fromguava.c.a(eq1);
        A = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        ae1 = new en(this);
        playerfetcher = new em(this);
        defaultcontrolsoverlay.setListener(this);
        w = new RemoteControlView(activity, defaultcontrolsoverlay, ae1, playerfetcher);
        x = (FrameLayout)view1;
        x.addView(w);
        view1.setVisibility(8);
        i = new ej(this, activity.getMainLooper(), activity);
        e = new gr((bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1), w.a());
    }

    private boolean A()
    {
        return m != null && m.getVideoId().equals(f.p());
    }

    private boolean B()
    {
        return m != null && m.getPlayabilityStatus().c();
    }

    private void C()
    {
        if (s())
        {
            a(f.b());
        }
    }

    private void D()
    {
        boolean flag1 = true;
        boolean flag;
        if (A() && f.k())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!A() || !f.h())
        {
            flag1 = false;
        }
        w.setHasNext(flag);
        w.setHasPrevious(flag1);
    }

    private void E()
    {
        if (m == null)
        {
            w.setScrubbingEnabled(false);
            return;
        }
        int i1 = m.getLengthSeconds() * 1000;
        if (A())
        {
            if (f.n() != com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ENDED)
            {
                u = Math.min((int)f.t(), i1);
            } else
            {
                u = i1;
            }
        } else
        {
            u = 0;
        }
        w.setScrubbingEnabled(true);
        w.setTimes(u, i1, 100);
    }

    static void a(ei ei1, PlayerResponse playerresponse)
    {
        ei1.m = playerresponse;
        if (ei1.f != null)
        {
            ei1.C();
        }
    }

    static void a(ei ei1, String s1)
    {
        ei1.d(s1);
    }

    static boolean a(ei ei1)
    {
        return ei1.z() && ei1.f.p() != null && ei1.A() && ei1.f.n() != null && a.contains(ei1.f.n());
    }

    static boolean a(ei ei1, boolean flag)
    {
        ei1.r = false;
        return false;
    }

    private void b(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState remoteplayerstate)
    {
        String s1 = Html.fromHtml(b.getString(com.google.android.youtube.p.dN, new Object[] {
            y()
        })).toString();
        if (remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ENDED)
        {
            s1 = (new StringBuilder()).append(b.getString(com.google.android.youtube.p.ay)).append(" ").append(y()).toString();
        }
        w.setPlayingOnText(s1);
    }

    static void b(ei ei1)
    {
        ei1.E();
    }

    static Handler c(ei ei1)
    {
        return ei1.i;
    }

    private void d(String s1)
    {
        if (!A())
        {
            w();
        }
        x();
        a(f.w());
        if (o)
        {
            u = 0;
            w.a(p, false);
        } else
        {
            a(f.n());
        }
        D();
    }

    private void d(boolean flag)
    {
        boolean flag1 = w.b();
        w.setMinimized(flag);
        if (flag && !flag1)
        {
            w.d();
        } else
        if (!flag && flag1)
        {
            C();
            return;
        }
    }

    static boolean d(ei ei1)
    {
        return ei1.z();
    }

    static boolean e(ei ei1)
    {
        return ei1.A();
    }

    static RemoteControl f(ei ei1)
    {
        return ei1.f;
    }

    static boolean g(ei ei1)
    {
        return ei1.r;
    }

    static RemoteControlView h(ei ei1)
    {
        return ei1.w;
    }

    static Activity i(ei ei1)
    {
        return ei1.b;
    }

    static PlayerResponse j(ei ei1)
    {
        return ei1.m;
    }

    static Analytics k(ei ei1)
    {
        return ei1.d;
    }

    static eq l(ei ei1)
    {
        return ei1.j;
    }

    static boolean m(ei ei1)
    {
        return ei1.B();
    }

    private void w()
    {
        v = null;
        z = null;
        u = 0;
        w.e();
        q = false;
    }

    private void x()
    {
        if (!t)
        {
            g.G();
            y.setVisibility(8);
            x.setVisibility(0);
            j.h(true);
            t = true;
        }
    }

    private String y()
    {
        if (f != null && f.o() != null)
        {
            return f.o().getScreenName();
        } else
        {
            return "";
        }
    }

    private boolean z()
    {
        return f != null && f.b() == com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED;
    }

    public final void a()
    {
        if (z())
        {
            if (A() && B())
            {
                d.b("RemotePlay");
                f.e();
                w.a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PLAYING);
                return;
            }
            if (z() && m != null)
            {
                d.b("RemotePlayVideo");
                r = true;
                f.a(m.getVideoId(), null, 0);
                w.a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNCONFIRMED);
                return;
            }
        }
    }

    public final void a(int i1)
    {
        if (z() && m != null)
        {
            f.c(i1);
            if (i1 < m.getLengthSeconds() * 1000 && f.n() != com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ENDED)
            {
                f.e();
                return;
            }
        }
    }

    public final void a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState remoteplayerstate)
    {
        v = remoteplayerstate;
        if (!A())
        {
            v = null;
        } else
        if (z() && f != null)
        {
            if (!B())
            {
                w.a(m.getPlayabilityStatus().b(), false);
                i.removeMessages(2);
                return;
            }
            b(remoteplayerstate);
            if (remoteplayerstate != com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ERROR)
            {
                RemoteControlView remotecontrolview = w;
                RemoteControl remotecontrol = f;
                remotecontrolview.a(remoteplayerstate, null);
                E();
                if (A())
                {
                    if (!i.hasMessages(1))
                    {
                        i.sendMessageDelayed(Message.obtain(i, 1), 1000L);
                    }
                } else
                {
                    i.removeMessages(1);
                }
            } else
            {
                Object obj = b;
                RemoteControl remotecontrol1 = f;
                obj = ((Activity) (obj)).getString(0);
                w.a(((String) (obj)), true);
            }
            if (remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.BUFFERING || remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNCONFIRMED)
            {
                if (!i.hasMessages(2))
                {
                    i.sendMessageDelayed(Message.obtain(i, 2), 30000L);
                    return;
                }
            } else
            {
                i.removeMessages(2);
                return;
            }
        }
    }

    public final void a(com.google.android.apps.youtube.app.remote.RemoteControl.State state)
    {
        if (m == null)
        {
            E();
        } else
        if (f.v())
        {
            boolean flag;
            if (m.getCaptionTracksUri() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            w.setHasCc(flag);
        }
        com.google.android.apps.youtube.app.ui.eo.a[state.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 85
    //                   2 126
    //                   3 265
    //                   4 279
    //                   5 314;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (m != null && !q)
        {
            q = true;
            e.a(m.getThumbnailDetails());
        }
_L2:
        return;
_L3:
        if (!t) goto _L2; else goto _L7
_L7:
        if (state != com.google.android.apps.youtube.app.remote.RemoteControl.State.ERROR)
        {
            d.a("RemoteStateChange", state.name());
        } else
        {
            d.a("RemoteError", f.c().a);
        }
        if (!t) goto _L2; else goto _L8
_L8:
        g.F();
        x.setVisibility(8);
        y.setVisibility(0);
        t = false;
        j.h(false);
        i.removeMessages(1);
        if (m == null) goto _L2; else goto _L9
_L9:
        A.a(m.getVideoId(), false, WatchFeature.REMOTE_QUEUE);
        return;
_L4:
        x();
        w.c();
        continue; /* Loop/switch isn't completed */
_L5:
        if (f.o() != null)
        {
            b(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PLAYING);
        }
        a(f.p());
        continue; /* Loop/switch isn't completed */
_L6:
        if (f.o() != null)
        {
            x();
            w.a(f.c(), f.o().getScreenName());
        }
        if (true) goto _L1; else goto _L10
_L10:
    }

    public final void a(RemoteControl remotecontrol)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(remotecontrol);
        if (f != null)
        {
            if (f == remotecontrol)
            {
                L.e("Already connected to the same remote control.");
                return;
            }
            o();
        }
        f = remotecontrol;
        if (s)
        {
            remotecontrol.a(this);
            remotecontrol.c(this);
        }
        C();
    }

    public final void a(WatchFeature watchfeature)
    {
        n = watchfeature;
    }

    public final void a(PlayerResponse playerresponse)
    {
        if (l != null)
        {
            l.a();
            l = null;
        }
        if (playerresponse == null)
        {
            m = null;
            q = false;
            return;
        }
        if (m != null && !playerresponse.getVideoId().equals(m.getVideoId()))
        {
            q = false;
            w.e();
        }
        if (playerresponse.getVideoId().equals(C))
        {
            C = "";
        }
        o = false;
        if (TextUtils.isEmpty(playerresponse.getVideoId()))
        {
            b(playerresponse.getPlayabilityStatus().b());
            return;
        } else
        {
            l = com.google.android.apps.youtube.common.a.d.a(com.google.android.apps.youtube.common.a.a.a(b, new ek(this)));
            h.a(playerresponse.getVideoId(), PlayerFetcher.a, "", "", -1, -1, l);
            return;
        }
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        z = subtitletrack;
        boolean flag;
        if (subtitletrack != null && !subtitletrack.isDisableOption())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w.setCcEnabled(flag);
    }

    public final void a(String s1)
    {
        if (z()) goto _L2; else goto _L1
_L1:
        L.c("Video changed received for a non connected remote. Will ignore");
_L4:
        return;
_L2:
        if (!TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (m != null)
        {
            d(m.getVideoId());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!A())
        {
            w();
            if (!s1.equals(C))
            {
                am am1 = A;
                String s2 = f.r();
                int i1 = f.q();
                WatchFeature watchfeature;
                if (n != null)
                {
                    watchfeature = n;
                } else
                {
                    watchfeature = WatchFeature.REMOTE_QUEUE;
                }
                am1.a(s2, s1, i1, false, watchfeature, true);
                return;
            }
        } else
        {
            d(s1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(List list)
    {
        if (m == null)
        {
            if (!list.isEmpty())
            {
                list = (String)list.get(0);
                if (!list.equals(C))
                {
                    A.a(f.r(), list, 0, false, WatchFeature.REMOTE_QUEUE, true);
                }
            }
            return;
        } else
        {
            A.a(f.r(), f.p(), f.q(), false, WatchFeature.REMOTE_QUEUE, true);
            D();
            return;
        }
    }

    public final void a(boolean flag)
    {
        B = flag;
        d(flag);
    }

    public final void a_(SubtitleTrack subtitletrack)
    {
        if (s())
        {
            f.b(subtitletrack);
        }
    }

    public final void b()
    {
        if (!z())
        {
            return;
        } else
        {
            d.b("RemotePause");
            f.f();
            w.a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PAUSED);
            return;
        }
    }

    public final void b(String s1)
    {
        o = true;
        p = s1;
        C = "";
        if (!z())
        {
            return;
        } else
        {
            w.a(s1, false);
            return;
        }
    }

    public final void b(boolean flag)
    {
        k.d(flag);
    }

    public final void c()
    {
        if (!z() || m == null)
        {
            return;
        } else
        {
            f.f();
            return;
        }
    }

    public final void c(String s1)
    {
        C = s1;
    }

    public final void c(boolean flag)
    {
        if (flag || B)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d(flag);
    }

    public final void d()
    {
        if (!f.k())
        {
            return;
        } else
        {
            A.a(f.r(), f.l(), f.q() + 1, false, WatchFeature.REMOTE_QUEUE, false);
            f.m();
            return;
        }
    }

    public final void e()
    {
        if (!f.h())
        {
            return;
        } else
        {
            A.a(f.r(), f.j(), f.q() - 1, false, WatchFeature.REMOTE_QUEUE, false);
            f.i();
            return;
        }
    }

    public final void f()
    {
    }

    public final void g()
    {
        c.a(m.getVideoId(), com.google.android.apps.youtube.common.a.a.a(b, new el(this)));
    }

    public final void h()
    {
    }

    public final void i()
    {
    }

    public final void j()
    {
    }

    public final void k()
    {
    }

    public final void l()
    {
    }

    public final void l_()
    {
        if (f != null && f.b() == com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED && m != null && !m.getPlayabilityStatus().c())
        {
            w.a(m.getPlayabilityStatus().b(), false);
        }
    }

    public final void m()
    {
        if (z())
        {
            f.e();
        }
    }

    public final void n()
    {
    }

    public final void o()
    {
        if (l != null)
        {
            l.a();
            l = null;
        }
        if (f != null)
        {
            f.b(this);
            a(com.google.android.apps.youtube.app.remote.RemoteControl.State.OFFLINE);
            f = null;
        }
    }

    public final void p()
    {
        boolean flag;
        if (!s)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "cannot call onResume() multiple times, need to call onPause() first");
        s = true;
        if (f != null)
        {
            f.a(this);
            f.c(this);
            C();
        }
    }

    public final void q()
    {
        com.google.android.apps.youtube.common.fromguava.c.b(s, "cannot call onPause() multiple times, need to call onResume() first");
        s = false;
        if (f != null)
        {
            f.b(this);
        }
    }

    public final boolean r()
    {
        return t;
    }

    public final boolean s()
    {
        return f != null;
    }

    public final int t()
    {
        return u;
    }

    public final com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState u()
    {
        return v;
    }

    public final SubtitleTrack v()
    {
        return z;
    }

    static 
    {
        com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState aremoteplayerstate[];
        int i1;
        i1 = 0;
        aremoteplayerstate = new com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState[3];
        aremoteplayerstate[0] = com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PLAYING;
        aremoteplayerstate[1] = com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PAUSED;
        aremoteplayerstate[2] = com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ENDED;
        if (aremoteplayerstate != null && aremoteplayerstate.length != 0) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptySet();
_L4:
        a = Collections.unmodifiableSet(((Set) (obj)));
        return;
_L2:
        HashSet hashset = new HashSet(aremoteplayerstate.length);
        int j1 = aremoteplayerstate.length;
        do
        {
            obj = hashset;
            if (i1 >= j1)
            {
                continue;
            }
            hashset.add(aremoteplayerstate[i1]);
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
