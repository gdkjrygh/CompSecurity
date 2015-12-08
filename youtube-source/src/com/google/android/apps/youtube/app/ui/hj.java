// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.identity.o;
import com.google.android.apps.youtube.core.player.overlay.ad;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.m;
import com.google.android.apps.youtube.datalib.innertube.al;
import com.google.android.apps.youtube.datalib.innertube.an;
import com.google.android.apps.youtube.datalib.innertube.v;
import com.google.android.apps.youtube.datalib.innertube.y;
import com.google.android.apps.youtube.datalib.innertube.z;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hp, bd, hr, LikeAction, 
//            hz, hn, ic, hk, 
//            hy, hm, hq, v, 
//            ia, hw, hl

public final class hj
    implements ad
{

    protected final Activity a;
    private final Analytics b;
    private final LinkedList c = new LinkedList();
    private hy d;
    private ic e;
    private final bc f;
    private final af g;
    private final v h;
    private final al i;
    private final ak j;
    private final o k;
    private final l l;
    private final aa m;
    private final aw n;
    private final hp o;
    private final hr p = new hr(this);
    private final bd q;
    private final AtomicReference r;
    private final Executor s;

    public hj(Activity activity, bc bc1, v v1, al al1, ak ak1, o o1, l l1, 
            aa aa1, Analytics analytics, aw aw1, a a1, hp hp1, AtomicReference atomicreference, Executor executor)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        j = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1);
        k = (o)com.google.android.apps.youtube.common.fromguava.c.a(o1);
        l = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        m = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        f = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        h = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        i = (al)com.google.android.apps.youtube.common.fromguava.c.a(al1);
        n = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        o = (hp)com.google.android.apps.youtube.common.fromguava.c.a(hp1);
        s = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        com.google.android.apps.youtube.common.fromguava.c.a(a1);
        g = bc1.o();
        q = new bd(activity, bc1, aw1, a1);
        r = atomicreference;
        a();
    }

    static aw a(hj hj1)
    {
        return hj1.n;
    }

    private static void a(View view, boolean flag)
    {
        if (view != null)
        {
            view.setSelected(flag);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setClickable(flag);
        }
    }

    static void a(hj hj1, int i1)
    {
        ah.a(hj1.a, i1, 1);
    }

    static void a(hj hj1, View view, boolean flag)
    {
        a(view, false);
    }

    static void a(hj hj1, String s1, LikeAction likeaction)
    {
        hj1.a(s1, likeaction);
    }

    private void a(ic ic1)
    {
        e = ic1;
        Pair pair;
        for (ic1 = c.iterator(); ic1.hasNext(); a((View)pair.second, false))
        {
            pair = (Pair)ic1.next();
            a((View)pair.first, false);
        }

    }

    private void a(String s1, LikeAction likeaction)
    {
        if (b(s1))
        {
            Iterator iterator;
            Pair pair;
            boolean flag;
            boolean flag1;
            if (likeaction == LikeAction.LIKE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (likeaction == LikeAction.DISLIKE)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            for (iterator = c.iterator(); iterator.hasNext(); a((View)pair.second, flag1))
            {
                pair = (Pair)iterator.next();
                a((View)pair.first, flag);
            }

        }
        hz hz1 = new hz(this, likeaction, s1);
        switch (com.google.android.apps.youtube.app.ui.hn.a[likeaction.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            likeaction = h.a();
            likeaction.a(s1);
            likeaction.a(z.a);
            h.a(likeaction, hz1);
            return;

        case 2: // '\002'
            likeaction = h.b();
            likeaction.a(s1);
            likeaction.a(y.a);
            h.a(likeaction, hz1);
            return;

        case 3: // '\003'
            likeaction = h.c();
            break;
        }
        likeaction.a(s1);
        likeaction.a(com.google.android.apps.youtube.datalib.innertube.aa.a);
        h.a(likeaction, hz1);
    }

    static boolean a(hj hj1, String s1)
    {
        return hj1.b(s1);
    }

    static hr b(hj hj1)
    {
        return hj1.p;
    }

    static void b(hj hj1, String s1)
    {
        ah.b(hj1.a, s1, 1);
    }

    private boolean b(String s1)
    {
        return e != null && TextUtils.equals(s1, e.a());
    }

    static hy c(hj hj1)
    {
        return hj1.d;
    }

    static LinkedList d(hj hj1)
    {
        return hj1.c;
    }

    static bc e(hj hj1)
    {
        return hj1.f;
    }

    static Analytics f(hj hj1)
    {
        return hj1.b;
    }

    static af g(hj hj1)
    {
        return hj1.g;
    }

    static o h(hj hj1)
    {
        return hj1.k;
    }

    static hp i(hj hj1)
    {
        return hj1.o;
    }

    static bd j(hj hj1)
    {
        return hj1.q;
    }

    static AtomicReference k(hj hj1)
    {
        return hj1.r;
    }

    public final void a()
    {
        a(((ic) (null)));
    }

    public final void a(View view, View view1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(view);
        com.google.android.apps.youtube.common.fromguava.c.a(view1);
        c.add(new Pair(view, view1));
    }

    public final void a(LikeAction likeaction)
    {
        if (e == null)
        {
            L.c("Like video without action target.");
            return;
        }
        String s1 = e.a();
        b.b(likeaction.toString());
        if (l.b())
        {
            a(s1, likeaction);
            return;
        } else
        {
            m.a(a, new hk(this, s1, likeaction));
            return;
        }
    }

    public final void a(hy hy1)
    {
        d = (hy)com.google.android.apps.youtube.common.fromguava.c.a(hy1);
    }

    public final void a(String s1)
    {
        p.a(s1);
        if (l.b())
        {
            p.a();
            return;
        } else
        {
            m.a(a, new hm(this));
            return;
        }
    }

    public final void a(String s1, Playlist playlist)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        com.google.android.apps.youtube.common.fromguava.c.b(l.b());
        hq hq1 = new hq(this, playlist);
        an an1 = i.a();
        an1.a(an.a);
        an1.a(playlist.id);
        an1.b(s1);
        i.a(an1, hq1);
    }

    public final void a(String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        a(new ic(this, s1, s2));
    }

    public final void a(String s1, String s2, com.google.android.apps.youtube.app.ui.v v1)
    {
        v1.a(false);
        v1 = new ia(this, v1);
        an an1 = i.a();
        an1.a(an.a);
        an1.a(s2);
        an1.c(s1);
        i.a(an1, v1);
    }

    public final void b()
    {
        if (e == null)
        {
            L.c("Share video without action target.");
            return;
        } else
        {
            String s1 = e.b();
            String s2 = e.a();
            b.b("Share");
            com.google.android.apps.youtube.core.utils.m.a(a, s1, com.google.android.apps.youtube.common.e.p.e(s2));
            return;
        }
    }

    public final void c()
    {
        if (e == null)
        {
            L.c("Flag without action target.");
            return;
        }
        Object obj = e.a();
        b.b("Flag");
        obj = new hw(this, ((String) (obj)));
        if (l.b())
        {
            ((hw) (obj)).a();
            return;
        } else
        {
            m.a(a, new hl(this, ((hw) (obj))));
            return;
        }
    }

    public final void d()
    {
        if (e == null)
        {
            L.c("Add to without action target.");
            return;
        } else
        {
            a(e.a());
            return;
        }
    }
}
