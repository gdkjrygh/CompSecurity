// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.Activity;
import com.google.android.apps.youtube.app.ui.bv;
import com.google.android.apps.youtube.app.ui.hh;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            p, y, w, u, 
//            OfflineStreamQuality, v, t, s

public final class r
{

    private final Activity a;
    private final l b;
    private final q c;
    private final aa d;
    private final aw e;
    private final h f;
    private final com.google.android.apps.youtube.app.offline.p g;
    private final bv h;
    private final hh i;
    private final y j = new y(this, (byte)0);
    private final w k = new w(this, (byte)0);

    public r(Activity activity, l l1, q q1, aa aa1, aw aw1, h h1, com.google.android.apps.youtube.app.offline.p p1, 
            bv bv1, hh hh1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        c = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        d = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        e = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        f = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        g = (com.google.android.apps.youtube.app.offline.p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        h = (bv)com.google.android.apps.youtube.common.fromguava.c.a(bv1);
        i = (hh)com.google.android.apps.youtube.common.fromguava.c.a(hh1);
    }

    static aw a(r r1)
    {
        return r1.e;
    }

    private OfflineStoreInterface a()
    {
        if (!b.b())
        {
            return c.a();
        } else
        {
            return c.a(b.c());
        }
    }

    static void a(r r1, com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult offlineaddresult)
    {
        r1.a(offlineaddresult);
    }

    static void a(r r1, String s1, OfflineStreamQuality offlinestreamquality, v v1)
    {
        r1.a(s1, offlinestreamquality, v1);
    }

    static void a(r r1, String s1, Offlineability offlineability, v v1)
    {
        r1.b(s1, offlineability, v1);
    }

    static void a(r r1, String s1, String s2, v v1)
    {
        r1.c(s1, s2, v1);
    }

    private void a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult offlineaddresult)
    {
        u.a[offlineaddresult.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 80
    //                   3 87;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        int i1;
        if (g.d() && !f.c())
        {
            i1 = p.r;
        } else
        {
            i1 = p.q;
        }
_L6:
        ah.a(a, i1, 1);
        return;
_L3:
        i1 = p.gG;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = p.t;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(String s1, OfflineStreamQuality offlinestreamquality, v v1)
    {
        offlinestreamquality = a().a(s1, offlinestreamquality.getFormatType());
        if (v1 != null)
        {
            v1.a(s1, offlinestreamquality);
        }
        a(((com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult) (offlinestreamquality)));
    }

    static Activity b(r r1)
    {
        return r1.a;
    }

    private void b(String s1, Offlineability offlineability, v v1)
    {
        x x1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        x1 = a().a(s1);
        flag = flag1;
        if (x1 == null) goto _L2; else goto _L1
_L1:
        if (!x1.t()) goto _L4; else goto _L3
_L3:
        flag = x1.u();
_L2:
        if (!flag)
        {
            if (v1 != null)
            {
                v1.a(s1, com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED);
            }
            a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = flag1;
        if (x1.d())
        {
            flag = false;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (offlineability != null && !offlineability.a())
        {
            i.a(offlineability.c());
            return;
        }
        if (g.a(offlineability))
        {
            h.a(offlineability, new t(this, s1, v1));
            return;
        } else
        {
            a(s1, g.c(), v1);
            return;
        }
    }

    static OfflineStoreInterface c(r r1)
    {
        return r1.a();
    }

    private void c(String s1, String s2, v v1)
    {
        s1 = a().a(s1, s2);
        if (v1 != null)
        {
            v1.a(s2, s1);
        }
        a(s1);
    }

    public final void a(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        if (a().a(s1) != null)
        {
            w.a(k, s1);
        }
    }

    public final void a(String s1, Offlineability offlineability, v v1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        if (!b.b())
        {
            d.a(a, new s(this, s1, offlineability, v1));
            return;
        } else
        {
            b(s1, offlineability, v1);
            return;
        }
    }

    public final void a(String s1, String s2, v v1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        x x1 = a().a(s2);
        if (x1 == null || x1.t() && x1.u())
        {
            y.a(j, s1, s2, v1);
        }
    }

    public final void b(String s1, String s2, v v1)
    {
        c(s1, s2, null);
    }
}
