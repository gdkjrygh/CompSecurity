// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import com.android.volley.toolbox.t;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.b.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.ConnectivityReceiver;
import com.google.android.apps.youtube.common.network.YouTubeHttpClient;
import com.google.android.apps.youtube.common.network.l;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.ac;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.av;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.ax;
import com.google.android.apps.youtube.core.client.DeviceClassification;
import com.google.android.apps.youtube.core.client.ah;
import com.google.android.apps.youtube.core.client.ai;
import com.google.android.apps.youtube.core.client.ar;
import com.google.android.apps.youtube.core.client.az;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bd;
import com.google.android.apps.youtube.core.client.bf;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.client.bs;
import com.google.android.apps.youtube.core.client.bv;
import com.google.android.apps.youtube.core.client.bx;
import com.google.android.apps.youtube.core.client.cc;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.client.ch;
import com.google.android.apps.youtube.core.client.e;
import com.google.android.apps.youtube.core.client.i;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.player.DefaultPlaybackMonitor;
import com.google.android.apps.youtube.core.player.PlaybackClientManager;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.fetcher.d;
import com.google.android.apps.youtube.core.player.p;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.k;
import com.google.android.apps.youtube.core.utils.r;
import com.google.android.apps.youtube.datalib.a.h;
import com.google.android.apps.youtube.datalib.a.o;
import com.google.android.apps.youtube.datalib.innertube.m;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.offline.g;
import com.google.android.youtube.player.YouTubeInitializationResult;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.api:
//            n, z, r, a, 
//            ApiDeviceRegistrationClientForV2Apis, ab, l, k, 
//            m

public final class j
    implements bd, d, p
{

    private static final Map a = new HashMap();
    private static final AtomicReference b = new AtomicReference();
    private static final List c = Collections.unmodifiableList(new ArrayList());
    private static final List d = Collections.unmodifiableList(new ArrayList());
    private static final List e = Collections.unmodifiableList(new ArrayList());
    private final au A;
    private final SharedPreferences B;
    private final com.google.android.apps.youtube.common.network.h C;
    private final com.google.android.apps.youtube.datalib.offline.n D = new g();
    private final q E = new com.google.android.apps.youtube.core.offline.store.b();
    private final ConnectivityReceiver F;
    private final aw G;
    private final com.google.android.apps.youtube.datalib.e.b H;
    private final a I;
    private final Executor J = new b();
    private final com.google.android.apps.youtube.datalib.innertube.model.media.j K = new com.google.android.apps.youtube.datalib.innertube.model.media.j();
    private int L;
    private final Context f;
    private final com.google.android.apps.youtube.api.n g;
    private final n h = new n();
    private final Handler i;
    private final Executor j;
    private final HttpClient k;
    private final HttpClient l;
    private final com.google.android.apps.youtube.core.converter.n m = com.google.android.apps.youtube.core.converter.n.a();
    private final com.google.android.apps.youtube.datalib.innertube.ah n;
    private final m o;
    private final w p = new w();
    private final ab q;
    private final com.google.android.apps.youtube.core.utils.a r;
    private final com.google.android.apps.youtube.core.client.h s;
    private final ad t;
    private final e u;
    private final bj v;
    private final ce w;
    private final com.google.android.apps.youtube.api.a x;
    private final com.google.android.apps.youtube.medialib.a y;
    private final Analytics z;

    private j(Context context, String s1, com.google.android.apps.youtube.api.n n1)
    {
        f = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "application cannot be null");
        g = (com.google.android.apps.youtube.api.n)com.google.android.apps.youtube.common.fromguava.c.a(n1, "clientIdentifier cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a();
        B = context.getSharedPreferences("youtube", 0);
        i = new Handler(context.getMainLooper());
        I = new a(new b(), h);
        j = new ThreadPoolExecutor(16, 16, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r(1));
        Object obj1 = n1.a;
        Object obj2 = n1.b;
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append("com.google.android.youtube.player");
        ((StringBuilder) (obj)).append('/');
        ((StringBuilder) (obj)).append(s1);
        ((StringBuilder) (obj)).append(' ');
        ((StringBuilder) (obj)).append(context.getPackageName());
        ((StringBuilder) (obj)).append('/');
        ((StringBuilder) (obj)).append(com.google.android.youtube.player.internal.b.b.d(context));
        ((StringBuilder) (obj)).append(' ');
        ((StringBuilder) (obj)).append(((String) (obj1)));
        ((StringBuilder) (obj)).append('/');
        ((StringBuilder) (obj)).append(((String) (obj2)));
        ((StringBuilder) (obj)).append(' ');
        ((StringBuilder) (obj)).append("(Linux; U; Android ");
        ((StringBuilder) (obj)).append(android.os.Build.VERSION.RELEASE);
        ((StringBuilder) (obj)).append("; ");
        ((StringBuilder) (obj)).append(Locale.getDefault().toString());
        obj1 = Build.MODEL;
        if (((String) (obj1)).length() > 0)
        {
            ((StringBuilder) (obj)).append("; ");
            ((StringBuilder) (obj)).append(((String) (obj1)));
        }
        obj1 = Build.ID;
        if (((String) (obj1)).length() > 0)
        {
            ((StringBuilder) (obj)).append(" Build/");
            ((StringBuilder) (obj)).append(((String) (obj1)));
        }
        ((StringBuilder) (obj)).append(')');
        obj1 = ((StringBuilder) (obj)).toString();
        k = com.google.android.apps.youtube.common.network.l.a(((String) (obj1)));
        l = com.google.android.apps.youtube.common.network.l.b(((String) (obj1)));
        C = new com.google.android.apps.youtube.common.network.b((ConnectivityManager)context.getSystemService("connectivity"), com.google.android.apps.youtube.common.network.b.a);
        F = new ConnectivityReceiver(context, I);
        z = new av(new az(), C);
        G = new aw(context, C);
        obj = new ai(120, 480, 83, true, true);
        v = ah.a(j, j, k, h, ((ai) (obj)), 70, 30);
        w = new ar(j, k, m, h);
        A = new ax(context.getContentResolver(), "youtube");
        obj = i;
        obj2 = C;
        ArrayList arraylist;
        com.google.android.apps.youtube.api.r r1;
        String s2;
        boolean flag;
        if (com.google.android.apps.youtube.core.utils.l.c(context) && A.I())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y = new com.google.android.apps.youtube.medialib.a(((Handler) (obj)), ((String) (obj1)), ((com.google.android.apps.youtube.common.network.h) (obj2)), flag, Util.c(context), false, K);
        obj2 = new o(B);
        obj = new com.google.android.apps.youtube.datalib.config.g(((com.google.android.apps.youtube.datalib.config.e) (obj2)), B, com.google.android.apps.youtube.api.z.d);
        obj1 = new YouTubeHttpClient(context, com.google.android.apps.youtube.common.network.l.a(((String) (obj1))), String.format(Locale.US, "%s/%s", new Object[] {
            n1.a, n1.b
        }));
        obj1 = new com.android.volley.l(new t(), new h(new com.android.volley.toolbox.d(((HttpClient) (obj1))), ((com.google.android.apps.youtube.datalib.config.e) (obj2)), h));
        ((com.android.volley.l) (obj1)).a();
        r1 = new com.google.android.apps.youtube.api.r(context, n1.c, n1.a);
        arraylist = new ArrayList();
        arraylist.add(r1);
        arraylist.add(new com.google.android.apps.youtube.datalib.innertube.h(context, context.getPackageManager(), A));
        obj2 = com.google.android.apps.youtube.core.utils.k.a(context.getContentResolver());
        s2 = String.format("%s_%s_%s", new Object[] {
            n1.a, n1.b, n1.c
        });
        obj = new com.google.android.apps.youtube.datalib.innertube.r(new com.google.android.apps.youtube.datalib.c.a(((com.android.volley.l) (obj1)), B, ((com.google.android.apps.youtube.datalib.config.a) (obj)), "AIzaSyCjc_pVEDi4qsv5MtC2dMXzpIaDoRFLsxw", ((String) (obj2)), s2), null, e, d, ((com.google.android.apps.youtube.datalib.config.a) (obj)), "AIzaSyCjc_pVEDi4qsv5MtC2dMXzpIaDoRFLsxw", r1.a());
        n = new com.google.android.apps.youtube.datalib.innertube.ah(((com.google.android.apps.youtube.datalib.innertube.r) (obj)), new com.google.android.apps.youtube.datalib.innertube.p(arraylist), ((com.android.volley.l) (obj1)), h);
        o = new m(((com.google.android.apps.youtube.datalib.innertube.r) (obj)), new com.google.android.apps.youtube.datalib.innertube.p(arraylist), ((com.android.volley.l) (obj1)));
        obj = new GDataRequestFactory(new ac(B), 15, null, null);
        x = new com.google.android.apps.youtube.api.a(new ApiDeviceRegistrationClientForV2Apis(context, j, k, n1.c, ((String) (obj2)), com.google.android.apps.youtube.api.z.b, com.google.android.apps.youtube.api.z.c), j, i, B, n1.a, n1.b, n1.c);
        obj2 = new com.google.android.apps.youtube.core.identity.ar(com.google.android.apps.youtube.core.identity.l.a());
        q = new ab(j, k, h, m, ((GDataRequestFactory) (obj)), x, c, com.google.android.apps.youtube.core.async.GDataRequest.Version.V_2_1, ((com.google.android.apps.youtube.core.identity.ar) (obj2)));
        r = new com.google.android.apps.youtube.core.utils.a(context, y.b(), com.google.android.youtube.player.internal.b.b.d(context));
        t = new DefaultPlaybackMonitor(I, z);
        s = (new i(h, B, C)).a(r).b(n1.a).a(Util.a(context)).a(t).a();
        u = new e((new com.google.android.apps.youtube.core.client.r(j, l, m, h, I)).a(s).a(this).a(), j);
        com.google.android.apps.youtube.core.player.c.a((new StringBuilder()).append(com.google.android.youtube.player.internal.b.b.d(f)).append("/player.").append(s1).toString());
        com.google.android.apps.youtube.core.player.c.a(h);
        com.google.android.apps.youtube.core.player.c.a(C);
        H = new com.google.android.apps.youtube.datalib.e.b(e, x, ((com.android.volley.l) (obj1)), com.google.android.apps.youtube.datalib.offline.j.a, h, A, new com.google.android.apps.youtube.datalib.config.d(context.getContentResolver()), J);
    }

    static j a(Context context, String s1, String s2, String s3, String s4)
    {
        s3 = new com.google.android.apps.youtube.api.n(s2, s3, s1);
        s2 = (j)a.get(s3);
        s1 = s2;
        if (s2 == null)
        {
            s1 = (j)b.get();
            if (s1 != null && ((j) (s1)).g.equals(s3))
            {
                b.set(null);
                context = s1;
            } else
            {
                context = new j(context, s4, s3);
            }
            a.put(s3, context);
            s1 = context;
        }
        return s1;
    }

    public static YouTubeInitializationResult a(Exception exception)
    {
        if (exception instanceof com.google.android.apps.youtube.core.utils.PackageUtil.IllegalPackageSignatureException)
        {
            return YouTubeInitializationResult.INVALID_APPLICATION_SIGNATURE;
        }
        if (exception instanceof ApiDeviceRegistrationClientForV2Apis.InvalidDeveloperException)
        {
            return YouTubeInitializationResult.DEVELOPER_KEY_INVALID;
        }
        if ((exception instanceof UnknownHostException) || (exception instanceof SocketException) || (exception instanceof HttpResponseException))
        {
            return YouTubeInitializationResult.NETWORK_ERROR;
        } else
        {
            return YouTubeInitializationResult.INTERNAL_ERROR;
        }
    }

    static void a(j j1)
    {
        boolean flag;
        if (j1.L >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        j1.L = j1.L + 1;
    }

    static void a(j j1, com.google.android.apps.youtube.api.m m1)
    {
        j1.x.a(new com.google.android.apps.youtube.api.l(j1, m1));
    }

    public static void a(com.google.android.apps.youtube.api.m m1, Handler handler, Context context, String s1, String s2, String s3, String s4)
    {
        handler.post(new com.google.android.apps.youtube.api.k(context, s1, s2, s3, s4, m1));
    }

    public static void a(String s1)
    {
        j j1 = (j)b.get();
        if (j1 != null && s1.equals(j1.g.a))
        {
            b.compareAndSet(j1, null);
        }
    }

    public final PlaybackClientManager a()
    {
        Object obj;
        bf bf1;
        bs bs1;
        bx bx1;
        cc cc1;
        Object obj1;
        bv bv1;
        if (PackageUtil.e(f))
        {
            obj = com.google.android.apps.youtube.core.client.DeviceClassification.Platform.TV;
        } else
        if (com.google.android.apps.youtube.core.utils.l.a(f))
        {
            obj = com.google.android.apps.youtube.core.client.DeviceClassification.Platform.TABLET;
        } else
        {
            obj = com.google.android.apps.youtube.core.client.DeviceClassification.Platform.MOBILE;
        }
        obj1 = new DeviceClassification((new StringBuilder()).append(f.getPackageName()).append(".api").toString(), com.google.android.youtube.player.internal.b.b.d(f), ((com.google.android.apps.youtube.core.client.DeviceClassification.Platform) (obj)), com.google.android.apps.youtube.core.client.DeviceClassification.SoftwareInterface.OTHERAPP);
        obj = new com.google.android.apps.youtube.core.client.d(H, H, h, I);
        bf1 = new bf(h, j, i, o);
        bs1 = new bs(f, h, y.a(), new com.google.android.apps.youtube.core.utils.t());
        bx1 = new bx(H, C, ((DeviceClassification) (obj1)), r);
        cc1 = new cc(H, h, C, ((DeviceClassification) (obj1)), y.a());
        obj1 = new ch(H, h, z, C, I, ((DeviceClassification) (obj1)));
        bv1 = bv.a();
        return new PlaybackClientManager(new SecureRandom(), C, ((com.google.android.apps.youtube.core.client.d) (obj)), bf1, bs1, bv1, bx1, cc1, ((ch) (obj1)));
    }

    public final PlayerFetcher a(VastAd vastad)
    {
        return new PlayerFetcher(I, n, p, q, com.google.android.apps.youtube.core.identity.l.a(), new com.google.android.apps.youtube.core.offline.store.b(), j, new com.google.android.apps.youtube.core.client.a(vastad), h);
    }

    public final void a(boolean flag)
    {
        boolean flag1;
        if (L > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag1);
        L = L - 1;
        if (L <= 0)
        {
            a.remove(g);
            if (flag)
            {
                b.set(this);
            }
        }
    }

    public final n b()
    {
        return h;
    }

    public final Executor c()
    {
        return j;
    }

    public final com.google.android.apps.youtube.datalib.innertube.model.media.j d()
    {
        return K;
    }

    public final a e()
    {
        return I;
    }

    public final bc f()
    {
        return q;
    }

    public final e g()
    {
        return u;
    }

    public final bj h()
    {
        return v;
    }

    public final ce i()
    {
        return w;
    }

    public final com.google.android.apps.youtube.medialib.a j()
    {
        return y;
    }

    public final Analytics k()
    {
        return z;
    }

    public final au l()
    {
        return A;
    }

    public final aw m()
    {
        return G;
    }

    public final SharedPreferences n()
    {
        return B;
    }

    public final com.google.android.apps.youtube.common.network.h o()
    {
        return C;
    }

    public final com.google.android.apps.youtube.datalib.offline.n p()
    {
        return D;
    }

    public final q q()
    {
        return E;
    }

    public final w r()
    {
        return p;
    }

    public final ad s()
    {
        return t;
    }

    public final PlayerFetcher t()
    {
        return new PlayerFetcher(I, n, p, q, com.google.android.apps.youtube.core.identity.l.a(), new com.google.android.apps.youtube.core.offline.store.b(), j, new com.google.android.apps.youtube.core.client.n(s), h);
    }

    static 
    {
        com.google.android.apps.youtube.common.L.a("YouTubeAndroidPlayerAPI");
    }
}
