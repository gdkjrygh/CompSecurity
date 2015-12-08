// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.google.android.apps.youtube.a.a.c;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.database.d;
import com.google.android.apps.youtube.common.network.h;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            a, m, l

final class b
    implements Runnable
{

    final l a;
    final a b;

    b(a a1, l l1)
    {
        b = a1;
        a = l1;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.datalib.offline.a.a(b).b();
        c c1 = a.a();
        com.google.android.apps.youtube.datalib.offline.a.b(b).a(c1.a(), c1);
        if (com.google.android.apps.youtube.datalib.offline.a.c(b).a())
        {
            L.e("Dispatching stored offline request immediately.");
            b.a();
            return;
        } else
        {
            L.e("Queuing stored offline request.");
            return;
        }
    }
}
