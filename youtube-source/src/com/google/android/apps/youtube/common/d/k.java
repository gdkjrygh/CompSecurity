// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.database.d;
import com.google.android.apps.youtube.common.database.e;

// Referenced classes of package com.google.android.apps.youtube.common.d:
//            j

final class k
    implements Runnable
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void run()
    {
        e e1;
        g g1;
        for (e1 = j.a(a).d(); e1.hasNext(); j.a(a, g1))
        {
            g1 = (g)e1.next();
        }

        e1.a();
    }
}
