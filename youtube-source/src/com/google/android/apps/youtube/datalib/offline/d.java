// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.a.a.c;
import com.google.android.apps.youtube.common.e.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            c, a, m

final class d
    implements Runnable
{

    final VolleyError a;
    final com.google.android.apps.youtube.datalib.offline.c b;

    d(com.google.android.apps.youtube.datalib.offline.c c1, VolleyError volleyerror)
    {
        b = c1;
        a = volleyerror;
        super();
    }

    public final void run()
    {
        if (com.google.android.apps.youtube.datalib.offline.a.a(b.b, b.a, a))
        {
            int i = b.a.m();
            b.a.c(i + 1);
            b.a.c(com.google.android.apps.youtube.datalib.offline.a.d(b.b).a());
            com.google.android.apps.youtube.datalib.offline.a.a(b.b, b.a);
            return;
        } else
        {
            com.google.android.apps.youtube.datalib.offline.a.a(b.b).a(b.a.k(), 1);
            return;
        }
    }
}
