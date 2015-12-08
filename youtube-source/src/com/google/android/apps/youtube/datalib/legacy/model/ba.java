// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.a.a.a.a.fj;
import com.google.a.a.a.a.ne;
import com.google.a.a.a.a.sb;
import com.google.android.apps.youtube.common.e.c;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.datalib.innertube.model.InfoCardCollection;
import com.google.android.apps.youtube.datalib.innertube.model.PlaybackTracking;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, VastAd, Survey

public class ba
    implements r
{

    private List A;
    private List B;
    private List C;
    private List D;
    private List E;
    private List F;
    private List G;
    private List H;
    private List I;
    private List J;
    private Uri K;
    private Uri L;
    private long M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private ne T;
    private InfoCardCollection U;
    private long V;
    private boolean W;
    private boolean X;
    private Uri Y;
    private VastAd Z;
    public final int a;
    private VastAd aa;
    private List ab;
    private long ac;
    private List ad;
    private Survey ae;
    private String af;
    private List b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Uri h;
    private String i;
    private String j;
    private VastAd.BillingPartner k;
    private String l;
    private int m;
    private sb n;
    private VideoStreamingData o;
    private PlaybackTracking p;
    private PlayerConfig q;
    private Uri r;
    private List s;
    private List t;
    private List u;
    private List v;
    private List w;
    private List x;
    private List y;
    private List z;

    public ba()
    {
        this(2);
    }

    public ba(int i1)
    {
        a = i1;
        P = true;
        k = VastAd.BillingPartner.UNKNOWN;
        N = -1;
        X = false;
    }

    public final ba a()
    {
        Q = true;
        return this;
    }

    public final ba a(int i1)
    {
        m = i1;
        return this;
    }

    public final ba a(long l1)
    {
        ac = l1;
        return this;
    }

    public final ba a(Uri uri)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        b.add(uri);
        return this;
    }

    public final ba a(fj fj1)
    {
        if (n == null)
        {
            n = new sb();
        }
        n.c = (fj[])com.google.android.apps.youtube.common.e.c.a(n.c, new fj[] {
            fj1
        });
        return this;
    }

    public final ba a(ne ne)
    {
        T = ne;
        return this;
    }

    public final ba a(InfoCardCollection infocardcollection)
    {
        U = infocardcollection;
        return this;
    }

    public final ba a(PlaybackTracking playbacktracking)
    {
        p = playbacktracking;
        return this;
    }

    public final ba a(PlayerConfig playerconfig)
    {
        q = playerconfig;
        return this;
    }

    public final ba a(VideoStreamingData videostreamingdata)
    {
        o = videostreamingdata;
        return this;
    }

    public final ba a(Survey survey)
    {
        ae = survey;
        return this;
    }

    public final ba a(VastAd.BillingPartner billingpartner)
    {
        k = billingpartner;
        return this;
    }

    public final ba a(VastAd.ProgressPing progressping)
    {
        if (w == null)
        {
            w = new ArrayList();
        }
        w.add(progressping);
        return this;
    }

    public final ba a(VastAd vastad)
    {
        aa = vastad;
        return this;
    }

    public final ba a(String s1)
    {
        e = s1;
        return this;
    }

    public final ba a(List list)
    {
        b = list;
        return this;
    }

    public final ba a(boolean flag)
    {
        O = flag;
        return this;
    }

    public final ba b(int i1)
    {
        N = i1;
        return this;
    }

    public final ba b(long l1)
    {
        M = l1;
        return this;
    }

    public final ba b(Uri uri)
    {
        if (s == null)
        {
            s = new ArrayList();
        }
        s.add(uri);
        return this;
    }

    public final ba b(VastAd vastad)
    {
        Z = vastad;
        return this;
    }

    public final ba b(String s1)
    {
        c = s1;
        return this;
    }

    public final ba b(List list)
    {
        s = list;
        return this;
    }

    public final ba b(boolean flag)
    {
        P = flag;
        return this;
    }

    public final String b()
    {
        return af;
    }

    public Object build()
    {
        return d();
    }

    public final ba c(long l1)
    {
        V = l1;
        return this;
    }

    public final ba c(Uri uri)
    {
        if (t == null)
        {
            t = new ArrayList();
        }
        t.add(uri);
        return this;
    }

    public final ba c(String s1)
    {
        d = s1;
        return this;
    }

    public final ba c(List list)
    {
        t = list;
        return this;
    }

    public final ba c(boolean flag)
    {
        R = flag;
        return this;
    }

    public final boolean c()
    {
        return "402".equals(j);
    }

    public final VastAd d()
    {
        if (Q && s != null && !s.isEmpty())
        {
            f(com.google.android.apps.youtube.common.e.p.a(com.google.android.apps.youtube.common.e.p.a((Uri)s.get(0)).replaceAll("eid\\d=\\d+", "eid1=5")));
        }
        if (o == null && n != null && n.c.length > 0)
        {
            o = new VideoStreamingData(n, e, (long)m * 1000L, ac, false);
        }
        if (o != null && o.getAllFormatStreams() != null)
        {
            Iterator iterator = o.getAllFormatStreams().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                FormatStream formatstream = (FormatStream)iterator.next();
                if (VastAd.isYouTubeHostedUri(formatstream.getUri()) && "modules".equals(formatstream.getUri().getFragment()))
                {
                    S = true;
                }
            } while (true);
        }
        if (p == null)
        {
            p = new PlaybackTracking();
        }
        if (q == null)
        {
            q = new PlayerConfig();
        }
        return new VastAd(b, e, c, d, f, g, h, i, j, k, l, m, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, O, P, M, N, R, S, T, U, V, W, X, Y, Z, aa, ab, ad, ae);
    }

    public final ba d(Uri uri)
    {
        if (u == null)
        {
            u = new ArrayList();
        }
        u.add(uri);
        return this;
    }

    public final ba d(String s1)
    {
        f = s1;
        return this;
    }

    public final ba d(List list)
    {
        u = list;
        return this;
    }

    public final ba d(boolean flag)
    {
        S = flag;
        return this;
    }

    public final ba e(Uri uri)
    {
        if (v == null)
        {
            v = new ArrayList();
        }
        v.add(uri);
        return this;
    }

    public final ba e(String s1)
    {
        g = s1;
        return this;
    }

    public final ba e(List list)
    {
        v = list;
        return this;
    }

    public final ba e(boolean flag)
    {
        W = flag;
        return this;
    }

    public final ba f(Uri uri)
    {
        if (x == null)
        {
            x = new ArrayList();
        }
        x.add(uri);
        return this;
    }

    public final ba f(String s1)
    {
        i = s1;
        return this;
    }

    public final ba f(List list)
    {
        w = list;
        return this;
    }

    public final ba f(boolean flag)
    {
        X = flag;
        return this;
    }

    public final ba g(Uri uri)
    {
        if (y == null)
        {
            y = new ArrayList();
        }
        y.add(uri);
        return this;
    }

    public final ba g(String s1)
    {
        j = s1;
        return this;
    }

    public final ba g(List list)
    {
        x = list;
        return this;
    }

    public final ba h(Uri uri)
    {
        if (z == null)
        {
            z = new ArrayList();
        }
        z.add(uri);
        return this;
    }

    public final ba h(String s1)
    {
        l = s1;
        return this;
    }

    public final ba h(List list)
    {
        y = list;
        return this;
    }

    public final ba i(Uri uri)
    {
        if (A == null)
        {
            A = new ArrayList();
        }
        A.add(uri);
        return this;
    }

    public final ba i(String s1)
    {
        af = s1;
        return this;
    }

    public final ba i(List list)
    {
        z = list;
        return this;
    }

    public final ba j(Uri uri)
    {
        if (B == null)
        {
            B = new ArrayList();
        }
        B.add(uri);
        return this;
    }

    public final ba j(List list)
    {
        A = list;
        return this;
    }

    public final ba k(Uri uri)
    {
        if (C == null)
        {
            C = new ArrayList();
        }
        C.add(uri);
        return this;
    }

    public final ba k(List list)
    {
        B = list;
        return this;
    }

    public final ba l(Uri uri)
    {
        if (D == null)
        {
            D = new ArrayList();
        }
        D.add(uri);
        return this;
    }

    public final ba l(List list)
    {
        C = list;
        return this;
    }

    public final ba m(Uri uri)
    {
        if (E == null)
        {
            E = new ArrayList();
        }
        E.add(uri);
        return this;
    }

    public final ba m(List list)
    {
        D = list;
        return this;
    }

    public final ba n(Uri uri)
    {
        if (F == null)
        {
            F = new ArrayList();
        }
        F.add(uri);
        return this;
    }

    public final ba n(List list)
    {
        E = list;
        return this;
    }

    public final ba o(Uri uri)
    {
        if (G == null)
        {
            G = new ArrayList();
        }
        G.add(uri);
        return this;
    }

    public final ba o(List list)
    {
        F = list;
        return this;
    }

    public final ba p(Uri uri)
    {
        if (H == null)
        {
            H = new ArrayList();
        }
        H.add(uri);
        return this;
    }

    public final ba p(List list)
    {
        G = list;
        return this;
    }

    public final ba q(Uri uri)
    {
        if (I == null)
        {
            I = new ArrayList();
        }
        I.add(uri);
        return this;
    }

    public final ba q(List list)
    {
        H = list;
        return this;
    }

    public final ba r(Uri uri)
    {
        if (J == null)
        {
            J = new ArrayList();
        }
        J.add(uri);
        return this;
    }

    public final ba r(List list)
    {
        I = list;
        return this;
    }

    public final ba s(Uri uri)
    {
        h = uri;
        return this;
    }

    public final ba s(List list)
    {
        J = list;
        return this;
    }

    public final ba t(Uri uri)
    {
        r = uri;
        return this;
    }

    public final ba t(List list)
    {
        ab = list;
        return this;
    }

    public final ba u(Uri uri)
    {
        K = uri;
        return this;
    }

    public final ba u(List list)
    {
        ad = list;
        return this;
    }

    public final ba v(Uri uri)
    {
        L = uri;
        return this;
    }

    public final ba w(Uri uri)
    {
        Y = uri;
        return this;
    }
}
