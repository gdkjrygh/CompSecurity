// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.youtube.p;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            v, au, bv, az, 
//            ao, af, ag, bb, 
//            ap, hj, ae, ah, 
//            dv, ai, aj, ak, 
//            al, am, an, as, 
//            aq, ar, av, aw, 
//            bc, ay, ax, at, 
//            ba

public final class ad
{

    public static v a(YouTubeActivity youtubeactivity)
    {
        v v1 = new v(youtubeactivity);
        a(v1, youtubeactivity, false);
        a(youtubeactivity, v1, ((at) (au.a())));
        return v1;
    }

    private static v a(YouTubeActivity youtubeactivity, v v1, at at)
    {
        Object obj = ((YouTubeApplication)youtubeactivity.getApplication()).d();
        Object obj1 = ((ax) (obj)).Z();
        q q1 = ((ax) (obj)).q();
        l l1 = ((ax) (obj)).aT();
        obj = new f(youtubeactivity, l1, q1, ((ax) (obj)).bk(), ((ax) (obj)).aO(), ((ax) (obj)).aX(), ((com.google.android.apps.youtube.app.offline.p) (obj1)), new bv(youtubeactivity, ((com.google.android.apps.youtube.app.offline.p) (obj1))));
        obj1 = new az(youtubeactivity, p.cz, (byte)0);
        az az1 = new az(youtubeactivity, p.fa, (byte)0);
        v1.a(new ao(at, q1, l1, ((az) (obj1)), az1));
        if (com.google.android.apps.youtube.core.utils.p.a(youtubeactivity))
        {
            v1.a(((aa) (obj1)), new af(at, youtubeactivity, ((f) (obj))));
            v1.a(az1, new ag(at, ((f) (obj))));
        }
        return v1;
    }

    public static v a(YouTubeActivity youtubeactivity, AtomicReference atomicreference)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, atomicreference, v1, ((ba) (bb.a())));
        return v1;
    }

    private static v a(YouTubeActivity youtubeactivity, AtomicReference atomicreference, v v1, ba ba)
    {
        Object obj1 = ((YouTubeApplication)youtubeactivity.getApplication()).d();
        com.google.android.apps.youtube.core.Analytics analytics = ((ax) (obj1)).ba();
        Object obj = ((ax) (obj1)).Z();
        l l1 = ((ax) (obj1)).aT();
        q q1 = ((ax) (obj1)).q();
        obj = new r(youtubeactivity, l1, q1, ((ax) (obj1)).bk(), ((ax) (obj1)).aO(), ((ax) (obj1)).aX(), ((com.google.android.apps.youtube.app.offline.p) (obj)), new bv(youtubeactivity, ((com.google.android.apps.youtube.app.offline.p) (obj))), ((WatchWhileActivity)youtubeactivity).J());
        ap ap1 = new ap(youtubeactivity, ((r) (obj)), (byte)0);
        obj1 = new hj(youtubeactivity, ((ax) (obj1)).f(), ((ax) (obj1)).x(), ((ax) (obj1)).y(), ((ax) (obj1)).aV(), ((ax) (obj1)).k(), l1, ((ax) (obj1)).bk(), analytics, ((ax) (obj1)).aO(), ((ax) (obj1)).bf(), ap1, ((ax) (obj1)).ai(), ((ax) (obj1)).aI());
        az az1 = new az(youtubeactivity, p.cz, (byte)0);
        az az2 = new az(youtubeactivity, p.fa, (byte)0);
        az az3 = new az(youtubeactivity, p.eX, (byte)0);
        v1.a(new ae(ba, ap1, q1, l1, az1, az2, az3));
        v1.a(p.cy, new ah(((hj) (obj1)), ba));
        atomicreference = new dv(youtubeactivity, atomicreference);
        v1.a(atomicreference, new ai(((hj) (obj1)), ba, atomicreference));
        if (com.google.android.apps.youtube.core.utils.p.a(youtubeactivity))
        {
            v1.a(az1, new aj(ba, ap1));
            v1.a(az2, new ak(ba, ((r) (obj))));
        }
        v1.a(p.cD, new al(analytics, youtubeactivity, ba));
        v1.a(az3, new am(((hj) (obj1)), ba, v1));
        return v1;
    }

    static OfflineStoreInterface a(q q1, l l1)
    {
        if (!l1.b())
        {
            return q1.a();
        } else
        {
            return q1.a(l1.c());
        }
    }

    static void a(YouTubeActivity youtubeactivity, String s, f f1)
    {
        if (com.google.android.apps.youtube.core.utils.p.a(youtubeactivity))
        {
            f1.a(s, null);
        }
    }

    public static final void a(v v1, View view, Object obj)
    {
        int i = 0;
        com.google.android.apps.youtube.common.fromguava.c.a(view);
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        boolean flag;
        if (v1 != null && v1.a() > 0)
        {
            v1.a(view, obj);
            flag = v1.c();
        } else
        {
            flag = false;
        }
        view.setClickable(flag);
        view.setEnabled(flag);
        if (!flag)
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private static void a(v v1, YouTubeActivity youtubeactivity, boolean flag)
    {
        ax ax1 = ((YouTubeApplication)youtubeactivity.getApplication()).d();
        com.google.android.apps.youtube.app.remote.an an1 = ax1.W();
        com.google.android.apps.youtube.app.am am1 = youtubeactivity.N();
        youtubeactivity = new com.google.android.apps.youtube.app.remote.ax(youtubeactivity, ax1.f(), an1, ax1.aO(), am1, ax1.aT(), ax1.b().k());
        v1.a(p.dL, new an(an1, am1, flag, youtubeactivity));
    }

    public static v b(YouTubeActivity youtubeactivity)
    {
        v v1 = new v(youtubeactivity);
        a(v1, youtubeactivity, true);
        a(youtubeactivity, v1, au.a());
        return v1;
    }

    public static v b(YouTubeActivity youtubeactivity, AtomicReference atomicreference)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, atomicreference, v1, as.a());
        return v1;
    }

    public static v c(YouTubeActivity youtubeactivity)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, v1, aq.a());
        return v1;
    }

    public static v c(YouTubeActivity youtubeactivity, AtomicReference atomicreference)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, atomicreference, v1, ar.a());
        return v1;
    }

    public static v d(YouTubeActivity youtubeactivity)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, v1, av.a());
        return v1;
    }

    public static v d(YouTubeActivity youtubeactivity, AtomicReference atomicreference)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, atomicreference, v1, aw.a());
        return v1;
    }

    public static v e(YouTubeActivity youtubeactivity, AtomicReference atomicreference)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, atomicreference, v1, bc.a());
        return v1;
    }

    public static v f(YouTubeActivity youtubeactivity, AtomicReference atomicreference)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, atomicreference, v1, ay.a());
        return v1;
    }

    public static v g(YouTubeActivity youtubeactivity, AtomicReference atomicreference)
    {
        v v1 = new v(youtubeactivity);
        a(youtubeactivity, atomicreference, v1, ax.a());
        return v1;
    }
}
