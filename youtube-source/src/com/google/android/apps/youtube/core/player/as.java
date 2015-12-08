// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.core.identity.ah;
import com.google.android.apps.youtube.datalib.innertube.model.w;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ar, y, w

final class as
    implements ah
{

    final ar a;
    private final w b;
    private final y c;

    as(ar ar1, w w1, y y1)
    {
        a = ar1;
        super();
        b = w1;
        c = y1;
    }

    public final void a()
    {
        ar.a(a);
        c.b();
    }

    public final void a(Exception exception)
    {
        ar.a(a);
        c.a(w.b(b));
    }

    public final void b()
    {
        ar.a(a);
        c.a(w.b(b));
    }
}
