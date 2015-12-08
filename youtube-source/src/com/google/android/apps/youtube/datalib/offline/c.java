// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.datalib.a.l;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            a, d, m

final class c
    implements l
{

    final com.google.android.apps.youtube.a.a.c a;
    final a b;

    c(a a1, com.google.android.apps.youtube.a.a.c c1)
    {
        b = a1;
        a = c1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        com.google.android.apps.youtube.datalib.offline.a.e(b).execute(new d(this, volleyerror));
    }

    public final void a(Object obj)
    {
        com.google.android.apps.youtube.datalib.offline.a.a(b).b(a.k(), 1);
        com.google.android.apps.youtube.datalib.offline.a.a(b).c();
    }
}
