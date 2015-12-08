// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            x, q, ae, t, 
//            r, u, v, YouTubePlayerEvents, 
//            n, y, m, MissingStreamException, 
//            ad

public final class p
    implements x
{

    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    private static final Set i;
    private boolean A;
    private boolean B;
    private boolean C;
    private final r D;
    private int E;
    private int F;
    private int G;
    private final v H;
    private final YouTubePlayerEvents I;
    private final h J;
    private final String K;
    private final ae L;
    private final Context j;
    private final AtomicReference k;
    private final u l;
    private final Handler m;
    private final t n;
    private volatile boolean o;
    private volatile boolean p;
    private volatile boolean q;
    private volatile boolean r;
    private volatile boolean s;
    private volatile boolean t;
    private volatile boolean u;
    private VideoStreamingData v;
    private FormatStream w;
    private FormatStream x;
    private String y;
    private y z;

    public p(Context context, h h1, ae ae1, String s1)
    {
        this(context, h1, ae1, s1, ((t) (new q())));
    }

    public p(Context context, h h1, ae ae1, String s1, t t1)
    {
        j = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        J = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        L = (ae)com.google.android.apps.youtube.common.fromguava.c.a(ae1);
        K = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        n = (t)com.google.android.apps.youtube.common.fromguava.c.a(t1);
        k = new AtomicReference();
        D = new r(this, (byte)0);
        l = new u(this);
        l.start();
        m = new Handler(context.getMainLooper());
        H = new v(this);
        H.start();
        I = new YouTubePlayerEvents();
    }

    private void a(FormatStream formatstream)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(z);
        C = false;
        p = true;
        o = false;
        B = true;
        x = formatstream;
        E = 0;
        b(formatstream);
    }

    private void a(FormatStream formatstream, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(z);
        C = false;
        boolean flag;
        if (o && formatstream.equals(x))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        p = false;
        x = formatstream;
        E = i1;
        B = formatstream.isHls();
        b(formatstream);
    }

    static void a(p p1)
    {
        com.google.android.apps.youtube.common.L.a();
        p1.q = false;
        p1.r = false;
        p1.b(false);
        n n1 = (n)p1.k.getAndSet(null);
        if (n1 != null)
        {
            if (!p1.t && !p1.u)
            {
                p1.I.a(4);
            }
            n1.d();
        }
    }

    static void a(p p1, int i1)
    {
        n n1 = (n)p1.k.get();
        if (n1 != null && p1.o())
        {
            try
            {
                p1.I.b(i1);
                n1.a(i1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (p p1)
            {
                com.google.android.apps.youtube.common.L.b("Error calling mediaPlayer", p1);
            }
            return;
        } else
        {
            p1.I.b(i1);
            p1.a(p1.x, i1);
            p1.I.c(i1);
            return;
        }
    }

    static void a(p p1, FormatStream formatstream)
    {
        p1.b(formatstream);
    }

    static void a(p p1, FormatStream formatstream, int i1)
    {
        p1.a(formatstream, i1);
    }

    static void a(p p1, n n1, Uri uri)
    {
        p1.k.set(n1);
        if (n1 != null && uri != null)
        {
            try
            {
                if (!p1.t && !p1.u)
                {
                    p1.I.a(0);
                }
                p1.z.a(n1);
                HashMap hashmap = new HashMap();
                hashmap.put("x-disconnect-at-highwatermark", "1");
                hashmap.put("User-Agent", p1.K);
                n1.a(p1.j, uri, hashmap);
                n1.a();
                n1.a(true);
                p1.b(true);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (n n1)
            {
                com.google.android.apps.youtube.common.L.b("Media Player error preparing video", n1);
                p1.I.a(n1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (n n1)
            {
                com.google.android.apps.youtube.common.L.b("Media Player error preparing video", n1);
                p1.I.a(n1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (p p1)
            {
                com.google.android.apps.youtube.common.L.b("Error calling mediaPlayer", p1);
            }
            return;
        } else
        {
            com.google.android.apps.youtube.common.L.c((new StringBuilder("Media Player null pointer preparing video ")).append(n1).append(" ").append(uri).toString());
            p1.I.a(new NullPointerException());
            return;
        }
    }

    static boolean a(p p1, boolean flag)
    {
        p1.A = flag;
        return flag;
    }

    static int b(p p1, int i1)
    {
        p1.F = i1;
        return i1;
    }

    static FormatStream b(p p1, FormatStream formatstream)
    {
        p1.w = null;
        return null;
    }

    private void b(FormatStream formatstream)
    {
        com.google.android.apps.youtube.common.L.a();
        l.c();
        F = (int)formatstream.getVideoDurationMillis();
        z.e();
        if (!A)
        {
            w = formatstream;
            z.f();
            return;
        }
        try
        {
            n n1 = n.a(formatstream, p);
            n1.c(3);
            n1.a(D);
            l.a(n1, formatstream.getUriWithCpn(y));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FormatStream formatstream)
        {
            com.google.android.apps.youtube.common.L.b("Factory failed to create a MediaPlayer for the stream");
        }
        I.a(formatstream);
    }

    static void b(p p1)
    {
        n n1;
        p1.C = false;
        n1 = (n)p1.k.get();
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        com.google.android.apps.youtube.common.L.a();
        if (!p1.p) goto _L2; else goto _L1
_L1:
        if (!p1.r && p1.q)
        {
            n1.b();
            if (p1.z != null)
            {
                p1.z.d();
            }
            p1.r = true;
        }
        if (!p1.u && p1.q && p1.o)
        {
            p1.I.a(2);
        }
_L4:
        p1.u = false;
        return;
_L2:
        if (p1.o())
        {
            n1.b();
            if (p1.z != null)
            {
                p1.z.d();
            }
            p1.r = true;
            if (!p1.u)
            {
                p1.I.a(2);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        p1;
        com.google.android.apps.youtube.common.L.b("Error calling mediaPlayer", p1);
    }

    private void b(boolean flag)
    {
        if (s != flag)
        {
            s = flag;
            YouTubePlayerEvents youtubeplayerevents = I;
            byte byte0;
            if (s)
            {
                byte0 = 5;
            } else
            {
                byte0 = 6;
            }
            youtubeplayerevents.a(byte0);
        }
    }

    static boolean b(p p1, boolean flag)
    {
        p1.q = true;
        return true;
    }

    static int c(p p1, int i1)
    {
        p1.G = i1;
        return i1;
    }

    static void c(p p1)
    {
        n n1;
        p1.H.c();
        n1 = (n)p1.k.get();
        if (n1 == null || !p1.o())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        com.google.android.apps.youtube.common.L.a();
        n1.c();
        p1.r = false;
        p1.I.a(3);
        p1.b(false);
_L1:
        return;
        p1;
        com.google.android.apps.youtube.common.L.b("Error calling mediaPlayer", p1);
        return;
        if (!p1.C)
        {
            p1.C = true;
            p1.I.a(3);
            return;
        }
          goto _L1
    }

    static void c(p p1, FormatStream formatstream)
    {
        p1.a(formatstream);
    }

    static boolean c(p p1, boolean flag)
    {
        p1.o = true;
        return true;
    }

    static int d(p p1, int i1)
    {
        p1.E = 0;
        return 0;
    }

    static FormatStream d(p p1)
    {
        return p1.w;
    }

    static boolean d(p p1, boolean flag)
    {
        p1.t = flag;
        return flag;
    }

    static y e(p p1)
    {
        return p1.z;
    }

    static void e(p p1, boolean flag)
    {
        p1.b(flag);
    }

    static Context f(p p1)
    {
        return p1.j;
    }

    static boolean f(p p1, boolean flag)
    {
        p1.r = false;
        return false;
    }

    static Handler g(p p1)
    {
        return p1.m;
    }

    static boolean g(p p1, boolean flag)
    {
        p1.u = flag;
        return flag;
    }

    static boolean h(p p1)
    {
        return p1.o;
    }

    static boolean i(p p1)
    {
        return p1.o();
    }

    static boolean j(p p1)
    {
        return p1.p;
    }

    static int k(p p1)
    {
        return p1.E;
    }

    static boolean l(p p1)
    {
        return p1.t;
    }

    static Set m()
    {
        return i;
    }

    static boolean m(p p1)
    {
        return p1.u;
    }

    static YouTubePlayerEvents n(p p1)
    {
        return p1.I;
    }

    private Set n()
    {
        n n1 = (n)k.get();
        if (n1 == null)
        {
            return m.a;
        } else
        {
            return n1.h();
        }
    }

    private boolean o()
    {
        return q && (B || o);
    }

    static boolean o(p p1)
    {
        return p1.C;
    }

    static int p(p p1)
    {
        return p1.G;
    }

    static boolean q(p p1)
    {
        return p1.q;
    }

    static v r(p p1)
    {
        return p1.H;
    }

    static FormatStream s(p p1)
    {
        return p1.x;
    }

    static h t(p p1)
    {
        return p1.J;
    }

    static AtomicReference u(p p1)
    {
        return p1.k;
    }

    public final FormatStream a()
    {
        return x;
    }

    public final void a(float f1)
    {
        n n1 = (n)k.get();
        if (n1 != null)
        {
            n1.a(f1, f1);
        }
    }

    public final void a(int i1)
    {
        if (!p && E != i1)
        {
            E = i1;
            l.a(Math.max(0, Math.min(i1, F)));
        }
    }

    public final void a(int i1, int j1)
    {
        ad ad1;
        boolean flag;
        if (v != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        try
        {
            ad1 = L.a(v, n(), i1);
        }
        catch (MissingStreamException missingstreamexception)
        {
            return;
        }
        if (ad1.a() == x)
        {
            return;
        }
        I.a(ad1, j1);
        if (v.isLive())
        {
            a(ad1.a());
            return;
        } else
        {
            a(ad1.a(), f());
            return;
        }
    }

    public final void a(int i1, VideoStreamingData videostreamingdata, int j1, String s1, PlayerConfig playerconfig)
    {
        v = (VideoStreamingData)com.google.android.apps.youtube.common.fromguava.c.a(videostreamingdata);
        y = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        try
        {
            s1 = L.a(videostreamingdata, n(), i1);
        }
        // Misplaced declaration of an exception variable
        catch (VideoStreamingData videostreamingdata)
        {
            I.a(videostreamingdata);
            return;
        }
        I.a(s1, 0);
        if (videostreamingdata.isLive())
        {
            a(s1.a());
            return;
        } else
        {
            a(s1.a(), j1);
            return;
        }
    }

    public final void a(Handler handler)
    {
        I.a(handler);
    }

    public final void a(y y1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(y1);
        z = y1;
        y1.setListener(D);
        A = y1.h();
        n n1 = (n)k.get();
        if (n1 != null)
        {
            y1.a(n1);
        }
        if (r)
        {
            y1.d();
        }
    }

    public final void a(boolean flag)
    {
        H.quit();
        l.quit();
        if (flag && z != null)
        {
            z.g();
        }
    }

    public final void b()
    {
        l.a();
    }

    public final void b(Handler handler)
    {
        I.b(handler);
    }

    public final void c()
    {
        l.b();
    }

    public final void d()
    {
        H.c();
        l.c();
    }

    public final void e()
    {
        H.c();
        l.d();
    }

    public final int f()
    {
        n n1 = (n)k.get();
        if (n1 != null && q)
        {
            E = n1.e();
        }
        return E;
    }

    public final int g()
    {
        return F;
    }

    public final int h()
    {
        return G;
    }

    public final boolean i()
    {
        return s;
    }

    public final boolean j()
    {
        return k.get() != null && r;
    }

    public final void k()
    {
        if (z != null)
        {
            z.e();
        }
    }

    public final void l()
    {
        if (z != null)
        {
            z.e();
            n n1 = (n)k.get();
            if (n1 != null)
            {
                z.b(n1);
            }
            A = false;
            z.setListener(null);
            e();
            z = null;
        }
    }

    static 
    {
        HashSet hashset;
        if (android.os.Build.VERSION.SDK_INT > 15)
        {
            a = -2998;
            b = -2997;
            c = -2996;
            d = -2995;
            e = -2994;
            f = -2993;
            g = -2992;
            h = -3000;
        } else
        {
            a = -3000;
            b = -3001;
            c = -3002;
            d = -3003;
            e = -3004;
            f = -3005;
            g = 0x7fffffff;
            h = -3006;
        }
        hashset = new HashSet();
        hashset.add(Integer.valueOf(-16001));
        hashset.add(Integer.valueOf(-1010));
        hashset.add(Integer.valueOf(-2002));
        hashset.add(Integer.valueOf(-2001));
        hashset.add(Integer.valueOf(a));
        hashset.add(Integer.valueOf(b));
        hashset.add(Integer.valueOf(c));
        hashset.add(Integer.valueOf(d));
        hashset.add(Integer.valueOf(e));
        hashset.add(Integer.valueOf(f));
        if (g != 0x7fffffff)
        {
            hashset.add(Integer.valueOf(g));
        }
        hashset.add(Integer.valueOf(h));
        hashset.add(Integer.valueOf(31));
        hashset.add(Integer.valueOf(32));
        hashset.add(Integer.valueOf(33));
        i = Collections.unmodifiableSet(hashset);
    }
}
