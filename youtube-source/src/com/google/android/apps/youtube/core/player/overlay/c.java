// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.a.a.a.a.jx;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.tu;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.PlaybackClientManager;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            b, y, a, f

public final class c
    implements com.google.android.apps.youtube.core.player.overlay.b, y
{

    private final com.google.android.apps.youtube.core.player.overlay.a a;
    private final ae b;
    private final bc c;
    private final bj d;
    private final PlaybackClientManager e;
    private final Analytics f;
    private final a g;
    private final Context h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private final b j = new n();
    private VastAd k;
    private boolean l;
    private boolean m;
    private d n;
    private d o;
    private d p;

    public c(com.google.android.apps.youtube.core.player.overlay.a a1, Context context, ae ae1, bc bc1, bj bj1, Analytics analytics, a a2)
    {
        a = (com.google.android.apps.youtube.core.player.overlay.a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        h = context;
        b = ae1;
        c = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        d = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        e = ae1.a();
        f = analytics;
        g = a2;
        a1.setListener(this);
    }

    static d a(c c1, d d1)
    {
        c1.n = d1;
        return d1;
    }

    static VastAd a(c c1)
    {
        return c1.k;
    }

    static VastAd a(c c1, VastAd vastad)
    {
        c1.k = vastad;
        return vastad;
    }

    private static String a(VastAd vastad)
    {
        if (vastad.adInfoCards == null)
        {
            return vastad.getAdOwnerName();
        } else
        {
            return null;
        }
    }

    static d b(c c1, d d1)
    {
        c1.p = d1;
        return d1;
    }

    static com.google.android.apps.youtube.core.player.overlay.a b(c c1)
    {
        return c1.a;
    }

    static String b(c c1, VastAd vastad)
    {
        return a(vastad);
    }

    static Handler c(c c1)
    {
        return c1.i;
    }

    static d d(c c1)
    {
        return c1.n;
    }

    static bc e(c c1)
    {
        return c1.c;
    }

    private void e()
    {
        if (o != null)
        {
            o.a();
            o = null;
        }
        if (n != null)
        {
            n.a();
            n = null;
        }
        if (p != null)
        {
            p.a();
            p = null;
        }
        m = false;
        a.d();
    }

    static d f(c c1)
    {
        return c1.p;
    }

    static bj g(c c1)
    {
        return c1.d;
    }

    public final void a()
    {
        f.a("LearnMore", "Menu");
        b();
    }

    public final void a(int i1, int j1)
    {
        if (k != null && k.isSkippable())
        {
            e.a(i1, j1);
            b.t();
        }
    }

    public final void b()
    {
        if (k != null && k.getClickthroughUri() != null)
        {
            e.l();
            a a1 = g;
            Uri uri = k.getClickthroughUri();
            kz kz1 = new kz();
            kz1.k = new tu();
            kz1.k.b = uri.toString();
            a1.a(kz1);
        }
    }

    public final void c()
    {
        if (k != null && k.isSkippable())
        {
            e.k();
        }
    }

    public final void d()
    {
        if (k != null && k.getAdOwnerUri() != null)
        {
            e.m();
            a a1 = g;
            String s = com.google.android.apps.youtube.common.e.p.c(k.getAdOwnerUri());
            kz kz1 = new kz();
            kz1.o = new jx();
            kz1.o.b = s;
            a1.a(kz1);
        }
    }

    public final void handleVideoStageEvent(ac ac1)
    {
        boolean flag = false;
        l = ac1.c().isPlayingAd();
        if (ac1.c().onAd() && ac1.e() != null && ac1.e().getSurvey() == null)
        {
            if (k == null)
            {
                k = ac1.e();
                e();
                if (!TextUtils.isEmpty(k.getAdVideoId()))
                {
                    o = com.google.android.apps.youtube.common.a.d.a(new f(this, (byte)0));
                    c.a(k.getAdVideoId(), com.google.android.apps.youtube.common.a.e.a(i, o));
                }
            }
            if ((l || k.shouldPlayAd(j)) && !m)
            {
                ac1 = a;
                String s = a(k);
                boolean flag1 = k.isSkippable();
                if (k.getClickthroughUri() != null)
                {
                    flag = true;
                }
                ac1.a(s, flag1, flag, k.getOriginalVideoId());
                m = true;
            }
            return;
        } else
        {
            k = null;
            e();
            return;
        }
    }

    public final void handleVideoTimeEvent(com.google.android.apps.youtube.core.player.event.ae ae1)
    {
        if (l)
        {
            a.a(ae1.a(), ae1.b());
        }
    }
}
