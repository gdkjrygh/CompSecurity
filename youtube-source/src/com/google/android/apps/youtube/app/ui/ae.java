// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ac, ba, ap, ad, 
//            az, v

final class ae
    implements ac
{

    final ba a;
    final ap b;
    final q c;
    final l d;
    final az e;
    final az f;
    final az g;

    ae(ba ba1, ap ap1, q q, l l, az az1, az az2, az az3)
    {
        a = ba1;
        b = ap1;
        c = q;
        d = l;
        e = az1;
        f = az2;
        g = az3;
        super();
    }

    public final void a(v v, Object obj)
    {
        boolean flag1 = true;
        v = a.c(obj);
        ap.a(b, v, a.a(obj));
        boolean flag;
        if (ad.a(c, d).a(v) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v = e;
        if (flag)
        {
            flag1 = false;
        }
        az.a(v, flag1);
        az.a(f, flag);
        az.a(g, a.d(obj));
    }
}
