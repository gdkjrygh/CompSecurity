// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.Activity;
import com.google.android.apps.youtube.app.ui.bv;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            p, k, m, i, 
//            OfflineStreamQuality, j, h, g

public final class f
{

    private final Activity a;
    private final l b;
    private final q c;
    private final aa d;
    private final aw e;
    private final h f;
    private final com.google.android.apps.youtube.app.offline.p g;
    private final bv h;
    private final k i = new k(this, (byte)0);
    private final m j = new m(this, (byte)0);

    public f(Activity activity, l l1, q q1, aa aa1, aw aw1, h h1, com.google.android.apps.youtube.app.offline.p p1, 
            bv bv1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        c = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        e = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        f = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        g = (com.google.android.apps.youtube.app.offline.p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        h = (bv)com.google.android.apps.youtube.common.fromguava.c.a(bv1);
    }

    static aw a(f f1)
    {
        return f1.e;
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

    static void a(f f1, com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult offlineaddresult)
    {
        f1.a(offlineaddresult);
    }

    static void a(f f1, String s, OfflineStreamQuality offlinestreamquality, j j1)
    {
        f1.a(s, offlinestreamquality, j1);
    }

    static void a(f f1, String s, j j1)
    {
        f1.b(s, j1);
    }

    private void a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult offlineaddresult)
    {
        i.a[offlineaddresult.ordinal()];
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
            i1 = p.l;
        }
_L6:
        ah.a(a, i1, 1);
        return;
_L3:
        i1 = p.dO;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = p.k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(String s, OfflineStreamQuality offlinestreamquality, j j1)
    {
        s = a().b(s, offlinestreamquality.getFormatType());
        if (j1 != null)
        {
            j1.a(s);
        }
        a(((com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult) (s)));
    }

    static OfflineStoreInterface b(f f1)
    {
        return f1.a();
    }

    private void b(String s, j j1)
    {
        if (a().b(s) != null)
        {
            if (j1 != null)
            {
                j1.a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED);
            }
            a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED);
            return;
        }
        if (g.a(null))
        {
            h.a(null, new com.google.android.apps.youtube.app.offline.h(this, s, j1));
            return;
        } else
        {
            a(s, g.c(), j1);
            return;
        }
    }

    static Activity c(f f1)
    {
        return f1.a;
    }

    public final void a(Playlist playlist)
    {
        m.a(j, playlist);
    }

    public final void a(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        if (a().b(s) != null)
        {
            k.a(i, s);
        }
    }

    public final void a(String s, j j1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        if (!b.b())
        {
            d.a(a, new g(this, s, j1));
            return;
        } else
        {
            b(s, j1);
            return;
        }
    }
}
