// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.sync;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.d.i;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;

// Referenced classes of package com.google.android.apps.youtube.app.offline.sync:
//            b, d

public final class e
    implements i
{

    private final b a;
    private final h b;

    public e(b b1, h h1)
    {
        a = (b)c.a(b1);
        b = (h)c.a(h1);
    }

    public final com.google.android.apps.youtube.common.d.h a(g g)
    {
        return new d(g, a, b);
    }

    public final String a()
    {
        return d.b();
    }
}
