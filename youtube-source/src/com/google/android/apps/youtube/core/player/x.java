// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.datalib.innertube.model.w;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ab, w, y

public final class x
    implements ab
{

    final com.google.android.apps.youtube.core.player.w a;
    private final w b;
    private final y c;

    x(com.google.android.apps.youtube.core.player.w w1, w w2, y y1)
    {
        a = w1;
        super();
        b = w2;
        c = y1;
    }

    public final void a()
    {
        if (b.e())
        {
            a.a(b, c);
            return;
        }
        if (b.g())
        {
            a.a = true;
        }
        if (b.f())
        {
            a.b = true;
        }
        a.a(b);
        c.b();
    }

    public final void b()
    {
        c.a(w.b(b));
    }
}
