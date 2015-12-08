// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.cache.l;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.ab;
import com.google.android.apps.youtube.core.async.ad;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.ag;
import com.google.android.apps.youtube.core.async.an;
import com.google.android.apps.youtube.core.async.aq;
import com.google.android.apps.youtube.core.async.as;
import com.google.android.apps.youtube.core.async.d;
import com.google.android.apps.youtube.core.async.k;
import com.google.android.apps.youtube.core.async.n;
import com.google.android.apps.youtube.core.async.p;
import com.google.android.apps.youtube.core.async.y;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.ae;
import com.google.android.apps.youtube.core.converter.http.ao;
import com.google.android.apps.youtube.core.converter.http.ap;
import com.google.android.apps.youtube.core.converter.http.bk;
import com.google.android.apps.youtube.core.converter.http.bl;
import com.google.android.apps.youtube.core.converter.http.bx;
import com.google.android.apps.youtube.core.converter.http.bz;
import com.google.android.apps.youtube.core.converter.http.ca;
import com.google.android.apps.youtube.core.converter.http.cs;
import com.google.android.apps.youtube.core.converter.http.ct;
import com.google.android.apps.youtube.core.converter.http.do;
import com.google.android.apps.youtube.core.converter.http.dx;
import com.google.android.apps.youtube.core.converter.http.f;
import com.google.android.apps.youtube.core.converter.http.fm;
import com.google.android.apps.youtube.core.converter.http.fn;
import com.google.android.apps.youtube.core.converter.http.fo;
import com.google.android.apps.youtube.core.converter.http.j;
import com.google.android.apps.youtube.core.converter.http.m;
import com.google.android.apps.youtube.core.identity.ar;
import com.google.android.apps.youtube.core.identity.b;
import com.google.android.apps.youtube.core.utils.ai;
import com.google.android.apps.youtube.core.utils.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m, bc, w, ag, 
//            ae, af, x, z, 
//            ad, ac, ab

public final class v extends com.google.android.apps.youtube.core.client.m
    implements bc
{

    private a A;
    private a B;
    private a C;
    private a D;
    private a E;
    private a F;
    private a G;
    private a H;
    private af I;
    private af J;
    private af K;
    private af L;
    private af M;
    private af N;
    private af O;
    private af P;
    private af Q;
    private af R;
    private af S;
    private af T;
    private af U;
    private af V;
    private af W;
    private af X;
    private af Y;
    private af Z;
    protected final Context a;
    private af aA;
    private af aB;
    private af aC;
    private af aD;
    private af aE;
    private af aF;
    private com.google.android.apps.youtube.common.fromguava.d aG;
    private com.google.android.apps.youtube.common.fromguava.d aH;
    private final AtomicLong aI = new AtomicLong(0L);
    private af aJ;
    private b aK;
    private af aL;
    private final com.google.android.apps.youtube.core.async.f aM;
    private af aa;
    private af ab;
    private af ac;
    private af ad;
    private g ae;
    private af af;
    private af ag;
    private af ah;
    private af ai;
    private af aj;
    private af ak;
    private af al;
    private af am;
    private af an;
    private af ao;
    private af ap;
    private af aq;
    private af ar;
    private af as;
    private af at;
    private af au;
    private af av;
    private af aw;
    private af ax;
    private af ay;
    private af az;
    protected ao h;
    private final ai i;
    private final GDataRequestFactory j;
    private final ScheduledExecutorService k = Executors.newScheduledThreadPool(1);
    private ao l;
    private ao m;
    private ao n;
    private fo o;
    private ca p;
    private ca q;
    private bz r;
    private a s;
    private a t;
    private a u;
    private a v;
    private a w;
    private a x;
    private a y;
    private a z;

    public v(Context context, Executor executor, HttpClient httpclient, com.google.android.apps.youtube.common.e.b b1, com.google.android.apps.youtube.core.converter.n n1, GDataRequestFactory gdatarequestfactory, com.google.android.apps.youtube.core.identity.l l1, 
            String s1)
    {
        super(executor, httpclient, n1, s1, b1);
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        i = new ai(context.getContentResolver());
        j = (GDataRequestFactory)com.google.android.apps.youtube.common.fromguava.c.a(gdatarequestfactory);
        aM = new w(this, l1);
    }

    static GDataRequestFactory a(v v1)
    {
        return v1.j;
    }

    private k b(af af1)
    {
        return new k(af1, d, aI, 5000L, k);
    }

    private y c(af af1)
    {
        return new y(af1, aI, d);
    }

    private af z()
    {
        com.google.android.apps.youtube.core.async.b b1 = a(a(m, new fm(g)));
        return new aq(s, b1, j, d, 0x6ddd00L);
    }

    public final GDataRequestFactory a()
    {
        return j;
    }

    public final void a(int i1, com.google.android.apps.youtube.common.a.b b1)
    {
        ad.a(j.a(15), b1);
    }

    public final void a(int i1, String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        R.a(j.a(i1, s1), b1);
    }

    public final void a(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        af af1 = S;
        GDataRequestFactory gdatarequestfactory = j;
        af1.a(GDataRequestFactory.a(uri), b1);
    }

    public final void a(com.google.android.apps.youtube.common.a.b b1)
    {
        aa.a(j.f(), b1);
    }

    public final void a(DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, b b1, ar ar1, com.google.android.apps.youtube.core.async.GDataRequest.Version version)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(deviceauthorizerforv2apis);
        com.google.android.apps.youtube.common.fromguava.c.a(version);
        aK = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        d();
        aG = new g("newsubscriptionvideos");
        aH = new g("subtivity");
        h = new ao(HttpMethod.GET, deviceauthorizerforv2apis, list, i, version, ar1);
        l = new ao(HttpMethod.PUT, "application/atom+xml", deviceauthorizerforv2apis, list, i, version, ar1);
        m = new ao(HttpMethod.POST, "application/atom+xml", deviceauthorizerforv2apis, list, i, version, ar1);
        n = new ao(HttpMethod.DELETE, "application/atom+xml", deviceauthorizerforv2apis, list, i, version, ar1);
        o = new fo(g);
        x = a(20);
        s = a(500);
        t = a(500);
        deviceauthorizerforv2apis = new as(a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (o)))))), t, j, d);
        I = a(s, ((af) (deviceauthorizerforv2apis)), 0xdbba00L);
        J = com.google.android.apps.youtube.core.async.d.a(a(s, ((af) (deviceauthorizerforv2apis)), 0L), b1, aM);
        K = com.google.android.apps.youtube.core.async.d.a(a(s, ((af) (deviceauthorizerforv2apis)), 0x1b7740L), b1, aM);
        w = a(50);
        y = new l(w, s, new com.google.android.apps.youtube.core.client.ag(this, (byte)0));
        L = a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (new fn(g))));
        z = a(20);
        B = a(100);
        A = new l(z, B, new com.google.android.apps.youtube.core.client.ae(this, (byte)0));
        C = a(100);
        D = a(50);
        E = new l(D, C, new com.google.android.apps.youtube.core.client.af(this, (byte)0));
        F = a(100);
        G = a(100);
        H = a(100);
        r = new bz(g);
        q = ca.c(g);
        M = a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (r)));
        deviceauthorizerforv2apis = a(M);
        X = a(E, ((af) (deviceauthorizerforv2apis)), 0x1b7740L);
        deviceauthorizerforv2apis = a(M);
        Y = a(E, ((af) (deviceauthorizerforv2apis)), 0x493e0L);
        deviceauthorizerforv2apis = a(M);
        af = com.google.android.apps.youtube.core.async.d.a(a(E, ((af) (deviceauthorizerforv2apis)), 0x1b7740L), aK, aM);
        deviceauthorizerforv2apis = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (q))))));
        V = a(C, ((af) (deviceauthorizerforv2apis)), 0x1b7740L);
        W = com.google.android.apps.youtube.core.async.d.a(V, b1, aM);
        deviceauthorizerforv2apis = a(L);
        N = a(y, ((af) (deviceauthorizerforv2apis)), 0x6ddd00L);
        deviceauthorizerforv2apis = a(L);
        O = a(y, ((af) (deviceauthorizerforv2apis)), 0x1b7740L);
        P = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (new com.google.android.apps.youtube.core.converter.http.k(g)))))));
        deviceauthorizerforv2apis = new com.google.android.apps.youtube.core.converter.http.l(g);
        deviceauthorizerforv2apis = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))))));
        Q = a(H, ((af) (deviceauthorizerforv2apis)), 0x6ddd00L);
        deviceauthorizerforv2apis = new j(g);
        deviceauthorizerforv2apis = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))))));
        R = a(H, ((af) (deviceauthorizerforv2apis)), 0x6ddd00L);
        deviceauthorizerforv2apis = new dx(g);
        deviceauthorizerforv2apis = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))))));
        S = a(F, ((af) (deviceauthorizerforv2apis)), 0x493e0L);
        deviceauthorizerforv2apis = new m(g);
        deviceauthorizerforv2apis = a(((af) (com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))), aK, aM))));
        T = a(G, ((af) (deviceauthorizerforv2apis)), 0x1b7740L);
        deviceauthorizerforv2apis = new ae(g);
        deviceauthorizerforv2apis = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))))));
        U = a(x, ((af) (deviceauthorizerforv2apis)), 0x6ddd00L);
        deviceauthorizerforv2apis = new f(g);
        deviceauthorizerforv2apis = a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis)));
        deviceauthorizerforv2apis = a(((af) (a(((a) (e())), ((af) (deviceauthorizerforv2apis)), 0x5265c00L))));
        Z = a(((a) (a(20))), ((af) (deviceauthorizerforv2apis)), 0x6ddd00L);
        aa = com.google.android.apps.youtube.core.async.d.a(S, b1, aM);
        deviceauthorizerforv2apis = a(L);
        ac = com.google.android.apps.youtube.core.async.d.a(a(y, ((af) (deviceauthorizerforv2apis)), 0x1b7740L), aK, aM);
        deviceauthorizerforv2apis = a(L);
        ad = com.google.android.apps.youtube.core.async.d.a(a(y, ((af) (deviceauthorizerforv2apis)), 0x493e0L), aK, aM);
        ae = new g("uploads");
        deviceauthorizerforv2apis = new cs(g);
        deviceauthorizerforv2apis = a(((af) (com.google.android.apps.youtube.core.async.d.a(b(a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis)))), aK, aM))));
        ag = a(A, ((af) (deviceauthorizerforv2apis)), 0x1b7740L);
        deviceauthorizerforv2apis = new bx(g);
        deviceauthorizerforv2apis = a(((af) (com.google.android.apps.youtube.core.async.d.a(b(a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis)))), aK, aM))));
        ah = a(B, ((af) (deviceauthorizerforv2apis)), 0x1b7740L);
        ai = com.google.android.apps.youtube.core.async.ag.a(ac);
        ab = a(((af) (new ab(j, V, N))));
        deviceauthorizerforv2apis = com.google.android.apps.youtube.core.converter.http.ap.a(g);
        aj = com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (m)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))), b1, aM);
        ak = com.google.android.apps.youtube.core.async.b.a(b, aj);
        am = new x(this, s, ak);
        al = com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (n)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))), b1, aM);
        deviceauthorizerforv2apis = com.google.android.apps.youtube.common.e.g.a();
        list = new ct(g);
        list = c(com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (m)), ((com.google.android.apps.youtube.core.converter.http.ay) (list))), aK, aM));
        list = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), G, ((af) (list)));
        list = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), H, ((af) (list)));
        list = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), z, ((af) (list)));
        deviceauthorizerforv2apis = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), B, ((af) (list)));
        deviceauthorizerforv2apis = a(aG, w, ((af) (deviceauthorizerforv2apis)));
        an = a(((af) (a(aH, x, ((af) (deviceauthorizerforv2apis))))));
        deviceauthorizerforv2apis = com.google.android.apps.youtube.common.e.g.a();
        list = c(al);
        list = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), G, ((af) (list)));
        list = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), H, ((af) (list)));
        list = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), z, ((af) (list)));
        deviceauthorizerforv2apis = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), B, ((af) (list)));
        deviceauthorizerforv2apis = a(aG, w, ((af) (deviceauthorizerforv2apis)));
        ao = a(((af) (a(aH, x, ((af) (deviceauthorizerforv2apis))))));
        p = ca.b(g);
        deviceauthorizerforv2apis = new p(w, aj);
        ap = a(((af) (new z(this, new g("playlists"), D, deviceauthorizerforv2apis))));
        aq = a(((af) (new n(w, al))));
        deviceauthorizerforv2apis = com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (m)), ((com.google.android.apps.youtube.core.converter.http.ay) (p))), aK, aM);
        ar = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("playlists"))), D, ((af) (deviceauthorizerforv2apis))))));
        as = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("playlists"))), D, al))));
        deviceauthorizerforv2apis = com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (m)), ((com.google.android.apps.youtube.core.converter.http.ay) (o))), aK, aM);
        at = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("favorites"))), w, ((af) (deviceauthorizerforv2apis))))));
        av = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("watch_later"))), w, aj))));
        aw = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("watch_history"))), w, aj))));
        ax = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("watch_history"))), w, al))));
        ay = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("watch_history"))), w, aj))));
        au = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("favorites"))), w, al))));
        az = a(((af) (com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (m)), ((com.google.android.apps.youtube.core.converter.http.ay) (new do()))), aK, aM))));
        aA = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("uploads"))), w, al))));
        aB = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("watch_later"))), w, al))));
        deviceauthorizerforv2apis = com.google.android.apps.youtube.core.async.d.a(a(((com.google.android.apps.youtube.core.converter.c) (l)), ((com.google.android.apps.youtube.core.converter.http.ay) (o))), aK, aM);
        aC = a(((af) (a(((com.google.android.apps.youtube.common.fromguava.d) (new g("uploads"))), w, ((af) (deviceauthorizerforv2apis))))));
        u = a(300);
        v = new l(u, s, new com.google.android.apps.youtube.core.client.ad(this, (byte)0));
        deviceauthorizerforv2apis = new bl(g);
        deviceauthorizerforv2apis = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))))));
        aD = com.google.android.apps.youtube.core.async.an.a(v, deviceauthorizerforv2apis, d, 60000L);
        deviceauthorizerforv2apis = new bk(g);
        deviceauthorizerforv2apis = a(((af) (a(((com.google.android.apps.youtube.core.converter.c) (h)), ((com.google.android.apps.youtube.core.converter.http.ay) (deviceauthorizerforv2apis))))));
        aE = a(((a) (new l(a(20), v, new ac(this, (byte)0)))), ((af) (deviceauthorizerforv2apis)), 60000L);
        deviceauthorizerforv2apis = new com.google.android.apps.youtube.core.client.ab(this);
        list = a(aj);
        aF = a(((com.google.android.apps.youtube.common.fromguava.d) (deviceauthorizerforv2apis)), F, ((af) (list)));
        aJ = z();
        aL = new ad(z());
    }

    public final void a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed channelfeed, int i1, com.google.android.apps.youtube.common.a.b b1)
    {
        R.a(j.a(channelfeed, i1), b1);
    }

    public final void a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed standardfeed, String s1, String s2, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter, com.google.android.apps.youtube.common.a.b b1)
    {
        standardfeed = j.a(standardfeed, s1, s2, timefilter);
        N.a(standardfeed, b1);
    }

    public final void a(String s1)
    {
        B.b(j.h(s1));
    }

    public final void a(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        I.a(j.a(s1), b1);
    }

    public final void a(String s1, com.google.android.apps.youtube.core.async.GDataRequestFactory.ComplaintReason complaintreason, String s2, com.google.android.apps.youtube.common.a.b b1)
    {
        am.a(j.a(s1, complaintreason, s2), b1);
    }

    public final void a(String s1, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy, String s2, String s3, String s4, String s5, Pair pair, 
            com.google.android.apps.youtube.common.a.b b1)
    {
        s1 = j.a(s1, privacy, s2, s3, s4, s5, pair);
        az.a(s1, b1);
    }

    public final void a(String s1, String s2, String s3, String s4, String s5, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy, Map map, 
            String s6, String s7, Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        GDataRequestFactory gdatarequestfactory = j;
        s1 = GDataRequestFactory.a(s1, s2, s3, s4, s5, privacy, map, s6, s7, uri);
        aC.a(s1, b1);
    }

    public final void a(String s1, boolean flag, com.google.android.apps.youtube.common.a.b b1)
    {
        ar.a(j.a(s1, flag), b1);
    }

    public final af b()
    {
        return I;
    }

    public final void b(int i1, com.google.android.apps.youtube.common.a.b b1)
    {
        ac.a(j.b(15), b1);
    }

    public final void b(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        af af1 = au;
        GDataRequestFactory gdatarequestfactory = j;
        af1.a(GDataRequestFactory.k(uri), b1);
    }

    public final void b(com.google.android.apps.youtube.common.a.b b1)
    {
        ay.a(j.r(), b1);
    }

    public final void b(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        Z.a(j.j(s1), b1);
    }

    public final af c()
    {
        return N;
    }

    public final void c(int i1, com.google.android.apps.youtube.common.a.b b1)
    {
        ai.a(j.c(15), b1);
    }

    public final void c(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        af af1 = aB;
        GDataRequestFactory gdatarequestfactory = j;
        af1.a(GDataRequestFactory.i(uri), b1);
    }

    public final void c(com.google.android.apps.youtube.common.a.b b1)
    {
        aF.a(j.s(), b1);
    }

    public final void c(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        J.a(j.a(s1), b1);
    }

    public final void d(int i1, com.google.android.apps.youtube.common.a.b b1)
    {
        ac.a(j.d(15), b1);
    }

    public final void d(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        af af1 = ax;
        GDataRequestFactory gdatarequestfactory = j;
        af1.a(GDataRequestFactory.j(uri), b1);
    }

    public final void d(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        V.a(j.f(s1), b1);
    }

    public final void e(int i1, com.google.android.apps.youtube.common.a.b b1)
    {
        Q.a(j.e(i1), b1);
    }

    public final void e(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        af af1 = ao;
        GDataRequestFactory gdatarequestfactory = j;
        af1.a(GDataRequestFactory.m(uri), b1);
    }

    public final void e(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        ab.a(s1, b1);
    }

    public final af f()
    {
        return R;
    }

    public final void f(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        af af1 = aA;
        GDataRequestFactory gdatarequestfactory = j;
        af1.a(GDataRequestFactory.l(uri), b1);
    }

    public final void f(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        K.a(j.e(s1), b1);
    }

    public final af g()
    {
        return Q;
    }

    public final void g(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        ah.a(j.h(s1), b1);
    }

    public final void h()
    {
        w.a(ae);
    }

    public final void h(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        S.a(j.d(s1), b1);
    }

    public final void i()
    {
        s.a();
        t.a();
        u.a();
        v.a();
        w.a();
        x.a();
        y.a();
        z.a();
        A.a();
        B.a();
        C.a();
        D.a();
        E.a();
        F.a();
        G.a();
    }

    public final void i(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        T.a(j.c(s1), b1);
    }

    public final af j()
    {
        return ac;
    }

    public final void j(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        at.a(j.k(s1), b1);
    }

    public final af k()
    {
        return N;
    }

    public final void k(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        av.a(j.l(s1), b1);
    }

    public final af l()
    {
        return N;
    }

    public final void l(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        aw.a(j.m(s1), b1);
    }

    public final af m()
    {
        return ad;
    }

    public final void m(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        an.a(j.o(s1), b1);
    }

    public final af n()
    {
        return U;
    }

    public final void n(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        as.a(j.n(s1), b1);
    }

    public final af o()
    {
        return af;
    }

    public final af p()
    {
        return X;
    }

    public final af q()
    {
        return ai;
    }

    public final af r()
    {
        return ac;
    }

    public final af s()
    {
        return ac;
    }

    public final af t()
    {
        return ac;
    }

    public final af u()
    {
        return aE;
    }

    public final af v()
    {
        return ac;
    }

    public final af w()
    {
        return ag;
    }

    public final af x()
    {
        return aJ;
    }

    public final af y()
    {
        return aL;
    }
}
