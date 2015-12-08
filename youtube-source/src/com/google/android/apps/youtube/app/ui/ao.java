// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ac, at, ad, az, 
//            v

final class ao
    implements ac
{

    final at a;
    final q b;
    final l c;
    final az d;
    final az e;

    ao(at at1, q q, l l, az az1, az az2)
    {
        a = at1;
        b = q;
        c = l;
        d = az1;
        e = az2;
        super();
    }

    public final void a(v v, Object obj)
    {
        boolean flag1 = true;
        v = a.a(obj);
        boolean flag;
        if (ad.a(b, c).b(v) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v = d;
        if (flag)
        {
            flag1 = false;
        }
        az.a(v, flag1);
        az.a(e, flag);
    }
}
