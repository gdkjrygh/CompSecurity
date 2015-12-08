// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.common.e.k;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bd;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.al;
import com.google.android.apps.youtube.core.identity.ar;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.core.identity.b;
import com.google.android.apps.youtube.core.identity.h;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.offline.store.r;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.fetcher.d;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.core.utils.v;
import com.google.android.apps.youtube.datalib.config.e;
import com.google.android.apps.youtube.datalib.innertube.model.media.j;
import com.google.android.exoplayer.upstream.cache.g;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.AbstractHttpClient;

// Referenced classes of package com.google.android.apps.youtube.core:
//            b, m, y, aj, 
//            ap, aq, ar, as, 
//            at, c, d, e, 
//            f, g, h, i, 
//            j, k, l, n, 
//            o, p, q, s, 
//            t, u, v, w, 
//            x, z, aa, ab, 
//            ac, ad, ae, af, 
//            ag, ah, ai, ak, 
//            al, am, an, ao, 
//            av, aw, au, Analytics

public abstract class a
    implements bd, r, d
{

    private final f A = new com.google.android.apps.youtube.core.q(this);
    private final f B = new s(this);
    private final f C = new t(this);
    private final f D = new u(this);
    private final f E = new com.google.android.apps.youtube.core.v(this);
    private final f F = new w(this);
    private final f G = new x(this);
    private final f H = new z(this);
    private final f I = new com.google.android.apps.youtube.core.aa(this);
    private final f J = new ab(this);
    private final f K = new ac(this);
    private final f L = new ad(this);
    private final f M = new com.google.android.apps.youtube.core.ae(this);
    private final f N = new af(this);
    private final f O = new ag(this);
    private final f P = new ah(this);
    private final f Q = new ai(this);
    private final f R = new com.google.android.apps.youtube.core.ak(this);
    private final f S = new com.google.android.apps.youtube.core.al(this);
    private final f T = new am(this);
    private final f U = new an(this);
    private final f V = new ao(this);
    protected final Context a;
    protected final Resources b;
    private com.google.android.exoplayer.upstream.cache.a c;
    private com.google.android.exoplayer.upstream.cache.a d;
    private final f e = new com.google.android.apps.youtube.core.b(this);
    private final f f = new m(this);
    private final f g = new y(this);
    private final f h = new aj(this);
    private final f i = new ap(this);
    private final f j = new aq(this);
    private final f k = new com.google.android.apps.youtube.core.ar(this);
    private final f l = new com.google.android.apps.youtube.core.as(this);
    private final f m = new at(this);
    private final f n = new com.google.android.apps.youtube.core.c(this);
    private final f o = new com.google.android.apps.youtube.core.d(this);
    private final f p = new com.google.android.apps.youtube.core.e(this);
    private final f q = new com.google.android.apps.youtube.core.f(this);
    private final f r = new com.google.android.apps.youtube.core.g(this);
    private final f s = new com.google.android.apps.youtube.core.h(this);
    private final f t = new i(this);
    private final f u = new com.google.android.apps.youtube.core.j(this);
    private final f v = new com.google.android.apps.youtube.core.k(this);
    private final f w = new com.google.android.apps.youtube.core.l(this);
    private final f x = new com.google.android.apps.youtube.core.n(this);
    private final f y = new o(this);
    private final f z = new com.google.android.apps.youtube.core.p(this);

    public a(Context context)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = context.getResources();
    }

    static f a(a a1)
    {
        return a1.L;
    }

    static Executor a(int i1, int j1, int k1)
    {
        return new ThreadPoolExecutor(i1, i1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.apps.youtube.core.utils.r(10));
    }

    private final boolean a()
    {
        return bs().b() && aP().getBoolean("offline_use_sd_card", true);
    }

    static f b(a a1)
    {
        return a1.P;
    }

    private File b()
    {
        Object obj = aT();
        if (((l) (obj)).b())
        {
            obj = com.google.android.apps.youtube.core.offline.store.l.a(a, ((l) (obj)).c());
            if (obj != null)
            {
                return ((File) (obj));
            }
        }
        return null;
    }

    static f c(a a1)
    {
        return a1.N;
    }

    private File c()
    {
        Object obj1 = aT();
        if (((l) (obj1)).b())
        {
            Object obj = a;
            obj1 = ((l) (obj1)).c();
            k k1 = bs();
            com.google.android.apps.youtube.common.fromguava.c.a(obj);
            com.google.android.apps.youtube.common.fromguava.c.a(((String) (obj1)));
            com.google.android.apps.youtube.common.fromguava.c.a(k1);
            if (k1.b())
            {
                obj = new File(k1.c(), (new StringBuilder("offline")).append(File.separator).append(((String) (obj1))).append(File.separator).append("streams").toString());
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                return ((File) (obj));
            }
        }
        return null;
    }

    static f d(a a1)
    {
        return a1.O;
    }

    static f e(a a1)
    {
        return a1.M;
    }

    protected final Analytics a(com.google.android.apps.youtube.core.client.l l1)
    {
        return new av(l1, aX());
    }

    public final DeviceAuthorizerForV2Apis aA()
    {
        return (DeviceAuthorizerForV2Apis)O.b();
    }

    public final GDataRequestFactory aB()
    {
        return (GDataRequestFactory)N.b();
    }

    public final h aC()
    {
        return (h)L.b();
    }

    public final al aD()
    {
        return (al)K.b();
    }

    public final com.google.android.apps.youtube.datalib.f.a aE()
    {
        return (com.google.android.apps.youtube.datalib.f.a)P.b();
    }

    public final j aF()
    {
        return (j)e.b();
    }

    public final n aG()
    {
        return (n)f.b();
    }

    protected final Handler aH()
    {
        return (Handler)g.b();
    }

    public final Executor aI()
    {
        return (Executor)h.b();
    }

    public final Executor aJ()
    {
        return (Executor)i.b();
    }

    public final Executor aK()
    {
        return (Executor)j.b();
    }

    public final HttpClient aL()
    {
        return (HttpClient)k.b();
    }

    public final AbstractHttpClient aM()
    {
        return (AbstractHttpClient)l.b();
    }

    public final com.google.android.apps.youtube.core.converter.n aN()
    {
        return (com.google.android.apps.youtube.core.converter.n)m.b();
    }

    public final aw aO()
    {
        return (aw)n.b();
    }

    public final SharedPreferences aP()
    {
        return (SharedPreferences)o.b();
    }

    public final as aQ()
    {
        return (as)p.b();
    }

    public final b aR()
    {
        return (b)q.b();
    }

    public final com.google.android.apps.youtube.core.identity.k aS()
    {
        return (com.google.android.apps.youtube.core.identity.k)r.b();
    }

    public final l aT()
    {
        return (l)s.b();
    }

    public final ar aU()
    {
        return (ar)t.b();
    }

    public final ak aV()
    {
        return (ak)u.b();
    }

    public final v aW()
    {
        return (v)v.b();
    }

    public final com.google.android.apps.youtube.common.network.h aX()
    {
        return (com.google.android.apps.youtube.common.network.h)w.b();
    }

    public final String aY()
    {
        return (String)x.b();
    }

    public final String aZ()
    {
        return (String)y.b();
    }

    public abstract ae ac();

    protected boolean aj()
    {
        return false;
    }

    protected boolean ak()
    {
        return false;
    }

    protected String am()
    {
        return Util.a(a, PackageUtil.f(a), au().E());
    }

    public abstract au au();

    public final File av()
    {
        File file1 = a.getCacheDir();
        File file = file1;
        if (file1 == null)
        {
            file = a.getExternalCacheDir();
        }
        return file;
    }

    public final bj aw()
    {
        return (bj)R.b();
    }

    public final List ax()
    {
        return (List)V.b();
    }

    public final e ay()
    {
        return (e)T.b();
    }

    public final com.google.android.apps.youtube.datalib.config.a az()
    {
        return (com.google.android.apps.youtube.datalib.config.a)U.b();
    }

    public final Analytics ba()
    {
        return (Analytics)z.b();
    }

    public final com.google.android.apps.youtube.common.fromguava.e bb()
    {
        return (com.google.android.apps.youtube.common.fromguava.e)A.b();
    }

    public final File bc()
    {
        return (File)B.b();
    }

    public final com.google.android.apps.youtube.core.player.a.l bd()
    {
        return (com.google.android.apps.youtube.core.player.a.l)C.b();
    }

    public final com.google.android.apps.youtube.medialib.a be()
    {
        return (com.google.android.apps.youtube.medialib.a)D.b();
    }

    public final com.google.android.apps.youtube.common.c.a bf()
    {
        return (com.google.android.apps.youtube.common.c.a)E.b();
    }

    public final com.google.android.apps.youtube.common.database.c bg()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.database.c c1 = (com.google.android.apps.youtube.common.database.c)F.b();
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public final com.google.android.apps.youtube.common.d.j bh()
    {
        return (com.google.android.apps.youtube.common.d.j)G.b();
    }

    public final com.google.android.apps.youtube.common.d.d bi()
    {
        return (com.google.android.apps.youtube.common.d.d)H.b();
    }

    public final com.google.android.apps.youtube.core.player.a.a bj()
    {
        return (com.google.android.apps.youtube.core.player.a.a)I.b();
    }

    public final aa bk()
    {
        return (aa)J.b();
    }

    public final com.google.android.exoplayer.upstream.cache.a bl()
    {
        if (a())
        {
            com.google.android.apps.youtube.common.L.d("Using SD card for offline content.");
            return bo();
        } else
        {
            com.google.android.apps.youtube.common.L.d("Using Primary Stroage for offline content.");
            return bn();
        }
    }

    public final File bm()
    {
        if (a())
        {
            return c();
        } else
        {
            return b();
        }
    }

    public final com.google.android.exoplayer.upstream.cache.a bn()
    {
        if (c == null && com.google.android.apps.youtube.core.utils.p.a(a) && a.getExternalCacheDir() != null)
        {
            File file = b();
            if (file != null)
            {
                com.google.android.apps.youtube.common.L.e((new StringBuilder("offline cache dir: ")).append(file.getAbsolutePath()).toString());
                c = new g(file, new com.google.android.exoplayer.upstream.cache.f());
            }
        }
        return c;
    }

    public final com.google.android.exoplayer.upstream.cache.a bo()
    {
        if (d == null && bs().b() && com.google.android.apps.youtube.core.utils.p.a(a))
        {
            File file = c();
            if (file != null)
            {
                com.google.android.apps.youtube.common.L.e((new StringBuilder("offline cache dir: ")).append(file.getAbsolutePath()).toString());
                d = new g(file, new com.google.android.exoplayer.upstream.cache.f());
            }
        }
        return d;
    }

    public final void bp()
    {
        c = null;
    }

    protected final as bq()
    {
        return new as(a, com.google.android.apps.youtube.core.identity.ak.e());
    }

    protected final com.google.android.apps.youtube.core.player.a.l br()
    {
        java.security.Key key = com.google.android.apps.youtube.core.utils.h.a(aP());
        return com.google.android.apps.youtube.core.player.a.b.a(a, bn(), bo(), key, be().c(), bj(), aG());
    }

    public final k bs()
    {
        return new k(a);
    }

    public abstract com.google.android.apps.youtube.datalib.config.b e();

    public final bc f()
    {
        return (bc)S.b();
    }

    public abstract Class g();

    public q q()
    {
        return (q)Q.b();
    }
}
