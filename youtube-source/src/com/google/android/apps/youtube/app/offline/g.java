// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.ah;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            f, j

final class g
    implements ah
{

    final String a;
    final j b;
    final f c;

    g(f f1, String s, j j1)
    {
        c = f1;
        a = s;
        b = j1;
        super();
    }

    public final void a()
    {
        f.a(c, a, b);
    }

    public final void a(Exception exception)
    {
        f.a(c).c(exception);
    }

    public final void b()
    {
        if (b != null)
        {
            j j1 = b;
            String s = a;
            j1.a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.CANNOT_ADD);
        }
        f.a(c, com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.CANNOT_ADD);
    }
}
