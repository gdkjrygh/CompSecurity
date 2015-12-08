// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.ah;
import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            r, v

final class s
    implements ah
{

    final String a;
    final Offlineability b;
    final v c;
    final r d;

    s(r r1, String s1, Offlineability offlineability, v v1)
    {
        d = r1;
        a = s1;
        b = offlineability;
        c = v1;
        super();
    }

    public final void a()
    {
        r.a(d, a, b, c);
    }

    public final void a(Exception exception)
    {
        r.a(d).c(exception);
    }

    public final void b()
    {
        if (c != null)
        {
            c.a(a, com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.CANNOT_ADD);
        }
        r.a(d, com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.CANNOT_ADD);
    }
}
