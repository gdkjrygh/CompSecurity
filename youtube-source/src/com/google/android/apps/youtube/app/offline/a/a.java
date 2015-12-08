// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import android.text.TextUtils;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.offline.transfer.OfflineTransferService;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.b;
import com.google.android.apps.youtube.core.transfer.k;
import com.google.android.apps.youtube.core.utils.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            b, f

public final class a extends b
{

    private final ax a;
    private final com.google.android.apps.youtube.common.c.a b;
    private final l c;
    private final ce d;
    private final w e;
    private final p f;
    private final HashMap g = new HashMap();
    private volatile f h;

    public a(ax ax1, com.google.android.apps.youtube.common.c.a a1, l l1, ce ce1, p p1)
    {
        a = (ax)com.google.android.apps.youtube.common.fromguava.c.a(ax1);
        b = (com.google.android.apps.youtube.common.c.a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1);
        f = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        e = OfflineTransferService.a(ax1.af(), new com.google.android.apps.youtube.app.offline.a.b(this, (byte)0));
        a1.a(this);
    }

    static f a(a a1)
    {
        return a1.h;
    }

    public final OfflineStoreInterface a(String s)
    {
        Object obj1;
        if (TextUtils.isEmpty(s))
        {
            obj1 = a();
        } else
        {
            Object obj = (WeakReference)g.get(s);
            if (obj != null)
            {
                obj = (f)((WeakReference) (obj)).get();
            } else
            {
                obj = null;
            }
            obj1 = obj;
            if (obj == null)
            {
                obj = new f(a, b, a.bd(), d, e, f, s, a.aQ().a(c));
                g.put(s, new WeakReference(obj));
                return ((OfflineStoreInterface) (obj));
            }
        }
        return ((OfflineStoreInterface) (obj1));
    }

    public final void handleSignInEvent(ai ai)
    {
        ai = c.c();
        h = (f)a(ai);
        h.a();
        k k1 = (k)e.a();
        if (k1 != null)
        {
            k1.b(ai);
        }
    }

    public final void handleSignOutEvent(aj aj)
    {
        ((k)e.a()).b();
        if (h != null)
        {
            h.b();
            h = null;
        }
        a.bp();
        a.bd().a(null, null);
    }
}
