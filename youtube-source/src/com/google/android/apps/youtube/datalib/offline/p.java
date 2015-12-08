// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.d.i;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            j, o

public final class p
    implements i
{

    private final j a;
    private final h b;

    public p(j j1, h h1)
    {
        a = (j)c.a(j1);
        b = (h)c.a(h1);
    }

    public final com.google.android.apps.youtube.common.d.h a(g g)
    {
        return new o(g, a, b);
    }

    public final String a()
    {
        return o.b();
    }
}
