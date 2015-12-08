// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.SearchRecentSuggestions;
import com.android.volley.l;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.player.b;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.aj;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.bk;
import com.google.android.apps.youtube.app.remote.bw;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.common.network.YouTubeHttpClient;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.client.AdsClient;
import com.google.android.apps.youtube.core.client.DebugOnlyVmapAdRequester;
import com.google.android.apps.youtube.core.client.DeviceClassification;
import com.google.android.apps.youtube.core.client.a.c;
import com.google.android.apps.youtube.core.client.at;
import com.google.android.apps.youtube.core.client.bf;
import com.google.android.apps.youtube.core.client.bo;
import com.google.android.apps.youtube.core.client.bq;
import com.google.android.apps.youtube.core.client.bs;
import com.google.android.apps.youtube.core.client.bv;
import com.google.android.apps.youtube.core.client.bx;
import com.google.android.apps.youtube.core.client.ca;
import com.google.android.apps.youtube.core.client.cc;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.client.cf;
import com.google.android.apps.youtube.core.client.ch;
import com.google.android.apps.youtube.core.client.e;
import com.google.android.apps.youtube.core.client.h;
import com.google.android.apps.youtube.core.client.n;
import com.google.android.apps.youtube.core.identity.o;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.offline.store.r;
import com.google.android.apps.youtube.core.player.PlaybackClientManager;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.config.PlayerLibConfig;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.fetcher.d;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.t;
import com.google.android.apps.youtube.datalib.innertube.SearchService;
import com.google.android.apps.youtube.datalib.innertube.ab;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.innertube.ah;
import com.google.android.apps.youtube.datalib.innertube.al;
import com.google.android.apps.youtube.datalib.innertube.aq;
import com.google.android.apps.youtube.datalib.innertube.av;
import com.google.android.apps.youtube.datalib.innertube.ay;
import com.google.android.apps.youtube.datalib.innertube.bc;
import com.google.android.apps.youtube.datalib.innertube.v;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.offline.i;
import com.google.android.apps.youtube.datalib.offline.j;
import com.google.android.apps.youtube.datalib.offline.m;
import com.google.android.apps.youtube.medialib.player.x;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ay, bj, bu, cf, 
//            cr, dc, dh, di, 
//            dj, az, ba, bb, 
//            bc, bd, be, bf, 
//            bg, bh, bi, bk, 
//            bl, bm, bn, bo, 
//            bp, bq, br, bs, 
//            bt, bv, bw, bx, 
//            by, bz, ca, cb, 
//            cc, cd, ce, cg, 
//            ch, ci, cj, cl, 
//            cm, cn, co, cp, 
//            cq, cs, ct, cu, 
//            cv, cw, cx, cy, 
//            cz, da, db, dd, 
//            de, df, dg, aw, 
//            ac, ak, WatchWhileActivity

public final class ax extends a
    implements r, d
{

    private final f A = new bp(this);
    private final f B = new com.google.android.apps.youtube.app.bq(this);
    private final f C = new br(this);
    private final f D = new com.google.android.apps.youtube.app.bs(this);
    private final f E = new bt(this);
    private final f F = new com.google.android.apps.youtube.app.bv(this);
    private final f G = new com.google.android.apps.youtube.app.bw(this);
    private final f H = new com.google.android.apps.youtube.app.bx(this);
    private final f I = new by(this);
    private final f J = new bz(this);
    private final f K = new com.google.android.apps.youtube.app.ca(this);
    private final f L = new cb(this);
    private final f M = new com.google.android.apps.youtube.app.cc(this);
    private final f N = new cd(this);
    private final f O = new com.google.android.apps.youtube.app.ce(this);
    private final f P = new cg(this);
    private final f Q = new com.google.android.apps.youtube.app.ch(this);
    private final f R = new ci(this);
    private final f S = new cj(this);
    private final f T = new cl(this);
    private final f U = new cm(this);
    private final f V = new cn(this);
    private final f W = new co(this);
    private final f X = new cp(this);
    private final f Y = new cq(this);
    private final f Z = new cs(this);
    private final f aa = new ct(this);
    private final f ab = new cu(this);
    private final f ac = new cv(this);
    private final f ad = new cw(this);
    private final f ae = new cx(this);
    private final f af = new cy(this);
    private final f ag = new cz(this);
    private final f ah = new da(this);
    private final f ai = new db(this);
    private final f aj = new dd(this);
    private final f ak = new de(this);
    private final f al = new df(this);
    private final f am = new dg(this);
    private final AtomicReference an = new AtomicReference();
    private final f c = new com.google.android.apps.youtube.app.ay(this);
    private final f d = new bj(this);
    private final f e = new bu(this);
    private final f f = new com.google.android.apps.youtube.app.cf(this);
    private final f g = new cr(this);
    private final f h = new dc(this);
    private final f i = new dh(this);
    private final f j = new di(this);
    private final f k = new dj(this);
    private final f l = new az(this);
    private final f m = new ba(this);
    private final f n = new bb(this);
    private final f o = new com.google.android.apps.youtube.app.bc(this);
    private final f p = new bd(this);
    private final f q = new be(this);
    private final f r = new com.google.android.apps.youtube.app.bf(this);
    private final f s = new bg(this);
    private final f t = new bh(this);
    private final f u = new bi(this);
    private final f v = new com.google.android.apps.youtube.app.bk(this);
    private final f w = new bl(this);
    private final f x = new bm(this);
    private final f y = new bn(this);
    private final f z = new com.google.android.apps.youtube.app.bo(this);

    public ax(Context context)
    {
        super(context);
    }

    static Context A(ax ax1)
    {
        return ax1.a;
    }

    static f B(ax ax1)
    {
        return ax1.P;
    }

    static Context C(ax ax1)
    {
        return ax1.a;
    }

    static Context D(ax ax1)
    {
        return ax1.a;
    }

    static Context E(ax ax1)
    {
        return ax1.a;
    }

    static Context F(ax ax1)
    {
        return ax1.a;
    }

    static Context G(ax ax1)
    {
        return ax1.a;
    }

    static Context H(ax ax1)
    {
        return ax1.a;
    }

    static Context I(ax ax1)
    {
        return ax1.a;
    }

    static Context J(ax ax1)
    {
        return ax1.a;
    }

    static Context K(ax ax1)
    {
        return ax1.a;
    }

    static Context L(ax ax1)
    {
        return ax1.a;
    }

    static Context M(ax ax1)
    {
        return ax1.a;
    }

    static Context N(ax ax1)
    {
        return ax1.a;
    }

    static Context O(ax ax1)
    {
        return ax1.a;
    }

    static Context P(ax ax1)
    {
        return ax1.a;
    }

    static Context Q(ax ax1)
    {
        return ax1.a;
    }

    static f R(ax ax1)
    {
        return ax1.aj;
    }

    static Context a(ax ax1)
    {
        return ax1.a;
    }

    static Context b(ax ax1)
    {
        return ax1.a;
    }

    static Context c(ax ax1)
    {
        return ax1.a;
    }

    static Context d(ax ax1)
    {
        return ax1.a;
    }

    static Context e(ax ax1)
    {
        return ax1.a;
    }

    static Context f(ax ax1)
    {
        return ax1.a;
    }

    static Context g(ax ax1)
    {
        return ax1.a;
    }

    static f h(ax ax1)
    {
        return ax1.h;
    }

    static f i(ax ax1)
    {
        return ax1.m;
    }

    static f j(ax ax1)
    {
        return ax1.ag;
    }

    static f k(ax ax1)
    {
        return ax1.i;
    }

    static x l(ax ax1)
    {
        return ax1.be().a(ax1.a, new b(ax1), ax1.bj(), ax1.b().n(), new com.google.android.apps.youtube.app.player.a(ax1.aP(), ax1.b()));
    }

    static f m(ax ax1)
    {
        return ax1.ak;
    }

    static f n(ax ax1)
    {
        return ax1.ai;
    }

    static f o(ax ax1)
    {
        return ax1.F;
    }

    static f p(ax ax1)
    {
        return ax1.E;
    }

    static f q(ax ax1)
    {
        return ax1.ah;
    }

    static Context r(ax ax1)
    {
        return ax1.a;
    }

    static Context s(ax ax1)
    {
        return ax1.a;
    }

    static f t(ax ax1)
    {
        return ax1.af;
    }

    static Context u(ax ax1)
    {
        return ax1.a;
    }

    static f v(ax ax1)
    {
        return ax1.I;
    }

    static Context w(ax ax1)
    {
        return ax1.a;
    }

    static Context x(ax ax1)
    {
        return ax1.a;
    }

    static Context y(ax ax1)
    {
        return ax1.a;
    }

    static f z(ax ax1)
    {
        return ax1.Y;
    }

    public final com.google.android.apps.youtube.datalib.innertube.d A()
    {
        return (com.google.android.apps.youtube.datalib.innertube.d)B.b();
    }

    public final com.google.android.apps.youtube.datalib.e.b B()
    {
        return (com.google.android.apps.youtube.datalib.e.b)F.b();
    }

    public final com.google.android.apps.youtube.datalib.e.b C()
    {
        return (com.google.android.apps.youtube.datalib.e.b)E.b();
    }

    public final com.google.android.apps.youtube.core.client.ax D()
    {
        return (com.google.android.apps.youtube.core.client.ax)af.b();
    }

    public final AdsClient E()
    {
        return (AdsClient)K.b();
    }

    public final bc F()
    {
        return (bc)w.b();
    }

    public final av G()
    {
        return (av)x.b();
    }

    public final h H()
    {
        return (h)J.b();
    }

    public final ca I()
    {
        return (ca)L.b();
    }

    public final e J()
    {
        return (e)M.b();
    }

    public final c K()
    {
        return (c)N.b();
    }

    public final cf L()
    {
        return (cf)O.b();
    }

    public final ce M()
    {
        return (ce)Q.b();
    }

    public final bq N()
    {
        return (bq)R.b();
    }

    public final at O()
    {
        return (at)S.b();
    }

    public final bk P()
    {
        return (bk)T.b();
    }

    public final YouTubeTvScreensMonitor Q()
    {
        return (YouTubeTvScreensMonitor)U.b();
    }

    public final bw R()
    {
        return (bw)V.b();
    }

    public final m S()
    {
        return (m)aj.b();
    }

    public final com.google.android.apps.youtube.app.notification.b T()
    {
        return (com.google.android.apps.youtube.app.notification.b)X.b();
    }

    public final ab U()
    {
        return (ab)C.b();
    }

    public final com.google.android.apps.youtube.datalib.c.f V()
    {
        return (com.google.android.apps.youtube.datalib.c.f)Z.b();
    }

    public final an W()
    {
        return (an)aa.b();
    }

    public final aj X()
    {
        return (aj)ab.b();
    }

    public final ac Y()
    {
        return (ac)ac.b();
    }

    public final p Z()
    {
        return (p)ae.b();
    }

    protected final YouTubeHttpClient a(HttpClient httpclient)
    {
        return new YouTubeHttpClient(a, httpclient, String.format(Locale.US, "%s/%s", new Object[] {
            a.getPackageName(), PackageUtil.f(a)
        }));
    }

    protected final AdsClient a()
    {
        com.google.android.apps.youtube.core.client.r r1 = new com.google.android.apps.youtube.core.client.r(aJ(), aM(), aN(), aG(), bf());
        r1.a((h)J.b()).a(this).a(aE());
        if (PackageUtil.b(a) && aP().getBoolean("debugAdEnable", false))
        {
            r1.a(new DebugOnlyVmapAdRequester(a, aJ(), aM(), aN(), aG(), aP(), (h)J.b()));
        }
        return new com.google.android.apps.youtube.app.a.b(r1.a(), aT(), this, (h)J.b(), aG(), b());
    }

    public final PlayerFetcher a(VastAd vastad)
    {
        return new PlayerFetcher(bf(), o(), aa(), f(), aT(), q(), aJ(), new com.google.android.apps.youtube.core.client.a(vastad), aG());
    }

    public final w aa()
    {
        return (w)al.b();
    }

    public final i ab()
    {
        return (i)am.b();
    }

    public final ae ac()
    {
        return (ae)D.b();
    }

    public final ad ad()
    {
        return (ad)o.b();
    }

    public final com.google.android.apps.youtube.core.suggest.a ae()
    {
        return (com.google.android.apps.youtube.core.suggest.a)f.b();
    }

    public final Context af()
    {
        return a;
    }

    public final com.google.android.apps.youtube.app.a.a ag()
    {
        return (com.google.android.apps.youtube.app.a.a)E();
    }

    public final String ah()
    {
        return com.google.android.gsf.e.a(a.getContentResolver(), "youtube_client_id", "android-google");
    }

    public final AtomicReference ai()
    {
        return an;
    }

    public final boolean aj()
    {
        return b().l();
    }

    protected final boolean ak()
    {
        return b().m();
    }

    public final boolean al()
    {
        return b().n();
    }

    protected final String am()
    {
        return Util.a(a, PackageUtil.f(a), b().E());
    }

    public final PlaybackClientManager an()
    {
        com.google.android.apps.youtube.core.client.d d1 = new com.google.android.apps.youtube.core.client.d((com.google.android.apps.youtube.datalib.e.b)G.b(), (com.google.android.apps.youtube.datalib.e.b)E.b(), aG(), bf());
        bf bf1 = new bf(aG(), aJ(), aH(), (com.google.android.apps.youtube.datalib.innertube.m)r.b());
        bs bs1 = new bs(a, aG(), be().a(), new t());
        bv bv1 = new bv(aT(), q(), aG());
        bx bx1 = new bx((com.google.android.apps.youtube.datalib.e.b)F.b(), aX(), (DeviceClassification)Y.b(), (com.google.android.apps.youtube.core.utils.a)I.b());
        cc cc1 = new cc((com.google.android.apps.youtube.datalib.e.b)F.b(), aG(), aX(), (DeviceClassification)Y.b(), be().a());
        ch ch1 = new ch((com.google.android.apps.youtube.datalib.e.b)F.b(), aG(), ba(), aX(), bf(), (DeviceClassification)Y.b(), L());
        return new PlaybackClientManager(new SecureRandom(), aX(), d1, bf1, bs1, bv1, bx1, cc1, ch1);
    }

    public final PlayerFetcher ao()
    {
        return new PlayerFetcher(bf(), o(), aa(), f(), aT(), q(), aJ(), aq(), aG());
    }

    public final PlayerFetcher ap()
    {
        return (PlayerFetcher)W.b();
    }

    public final ag aq()
    {
        return new n((h)J.b());
    }

    public final ag ar()
    {
        return new bo(P());
    }

    public final com.google.android.apps.youtube.datalib.innertube.t as()
    {
        return new com.google.android.apps.youtube.datalib.innertube.t((com.google.android.apps.youtube.datalib.innertube.r)m.b(), new com.google.android.apps.youtube.datalib.innertube.p(at()), (l)ag.b());
    }

    public final List at()
    {
        return (List)i.b();
    }

    public final au au()
    {
        return b();
    }

    protected final l b(HttpClient httpclient)
    {
        httpclient = new com.google.android.apps.youtube.datalib.a.h(new com.android.volley.toolbox.d(httpclient), ay(), aG());
        return new l(new com.android.volley.toolbox.t(), httpclient);
    }

    public final aw b()
    {
        return (aw)c.b();
    }

    public final List c()
    {
        return (List)j.b();
    }

    public final List d()
    {
        return (List)k.b();
    }

    public final com.google.android.apps.youtube.datalib.config.b e()
    {
        return com.google.android.apps.youtube.app.ak.a;
    }

    public final Class g()
    {
        return com/google/android/apps/youtube/app/WatchWhileActivity;
    }

    public final PlayerLibConfig h()
    {
        return (PlayerLibConfig)d.b();
    }

    public final com.google.android.apps.youtube.datalib.config.c i()
    {
        return (com.google.android.apps.youtube.datalib.config.c)ai.b();
    }

    public final SearchRecentSuggestions j()
    {
        return (SearchRecentSuggestions)e.b();
    }

    public final o k()
    {
        return (o)g.b();
    }

    public final l l()
    {
        return (l)ag.b();
    }

    public final com.google.android.apps.youtube.datalib.offline.n m()
    {
        return (com.google.android.apps.youtube.datalib.offline.n)l.b();
    }

    public final j n()
    {
        return (j)ak.b();
    }

    public final ah o()
    {
        return (ah)n.b();
    }

    public final com.google.android.apps.youtube.datalib.innertube.ad p()
    {
        return (com.google.android.apps.youtube.datalib.innertube.ad)p.b();
    }

    public final q q()
    {
        return (q)ad.b();
    }

    public final com.google.android.apps.youtube.app.offline.sync.b r()
    {
        return (com.google.android.apps.youtube.app.offline.sync.b)H.b();
    }

    public final com.google.android.apps.youtube.datalib.innertube.j s()
    {
        return (com.google.android.apps.youtube.datalib.innertube.j)q.b();
    }

    public final ay t()
    {
        return (ay)s.b();
    }

    public final com.google.android.apps.youtube.core.player.fetcher.e u()
    {
        return (com.google.android.apps.youtube.core.player.fetcher.e)t.b();
    }

    public final SearchService v()
    {
        return (SearchService)u.b();
    }

    public final com.google.android.apps.youtube.datalib.distiller.a w()
    {
        return (com.google.android.apps.youtube.datalib.distiller.a)y.b();
    }

    public final v x()
    {
        return (v)z.b();
    }

    public final al y()
    {
        return (al)A.b();
    }

    public final aq z()
    {
        return (aq)v.b();
    }
}
