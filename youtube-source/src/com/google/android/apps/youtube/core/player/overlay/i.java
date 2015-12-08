// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.l;
import android.text.TextUtils;
import com.google.a.a.a.a.be;
import com.google.a.a.a.a.ez;
import com.google.a.a.a.a.fc;
import com.google.a.a.a.a.hx;
import com.google.a.a.a.a.il;
import com.google.a.a.a.a.ne;
import com.google.a.a.a.a.rm;
import com.google.a.a.a.a.rn;
import com.google.a.a.a.a.sx;
import com.google.a.a.a.a.sy;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.PlaybackClientManager;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.am;
import com.google.android.apps.youtube.core.player.event.aa;
import com.google.android.apps.youtube.core.player.event.ab;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.s;
import com.google.android.apps.youtube.core.player.u;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.InfoCardCollection;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.m;
import com.google.android.apps.youtube.datalib.innertube.t;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            g, o, k, l, 
//            j, n, m

public final class i
    implements u
{

    private int A;
    private be B;
    private List C;
    private int D;
    private hx E;
    private InfoCardCollection F;
    private List G;
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    private final Context h;
    private final g i;
    private final bj j;
    private final a k;
    private final am l;
    private final Handler m;
    private final ae n;
    private final t o;
    private final PlaybackClientManager p;
    private final s q;
    private boolean r;
    private d s;
    private d t;
    private d u;
    private d v;
    private ne w;
    private boolean x;
    private boolean y[];
    private boolean z[];

    public i(Context context, g g1, bj bj1, a a1, am am1, ae ae1, t t1, 
            l l1)
    {
        h = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        i = (g)com.google.android.apps.youtube.common.fromguava.c.a(g1);
        j = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        k = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        l = am1;
        m = new Handler(context.getMainLooper());
        n = (ae)com.google.android.apps.youtube.common.fromguava.c.a(ae1);
        o = t1;
        p = ae1.a();
        if (l1 != null)
        {
            q = new s(m, a1, bj1, p, t1, this, l1);
        } else
        {
            q = null;
        }
        A = -1;
        g1.setListener(new o(this, (byte)0));
    }

    private d a(sx sx1, com.google.android.apps.youtube.core.player.overlay.m m1)
    {
        if (sx1 == null || sx1.b.length == 0)
        {
            sx1 = null;
        } else
        {
            sx1 = sx1.b[0].b;
        }
        if (TextUtils.isEmpty(sx1))
        {
            return null;
        } else
        {
            sx1 = Uri.parse(sx1);
            m1 = com.google.android.apps.youtube.common.a.d.a(m1);
            j.a(sx1, com.google.android.apps.youtube.common.a.e.a(m, m1));
            return m1;
        }
    }

    static g a(i i1)
    {
        return i1.i;
    }

    private void a(ne ne1, InfoCardCollection infocardcollection)
    {
        boolean flag = true;
        b();
        r = true;
        w = ne1;
        if (ne1 != null)
        {
            i.setAdStyle(g);
            if (ne1.b != null && !TextUtils.isEmpty(ne1.b.f))
            {
                i.setFeaturedVideoTitle(ne1.b.f);
            }
            if (ne1.d.length != 0)
            {
                C = Arrays.asList(ne1.d);
                int i1 = C.size();
                y = new boolean[i1];
                z = new boolean[i1];
            }
        }
        if (q == null)
        {
            flag = false;
        }
        if (flag && infocardcollection != null)
        {
            F = infocardcollection;
            G = infocardcollection.getInfoCards();
        }
        if (w != null)
        {
            ne1 = w.c;
            if (ne1 != null)
            {
                s = a(((ez) (ne1)).g, ((com.google.android.apps.youtube.core.player.overlay.m) (new k(this, (byte)0))));
            }
            ne1 = w.b;
            if (ne1 != null)
            {
                t = a(((fc) (ne1)).e, ((com.google.android.apps.youtube.core.player.overlay.m) (new com.google.android.apps.youtube.core.player.overlay.l(this, (byte)0))));
            }
        }
    }

    static void a(i i1, int j1)
    {
        rm rm1 = ((m)i1.G.get(j1)).b();
        if (i1.p != null)
        {
            i1.p.c(j1);
        }
        i1.a(rm1.h);
    }

    private void a(boolean flag)
    {
        if (!d || e != flag)
        {
            d = true;
            e = flag;
            e();
            if (f())
            {
                i.a(flag);
            }
        }
    }

    private void a(byte abyte0[])
    {
        if (o != null && abyte0 != null && abyte0.length > 0)
        {
            com.google.android.apps.youtube.datalib.innertube.u u1 = o.a();
            u1.b(abyte0);
            o.a(u1, com.google.android.apps.youtube.datalib.a.m.a(com/google/a/a/a/a/il));
        }
    }

    static boolean a(i i1, boolean flag)
    {
        i1.x = true;
        return true;
    }

    static ne b(i i1)
    {
        return i1.w;
    }

    private void b()
    {
        if (s != null)
        {
            s.a();
            s = null;
        }
        if (t != null)
        {
            t.a();
            t = null;
        }
        if (u != null)
        {
            u.a();
            u = null;
        }
        if (v != null)
        {
            v.a();
            v = null;
        }
        r = false;
        i.a();
        b = false;
        c = false;
        d = false;
        e = false;
        x = false;
        y = null;
        z = null;
        A = -1;
        B = null;
        w = null;
        E = null;
        G = null;
        F = null;
        D = -1;
    }

    static void b(i i1, boolean flag)
    {
        i1.a(true);
    }

    static a c(i i1)
    {
        return i1.k;
    }

    private void c()
    {
        if (c)
        {
            c = false;
            i.g();
            e();
        }
    }

    private void d()
    {
        if (d)
        {
            d = false;
            i.h();
            e();
        }
    }

    static void d(i i1)
    {
        i1.c();
    }

    static be e(i i1)
    {
        return i1.B;
    }

    private void e()
    {
        am am1 = l;
        boolean flag;
        if (c || d || f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am1.a(flag);
    }

    private boolean f()
    {
        return !a || android.os.Build.VERSION.SDK_INT >= 11;
    }

    static boolean[] f(i i1)
    {
        return i1.z;
    }

    static int g(i i1)
    {
        return i1.A;
    }

    static boolean[] h(i i1)
    {
        return i1.y;
    }

    static void i(i i1)
    {
        i1.d();
    }

    static int j(i i1)
    {
        return i1.D;
    }

    static ae k(i i1)
    {
        return i1.n;
    }

    static InfoCardCollection l(i i1)
    {
        return i1.F;
    }

    static s m(i i1)
    {
        return i1.q;
    }

    public final void a()
    {
        n.i();
    }

    public final void handleInfoCardTeaserClickEvent(com.google.android.apps.youtube.core.player.event.b b1)
    {
        n.l();
        q.a(F, 0);
    }

    public final void handleVideoControlsVisibilityEvent(aa aa1)
    {
        g g1 = i;
        boolean flag;
        if (!aa1.a || g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.setVisible(flag);
    }

    public final void handleVideoFullscreenEvent(ab ab1)
    {
        a = ab1.a();
        if (!f())
        {
            i.g();
            i.h();
        } else
        {
            if (c)
            {
                i.f();
            }
            if (d)
            {
                i.a(e);
                return;
            }
        }
    }

    public final void handleVideoStageEvent(ac ac1)
    {
        g = ac1.c().onAd();
        if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.MEDIA_VIDEO_PLAY_REQUESTED)
        {
            a(ac1.d().getPlayerResponse().getExpandedAnnotation(), ac1.d().getPlayerResponse().getInfoCardCollection());
        }
        if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.MEDIA_PLAYING_VIDEO)
        {
            if (!r)
            {
                a(ac1.d().getPlayerResponse().getExpandedAnnotation(), ac1.d().getPlayerResponse().getInfoCardCollection());
            }
        } else
        {
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.AD_LOADED && ac1.e() != null)
            {
                VastAd vastad = ac1.e();
                if (vastad.shouldShowCtaAnnotations())
                {
                    ac1 = vastad.adAnnotations;
                } else
                {
                    ac1 = null;
                }
                a(ac1, vastad.adInfoCards);
                return;
            }
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.NEW)
            {
                b();
                return;
            }
        }
    }

    public final void handleVideoTimeEvent(com.google.android.apps.youtube.core.player.event.ae ae1)
    {
        int j2 = ae1.a();
        if (w == null) goto _L2; else goto _L1
_L1:
        if (w.c != null && !b)
        {
            b = true;
            i.d();
        }
        ae1 = w.b;
        be be1;
        int i1;
        if (ae1 != null)
        {
            if (!x && ((fc) (ae1)).b <= (long)j2 && (long)j2 < ((fc) (ae1)).c)
            {
                if (!c)
                {
                    c = true;
                    e();
                    if (f())
                    {
                        i.f();
                    }
                }
            } else
            {
                c();
            }
        }
        if (w.d.length == 0) goto _L2; else goto _L3
_L3:
        ae1 = null;
        int l1 = -1;
        for (i1 = 0; i1 < C.size(); i1++)
        {
            be1 = (be)C.get(i1);
            if (be1.b <= (long)j2 && be1.c > (long)j2 && (ae1 == null || be1.b > ((be) (ae1)).b))
            {
                ae1 = be1;
                l1 = i1;
            }
        }

        if (l1 != A)
        {
            A = l1;
            B = ae1;
            if (B != null)
            {
                i.setCallToActionText(B.e, B.h);
                i.setCallToActionImage(null);
                ae1 = B;
                if (ae1 != null)
                {
                    u = a(((be) (ae1)).j, new j(this, (byte)0));
                }
            }
        }
        if (B != null) goto _L5; else goto _L4
_L4:
        d();
_L7:
        return;
_L5:
        boolean flag1 = y[A];
        hx hx1;
        Iterator iterator;
        long l2;
        long l3;
        boolean flag;
        if (z[A] || (long)j2 < B.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1)
        {
            d();
        } else
        {
            a(flag);
        }
_L2:
        if (G != null && G.size() > 0)
        {
            int i2 = -1;
            ae1 = null;
label0:
            for (int j1 = 0; j1 < G.size(); j1++)
            {
                iterator = ((m)G.get(j1)).e().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    hx1 = (hx)iterator.next();
                    l2 = hx1.b;
                    l3 = hx1.d;
                    if (hx1.b <= (long)j2 && l2 + l3 > (long)j2 && (ae1 == null || hx1.b < ((hx) (ae1)).b))
                    {
                        i2 = j1;
                        ae1 = hx1;
                    }
                } while (true);
            }

            if (i2 != D || ae1 != E)
            {
                D = i2;
                E = ae1;
                if (D >= 0)
                {
                    ae1 = ((m)G.get(D)).a();
                    i.setInfoCardTeaserImage(null);
                    if (ae1 != null)
                    {
                        v = a(((rn) (ae1)).b, new n(this, (byte)0));
                    }
                    i.setInfoCardTeaserMessage(com.google.android.apps.youtube.datalib.innertube.a.b.a(((rn) (ae1)).c));
                    int k1 = D;
                    ae1 = ((m)G.get(k1)).a();
                    if (p != null)
                    {
                        p.b(k1);
                    }
                    a(((rn) (ae1)).e);
                }
            }
            if (D >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (f)
            {
                f = false;
                i.j();
                e();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (f) goto _L7; else goto _L6
_L6:
        f = true;
        e();
        if (f())
        {
            i.i();
            return;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }
}
